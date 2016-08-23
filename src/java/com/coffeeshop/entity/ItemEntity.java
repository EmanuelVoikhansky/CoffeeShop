package java.com.coffeeshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "item", schema = "coffeeshop")
//query to get all items that haven't been sold and that haven't been discontinued
@NamedQuery(
        name = "ItemEntity.getAllAvailable",
        query = "SELECT c FROM ItemEntity c WHERE c.isPurchased = 0 AND c.description.isDeleted = 0"
)
public class ItemEntity {
    @Id
    @Column(name = "item_id")
    private int itemId;

    @Basic
    @Column(name = "is_purchased")
    private int isPurchased;

    @ManyToOne
    @JoinColumn(name = "description_id")
    private ItemDescriptionEntity description;

    //getters and setters
    public int getItemId() {
        return itemId;
    }
    public int getIsPurchased() {
        return isPurchased;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public void setIsPurchased(int isPurchased) {
        this.isPurchased = isPurchased;
    }
    public ItemDescriptionEntity getDescription() {
        return description;
    }
    public void setDescription(ItemDescriptionEntity description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemEntity that = (ItemEntity) o;

        if (itemId != that.itemId) return false;
        if (isPurchased != that.isPurchased) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemId;
        result = 31 * result + isPurchased;
        return result;
    }
}

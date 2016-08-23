package java.com.coffeeshop.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Emanuel on 8/19/2016.
 */
@Entity
@Table(name = "item_description", schema = "coffeeshop")
public class ItemDescriptionEntity {
    @Id
    @Column(name = "description_id")
    private int descriptionId;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "price")
    private double price;

    @Basic
    @Column(name = "category")
    private String category;

    @Basic
    @Column(name = "picture")
    private byte[] picture;

    @Basic
    @Column(name = "is_deleted")
    private int isDeleted;

    @OneToMany(mappedBy = "description")
    private List<ItemEntity> items;

    public int getDescriptionId() {
        return descriptionId;
    }
    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public byte[] getPicture() {
        return picture;
    }
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    public int getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public List<ItemEntity> getItems() {
        return items;
    }
    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemDescriptionEntity that = (ItemDescriptionEntity) o;

        if (descriptionId != that.descriptionId) return false;
        if (price != that.price) return false;
        if (isDeleted != that.isDeleted) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (!Arrays.equals(picture, that.picture)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = descriptionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + isDeleted;
        return result;
    }
}

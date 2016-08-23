package java.com.coffeeshop.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Emanuel on 8/19/2016.
 */
@Entity
@Table(name = "shopping_cart", schema = "coffeeshop", catalog = "")
public class ShoppingCartEntity {
    private int cartId;
    private Timestamp datePurchased;

    @Id
    @Column(name = "cart_id")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "date_purchased")
    public Timestamp getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Timestamp datePurchased) {
        this.datePurchased = datePurchased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCartEntity that = (ShoppingCartEntity) o;

        if (cartId != that.cartId) return false;
        if (datePurchased != null ? !datePurchased.equals(that.datePurchased) : that.datePurchased != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + (datePurchased != null ? datePurchased.hashCode() : 0);
        return result;
    }
}

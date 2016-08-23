package java.com.coffeeshop.dto;

import java.com.coffeeshop.entity.ItemDescriptionEntity;

/**
 * Created by Emanuel on 8/19/2016.
 */
public class ItemDescriptionDTO {
    public ItemDescriptionDTO(ItemDescriptionEntity input) {
        this.name = input.getName();
        this.category = input.getCategory();
        this.quantity = input.getItems().size();
    }

    private String name;
    private String category;
    private int quantity;
    private byte[] image;
}

package java.com.coffeeshop.dto;

import javax.xml.bind.annotation.XmlElement;
import java.com.coffeeshop.entity.ItemEntity;

public class InventoryRecordDTO {
    public InventoryRecordDTO(ItemEntity input) {
        itemId = input.getItemId();
        name = input.getDescription().getName();
        category = input.getDescription().getCategory();
        price = input.getDescription().getPrice();
    }

    @XmlElement
    private int itemId;
    @XmlElement
    private String name;
    @XmlElement
    private String category;
    @XmlElement
    private double price;

    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

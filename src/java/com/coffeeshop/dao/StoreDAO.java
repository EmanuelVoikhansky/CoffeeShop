package java.com.coffeeshop.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.com.coffeeshop.entity.ItemEntity;
import java.util.List;

public class StoreDAO {
    @PersistenceContext(name = "CoffeePU")
    private EntityManager entityManager;

    /**
     * Use entity manager to execute select query against all available items
     * @return List of Item Entities
     */
    public List<ItemEntity> getStoreInventory() {
        return entityManager.createNamedQuery("ItemEntity.getAllAvailable", ItemEntity.class).getResultList();
    }
}

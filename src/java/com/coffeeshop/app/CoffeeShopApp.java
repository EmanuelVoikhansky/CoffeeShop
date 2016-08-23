package java.com.coffeeshop.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.com.coffeeshop.resource.InventoryResource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Emanuel on 8/19/2016.
 */
@ApplicationPath("/coffee_shop")
public class CoffeeShopApp extends Application {

    //Register resources here:
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(InventoryResource.class);
        return resources;
    }
}

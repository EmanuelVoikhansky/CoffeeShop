package java.com.coffeeshop.resource;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.com.coffeeshop.dao.StoreDAO;
import java.com.coffeeshop.dto.InventoryRecordDTO;
import java.com.coffeeshop.entity.ItemEntity;
import java.util.ArrayList;
import java.util.List;

@Path(value = "inventory")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InventoryResource {
    @Inject
    StoreDAO dao;

    /**
     * Get a list of all store inventory in flat dtos
     * @return List of Inventory Record DTOs
     */
    @GET
    public Response getShopInventory() {
        List<ItemEntity> items = dao.getStoreInventory();
        return Response.status(Response.Status.FOUND).entity(flattenItemEntities(items)).build();
    }

    /**
     * Used to map item entities to inventory record DTOs
     * @param input List of Item Entities
     * @return List of Inventory Record DTOs
     */
    private List<InventoryRecordDTO> flattenItemEntities(List<ItemEntity> input) {
        List<InventoryRecordDTO> output = new ArrayList<>(input.size());
        for(ItemEntity item : input) {
            output.add(new InventoryRecordDTO(item));
        }
        return output;
    }
}

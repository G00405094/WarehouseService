package ie.atu.warehouseservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    @PostMapping("/Confirm-capacity")
    public String Product(@RequestBody WarehouseData warehouseData)
    {
        String confirm = String.format("Recieved details, WarehouseID: %s location: %s capacity: %s", warehouseData.getWarehouseId(), warehouseData.getLocation(), warehouseData.getCapacity());
        return confirm;
    }
}

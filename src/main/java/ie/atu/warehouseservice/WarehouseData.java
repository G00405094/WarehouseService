package ie.atu.warehouseservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseData {
    private String warehouseId;
    private String location;
    private String capacity;
}

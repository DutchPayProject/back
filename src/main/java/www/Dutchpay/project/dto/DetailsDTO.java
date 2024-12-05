package www.Dutchpay.project.dto;

import lombok.Data;

@Data
public class DetailsDTO {

    private int device_id;
    private int group_id;
    private int list_id;

    private String title;
    private int money;
}

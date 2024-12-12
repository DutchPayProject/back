package www.Dutchpay.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class DetailsDTO {

    private int device_id;
    private int group_id;
    private int list_id;

    private String title;
    private int money;
}

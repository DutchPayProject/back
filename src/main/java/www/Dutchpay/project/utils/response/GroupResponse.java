package www.Dutchpay.project.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import www.Dutchpay.project.dto.GroupDTO;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupResponse{

    List<GroupDTO> data;
    boolean success;
    String message;

}

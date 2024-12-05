package www.Dutchpay.project.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import www.Dutchpay.project.dto.GroupDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupResponse{

    List<GroupDto> data;
    boolean success;
    String message;

}

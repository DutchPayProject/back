package www.Dutchpay.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import www.Dutchpay.project.dto.DetailsDTO;

import java.util.List;

@Mapper
public interface DetailsMapper {

   List<DetailsDTO> getDetails(int group_id);

}

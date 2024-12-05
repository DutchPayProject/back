package www.Dutchpay.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import www.Dutchpay.project.dto.DetailsDTO;

import java.util.List;

@Mapper
public interface DetailsMapper {

   List<DetailsDTO> getDetails(int group_id);

   void insertDetails(int device_id, int group_id, String title , int money);

   void deleteDetails(int device_id, int group_id, String title);

   void updateDetails(int list_id,String title, int money);
}

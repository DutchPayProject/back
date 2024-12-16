package www.Dutchpay.project.mapper;

import www.Dutchpay.project.dto.DetailsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
@Repository
public interface DetailsMapper {

   List<DetailsDTO> getDetails(int group_id);

   void insertDetails(int device_id, int group_id, String title , int money);

   int deleteDetails(int device_id, int group_id, String title);

   int updateDetails(int list_id,String title, int money);
}

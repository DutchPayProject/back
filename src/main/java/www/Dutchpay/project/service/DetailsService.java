package www.Dutchpay.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.Dutchpay.project.dto.DetailsDTO;
import www.Dutchpay.project.mapper.DetailsMapper;

import java.util.List;

@Service
public class DetailsService {
    @Autowired
    DetailsMapper detailsMapper;

    /* group_id를 통해 세부내역을 불러옴 */
    public List<DetailsDTO> getList(int group_id) {
        System.out.println(group_id);
        return detailsMapper.getDetails(group_id);
    }

    /* Insert 로직 수정 필요 return "성공 x" */
    public String insertList(DetailsDTO detailsDTO){
        detailsMapper.insertDetails(detailsDTO.getDevice_id(),detailsDTO.getGroup_id(),detailsDTO.getTitle(),detailsDTO.getMoney());
        return "성공";
    }

    /* Delete 로직 반환되는 cnt이 0이면 없어진게없으니 false 있으면 true */
    public boolean deleteList(DetailsDTO detailsDTO){

        int rowcnt =detailsMapper.deleteDetails(detailsDTO.getDevice_id(),detailsDTO.getGroup_id(),detailsDTO.getTitle());
         if(rowcnt == 0){
             return false;
         }
            return true;
    }
/* Update 로직 반환되는 row수가 있으면 0보다큼 아니면 false */
    public boolean updateList(DetailsDTO detailsDTO){
          int rowcnt =  detailsMapper.updateDetails(detailsDTO.getList_id(),detailsDTO.getTitle(),detailsDTO.getMoney());
          if(rowcnt ==0){
              return false;
          }
           return true;

    }
}

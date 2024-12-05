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
}

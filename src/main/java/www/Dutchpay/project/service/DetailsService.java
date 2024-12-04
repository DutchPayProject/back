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

    public List<DetailsDTO> getList(int group_id) {
        System.out.println(group_id);
        return detailsMapper.getDetails(group_id);
    }
}

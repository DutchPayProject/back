package www.Dutchpay.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.Dutchpay.project.dto.GroupDto;
import www.Dutchpay.project.mapper.GroupMapper;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupMapper groupMapper;

    public List<GroupDto> getGroup (){
        return groupMapper.getGroups();
    }




}

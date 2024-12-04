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

    public String insertGroup(GroupDto groupDto){
        groupMapper.insertGroup(groupDto);
        return  "그룹이 등록되었습니다!";
    }

    public String updateGroup(GroupDto groupDto){
        groupMapper.updateGroup(groupDto);
        return "그룹 정보가 수정되었습니다!";
    }

}

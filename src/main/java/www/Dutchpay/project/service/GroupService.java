package www.Dutchpay.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.Dutchpay.project.dto.GroupDTO;
import www.Dutchpay.project.mapper.GroupMapper;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupMapper groupMapper;

    //get으로 그룹 가져오는 서비스 로직
    public List<GroupDTO> getGroup (){
        return groupMapper.getGroups();
    }

    //insert로 그룹 추가하는 서비스 로직
    public boolean insertGroup(GroupDTO groupDto){
        try {
            groupMapper.insertGroup(groupDto);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    //update로 그룹 정보 수정하는 서비스 로직
    public boolean updateGroup(GroupDTO groupDto){
        int cnt = groupMapper.updateGroup(groupDto.getGroup_id(),groupDto.getDevice_id(),groupDto.getGroup_name());
        if(cnt == 0){
            return false;
        }
            return true;
    }

    //delete로 그룹 정보 삭제하는 서비스 로직
    public boolean deleteGroup(GroupDTO groupDto){
        int cnt = groupMapper.deleteGroup(groupDto.getGroup_id(),groupDto.getGroup_name(),groupDto.getDevice_id());
        if(cnt == 0){
            return false;
        }
        return true;

    }

}

package www.Dutchpay.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.Dutchpay.project.dto.GroupDto;

import java.util.List;

@Mapper
@Repository
public interface GroupMapper {

    List<GroupDto> getGroups();
    void insertGroup(GroupDto group);
    int deleteGroup(int group_id, String group_name,int device_id);
    int updateGroup(int group_id, int device_id, String group_name);
}

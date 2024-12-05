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
    void deleteGroup(GroupDto group);
    int updateGroup(int group_id, int device_id, String group_name);
}
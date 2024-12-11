package www.Dutchpay.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.Dutchpay.project.dto.GroupDTO;

import java.util.List;

@Mapper
@Repository
public interface GroupMapper {

    List<GroupDTO> getGroups();
    void insertGroup(GroupDTO group);
    void updateGroup(GroupDTO group);
    void deleteGroup(GroupDTO group);
}

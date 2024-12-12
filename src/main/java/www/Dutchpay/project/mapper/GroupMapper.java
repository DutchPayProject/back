package www.Dutchpay.project.mapper;


import www.Dutchpay.project.dto.GroupDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
@Repository
public interface GroupMapper {

    List<GroupDTO> getGroups();
    void insertGroup(GroupDTO group);
    void updateGroup(GroupDTO group);
    void deleteGroup(GroupDTO group);
}

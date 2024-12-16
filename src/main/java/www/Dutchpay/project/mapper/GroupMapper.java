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
    int deleteGroup(int group_id, String group_name,int device_id);
    int updateGroup(int group_id, int device_id, String group_name);


}

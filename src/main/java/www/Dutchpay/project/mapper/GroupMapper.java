package www.Dutchpay.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import www.Dutchpay.project.dto.GroupDto;

import javax.swing.*;
import java.util.List;

@Mapper
@Repository
public interface GroupMapper {

    List<GroupDto> getGroups();
    void insertGroup(GroupDto group);
    void updateGroup(GroupDto group);
    void deleteGroup(GroupDto group);
}

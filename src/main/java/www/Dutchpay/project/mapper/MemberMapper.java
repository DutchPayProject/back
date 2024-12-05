package www.Dutchpay.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import www.Dutchpay.project.dto.MemberDTO;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDTO> GroupMember(int group_id);
}

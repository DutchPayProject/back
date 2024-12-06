package www.Dutchpay.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.Dutchpay.project.dto.MemberDTO;
import www.Dutchpay.project.mapper.MemberMapper;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;
    /*Group에 관한 맴버를 가져옴 group_id 통해서 가져옴*/
    public List<MemberDTO> GroupMember (MemberDTO memberDTO) {

        return memberMapper.GroupMember(memberDTO.getGroup_id());
    }

    public List<MemberDTO> ListMember (MemberDTO memberDTO) {

        return memberMapper.ListMember(memberDTO.getList_id());
    }
}

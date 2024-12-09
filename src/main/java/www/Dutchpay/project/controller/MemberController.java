package www.Dutchpay.project.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.Dutchpay.project.dto.MemberDTO;
import www.Dutchpay.project.service.MemberService;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;
  /*해당 그룹에 관한 맴버만 가져오기 */
    @PostMapping("/groupget")
    public ResponseEntity<List<MemberDTO>>GroupMember(@RequestBody MemberDTO memberDTO) {
      return ResponseEntity.ok(memberService.GroupMember(memberDTO));
    }

    /*해당 장소에 관한 맴버만 가져오기 */
    @PostMapping("/listget")
    public ResponseEntity<List<MemberDTO>>ListMember(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.ok(memberService.ListMember(memberDTO));
    }

    @PostMapping("/insert")
    public ResponseEntity<String> InsertMember(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.ok(memberService.InsertMember(memberDTO));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> DeleteMember(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.ok(memberService.DeleteMember(memberDTO.getMember_id()));
    }
}

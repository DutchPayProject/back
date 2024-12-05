package www.Dutchpay.project.controller;

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
        System.out.println(memberDTO);
      return ResponseEntity.ok(memberService.GroupMember(memberDTO));
    }
}

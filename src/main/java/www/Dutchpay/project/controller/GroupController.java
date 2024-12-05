package www.Dutchpay.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.Dutchpay.project.dto.GroupDto;
import www.Dutchpay.project.service.GroupService;
import www.Dutchpay.project.utils.response.GroupResponse;

import java.util.List;

@RestController
@RequestMapping("/Group")
public class GroupController {

    @Autowired
    GroupService groupService;

    GroupResponse gres = new GroupResponse();

    //get으로 DB에 그룹들 가져올 때
    @GetMapping("/getGroup")
    public ResponseEntity<GroupResponse> Collect() {
        gres.setMessage("");
        List<GroupDto> temp = groupService.getGroup();
        if(temp.isEmpty()){
         gres.setSuccess(Boolean.FALSE);
         gres.setMessage("그룹 정보를 불러오는데에 실패했습니다.");
        }else {
            gres.setSuccess(Boolean.TRUE);
            gres.setData(temp);
        }
        return ResponseEntity.ok(gres);
    }

    //insert로 그룹 추가 할 때
    @PostMapping("/insertGroup")
    public ResponseEntity<GroupResponse> Insert(@RequestBody GroupDto groupDto){
        boolean success = groupService.insertGroup(groupDto);
        if(success){
            gres.setSuccess(true);
            gres.setMessage("정보를 저장 됐습니다.");
        }else {
            gres.setSuccess(false);
            gres.setMessage("정보 저장에 실패했습니다.");
        }
        return ResponseEntity.ok(gres);
    }

    //update로 그룹 수정 할 때
    @PatchMapping("/updateGroup")
    public ResponseEntity<GroupResponse> Update(@RequestBody GroupDto groupDto){
        boolean success = groupService.updateGroup(groupDto);
            gres.setData(null);
        if(success){
            gres.setSuccess(true);
            gres.setMessage("그룹 정보를 수정하였습니다.");
        }else{
            gres.setSuccess(false);
            gres.setMessage("그룹 정보 수정에 실패했습니다. ");
        }
        return ResponseEntity.ok(gres);
    }

    //delete로 그룹 제거 할 때
    @DeleteMapping("/deleteGroup")
    public String Delete(@RequestBody GroupDto groupDto){
        return groupService.deleteGroup(groupDto);
    }

}

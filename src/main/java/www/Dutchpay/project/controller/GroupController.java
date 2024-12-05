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
    public String Insert(@RequestBody GroupDto groupDto){
        return groupService.insertGroup(groupDto);
    }

    //update로 그룹 수정 할 때
    @PutMapping("/updateGroup")
    public String Update(@RequestBody GroupDto groupDto){
        return groupService.updateGroup(groupDto);
    }

    //delete로 그룹 제거 할 때
    @DeleteMapping("/deleteGroup")
    public String Delete(@RequestBody GroupDto groupDto){
        return groupService.deleteGroup(groupDto);
    }

}

package www.Dutchpay.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import www.Dutchpay.project.dto.GroupDto;
import www.Dutchpay.project.service.GroupService;

import java.util.List;

@RestController
@RequestMapping("/Group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("/getGroup")
    public List<GroupDto> Collect() {
        return groupService.getGroup();
    }

    @PostMapping("/insertGroup")
    public String Insert(@RequestBody GroupDto groupDto){
        return groupService.insertGroup(groupDto);

    }


}

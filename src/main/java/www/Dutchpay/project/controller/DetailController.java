package www.Dutchpay.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.Dutchpay.project.dto.DetailsDTO;
import www.Dutchpay.project.service.DetailsService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Details")
public class DetailController {

    @Autowired
    DetailsService detailsService;
    @PostMapping("/get")
    public List<DetailsDTO> getList(@RequestBody DetailsDTO detailsDTO){
        System.out.println(detailsDTO.getGroup_id()+"컨트롤러");
        return detailsService.getList(detailsDTO.getGroup_id());
    }
}

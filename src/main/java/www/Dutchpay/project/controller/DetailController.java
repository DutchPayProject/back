package www.Dutchpay.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.Dutchpay.project.dto.DetailsDTO;
import www.Dutchpay.project.service.DetailsService;

import java.util.List;

@RestController
@RequestMapping("/Details")
public class DetailController {

    @Autowired
    DetailsService detailsService;
    @PostMapping("/get")
    public ResponseEntity<List<DetailsDTO>> getList(@RequestBody DetailsDTO detailsDTO){
        return ResponseEntity.ok(detailsService.getList(detailsDTO.getGroup_id()));
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertList(@RequestBody DetailsDTO detailsDTO){
        return ResponseEntity.ok(detailsService.insertList(detailsDTO));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteList(@RequestBody DetailsDTO detailsDTO){
        System.out.println(detailsDTO);
        return ResponseEntity.ok(detailsService.deleteList(detailsDTO));
    }

    @PatchMapping("/update")
    public ResponseEntity<Boolean> updateList(@RequestBody DetailsDTO detailsDTO){
        return ResponseEntity.ok(detailsService.updateList(detailsDTO));
    }
}
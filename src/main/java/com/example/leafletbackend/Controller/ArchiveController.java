package com.example.leafletbackend.Controller;

import com.example.leafletbackend.Model.Archive;
import com.example.leafletbackend.Repository.ArchiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("device")
public class ArchiveController {

    @Autowired
    private ArchiveRepo archiveRepo;



    @GetMapping("/paths/{id}")
    public ResponseEntity<List<Archive>>getpathById(@PathVariable(value = "id") int id){
        List<Archive> list = archiveRepo.getpaths(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    
}

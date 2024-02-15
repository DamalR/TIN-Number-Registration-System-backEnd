package org.example.controller;

import org.example.dto.Persion;
import org.example.entity.PersionEntity;
import org.example.service.PersionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persion")
@CrossOrigin(origins = "http://localhost:4200/")
public class PersionController {
    @Autowired
    PersionServiceImpl service;

    @PostMapping("/add")
    public void addPersion(@RequestBody Persion persion){
        service.add(persion);
    }
    @GetMapping("/get")
    public Iterable<PersionEntity> getPersion(){
        return service.getPersion();
    }
    @GetMapping("/{id}")
    public String deletePersion(@PathVariable Long id){
        service.deletePersion(id);
        return "Deleted";
    }
    @GetMapping("serach/{id}")
    public Persion getPersionById(@PathVariable Long id){
        return getPersionById(id);
    }


}

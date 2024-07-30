package com.piyush.Controller;

import com.piyush.Entity.ToDos;
import com.piyush.Service.ToDosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDosController {

    @Autowired
    private ToDosServiceImpl serviceimpl;

    @PostMapping("/create")
    public ResponseEntity<String> createTodosData(@RequestBody ToDos todo) {
        serviceimpl.createTOdo(todo);
        ResponseEntity<String> dataSaved = new ResponseEntity<>("Data Saved", HttpStatus.CREATED);
        return dataSaved;
    }
    @DeleteMapping("/deleteall")
    public String deleteAllDataa() {
        serviceimpl.deleteAllData();
        return "Delete All The Data";
    }
    @GetMapping("user/{id}")
    public ToDos getDataById(@PathVariable Integer id) {
        return serviceimpl.getDataToId(id);
    }
    @DeleteMapping("delete/{id}")
    public String deleteDataById(@PathVariable Integer id) {
          serviceimpl.deleteDataById(id);
        return "Deleted no " + id;
    }
    @GetMapping("/alldata")
    public List<ToDos> getAllImpl(){
        return serviceimpl.getAllData();
    }
    @PutMapping("/update")
    public ToDos upateDataById(@RequestBody ToDos todo) {
//        ToDos dataToId = serviceimpl.getDataToId(id);
        return serviceimpl.createTOdo(todo );
    }

}
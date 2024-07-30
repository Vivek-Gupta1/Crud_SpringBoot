package com.piyush.Service;

import com.piyush.Entity.ToDos;
import com.piyush.Repo.ToDosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToDosServiceImpl {

    @Autowired
    private ToDosRepo repo;

    //      for find data through id
    public ToDos getDataToId(Integer id) {
        Optional<ToDos> byId = repo.findById(id);
        if (byId.isPresent())
            return repo.findById(id).get();
        return null;
    }



    //    for Creating the Todos
    public ToDos createTOdo(ToDos data) {
        repo.save(data);
        return data;
    }
    //    to Get All The Data
    public List<ToDos> getAllData() {
        List<ToDos> list = new ArrayList<>();
//        repo.findAll().forEach(list1->list.add(list1));
        List<ToDos> all = repo.findAll();
        for(ToDos td:all){
            list.add(td);
        }
        return list;
    }
    // Delete dataBy id
    public void deleteDataById(Integer id) {
        repo.deleteById(id);

    }
    //    for Delete  All The Data
    public void deleteAllData() {
        repo.deleteAll();
    }
}

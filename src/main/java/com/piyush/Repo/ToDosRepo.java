package com.piyush.Repo;

import com.piyush.Entity.ToDos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDosRepo extends JpaRepository<ToDos ,Integer> {
}

package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Mov;

@Repository
public interface MovsRepo extends JpaRepository<Mov, Long> {

}

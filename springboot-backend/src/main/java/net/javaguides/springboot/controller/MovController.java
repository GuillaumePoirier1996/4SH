package net.javaguides.springboot.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.EntranceMov;
import net.javaguides.springboot.model.ExitMov;
import net.javaguides.springboot.model.Mov;
import net.javaguides.springboot.repository.MovsRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class MovController {
    @Autowired
    private MovsRepo movsRepo;

    @PostMapping("add")
    public Mov addEntranceMov(EntranceMov movIn) {
        return movsRepo.save(movIn);
    }

    @PostMapping("add")
    public Mov addExitMov(ExitMov movOut) {
        return movsRepo.save(movOut);
    }

    @GetMapping("Movs")
    public List<Mov> getMovs() {

        Sort sort = Sort.by("creDate").descending();
        List<Mov> latestmovs = movsRepo.findAll(sort);
        return latestmovs.subList(0, Math.min(latestmovs.size(), 50));
    }
}

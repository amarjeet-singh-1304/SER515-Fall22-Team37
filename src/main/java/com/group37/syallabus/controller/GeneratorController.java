package com.group37.syallabus.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Setter
@Getter
@RestController()
@CrossOrigin(origins = "*")
@RequestMapping(value = "/")
public class GeneratorController {

    @GetMapping(value = "group37")
    public ResponseEntity<String> translateCMM() {
        try {
            return ResponseEntity.ok("Group 37 working!");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}

package com.finalproject.specialtopicsii.gestaco.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.finalproject.specialtopicsii.gestaco.models.Link;
import com.finalproject.specialtopicsii.gestaco.services.LinkService;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkController {
    private LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping
    public ResponseEntity<List<Link>> list() {
        return new ResponseEntity<List<Link>>(linkService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Link> save(@Validated @RequestBody Link link) {
        return new ResponseEntity<Link>(linkService.save(link), HttpStatus.OK);
    }

}

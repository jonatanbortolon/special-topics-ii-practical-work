package com.finalproject.specialtopicsii.gestaco.services;

import org.springframework.stereotype.Service;

import com.finalproject.specialtopicsii.gestaco.exceptions.LinkNotFoundException;
import com.finalproject.specialtopicsii.gestaco.models.Link;
import com.finalproject.specialtopicsii.gestaco.repositories.LinkRepository;

import java.util.Optional;

@Service
public class LinkService {
    LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link getLink(Long id) {
        Optional<Link> opt = linkRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new LinkNotFoundException(id);
        }
    }
}
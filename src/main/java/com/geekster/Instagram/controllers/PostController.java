package com.geekster.Instagram.controllers;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.models.User;
import com.geekster.Instagram.repositories.IPostRepository;
import com.geekster.Instagram.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping(value = "/savePost")
    void savePost(@RequestBody Post post){
     postService.savePost1(post);
    }
    @GetMapping(value = "/getPost")
    public Post getPost(){
        return postService.getPost();
    }
}

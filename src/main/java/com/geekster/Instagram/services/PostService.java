package com.geekster.Instagram.services;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.repositories.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    IPostRepository postRepository;
    public void savePost1(Post post) {
        postRepository.save(post);
    }

    public Post getPost() {
        return postRepository.getAll();
    }
}

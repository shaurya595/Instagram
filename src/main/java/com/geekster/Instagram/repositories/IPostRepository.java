package com.geekster.Instagram.repositories;

import com.geekster.Instagram.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends CrudRepository<Post,Integer> {

    Post getAll();
}

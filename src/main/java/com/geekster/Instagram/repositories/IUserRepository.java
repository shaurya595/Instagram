package com.geekster.Instagram.repositories;

import com.geekster.Instagram.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {

}

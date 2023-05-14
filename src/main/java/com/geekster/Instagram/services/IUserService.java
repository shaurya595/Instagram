package com.geekster.Instagram.services;

import com.geekster.Instagram.models.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    User getAll();
}

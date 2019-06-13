package service;

import org.springframework.stereotype.Service;
import po.User;

@Service
public interface UserService {
    public User findUser(String username, String password);
}

package dao;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

public interface UserMapper extends CrudRepository<User, Integer> 
{
    List<User> findByEmail(String email);
    void deleteByEmail(String email);
}
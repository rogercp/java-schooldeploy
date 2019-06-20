package com.lambdaschool.schooldeploy;



import com.lambdaschool.schooldeploy.model.Role;
import com.lambdaschool.schooldeploy.model.User;
import com.lambdaschool.schooldeploy.model.UserRoles;
import com.lambdaschool.schooldeploy.services.RoleService;
import com.lambdaschool.schooldeploy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

//@Transactional
//@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;


    @Override
    public void run(String[] args) throws Exception
    {
        Role r1 = new Role("user");

        roleService.save(r1);

        // admin, data, user
        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), r1));
        User u1 = new User("admin", "password", admins);
        userService.save(u1);

    }
}

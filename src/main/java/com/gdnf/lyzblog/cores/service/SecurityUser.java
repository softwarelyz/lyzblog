package com.gdnf.lyzblog.cores.service;

import com.gdnf.lyzblog.cores.entity.Role;
import com.gdnf.lyzblog.cores.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecurityUser extends User implements UserDetails
{

    private static final long serialVersionUID = 1L;
    public SecurityUser(User user) {
        if(user != null)
        {
            this.setId(user.getId());
            this.setUsername(user.getUsername());
            this.setEmail(user.getEmail());
            this.setPhone(user.getPhone());
            this.setPassword(user.getPassword());
            this.setCreatedate(user.getCreatedate());
            this.setRoles(user.getRoles());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        List<Role> roles = this.getRoles();
        if(roles != null)
        {
            for (Role role : roles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
                authorities.add(authority);
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

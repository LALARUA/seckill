package cn.zx.authenticate.server.config.service;

import cn.zx.authenticate.service.TbPermissionService;
import cn.zx.authenticate.service.TbUserService;
import cn.zx.common.entity.TbPermission;
import cn.zx.common.entity.TbUser;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
@Service(value = "UserDetailsService")
public class UserDetailsImpl implements UserDetailsService {
    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private TbPermissionService tbPermissionService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getTbUserByName(s);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(10);
        if (tbUser != null){
            List<TbPermission> userPermissions = tbPermissionService.getByUserId(tbUser.getId());
            userPermissions.forEach(tbPermission -> {
                SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(simpleGrantedAuthority);
            });
        }
        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}

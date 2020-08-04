package com.rectus29.winekeeper.config;

import com.rectus29.winekeeper.security.realms.WineKeeperEmbedRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.config.ShiroAnnotationProcessorConfiguration;
import org.apache.shiro.spring.config.ShiroBeanConfiguration;
import org.apache.shiro.spring.config.web.autoconfigure.ShiroWebFilterConfiguration;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroWebConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
/*@Import({ShiroBeanConfiguration.class,
        ShiroAnnotationProcessorConfiguration.class,
        ShiroWebConfiguration.class,
        ShiroWebFilterConfiguration.class})*/
@ComponentScan("com.rectus29")
public class WineKeeperConfiguration {

    @Bean
    public Realm realm(){
        return new WineKeeperEmbedRealm();
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        //chainDefinition.addPathDefinition("/admin/**", "authc, roles[admin]"); // logged in users with the 'admin' role
        //chainDefinition.addPathDefinition("/docs/**", "authc, perms[document:read]"); // logged in users with the 'document:read' permission
        chainDefinition.addPathDefinition("/**", "authc"); // all other paths require a logged in user
        chainDefinition.addPathDefinition("/**", "anon"); // all paths are managed via annotations
        return chainDefinition;
    }
}

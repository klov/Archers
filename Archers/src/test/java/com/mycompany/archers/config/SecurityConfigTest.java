/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archers.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author vita
 */
public class SecurityConfigTest {
    
 
    /**
     * Test of configure method, of class SecurityConfig.
     */
    @Test
    public void testConfigure_AuthenticationManagerBuilder() throws Exception {
      BCryptPasswordEncoder bpe =  new BCryptPasswordEncoder();
      String kach = bpe.encode("password".subSequence(0, "password".length()));
        System.out.println(kach);
    }

  
    
}

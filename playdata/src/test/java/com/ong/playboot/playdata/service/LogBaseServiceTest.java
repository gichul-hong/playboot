package com.ong.playboot.playdata.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class LogBaseServiceTest {

    @Autowired
    LogBaseService logBaseService;

    @Test
    public void saveBaseLogTest () {

        logBaseService.saveBaseLog("test message");
    }
}
package com.ong.playboot.playdata.repository;

import com.ong.playboot.playdata.model.LogBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@DataJpaTest
class LogBaseRepositoryTest {

    @Autowired
    LogBaseRepository logBaseRepository;

    @Test
    public void saveBaseLogTest () {

        long rowCount = logBaseRepository.count();
        LogBase logBase = LogBase.builder()
                        .message("test message").build();

        logBaseRepository.save(logBase);

        Assertions.assertEquals(rowCount + 1, logBaseRepository.count());
    }
}
package com.ong.playboot.playdata.service;

import com.ong.playboot.playdata.model.LogBase;
import com.ong.playboot.playdata.repository.LogBaseRepository;
import com.ong.playboot.playdata.repository.LogDetailRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LogBaseServiceTest {

    private LogBaseRepository logBaseRepository = Mockito.mock(LogBaseRepository.class);
    private LogDetailRepository logDetailRepository = Mockito.mock(LogDetailRepository.class);
    private LogService logService;

    @BeforeEach
    public void setup() {
        logService = new LogService(logBaseRepository, logDetailRepository);
    }

    @Test
    public void saveBaseLogTest () {

        String message = "test message";

        when(logBaseRepository.save(any(LogBase.class))).then(returnsFirstArg());
        LogBase logbase = logService.saveBaseLog(message);

        assertEquals(message, logbase.getMessage());
    }

}

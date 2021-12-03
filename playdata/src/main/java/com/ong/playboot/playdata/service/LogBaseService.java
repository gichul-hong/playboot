package com.ong.playboot.playdata.service;

import com.ong.playboot.playdata.model.LogBase;
import com.ong.playboot.playdata.repository.LogBaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogBaseService {

    private final LogBaseRepository logBaseRepository;

    public void saveBaseLog (String message) {

        LogBase logbase = LogBase.builder()
                        .message(message)
                                .build();

        logBaseRepository.save(logbase);
    }

}

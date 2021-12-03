package com.ong.playboot.playdata.model;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@EnableJpaRepositories
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class LogBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long logId;
    private LocalDateTime createdAt;

    private String message;
}

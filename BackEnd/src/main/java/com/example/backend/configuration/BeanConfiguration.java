package com.example.backend.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

/**
 * packageName : com.example.dscine.Configuration
 * fileName : BeanConfiguration
 * author : Moon
 * date : 2023-01-02-002
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-01-02-002         Moon          최초 생성
 */
public class BeanConfiguration {

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}

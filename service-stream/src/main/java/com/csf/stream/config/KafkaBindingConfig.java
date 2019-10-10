package com.csf.stream.config;

import com.csf.stream.service.CustomPartitionKeyExtractor;
import com.csf.stream.service.CustomPartitionSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author orangeC
 * @date 2019/10/10 18:02
 * @desc
 */
@Configuration
public class KafkaBindingConfig {

    @Bean
    public CustomPartitionKeyExtractor customPartitionKeyExtractor() {
        return new CustomPartitionKeyExtractor();
    }
    @Bean
    public CustomPartitionSelector customPartitionSelector() {
        return new CustomPartitionSelector();
    }
}

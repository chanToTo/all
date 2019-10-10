package com.csf.stream.service;

import org.springframework.cloud.stream.binder.PartitionSelectorStrategy;
import org.springframework.util.ObjectUtils;

/**
 * @author orangeC
 * @date 2019/10/10 18:48
 * @desc
 */
public class CustomPartitionSelector implements PartitionSelectorStrategy {
    @Override
    public int selectPartition(Object key, int partitionCount) {
        System.out.println("消息载荷的key：" + key + " partitionCount：" + partitionCount);
        if (!ObjectUtils.isEmpty(key)) {
            Long id = (Long) key;
            return id.intValue() % partitionCount;
        }
        return 0;
    }
}

package com.netflix.eureka2.server.bridge;

import com.netflix.eureka2.registry.datacenter.DataCenterInfo;
import com.netflix.eureka2.registry.instance.InstanceInfo;

/**
 * Convert instance info objects from eureka 1.0 format to eureka 2.0 format
 *
 * @author David Liu
 */
public interface InstanceInfoConverter {

    InstanceInfo fromV1(com.netflix.appinfo.InstanceInfo v1Info);

    InstanceInfo.Status fromV1(com.netflix.appinfo.InstanceInfo.InstanceStatus v1Status);

    DataCenterInfo dataCenterFromV1(com.netflix.appinfo.InstanceInfo v1Info);
}

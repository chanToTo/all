package com.csf.client.api;

import com.bqs.data.bl.api.AppRestApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "bls")
public interface AppRestApiImpl extends AppRestApi {

}

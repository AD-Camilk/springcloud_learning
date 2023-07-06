package com.kas.feign;

import com.kas.entity.Student;
import com.kas.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/stu/findAll")
    public Collection<Student> findAll();
    @GetMapping("/stu/index")
    public String index();

}

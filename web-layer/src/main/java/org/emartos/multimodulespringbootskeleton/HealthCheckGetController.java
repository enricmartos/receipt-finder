package org.emartos.multimodulespringbootskeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckGetController {
    private static final String APPLICATION_NAME = "multi-module-spring-boot-skeleton";

    @Autowired
    private HealthCheckService healthCheckService;


    @GetMapping("/health-check")
    public Map<String, String> index() {
        return Collections.unmodifiableMap(new HashMap<String, String>() {
            {
                put("Application", APPLICATION_NAME);
                put("Status", healthCheckService.getHealthCheckStatus());
            }
        });
    }
}

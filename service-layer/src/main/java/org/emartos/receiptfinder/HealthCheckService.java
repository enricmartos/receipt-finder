package org.emartos.receiptfinder;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public String getHealthCheckStatus() {
        HealthCheck healthCheck = new HealthCheck("Ok!");
        return healthCheck.getMessage();
    }
}

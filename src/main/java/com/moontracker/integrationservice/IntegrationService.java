
package com.moontracker.integrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    private IntegrationRepository repository;

    public List<Integration> getAllIntegrations() {
        return repository.findAll();
    }

    public Integration findByCode(String code) {
        return repository.findByIntegrationCode(code);
    }

    public Integration createIntegration(Integration integration) {
        integration.setCreatedAt(LocalDateTime.now());
        integration.setUpdatedAt(LocalDateTime.now());
        return repository.save(integration);
    }

    public Integration updateIntegration(String id, Integration integration) {
        integration.setId(id);
        integration.setUpdatedAt(LocalDateTime.now());
        return repository.save(integration);
    }

    public void deleteIntegration(String id) {
        repository.deleteById(id);
    }
}

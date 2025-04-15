
package com.moontracker.integrationservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IntegrationRepository extends MongoRepository<Integration, String> {
    Integration findByIntegrationCode(String integrationCode);
}

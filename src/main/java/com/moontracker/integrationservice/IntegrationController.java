
package com.moontracker.integrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/integrations")
public class IntegrationController {

    @Autowired
    private IntegrationService integrationService;

    @GetMapping
    public List<Integration> getAllIntegrations() {
        return integrationService.getAllIntegrations();
    }

    @GetMapping("/search")
    public Integration searchByCode(@RequestParam String code) {
        return integrationService.findByCode(code);
    }

    @PostMapping
    public Integration createIntegration(@RequestBody Integration integration) {
        return integrationService.createIntegration(integration);
    }

    @PutMapping("/{id}")
    public Integration updateIntegration(@PathVariable String id, @RequestBody Integration integration) {
        return integrationService.updateIntegration(id, integration);
    }

    @DeleteMapping("/{id}")
    public void deleteIntegration(@PathVariable String id) {
        integrationService.deleteIntegration(id);
    }
}

package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Appointment;
import com.probestack.forgestudio.design.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.DefaultService;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-13T04:05:50.787357823Z[GMT]")
@Controller
@RequestMapping("${openapi.healthcarePatientService.base-path:/api/v1}")
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final DefaultService defaultService;

    @Autowired()
    public DefaultApiController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @Override()
    public ResponseEntity<Void> appointmentsPost(@Valid() @RequestBody() Appointment appointment) {
        log.info("Processing appointmentsPost request");
        try {
            var response = defaultService.appointmentsPost(appointment);
            log.info("appointmentsPost completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process appointmentsPost: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Patient> patientsPatientIdGet(@PathVariable() String patientId) {
        log.info("Processing patientsPatientIdGet request");
        try {
            var response = defaultService.patientsPatientIdGet(patientId);
            log.info("patientsPatientIdGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process patientsPatientIdGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> patientsPost(@Valid() @RequestBody() Patient patient) {
        log.info("Processing patientsPost request");
        try {
            var response = defaultService.patientsPost(patient);
            log.info("patientsPost completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process patientsPost: {}", e.getMessage(), e);
            throw e;
        }
    }
}

package com.probestack.forgestudio.design.api;

import java.math.BigDecimal;
import com.probestack.forgestudio.design.model.CreateOrderRequest;
import com.probestack.forgestudio.design.model.Order;
import com.probestack.forgestudio.design.model.Product;
import com.probestack.forgestudio.design.model.UpdateOrderStatusRequest;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-08T17:13:08.912352659Z[GMT]")
@Controller
@RequestMapping("${openapi.retailProductOrderService.base-path:/api/v1}")
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final DefaultService defaultService;

    @Autowired()
    public DefaultApiController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @Override()
    public ResponseEntity<Order> ordersOrderIdGet(@PathVariable() String orderId) {
        log.info("Processing ordersOrderIdGet request");
        try {
            var response = defaultService.ordersOrderIdGet(orderId);
            log.info("ordersOrderIdGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process ordersOrderIdGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> ordersOrderIdStatusPut(@PathVariable() String orderId, @Valid() @RequestBody() UpdateOrderStatusRequest updateOrderStatusRequest) {
        log.info("Processing ordersOrderIdStatusPut request");
        try {
            var response = defaultService.ordersOrderIdStatusPut(orderId, updateOrderStatusRequest);
            log.info("ordersOrderIdStatusPut completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process ordersOrderIdStatusPut: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Order> ordersPost(@Valid() @RequestBody() CreateOrderRequest createOrderRequest) {
        log.info("Processing ordersPost request");
        try {
            var response = defaultService.ordersPost(createOrderRequest);
            log.info("ordersPost completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process ordersPost: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Product>> productsGet(@Valid() @RequestBody() @RequestParam() String category, @Valid() @RequestBody() @RequestParam() BigDecimal priceMin, @Valid() @RequestBody() @RequestParam() BigDecimal priceMax) {
        log.info("Processing productsGet request");
        try {
            var response = defaultService.productsGet(category, priceMin, priceMax);
            log.info("productsGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process productsGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Product> productsProductIdGet(@PathVariable() String productId) {
        log.info("Processing productsProductIdGet request");
        try {
            var response = defaultService.productsProductIdGet(productId);
            log.info("productsProductIdGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process productsProductIdGet: {}", e.getMessage(), e);
            throw e;
        }
    }
}

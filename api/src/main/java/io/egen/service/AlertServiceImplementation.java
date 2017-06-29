package io.egen.service;

import io.egen.entity.Alert;
import io.egen.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by darav on 6/29/2017.
 */
@Service
public class AlertServiceImplementation implements AlertService {

    @Autowired
    AlertRepository alertRepository;

    @Transactional
    public Alert create(Alert alert) {
        //System.out.println("Alert Service");
        return alertRepository.create(alert);
    }
}

package com.serjnn.NotificationService.services;


import com.serjnn.NotificationService.dtos.DiscountNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final SimpMessagingTemplate simpMessagingTemplate;


    public void translateDiscountNotification(DiscountNotification discountNotification) {
        String destination = "/topic/client/" + discountNotification.getClientId();
        simpMessagingTemplate.convertAndSend(destination, discountNotification);

    }


}



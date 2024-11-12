package com.serjnn.NotificationService.kafka;


import com.serjnn.NotificationService.dtos.DiscountNotification;
import com.serjnn.NotificationService.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaConsumerService {


    private final NotificationService notificationService;

    @KafkaListener(topics = "discountNotifications", groupId = "notification_group")
    public void  consumeDiscountNotification(DiscountNotification discount) {
        notificationService.translateDiscountNotification(discount);


    }
}

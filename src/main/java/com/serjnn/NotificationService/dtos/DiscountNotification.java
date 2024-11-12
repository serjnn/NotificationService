package com.serjnn.NotificationService.dtos;

import lombok.Getter;

@Getter
public class DiscountNotification {
    private Long productId;
    private Long clientId;
    private Double discount;
}

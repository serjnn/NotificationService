package com.serjnn.NotificationService.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DiscountNotification {
    private Long productId;
    private Long clientId;
    private Double discount;
}

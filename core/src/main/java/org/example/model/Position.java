package org.example.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Position {
    private String figi;
    private BigDecimal quantity;
    private BigDecimal price;
    private String currency;
    private String name;
}

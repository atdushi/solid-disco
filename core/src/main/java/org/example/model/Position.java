package org.example.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Position implements Serializable {
    private String figi;
    private BigDecimal quantity;
    private BigDecimal price;
    private String currency;
    private String name;
}

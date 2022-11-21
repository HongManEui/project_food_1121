package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Payed extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String payOption;
    private String price;
}



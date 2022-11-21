package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Payed extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String payOption;
    private String price;

    public Payed(Pay aggregate){
        super(aggregate);
    }
    public Payed(){
        super();
    }
}

package labshopoauthkeycloakjsw.domain;

import java.util.*;
import labshopoauthkeycloakjsw.domain.*;
import labshopoauthkeycloakjsw.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}

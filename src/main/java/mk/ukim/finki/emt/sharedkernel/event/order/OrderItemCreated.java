package mk.ukim.finki.emt.sharedkernel.event.order;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.event.DomainEvent;

@Getter
public class OrderItemCreated extends DomainEvent {
    private String roomId;
    private int quantity;

    public OrderItemCreated() {
        super(TopicHolder.TOPIC_ORDER_ITEM_CREATED);
    }

    public OrderItemCreated(String roomId, int quantity) {
        super(TopicHolder.TOPIC_ORDER_ITEM_CREATED);
        this.roomId = roomId;
        this.quantity = quantity;
    }
}

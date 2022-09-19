package mk.ukim.finki.emt.sharedkernel.event.order;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.event.DomainEvent;

@Getter
public class OrderItemDeleted extends DomainEvent {
    private String roomId;
    private int quantity;

    public OrderItemDeleted() {
        super(TopicHolder.TOPIC_ORDER_ITEM_REMOVED);
    }

    public OrderItemDeleted(String topic, String roomId, int quantity) {
        super(TopicHolder.TOPIC_ORDER_ITEM_REMOVED);
        this.roomId = roomId;
        this.quantity = quantity;
    }
}

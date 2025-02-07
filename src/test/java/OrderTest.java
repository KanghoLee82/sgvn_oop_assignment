import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.test.Order;
import org.test.OrderItem;
import org.test.Product;

class OrderTest {

  private final Product product1 = new Product(1L, 100);
  private final Product product2 = new Product(2L, 200);

  private final OrderItem orderItem1 = new OrderItem(product1, 1);
  private final OrderItem orderItem2 = new OrderItem(product2, 1);

  @Test
  void orderContainMultipleProducts() {
    //given

    //when
    Order order = new Order(1L, List.of(orderItem1, orderItem2));

    //then
    assertEquals(2, order.getOrderItemList().size());
    assertEquals(100, order.getOrderItemList().get(0).calculateTotalPrice());
    assertEquals(200, order.getOrderItemList().get(1).calculateTotalPrice());
  }

  @Test
  void orderCalculateTotalPrice() {
    //given
    Order order = new Order(1L, List.of(orderItem1, orderItem2));

    //when
    int totalPrice = order.calculateTotalPrice();

    //then
    assertEquals(300, totalPrice);
  }

  @Test
  void orderCalculateTotalPriceWithSameProduct200() {
    //given
    OrderItem orderItem = new OrderItem(product1, 200);

    //when
    int totalPrice = orderItem.calculateTotalPrice();

    //then
    assertEquals(20000, totalPrice);
  }

  @Test
  void orderCalculateTotalPriceWithVIPDiscount() {
    //given

    //when

    //then
  }
}

package org.test;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Order {
  private final Long id;
  private final List<OrderItem> orderItemList;

  public Order(Long id, List<OrderItem> orderItemList) {
    this.id = id;
    this.orderItemList = orderItemList;
  }

  public int calculateTotalPrice() {
    return orderItemList.stream()
        .mapToInt(OrderItem::calculateTotalPrice)
        .sum();
  }
}

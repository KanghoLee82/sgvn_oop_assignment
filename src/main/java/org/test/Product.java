package org.test;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Product {
  private final Long id;
  private final int price;

  public Product(Long id, int price) {
    this.id = id;
    this.price = price;
  }

}

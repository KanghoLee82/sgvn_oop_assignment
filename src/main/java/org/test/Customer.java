package org.test;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Customer {
  private final Long id;

  public Customer(Long id) {
    this.id = id;
  }

}

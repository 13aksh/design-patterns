package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new ArrayIterator(this);
  }

  public class ArrayIterator implements Iterator {
    private ProductCollection productCollection;

    // Default value of int is 0.
    private int index;

    public ArrayIterator(ProductCollection productCollection) {
      this.productCollection = productCollection;
    }

    @Override
    public boolean hasNext() {
      return index < productCollection.products.size();
    }

    @Override
    public String current() {
      return productCollection.products.get(index).toString();
    }

    @Override
    public void next() {
      index++;
    }
  }
}

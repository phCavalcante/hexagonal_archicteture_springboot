package com.example.hexagonal.hexagonal.domain.entities;

/**
 * @author pablo.cavalcante - pablohenriq100@gmail.com
 * @date 10/11/2021 21:41
 */

public class Category {

  private Long id;
  private String category;

  public Category(){
  }

  public Category(Long id, String category) {
    this.id = id;
    this.category = category;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}

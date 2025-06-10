package com.example.ReactiveLibrary.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
@Table("book")
public class Book {
    @Id
    private Long id;
    private String name;
    private Integer pubYear;
    private Double cost;

    public Book() {
        super();
    }
    public Book(Long id, String name, Integer pubYear, Double cost) {
        super();
        this.id = id;
        this.name = name;
        this.pubYear = pubYear;
        this.cost = cost;
    }
    public Book(String name, Integer pubYear, Double cost) {
        super();
        this.name = name;
        this.pubYear = pubYear;
        this.cost = cost;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPubYear() {
        return pubYear;
    }
    public void setPubYear(Integer pubYear) {
        this.pubYear = pubYear;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

}

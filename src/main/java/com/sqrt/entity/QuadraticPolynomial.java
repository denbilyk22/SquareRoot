package com.sqrt.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuadraticPolynomial {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "a")
    private Double a;

    @Column(name = "b", columnDefinition = "double default 0")
    private Double b;

    @Column(name = "c", columnDefinition = "double default 0")
    private Double c;

    @ElementCollection
    @Column(name = "roots")
    private List<Double> roots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public List<Double> getRoots() {
        return roots;
    }

    public void setRoots(List<Double> roots) {
        this.roots = roots;
    }
}

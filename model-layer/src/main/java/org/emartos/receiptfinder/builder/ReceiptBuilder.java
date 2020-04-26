package org.emartos.receiptfinder.builder;

import org.emartos.receiptfinder.Duration;
import org.emartos.receiptfinder.Ingredient;
import org.emartos.receiptfinder.Receipt;
import org.emartos.receiptfinder.Type;

import java.util.List;
import java.util.Set;

public class ReceiptBuilder {
    private Integer id;
    private String name;
    private Set<Ingredient> ingredients;
    private List<String> steps;
    private Type type;
    private Duration duration;

    public Integer getId() {
        return id;
    }

    public ReceiptBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ReceiptBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public ReceiptBuilder setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public List<String> getSteps() {
        return steps;
    }

    public ReceiptBuilder setSteps(List<String> steps) {
        this.steps = steps;
        return this;
    }

    public Type getType() {
        return type;
    }

    public ReceiptBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    public Duration getDuration() {
        return duration;
    }

    public ReceiptBuilder setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    public Receipt build() {
        return new Receipt(this);
    }
}

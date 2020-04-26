package org.emartos.receiptfinder;

import org.emartos.receiptfinder.builder.ReceiptBuilder;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Receipt {
    private final Integer id;
    private final String name;
    private final Set<Ingredient> ingredients;
    private final List<String> steps;
    private final Type type;
    private final Duration duration;

    public Receipt(ReceiptBuilder receiptBuilder) {
        this.id = receiptBuilder.getId();
        this.name = receiptBuilder.getName();
        this.ingredients = receiptBuilder.getIngredients();
        this.steps = receiptBuilder.getSteps();
        this.type = receiptBuilder.getType();
        this.duration = receiptBuilder.getDuration();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public Type getType() {
        return type;
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(id, receipt.id) &&
                Objects.equals(name, receipt.name) &&
                type == receipt.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }
}

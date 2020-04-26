package org.emartos.receiptfinder;

import java.util.Objects;

public class Ingredient {
    private Integer id;
    private String name;
    private Integer calories;
    private Type type;

    public Ingredient(Integer id, String name, Integer calories, Type type) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
}

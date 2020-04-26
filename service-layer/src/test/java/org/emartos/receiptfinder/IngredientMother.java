package org.emartos.receiptfinder;

final class IngredientMother {
    private static final Integer CARROT_ID = 1;
    private static final Integer HUMMUS_ID = 2;
    private static final Integer FISH_ID = 3;
    private static final Integer CHIPS_ID = 4;

    private static final String CARROT_NAME = "carrot";
    private static final String HUMMUS_NAME = "hummus";
    private static final String FISH_NAME = "fish";
    private static final String CHIPS_NAME = "chips";

    private static final Integer CARROT_CALORIES = 40;
    private static final Integer HUMMUS_CALORIES = 50;
    private static final Integer FISH_CALORIES = 60;
    private static final Integer CHIPS_CALORIES = 80;

    private static final Type CARROT_TYPE = Type.VEGETAL;
    private static final Type HUMMUS_TYPE = Type.VEGETAL;
    private static final Type FISH_TYPE = Type.ANIMAL;
    private static final Type CHIPS_TYPE = Type.VEGETAL;

    static Ingredient carrot() {
        return new Ingredient(CARROT_ID, CARROT_NAME, CARROT_CALORIES, CARROT_TYPE);
    }

    static Ingredient hummus() {
        return new Ingredient(HUMMUS_ID, HUMMUS_NAME, HUMMUS_CALORIES, HUMMUS_TYPE);
    }

    static Ingredient fish() {
        return new Ingredient(FISH_ID, FISH_NAME, FISH_CALORIES, FISH_TYPE);
    }

    static Ingredient chips() {
        return new Ingredient(CHIPS_ID, CHIPS_NAME, CHIPS_CALORIES, CHIPS_TYPE);
    }


}

package org.emartos.receiptfinder;

import org.emartos.receiptfinder.builder.ReceiptBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class ReceiptMother {
    static final int CARROT_STICKS_ID = 1;
    static final int FISH_AND_CHIPS_ID = 2;

    private static final String CARROT_STICKS_NAME = "Carrot sticks";
    private static final String FISH_AND_CHIPS_NAME = "Fish and chips";

    private static final Set<Ingredient> CARROT_STICKS_INGREDIENTS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(IngredientMother.carrot(), IngredientMother.hummus()))
    );
    private static final Set<Ingredient> FISH_AND_CHIPS_INGREDIENTS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(IngredientMother.fish(), IngredientMother.chips()))
    );

    private static final List<String> CARROT_STICKS_STEPS = new ArrayList<>(Arrays.asList(
            "Cut carrot in pieces", "Serve it on the plate with hummus"
    ));
    private static final List<String> FISH_AND_CHIPS_STEPS = new ArrayList<>(Arrays.asList(
            "Cut fish in pieces", "Serve it on the plate with chips"
    ));

    private static final Type CARROT_STICKS_TYPE = Type.VEGETAL;
    private static final Type FISH_AND_CHIPS_TYPE = Type.ANIMAL;

    private static final Duration CARROT_STICKS_DURATION = Duration.SHORT;
    private static final Duration FISH_AND_CHIPS_DURATION = Duration.MEDIUM;

    static Receipt carrotSticks() {
        return new ReceiptBuilder()
                .setId(CARROT_STICKS_ID)
                .setName(CARROT_STICKS_NAME)
                .setIngredients(CARROT_STICKS_INGREDIENTS)
                .setSteps(CARROT_STICKS_STEPS)
                .setType(CARROT_STICKS_TYPE)
                .setDuration(CARROT_STICKS_DURATION)
                .build();
    }

    static Receipt fishAndChips() {
        return new ReceiptBuilder()
                .setId(FISH_AND_CHIPS_ID)
                .setName(FISH_AND_CHIPS_NAME)
                .setIngredients(FISH_AND_CHIPS_INGREDIENTS)
                .setSteps(FISH_AND_CHIPS_STEPS)
                .setType(FISH_AND_CHIPS_TYPE)
                .setDuration(FISH_AND_CHIPS_DURATION)
                .build();
    }


}

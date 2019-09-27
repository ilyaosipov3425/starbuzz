package ru.job4j.starbuzz;

import android.support.annotation.NonNull;

/**
 * Класс Drink - содержит данные напитков
 * @author Ilya Osipov (mailto:il.osipov.ya@yandex.ru)
 * @since 20.04.2019
 * @version $Id$
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @NonNull
    public String toString() {
        return this.name;
    }
}

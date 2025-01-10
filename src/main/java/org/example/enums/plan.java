// Plan Enum
package org.example.enums;

public enum plan {
    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 200),
    VIP("VIP Plan", 500);

    private final String name;
    private final int price; // Tipi int yaptık

    plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Price: $" + price + ")";
    }
}
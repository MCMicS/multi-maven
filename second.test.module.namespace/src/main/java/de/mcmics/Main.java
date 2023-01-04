package de.mcmics;

import de.mcmics.api.Call;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final var call = new Call();
        System.out.println(call.version());

    }
}

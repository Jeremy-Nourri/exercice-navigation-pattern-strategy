package org.example;

public class OffroadStrategy implements NavigationStrategy {
    @Override
    public void navigate(String destination) {
        System.out.println("Votre destination est : "+destination + ", vous utilisez la navigation hors route" );
    }
}

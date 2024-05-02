package org.example;

public class EconomicStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("Votre destination est : "+destination + ", vous utilisez la navigation économique" );
    }
}

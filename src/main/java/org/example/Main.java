package org.example;

public class Main {
    public static void main(String[] args) {

        NavigationSystem nav = NavigationSystem.builder().destination("New york").build();
        nav.navigate(new OffroadStrategy());
        NavigationSystem nav2 = NavigationSystem.builder().destination("Tourcoing").build();
        nav2.navigate(new RoadStrategy());
        NavigationSystem nav3 = NavigationSystem.builder().destination("Paris").build();
        nav3.navigate(new EconomicStrategy());

    }
}
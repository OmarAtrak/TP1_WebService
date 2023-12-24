package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;

public class Main {
    public static void main(String[] args) {
        BanqueService banqueService = new BanqueWS().getBanqueServicePort();
        System.out.println(banqueService.conversionEuroToDH(12));
    }
}
package com.example.CricketApplication.CricketGameSimulator.service.services.matchformatservice;

import com.example.CricketApplication.CricketGameSimulator.entities.enums.MatchFormat;

public class MatchFormatService {
    private static final MatchFormat[] matchFormatSpecifier =
            new MatchFormat[]{MatchFormat.T20, MatchFormat.ODI, MatchFormat.TEST};

    public static int oversScheduler(String matchFormat) {
        switch (matchFormat) {
            case "T20" -> {
                System.out.println("\nSCHEDULED : T20 MATCH\n");
                return matchFormatSpecifier[0].getOvers();
            }
            case "ODI" -> {
                System.out.println("\nSCHEDULED : ODI MATCH\n");
                return matchFormatSpecifier[1].getOvers();
            }
            case "TEST" -> {
                System.out.println("\nSCHEDULED : TEST MATCH\n");
                return matchFormatSpecifier[2].getOvers();
            }
            default -> throw new RuntimeException("Unknown match format: " + matchFormat);
        }
    }

}
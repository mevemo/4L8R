package de.mevemo;

import java.util.Scanner;

public class NeuKram {

    public static void gehAb() {
        System.out.println("Bite sag mir deinen Namen: ");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.next();
        System.out.println("Hallo " + playerName + " schön dich zu sehen");
        System.out.println("Möchtest du TicTacToe spielen?: ");

        String wannaPlay = scan.next();
        while(!(wannaPlay.equals("y") || wannaPlay.equals("n") )) {
            System.out.println("Bitte entscheide dich! y oder n");
            wannaPlay = scan.next();
            System.out.println(wannaPlay);
        }
        if (wannaPlay.equals("y")) {
            TikTakToe.gameMain();
        }
        else {
            System.out.println("Schönen Tag noch!");
        }

    }
}

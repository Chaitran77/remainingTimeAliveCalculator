package com.kiranthepro;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// I'M bOrEd iN cAmElCaSe :(((
        Scanner scanner = new Scanner(System.in);

        int[] dateTimeComponents = new int[6];

        for (int i=0; i< dateTimeComponents.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Type the year of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                    break;
                case 1:
                    System.out.println("Type the month of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Type the date of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Type the hour of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Type the minute of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Type the second of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                    break;
            }
        }

        LocalDateTime momentOfBirth = LocalDateTime.of(dateTimeComponents[0], dateTimeComponents[1], dateTimeComponents[2], dateTimeComponents[3], dateTimeComponents[4], dateTimeComponents[5]);
        System.out.println(momentOfBirth.toString());

        LocalDateTime now = LocalDateTime.now();

//        DeltaTime timeLivedFor
        System.out.println(momentOfBirth.toLocalDate());
        System.out.println(momentOfBirth.toLocalTime());

        Duration timeLivedFor = Duration.between(momentOfBirth, now);
        System.out.println(timeLivedFor.toString());
    }

}

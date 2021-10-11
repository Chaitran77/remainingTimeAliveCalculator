package com.kiranthepro;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// I'M bOrEd iN cAmElCaSe :(((
        Scanner scanner = new Scanner(System.in);

        int lifeExpectancy = 81;

        int[] dateTimeComponents = new int[6];

        for (int i=0; i< dateTimeComponents.length; i++) {
            switch (i) {
                case 0 -> {
                    System.out.println("Type the year of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                }
                case 1 -> {
                    System.out.println("Type the month of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                }
                case 2 -> {
                    System.out.println("Type the date of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                }
                case 3 -> {
                    System.out.println("Type the hour of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                }
                case 4 -> {
                    System.out.println("Type the minute of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                }
                case 5 -> {
                    System.out.println("Type the second of your birth: ");
                    dateTimeComponents[i] = scanner.nextInt();
                }
            }
        }

        LocalDateTime momentOfBirth = LocalDateTime.of(dateTimeComponents[0], dateTimeComponents[1], dateTimeComponents[2], dateTimeComponents[3], dateTimeComponents[4], dateTimeComponents[5]);
        System.out.println(momentOfBirth);

        LocalDateTime now = LocalDateTime.now();

//        DeltaTime timeLivedFor
        System.out.println(momentOfBirth.toLocalDate());
        System.out.println(momentOfBirth.toLocalTime());

        Duration timeLivedFor = Duration.between(momentOfBirth, now);

        LocalDateTime predictedMomentOfDeath = momentOfBirth.plusYears(lifeExpectancy);
        Duration timeLeftToLive = Duration.between(now, predictedMomentOfDeath);

        System.out.println("You have lived for " + periodToHumanReadableFormat(timeLivedFor) + " and therefore have " + periodToHumanReadableFormat(timeLeftToLive) + " left to live, based on the average life expectancy of " + lifeExpectancy);

    }

    public static String periodToHumanReadableFormat(Duration duration) {
        return duration.toDaysPart() + " days, " + duration.toHoursPart() + " hours, " + duration.toMinutesPart() + " minutes and " + duration.toSecondsPart() + " seconds";
    }

}

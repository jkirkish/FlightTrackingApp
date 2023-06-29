package com.coderscampus.flightTrack.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EpochConverter {

    // Convert epoch to human-readable date
    public String epochToHumanReadable(long epochSeconds) {
        Date date = new Date(epochSeconds * 1000); // Convert seconds to milliseconds
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        return sdf.format(date);
    }

    // Convert human-readable date to epoch
    public long humanReadableToEpoch(String dateString) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date date = sdf.parse(dateString);
        return date.getTime() / 1000; // Convert milliseconds to seconds
    }

    public void main(String[] args) {
        // Test epoch to human-readable conversion
        long epochTime = 1686102929;
        String humanReadableDate = epochToHumanReadable(epochTime);
        System.out.println("Epoch to human-readable:");
        System.out.println("Epoch: " + epochTime);
        System.out.println("Human-readable date: " + humanReadableDate);

        System.out.println();

        // Test human-readable to epoch conversion
        String dateString = "06-05-2023 12:22:09";
        try {
            long epoch = humanReadableToEpoch(dateString);
            System.out.println("Human-readable to epoch:");
            System.out.println("Human-readable date: " + dateString);
            System.out.println("Epoch: " + epoch);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

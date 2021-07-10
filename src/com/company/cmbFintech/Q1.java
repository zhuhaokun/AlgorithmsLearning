package com.company.cmbFintech;

public class Q1 {
    public static void main(String[] args) {
        int places = 4;
        int[] students = {1, 2, 3, 4};
        int[] buses = {1, 2, 3, 4};

        // How many places a bus can goes
        int[] busPlaces = new int[places];

        for (int i = 0; i < buses.length; i++) {
            for (int i1 = 0; i1 < students.length; i1++) {
                if (buses[i] >= students[i1]) {
                    busPlaces[i] += 1;
                }
            }
        }

        // Sort
        for (int i = 0; i < busPlaces.length - 1; i++) {
            for (int j = i + 1; j < busPlaces.length; j++) {
                if (busPlaces[i] > busPlaces[j]) {
                    int temp = busPlaces[i];
                    busPlaces[i] = busPlaces[j];
                    busPlaces[j] = temp;
                }
            }
        }

        // Calculate
        int result = 1;
        int rPlaces = places;
        int[] rBusPlaces = busPlaces;
        for (int i = 0; i < rBusPlaces.length; i++) {
            result *= Math.min(busPlaces[i], rPlaces);
            rPlaces -= 1;
            for (int j = i + 1; j < rBusPlaces.length; j++) {
                rBusPlaces[j] -= 1;
            }
        }

        System.out.println(result);


    }
}

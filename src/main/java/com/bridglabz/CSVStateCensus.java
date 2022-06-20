package com.bridglabz;

public class CSVStateCensus {
    public String state;

    public int population;

    public int areaInSqKm;

    public int densityPerSqKm;

    @Override
    public String toString() {
        return "CSVStateCensus{" +
                "State='" + state + '\'' +
                ", Population='" + population + '\'' +
                ", AreaInSqKm='" + areaInSqKm + '\'' +
                ", DensityPerSqKm='" + densityPerSqKm + '\'' +
                '}';
    }
}


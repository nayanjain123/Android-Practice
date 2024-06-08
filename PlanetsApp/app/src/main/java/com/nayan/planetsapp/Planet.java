package com.nayan.planetsapp;

//This class is acting as a model class for our Listview
public class Planet {

    //ATTRIBUTES
    private String planetName;
    private String moonCount;
    private int planetImage;
    //images are not stored inside variables instead we use resource identifiers represented as int values are used
    //these identifiers provide a way to reference resources in ur code and xml files without having to deal with
    //actual image data directly in ur code base.

    //CONSTRUCTOR
    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }
    //getter n setter


    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}

package com.kodilla.cabrio;

public class Cabrio
{
    private String model;
    private String brand;
    private boolean isMoving;
    private boolean roofOpen;

    public Cabrio (String model, String brand)
    {
        this.model = model;
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public boolean isMoving()
    {
        return isMoving;
    }

    public void setMoving(boolean moving)
    {
        isMoving = moving;
    }

    public boolean isRoofOpen()
    {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen)
    {
        if (isMoving)
        {
            System.out.println("You Can't Open or Close Roof While Driving!");
        }
        else
        {
            this.roofOpen = roofOpen;
        }
    }
}

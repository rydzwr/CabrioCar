package com.kodilla.cabrio;

public class CabrioApplication
{

    public static void main(String[] args)
    {
        Cabrio cabrio = new Cabrio("Cabrio Car", "Volvo");

        cabrio.setRoofOpen(true);
        System.out.printf("Status: Is Moving: %s, Roof Open: %s\n", cabrio.isMoving(), cabrio.isRoofOpen());
        cabrio.setMoving(true);
        cabrio.setRoofOpen(false);
        System.out.printf("Status: Is Moving %s, Roof Open: %s", cabrio.isMoving(), cabrio.isRoofOpen());
    }
}

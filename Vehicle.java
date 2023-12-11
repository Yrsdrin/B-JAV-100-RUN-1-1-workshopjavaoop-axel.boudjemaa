/*
** EPITECH PROJECT, 2023
** Ex1
** File description:
** here we go again
*/

public class Vehicle
{
    String Brand;
    String Model;
    String Year;
    public static void accelerate()
        {
            System.out.println("I'm putting the pedal to the metal");
        }
    public static void brake()
        {
            System.out.println("Woah! Slow down boy!");
	}
    public void describe()
        {
            System.out.println("A " + Brand + " " + Model + " made in " + Year);
	}
    public Vehicle(String brand, String model, String year)
        {
            Brand = brand;
            Model = model;
            Year = year;
        }

}

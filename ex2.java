/*
** EPITECH PROJECT, 2023
** Ex2
** File description:
** does that mean my cars get money ?
*/

public class Vehicle
{
    String Brand;
    String Model;
    String Year;
    String Weight;
    String Wheels;

    public static void accelerate()
        {
            System.out.println("I'm putting the pedal to the metal");
        }
    public static void brake()
        {
            System.out.println("Woah! Slow down boy!");
	}
    private void describe()
        {
            System.out.println("I'm a " + Brand + " " + Model + " made in " + Year);
            System.out.println("I'm a " + class + "I weight " + Weight + "kg and I have " + Wheels + "wheels.");
	}
    public Vehicle(String brand, String model, String year, String weight, String wheels)
        {
            Brand = brand;
            Model = model;
            Year = year;
            Weight = weight;
            Wheels = wheels;
        }
}

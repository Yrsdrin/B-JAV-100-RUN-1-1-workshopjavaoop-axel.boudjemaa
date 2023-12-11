/*
** EPITECH PROJECT, 2023
** Ex1
** File description:
** here we go again
*/

public class Javaprogeam
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
    public Javaprogeam(String brand, String model, String year)
        {
            Brand = brand;
            Model = model;
            Year = year;
        }
    public static void main(String []args)
        {
            Javaprogeam car = new Javaprogeam(args[0], args[1], args[2]);
            car.accelerate();
            car.brake();
            car.describe();
        }

}

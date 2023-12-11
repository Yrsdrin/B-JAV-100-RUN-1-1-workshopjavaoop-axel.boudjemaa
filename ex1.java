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
    private void describe()
        {
            System.out.println("A " + Brand + " " + Model + " made in " + Year);
	}
    public static void main(String []args)
        {
            Vehicle car = new Vehicle();
            car.Brand = args[0];
            car.Model = args[1];
            car.Year = args[2];
            car.accelerate();
            car.brake();
            car.describe();
        }

}

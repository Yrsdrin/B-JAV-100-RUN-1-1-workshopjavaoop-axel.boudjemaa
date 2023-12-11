/*
** EPITECH PROJECT, 2023
** Ex1
** File description:
** here we go again
*/

public class Javaprogeam
{
    public static void main(String []args)
        {
            Vehicle car = new Vehicle(args[0], args[1], args[2]);
            car.describe();
            car.accelerate();
        }

}

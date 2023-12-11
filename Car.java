/*
** EPITECH PROJECT 2023
** Ex 2
** .
*/


public class Car extend Vehicle 
{
    String Sxezsrd;
    public Car(String brand, String model, String year, String weight, String wheels, void sxezsrd)
        {
            super(brand, model, year, weight, wheels);
            Sxezsrd = sxezsrd;
        }
        private void describe()
        {
            super.describe();
            System.out.println(Sxezrsd);
        }

}

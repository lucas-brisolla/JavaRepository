package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car nissan = new Car();
        Car toyota = new Car();

        nissan.name = "Skyline";
        nissan.model = "GTR34";
        nissan.year = 2002;
        nissan.price = 125000.00;

        toyota.name = "Supra";
        toyota.model = "MK4";
        toyota.year = 1993;
        toyota.price = 123000.00;

        nissan = toyota;

        System.out.println("Car list ------------------------------------------------------------------------");
        System.out.println("Nissan car: " + nissan.name + " Model: " + nissan.model + " Year: " + nissan.year + " Price: $" + nissan.price);
        System.out.println("Toyota car: " + toyota.name + " Model: " + toyota.model + " Year: " + toyota.year + " Price: $" + toyota.price);
    }
}

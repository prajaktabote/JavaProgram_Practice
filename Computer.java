//how to create multiple class in java program
class Computer
{
    Computer()
    {
        System.out.println("constructor of computer class");
    }
    void computer_method()
    {
        System.out.println("power gone! shut down your pc soon..");

    }
    public static void main(String args[])
    {
        Computer my = new Computer();
        Laptop your = new Laptop();

        my.computer_method();
        your.laptop_method();
    }
}
class Laptop{
    Laptop()
    {
        System.out.println("Constructor of laptop class.");
    }
    void laptop_method()
    {
        System.out.println("99% Battery available");
    }
}
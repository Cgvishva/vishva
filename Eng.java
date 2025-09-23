abstract class Vehicle{
       final void startEngine()
       {
        System.out.println("Engine Started...");
       }
        static String getVehicleType()
        {
         return "yamaha";
        }
        abstract void drive();
}
class Car extends Vehicle{
        void drive()
        {
         System.out.println("Driva a car");
        }
}
class MotorCycle extends Vehicle{
     void drive()
     {
      System.out.println("Drive a MotorCycle");
     }
}
class Eng{
    public static void main(String[]args){
     Car c1 = new Car();
     c1.drive();
     System.out.println(Vehicle.getVehicleType());
     MotorCycle m1 = new MotorCycle();
     m1.drive(); 
  }
}


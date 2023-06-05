package inheritance;
class Car extends Machine {

    public void wipeWindShield(){
        System.out.println("Wipe windshield");
    }

    @Override
    public void start(){
        System.out.println("Car starting");
    }
}
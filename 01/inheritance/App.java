package inheritance;
public class App {
    
    public static void main(String[] args) {
        Machine machine = new Machine();
        Car car = new Car();
        machine.start();
        machine.stop();

        System.out.println(machine);

        car.start();
        car.wipeWindShield();
        car.stop();
        
        System.out.println(car);

        Human human = new Human();

        human.showInfo();
    }
}

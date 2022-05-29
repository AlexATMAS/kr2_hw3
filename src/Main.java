import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Bicycle[] bicycles = {
                new Bicycle("Stels Navigator",2),
                new Bicycle("Stels Focus",2),
        };

        Car[] cars = {
                new Car("Mitsubishi",4),
                new Car("Honda",4),
        };
        Truck[] trucks = {
                new Truck("Volvo",6),
                new Truck("Nissan", 8),
        };

        Service service = new Service();
        service.ServiceStation(bicycles);
        service.ServiceStation(cars);
        service.ServiceStation(trucks);///











    }


       // ServiceStationBicycle.CheckBicycle(bicycles);
       // Service.CheckCar(cars);
        //Service.CheckTruck(trucks);




}
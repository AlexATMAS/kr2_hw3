public class Service {

    public void ServiceStation(ServiceStations[] stations){
        for (ServiceStations serviceStations : stations) {
            serviceStations.updateTyre();
            serviceStations.checkTrailer();
            serviceStations.checkEngine();
            System.out.println("////////////////////////////////");
        }
    }


}

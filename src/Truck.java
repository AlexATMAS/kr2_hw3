public class Truck implements ServiceStations {
    private  String modelName;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    private  int wheelsCount;


    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }///


    @Override
    public void updateTyre() {
        System.out.println("Модель: " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку!");
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель!");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп!");
    }

}

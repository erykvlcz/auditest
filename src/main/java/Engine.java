public class Engine {
    String name;
    Gas gas;

    public Engine(String name, Gas gas) {
        this.name = name;
        this.gas = gas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    private class Gas{
        private FuelType fuelType;

        public Gas(FuelType fuelType) {
            this.fuelType = fuelType;
        }

        public FuelType getFuelType() {
            return fuelType;
        }
    }
}

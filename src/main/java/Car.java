public class Car {
    String name;
    String drive;

    public Car(String name, String drive) {
        this.name = name;
        this.drive = drive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", drive='" + drive + '\'' +
                '}';
    }
}

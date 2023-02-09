public class Mers extends Car{
    private  String color;
    private String numberCar;

    public Mers(String model, String color, String numberCar) {
        super(model);
        this.color = color;
        this.numberCar = numberCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }
    public  void сharacteristic(){
        System.out.println("Самый быстрый");
    }
    public void machineСlasses(){
        System.out.println("""
                А-класс хэтчбек/седан
                B-класс семейный/субкомпактвэн
                C-класс седан/купе/универсал/кабриолет
                Х-класс среднеразмерный пикап
                CLA-класс компактный седан/универсал
                CLS-класс четырёхдверное купе/универсал
                E-класс бизнес-седан/купе/универсал/кабриолет
                G-класс внедорожник
                GLA-класс кросс-хэтч
                GLC-класс кроссовер/кросс-купе (ранее GLK-класс)
                GLE-класс среднеразмерный кроссовер/кросс-купе (ранее М-класс)
                GLB-класс\s
                """);
    }

    @Override
    public String toString() {
        return "Mers{" +
                "model" + getModel() +'\'' +
                "color='" + color + '\'' +
                ", numberCar='" + numberCar + '\'' +
                '}';
    }
}

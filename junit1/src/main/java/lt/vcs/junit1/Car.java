package lt.vcs.junit1;

class Car {

    private String color;

    String getColor() {
        return this.color;
    }

    void paintCar(String color) {
        if (color == null)
            throw new IllegalArgumentException("Color can not be null");
        this.color = color;
    }
}

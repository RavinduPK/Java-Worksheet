package LW_06.Q3;

public class Cat extends Pet {
    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String color) {
        coatColor = color;
    }

    @Override
    public String speak() {
        return "";
    }
}

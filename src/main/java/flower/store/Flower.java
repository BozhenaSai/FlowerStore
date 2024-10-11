package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    public void setSepalLength(double newSepalLength) {
        this.sepalLength = newSepalLength;
    }
    
    public double getSepalLength() {
        return sepalLength;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(FlowerColor newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return color.toString();
    }

}

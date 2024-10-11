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

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }
    
    public double getSepalLength() {
        return sepalLength;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }

}

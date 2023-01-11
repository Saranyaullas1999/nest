package shop;

public class FoodItems {
     Integer Coffee ;
     Integer Tea;
     Integer GreenTea;
     Integer Cake;
     Integer Puffs;
     Integer Samosa;

    public FoodItems(Integer coffee, Integer tea, Integer greenTea, Integer cake, Integer puffs, Integer samosa) {
        Coffee = coffee;
        Tea = tea;
        GreenTea = greenTea;
        Cake = cake;
        Puffs = puffs;
        Samosa = samosa;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public Integer getTea() {
        return Tea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getGreenTea() {
        return GreenTea;
    }

    public void setGreenTea(Integer greenTea) {
        GreenTea = greenTea;
    }

    public Integer getCake() {
        return Cake;
    }

    public void setCake(Integer cake) {
        Cake = cake;
    }

    public Integer getPuffs() {
        return Puffs;
    }

    public void setPuffs(Integer puffs) {
        Puffs = puffs;
    }

    public Integer getSamosa() {
        return Samosa;
    }

    public void setSamosa(Integer samosa) {
        Samosa = samosa;
    }
}

package builder_demo2;

public class WoodenHouse implements HouseBuilder{
    private House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden foundation");
    }
    @Override
    public void buildWalls() {
        house.setWalls("Wooden walls");
    }
    @Override
    public void buildRoof() {
        house.setRoof("Metal roof");
    }
    @Override
    public House getHouse() {
        return house;
    }
}


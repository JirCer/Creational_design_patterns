package builder_demo2;

public class BrickHouse implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
    }
    @Override
    public void buildWalls() {
        house.setWalls("Brick walls");
    }
    @Override
    public void buildRoof() {
        house.setRoof("Tile roof"); }
    @Override
    public House getHouse() {
        return house;
    }
}

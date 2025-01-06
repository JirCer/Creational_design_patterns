package builder_demo2;

public class Bricklayer  {
    private HouseBuilder builder;

    public Bricklayer(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        return builder.getHouse();
    }
}

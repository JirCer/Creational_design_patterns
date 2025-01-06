package builder_demo2;

public class Main {
    public static void main(String[] args) {
        BrickHouse brickHouse = new BrickHouse();
        Bricklayer bricklayer = new Bricklayer(brickHouse);

        House brickHouseDEMO = bricklayer.constructHouse();
        System.out.println(brickHouseDEMO + " : Brick House built.");

        WoodenHouse woodenHouse = new WoodenHouse();
        bricklayer=new Bricklayer(woodenHouse);

        House woodenHouseDEMO = bricklayer.constructHouse();
        System.out.println(woodenHouseDEMO + " : Wooden House built.");

    }
}

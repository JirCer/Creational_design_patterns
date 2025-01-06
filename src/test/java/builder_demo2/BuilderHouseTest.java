package builder_demo2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BuilderHouseTest {
    private BrickHouse brickHouse;
    private WoodenHouse woodenHouse;
    private Bricklayer bricklayer;

    @BeforeEach
    public void setUp() {
        brickHouse = new BrickHouse();
        woodenHouse = new WoodenHouse();
        System.out.println("setUp method called");
    }
    @AfterEach
    public void tearDown() {
        brickHouse = null;
        woodenHouse = null;
        System.out.println("tearDown method called");
    }

    @Test
    void testBrickHouse() {
        bricklayer = new Bricklayer(brickHouse);
        House brickHouse = bricklayer.constructHouse();

        assertThat(brickHouse.toString(),containsString("Concrete foundation"));
        assertThat(brickHouse.toString(),containsString("Brick walls"));
        assertThat(brickHouse.toString(),containsString("Tile roof"));
    }

    @Test
    void testWoodenHouse() {
        bricklayer = new Bricklayer(woodenHouse);
        House woodenHouse = bricklayer.constructHouse();

        assertThat(woodenHouse.toString(),containsString("Wooden foundation"));
        assertThat(woodenHouse.toString(),containsString("Wooden walls"));
        assertThat(woodenHouse.toString(),containsString("Metal roof"));

    }
    @Test
    void testDifferentHouseBuilders(){

        HouseBuilder brickBuilder = new BrickHouse();
        HouseBuilder woodenBuilder= new WoodenHouse();
        Bricklayer bricklayer1 = new Bricklayer(brickBuilder);
        Bricklayer bricklayer2 = new Bricklayer(woodenBuilder);

        House brickHouse = bricklayer1.constructHouse();
        House woodenHouse = bricklayer2.constructHouse();

        assertThat(brickHouse.toString(),not(equalTo(woodenHouse.toString())));
    }

}

package singleton;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Singleton Test Of Variables")
public class SingletonTest {
    private Singleton x,y,z;

    @BeforeEach
    void setUp(){
        x = Singleton.getInstance();
        y = Singleton.getInstance();
        z = Singleton.getInstance();
        System.out.println("setUp method called");
    }
    @AfterEach
    void tearDown(){
        System.out.println("tearDown method called");
    }

    @Test
    void testSingletonInstance() {
        assertEquals(x,y);
        assertEquals(y,z);
        assertEquals(x,z);

    }
    @Test
    void testGetInstance() {
        assertEquals(x,Singleton.getInstance());
        assertEquals(y,Singleton.getInstance());
        assertEquals(z,Singleton.getInstance());
    }
    @Test
    void testSetInstance() {
        double setNum = x.getNumber()+5;
        x.setNumber(setNum);
        y.setNumber(setNum);
        z.setNumber(setNum);
        assertEquals(47,setNum);
    }

    @Test
    void testGetNumber() {
        assertEquals(x.getNumber(),42);
        assertEquals(y.getNumber(),42);
        assertEquals(z.getNumber(),42);
    }
}

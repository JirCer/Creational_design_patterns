package factory_method_demo2;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("The test of shops with butter prices with/without VAT")
public class ShopFactoryTest {
    private static BillaShopFactory billaShopFactory;
    private static TescoShopFactory tescoShopFactory;
    private static LidlShopFactory lidlShopFactory;

    @BeforeAll
    static void setUp() {
        billaShopFactory = new BillaShopFactory();
        tescoShopFactory = new TescoShopFactory();
        lidlShopFactory = new LidlShopFactory();
        System.out.println("setUp method called");

    }
    @AfterAll
    static void tearDown() {
        billaShopFactory = null;
        tescoShopFactory = null;
        lidlShopFactory = null;
        System.out.println("tearDown method called");
    }

    @Test
    public void testBillaShopFactory() {
        Shop billaShop = billaShopFactory.createShop();

        //using JUnit5 assert
        assertEquals(2.5,billaShop.getButterPrice(), "The price of butter in Billa with VAT should be 2.50 €");
        assertEquals(2.0, billaShop.getButterPriceWithoutVAT(), "The price of butter in Billa  without VAT should be 2.00 €");

        //using Hamcrest assert
        assertThat("The price of butter in Billa with VAT should be 2.50 €", billaShop.getButterPrice(), is(2.5));
        assertThat("The price of butter in Billa  without VAT should be 2.00 €", billaShop.getButterPriceWithoutVAT(), is(2.00));

    }

    @Test
    public void testTescoShopFactory() {
        Shop tescoShop = tescoShopFactory.createShop();

        //using JUnit5 assert
        assertEquals(2.9, tescoShop.getButterPrice(), "The price of butter in Tesco with VAT should be 2.90 €");
        assertEquals(2.3, tescoShop.getButterPriceWithoutVAT(), "The price of butter in Tesco without VAT should be 2.30 €");

        //using Hamcrest assert
        assertThat("The price of butter in Tesco with VAT should be 2.90 €", tescoShop.getButterPrice(), is(2.90));
        assertThat("The price of butter in Tesco without VAT should be 2.30 €", tescoShop.getButterPriceWithoutVAT(), is(2.30));

    }

    @Test
    public void testLidlShopFactory() {
        Shop lidlShop = lidlShopFactory.createShop();

        //using JUnit5 assert
        assertEquals(2.2, lidlShop.getButterPrice(), "The price of butter in Lidl with VAT should be 2.20 €");
        assertEquals(1.8, lidlShop.getButterPriceWithoutVAT(), "The price of butter in Lidl without VAT should be 1.8 €" );

        //using Hamcrest assert
        assertThat("The price of butter in Lidl with VAT should be 2.20 €", lidlShop.getButterPrice(), is(2.20));
        assertThat("The price of butter in Lidl without VAT should be 1.8 €", lidlShop.getButterPriceWithoutVAT(), is(1.8));

    }

    @Test
    public void testInvalidShopFactory() {
        ShopFactory shopFactory = FactoryMethodFinal.getShopFactory("InvalidShopFactory");

        //using JUnit5 assert
        assertNull(shopFactory, "The non-existent shop should return null");

        //using Hamcrest assert
        assertThat("Factory for unknown shop should be null", shopFactory, is(nullValue()));

    }

}

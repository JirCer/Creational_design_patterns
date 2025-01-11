package factory_method_demo2;

public class BillaShopFactory extends ShopFactory {
    @Override
    public Shop createShop() {
        return new BillaShop();
    }
}

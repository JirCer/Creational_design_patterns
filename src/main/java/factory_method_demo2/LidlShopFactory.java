package factory_method_demo2;

public class LidlShopFactory extends ShopFactory {
    @Override
    public Shop createShop() {
        return new LidlShop();
    }
}

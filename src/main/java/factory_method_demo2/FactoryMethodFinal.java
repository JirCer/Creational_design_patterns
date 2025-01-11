package factory_method_demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMethodFinal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the shop name (Billa, Tesco, Lidl): ");
            String shopName = reader.readLine().trim();

            ShopFactory shopFactory = getShopFactory(shopName);

            if (shopFactory != null) {
                Shop shop = shopFactory.createShop();
                double priceWithoutVAT=shop.getButterPriceWithoutVAT();
                double roundedPriceWithoutVAT=Math.round(priceWithoutVAT*10)/10.0;
                double priceWithVAT = shop.getButterPrice();
                double roundedPriceWithVAT=Math.round(priceWithVAT*10)/10.0;

                System.out.println("The counter price of butter in " + shopName + ": " + shop.getButterPrice() + " €");
                System.out.println("The price of butter without VAT in " + shopName + ": " + roundedPriceWithoutVAT + " €" );
                System.out.println("The price of butter with VAT in " + shopName + ": " + roundedPriceWithVAT + " €");
            } else {
                System.out.println("Unknown shop: " + shopName);
            }

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    public static ShopFactory getShopFactory(String shopName) {
        if (shopName==null || shopName.isEmpty()) {
            return null;
        }

        else if(shopName.equalsIgnoreCase("Billa")) {
            return new BillaShopFactory();
        }
        else if(shopName.equalsIgnoreCase("Tesco")) {
            return new TescoShopFactory();
        }
        else if(shopName.equalsIgnoreCase("Lidl")) {
            return new LidlShopFactory();
        }

        return null;

    }
}

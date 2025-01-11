package factory_method_demo2;

public interface Shop {
    double getButterPrice();

    double VAT = 0.19; //19% VAT
    default double getButterPriceWithoutVAT(){
        double butterPriceWithoutVAT = getButterPrice()-(getButterPrice()* VAT);
        double roundedButterPriceWihoutVAT = Math.round(butterPriceWithoutVAT*10)/10.0;
        return roundedButterPriceWihoutVAT;

    }

}

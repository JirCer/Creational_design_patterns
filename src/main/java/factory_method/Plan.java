package factory_method;

abstract class Plan {
    protected double rate;
        abstract void getRate();

        public void calculateAccount(int units) {
            double account = units * rate;
            System.out.println(account);
        }


}

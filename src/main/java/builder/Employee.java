package builder;

//Builder Pattern


public class Employee {

    private String name;
    private String adress;
    private int id;
    private long phoneNumber;

    public  Employee(Builder builder) {
        this.name=builder.name;
        this.adress=builder.adress;
        this.id=builder.id;
        this.phoneNumber=builder.phoneNumber;

    }


    static class Builder {
        private String name;
        private String adress;
        private int id;
        private long phoneNumber;

        public static Builder newInstance() {
            return new Builder();
        }
        private Builder() {}
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }
        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}


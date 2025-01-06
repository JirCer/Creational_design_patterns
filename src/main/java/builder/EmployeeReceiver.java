package builder;

class EmployeeReceiver {
    private volatile Employee employee;
    //using Threads

    public EmployeeReceiver() {
        Thread t1 = new Thread(() -> {

            synchronized (this) {


                employee = Employee.Builder.newInstance()
                        .setName("Jan Maly")
                        .setAdress("Ruzova 14, Ruzomberok")
                        .setId(14)
                        .setPhoneNumber(5988556688L)
                        .build();

            }

        });

        Thread t2 = new Thread(() -> {

            synchronized (this) {
                if (employee == null) {
                    employee = Employee.Builder.newInstance()
                            .setName("Eva Velka")
                            .setAdress("Velky voz, Zilina")
                            .setId(15)
                            .setPhoneNumber(458852659L)
                            .build();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }


    }
    public synchronized Employee getEmployee ()
    {
        return employee;
    }
    //in this thread implementation - the value of the first thread is set

}

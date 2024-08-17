package Aug.ex_10082024.ecap;

public class ICICIBank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    private String name;
    private String balance;

    public ICICIBank(String name, String balance) {
        this.name = name;
        this.balance = balance;

    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance,Boolean admin) {
        if(admin==true){
            this.balance = balance;
        }
        else
        {
            System.out.println("No access");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

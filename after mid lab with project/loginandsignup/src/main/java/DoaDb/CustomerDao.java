package DoaDb;

import model.Customer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class CustomerDao {
    int key=1;


    public static Hashtable<Integer, Customer> vip= new Hashtable<>();

    {
        vip.put(key++,new Customer("robel","1234"));

        vip.put(key++,new Customer("luwam","1234"));

        vip.put(key++,new Customer("tekl","1234"));

        vip.put(key++,new Customer("akile","1234"));
        }

    public List<Customer> getAllCustomers(){

        return new ArrayList<>(vip.values());
    }
    public void addCustomer(Customer customer){
        vip.put(key++,customer);

    }

}

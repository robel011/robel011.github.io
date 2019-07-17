package DoaDb;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDao {

     Map<Integer, Customer> vip= new HashMap();

    {
        //vip.put(1,new Customer(1,"robel tes",29,"robel","1234"));
        vip.put(1,new Customer("robel","1234"));
       // vip.put(2,new Customer(2,"luwam tes",31,"luwam","1234"));
        vip.put(2,new Customer("luwam","1234"));
        //vip.put(3,new Customer(3,"tekl kelati",34,"tekl","1234"));
        vip.put(3,new Customer("tekl","1234"));
        //vip.put(1,new Customer(4,"akile gere",33,"akile","1234"));
        vip.put(4,new Customer("akile","1234"));
    }

    public List<Customer> getAllCustomers(){

        return new ArrayList<>(vip.values());
    }

}

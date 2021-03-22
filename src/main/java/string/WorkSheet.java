package string;

import java.util.*;

public class WorkSheet {

    public static void main(String[] args) {

        // TODO: HashMap insertion order
        HashMap myhashMap = new HashMap();
        myhashMap.put("Anand", "TCS Banglore");
        myhashMap.put("Dashrath", "TCS Mumbai");
        myhashMap.put("Vishu", "TCS Kerala");

        System.out.println(myhashMap);


        // TODO: LinkedHashMap insertion order
        Map myLinkedHashMap = new LinkedHashMap();
        myLinkedHashMap.put("Dashrath", "TCS Banglore");
        myLinkedHashMap.put("Anand", "TCS Mumbai");
        myLinkedHashMap.put("Vishu", "TCS Kerala");

        System.out.println(myLinkedHashMap);

        // TODO: keep names in asending order
        Map myTreeMap = new TreeMap();
        myTreeMap.put("Dashrath", "TCS Banglore");
        myTreeMap.put("Anand", "TCS Mumbai");
        myTreeMap.put("Vishu", "TCS Kerala");

        System.out.println(myTreeMap);

    }
}

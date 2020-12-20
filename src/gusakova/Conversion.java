package gusakova;

import java.util.Arrays;

public class Conversion {
    public static void main(String[] args) {
        int number = 1;
        String date = "01.01.2020";
        String[] products = {"Рис", "Соль"};
        Contract contract = new Contract();
        contract.number=number+1;
        contract.date =date;
        contract.products = products;
        Act act = convertToAct(contract);
        System.out.println("Акт = " + act.number + " Дата  = " +act.date + " Продукты = " + Arrays.toString(act.products));

    }
    public static Act convertToAct(Contract contract) {
        Act act = new Act();
        act.number = contract.number;
        act.date= contract.date;
        act.products=contract.products;
        return act;
    }
}

class Contract{
     int number;
     String date;
     String[] products;
}

class Act{
    int number;
    String date;
    String[] products;
}

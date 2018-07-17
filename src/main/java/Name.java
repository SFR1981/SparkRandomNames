import org.apache.commons.collections.ArrayStack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Name {

    public ArrayList<String> nameList;


    public Name(){
        this.nameList = new ArrayList<String>();
        nameList.add("Barry");
        nameList.add("Terry");
        nameList.add("Bungle");
        nameList.add("Zippy");
        nameList.add("Shaggy");
        nameList.add("Scooby");
        nameList.add("Tina");
        nameList.add("Jeff");
        nameList.add("Geoff");
        nameList.add("Ian");
        nameList.add("Iain");
        nameList.add("Harry");
        nameList.add("Barry");
        nameList.add("Larry");
        nameList.add("Sally");
        nameList.add("Jane");

    }


    public String getRandomName(){
        Collections.shuffle(nameList);
        return nameList.get(0);
    }


    public String getRandomPair(){
        Collections.shuffle(nameList);
        return nameList.get(0) + " " + nameList.get(1);
     }

     public String getNumberOfNames(int i){
        Collections.shuffle(this.nameList);
        ArrayList<String> names = new ArrayList<>();
        if (i > this.nameList.size()){
            return String.join(", ", this.nameList);
        }
        else{
            for (int n=0; n < i; n++){
                names.add(nameList.get(0));
                nameList.remove(0);
            }
            return String.join(", ", names);
        }
     }


}

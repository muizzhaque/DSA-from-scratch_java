import java.util.ArrayList;
import java.util.List;

public class CountItemsMatching {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> phone1 = new ArrayList<>();
        phone1.add("phone");
        phone1.add("blue");
        phone1.add("pixel");
        list.add(phone1);
        
        ArrayList<String> computer = new ArrayList<>();
        computer.add("computer");
        computer.add("silver");
        computer.add("lenovo");
        list.add(computer);
        
        ArrayList<String> phone2 = new ArrayList<>();
        phone2.add("phone");
        phone2.add("gold");
        phone2.add("iphone");
        list.add(phone2);
        int ans = countMatches(list, "type", "phone");
        System.out.println(ans);
    }
    static int countMatches(ArrayList<ArrayList<String>> list, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i=0;i<list.size();i++){
            List<String> item = list.get(i);
            if(ruleKey=="type"){
                if(item.get(0).equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey == "color"){
                if(item.get(1).equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey == "name"){
                if(item.get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
    // public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    //     int count = 0;

    //     for (List<String> item : items) {
    //         int index = 0; // Index of the attribute to compare (type, color, or name)

    //         // Determine the index based on ruleKey
    //         if (ruleKey.equals("type")) {
    //             index = 0;
    //         } else if (ruleKey.equals("color")) {
    //             index = 1;
    //         } else if (ruleKey.equals("name")) {
    //             index = 2;
    //         }

    //         // Check if the corresponding attribute matches the rule value
    //         if (item.get(index).equals(ruleValue)) {
    //             count++;
    //         }
    //     }

    //     return count;
    // }
    // 
    // for (int i = 0; i < items.size(); i++) {
    //     List<String> item = items.get(i); // Use get() for better readability

    //     // Use a switch statement for more efficient ruleKey handling
    //     switch (ruleKey) {
    //         case "type":
    //             if (item.get(0).equals(ruleValue)) {
    //                 count++;
    //             }
    //             break;
    //         case "color":
    //             if (item.get(1).equals(ruleValue)) {
    //                 count++;
    //             }
    //             break;
    //         case "name":
    //             if (item.get(2).equals(ruleValue)) {
    //                 count++;
    //             }
    //             break;
    //         default:
    //             // Handle invalid ruleKey (optional, can throw an exception)
    //             // System.out.println("Invalid ruleKey: " + ruleKey);
    //     }
    // }

    // return count;
}

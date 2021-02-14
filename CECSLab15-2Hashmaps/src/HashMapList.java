import java.util.*;

public class HashMapList {

    public static void main(String[] args) {
    	Map<String, Set<String>> friendList = new HashMap<String, Set<String>>();

        Set<String> sueFriend = new HashSet<String>();
        sueFriend.add("Bob");
        sueFriend.add("Jose");
        sueFriend.add("Alex");
        sueFriend.add("Cathy");
        friendList.put("Sue", sueFriend);

        Set<String> cathyFriend = new HashSet<String>();
        cathyFriend.add("Bob");
        cathyFriend.add("Alex");
//        cathyFriend.add("Sue");
        friendList.put("Cathy", cathyFriend);

        Set<String> bobFriend = new HashSet<String>();
        bobFriend.add("Alex");
//        bobFriend.add("Sue");
        bobFriend.add("Jose");
        bobFriend.add("Jerry");
        friendList.put("Bob", bobFriend);

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name =  inputName.nextLine();

        if (friendList.containsKey(name)) {
            System.out.print(name + "'s friends are ");
            for (String str: friendList.get(name)) {
                System.out.print(str + " ");
            }
        }
        else {
            System.out.println("The name is not in the friend list.");
        }
    }

}
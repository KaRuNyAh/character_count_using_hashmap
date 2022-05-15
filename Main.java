import java.util.*;
public  class Main {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String k="hello this is karunyah";
        HashMap<String,Integer>hashMap=new HashMap<>();
        for(int i=0;i<k.length();i++){
            String t=Character.toString(k.charAt(i));
            if(hashMap.containsKey(t)) {
                hashMap.put(t, hashMap.get(t) + 1);
            }
            else{
                hashMap.put(t,1);
            }
        }
        System.out.println(hashMap);



    }
}

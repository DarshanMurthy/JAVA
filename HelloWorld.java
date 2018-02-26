import java.util.*;
class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello World");
        String node ="node";
        node.charAt(0);
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        
        
        for(int i=0;i< node.length();i++) {
        	map.put(i, node.charAt(i));
        }
    
        System.out.println(map);
        
        String string[] = {"node1", "node2"};
        Map<Integer, String> nodevalue = new HashMap<Integer,String>();
        int counter=0;
        for(String i: string) {
        	nodevalue.put(counter,i);
        	counter++;
        }
        
        
        System.out.println(nodevalue);
        
        
        
        
        
    }
}
package interview;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by gunjunLee on 2016-11-30.
 */
public class duplicatelinkedList {

    public static void main(String[] args){

        LinkedList<String> lists = new LinkedList<String>();
        lists.add("1");
        lists.add("3");
        lists.add("1");
        lists.add("4");

        HashMap<String,Integer> map = new HashMap<>();

        int size = lists.size();
        for(int i=0;i<size;i++){
            if(!map.containsKey(lists.get(i))){
                map.put(lists.get(i),1);
            }else{
                lists.remove(i);
                size--;
                i--;
            }
        }

        System.out.println(lists.toString());
    }

}

//class LinkedList {
//
//    private Node head;
//    private Node tail;
//    private int size = 0;
//    private class Node{
//
//        private Object data;
//        private Node next;
//        public Node(Object input){
//            this.data = input;
//            this.next = null;
//        }
//
//        public String toString(){
//            return String.valueOf(this.data);
//        }
//    }
//
//}

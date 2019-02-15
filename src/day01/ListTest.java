package day01;

import java.util.*;

public class ListTest {
    public static void main (String [] args){
        List<Integer> list = new ArrayList<>();//ArrayList默认大小为10
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list.get(5));

        Map<String,String> map = new HashMap<>();//HashMap默认大小为16

        HashSet<String> set = new HashSet<>(); //底层是HashMap

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();//底层是LinkedHashMap
    }

}

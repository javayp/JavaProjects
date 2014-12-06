package com.PerosnSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by yp on 11/26/2014.
 */
public class Sorter{
	private static int  counter=0;
	private static final int DEFAULT_VALUE=0;
    /*@Override
    public int compare(Person o1, Person o2) {
    	return o1.getCity().compareTo(o2.getCity());
    }*/

    public static void main(String[] args) {
    	Map<String,Person> personMap=new HashMap<String,Person>();
    	Map<String,Integer> tempmapping=new HashMap<String,Integer>();	
    	Map<String,Integer> sortedmap=new HashMap<String,Integer>();	
    	
    	personMap.put("john",new Person(1342, "john", "12/3/2013", "nyc"));
    	personMap.put("mackinze",new Person(1234, "austin", "11/4/2013", "jerssy"));
    	personMap.put("christian",new Person(1443, "vince", "12/3/2013", "michign"));
    	personMap.put("brian",new Person(1645, "Samoz", "12/3/2013", "washington"));
    	
    	
    	int[] idcollector=new int[personMap.size()];
    
    	for(Map.Entry<String,Person> mapExtractValue:personMap.entrySet()){
    			idcollector[counter]=mapExtractValue.getValue().getId();
    			tempmapping.put(mapExtractValue.getKey(),idcollector[counter]);
    			counter++;
    	}
    	
    	counter=DEFAULT_VALUE;
    	Arrays.sort(idcollector);//sorting the id-collector array
    	for(int extracted:idcollector){
    		System.out.println(extracted);
    	}
    	System.out.println(tempmapping);
    	
    	for(int i=0;i<tempmapping.size();i++){
    		for(Map.Entry<String,Integer> mapInsertValue:tempmapping.entrySet()){
        		while(idcollector.length>counter){
        			if(tempmapping.get(mapInsertValue.getKey())==idcollector[counter]){
        				System.out.println("match found");
        				sortedmap.put(mapInsertValue.getKey(),idcollector[counter]);
        				System.out.println(sortedmap);
        			}
        			counter++;
        		}
        	counter=DEFAULT_VALUE;
        	}
    	}
    	System.out.println(sortedmap);
    	for(Map.Entry<String,Integer> sortedMap:sortedmap.entrySet()){
    		System.out.println(sortedMap.getKey()+" "+sortedMap.getValue());
    	}
       /* List<Person> perosnList = new ArrayList<Person>();*/

        /*perosnList.add(new Person(1342, "john", "12/3/2013", "nyc"));
        perosnList.add(new Person(1234, "austin", "11/4/2013", "jerssy"));
        perosnList.add(new Person(1443, "vince", "12/3/2013", "michign"));
        perosnList.add(new Person(1645, "Samoz", "12/3/2013", "washington"));
        System.out.println("before sorting!!!");
        for (Person personExtractor : perosnList) {
            System.out.println("name=" + personExtractor.getName() + " id=" + personExtractor.getId() + " date=" + personExtractor.getDate() + " city=" + personExtractor.getCity());
        }
        System.out.println("------------");
        Collections.sort(perosnList,new Sorter());
        System.out.println("After sorting!!!");
        for (Person personExtractor : perosnList) {
            System.out.println("name=" + personExtractor.getName() + " id=" + personExtractor.getId() + " date=" + personExtractor.getDate() + " city=" + personExtractor.getCity());
        }*/
    }

}

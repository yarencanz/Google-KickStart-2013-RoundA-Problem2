import java.util.ArrayList;
import java.util.HashMap;

//https://codingcompetitions.withgoogle.com/kickstart/round/0000000000434ba1/0000000000434813
public class Solution {
    public static void main(String[] args) {
    
        String no = "55266983999";
        String[] noArr = no.split("");
    
        String result1 = "";
        String result2 = "";
        String result3 = "";
        
        HashMap<String,String> map = new HashMap<>();
          map.put("1","one");
          map.put("2", "two");
          map.put("3","three");
          map.put("4", "four");
          map.put("5","five");
          map.put("6", "six");
          map.put("7","seven");
          map.put("8", "eight");
          map.put("9","nine");
          map.put("0", "zero");
    
         ArrayList<String> list = new ArrayList<>();
          for(int i = 0; i<noArr.length; i++){
            for(String key : map.keySet()){
                 if(noArr[i].equals(key) ){
                    list.add(map.get(key));
                 }
            }
          }
    
          HashMap<Integer,String> map2 = new HashMap<>();
          map2.put(2, "double");
          map2.put(3, "triple");
          map2.put(4, "quadruple");
          map2.put(5, "quintuple");
    
          for(int i = 0; i<3; i++){
            
            int count = 1;
            int a = i+1;
            while(a < 3 && list.get(i) == list.get(a)){
              a++;
              count++;
            }
            if(count == 1){
              result1 += list.get(i) + " ";
            }else{
              i += count - 1;
              for(int key : map2.keySet()){
                if(count == key){
                 result1 += map2.get(key) + " " + list.get(i) + " ";
                }
              }
            }
          }
          
          for(int i = 3; i<7; i++){
            int count = 1;
            int a = i+1;
            while(a < 7 && list.get(i) == list.get(a)){
              a++;
              count++;
            }
            if(count == 1){
              result2 += list.get(i) + " ";
            }else{
              i += count - 1;
              for(int key : map2.keySet()){
                if(count == key){
                 result2 += map2.get(key) + " " + list.get(i) + " " ;
                }
              }
            }
          }
         
          for(int i = 7; i<11; i++){
            int count = 1;
            int a = i+1;
            //3 3 3
            while(a < 11 && list.get(i) == list.get(a)){
              a++;
              count++;
            }
           
            if(count == 1){
              result3 += list.get(i) + " ";
            }else{
              i += count - 1;
              for(int key : map2.keySet()){
                if(count == key){
                  result3 += map2.get(key) + " " + list.get(i) + " ";
                }
              }
            }
          }
              System.out.println(result1 + " - " + result2 + " - " + result3);
        }
    }
   


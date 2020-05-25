package com.company;

public class Dog {
    String name;
    int weight;
    String feed;
    public String feed(){
        if(weight > 0 & weight < 5){
            feed = "Мало корма понадобиться для этой малипуськи";
        }
        if(weight > 5 & weight < 10){
            feed = "Среднее количество корма";
        }
        if(weight<0){
            System.out.println("Увы,я не могу назвать это собакой");
        }
        else{
            feed = "Много корма понадобиться для такой массивной собачки";
        }
        return feed;
    }
}

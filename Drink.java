public class Drink{
private String name;
private String temperature;
private int sweetness;
private String type;

public Drink (String na, String temp, int sweet, String typ){
    name = na;
    temperature = temp;
    sweetness = sweet;
    type = typ;
    System.out.println("-" + na + " is a " + temp +" drink, have the sweetness of " + sweet +"%, and is a "+ typ +".");
}

public String getName(){
    return name;
}
public String getTemp(){
    return temperature;
}
public int getSweet(){
    return sweetness;
}
public String getType(){
    return type;
}
public void setName(String na){
    name = na;
}
public void setTemp(String temp){
    temperature = temp;
}
public void changeTemp(){
    temperature = "iced";
}   
public void setSweet(int sweet){
    sweetness = sweet;
}
public void changeSweet(){
    sweetness += 100;
}
public void setType(String typ){
    type = typ;
}
    
}


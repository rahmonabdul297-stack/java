package conditions;
public class index {
    // index class
String name;
 
    public static void Greet(String name) {
int currentHour = Time.getTime().hour();
System.out.println("currentHour:" + " " + currentHour);
        if(currentHour < 12 ){
       System.out.println("Good Morning"+" "+ name +"!");
        }else if(  currentHour == 12 || currentHour < 16 ){
      System.out.println("Good Afternoon"+" " + name +"!");
        }else if(currentHour == 16 || currentHour <= 20){
      System.out.println("Good Evening"+" " + name +"!");
        }else if(currentHour > 20){
          System.out.println("Good Night" + " " + name + "!");
        }
    }
}

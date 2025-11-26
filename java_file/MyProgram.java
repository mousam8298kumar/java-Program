package mypackage;
import java.util.*;
class MyProgram { 
int number;r
void display() { 
System.out.println("Number is: " + number);
}
public static void main(String[] args) { 
MyProgram obj = new MyProgram();
obj.number = 100;
obj.display();
}
}

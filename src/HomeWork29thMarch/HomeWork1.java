package HomeWork29thMarch;

class ifHomeWorkDemo{
    public static void main(String[] args){ // local variable
        int mark=20;
        if (mark>=10){
            System.out.println("fail");
        } }}

class IfHomWorkdemo1{
    static int pressure=100;
    public static void main(String[] args) { // static variable
        Uerdefine();
    }
    public static void Uerdefine(){
        if (pressure>=85){
            System.out.println("PASS");
        } else {
            System.out.println("fail");
        } }}



class ifHomeWorkDemo4{
    public static void main(String[] args){ // Nest if example, where the outer block condition is true
        String make="FORD";
        String mode= " model 1";
        if (make.equals("ford")) {
            System.out.println("car");
        }
        else {
            System.out.println("no car");
        } }}



        class IfElseIf{

public static void main(String[] args){ // this local variable
        int A= 20;

        if (A>=5){
        System.out.println("LOW"); // Condition 1
        }
        else if (A>=30){
        System.out.println("HIGH");// condition 2
        } else  if  (A>=20){
        System.out.println("RIGHT");
        } else{
        System.out.println("BLANK");// Condition3
        }
        }}


        class IfElseIf1{
static int A= 20;

public static void main(String[] args) {// this static variable;
    pop();
}
public static void pop(){


        if (A>=5){
        System.out.println("LOW"); // Condition 1
        }
        else if (A>=30){
        System.out.println("HIGH");// condition 2
        } else  if  (A>=20){
        System.out.println("RIGHT");
        } else{
        System.out.println("BLANK");// Condition3
        }
        }}


class IfElseIf2{
    int b = 20;

    public static void main(String[] args) {// this instant variable;
       IfElseIf2 obj = new IfElseIf2();
       obj.pop1();

    }
    public void pop1(){

        if (b>=5){
            System.out.println("LOW"); // Condition 1
        }
        else if (b>=30){
            System.out.println("HIGH");// condition 2
        } else  if  (b>=20){
            System.out.println("RIGHT"); } else{
            System.out.println("BLANK");// Condition3
        }
    }}
























class IfElseLogical{
    int b = 20;
//logical && AND
    public static void main(String[] args) {// this instant variable;
        IfElseLogical obj = new IfElseLogical();
        obj.pop1();

    }
    public void pop1(){

        if (b>=5&&b==5){
            System.out.println("LOW"); // Condition 1
        }
        else if (b<=10||b==20){
            System.out.println("HIGH");// condition 2
        } else  if  (b>=20&&b==40){
            System.out.println("RIGHT"); } else{
            System.out.println("BLANK");// Condition3
        }
    }}


class ForLoopDemo2 {

    public static void main(String[] args){ // for loop method
        for (int a=10;a<=15;a++){
            System.out.println(a);
        }
        for (int k=1;k<=6;k--);

    }
}

class WhileDemo2 {
    public static void main(String[] args){
        int s= 1;
        while (s<=7) {
            System.out.println(s);
            s++;// a few more of this example

        }}}

    class DoWhileDemo{
public static void main(String[] args){
        int s= 5;
        do{
        System.out.println(s);
        s++;
        }
        while (s<-100);

        }}

class DoWhileDemo1 {
    public static void main(String[] args) {
        int s = 10;
        int f = 20;
        do {
            System.out.println(s);
            s++;
        }
        while (s < -100);
        {
            System.out.println(f);
            f++;

        }
    }
}




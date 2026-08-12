

import java.util.Scanner;
public class Hehe {
   static int num =-1;

static Scanner sc = new Scanner(System.in);
static    int x;
  static  String arry []=new String[7];
  static  String c ;
    
public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x;
do {
System.out.println("what TASK ??");
System.out.println("1.Push website");
System.out.println("2.pop");
System.out.println("3.peek");
System.out.println("4.display");
System.out.println("5.Stack empty ??");
System.out.println("6.stack full??");
System.out.println("7.EXIT");
 x=sc.nextInt();

 switch (x) {
    case 1:
        
        System.out.println("paste link");
        c=sc.next();
        push(c);
        break;
        case 2 :
            pop();
 break;

 case 3:
    peek();
    break;
    case 4:
        dispay();
        break;
        case 5:
        isempty();
        break;
case 6 :
    isfull();
    break;
    case 7 :
        System.out.println("EXIT");
        break;
    default:
        break;
 }}

    


while (x!=7);
    sc.close();
}


static void push(String c)
{
num = num+1;
arry[num]= c;
System.out.println("we have pushed "+c);
}


static void pop ()
{
num = num-1;
}
static void peek() {
    if (num == -1) {
        System.out.println("Stack is empty");
    } else {
        System.out.println("this is the top element: " + arry[num]);
    }
}
static void dispay()
{

    for (int i=num;i>=0;i--){

        System.out.println(arry[i]);
    }

}
static void isempty()
{
if (num==-1){System.out.println("empty");}
else{System.out.println("not empty");}

}

static void isfull()
{
if (num>=6){System.out.println("out of memory");}
else {System.out.println("memory left");}

}

}

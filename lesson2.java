/*Java Operators */
// public class lesson2 {
//   public static void main(String[] args) {
//     int sum1 = 100 + 50;
//     int sum2 = sum1 + 250;
//     int sum3 = sum2 + sum2;
//     System.out.println(sum1);
//     System.out.println(sum2);
//     System.out.println(sum3);  
//   }
// }

// public class lesson2 {
//   public static void main(String[] args) {
//     int x =10;
//     ++x;
//     System.out.println(x);  
//   }
// }

// public class lesson2 {
//   public static void main(String[] args) {
//     int x =10;
//     --x;
//     System.out.println(x);  
//   }
// }


// public class lesson2 {
//   public static void main(String[] args) {
//     int x =10;
//     x += 5;
//     System.out.println(x);  
//   }
// }

// public class lesson2 {
//   public static void main(String[] args) {
//     int x = 10;
//     x *= 5;
//     System.out.println(x);  
//   }
// }


// public class lesson2 {
//   public static void main(String[] args) {
//     int x = 10;
//     x %= 4;
//     System.out.println(x);  
//   }
// }


/*Java Comparison Operators */
// public class lesson2 {
//   public static void main(String[] args) {
//     int x = 10;
//     int y = 7;
//     System.out.println(x <y);  
//   }
// } //Return "False" because x is higher than 7

/*Java Logical Operators */
/*Logical And: Return true if both statements are true */
// public class lesson2 {
//   public static void main(String[] args) {
//     int x = 10;
//     System.out.println(x<20 && x>5);  
//   }
// }   

/*Logical or: Return true if one of the statements is true */
// public class lesson2 {
//   public static void main(String[] args) {
//     int x = 10;
//     System.out.println(x<20 || x<5);  
//   }
// }   
 
/*Logical not:  Reverse the result, Return false if the result is true*/
//  public class lesson2 {
//   public static void main(String[] args) {
//     int x = 10;
//     System.out.println (!(x<20 && x>5));  
//   }
// }  

/*Java Strings */
// public class lesson2 {
//   public static void main(String[] args) {
//     String MyName = "Dung";
//     System.out.println (MyName);  
//   }
// }

/*String Length */
// public class lesson2 {
//   public static void main(String[] args) {
//     String Maxlength = "Hôm nay trời mưa";
//     System.out.println ("The string length is " + Maxlength.length());  
//   }
// }

/*More String Methods: toUpperCase() and toLowerCase() */
// public class lesson2 {
//   public static void main(String[] args) {
//     String test = "Hello World";
//     System.out.println (test.toLowerCase()); //Output is hello world
//     System.out.println (test.toUpperCase());  //Output is HELLO WORLD
//   }
// }

/*Finding a Character's position in a String */
// public class lesson2 {
//   public static void main(String[] args) {
//     String test = "Hello World";
//     System.out.println (test.indexOf("r"));
// }
// }

/*Java String Concatenation: Using + operator or concat() method */
// public class lesson2 {
//   public static void main(String[] args) {
//     String FirstName = "Nguyen ";
//     String LastName = "Dung";
//     System.out.println (FirstName.concat(LastName));
// }
// }


/*Java uses the + operator for both addition and concatenation. Numbers are added. Strings are concatenated. */
// public class lesson2 {
//   public static void main(String[] args) {
//     String x = "10";
//     int y = 20;
//     String z = x + y;
//     System.out.println (z);
// }
// }

/*Java Special Characters*/
// public class lesson2 {
//   public static void main(String[] args) {
//     String WeatherToday = "The weather of today is 'Rain'";
//     System.out.println (WeatherToday);
// }
// }


// public class lesson2 {
//   public static void main(String[] args) {
//     String test = "Hello\nWorld";
//     System.out.println (test);
// }
// }

/*Java Math */
/*Chỉ ra giá trị max trong 2 giá trị */
// public class lesson2 {
//   public static void main(String[] args) {
//     System.out.println (Math.max(50, 40));
// }
// }

/*Chỉ ra giá trị min trong 2 giá trị */
// public class lesson2 {
//   public static void main(String[] args) {
//     System.out.println (Math.min(50, 40));
// }
// }

/* Trả về giá trị căn bậc 2*/
// public class lesson2 {
//   public static void main(String[] args) {
//     System.out.println (Math.sqrt(60));
// }
// }

/*Trả về giá trị tuyệt đối */
// public class lesson2 {
//   public static void main(String[] args) {
//     System.out.println (Math.abs(-50));
// }
// }

/*Trả về 1 giá trị là số random giữa 0.0 và 1.0*/
// public class lesson2 {
//   public static void main(String[] args) {
//     System.out.println (Math.random());
// }
// }

/*TH muốn return 1 số random trong khoảng từ 0-1000 */
// public class lesson2 {
//   public static void main(String[] args) {
//     int randomNumber = (int)(Math.random()*1000);
//     System.out.println (randomNumber);
// }
// }


/*Java Booleans */
// public class lesson2 {
//   public static void main(String[] args) {
//     System.out.println (10 != 15);
// }
// }

// public class lesson2 {
//   public static void main(String[] args) {
//     int MyAge = 24;
//     int VoteAge = 18;
//     if (MyAge >= VoteAge) {
//         System.out.println ("The age is enough");
//     }
//     else{
//         System.out.println ("The age is not enough");
//     }
    
// }
// }


/*Java If ... Else */
// public class lesson2 {
//   public static void main(String[] args) {
//     int time = 15;
//     if (time > 18) {
//         System.out.println("Good Evening");
//     }
//     else if (time < 12) {
//         System.out.println("Good Morning");
//     }
//     else{
//         System.out.println("Good Afternoon");
//     }
//     }
//     }
    
/*Short hand if...else */
// public class lesson2 {
//   public static void main(String[] args) {
//     int time = 10;
//     String result = (time >12) ? "Good Afternoon" : "Good Morning";
//     System.out.println(result);
//     }
//     }

    /*Java Switch */
//     public class lesson2 {
// public static void main(String[] args) {
//     int day = 2;
//     switch (day) {
//         case 1:
//             System.out.println("Morning");
//             break;
//         case 2:
//             System.out.println("Afternoon");
//             break;
//         default:
//             System.out.println("Evening");
//     }
// }
// }

/*Java While Loop/ dowhile Loop */
// public class lesson2 {
// public static void main(String[] args){
//     int x = 2;
//     while (x < 6) {
//         System.out.println(x);
//         x++;
//     } 
//     }
// }

// public class lesson2 {
// public static void main(String[] args){
//     int x = 2;
//     do{
//         System.out.println(x);
//         x++;
//     }
//     while(x < 6);
//     } 
//     }

/*Java Arrays */
 public class lesson2 {
public static void main(String[] args){
    String [] mobile ={"Iphone", "Samsung", "Oppo"};
    mobile[0] = "Docomo";
    System.out.println(mobile.length);
    } 
    }
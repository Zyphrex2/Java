class HelloWorld {
    public static void main(String[] args) {




    // boolean a = true;
    // boolean b = false;
    
    // boolean c = (true && false);
    // // &&
    // // ||
    // // !
    // true && true -- > true
    // true && false --> false
    // false && true --> false
    // false && false --> false




    // true || true --> true
    // true || false --> true
    // false || true --> true
    // false || false --> false


    // !true --> false
    // !false --> true
    // int x = 0;
    // if (x!=0 && 10/x==5) {
    //     System.out.println("hello");
    // }


    // 1) !(a&&b) = !a || !b
    // A is true, b is true: false
    // a is true, b is false: true
    // b is true, a is false: true
    // a is false, b is false: true
   
    
    // 2) !(a||b) = !a && !b
    // a is true, b is true: false
    // a is true, b is false: false
    // a is false, b is true: false
    // a is false, b is false: true


    // !(x >= 0 && y < 0)
    // !(x>=0) || !(y<0)
    // (x<0) || (y >= 0)
    
    // !(x==0 && !(y==0))
    // !(x == 0) || !!(y==0)
    // x!=0 || y == 0
    
    // (!p && !q) || !(p || q)
    // a) always true
    // b) always false
    // c) true when p is false
    // d) true when q is false
    // e: false whenever p and q have opposite values
    
    // !p && !q




    // You visit the bakery. You want to get bread, but if they do not have bread, then you will also accept an apple turnover. Since apple turnovers are pretty dry, however, you only want the apple turnover if the bakery is also selling coffee that day. If the customer buys something, then print "dessert bought" onto the console
    
    // boolean hasBread = true;
    // boolean hasTurnovers = true;
    // boolean hasCoffee = true;
    
    // // Whether the bakery has bread, has apple turnovers, and has coffee
    
    // //if they have bread, then buy the bread
    // // else if has apple turnovers and they have cofee, then buy the apple turnovers and cofee
    
    // if (hasBread == true) {
    //     System.out.println("dessert bought");
    // }
    
    // else if (hasTurnovers == true && hasCoffee == true) {
    //     System.out.println("dessert bought");
    // }
    
    // if (hasBread == true || (hasTurnovers==true && hasCoffee == true)) {
    //     System.out.println("dessert bought");
    // }
    
    // if (hasBread || (hasTurnovers && hasCoffee)) {
    //     System.out.println("dessert bought");
    // }
    
    
    
    
    
    
    
    //(p && !q) || (p && q)
    
    // What is the output of each of the following statements? Assume that x = 5, y = 2, z = 10, and 
    // temp = 0
    
    int x = 5;
    int y = 2;
    int z = 10;


    //1.  
    // if (y >= x) {
    //   y = z;
    // }
    // System.out.println(x + "  " + y + "  " + z);
    
    // // 4.  
    // if (y >= x) {
    //   y = z;
    //   System.out.println(x + "  " + y + "  " + z);
    // }
    
    // //5.
    // if (x >= 6)
    //     System.out.println(x + y);
    // System.out.println(x + y);
    
    // //6.
    if (x + y > z)
      x = y + z;
    else
      x = y - z;
    System.out.println(x + "  " + y + "  " + z);
    }
}

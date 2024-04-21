class Pen{
    String color;
    String type;

public void write(){
    System.out.println("Writing something");
}

public void printcolor(String color){
         System.out.println(this.color);
 }
     public static void main(String[] args) {
         Pen pen1= new Pen();
         pen1.color="black";
         pen1.printcolor(pen1.color);
        // pen1.type("gel");
        
         pen1.type="gel";
         System.out.println((pen1.type));
        // pen1.write();

          Pen pen2=new Pen();
           pen2.color="black";
           pen2.type="ball point";
  
        //   pen1.printcolor();
           pen2.printcolor();
         }

     }
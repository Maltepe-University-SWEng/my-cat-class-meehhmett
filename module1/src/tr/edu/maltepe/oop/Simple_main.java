package tr.edu.maltepe.oop;
public  class Simple_main {

 public static void main(String []args){

     Cat cat1,cat2;

     cat1 = new Cat(3,4);
     cat2 = new Cat(5,4);

     cat1.Meow();
     cat2.Meow();

      // Use of some getters
     int cat1Age = cat1.getAge();
     int cat2Age = cat2.getAge();

     cat1.setName("cat1111");
     String getnamecat1 = cat1.getName();
     System.out.print(getnamecat1);
     cat1.printCatName();
     //Setterss
     cat1.setAge(5);

    }
}



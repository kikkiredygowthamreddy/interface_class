interface a{
      int age = 3;
      String name = "lenn";
    void ketrich();
      void slabon();
}
class b implements a{
  public void ketrich()
    {
           System.out.println("on running");
      }
      public void slabon()
      {
           System.out.println("to set value");
      }
}
public class good{
      public static void main (String args[]){
       a obj; 
     obj = new b();
     obj.ketrich();
     obj.slabon();
     System.out.println(a.name);
      }
}
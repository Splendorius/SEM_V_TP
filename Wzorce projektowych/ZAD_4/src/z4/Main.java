//* Zadanie 4. Stwórz hierarchię klas oraz odpowiadającą tej hierarchii
//  strukturę klas realizujących wzorzec abstract factory.

package z4;
public class Main {
  
  static App configPL() {
    App app;
    AbsFactory absfactory;
    absfactory=new PLFactoryConcrete();
    app=new App (absfactory);
    return app;
  }

  static App configUS() {
    App app;
    AbsFactory absfactory;
    absfactory=new NAFactoryConcrete();
    app=new App (absfactory);
    return app;
  } 
  
  public static void main(String[] args) {
  
    App app1 = configPL();
    app1.write();
    
     App app2 = configUS();
      app2.write();
    
  }

}

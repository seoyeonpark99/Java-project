package Week03.project;



public class Menu {

   String name; // 이름
   String explain; // 설명

   public Menu() {
   }

   public Menu(String name, String explain) {
      this.name = name;
      this.explain = explain;

   }

   public void output() {
      System.out.printf("%-15s | %s\n", name, explain);
   }


}


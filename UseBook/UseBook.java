public class UseBook {
  public static void main(String[] args) {
      Fiction novel = new Fiction("Twitch Chat");
      NonFiction manual = new NonFiction("How to Fix a Leak");

      System.out.println("Fiction " + novel.getTitle() +
       " costs $" + novel.getPrice());

       System.out.println("Fiction " + manual.getTitle() +
        " costs $" + manual.getPrice());

      
  }
}

import java.util.List;
import java.util.ArrayList;

public class Bag {
   private List <Item> items;
   
   public Bag() 
   {
      items = new ArrayList <Item>();
   }

   private static class Item
   {
      private String name;
      private int quantity;
      
      public Item(String itemName)
      {
         name = itemName;
         quantity = 1;
      }
      
      public void count()
      {
         quantity++;
      }
      
      public int getQuantity()
      {
         return quantity;
      }
   }
   
   public void add(String itemName)
   {
      int flag = 0;
      for(Item item:items)
      {
         if(item.name.equals(itemName))
         {
            item.count();
            flag = 1;
         }
      }
      if(flag == 0)
         items.add(new Item(itemName));
   }
   
   public int count(String itemName)
   {
      for(Item item:items)
      {
         if(item.name.equals(itemName))
         {
            return item.getQuantity();
         }
      }
      return 0;
   }
}
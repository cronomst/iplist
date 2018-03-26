import java.net.InetAddress;

public class IPList
{
   public static void main(String args[])
   {
      try {
         for (InetAddress addr : InetAddress.getAllByName(args[0])) {
            System.out.println(addr.getHostAddress());
         }
      } catch (Exception e) {
         System.err.println(e);
      }
   }
}

public class days
{
public static void main(String[] args)
{
int d= (Integer.parseInt(args[2])-1970)*365+(Integer.parseInt(args[1])-1)*30+Integer.parseInt(args[0]);
System.out.println("days "+d);
}
}
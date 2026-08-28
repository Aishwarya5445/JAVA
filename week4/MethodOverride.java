class Sunset 
{
void glow() 
{
System.out.println("Sunset paints the sky");
}
}
class Ocean extends Sunset
 {
@Override
void glow() 
{
System.out.println("Ocean shimmers under the sunset");
}
}
public class MethodOverride
 {
public static void main(String[] args) 
{
Sunset s = new Ocean();
s.glow(); 
}
}

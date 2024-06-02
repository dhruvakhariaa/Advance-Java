// Enums in java
enum Color 
    {
        RED("Color is red"), GREEN("Color is green"), BLUE("Color is blue");

        private String value;

        Color(String value)
        {
            this.value = value;
        }

        public String getValue()
        {
            return value;
        }
    }
public class Enums 
{
    public static void main(String[] args) 
    {
        Color c = Color.RED;

        System.out.println(c.getValue());
        System.out.println(c.name());

        for(Color color : Color.values())
        {
            System.out.println(color.getValue());
        }
    }
}

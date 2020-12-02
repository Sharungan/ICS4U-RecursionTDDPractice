package RecursionTDD;

public class Group1{
  
  public static int triangle (int intRows) {
    
    if (intRows == 0) {
      return 0;
    } else {
      return 1 + triangle(intRows-1);
    }
  }
}

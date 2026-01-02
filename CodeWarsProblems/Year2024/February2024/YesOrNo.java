class YesOrNo
{
  /*
Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
  
  */
    public static void main(String [] args){
        System.out.println(boolToWord(true));
    }
  public static String boolToWord(boolean b)
  {
    //Create a conditional to check the boolean value of b. If b is True then return yes and if it is false return no
    if (b == true){
    return "Yes";
    }else
    return "No";
    
  }
  
}

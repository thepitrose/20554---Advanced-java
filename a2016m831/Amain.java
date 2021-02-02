package a2016m831;

public class Amain {
    public static void main (String [] args) throws Throwable {
        //TextCode title=new TextCode("title1");
        //Code code = title;
        //System.out.println(code);
        
        Code c1=new Code(5);
        TextCode c2 = new TextCode(7,"xxx");
        
        
        //c1=c2;
       // System.out.println(c1.getText());
        
        //c2=c1;
        //System.out.println(c2.toString());
        
        Code c111=new Code(5);
        Code c233=new Code(5);
        Code c12=new Code(5);
        Code c13=new Code(5);
        Code c14=new Code(5);
        Code c133=new Code(5);
        
        
        
        /*
        TextCode c2433 = new TextCode(7,"xxx");
        TextCode c23a3 = new TextCode(7,"xxx");
        TextCode c2f33 = new TextCode(7,"xxx");
        TextCode c2b33 = new TextCode(7,"xxx");
        TextCode c2a33 = new TextCode(7,"xxx");
        TextCode c232233 = new TextCode(7,"xxx");
      */  
        c1.finalize();
        
        System.out.println(Code.getCodeCount());
    }

}

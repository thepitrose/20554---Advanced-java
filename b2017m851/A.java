package b2017m851;

public class A {
    private int num = 0;
    public A(int n) {
        num=n;
    }
    public boolean equals (Object obj){
        num++;
        A a = (A)  obj;
        return a.num == (num-1);
    }
    public boolean eq(A a) {
        return super.equals(a);
    }
    public static void main (String [] args) {
        A a1= new A(2);
        A a2= new A(2);
        Object a3 = a1;
        //System.out.println(a1.equals(null));
        //System.out.println(a1.equals(a2));
        //System.out.println(a3.equals(a3));
        //System.out.println(a2.eq(a2));
        //System.out.println(a1.eq(a3));
    }
}

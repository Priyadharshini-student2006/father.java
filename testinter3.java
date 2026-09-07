interface inter3{
void div(int a,int b);
}
interface inter4 extends inter3{
int max_mark=100;//value cant be changed as it public static final
void mul(int a,int b);
}
class testinter4 implements inter4{
public void div(int a,int b){
System.out.println(a/b);
}
public void mul(int a,int b){
System.out.println(a*b);
}
public static void main(String[] ar){
inter4 i4=new testinter4();
i4.mul(12,2);
i4.div(12,2);
}
}


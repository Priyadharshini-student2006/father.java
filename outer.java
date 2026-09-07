//nested class or inner classes -class within a class
class outer{

 void createinner(){
inner i1=new inner();
i1.add(12,23);
}
         class inner{
         void add(int a,int b){
         System.out.println(a+b);
         }
         }
public static void main(String[] ar){
outer o=new outer();
o.createinner();
}
}
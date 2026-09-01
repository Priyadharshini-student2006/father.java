class testoverload{

 void add(int a){

 a++;//a=a+1
 System.out.println(a);
}

void add(int a,int b){

System.out.println(a+b);
}
public static void main(String[]ar){
testoverload t=new testoverload();
t.add(100);
t.add(1,2);
}
}
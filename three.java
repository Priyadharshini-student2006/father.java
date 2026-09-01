class two{

//to add two numbers -static method with void return no value

static void add(int a,int b){
//this method is void so will not return any value to main
System.out.println(a+b);

}
static int add1(int a,int b){
//this method is returning an int value
return a+b;
}
    public static void main(String[]ar){
    add(12,23);
    two.add(1,2);
    int sum=add1(10,20);
System.out.println("sum is;"+sum);
}
}
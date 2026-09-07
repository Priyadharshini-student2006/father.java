class calculatortest{
static{
System.out.println("S.Priyadharshini")
public static void main(String[] ar){
 calculator c=new Calculator();
//add method test
/*
:TC01 (Positive): Input: 5.0, 3.0 | Expected: 8.0
* TC02 (Negative): Input: -5.0, -3.0 | Expected: -8.0
* TC03 (Zero): Input: 0.0, 5.5 | Expected: 5.5
*/
int result expected=8.0;
int sum=c.add(5.0,3.0);
if(result expected==sum){
System.out.println("test case 2 for add() is pass");
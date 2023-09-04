
class Pattern
{
public void patternPrint9(int n)
{
for(int i=1;i<=2*n-1;i++)
{
int star=i;
if(i>n)
{
star=2*n-i;
}
for(int j=1;j<=star;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
public static void main(String []args)
{
new Pattern().patternPrint9(5);
}
}
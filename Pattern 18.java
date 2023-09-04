
class Pattern
{
public void patternPrint18()
{
for(int i=0;i<5;i++)
{
char print='E';
for(int j=0;j<=i;j++)
{
System.out.print(print+" ");
print=(char)(70-j);
}
System.out.println();
}
}
public static void main(String []args)
{
new Pattern().patternPrint18();
}
}
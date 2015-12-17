package nov7practice;

class Result
{
int marks=65;
void getdetail()
{
System.out.println(marks);
if (marks>=80)
System.out.println("student got Merit");
else if (marks>=70 && marks<80)
System.out.println("student got First division");
else 
System.out.println("student is fail");
}
public static void main(String[]args){

Result getmarks= new Result();
getmarks.getdetail();

}

}
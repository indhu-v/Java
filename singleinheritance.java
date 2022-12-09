import java.io.*;
import java.lang.*;
import java.util.*;
class one{
public void print_geek()
{
System.out.println("geeks");
}
}
class two extends one{
public void print_for()
{
System.out.println("for");
}
}
public class singleinheritance{
public static void main(String args[])
{
two g=new two();
g.print_geek();
g.print_for();
g.print_geek();
}
}
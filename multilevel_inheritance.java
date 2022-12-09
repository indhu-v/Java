import java.io.*;
import java.util.*;
import java.lang.*;
class one
{
public void print_geek()
{
System.out.println("geeks");
}
}
class two extends one
{
public void print_for()
{
System.out.println("for");
}
}
class three extends two
{
public void print_geek()
{
System.out.println("geeks");
}
}
public class multilevel_inheritance
{
public static void main(String[]args)
{
three g= new three();
g.print_geek();
g.print_for();
g.print_geek();
}
}
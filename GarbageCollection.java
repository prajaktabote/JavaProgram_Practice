//how to perform Garbage collection in java program
import java.util.*;
class GarbageCollection
{
    public static void main(String args[])
    {
        Runtime rs=Runtime.getRuntime();
        System.out.println("Free memory in JVM before garbage collection"+rs.freeMemory());
        rs.gc();
        System.out.println("free memory in jvm after garbage Collection" +rs.freeMemory());
    }
}
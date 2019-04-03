package appstore.xianchuang.com.javatoc;

public class JNI {
    static {
        System.loadLibrary("passparam");
    }
    //传递int类型数据
    public native  int add(int x,int y);
    //传递String类型数据
    public native String sayHelloInC(String s);
    //传递int[]类型数据
    public native int [ ] arrElementsIncrease(int [ ] intArray);
}

package course;

/*
@Author: kun
@Date Created in 2022-10-31 14:53 
*/
public class Example01 {
    public static void main(String[] args) {
        //创建一个空字符串
        String str1 = new String();
        //创建一个内容为“abcd”的字符串
        String str2 = new String("abcd");
        //创建一个字符数组
        char[] charArray = new char[]{'D', 'E', 'F'};
        String str3 = new String(charArray);
        //创建一个字节数组
        byte[] arr = {97, 98, 99};
        String str4 = new String(arr);
        System.out.println("a" + str1 + "b");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}

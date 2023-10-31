package mao;

import java.util.Map;

/**
 * Project name(项目名称)：JDK9_quickly_create_read_only_collection
 * Package(包名): mao
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/31
 * Time(创建时间)： 16:36
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test3
{
    public static void main(String[] args)
    {
        Map<String, String> map = Map.of("a1", "b1", "a2", "b2", "a3", "b3");
        System.out.println(map);
    }
}

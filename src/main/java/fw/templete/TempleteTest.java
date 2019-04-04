package fw.templete;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 14:26
 * @Description:
 */
public class TempleteTest {

    public static void main(String[] args) {

        DefaultInvertPro defaultInvertPro=new DefaultInvertPro();
        defaultInvertPro.Run();

        System.out.println("-----------------------------------");
        ReCreateInvertPro reCreateInvertPro=new ReCreateInvertPro();
        reCreateInvertPro.Run();
    }
}

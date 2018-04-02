
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by 没想法的岁月 on 2018/4/2.
 */
public class sevenday {
    public static void main(String[] args) {
        //获取calendar 对象
        Calendar calendar  = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        //calendar 转化为data对象
        Date d = calendar.getTime();
        //设置自定义的格式
        String pattern ="yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat diy  = new SimpleDateFormat();
        diy.applyPattern(pattern);
        //设置格式
//        DateFormat dateFormat =DateFormat.getTimeInstance();
        String time = diy.format(d);
        System.out.println(time);

    }
}

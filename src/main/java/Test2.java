import com.google.common.collect.Lists;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

    static List<String> list = new ArrayList<>();

    Map<String,String> map = new HashMap<>();

    public static void main(String[] args) {
        String s = "aqsuhi  <a href='www.baidu.com'>baidu</a> hahahhah";
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

        /*Pattern p_script=Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
        Matcher m_script=p_script.matcher(s);
        s=m_script.replaceAll(""); //过滤script标签

        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
        Matcher m_style=p_style.matcher(s);
        s=m_style.replaceAll(""); //过滤style标签 */

        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
        Matcher m_html=p_html.matcher(s);
        s=m_html.replaceAll(""); //过滤html标签
        //s = s.replaceAll("<a>.</a>","");
        System.out.println(s);
    }
}

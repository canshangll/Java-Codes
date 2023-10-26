package org.example.filter;

import org.owasp.validator.html.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XssRequestWrapper extends HttpServletRequestWrapper {

    //获得antisamy框架所需的决策文件路径
    public static String antisamyPath = XssRequestWrapper.class.getClassLoader().getResource("antisamy-test.xml").getFile();

    public XssRequestWrapper(HttpServletRequest request) {
        super(request);

    }

    public static Policy policy = null;

    static {
        try {
            //过滤策略对象
            policy = Policy.getInstance(antisamyPath);
        } catch (PolicyException e) {
            throw new RuntimeException(e);
        }
    }

    //通过AntiSamy框架过滤字符
    public String cleanXss(String text) {
        AntiSamy antiSamy = new AntiSamy();
        CleanResults cleanResults = null;
        try {
            cleanResults = antiSamy.scan(text, policy);
            text = cleanResults.getCleanHTML();
        } catch (ScanException e) {
            throw new RuntimeException(e);
        } catch (PolicyException e) {
            throw new RuntimeException(e);
        }
        return text;
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] parameterValues = super.getParameterValues(name);
        if (parameterValues == null) {
            return null;
        }
        int length = parameterValues.length;
        String[] newArray = new String[length];
        for (int i = 0; i < newArray.length; i++) {
            String parameterValue = parameterValues[i];//<script></script>
            parameterValue = cleanXss(parameterValue);
            newArray[i] = parameterValue;
        }

        return newArray;
    }
}

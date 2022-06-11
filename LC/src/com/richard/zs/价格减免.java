package com.richard.zs;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class 价格减免 {
//    public String discountPrices(String sentence, int discount) {
//        StringBuilder sb = new StringBuilder();
//        String[] strings = sentence.split(" ");
//        for (int i=0; i<strings.length; i++) {
//            String s = strings[i];
//            StringBuilder sb1 = new StringBuilder();
//            int n = s.length();
//            Map<Character, Integer> map = new HashMap<>();
//            for (int j=0; j<s.length(); j++) {
//                char c = s.charAt(j);
//                map.put(c, map.getOrDefault(c,0)+1);
//            }
//            if (s.charAt(0)=='$' && map.get('$')==1) {
//                sb1.append('$');
//                if (n==1) {
//                    sb.append(sb1);
//                    if (i!=n-1) {
//                        sb.append(" ");
//                    }
//                    continue;
//                }
//                double x = Double.parseDouble(s.substring(1, n));
//                double jl = (100 - discount) / 100.0;
//                x = 1.0 * x * jl;
//                if (discount == 100) {
//                    x = 0;
//                }
//                DecimalFormat df = new DecimalFormat("0.00");
//                df.setRoundingMode(RoundingMode.HALF_UP);
//                sb1.append(df.format(x));
//                sb.append(sb1);
//            } else if (s.charAt(0)=='$' && s.charAt(1)=='$'){
//                sb.append('$').append('$');
//            } else {
//                sb.append(s);
//            }
//            if (i!=n-1) {
//                sb.append(" ");
//            }
//        }
//        return sb.toString();
//    }
    public String discountPrices(String sentence, int discount) {
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            // 每次开头都拼接空格  最后删除头空格即可
            sb.append(" ");
            // 如果开头是$
            if (s.startsWith("$")) {
                int n = s.length();
                boolean ok = true;
                for (int i=1; i<n; i++) {
                    // 是$判断之后是否有非数字的字符  有的话那么直接拼接
                    if (!Character.isDigit(s.charAt(i))) {
                        ok = false;
                        break;
                    }
                }
                // 直接 拼接    如果长度为1也直接拼接
                if (!ok || n==1) {
                    sb.append(s);
                    continue;
                }
                long num = Long.parseLong(s.substring(1));
                Double d = num * (double) (100-discount)/100;
                sb.append('$').append(String.format("%.2f", d));
            } else { // 开头不是$直接拼接
                sb.append(s);
            }
        }
        return sb.substring(1);
    }
}

package br.com.findfer.findfer.extras;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by infsolution on 09/10/17.
 */

public class DataUrl {
    private static final Pattern PATTERN = Pattern.compile("__w-((?:-?\\d+)+)__");
    public static String getUrlCostom(String url, int width){
        Matcher m = PATTERN.matcher(url);
        int bestBucket = 0;
        if(m.find()){
            String[] found = m.group(1).split("-");
            for(String bucketStr : found){
                bestBucket = Integer.parseInt(bucketStr);
                if(bestBucket >= width){
                    break;
                }
            }
            if(bestBucket>0){
                url = m.replaceFirst("w"+bestBucket);
            }else{
                url = m.replaceFirst(("w"+found[found.length-1]));
            }
        }
        return url;
    }
}

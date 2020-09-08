/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.horvat.utility;

import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *NASTAVAK RADA NA 66:02 BIT CE JOS 2 COMMITA 
 * 
 * @author Josip
 */
public class GeneratorOiba {

    public static String getOib() {
        try {
            String html = new Scanner(new URL("http://oib.itcentrala.com/oib-generator/").openStream(), "UTF-8").useDelimiter("\\A").next();

            Document document = Jsoup.parse(html);

            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(document).get();

        } catch (Exception e) {
            return null;
        }
    }

}

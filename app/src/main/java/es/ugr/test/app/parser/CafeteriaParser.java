package es.ugr.test.app.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.jsoup.Jsoup.connect;


/**
 * Created by josecolella on 17/03/2014.
 */
public class CafeteriaParser {

    private Map menu;
    private String title;
    private String urlToParse;
    private Document document;

    /**
     *
     * @param urlToParse
     * @throws IOException
     */
    public CafeteriaParser(String urlToParse) throws IOException {
        this.urlToParse = urlToParse;
        this.document = connect(this.urlToParse).get();
        this.title = this.document.title();
        this.menu = new HashMap();
    }

    /**
     *
     * @return
     */
    public String getUrlToParse() {
        return urlToParse;
    }


    /**
     *
     * @return
     */
    public List<String> parseMenuInfo() {

        List<String> days = new ArrayList<String>();
//        List<String> food = new ArrayList<String>();
//        Elements divElements = this.document.getElementsByTag("div");
//        for (Element element: divElements) {
//            if ("plato".equals(element.id())) {
//                days.add(element.child(0).text());
//                if ("platos".equals(element.child(1).id())) {
//                    for (Element child : element.child(1).children()) {
//                        food.add(child.text());
//                    }
//                    ArrayList<String> tmpFood = new ArrayList<String>(food);
//                    this.menu.put((String) element.child(0).text(), tmpFood);
//
//                }
//                food.clear();
//            }
//        }

        return days;

    }

    public Object[] getDays() {
        return this.menu.keySet().toArray();
    }

}

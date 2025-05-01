package homework.playground.runners;

import homework.playground.essence.creatures.*;
import homework.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor processor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");

        Vertebrate vertebrateCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");

        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");

        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        processor.runCrawlable(crawlableCrocodile);
        processor.runCrawlable(crawlableBeetle);

        // processor.runCrawlable(vertebrateCrocodile); // не реализует интерфейс Crawlable
        // processor.runCrawlable(insectBeetle); // не реализует интерфейс Crawlable

        processor.runCrawlable(aCrocodile);
        processor.runCrawlable(aBeetle);

        // processor.runCrawlable(anonymousCrawlable); // У анонимных классов нет собственного имени класса

        // Вызовы с direction
        processor.runCrawlable(crawlableBeetle, "никуда");
        processor.runCrawlable(aCrocodile, "налево");

        // Вызов с direction и distance
        processor.runCrawlable(aBeetle, "назад", 37);

        // Вызов с анонимным Crawlable прямо в скобках
        processor.runCrawlable(new Crawlable() {
            String name = "Nowhere";
            String className = "AnonymousCrawlable";

            public void crawl(String direction, int distance) {
                System.out.printf(
                        "I am %s, my name is %s and I am crawling to %s for %d units%n",
                        className, name, direction, distance
                );
            }
        }, "вниз", 37);
    }
}

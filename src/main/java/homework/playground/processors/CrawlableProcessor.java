package homework.playground.processors;

import homework.playground.essence.creatures.Crawlable;
import homework.playground.utils.DirectionGenerator;
import homework.playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        String direction = DirectionGenerator.generateDirection();
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, distance);
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, distance);
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}

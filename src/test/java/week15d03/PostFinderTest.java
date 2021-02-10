package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class PostFinderTest {

    @Test
    void findPostsFor() {
        List<Post> postList = new ArrayList<>();
        postList.add(new Post("xxx", LocalDate.of(2020, 10, 11), "Test1", "John Doe"));
        postList.add(new Post("AAA", LocalDate.of(2020, 11, 11), "Test1", "Jack Doe"));
        postList.add(new Post("BBB", LocalDate.of(2021, 01, 11), "Test1", "John Doe"));
        postList.add(new Post("CCC", LocalDate.of(2021, 01, 11), "Test1", "Jack Doe"));
        postList.add(new Post("DDD", LocalDate.of(2021, 01, 11), "Test1", "John Doe"));

        PostFinder postFinder = new PostFinder(postList);
        List<Post> result = postFinder.findPostsFor("John Doe");
        result.forEach(System.out::println);

    }
}
package week15d03;

import java.util.List;
import java.util.stream.Collectors;

public class PostFinder {

    List<Post> postList;

    public PostFinder(List<Post> postList) {
        if (postList == null){
            throw new IllegalArgumentException("invalid list!!!");
        }
        this.postList = postList;
    }

    public List<Post> findPostsFor(String user) {
        return postList.stream().filter(p -> p.getOwner().equals(user)).collect(Collectors.toList());
    }

}

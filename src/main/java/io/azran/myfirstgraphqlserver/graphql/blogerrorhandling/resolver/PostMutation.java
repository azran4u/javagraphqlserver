package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.resolver;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Post;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service.PostService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PostMutation implements GraphQLMutationResolver {

    @Autowired
    private PostService postService;

    public Post addPost(String title, String text, String category, String authorId) {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(authorId);
        postService.savePost(post);
        return post;
    }
}

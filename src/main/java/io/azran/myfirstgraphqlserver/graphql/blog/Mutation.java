package io.azran.myfirstgraphqlserver.graphql.blog;

import java.util.UUID;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private PostDao postDao;

    public Post addPost(String title, String text, String category, String authorId) {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(authorId);
        postDao.savePost(post);
        return post;
    }
}

package org.springblogapp.blogapp.service;

import org.springblogapp.blogapp.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}

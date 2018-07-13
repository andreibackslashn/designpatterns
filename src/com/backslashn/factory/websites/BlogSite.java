package com.backslashn.factory.websites;

import com.backslashn.factory.WebSite;
import com.backslashn.factory.pages.AboutPage;
import com.backslashn.factory.pages.CommentsPage;
import com.backslashn.factory.pages.ContactPage;
import com.backslashn.factory.pages.PostPage;

public class BlogSite extends WebSite {
    @Override
    public void createWebsite() {
        getPages().add(new PostPage());
        getPages().add(new CommentsPage());
        getPages().add(new AboutPage());
        getPages().add(new ContactPage());
    }
}

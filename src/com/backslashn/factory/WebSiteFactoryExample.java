package com.backslashn.factory;

import static com.backslashn.factory.WebSiteType.*;

public class WebSiteFactoryExample {
    public static void main(String[] args) {

        WebSite blog = WebSiteFactory.getInstance(BLOG);
        WebSite shop = WebSiteFactory.getInstance(WEBSHOP);

        for (Page page:blog.getPages()) {
            System.out.println("Blog pages: " + page );
        }

        for (Page page:shop.getPages()) {
            System.out.println("Shop pages: " + page );
        }

    }
}

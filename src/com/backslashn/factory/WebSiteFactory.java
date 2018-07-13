package com.backslashn.factory;

import com.backslashn.factory.websites.BlogSite;
import com.backslashn.factory.websites.WebShopSite;

public class WebSiteFactory {

    //static
    public static WebSite getInstance(WebSiteType webSiteType) {

        switch (webSiteType) {
            case BLOG: {
                return new BlogSite();
            }
            case WEBSHOP: {
                return new WebShopSite();
            }
            default: {
                return null;
            }
        }
    }
}

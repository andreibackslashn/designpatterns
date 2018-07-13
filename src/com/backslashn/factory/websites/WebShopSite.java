package com.backslashn.factory.websites;

import com.backslashn.factory.WebSite;
import com.backslashn.factory.pages.CartPage;
import com.backslashn.factory.pages.ItemPage;
import com.backslashn.factory.pages.SearchPage;

public class WebShopSite extends WebSite {
    @Override
    public void createWebsite() {
        getPages().add(new SearchPage());
        getPages().add( new ItemPage());
        getPages().add( new CartPage());
    }
}

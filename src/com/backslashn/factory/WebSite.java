package com.backslashn.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {

    List<Page> pages = new ArrayList();

    public List<Page> getPages() {
        return pages;
    }

    public WebSite(){
    //defer creation to the abstract factory method
    this.createWebsite();
    }
    //factory method will be implemented in subclasses(in case Website  = abstract classes) or in classes that implement the interface (in case WebSite = interface)
    public abstract void createWebsite();
}

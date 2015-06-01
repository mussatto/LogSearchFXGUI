package com.curupira;

import griffon.core.artifact.GriffonController;
import griffon.metadata.ArtifactProviderFor;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonController;

import griffon.transform.Threading;

@ArtifactProviderFor(GriffonController.class)
public class LogSearchFXGUIController extends AbstractGriffonController {
    private LogSearchFXGUIModel model;

    public void setModel(LogSearchFXGUIModel model) {
        this.model = model;
    }

    //@Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    //public void click() {
    //    int count = Integer.parseInt(model.getClickCount());
    //    model.setClickCount(String.valueOf(count + 1));
    //}

    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    public void clickSearch() {
        String query = model.getSearchQuery().toString();

        model.setSearchResult("searched");
    }
}
package com.curupira;

import griffon.core.artifact.GriffonModel;
import griffon.metadata.ArtifactProviderFor;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonModel;

import javax.annotation.Nonnull;

@ArtifactProviderFor(GriffonModel.class)
public class LogSearchFXGUIModel extends AbstractGriffonModel {

    private StringProperty searchQuery;

    private StringProperty filePath;

    private StringProperty indexPath;

    private BooleanProperty isInMemory;

    private StringProperty searchResult;


    @Nonnull
    public final StringProperty searchQueryProperty(){
        if (searchQuery == null) {
            searchQuery = new SimpleStringProperty(this, "searchQuery", "");
        }
        return searchQuery;
    }

    @Nonnull
    public final StringProperty filePathProperty(){
        if (filePath == null) {
            filePath = new SimpleStringProperty(this, "filePath", "");
        }
        return filePath;
    }

    @Nonnull
    public final StringProperty indexPathProperty(){
        if (indexPath == null) {
            indexPath = new SimpleStringProperty(this, "indexPath", "");
        }
        return indexPath;
    }

    @Nonnull
    public final BooleanProperty isInMemoryProperty(){
        if(isInMemory==null){
            isInMemory = new SimpleBooleanProperty(false);
        }

        return isInMemory;
    }

    @Nonnull
    public final StringProperty searchResultProperty(){
        if(searchResult==null){
            searchResult = new SimpleStringProperty(this, "searchResult", "");
        }

        return searchResult;
    }

    public String getSearchQuery() {
        return searchQuery.get();
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery.set(searchQuery);
    }

    public String getFilePath() {
        return filePath.get();
    }

    public void setFilePath(String filePath) {
        this.filePath.set(filePath);
    }

    public String getIndexPath() {
        return indexPath.get();
    }

    public void setIndexPath(String indexPath) {
        this.indexPath.set(indexPath);
    }

    public boolean getIsInMemory() {
        return isInMemory.get();
    }

    public void setIsInMemory(boolean isInMemory) {
        this.isInMemory.set(isInMemory);
    }

    public String getSearchResult() {
        return searchResult.get();
    }

    public void setSearchResult(String searchResult) {
        this.searchResult.set(searchResult);
    }
}
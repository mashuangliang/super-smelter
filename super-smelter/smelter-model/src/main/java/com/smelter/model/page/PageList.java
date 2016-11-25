package com.smelter.model.page;

import java.io.Serializable;

public interface PageList<T extends Serializable> extends WrapperList<T>, Serializable {
    boolean isMiddlePage();

    boolean isLastPage();

    boolean isNextPageAvailable();

    boolean isPreviousPageAvailable();

    int getPageSize();

    void setPageSize(int var1);

    int getIndex();

    void setIndex(int var1);

    int getTotalItem();

    void setTotalItem(int var1);

    int getTotalPage();

    int getStartRow();

    int getEndRow();

    int getNextPage();

    int getPreviousPage();

    boolean isFirstPage();

    boolean isEmpty();
}

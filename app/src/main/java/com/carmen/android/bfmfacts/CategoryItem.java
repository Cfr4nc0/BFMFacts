package com.carmen.android.bfmfacts;

public class CategoryItem {

    String categoryText;
    int categoryImage;

    public CategoryItem(String categoryText, int categoryImage) {
      this.categoryText = categoryText;
      this.categoryImage = categoryImage;
    }
    public String getCategoryText(){
        return categoryText;
    }

    public int getCategoryImage() {
        return categoryImage;
    }
}

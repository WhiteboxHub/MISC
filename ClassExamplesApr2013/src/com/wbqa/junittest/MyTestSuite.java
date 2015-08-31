package com.wbqa.junittest;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(value=Categories.class)
@IncludeCategory(BrokenTests.class)
@Suite.SuiteClasses({TestArrayExamples.class,TestStringExamples.class})
public class MyTestSuite {

}

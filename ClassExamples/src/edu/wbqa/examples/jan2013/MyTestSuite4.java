package edu.wbqa.examples.jan2013;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(BrokenTests.class)
@SuiteClasses ({TestArrayExamples4.class,TestStringExamples3.class,TestArrayExamples3.class})
public class MyTestSuite4 {

}

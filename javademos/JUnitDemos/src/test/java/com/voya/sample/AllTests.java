package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.voya.testcases.CalulatorTest;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.voya.testcases"})
//@IncludePackages({"com.voya.testcases.trail"})
//@ExcludePackages({"com.voya.testcases.trail"})
//@SelectClasses({CalulatorTest.class})
//@IncludeTags({"First","simple","neg"})

public class AllTests {

}

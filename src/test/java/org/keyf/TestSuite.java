package org.keyf;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.keyf")
@IncludeTags("calc")
public class TestSuite {
}

package com.gammel.esuite.projectmanagement;

import com.gammel.esuite.projectmanagement.client.ProjectManagementTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class ProjectManagementSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for ProjectManagement");
    suite.addTestSuite(ProjectManagementTest.class);
    return suite;
  }
}

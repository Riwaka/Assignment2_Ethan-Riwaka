package com.example.sd6501;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class ProfileSettingsTest {

    @Rule
    public ActivityTestRule<ProfileSettings> activityTestRule = new ActivityTestRule<>(ProfileSettings.class);
    ProfileSettings profileSettings;

    @Before
    public void setUp() throws Exception {
        profileSettings = activityTestRule.getActivity();
    }

    @Test
    public void testingTheHomeButton() {
        onView(withId(R.id.logout)).perform(click());
        onView(withId(R.id.mostPopularGridView)).check(matches(isDisplayed()));
    }

    @After
    public void tearDown() throws Exception {
        profileSettings=null;
    }


}
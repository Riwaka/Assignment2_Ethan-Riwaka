package com.example.sd6501;

import android.app.Activity;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.junit.Assert.*;

public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
    mainActivity = activityTestRule.getActivity();
    }

    @Test
    public void actionBarLoginTest() {
        //Add to constraints about the problems encountered
        openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext());
        onView(withText("Login")).perform(click());
    }

    @Test
    public void actionBarSignUpTest() {
        openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext());
        onView(withText("Sign Up")).perform(click());
    }

    @Test
    public void actionBarSettingsTest() {
        openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext());
        onView(withText("Settings")).perform(click());
    }

    @Test
    public void testFragments() {
        onView(withText("Currently Publishing")).perform(click());
        onView(withText("Most Popular")).perform(click());
    }

    @Test
    public void testGridViewMostPopular() {
        onData(anything()).inAdapterView(withId(R.id.mostPopularGridView)).atPosition(0).perform(click());
    }

    @Test
    public void testGridViewCurrentlyPublishing() {
        onView(withText("Currently Publishing")).perform(click());
        onData(anything()).inAdapterView(withId(R.id.currentlyPublishingGrid)).atPosition(0).perform(click());
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}
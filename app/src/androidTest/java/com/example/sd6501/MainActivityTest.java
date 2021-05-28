package com.example.sd6501;

import android.app.Activity;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
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

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}
package com.example.sd6501;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class ProfileTest {

    @Rule
    public ActivityTestRule<Profile> activityTestRule = new ActivityTestRule<>(Profile.class);
    Profile profile;

    @Before
    public void setUp() throws Exception {
        profile = activityTestRule.getActivity();
    }

    @Test
    public void listButton() {
        onView(withId(R.id.listButton)).perform(click());
    }

    @Test
    public void homeButton() {
        onView(withId(R.id.home)).perform(click());
    }

    @Test
    public void actionSettingsTest() {
        openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext());
        onView(withText("Profile Settings")).perform(click());
    }

    @After
    public void tearDown() throws Exception {
        profile = null;
    }
}
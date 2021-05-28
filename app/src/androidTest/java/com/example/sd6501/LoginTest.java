package com.example.sd6501;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public class LoginTest {

    @Rule
    public ActivityTestRule<Login> activityTestRule = new ActivityTestRule<>(Login.class);
    Login login;

    @Before
    public void setUp() throws Exception {
        login = activityTestRule.getActivity();
    }

    @Test
    public void testLoginTextAndButton() {
        String usernameLogin = "Demo";
        String passwordLogin = "Password";
        onView(withId(R.id.userName)).perform(typeText(usernameLogin));
        onView(withId(R.id.password)).perform(typeText(passwordLogin));
        closeSoftKeyboard();
        onView(withId(R.id.loginButton)).perform(click());
    }

    @Test
    public void testLoginIncorrectTextAndButton() {
        String usernameLogin = "Username";
        String passwordLogin = "BadPassword";
        onView(withId(R.id.userName)).perform(typeText(usernameLogin));
        onView(withId(R.id.password)).perform(typeText(passwordLogin));
        onView(withId(R.id.loginButton)).perform(click());
    }

    @After
    public void tearDown() throws Exception {
        login=null;
    }
}
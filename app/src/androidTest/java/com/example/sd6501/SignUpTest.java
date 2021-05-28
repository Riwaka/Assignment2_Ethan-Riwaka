package com.example.sd6501;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SignUpTest {



    @Rule
    public ActivityTestRule<SignUp> activityTestRule = new ActivityTestRule<>(SignUp.class);
    SignUp signUp;

    @Before
    public void setUp() throws Exception {
        signUp = activityTestRule.getActivity();
    }

    @Test
    public void signUpButtonTest() {
        onView(withId(R.id.confirmSignUp)).perform(click());
    }

    @After
    public void tearDown() throws Exception {
        signUp=null;
    }
}
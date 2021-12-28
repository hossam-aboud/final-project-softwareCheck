package com.abuqusai.softwarecheck_lab;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

// - Use five different type of view Actions.
public class MainActivityTest {
    @Rule
        public ActivityScenarioRule<MainActivity> hom  = new ActivityScenarioRule<>(MainActivity.class);

    @Test(expected = NullPointerException.class)
    public void check_ui_login(){

        String Email = "hossam@test.com";
        String Password = "17852369";

        //View Actions (1,2) - closeSoftKeyboard/typeText
        onView(withId(R.id.email_text)).perform(typeText(Email),closeSoftKeyboard());
        onView(withId(R.id.password_text)).perform(typeText(Password), closeSoftKeyboard());

        onView(withId(R.id.email_text)).check(matches(ViewMatchers.withText(Email)));
        onView(withId(R.id.password_text)).check(matches(ViewMatchers.withText(Password)));

        //View Actions (3) - click
        onView(withId(R.id.btn_login)).perform(ViewActions.click());

        // 4
        onView(withId(R.id.logo_name)).perform(clearText() , closeSoftKeyboard());

        // 5
        onView(withId(R.id.forgot_password)).perform(replaceText("هل نسبت كلمة السر") , closeSoftKeyboard());

    }
}

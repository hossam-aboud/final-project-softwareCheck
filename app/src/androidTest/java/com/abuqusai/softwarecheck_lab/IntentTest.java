package com.abuqusai.softwarecheck_lab;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Intent;

import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

// - Write UITest for Intents.(Two methods)
@RunWith(AndroidJUnit4.class)
@LargeTest
public class IntentTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void fillBoxes() {
        onView(withId(R.id.email_text)).perform(typeText("hossam.abboodd@hotmail.com"));
        onView(withId(R.id.password_text)).perform(typeText("123456789"));
        //onView(withId(R.id.login_btn_login)).perform(closeSoftKeyboard());
    }

    @Test
    public void intentToView() {
        Intents.init();
        Intent i = new Intent();
        activityTestRule.launchActivity(i);
    }
}

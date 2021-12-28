package com.abuqusai.softwarecheck_lab;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.abuqusai.softwarecheck_lab.adapters.Adapter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

// - Write UITest for Recycler View. (Check the number of list items)
@RunWith(AndroidJUnit4.class)
@LargeTest
public class RecyclerTest {
    @Rule
    public ActivityScenarioRule activityScenarioRule = new ActivityScenarioRule(VActivity.class);

    @Test
    public void recyclerItemCount(){
        onView(withId(R.id.rv_recycle))
                .perform(RecyclerViewActions.scrollToPosition(30));

        System.out.println("LENGTH : "+ Adapter.getArrayCount());
    }
}

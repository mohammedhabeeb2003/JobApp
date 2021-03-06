package com.nbsp.materialfilepicker;

import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.nbsp.materialfilepicker.ui.FilePickerActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class FilePickerTest {
    @Rule
    public ActivityTestRule<FilePickerActivity> mActivityRule = new ActivityTestRule<>(
            FilePickerActivity.class,
            true,
            false
    );

    @Before
    public void before() {
    }

    @Test
    public void selectFile() {
        mActivityRule.launchActivity(
                new MaterialFilePicker()
                        .withRequestCode(1)
                        .withHiddenFiles(true)
                        .getIntent()
        );
    }
}

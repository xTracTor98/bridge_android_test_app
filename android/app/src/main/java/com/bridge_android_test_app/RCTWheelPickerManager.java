package com.bridge_android_test_app;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import java.util.LinkedList;
import java.util.List;

import io.blackbox_vision.wheelview.view.WheelView;

public class RCTWheelPickerManager extends SimpleViewManager<WheelView> {

    public static final String REACT_CLASS = "RCTWheelPicker";

    @NonNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @NonNull
    @Override
    protected WheelView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        final WheelView wheelView = new WheelView(themedReactContext);
        List<String> testList = new LinkedList<>();

        testList.add("Akanza 1");
        testList.add("Akanza 2");
        testList.add("Akanza 3");

        wheelView.setItems(testList);
        return wheelView;
    }
}

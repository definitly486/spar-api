package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.PlacemarkText;
import com.yandex.mapkit.map.TextStyle;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class PlacemarkTextBinding implements PlacemarkText {
    private final NativeObject nativeObject;

    protected PlacemarkTextBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.PlacemarkText
    public native TextStyle getStyle();

    @Override // com.yandex.mapkit.map.PlacemarkText
    public native String getText();

    @Override // com.yandex.mapkit.map.PlacemarkText
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.PlacemarkText
    public native void setStyle(TextStyle textStyle);

    @Override // com.yandex.mapkit.map.PlacemarkText
    public native void setText(String str);
}

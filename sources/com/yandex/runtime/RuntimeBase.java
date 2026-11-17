package com.yandex.runtime;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RuntimeBase {
    public static native String getVersion();

    public static native int onDartVMCreated();

    public static native void onDetachedFromEngine(int i13);

    public static native void setPreinitializationOptions(Map<String, String> map);
}

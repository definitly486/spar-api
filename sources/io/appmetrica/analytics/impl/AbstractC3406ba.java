package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3406ba {
    public static final V9 a(int i13, String str) {
        byte[] bytes;
        V9 v13 = new V9();
        v13.f46665a = i13;
        if (str == null || (bytes = str.getBytes(mj.wkgbmnqykc.f67326zoijcleaow)) == null) {
            bytes = v13.f46666b;
        }
        v13.f46666b = bytes;
        return v13;
    }
}

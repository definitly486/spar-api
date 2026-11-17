package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3409bd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f46961c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46963b;

    static {
        SparseArray sparseArray = new SparseArray();
        f46961c = sparseArray;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C3409bd("jvm", "binder"));
        sparseArray.put(5890, new C3409bd("jvm", "file"));
        sparseArray.put(5889, new C3409bd("jvm", "file"));
        sparseArray.put(5897, new C3409bd("jni_native", "file"));
        sparseArray.put(5898, new C3409bd("jni_native", "file"));
    }

    public C3409bd(String str, String str2) {
        this.f46962a = str;
        this.f46963b = str2;
    }
}

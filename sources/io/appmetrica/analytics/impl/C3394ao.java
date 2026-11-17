package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3394ao {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f46929c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f46930a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46931b = 0;

    public C3394ao(int[] iArr) {
        for (int i13 : iArr) {
            this.f46930a.put(i13, new HashMap());
        }
    }
}

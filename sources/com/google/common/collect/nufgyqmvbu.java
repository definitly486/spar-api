package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
abstract class nufgyqmvbu {
    static void iobyxmoadg(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static void ppxfxbqfkf(boolean z13) {
        xa.draadjrbmk.rgvfuqvkyq(z13, "no calls to next() since the last call to remove()");
    }

    static int zoijcleaow(int i13, String str) {
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i13);
    }
}

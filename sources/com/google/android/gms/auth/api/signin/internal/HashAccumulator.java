package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class HashAccumulator {
    private int zaa = 1;

    @KeepForSdk
    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    public final HashAccumulator zaa(boolean z13) {
        this.zaa = (this.zaa * 31) + (z13 ? 1 : 0);
        return this;
    }
}

package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new D((C4044x) parcel.readParcelable(C4044x.class.getClassLoader()), (F) parcel.readParcelable(F.class.getClassLoader()), (C4046z) parcel.readParcelable(C4046z.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new D[i13];
    }
}

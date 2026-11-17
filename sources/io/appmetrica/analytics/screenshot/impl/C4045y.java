package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4045y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z13 = parcel.readByte() != 0;
        List listCreateStringArrayList = parcel.createStringArrayList();
        if (listCreateStringArrayList == null) {
            listCreateStringArrayList = jyumaefscl.wflxmlrfwp();
        }
        return new C4046z(z13, listCreateStringArrayList, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C4046z[i13];
    }
}

package kk;

import android.os.Parcel;
import android.os.Parcelable;
import npi.spay.Gr;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parcel, "parcel");
        return new Gr();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new Gr[i13];
    }
}

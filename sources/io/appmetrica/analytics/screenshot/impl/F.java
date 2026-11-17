package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48926b;

    public F(boolean z13, long j13) {
        this.f48925a = z13;
        this.f48926b = j13;
    }

    public final long a() {
        return this.f48926b;
    }

    public final boolean b() {
        return this.f48925a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f48925a + ", delaySeconds=" + this.f48926b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f48925a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48926b);
    }

    public F(i0 i0Var) {
        this(i0Var.b(), i0Var.a());
    }
}

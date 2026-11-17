package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f48921b;

    public B(boolean z13, D d13) {
        this.f48920a = z13;
        this.f48921b = d13;
    }

    public final D a() {
        return this.f48921b;
    }

    public final boolean b() {
        return this.f48920a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f48920a + ", config=" + this.f48921b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f48920a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f48921b, i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public B(g0 g0Var) {
        boolean zB = g0Var.b();
        h0 h0VarA = g0Var.a();
        this(zB, h0VarA != null ? new D(h0VarA) : null);
    }
}

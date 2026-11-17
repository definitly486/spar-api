package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4044x implements Parcelable {
    public static final C4043w CREATOR = new C4043w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49017a;

    public C4044x(boolean z13) {
        this.f49017a = z13;
    }

    public final boolean a() {
        return this.f49017a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f49017a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f49017a ? (byte) 1 : (byte) 0);
    }

    public C4044x(e0 e0Var) {
        this(e0Var.a());
    }
}

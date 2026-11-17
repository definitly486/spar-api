package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4044x f48922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f48923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4046z f48924c;

    public D(C4044x c4044x, F f13, C4046z c4046z) {
        this.f48922a = c4044x;
        this.f48923b = f13;
        this.f48924c = c4046z;
    }

    public final C4044x a() {
        return this.f48922a;
    }

    public final C4046z b() {
        return this.f48924c;
    }

    public final F c() {
        return this.f48923b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f48922a + ", serviceCaptorConfig=" + this.f48923b + ", contentObserverCaptorConfig=" + this.f48924c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f48922a, i13);
        parcel.writeParcelable(this.f48923b, i13);
        parcel.writeParcelable(this.f48924c, i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(h0 h0Var) {
        e0 e0VarA = h0Var.a();
        C4044x c4044x = e0VarA != null ? new C4044x(e0VarA) : null;
        i0 i0VarC = h0Var.c();
        F f13 = i0VarC != null ? new F(i0VarC) : null;
        f0 f0VarB = h0Var.b();
        this(c4044x, f13, f0VarB != null ? new C4046z(f0VarB) : null);
    }
}

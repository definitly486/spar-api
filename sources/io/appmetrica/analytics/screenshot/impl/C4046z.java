package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4046z implements Parcelable {
    public static final C4045y CREATOR = new C4045y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49020c;

    public C4046z(boolean z13, List list, long j13) {
        this.f49018a = z13;
        this.f49019b = list;
        this.f49020c = j13;
    }

    public final long a() {
        return this.f49020c;
    }

    public final boolean b() {
        return this.f49018a;
    }

    public final List c() {
        return this.f49019b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f49018a + ", mediaStoreColumnNames=" + this.f49019b + ", detectWindowSeconds=" + this.f49020c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f49018a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f49019b);
        parcel.writeLong(this.f49020c);
    }

    public C4046z(f0 f0Var) {
        this(f0Var.b(), f0Var.c(), f0Var.a());
    }
}

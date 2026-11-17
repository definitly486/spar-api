package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3834sb implements Parcelable {
    public static final Parcelable.Creator<C3834sb> CREATOR = new C3809rb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f48056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f48057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48059d;

    public C3834sb(W6 w13, List list, Map map, boolean z13) {
        this.f48057b = list;
        this.f48056a = w13;
        this.f48058c = map == null ? new HashMap() : new HashMap(map);
        this.f48059d = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f48056a);
        if (this.f48057b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f48057b));
        }
        HashMap map = this.f48058c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Gm.a((Map) map));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f48059d);
        parcel.writeBundle(bundle);
    }

    public C3834sb(Parcel parcel) {
        Bundle bundle = parcel.readBundle(W6.class.getClassLoader());
        if (bundle != null) {
            this.f48056a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f48057b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f48058c = Gm.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f48059d = bundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f48058c = new HashMap();
    }
}

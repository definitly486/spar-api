package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3784qa implements Parcelable {
    public static final C3759pa CREATOR = new C3759pa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f47915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f47916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47917c;

    public C3784qa(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f47915a = bool;
        this.f47916b = identifierStatus;
        this.f47917c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3784qa)) {
            return false;
        }
        C3784qa c3784qa = (C3784qa) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f47915a, c3784qa.f47915a) && this.f47916b == c3784qa.f47916b && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f47917c, c3784qa.f47917c);
    }

    public final int hashCode() {
        Boolean bool = this.f47915a;
        int iHashCode = (this.f47916b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f47917c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f47915a + ", status=" + this.f47916b + ", errorExplanation=" + this.f47917c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeValue(this.f47915a);
        parcel.writeString(this.f47916b.getValue());
        parcel.writeString(this.f47917c);
    }

    public C3784qa() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}

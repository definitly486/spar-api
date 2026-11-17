package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3630k6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        H9 h13;
        Bundle bundle = parcel.readBundle(W6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i13 = bundle.getInt("CounterReport.Source");
            H9[] h9ArrValues = H9.values();
            int length = h9ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    h13 = H9.NATIVE;
                    break;
                }
                h13 = h9ArrValues[i14];
                if (h13.f45909a == i13) {
                    break;
                }
                i14++;
            }
        } else {
            h13 = null;
        }
        C3655l6 c3655l6 = new C3655l6("", "", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = bundle.getInt("CounterReport.Type", -1);
        c3655l6.f47635e = bundle.getInt("CounterReport.CustomType");
        c3655l6.f47632b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        c3655l6.f47633c = bundle.getString("CounterReport.Environment");
        c3655l6.f47631a = bundle.getString("CounterReport.Event");
        c3655l6.f47636f = C3655l6.a(bundle);
        c3655l6.f47637g = bundle.getInt("CounterReport.TRUNCATED");
        c3655l6.f47638h = bundle.getString("CounterReport.ProfileID");
        c3655l6.f47639i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        c3655l6.f47640j = bundle.getLong("CounterReport.CreationTimestamp");
        c3655l6.f47641k = EnumC3983ya.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        c3655l6.f47642l = h13;
        c3655l6.f47643m = bundle.getBundle("CounterReport.Payload");
        c3655l6.f47644n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c3655l6.f47645o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        c3655l6.f47646p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return c3655l6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C3655l6[i13];
    }
}

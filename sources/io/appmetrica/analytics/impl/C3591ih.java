package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3591ih extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f47452b;

    public C3591ih(C3828s5 c3828s5) {
        this(c3828s5, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        HashSet hashSet;
        C3828s5 c3828s5 = this.f47182a;
        if (c3828s5.f48049t.c() && c3828s5.x()) {
            C3639kf c3639kf = c3828s5.f48032c;
            String strE = this.f47182a.f48032c.e();
            if (TextUtils.isEmpty(strE)) {
                hashSet = null;
            } else {
                try {
                    hashSet = new HashSet();
                    JSONArray jSONArray = new JSONArray(strE);
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        hashSet.add(new C3684ma(jSONArray.getJSONObject(i13)));
                    }
                } catch (Throwable unused) {
                    hashSet = null;
                }
            }
            try {
                ArrayList<C3684ma> arrayListB = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, arrayListB)) {
                    F9 f13 = c3828s5.f48043n;
                    int i14 = f13.f45808k;
                    f13.f45810m = i14;
                    f13.f45798a.a(i14).b();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    for (C3684ma c3684ma : arrayListB) {
                        c3684ma.getClass();
                        JSONObject jSONObjectPut = new JSONObject().put(ExternalMetricsManagerImpl.NAME, c3684ma.f47698a).put("required", c3684ma.f47700c);
                        int i15 = c3684ma.f47699b;
                        if (i15 != -1) {
                            jSONObjectPut.put("version", i15);
                        }
                        jSONArray2.put(jSONObjectPut);
                    }
                    C3655l6 c3655l6A = C3655l6.a(c3655l6, new JSONObject().put("features", jSONArray2).toString());
                    F9 f14 = c3828s5.f48043n;
                    f14.a(c3655l6A, Sk.a(f14.f45800c.b(c3655l6A), c3655l6A.f47639i));
                    int i16 = f14.f45808k;
                    f14.f45810m = i16;
                    f14.f45798a.a(i16).b();
                    c3639kf.i(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            C3828s5 c3828s5 = this.f47182a;
            SafePackageManager safePackageManager = this.f47452b;
            Context context = c3828s5.f48030a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC3659la c3609ja = AndroidUtils.isApiAchieved(24) ? new C3609ja() : new C3634ka();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c3609ja.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3591ih(C3828s5 c3828s5, SafePackageManager safePackageManager) {
        super(c3828s5);
        this.f47452b = safePackageManager;
    }
}

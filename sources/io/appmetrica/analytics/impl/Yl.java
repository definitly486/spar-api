package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sa f46819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3808ra f46820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Si f46821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ne f46822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Im f46823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3900v2 f46824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3 f46825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3850t2 f46826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Cb f46827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fm f46828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hd f46829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Y9 f46830l;

    public Yl() {
        this(new Cb(), new Sa(), new C3808ra(), new Si(), new Ne(), new Im(), new C3(), new C3900v2(), new C3850t2(), new Fm(), new Hd(), new Y9());
    }

    public final void a(C3470dm c3470dm, Ab ab3) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = ab3.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c3470dm.f47113g = jSONObjectOptJSONObject3.optString(ImagesContract.URL, null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = ab3.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c3470dm.f47116j = Gm.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = ab3.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c3470dm.f47119m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = ab3.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c3470dm.f47118l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C3945wm c3945wm = new C3945wm();
        JSONObject jSONObjectOptJSONObject9 = ab3.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c3945wm.f48353a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c3945wm.f48353a);
        }
        this.f46823e.getClass();
        c3470dm.f47122p = new Hm(c3945wm.f48353a);
        this.f46820b.getClass();
        C3845sm c3845sm = new C3845sm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = ab3.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                E4 e13 = new E4();
                e13.f45682a = C3808ra.a(jSONObjectOptJSONObject10, "permissions_collecting", c3845sm.f48077a);
                e13.f45683b = C3808ra.a(jSONObjectOptJSONObject10, "features_collecting", c3845sm.f48078b);
                e13.f45684c = C3808ra.a(jSONObjectOptJSONObject10, "google_aid", c3845sm.f48079c);
                e13.f45685d = C3808ra.a(jSONObjectOptJSONObject10, "sim_info", c3845sm.f48080d);
                e13.f45686e = C3808ra.a(jSONObjectOptJSONObject10, "huawei_oaid", c3845sm.f48081e);
                e13.f45687f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c3470dm.f47108b = new G4(e13);
            }
        } catch (Throwable unused4) {
        }
        this.f46819a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = ab3.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c3470dm.f47110d = string;
                }
                ArrayList arrayListA2 = Sa.a(jSONObjectOptJSONObject11, "report");
                if (!io.a((Collection) arrayListA2)) {
                    c3470dm.f47111e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c3470dm.f47112f = string2;
                }
                ArrayList arrayListA3 = Sa.a(jSONObjectOptJSONObject11, "startup");
                if (!io.a((Collection) arrayListA3)) {
                    c3470dm.f47109c = arrayListA3;
                }
                ArrayList arrayListA4 = Sa.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!io.a((Collection) arrayListA4)) {
                    c3470dm.f47120n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!Sa.f46506a.contains(next2) && (arrayListA = Sa.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c3470dm.f47121o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f46821c.getClass();
        C3970xm c3970xm = new C3970xm();
        JSONObject jSONObjectOptJSONObject12 = ab3.optJSONObject("retry_policy");
        int iOptInt = c3970xm.f48481w;
        int iOptInt2 = c3970xm.f48482x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c3970xm.f48482x);
        }
        c3470dm.f47123q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f46822d.getClass();
        if (c3470dm.f47108b.f45837a) {
            JSONObject jSONObjectOptJSONObject13 = ab3.optJSONObject("permissions_collecting");
            C3895um c3895um = new C3895um();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c3895um.f48213a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c3895um.f48214b);
            } else {
                jOptLong = c3895um.f48213a;
                jOptLong2 = c3895um.f48214b;
            }
            c3470dm.f47117k = new Le(jOptLong, jOptLong2);
        }
        C3875u2 c3875u2 = this.f46824f.f48220a;
        C3746om c3746om = new C3746om();
        JSONObject jSONObjectOptJSONObject14 = ab3.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject14 != null) {
            c3746om.f47849a = jSONObjectOptJSONObject14.optInt("send_frequency_seconds", c3746om.f47849a);
            c3746om.f47850b = jSONObjectOptJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c3746om.f47850b);
        }
        c3875u2.getClass();
        c3470dm.f47124r = new BillingConfig(c3746om.f47849a, c3746om.f47850b);
        C3 c13 = this.f46825g;
        c13.getClass();
        C3771pm c3771pm = new C3771pm();
        JSONObject jSONObjectOptJSONObject15 = ab3.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject15 != null) {
            c3771pm.f47894a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject15, "last_known_location_ttl", c3771pm.f47894a);
        }
        c13.f45557a.getClass();
        c3470dm.f47125s = new C4001z3(c3771pm.f47894a);
        this.f46826h.getClass();
        C3850t2.a(c3470dm, ab3);
        Fm fm2 = this.f46828j;
        fm2.getClass();
        JSONObject jSONObjectOptJSONObject16 = ab3.optJSONObject("startup_update");
        C3920vm c3920vm = new C3920vm();
        Integer numA = Bb.a(jSONObjectOptJSONObject16, "interval_seconds", null);
        if (numA != null) {
            c3920vm.f48251a = numA.intValue();
        }
        fm2.f45825a.getClass();
        c3470dm.f47127u = new Dm(c3920vm.f48251a);
        Map<String, C3861td> mapC = this.f46829k.f45910a.c();
        Gd gd2 = new Gd(ab3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C3861td> entry : mapC.entrySet()) {
            Object objInvoke = gd2.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c3470dm.f47128v = linkedHashMap;
        X9 x13 = this.f46830l.f46799a;
        C3820rm c3820rm = new C3820rm();
        JSONObject jSONObjectOptJSONObject17 = ab3.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject17 != null) {
            c3820rm.f48020a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject17, "collecting_interval_seconds", c3820rm.f48020a);
        }
        x13.getClass();
        c3470dm.f47129w = new W9(c3820rm.f48020a);
    }

    public Yl(Cb cb3, Sa sa3, C3808ra c3808ra, Si si2, Ne ne2, Im im2, C3 c13, C3900v2 c3900v2, C3850t2 c3850t2, Fm fm2, Hd hd2, Y9 y13) {
        this.f46819a = sa3;
        this.f46820b = c3808ra;
        this.f46821c = si2;
        this.f46822d = ne2;
        this.f46823e = im2;
        this.f46825g = c13;
        this.f46824f = c3900v2;
        this.f46826h = c3850t2;
        this.f46827i = cb3;
        this.f46828j = fm2;
        this.f46829k = hd2;
        this.f46830l = y13;
    }
}

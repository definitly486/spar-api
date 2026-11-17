package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3912ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f48240a;

    public C3912ve() {
        HashMap map = new HashMap();
        this.f48240a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", "pc");
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put("auto_inapp_collecting", "aic");
        map.put("attribution", "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f48240a.containsKey(str) ? (String) this.f48240a.get(str) : str;
    }
}

package io.appmetrica.analytics.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3708n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo f47750a;

    public C3708n9(uo uoVar) {
        this.f47750a = uoVar;
    }

    public final void a(int i13, long j13) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        uo uoVar = this.f47750a;
        synchronized (uoVar) {
            jSONObjectOptJSONObject = uoVar.f48216a.a().optJSONObject("numbers_of_type");
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(String.valueOf(i13), j13);
        this.f47750a.a(jSONObjectOptJSONObject);
    }
}

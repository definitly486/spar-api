package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ro implements qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V8 f48025a;

    public ro() {
        this(new V8());
    }

    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        if (!((C3828s5) c3965xh.f48440l).A() && !TextUtils.isEmpty(c3534g9.f47303b)) {
            try {
                JSONObject jSONObject = new JSONObject(c3534g9.f47303b);
                jSONObject.remove("preloadInfo");
                c3534g9.f47303b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f48025a.a(c3534g9, c3965xh);
    }

    public ro(V8 v13) {
        this.f48025a = v13;
    }
}

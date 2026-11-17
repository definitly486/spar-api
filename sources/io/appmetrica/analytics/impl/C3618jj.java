package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3618jj extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hf f47543b;

    public C3618jj(C3828s5 c3828s5) {
        this(c3828s5, Ia.j().s());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(c3655l6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f47543b.b(Ef.a(jSONObjectOptJSONObject));
        return false;
    }

    public C3618jj(C3828s5 c3828s5, Hf hf2) {
        super(c3828s5);
        this.f47543b = hf2;
    }
}

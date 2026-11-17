package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4015zh extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hf f48617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo f48618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f48619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeProvider f48620e;

    public C4015zh(C3828s5 c3828s5) {
        this(c3828s5, c3828s5.t(), Ia.j().s(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        C3828s5 c3828s5 = this.f47182a;
        if (this.f48618c.d()) {
            return false;
        }
        C3655l6 c3655l6A = ((C3965xh) c3828s5.f48040k.a()).f48433e ? C3655l6.a(c3655l6, EnumC3934wb.EVENT_TYPE_APP_UPDATE) : C3655l6.a(c3655l6, EnumC3934wb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f48619d.getInstallerPackageName(c3828s5.f48030a, c3828s5.f48031b.f47629a), ""));
            Hf hf2 = this.f48617b;
            hf2.f47435h.a(hf2.f47428a);
            jSONObject.put("preloadInfo", ((Ef) hf2.c()).b());
        } catch (Throwable unused) {
        }
        c3655l6A.setValue(jSONObject.toString());
        F9 f13 = c3828s5.f48043n;
        f13.a(c3655l6A, Sk.a(f13.f45800c.b(c3655l6A), c3655l6A.f47639i));
        uo uoVar = this.f48618c;
        synchronized (uoVar) {
            vo voVar = uoVar.f48216a;
            voVar.a(voVar.a().put("init_event_done", true));
        }
        this.f48618c.a(this.f48620e.currentTimeMillis());
        return false;
    }

    public C4015zh(C3828s5 c3828s5, uo uoVar, Hf hf2, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c3828s5);
        this.f48618c = uoVar;
        this.f48617b = hf2;
        this.f48619d = safePackageManager;
        this.f48620e = systemTimeProvider;
    }
}

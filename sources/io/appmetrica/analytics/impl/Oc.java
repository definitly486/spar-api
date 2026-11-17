package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Oc implements Y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3465dh f46330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3639kf f46331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46332c = "activation_unlock_event_sending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f46333d;

    public Oc(C3465dh c3465dh, J4 j13, C3639kf c3639kf) {
        this.f46330a = c3465dh;
        this.f46331b = c3639kf;
        this.f46333d = new AtomicBoolean(c3639kf.a(false) || a(j13));
    }

    public final void a(String str) {
        try {
            C3442ck c3442ck = Bj.f45542a;
            String str2 = this.f46332c;
            JSONObject jSONObjectPut = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            C3560ha c3560haH = Ia.F.h();
            Bundle applicationMetaData = c3560haH.f47384d.getApplicationMetaData(c3560haH.f47381a);
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C3868tk c3868tk = Ia.F.D;
            String string = jSONObjectPut2.put("activation_offset", TimeUnit.SECONDS.convert(c3868tk.f48138a.currentTimeMillis() - c3868tk.f48139b, TimeUnit.MILLISECONDS)).toString();
            c3442ck.getClass();
            c3442ck.a(new C3390ak(str2, string));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.Y8
    public final boolean b() {
        String str;
        if (!this.f46333d.get() && (str = ((C3965xh) this.f46330a.a()).f48441m) != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f46333d.compareAndSet(false, true)) {
            this.f46331b.b(true);
            a("activation");
        }
        return this.f46333d.get();
    }

    public final void a() {
        if (this.f46333d.compareAndSet(false, true)) {
            this.f46331b.b(true);
            a("timer");
        }
    }

    public static boolean a(J4 j13) {
        String str = j13.f46054a;
        return (str == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3375a5 f46104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pn f46105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Li f46106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3674m0 f46107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Pl f46108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3594ik f46109f;

    public Ji(C3674m0 c3674m0, Pn pn2, C3375a5 c3375a5, C3594ik c3594ik) {
        this(c3674m0, pn2, c3375a5, c3594ik, new Li(c3674m0, c3594ik));
    }

    public final void a(Ih ih2) {
        Sh sh2 = ih2.f46035e;
        Pl pl2 = this.f46108e;
        if (pl2 != null) {
            sh2.f47066b.setUuid(((Ol) pl2).g());
        } else {
            sh2.getClass();
        }
        this.f46106c.a(ih2);
    }

    public final void b(String str) {
        Pf pf2 = this.f46104a.f47065a;
        synchronized (pf2) {
            pf2.f46389a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Ji(C3674m0 c3674m0, Pn pn2, C3375a5 c3375a5, C3594ik c3594ik, Li li2) {
        this.f46107d = c3674m0;
        this.f46104a = c3375a5;
        this.f46105b = pn2;
        this.f46109f = c3594ik;
        this.f46106c = li2;
    }

    public final void a(Ol ol2) {
        this.f46108e = ol2;
        this.f46104a.f47066b.setUuid(ol2.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (io.a(bool)) {
            this.f46104a.f47066b.setLocationTracking(bool.booleanValue());
        }
        if (io.a(bool2)) {
            this.f46104a.f47066b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (io.a(bool3)) {
            this.f46104a.f47066b.setAdvIdentifiersTracking(bool3.booleanValue());
        }
        C3655l6 c3655l6A = C3655l6.a();
        C3375a5 c3375a5 = this.f46104a;
        a(a(c3655l6A, c3375a5), c3375a5, 1, null);
    }

    public final void a(C3655l6 c3655l6, Sh sh2, int i13, Map map) {
        String str;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        this.f46107d.b();
        if (!io.a(map)) {
            c3655l6.setValue(Bb.b(map));
            a(c3655l6, sh2);
        }
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str = sh2.f46513f;
        }
        a(new Ih(c3655l6, false, i13, null, new Sh(pf2, counterConfiguration, w13, str)));
    }

    public static C3655l6 a(C3655l6 c3655l6, Sh sh2) {
        if (R9.f46441a.contains(Integer.valueOf(c3655l6.f47634d))) {
            c3655l6.f47633c = sh2.d();
        }
        return c3655l6;
    }

    public final void a(List list) {
        Pf pf2 = this.f46104a.f47065a;
        synchronized (pf2) {
            pf2.f46389a.put("PROCESS_CFG_CUSTOM_HOSTS", io.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap map) {
        Pf pf2 = this.f46104a.f47065a;
        synchronized (pf2) {
            pf2.f46389a.put("PROCESS_CFG_CLIDS", Bb.b(map));
        }
    }

    public final void a(String str) {
        Pf pf2 = this.f46104a.f47065a;
        synchronized (pf2) {
            pf2.f46389a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ih a(Nn nn2, Sh sh2) {
        String str;
        String str2;
        this.f46107d.b();
        Pn pn2 = this.f46105b;
        pn2.getClass();
        Dn dn2 = nn2.f46292a;
        if (dn2 == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(dn2.f45667a, "");
        }
        byte[] bArrFromModel = pn2.f46401a.fromModel(nn2);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh2.f47066b.getApiKey());
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(bArrFromModel, str, 5891, orCreatePublicLogger);
        c3579i4.f47633c = sh2.d();
        HashMap map = c3579i4.f47418q;
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str2 = sh2.f46513f;
        }
        return new Ih(c3579i4, true, 1, map, new Sh(pf2, counterConfiguration, w13, str2));
    }
}

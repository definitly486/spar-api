package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V2 implements Ya {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashSet f46640n = new HashSet(Arrays.asList(1, 13));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final T2 f46641o = new T2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f46642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Sh f46643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final PublicLogger f46644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final On f46645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Rg f46646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Q6 f46647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3396b0 f46648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Ji f46649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Jb f46650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M6 f46651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3560ha f46652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Xe f46653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3496en f46654m;

    public V2(Context context, Ji ji2, Sh sh2, C3560ha c3560ha, M6 m13, On on2, Rg rg2, Q6 q13, C3396b0 c3396b0, Xe xe2) {
        Context applicationContext = context.getApplicationContext();
        this.f46642a = applicationContext;
        this.f46649h = ji2;
        this.f46643b = sh2;
        this.f46652k = c3560ha;
        this.f46645d = on2;
        this.f46646e = rg2;
        this.f46647f = q13;
        this.f46648g = c3396b0;
        this.f46653l = xe2;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh2.b().getApiKey());
        this.f46644c = orCreatePublicLogger;
        if (AbstractC3876u3.a(sh2.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f46651j = m13;
        this.f46654m = new C3496en(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f46644c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f46644c.info("Put error environment pair <%s, %s>", str, str2);
        Sh sh2 = this.f46643b;
        synchronized (sh2) {
            W8 w13 = sh2.f46510c;
            w13.f46707b.b(w13.f46706a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (io.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.f46643b.f()) {
            return;
        }
        this.f46649h.f46107d.c();
        Jb jb3 = this.f46650i;
        jb3.f46092a.removeCallbacks(jb3.f46094c, jb3.f46093b.f46643b.f47066b.getApiKey());
        this.f46643b.f46512e = true;
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4("", str, 3, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f46644c.info("Clear app environment", new Object[0]);
        Ji ji2 = this.f46649h;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        C3655l6 c3655l6N = C3579i4.n();
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str = sh2.f46513f;
        }
        ji2.a(new Ih(c3655l6N, false, 1, null, new Sh(pf2, counterConfiguration, w13, str)));
    }

    public final void d(String str) {
        this.f46649h.f46107d.b();
        Jb jb3 = this.f46650i;
        Jb.a(jb3.f46092a, jb3.f46093b, jb3.f46094c);
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4("", str, 6400, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46643b.f46512e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        Ef ef2;
        Ji ji2 = this.f46649h;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        If r13 = sh2.f46511d;
        synchronized (sh2) {
            str = sh2.f46513f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh2.f47066b.getApiKey());
        Set set = R9.f46441a;
        JSONObject jSONObject = new JSONObject();
        if (r13 != null && (ef2 = r13.f46030a) != null) {
            try {
                jSONObject.put("preloadInfo", ef2.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(string, "", 6144, 0, orCreatePublicLogger);
        c3579i4.c(str);
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f46644c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f46644c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f46644c.info("Put app environment: <%s, %s>", str, str2);
        Ji ji2 = this.f46649h;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        C3655l6 c3655l6B = C3579i4.b(str, str2);
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str3 = sh2.f46513f;
        }
        ji2.a(new Ih(c3655l6B, false, 1, null, new Sh(pf2, counterConfiguration, w13, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrB;
        C3422c0 c3422c0 = new C3422c0(new C3448d0(this, map));
        Ga ga3 = new Ga();
        M6 m13 = C3952x4.l().f48371a;
        Thread threadA = c3422c0.a();
        Map mapC = null;
        try {
            stackTraceElementArrB = c3422c0.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        C3871tn c3871tn = (C3871tn) ga3.apply(threadA, stackTraceElementArrB);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C3996yn());
        try {
            mapC = c3422c0.c();
        } catch (SecurityException unused3) {
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadA && thread != null) {
                arrayList.add((C3871tn) ga3.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new U(c3871tn, arrayList, m13.b()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f46644c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Ji ji2 = this.f46649h;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        for (Qi qi2 : eCommerceEvent.toProto()) {
            C3579i4 c3579i4 = new C3579i4(LoggerStorage.getOrCreatePublicLogger(sh2.f47066b.getApiKey()));
            EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
            c3579i4.f47634d = 41000;
            c3579i4.f47632b = c3579i4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) qi2.f46427a)));
            c3579i4.f47637g = qi2.f46428b.getBytesTruncated();
            Pf pf2 = new Pf(sh2.f47065a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
            W8 w13 = sh2.f46510c;
            synchronized (sh2) {
                str = sh2.f46513f;
            }
            ji2.a(new Ih(c3579i4, false, 1, null, new Sh(pf2, counterConfiguration, w13, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th2) {
        Qg qg2 = new Qg(str, a(th2));
        Ji ji2 = this.f46649h;
        byte[] byteArray = MessageNano.toByteArray(this.f46646e.fromModel(qg2));
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(byteArray, str, 5892, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46644c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f46644c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4("", str, 1, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        C3389aj c3389aj = U2.f46599a;
        c3389aj.getClass();
        no noVarA = c3389aj.a(revenue);
        if (!noVarA.f47784a) {
            this.f46644c.warning("Passed revenue is not valid. Reason: " + noVarA.f47785b, new Object[0]);
            return;
        }
        Ji ji2 = this.f46649h;
        C3415bj c3415bj = new C3415bj(revenue, this.f46644c);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        C3579i4 c3579i4A = C3579i4.a(LoggerStorage.getOrCreatePublicLogger(sh2.f47066b.getApiKey()), c3415bj);
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str = sh2.f46513f;
        }
        ji2.a(new Ih(c3579i4A, false, 1, null, new Sh(pf2, counterConfiguration, w13, str)));
        this.f46644c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th2) {
        Nn nnA = Qn.a(th2, new U(null, null, this.f46651j.b()), null, (String) this.f46652k.f47382b.a(), (Boolean) this.f46652k.f47383c.a());
        Ji ji2 = this.f46649h;
        ji2.a(ji2.a(nnA, this.f46643b));
        this.f46644c.info("Unhandled exception received: " + nnA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        C3394ao c3394ao = new C3394ao(C3394ao.f46929c);
        Iterator<UserProfileUpdate<? extends InterfaceC3420bo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC3420bo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Pd) userProfileUpdatePatcher).f46387e = this.f46644c;
            userProfileUpdatePatcher.a(c3394ao);
        }
        C3523fo c3523fo = new C3523fo();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < c3394ao.f46930a.size(); i13++) {
            SparseArray sparseArray = c3394ao.f46930a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i13))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C3446co) it2.next());
            }
        }
        c3523fo.f47261a = (C3446co[]) arrayList.toArray(new C3446co[arrayList.size()]);
        no noVarA = f46641o.a(c3523fo);
        if (!noVarA.f47784a) {
            this.f46644c.warning("UserInfo wasn't sent because " + noVarA.f47785b, new Object[0]);
            return;
        }
        Ji ji2 = this.f46649h;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        C3655l6 c3655l6A = C3579i4.a(c3523fo);
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str = sh2.f46513f;
        }
        ji2.a(new Ih(c3655l6A, false, 1, null, new Sh(pf2, counterConfiguration, w13, str)));
        this.f46644c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f46644c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f46644c.info("Send event buffer", new Object[0]);
        Ji ji2 = this.f46649h;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        C3579i4 c3579i4 = new C3579i4("", "", UserVerificationMethods.USER_VERIFY_HANDPRINT, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z13) {
        this.f46643b.f47066b.setDataSendingEnabled(z13);
        this.f46644c.info("Updated data sending enabled: %s", Boolean.valueOf(z13));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c3579i4.f47646p = Collections.singletonMap(str, bArr);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Ji ji2 = this.f46649h;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        C3579i4 c3579i4 = new C3579i4(LoggerStorage.getOrCreatePublicLogger(sh2.f47066b.getApiKey()));
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3579i4.f47634d = 40962;
        c3579i4.c(str);
        c3579i4.f47632b = c3579i4.e(str);
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str2 = sh2.f46513f;
        }
        ji2.a(new Ih(c3579i4, false, 1, null, new Sh(pf2, counterConfiguration, w13, str2)));
        this.f46644c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z13) {
        String str;
        Ji ji2 = this.f46649h;
        D d13 = new D(adRevenue, z13, this.f46654m, this.f46644c);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        C3579i4 c3579i4A = C3579i4.a(LoggerStorage.getOrCreatePublicLogger(sh2.f47066b.getApiKey()), d13);
        Pf pf2 = new Pf(sh2.f47065a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh2.f47066b);
        W8 w13 = sh2.f46510c;
        synchronized (sh2) {
            str = sh2.f46513f;
        }
        ji2.a(new Ih(c3579i4A, false, 1, null, new Sh(pf2, counterConfiguration, w13, str)));
        this.f46644c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + Bb.b(adRevenue.payload) + ", autoCollected=" + z13 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final void b(String str, String str2) {
        this.f46644c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(str2, str, 1, 0, publicLogger);
        c3579i4.f47642l = H9.JS;
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (io.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f46644c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(str2, str, 1, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    public final Nn a(Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTrace;
        if (th2 == null) {
            stackTrace = null;
            th3 = null;
        } else if (th2 instanceof T1) {
            stackTrace = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTrace = null;
        }
        return Qn.a(th3, new U(null, null, this.f46651j.b()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f46652k.f47382b.a(), (Boolean) this.f46652k.f47383c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th2) {
        P6 p13 = new P6(new Qg(str2, a(th2)), str);
        Ji ji2 = this.f46649h;
        byte[] byteArray = MessageNano.toByteArray(this.f46647f.fromModel(p13));
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(byteArray, str2, 5896, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46644c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Nn nnA = this.f46653l.a(pluginErrorDetails);
        Ji ji2 = this.f46649h;
        Dn dn2 = nnA.f46292a;
        String str = dn2 != null ? (String) WrapUtils.getOrDefault(dn2.f45667a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f46645d.fromModel(nnA));
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(byteArray, str, 5891, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46644c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final boolean b() {
        return this.f46643b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        ji2.a(new C3579i4("", str, 1, 0, publicLogger), this.f46643b, 1, map);
        PublicLogger publicLogger2 = this.f46644c;
        StringBuilder sb3 = new StringBuilder("Event received: ");
        sb3.append(WrapUtils.wrapToTag(str));
        sb3.append(". With value: ");
        sb3.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb3.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3685mb, io.appmetrica.analytics.impl.InterfaceC3760pb
    public final void a(Nn nn2) {
        Ji ji2 = this.f46649h;
        Ih ihA = ji2.a(nn2, this.f46643b);
        Sh sh2 = ihA.f46035e;
        Pl pl2 = ji2.f46108e;
        if (pl2 != null) {
            sh2.f47066b.setUuid(((Ol) pl2).g());
        } else {
            sh2.getClass();
        }
        ji2.f46106c.b(ihA);
        this.f46644c.info("Unhandled exception received: " + nn2, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Nn nnA;
        Xe xe2 = this.f46653l;
        if (pluginErrorDetails != null) {
            nnA = xe2.a(pluginErrorDetails);
        } else {
            xe2.getClass();
            nnA = null;
        }
        Qg qg2 = new Qg(str, nnA);
        Ji ji2 = this.f46649h;
        byte[] byteArray = MessageNano.toByteArray(this.f46646e.fromModel(qg2));
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(byteArray, str, 5896, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46644c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3685mb, io.appmetrica.analytics.impl.InterfaceC3473e0
    public final void a(U u13) {
        C3370a0 c3370a0 = new C3370a0(u13, (String) this.f46652k.f47382b.a(), (Boolean) this.f46652k.f47383c.a());
        Ji ji2 = this.f46649h;
        byte[] byteArray = MessageNano.toByteArray(this.f46648g.fromModel(c3370a0));
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(byteArray, "", 5968, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        String str = null;
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        PublicLogger publicLogger2 = this.f46644c;
        StringBuilder sb3 = new StringBuilder("ANR was reported ");
        C3871tn c3871tn = u13.f46589a;
        if (c3871tn != null) {
            str = "Thread[name=" + c3871tn.f48145a + ",tid={" + c3871tn.f48147c + ", priority=" + c3871tn.f48146b + ", group=" + c3871tn.f48148d + "}] at " + hg.jyumaefscl.iwxlajgraz(c3871tn.f48150f, "\n", null, null, 0, null, null, 62, null);
        }
        sb3.append(str);
        publicLogger2.info(sb3.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        H9 h13;
        if (f46640n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i13 = X8.f46764a[moduleEvent.getCategory().ordinal()];
        if (i13 == 1) {
            h13 = H9.NATIVE;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h13 = H9.SYSTEM;
        }
        c3579i4.f47642l = h13;
        c3579i4.f47633c = Bb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            c3579i4.f47646p = moduleEvent.getExtras();
        }
        this.f46649h.a(c3579i4, this.f46643b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Nn nnA;
        Xe xe2 = this.f46653l;
        if (pluginErrorDetails != null) {
            nnA = xe2.a(pluginErrorDetails);
        } else {
            xe2.getClass();
            nnA = null;
        }
        P6 p13 = new P6(new Qg(str2, nnA), str);
        Ji ji2 = this.f46649h;
        byte[] byteArray = MessageNano.toByteArray(this.f46647f.fromModel(p13));
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(byteArray, str2, 5896, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46644c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final void a(String str) {
        Ji ji2 = this.f46649h;
        C3655l6 c3655l6A = C3655l6.a(str);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3655l6A, sh2), sh2, 1, null);
    }
}

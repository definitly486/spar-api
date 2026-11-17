package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3883ua {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3883ua f48195c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f48197b = new HashMap();

    public C3883ua(Context context) {
        this.f48196a = context;
    }

    public static final C3883ua a(Context context) {
        if (f48195c == null) {
            synchronized (kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(C3883ua.class)) {
                try {
                    if (f48195c == null) {
                        f48195c = new C3883ua(context);
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C3883ua c3883ua = f48195c;
        if (c3883ua != null) {
            return c3883ua;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("INSTANCE");
        return null;
    }

    public final synchronized S9 b(String str) {
        Object s13;
        try {
            HashMap map = this.f48197b;
            s13 = map.get(str);
            if (s13 == null) {
                s13 = new S9(this.f48196a, str);
                map.put(str, s13);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (S9) s13;
    }

    public final synchronized void a(String str) {
        this.f48197b.remove(str);
    }
}

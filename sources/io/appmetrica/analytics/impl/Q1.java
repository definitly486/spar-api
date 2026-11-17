package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ka f46405a = new Ka();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f46406b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f46407c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f46405a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f46406b.entrySet()) {
                P1 p13 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p13.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Ka ka3 = this.f46405a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) ka3.f46140a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && ka3.f46141b) {
                        ka3.f46140a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f46407c.entrySet()) {
                P1 p13 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p13.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i13) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f46405a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f46406b.entrySet()) {
                P1 p13 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p13.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i13, int i14) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(P1 p13) {
        this.f46407c.put(p13, new O1() { // from class: io.appmetrica.analytics.impl.agtfadlqog
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.a(this.f46922iobyxmoadg, intent);
            }
        });
    }

    public static final boolean a(Q1 q13, Intent intent) {
        Collection collection;
        q13.getClass();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((collection = (Collection) q13.f46405a.f46140a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    public final void c(P1 p13) {
        this.f46406b.put(p13, new O1() { // from class: io.appmetrica.analytics.impl.wflxmlrfwp
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.c(this.f48331iobyxmoadg, intent);
            }
        });
    }

    public static final boolean c(Q1 q13, Intent intent) {
        q13.getClass();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void b(P1 p13) {
        this.f46406b.put(p13, new O1() { // from class: io.appmetrica.analytics.impl.draadjrbmk
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.b(this.f47134iobyxmoadg, intent);
            }
        });
    }

    public static final boolean b(Q1 q13, Intent intent) {
        Collection collection;
        q13.getClass();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) q13.f46405a.f46140a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter("pid");
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}

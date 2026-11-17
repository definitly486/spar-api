package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.impl.Aj;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC3899v1;
import io.appmetrica.analytics.impl.C1;
import io.appmetrica.analytics.impl.C3694mk;
import io.appmetrica.analytics.impl.C3874u1;
import io.appmetrica.analytics.impl.C3974y1;
import io.appmetrica.analytics.impl.C3978y5;
import io.appmetrica.analytics.impl.C4017zj;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.I1;
import io.appmetrica.analytics.impl.Ia;
import io.appmetrica.analytics.impl.J1;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static I1 f48641c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3874u1 f48642a = new C3874u1(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48643b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC3899v1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f48643b : new BinderC3899v1();
        I1 i13 = f48641c;
        i13.f45962a.execute(new C1(i13, intent));
        return binderC3899v1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I1 i13 = f48641c;
        i13.f45962a.execute(new C3974y1(i13, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Ia.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        I1 i13 = f48641c;
        if (i13 == null) {
            Context applicationContext = getApplicationContext();
            J1 j13 = new J1(applicationContext, this.f48642a, new C3978y5(applicationContext));
            C3694mk c3694mk = Ia.F.f46025v;
            M1 m13 = new M1(j13);
            LinkedHashMap linkedHashMap = c3694mk.f47714a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(m13);
            f48641c = new I1(Ia.F.f46007d.b(), j13);
        } else {
            i13.f45963b.a(this.f48642a);
        }
        Ia ia3 = Ia.F;
        Aj aj2 = new Aj(f48641c);
        synchronized (ia3) {
            ia3.f46009f = new C4017zj(ia3.f46004a, aj2);
        }
        f48641c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f48641c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        I1 i13 = f48641c;
        i13.f45962a.execute(new D1(i13, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i13) {
        I1 i14 = f48641c;
        i14.f45962a.execute(new A1(i14, intent, i13));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i13, int i14) {
        I1 i15 = f48641c;
        i15.f45962a.execute(new B1(i15, intent, i13, i14));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        I1 i13 = f48641c;
        i13.f45962a.execute(new E1(i13, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class J1 implements InterfaceC3949x1, InterfaceC3749p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3924w1 f46044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3927w4 f46045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q1 f46046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3516fh f46047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4008za f46048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3676m2 f46049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final K1 f46050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3791qh f46051j;

    public J1(Context context, InterfaceC3924w1 interfaceC3924w1) {
        this(context, interfaceC3924w1, new C3978y5(context));
    }

    public final void a() {
        this.f46046e.c(new P1() { // from class: io.appmetrica.analytics.impl.btonecajqb
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                this.f46999iobyxmoadg.d(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void b(Intent intent) {
        this.f46046e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int i13 = Integer.parseInt(data.getQueryParameter("pid"));
            this.f46045d.a(encodedAuthority, Integer.valueOf(i13), data.getQueryParameter("psid"));
            this.f46049h.a(i13);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void c(Intent intent) {
        Q1 q13 = this.f46046e;
        if (intent == null) {
            q13.getClass();
            return;
        }
        q13.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            q13.f46405a.a(action, Integer.valueOf(Q1.a(intent)));
        }
        for (Map.Entry entry : q13.f46406b.entrySet()) {
            P1 p13 = (P1) entry.getKey();
            if (((O1) entry.getValue()).a(intent)) {
                p13.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        Ia.F.u().a(Bb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void onConfigurationChanged(Configuration configuration) {
        Ia.F.u().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void onCreate() {
        if (this.f46042a) {
            Ia.F.u().a(this.f46043b.getResources().getConfiguration());
        } else {
            this.f46048g.b(this.f46043b);
            Ia ia3 = Ia.F;
            synchronized (ia3) {
                ia3.B.initAsync();
                ia3.f46024u.a(ia3.f46004a);
                ia3.f46024u.a(new go(ia3.B));
                NetworkServiceLocator.init(new A5(new Ci(ia3.g()), new K5(ia3.f46004a)));
                ia3.k().a(ia3.f46020q);
                ia3.C();
            }
            AbstractC3545gk.f47346a.e();
            C3572hm c3572hm = Ia.F.f46024u;
            c3572hm.b();
            C3521fm c3521fmB = c3572hm.b();
            C3993yk c3993ykO = Ia.F.o();
            c3993ykO.a(new C3644kk(new C3911vd(this.f46046e)), c3521fmB);
            c3572hm.a(c3993ykO);
            ((Al) Ia.F.y()).getClass();
            a();
            Ia.F.l().init();
            Ia.F.b().init();
            K1 k13 = this.f46050i;
            Context context = this.f46043b;
            C3927w4 c3927w4 = this.f46045d;
            k13.getClass();
            this.f46047f = new C3516fh(context, c3927w4);
            Context context2 = this.f46043b;
            AbstractC3775q1.f47908a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f46043b;
            C3516fh c3516fh = this.f46047f;
            C3462de c3462deQ = Ia.j().q();
            IHandlerExecutor iHandlerExecutorE = Ia.j().w().e();
            C6 c13 = new C6(context3, c3516fh, EnumC3934wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new W(), new BlockingExecutor(), "previous");
            C6 c14 = new C6(context3, c3516fh, EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Hb(), iHandlerExecutorE, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                A6 a13 = new A6(crashesDirectory, c14, new C3908va());
                iHandlerExecutorE.execute(new RunnableC3566hg(crashesDirectory, c13));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                a13.startWatching();
                Ia.F.E.storeReference(a13);
            }
            c3462deQ.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                c3462deQ.f47099a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = c3462deQ.f47099a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Yd ydB = c3462deQ.f47100b.b(context3, c3516fh);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        ydB.newCrash((NativeCrash) it.next());
                    }
                }
                c3462deQ.f47099a.setDefaultCrashHandler(c3462deQ.f47100b.a(context3, c3516fh));
            }
            new RunnableC3479e6(hg.jyumaefscl.eablkybsjg(new RunnableC3666lh())).run();
            this.f46042a = true;
        }
        Ia.F.k().a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void onDestroy() {
        C3382ac c3382acK = Ia.F.k();
        synchronized (c3382acK) {
            Iterator it = c3382acK.f46915c.iterator();
            while (it.hasNext()) {
                ((InterfaceC3843sk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void pauseUserSession(Bundle bundle) {
        Pf pf2;
        bundle.setClassLoader(Pf.class.getClassLoader());
        String str = Pf.f46388c;
        try {
            pf2 = (Pf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            pf2 = null;
        }
        Integer asInteger = pf2 != null ? pf2.f46389a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f46049h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void reportData(int i13, Bundle bundle) {
        this.f46051j.getClass();
        List listWflxmlrfwp = (List) Ia.F.f46025v.f47714a.get(Integer.valueOf(i13));
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        if (listWflxmlrfwp.isEmpty()) {
            return;
        }
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            ((InterfaceC3669lk) it.next()).reportData(i13, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void resumeUserSession(Bundle bundle) {
        Pf pf2;
        bundle.setClassLoader(Pf.class.getClassLoader());
        String str = Pf.f46388c;
        try {
            pf2 = (Pf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            pf2 = null;
        }
        Integer asInteger = pf2 != null ? pf2.f46389a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f46049h.c(asInteger.intValue());
        }
    }

    public J1(Context context, InterfaceC3924w1 interfaceC3924w1, C3978y5 c3978y5) {
        this(context, interfaceC3924w1, new C3927w4(context, c3978y5), new Q1(), C4008za.f48597d, Ia.j().d(), new K1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(Intent intent) {
        Q1 q13 = this.f46046e;
        if (intent == null) {
            q13.getClass();
            return;
        }
        q13.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            q13.f46405a.a(action, Integer.valueOf(Q1.a(intent)));
        }
        for (Map.Entry entry : q13.f46406b.entrySet()) {
            P1 p13 = (P1) entry.getKey();
            if (((O1) entry.getValue()).a(intent)) {
                p13.a(intent);
            }
        }
    }

    public J1(Context context, InterfaceC3924w1 interfaceC3924w1, C3927w4 c3927w4, Q1 q13, C4008za c4008za, C3676m2 c3676m2, K1 k13) {
        this.f46042a = false;
        this.f46043b = context;
        this.f46044c = interfaceC3924w1;
        this.f46045d = c3927w4;
        this.f46046e = q13;
        this.f46048g = c4008za;
        this.f46049h = c3676m2;
        this.f46050i = k13;
        this.f46051j = new C3791qh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C3655l6.b(bundle);
        C3516fh c3516fh = this.f46047f;
        if (c3516fh != null) {
            c3516fh.a(C3655l6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(InterfaceC3924w1 interfaceC3924w1) {
        this.f46044c = interfaceC3924w1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(Intent intent, int i13) {
        ((C3874u1) this.f46044c).f48153a.stopSelfResult(i13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3949x1
    public final void a(Intent intent, int i13, int i14) {
        ((C3874u1) this.f46044c).f48153a.stopSelfResult(i14);
    }
}

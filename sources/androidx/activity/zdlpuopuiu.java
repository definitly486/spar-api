package androidx.activity;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f2361eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f2362gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f2363iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f2364lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Runnable f2365nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f2366ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f2367wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f2368zoijcleaow;

    public zdlpuopuiu(Executor executor, tg.iobyxmoadg reportFullyDrawn) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reportFullyDrawn, "reportFullyDrawn");
        this.f2363iobyxmoadg = executor;
        this.f2368zoijcleaow = reportFullyDrawn;
        this.f2366ppxfxbqfkf = new Object();
        this.f2364lqeggnwhkg = new ArrayList();
        this.f2365nufgyqmvbu = new Runnable() { // from class: androidx.activity.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                zdlpuopuiu.wkgbmnqykc(this.f2326zdlpuopuiu);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(zdlpuopuiu this$0) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        synchronized (this$0.f2366ppxfxbqfkf) {
            try {
                this$0.f2361eablkybsjg = false;
                if (this$0.f2367wkgbmnqykc == 0 && !this$0.f2362gxszxtbevo) {
                    this$0.f2368zoijcleaow.invoke();
                    this$0.zoijcleaow();
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean ppxfxbqfkf() {
        boolean z13;
        synchronized (this.f2366ppxfxbqfkf) {
            z13 = this.f2362gxszxtbevo;
        }
        return z13;
    }

    public final void zoijcleaow() {
        synchronized (this.f2366ppxfxbqfkf) {
            try {
                this.f2362gxszxtbevo = true;
                Iterator it = this.f2364lqeggnwhkg.iterator();
                while (it.hasNext()) {
                    ((tg.iobyxmoadg) it.next()).invoke();
                }
                this.f2364lqeggnwhkg.clear();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

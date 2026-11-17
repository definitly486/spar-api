package n5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import gg.wwaezpbzkn;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final iobyxmoadg f68883wflxmlrfwp = new iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f68884btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final Runnable f68885draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private u5.lqeggnwhkg f68886dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f68887eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final Runnable f68888gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Executor f68889gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public u5.nufgyqmvbu f68890iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f68891lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f68892nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Runnable f68893ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f68894wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f68895zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(long j13, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloseTimeUnit, "autoCloseTimeUnit");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloseExecutor, "autoCloseExecutor");
        this.f68895zoijcleaow = new Handler(Looper.getMainLooper());
        this.f68894wkgbmnqykc = new Object();
        this.f68887eablkybsjg = autoCloseTimeUnit.toMillis(j13);
        this.f68889gxszxtbevo = autoCloseExecutor;
        this.f68892nufgyqmvbu = SystemClock.uptimeMillis();
        this.f68888gtknphoqwx = new Runnable() { // from class: n5.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                ppxfxbqfkf.gxszxtbevo(this.f68809zdlpuopuiu);
            }
        };
        this.f68885draadjrbmk = new Runnable() { // from class: n5.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                ppxfxbqfkf.ppxfxbqfkf(this.f68944zdlpuopuiu);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(ppxfxbqfkf this$0) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.f68889gxszxtbevo.execute(this$0.f68885draadjrbmk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(ppxfxbqfkf this$0) {
        wwaezpbzkn wwaezpbzknVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        synchronized (this$0.f68894wkgbmnqykc) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f68892nufgyqmvbu < this$0.f68887eablkybsjg) {
                    return;
                }
                if (this$0.f68891lqeggnwhkg != 0) {
                    return;
                }
                Runnable runnable = this$0.f68893ppxfxbqfkf;
                if (runnable != null) {
                    runnable.run();
                    wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    wwaezpbzknVar = null;
                }
                if (wwaezpbzknVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                u5.lqeggnwhkg lqeggnwhkgVar = this$0.f68886dxjokdxxww;
                if (lqeggnwhkgVar != null && lqeggnwhkgVar.isOpen()) {
                    lqeggnwhkgVar.close();
                }
                this$0.f68886dxjokdxxww = null;
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u5.lqeggnwhkg btonecajqb() {
        synchronized (this.f68894wkgbmnqykc) {
            this.f68895zoijcleaow.removeCallbacks(this.f68888gtknphoqwx);
            this.f68891lqeggnwhkg++;
            if (this.f68884btonecajqb) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            u5.lqeggnwhkg lqeggnwhkgVar = this.f68886dxjokdxxww;
            if (lqeggnwhkgVar != null && lqeggnwhkgVar.isOpen()) {
                return lqeggnwhkgVar;
            }
            u5.lqeggnwhkg writableDatabase = dxjokdxxww().getWritableDatabase();
            this.f68886dxjokdxxww = writableDatabase;
            return writableDatabase;
        }
    }

    public final void draadjrbmk(Runnable onAutoClose) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAutoClose, "onAutoClose");
        this.f68893ppxfxbqfkf = onAutoClose;
    }

    public final u5.nufgyqmvbu dxjokdxxww() {
        u5.nufgyqmvbu nufgyqmvbuVar = this.f68890iobyxmoadg;
        if (nufgyqmvbuVar != null) {
            return nufgyqmvbuVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("delegateOpenHelper");
        return null;
    }

    public final void eablkybsjg() {
        synchronized (this.f68894wkgbmnqykc) {
            try {
                int i13 = this.f68891lqeggnwhkg;
                if (i13 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i14 = i13 - 1;
                this.f68891lqeggnwhkg = i14;
                if (i14 == 0) {
                    if (this.f68886dxjokdxxww == null) {
                        return;
                    } else {
                        this.f68895zoijcleaow.postDelayed(this.f68888gtknphoqwx, this.f68887eablkybsjg);
                    }
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void gtknphoqwx(u5.nufgyqmvbu delegateOpenHelper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegateOpenHelper, "delegateOpenHelper");
        wflxmlrfwp(delegateOpenHelper);
    }

    public final Object lqeggnwhkg(tg.draadjrbmk block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        try {
            return block.invoke(btonecajqb());
        } finally {
            eablkybsjg();
        }
    }

    public final u5.lqeggnwhkg nufgyqmvbu() {
        return this.f68886dxjokdxxww;
    }

    public final void wflxmlrfwp(u5.nufgyqmvbu nufgyqmvbuVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<set-?>");
        this.f68890iobyxmoadg = nufgyqmvbuVar;
    }

    public final void wkgbmnqykc() {
        synchronized (this.f68894wkgbmnqykc) {
            try {
                this.f68884btonecajqb = true;
                u5.lqeggnwhkg lqeggnwhkgVar = this.f68886dxjokdxxww;
                if (lqeggnwhkgVar != null) {
                    lqeggnwhkgVar.close();
                }
                this.f68886dxjokdxxww = null;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

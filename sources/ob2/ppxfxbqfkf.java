package ob2;

import android.os.Handler;
import android.os.Looper;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f72563iobyxmoadg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gtknphoqwx f72566zoijcleaow = draadjrbmk.zoijcleaow(C1573ppxfxbqfkf.f72568zdlpuopuiu);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gtknphoqwx f72564ppxfxbqfkf = draadjrbmk.zoijcleaow(wkgbmnqykc.f72569zdlpuopuiu);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final gtknphoqwx f72565wkgbmnqykc = draadjrbmk.zoijcleaow(zoijcleaow.f72570zdlpuopuiu);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final gtknphoqwx f72561eablkybsjg = draadjrbmk.zoijcleaow(iobyxmoadg.f72567zdlpuopuiu);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ob2.iobyxmoadg f72562gxszxtbevo = dxjokdxxww.f72553iobyxmoadg;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f72567zdlpuopuiu = new iobyxmoadg();

        /* JADX INFO: renamed from: ob2.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1572iobyxmoadg implements ob2.iobyxmoadg {
            C1572iobyxmoadg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void ppxfxbqfkf(tg.iobyxmoadg tmp0) {
                zdlpuopuiu.btonecajqb(tmp0, "$tmp0");
                tmp0.invoke();
            }

            @Override // ob2.iobyxmoadg
            public void iobyxmoadg(final tg.iobyxmoadg block) {
                zdlpuopuiu.btonecajqb(block, "block");
                ppxfxbqfkf.f72563iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: ob2.zoijcleaow
                    @Override // java.lang.Runnable
                    public final void run() {
                        ppxfxbqfkf.iobyxmoadg.C1572iobyxmoadg.ppxfxbqfkf(block);
                    }
                });
            }
        }

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final C1572iobyxmoadg invoke() {
            return new C1572iobyxmoadg();
        }
    }

    /* JADX INFO: renamed from: ob2.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C1573ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C1573ppxfxbqfkf f72568zdlpuopuiu = new C1573ppxfxbqfkf();

        C1573ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScheduledThreadPoolExecutor invoke() {
            return new ScheduledThreadPoolExecutor(1);
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f72569zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f72570zdlpuopuiu = new zoijcleaow();

        public static final class iobyxmoadg implements ob2.iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ Handler f72571iobyxmoadg;

            iobyxmoadg(Handler handler) {
                this.f72571iobyxmoadg = handler;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void ppxfxbqfkf(tg.iobyxmoadg tmp0) {
                zdlpuopuiu.btonecajqb(tmp0, "$tmp0");
                tmp0.invoke();
            }

            @Override // ob2.iobyxmoadg
            public void iobyxmoadg(final tg.iobyxmoadg block) {
                zdlpuopuiu.btonecajqb(block, "block");
                this.f72571iobyxmoadg.post(new Runnable() { // from class: ob2.wkgbmnqykc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ppxfxbqfkf.zoijcleaow.iobyxmoadg.ppxfxbqfkf(block);
                    }
                });
            }
        }

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final iobyxmoadg invoke() {
            return new iobyxmoadg(new Handler(Looper.getMainLooper()));
        }
    }

    private ppxfxbqfkf() {
    }

    private final ob2.iobyxmoadg ppxfxbqfkf() {
        return (ob2.iobyxmoadg) f72561eablkybsjg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor wkgbmnqykc() {
        return (ThreadPoolExecutor) f72564ppxfxbqfkf.getValue();
    }

    public final ob2.iobyxmoadg zoijcleaow() {
        ob2.iobyxmoadg iobyxmoadgVarIobyxmoadg = eablkybsjg.f72556iobyxmoadg.iobyxmoadg();
        return iobyxmoadgVarIobyxmoadg == null ? ppxfxbqfkf() : iobyxmoadgVarIobyxmoadg;
    }
}

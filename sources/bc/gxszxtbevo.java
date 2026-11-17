package bc;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import xb.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f15693eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static boolean f15694gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final eablkybsjg f15695iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final eablkybsjg f15696ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final eablkybsjg f15697wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final eablkybsjg f15698zoijcleaow;

    public static final class iobyxmoadg {

        /* synthetic */ class eablkybsjg extends vdvldrhtss implements tg.iobyxmoadg {
            eablkybsjg(Object obj) {
                super(0, obj, iobyxmoadg.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((iobyxmoadg) this.receiver).wflxmlrfwp());
            }
        }

        /* JADX INFO: renamed from: bc.gxszxtbevo$iobyxmoadg$gxszxtbevo, reason: collision with other inner class name */
        static final class C0271gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0271gxszxtbevo f15699zdlpuopuiu = new C0271gxszxtbevo();

            C0271gxszxtbevo() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + gxszxtbevo.f15693eablkybsjg.btonecajqb() + '.';
            }
        }

        /* JADX INFO: renamed from: bc.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        /* synthetic */ class C0272iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            C0272iobyxmoadg(Object obj) {
                super(0, obj, iobyxmoadg.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((iobyxmoadg) this.receiver).gtknphoqwx());
            }
        }

        /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements tg.iobyxmoadg {
            ppxfxbqfkf(Object obj) {
                super(0, obj, iobyxmoadg.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((iobyxmoadg) this.receiver).draadjrbmk());
            }
        }

        static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final wkgbmnqykc f15700zdlpuopuiu = new wkgbmnqykc();

            wkgbmnqykc() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + gxszxtbevo.f15693eablkybsjg.btonecajqb() + '.';
            }
        }

        static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final zoijcleaow f15701zdlpuopuiu = new zoijcleaow();

            zoijcleaow() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            public final String invoke() {
                return "Must be called on a background thread, was called on " + gxszxtbevo.f15693eablkybsjg.btonecajqb() + '.';
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String btonecajqb() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean draadjrbmk() {
            String threadName = btonecajqb();
            zdlpuopuiu.dxjokdxxww(threadName, "threadName");
            return kcexrzcfyt.sopmlzcsov(threadName, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean gtknphoqwx() {
            String threadName = btonecajqb();
            zdlpuopuiu.dxjokdxxww(threadName, "threadName");
            return kcexrzcfyt.sopmlzcsov(threadName, "Firebase Background Thread #", false, 2, null);
        }

        private final void nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
            if (((Boolean) iobyxmoadgVar.invoke()).booleanValue()) {
                return;
            }
            lqeggnwhkg.gxszxtbevo().zoijcleaow((String) iobyxmoadgVar2.invoke());
            dxjokdxxww();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean wflxmlrfwp() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void agtfadlqog(boolean z13) {
            gxszxtbevo.f15694gxszxtbevo = z13;
        }

        public final boolean dxjokdxxww() {
            return gxszxtbevo.f15694gxszxtbevo;
        }

        public final void eablkybsjg() {
            nufgyqmvbu(new C0272iobyxmoadg(this), zoijcleaow.f15701zdlpuopuiu);
        }

        public final void gxszxtbevo() {
            nufgyqmvbu(new ppxfxbqfkf(this), wkgbmnqykc.f15700zdlpuopuiu);
        }

        public final void lqeggnwhkg() {
            nufgyqmvbu(new eablkybsjg(this), C0271gxszxtbevo.f15699zdlpuopuiu);
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        zdlpuopuiu.btonecajqb(backgroundExecutorService, "backgroundExecutorService");
        zdlpuopuiu.btonecajqb(blockingExecutorService, "blockingExecutorService");
        this.f15695iobyxmoadg = new eablkybsjg(backgroundExecutorService);
        this.f15698zoijcleaow = new eablkybsjg(backgroundExecutorService);
        this.f15696ppxfxbqfkf = new eablkybsjg(backgroundExecutorService);
        this.f15697wkgbmnqykc = new eablkybsjg(blockingExecutorService);
    }

    public static final void eablkybsjg() {
        f15693eablkybsjg.lqeggnwhkg();
    }

    public static final void gxszxtbevo(boolean z13) {
        f15693eablkybsjg.agtfadlqog(z13);
    }

    public static final void ppxfxbqfkf() {
        f15693eablkybsjg.eablkybsjg();
    }

    public static final void wkgbmnqykc() {
        f15693eablkybsjg.gxszxtbevo();
    }
}

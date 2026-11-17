package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus extends pj.pkzmftpjix {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final androidx.compose.runtime.opjhrmiecq f6851cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final hg.wflxmlrfwp f6852cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f6853esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final wkgbmnqykc f6854istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f6855iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Handler f6856jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f6857lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f6858pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Choreographer f6859yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f6860zynmafqrjb;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final ppxfxbqfkf f6850yadqdtsiqt = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f6847iozdgvuglv = 8;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final gg.gtknphoqwx f6848lmojexxdyd = gg.draadjrbmk.zoijcleaow(iobyxmoadg.f6861zdlpuopuiu);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final ThreadLocal f6849wwaezpbzkn = new zoijcleaow();

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6861zdlpuopuiu = new iobyxmoadg();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.dsvhmnatus$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0114iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f6862zdlpuopuiu;

            C0114iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C0114iobyxmoadg(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f6862zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return Choreographer.getInstance();
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0114iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final lg.btonecajqb invoke() {
            dsvhmnatus dsvhmnatusVar = new dsvhmnatus(wypolnanlu.zoijcleaow() ? Choreographer.getInstance() : (Choreographer) pj.dxjokdxxww.eablkybsjg(pj.ikoacuggdj.ppxfxbqfkf(), new C0114iobyxmoadg(null)), q1.lqeggnwhkg.iobyxmoadg(Looper.getMainLooper()), null);
            return dsvhmnatusVar.plus(dsvhmnatusVar.tbqsvytpvh());
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lg.btonecajqb iobyxmoadg() {
            if (wypolnanlu.zoijcleaow()) {
                return zoijcleaow();
            }
            lg.btonecajqb btonecajqbVar = (lg.btonecajqb) dsvhmnatus.f6849wwaezpbzkn.get();
            if (btonecajqbVar != null) {
                return btonecajqbVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final lg.btonecajqb zoijcleaow() {
            return (lg.btonecajqb) dsvhmnatus.f6848lmojexxdyd.getValue();
        }

        private ppxfxbqfkf() {
        }
    }

    public static final class wkgbmnqykc implements Choreographer.FrameCallback, Runnable {
        wkgbmnqykc() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j13) {
            dsvhmnatus.this.f6856jyumaefscl.removeCallbacks(this);
            dsvhmnatus.this.wizcaqwiak();
            dsvhmnatus.this.lxfrhoxuzk(j13);
        }

        @Override // java.lang.Runnable
        public void run() {
            dsvhmnatus.this.wizcaqwiak();
            Object obj = dsvhmnatus.this.f6855iwizpuwonk;
            dsvhmnatus dsvhmnatusVar = dsvhmnatus.this;
            synchronized (obj) {
                try {
                    if (dsvhmnatusVar.f6853esjtqupxsv.isEmpty()) {
                        dsvhmnatusVar.nuxfzjnpeb().removeFrameCallback(this);
                        dsvhmnatusVar.f6860zynmafqrjb = false;
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class zoijcleaow extends ThreadLocal {
        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public lg.btonecajqb initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            dsvhmnatus dsvhmnatusVar = new dsvhmnatus(choreographer, q1.lqeggnwhkg.iobyxmoadg(looperMyLooper), null);
            return dsvhmnatusVar.plus(dsvhmnatusVar.tbqsvytpvh());
        }
    }

    public /* synthetic */ dsvhmnatus(Choreographer choreographer, Handler handler, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(choreographer, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(long j13) {
        synchronized (this.f6855iwizpuwonk) {
            if (this.f6860zynmafqrjb) {
                this.f6860zynmafqrjb = false;
                List list = this.f6853esjtqupxsv;
                this.f6853esjtqupxsv = this.f6857lereixgezr;
                this.f6857lereixgezr = list;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((Choreographer.FrameCallback) list.get(i13)).doFrame(j13);
                }
                list.clear();
            }
        }
    }

    private final Runnable uawqvzlxes() {
        Runnable runnable;
        synchronized (this.f6855iwizpuwonk) {
            runnable = (Runnable) this.f6852cqumvgiudr.lereixgezr();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak() {
        boolean z13;
        do {
            Runnable runnableUawqvzlxes = uawqvzlxes();
            while (runnableUawqvzlxes != null) {
                runnableUawqvzlxes.run();
                runnableUawqvzlxes = uawqvzlxes();
            }
            synchronized (this.f6855iwizpuwonk) {
                if (this.f6852cqumvgiudr.isEmpty()) {
                    z13 = false;
                    this.f6858pmvmpeiblj = false;
                } else {
                    z13 = true;
                }
            }
        } while (z13);
    }

    public final void ageimvtcrz(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f6855iwizpuwonk) {
            this.f6853esjtqupxsv.remove(frameCallback);
        }
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        synchronized (this.f6855iwizpuwonk) {
            try {
                this.f6852cqumvgiudr.addLast(runnable);
                if (!this.f6858pmvmpeiblj) {
                    this.f6858pmvmpeiblj = true;
                    this.f6856jyumaefscl.post(this.f6854istkbnxepw);
                    if (!this.f6860zynmafqrjb) {
                        this.f6860zynmafqrjb = true;
                        this.f6859yggfygwlhe.postFrameCallback(this.f6854istkbnxepw);
                    }
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void hszhottldk(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f6855iwizpuwonk) {
            try {
                this.f6853esjtqupxsv.add(frameCallback);
                if (!this.f6860zynmafqrjb) {
                    this.f6860zynmafqrjb = true;
                    this.f6859yggfygwlhe.postFrameCallback(this.f6854istkbnxepw);
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Choreographer nuxfzjnpeb() {
        return this.f6859yggfygwlhe;
    }

    public final androidx.compose.runtime.opjhrmiecq tbqsvytpvh() {
        return this.f6851cdpycssgdh;
    }

    private dsvhmnatus(Choreographer choreographer, Handler handler) {
        this.f6859yggfygwlhe = choreographer;
        this.f6856jyumaefscl = handler;
        this.f6855iwizpuwonk = new Object();
        this.f6852cqumvgiudr = new hg.wflxmlrfwp();
        this.f6853esjtqupxsv = new ArrayList();
        this.f6857lereixgezr = new ArrayList();
        this.f6854istkbnxepw = new wkgbmnqykc();
        this.f6851cdpycssgdh = new stevsuqkhv(choreographer, this);
    }
}

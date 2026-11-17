package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt implements vdvldrhtss {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Handler f9579cqumvgiudr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f9585yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f9586zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final iobyxmoadg f9578zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final yadqdtsiqt f9577istkbnxepw = new yadqdtsiqt();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f9582jyumaefscl = true;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f9581iwizpuwonk = true;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final kcexrzcfyt f9580esjtqupxsv = new kcexrzcfyt(this);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Runnable f9583lereixgezr = new Runnable() { // from class: androidx.lifecycle.cdpycssgdh
        @Override // java.lang.Runnable
        public final void run() {
            yadqdtsiqt.eablkybsjg(this.f9423zdlpuopuiu);
        }
    };

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final wwaezpbzkn.iobyxmoadg f9584pmvmpeiblj = new zoijcleaow();

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final vdvldrhtss iobyxmoadg() {
            return yadqdtsiqt.f9577istkbnxepw;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements wwaezpbzkn.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // androidx.lifecycle.wwaezpbzkn.iobyxmoadg
        public void onCreate() {
        }

        @Override // androidx.lifecycle.wwaezpbzkn.iobyxmoadg
        public void onResume() {
            yadqdtsiqt.this.ppxfxbqfkf();
        }

        @Override // androidx.lifecycle.wwaezpbzkn.iobyxmoadg
        public void onStart() {
            yadqdtsiqt.this.wkgbmnqykc();
        }
    }

    private yadqdtsiqt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.gxszxtbevo();
        yadqdtsiqtVar.lqeggnwhkg();
    }

    public static final vdvldrhtss nufgyqmvbu() {
        return f9578zynmafqrjb.iobyxmoadg();
    }

    @Override // androidx.lifecycle.vdvldrhtss
    public gtknphoqwx getLifecycle() {
        return this.f9580esjtqupxsv;
    }

    public final void gxszxtbevo() {
        if (this.f9585yggfygwlhe == 0) {
            this.f9582jyumaefscl = true;
            this.f9580esjtqupxsv.dxjokdxxww(gtknphoqwx.iobyxmoadg.ON_PAUSE);
        }
    }

    public final void lqeggnwhkg() {
        if (this.f9586zdlpuopuiu == 0 && this.f9582jyumaefscl) {
            this.f9580esjtqupxsv.dxjokdxxww(gtknphoqwx.iobyxmoadg.ON_STOP);
            this.f9581iwizpuwonk = true;
        }
    }

    public final void ppxfxbqfkf() {
        int i13 = this.f9585yggfygwlhe + 1;
        this.f9585yggfygwlhe = i13;
        if (i13 == 1) {
            if (this.f9582jyumaefscl) {
                this.f9580esjtqupxsv.dxjokdxxww(gtknphoqwx.iobyxmoadg.ON_RESUME);
                this.f9582jyumaefscl = false;
            } else {
                Handler handler = this.f9579cqumvgiudr;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(handler);
                handler.removeCallbacks(this.f9583lereixgezr);
            }
        }
    }

    public final void wkgbmnqykc() {
        int i13 = this.f9586zdlpuopuiu + 1;
        this.f9586zdlpuopuiu = i13;
        if (i13 == 1 && this.f9581iwizpuwonk) {
            this.f9580esjtqupxsv.dxjokdxxww(gtknphoqwx.iobyxmoadg.ON_START);
            this.f9581iwizpuwonk = false;
        }
    }
}

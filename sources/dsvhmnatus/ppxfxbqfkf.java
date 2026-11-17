package dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dsvhmnatus.iobyxmoadg f29452iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f29453ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f29454wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f29455zoijcleaow;

    ppxfxbqfkf(dsvhmnatus.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar, int i13) {
        this.f29452iobyxmoadg = iobyxmoadgVar;
        this.f29455zoijcleaow = wkgbmnqykcVar;
        this.f29453ppxfxbqfkf = zoijcleaowVar;
        this.f29454wkgbmnqykc = i13;
    }

    public int iobyxmoadg() {
        return this.f29454wkgbmnqykc;
    }

    public zoijcleaow ppxfxbqfkf() {
        return this.f29453ppxfxbqfkf;
    }

    public wkgbmnqykc wkgbmnqykc() {
        return this.f29455zoijcleaow;
    }

    public dsvhmnatus.iobyxmoadg zoijcleaow() {
        return this.f29452iobyxmoadg;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private dsvhmnatus.iobyxmoadg f29456iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private zoijcleaow f29457ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f29458wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private wkgbmnqykc f29459zoijcleaow;

        public iobyxmoadg() {
            this.f29456iobyxmoadg = dsvhmnatus.iobyxmoadg.f29448ppxfxbqfkf;
            this.f29459zoijcleaow = null;
            this.f29457ppxfxbqfkf = null;
            this.f29458wkgbmnqykc = 0;
        }

        public static iobyxmoadg zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            return new iobyxmoadg(ppxfxbqfkfVar);
        }

        public iobyxmoadg eablkybsjg(zoijcleaow zoijcleaowVar) {
            this.f29457ppxfxbqfkf = zoijcleaowVar;
            return this;
        }

        public iobyxmoadg gxszxtbevo(wkgbmnqykc wkgbmnqykcVar) {
            this.f29459zoijcleaow = wkgbmnqykcVar;
            return this;
        }

        public ppxfxbqfkf iobyxmoadg() {
            return new ppxfxbqfkf(this.f29456iobyxmoadg, this.f29459zoijcleaow, this.f29457ppxfxbqfkf, this.f29458wkgbmnqykc);
        }

        public iobyxmoadg ppxfxbqfkf(int i13) {
            this.f29458wkgbmnqykc = i13;
            return this;
        }

        public iobyxmoadg wkgbmnqykc(dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
            this.f29456iobyxmoadg = iobyxmoadgVar;
            return this;
        }

        private iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f29456iobyxmoadg = dsvhmnatus.iobyxmoadg.f29448ppxfxbqfkf;
            this.f29459zoijcleaow = null;
            this.f29457ppxfxbqfkf = null;
            this.f29458wkgbmnqykc = 0;
            this.f29456iobyxmoadg = ppxfxbqfkfVar.zoijcleaow();
            this.f29459zoijcleaow = ppxfxbqfkfVar.wkgbmnqykc();
            this.f29457ppxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
            this.f29458wkgbmnqykc = ppxfxbqfkfVar.iobyxmoadg();
        }
    }
}

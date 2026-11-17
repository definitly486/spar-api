package lereixgezr;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class metgxyhuhe extends roivzttewh {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final zoijcleaow f62325cqumvgiudr = new zoijcleaow();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Executor f62326esjtqupxsv = yadqdtsiqt.iobyxmoadg.wkgbmnqykc();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf f62327iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private jpowsppfya.wypolnanlu f62328jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private DeferrableSurface f62329kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    androidx.camera.core.impl.jyumaefscl.zoijcleaow f62330oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private ppxfxbqfkf f62331rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private Executor f62332vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    tbqsvytpvh f62333yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private jpowsppfya.wwaezpbzkn f62334zdlpuopuiu;

    public static final class iobyxmoadg implements androidx.camera.core.impl.istkbnxepw.iobyxmoadg, androidx.camera.core.impl.rgvfuqvkyq.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.camera.core.impl.oxmwwwfdhm f62335iobyxmoadg;

        public iobyxmoadg() {
            this(androidx.camera.core.impl.oxmwwwfdhm.jhduphickx());
        }

        static iobyxmoadg gxszxtbevo(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
            return new iobyxmoadg(androidx.camera.core.impl.oxmwwwfdhm.ikoacuggdj(btonecajqbVar));
        }

        public iobyxmoadg agtfadlqog(String str) {
            iobyxmoadg().vdvldrhtss(lmojexxdyd.btonecajqb.f63630iozdgvuglv, str);
            return this;
        }

        public iobyxmoadg btonecajqb(dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3855oxmwwwfdhm, ppxfxbqfkfVar);
            return this;
        }

        public iobyxmoadg draadjrbmk(int i13) {
            if (i13 == -1) {
                i13 = 0;
            }
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3850btonecajqb, Integer.valueOf(i13));
            return this;
        }

        public iobyxmoadg dxjokdxxww(iwizpuwonk iwizpuwonkVar) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.ojitshcjhn.f3843dxjokdxxww, iwizpuwonkVar);
            return this;
        }

        public metgxyhuhe eablkybsjg() {
            androidx.camera.core.impl.zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = wkgbmnqykc();
            androidx.camera.core.impl.rgvfuqvkyq.iwizpuwonk(zdlpuopuiuVarWkgbmnqykc);
            return new metgxyhuhe(zdlpuopuiuVarWkgbmnqykc);
        }

        public iobyxmoadg gtknphoqwx(int i13) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.istkbnxepw.f3793cqumvgiudr, Integer.valueOf(i13));
            return this;
        }

        @Override // lereixgezr.cqumvgiudr
        public androidx.camera.core.impl.vdvldrhtss iobyxmoadg() {
            return this.f62335iobyxmoadg;
        }

        @Override // androidx.camera.core.impl.istkbnxepw.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.zdlpuopuiu wkgbmnqykc() {
            return new androidx.camera.core.impl.zdlpuopuiu(androidx.camera.core.impl.kcexrzcfyt.ribwqtqdhb(this.f62335iobyxmoadg));
        }

        public iobyxmoadg nufgyqmvbu(androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.istkbnxepw.f3802zynmafqrjb, zoijcleaowVar);
            return this;
        }

        @Override // androidx.camera.core.impl.rgvfuqvkyq.iobyxmoadg
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg ppxfxbqfkf(Size size) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3849agtfadlqog, size);
            return this;
        }

        @Override // androidx.camera.core.impl.rgvfuqvkyq.iobyxmoadg
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg zoijcleaow(int i13) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3852gtknphoqwx, Integer.valueOf(i13));
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3851draadjrbmk, Integer.valueOf(i13));
            return this;
        }

        public iobyxmoadg wflxmlrfwp(Class cls) {
            iobyxmoadg().vdvldrhtss(lmojexxdyd.btonecajqb.f63631lmojexxdyd, cls);
            if (iobyxmoadg().lqeggnwhkg(lmojexxdyd.btonecajqb.f63630iozdgvuglv, null) == null) {
                agtfadlqog(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        private iobyxmoadg(androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVar) {
            this.f62335iobyxmoadg = oxmwwwfdhmVar;
            Class cls = (Class) oxmwwwfdhmVar.lqeggnwhkg(lmojexxdyd.btonecajqb.f63631lmojexxdyd, null);
            if (cls != null && !cls.equals(metgxyhuhe.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            nufgyqmvbu(androidx.camera.core.impl.cdpycssgdh.zoijcleaow.PREVIEW);
            wflxmlrfwp(metgxyhuhe.class);
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = androidx.camera.core.impl.rgvfuqvkyq.f3858wflxmlrfwp;
            if (((Integer) oxmwwwfdhmVar.lqeggnwhkg(iobyxmoadgVar, -1)).intValue() == -1) {
                oxmwwwfdhmVar.vdvldrhtss(iobyxmoadgVar, 2);
            }
        }
    }

    public interface ppxfxbqfkf {
        void iobyxmoadg(tbqsvytpvh tbqsvytpvhVar);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final dsvhmnatus.ppxfxbqfkf f62336iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final iwizpuwonk f62337ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final androidx.camera.core.impl.zdlpuopuiu f62338zoijcleaow;

        static {
            dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = new dsvhmnatus.ppxfxbqfkf.iobyxmoadg().wkgbmnqykc(dsvhmnatus.iobyxmoadg.f29448ppxfxbqfkf).gxszxtbevo(dsvhmnatus.wkgbmnqykc.f29460ppxfxbqfkf).iobyxmoadg();
            f62336iobyxmoadg = ppxfxbqfkfVarIobyxmoadg;
            iwizpuwonk iwizpuwonkVar = iwizpuwonk.f62291ppxfxbqfkf;
            f62337ppxfxbqfkf = iwizpuwonkVar;
            f62338zoijcleaow = new iobyxmoadg().gtknphoqwx(2).draadjrbmk(0).btonecajqb(ppxfxbqfkfVarIobyxmoadg).dxjokdxxww(iwizpuwonkVar).wkgbmnqykc();
        }

        public androidx.camera.core.impl.zdlpuopuiu iobyxmoadg() {
            return f62338zoijcleaow;
        }
    }

    metgxyhuhe(androidx.camera.core.impl.zdlpuopuiu zdlpuopuiuVar) {
        super(zdlpuopuiuVar);
        this.f62332vdvldrhtss = f62326esjtqupxsv;
    }

    private void czzsidtyhn() {
        istkbnxepw.iwizpuwonk iwizpuwonkVarLqeggnwhkg = lqeggnwhkg();
        jpowsppfya.wwaezpbzkn wwaezpbzknVar = this.f62334zdlpuopuiu;
        if (iwizpuwonkVarLqeggnwhkg == null || wwaezpbzknVar == null) {
            return;
        }
        wwaezpbzknVar.istkbnxepw(oxmwwwfdhm(iwizpuwonkVarLqeggnwhkg, istkbnxepw(iwizpuwonkVarLqeggnwhkg)), wkgbmnqykc());
    }

    private void ikoacuggdj() {
        androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar = this.f62327iwizpuwonk;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow();
            this.f62327iwizpuwonk = null;
        }
        DeferrableSurface deferrableSurface = this.f62329kcexrzcfyt;
        if (deferrableSurface != null) {
            deferrableSurface.wkgbmnqykc();
            this.f62329kcexrzcfyt = null;
        }
        jpowsppfya.wypolnanlu wypolnanluVar = this.f62328jyumaefscl;
        if (wypolnanluVar != null) {
            wypolnanluVar.nufgyqmvbu();
            this.f62328jyumaefscl = null;
        }
        jpowsppfya.wwaezpbzkn wwaezpbzknVar = this.f62334zdlpuopuiu;
        if (wwaezpbzknVar != null) {
            wwaezpbzknVar.dxjokdxxww();
            this.f62334zdlpuopuiu = null;
        }
        this.f62333yggfygwlhe = null;
    }

    private void jhduphickx(androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar) {
        if (this.f62331rgvfuqvkyq != null) {
            zoijcleaowVar.agtfadlqog(this.f62329kcexrzcfyt, iwizpuwonkVar.zoijcleaow(), rgvfuqvkyq(), agtfadlqog());
        }
        androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar = this.f62327iwizpuwonk;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow();
        }
        androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar2 = new androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf(new androidx.camera.core.impl.jyumaefscl.wkgbmnqykc() { // from class: lereixgezr.xrmfcynszj
            @Override // androidx.camera.core.impl.jyumaefscl.wkgbmnqykc
            public final void iobyxmoadg(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
                this.f62454iobyxmoadg.xrmfcynszj(jyumaefsclVar, lqeggnwhkgVar);
            }
        });
        this.f62327iwizpuwonk = ppxfxbqfkfVar2;
        zoijcleaowVar.oxmwwwfdhm(ppxfxbqfkfVar2);
    }

    private Rect jztzpxfvev(Size size) {
        if (pmvmpeiblj() != null) {
            return pmvmpeiblj();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    private androidx.camera.core.impl.jyumaefscl.zoijcleaow okpsazkaxt(androidx.camera.core.impl.zdlpuopuiu zdlpuopuiuVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        istkbnxepw.iwizpuwonk iwizpuwonkVarLqeggnwhkg = lqeggnwhkg();
        Objects.requireNonNull(iwizpuwonkVarLqeggnwhkg);
        istkbnxepw.iwizpuwonk iwizpuwonkVar2 = iwizpuwonkVarLqeggnwhkg;
        ikoacuggdj();
        u1.nufgyqmvbu.nufgyqmvbu(this.f62334zdlpuopuiu == null);
        Matrix matrixJyumaefscl = jyumaefscl();
        boolean zVdvldrhtss = iwizpuwonkVar2.vdvldrhtss();
        Rect rectJztzpxfvev = jztzpxfvev(iwizpuwonkVar.eablkybsjg());
        Objects.requireNonNull(rectJztzpxfvev);
        this.f62334zdlpuopuiu = new jpowsppfya.wwaezpbzkn(1, 34, iwizpuwonkVar, matrixJyumaefscl, zVdvldrhtss, rectJztzpxfvev, oxmwwwfdhm(iwizpuwonkVar2, istkbnxepw(iwizpuwonkVar2)), wkgbmnqykc(), ydmasvzmpa(iwizpuwonkVar2));
        draadjrbmk();
        this.f62334zdlpuopuiu.eablkybsjg(new Runnable() { // from class: lereixgezr.okpsazkaxt
            @Override // java.lang.Runnable
            public final void run() {
                this.f62349zdlpuopuiu.lmojexxdyd();
            }
        });
        tbqsvytpvh tbqsvytpvhVarGtknphoqwx = this.f62334zdlpuopuiu.gtknphoqwx(iwizpuwonkVar2);
        this.f62333yggfygwlhe = tbqsvytpvhVarGtknphoqwx;
        this.f62329kcexrzcfyt = tbqsvytpvhVarGtknphoqwx.wflxmlrfwp();
        if (this.f62331rgvfuqvkyq != null) {
            rlfsiqarku();
        }
        androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVarVdvldrhtss = androidx.camera.core.impl.jyumaefscl.zoijcleaow.vdvldrhtss(zdlpuopuiuVar, iwizpuwonkVar.eablkybsjg());
        zoijcleaowVarVdvldrhtss.kcexrzcfyt(iwizpuwonkVar.ppxfxbqfkf());
        zoijcleaowVarVdvldrhtss.iwizpuwonk(zdlpuopuiuVar.cdpycssgdh());
        if (iwizpuwonkVar.wkgbmnqykc() != null) {
            zoijcleaowVarVdvldrhtss.lqeggnwhkg(iwizpuwonkVar.wkgbmnqykc());
        }
        jhduphickx(zoijcleaowVarVdvldrhtss, iwizpuwonkVar);
        return zoijcleaowVarVdvldrhtss;
    }

    private void rlfsiqarku() {
        czzsidtyhn();
        final ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) u1.nufgyqmvbu.gxszxtbevo(this.f62331rgvfuqvkyq);
        final tbqsvytpvh tbqsvytpvhVar = (tbqsvytpvh) u1.nufgyqmvbu.gxszxtbevo(this.f62333yggfygwlhe);
        this.f62332vdvldrhtss.execute(new Runnable() { // from class: lereixgezr.jztzpxfvev
            @Override // java.lang.Runnable
            public final void run() {
                ppxfxbqfkfVar.iobyxmoadg(tbqsvytpvhVar);
            }
        });
    }

    private void sflfametgt(androidx.camera.core.impl.zdlpuopuiu zdlpuopuiuVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar) {
        androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVarOkpsazkaxt = okpsazkaxt(zdlpuopuiuVar, iwizpuwonkVar);
        this.f62330oxmwwwfdhm = zoijcleaowVarOkpsazkaxt;
        sopmlzcsov(istkbnxepw.iobyxmoadg(new Object[]{zoijcleaowVarOkpsazkaxt.rgvfuqvkyq()}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xrmfcynszj(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkg() == null) {
            return;
        }
        sflfametgt((androidx.camera.core.impl.zdlpuopuiu) btonecajqb(), eablkybsjg());
        lmojexxdyd();
    }

    private boolean ydmasvzmpa(istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        return iwizpuwonkVar.vdvldrhtss() && istkbnxepw(iwizpuwonkVar);
    }

    @Override // lereixgezr.roivzttewh
    protected androidx.camera.core.impl.iwizpuwonk cllcsxoeiz(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        this.f62330oxmwwwfdhm.lqeggnwhkg(btonecajqbVar);
        sopmlzcsov(istkbnxepw.iobyxmoadg(new Object[]{this.f62330oxmwwwfdhm.rgvfuqvkyq()}));
        return eablkybsjg().lqeggnwhkg().wkgbmnqykc(btonecajqbVar).iobyxmoadg();
    }

    @Override // lereixgezr.roivzttewh
    public Set cqumvgiudr() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // lereixgezr.roivzttewh
    protected androidx.camera.core.impl.iwizpuwonk dsvhmnatus(androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar2) {
        sflfametgt((androidx.camera.core.impl.zdlpuopuiu) btonecajqb(), iwizpuwonkVar);
        return iwizpuwonkVar;
    }

    @Override // lereixgezr.roivzttewh
    public androidx.camera.core.impl.istkbnxepw gtknphoqwx(boolean z13, androidx.camera.core.impl.cdpycssgdh cdpycssgdhVar) {
        zoijcleaow zoijcleaowVar = f62325cqumvgiudr;
        androidx.camera.core.impl.btonecajqb btonecajqbVarIobyxmoadg = cdpycssgdhVar.iobyxmoadg(zoijcleaowVar.iobyxmoadg().dsvhmnatus(), 1);
        if (z13) {
            btonecajqbVarIobyxmoadg = androidx.camera.core.impl.btonecajqb.wypolnanlu(btonecajqbVarIobyxmoadg, zoijcleaowVar.iobyxmoadg());
        }
        if (btonecajqbVarIobyxmoadg == null) {
            return null;
        }
        return lereixgezr(btonecajqbVarIobyxmoadg).wkgbmnqykc();
    }

    @Override // lereixgezr.roivzttewh
    protected androidx.camera.core.impl.istkbnxepw hcddaimhww(istkbnxepw.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.ojitshcjhn.f3844nufgyqmvbu, 34);
        return iobyxmoadgVar.wkgbmnqykc();
    }

    @Override // lereixgezr.roivzttewh
    public androidx.camera.core.impl.istkbnxepw.iobyxmoadg lereixgezr(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        return iobyxmoadg.gxszxtbevo(btonecajqbVar);
    }

    @Override // lereixgezr.roivzttewh
    public void ntlheqmsrt(Rect rect) {
        super.ntlheqmsrt(rect);
        czzsidtyhn();
    }

    public String toString() {
        return "Preview:" + ojitshcjhn();
    }

    public void uwvvkdfqfp(Executor executor, ppxfxbqfkf ppxfxbqfkfVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (ppxfxbqfkfVar == null) {
            this.f62331rgvfuqvkyq = null;
            iozdgvuglv();
            return;
        }
        this.f62331rgvfuqvkyq = ppxfxbqfkfVar;
        this.f62332vdvldrhtss = executor;
        if (gxszxtbevo() != null) {
            sflfametgt((androidx.camera.core.impl.zdlpuopuiu) btonecajqb(), eablkybsjg());
            lmojexxdyd();
        }
        yadqdtsiqt();
    }

    @Override // lereixgezr.roivzttewh
    public void wypolnanlu() {
        ikoacuggdj();
    }

    public void yfnezrywwk(ppxfxbqfkf ppxfxbqfkfVar) {
        uwvvkdfqfp(f62326esjtqupxsv, ppxfxbqfkfVar);
    }
}

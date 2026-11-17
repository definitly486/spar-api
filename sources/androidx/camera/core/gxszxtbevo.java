package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.cdpycssgdh;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.jyumaefscl;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import istkbnxepw.dsvhmnatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import lereixgezr.iwizpuwonk;
import lereixgezr.roivzttewh;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends roivzttewh {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    jyumaefscl.zoijcleaow f3696kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private iobyxmoadg f3697oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    final dxjokdxxww f3698rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final Object f3699vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private jyumaefscl.ppxfxbqfkf f3700yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private DeferrableSurface f3701zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final wkgbmnqykc f3695jyumaefscl = new wkgbmnqykc();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final Boolean f3694iwizpuwonk = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface eablkybsjg {
    }

    public interface iobyxmoadg {
        default Size ppxfxbqfkf() {
            return null;
        }

        void wkgbmnqykc(agtfadlqog agtfadlqogVar);
    }

    public static final class ppxfxbqfkf implements androidx.camera.core.impl.rgvfuqvkyq.iobyxmoadg, istkbnxepw.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.camera.core.impl.oxmwwwfdhm f3702iobyxmoadg;

        public ppxfxbqfkf() {
            this(androidx.camera.core.impl.oxmwwwfdhm.jhduphickx());
        }

        static ppxfxbqfkf gxszxtbevo(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
            return new ppxfxbqfkf(androidx.camera.core.impl.oxmwwwfdhm.ikoacuggdj(btonecajqbVar));
        }

        public ppxfxbqfkf agtfadlqog(int i13) {
            if (i13 == -1) {
                i13 = 0;
            }
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3850btonecajqb, Integer.valueOf(i13));
            return this;
        }

        public ppxfxbqfkf btonecajqb(Size size) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3854ojitshcjhn, size);
            return this;
        }

        public ppxfxbqfkf draadjrbmk(dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3855oxmwwwfdhm, ppxfxbqfkfVar);
            return this;
        }

        public ppxfxbqfkf dxjokdxxww(cdpycssgdh.zoijcleaow zoijcleaowVar) {
            iobyxmoadg().vdvldrhtss(istkbnxepw.f3802zynmafqrjb, zoijcleaowVar);
            return this;
        }

        public gxszxtbevo eablkybsjg() {
            androidx.camera.core.impl.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = wkgbmnqykc();
            androidx.camera.core.impl.rgvfuqvkyq.iwizpuwonk(wflxmlrfwpVarWkgbmnqykc);
            return new gxszxtbevo(wflxmlrfwpVarWkgbmnqykc);
        }

        public ppxfxbqfkf gtknphoqwx(iwizpuwonk iwizpuwonkVar) {
            if (!Objects.equals(iwizpuwonk.f62292wkgbmnqykc, iwizpuwonkVar)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.ojitshcjhn.f3843dxjokdxxww, iwizpuwonkVar);
            return this;
        }

        @Override // lereixgezr.cqumvgiudr
        public androidx.camera.core.impl.vdvldrhtss iobyxmoadg() {
            return this.f3702iobyxmoadg;
        }

        @Override // androidx.camera.core.impl.istkbnxepw.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.wflxmlrfwp wkgbmnqykc() {
            return new androidx.camera.core.impl.wflxmlrfwp(androidx.camera.core.impl.kcexrzcfyt.ribwqtqdhb(this.f3702iobyxmoadg));
        }

        public ppxfxbqfkf nufgyqmvbu(int i13) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.wflxmlrfwp.f3864pkzmftpjix, Integer.valueOf(i13));
            return this;
        }

        public ppxfxbqfkf ojitshcjhn(Class cls) {
            iobyxmoadg().vdvldrhtss(lmojexxdyd.btonecajqb.f63631lmojexxdyd, cls);
            if (iobyxmoadg().lqeggnwhkg(lmojexxdyd.btonecajqb.f63630iozdgvuglv, null) == null) {
                rgvfuqvkyq(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.impl.rgvfuqvkyq.iobyxmoadg
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf zoijcleaow(int i13) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3852gtknphoqwx, Integer.valueOf(i13));
            return this;
        }

        public ppxfxbqfkf rgvfuqvkyq(String str) {
            iobyxmoadg().vdvldrhtss(lmojexxdyd.btonecajqb.f63630iozdgvuglv, str);
            return this;
        }

        @Override // androidx.camera.core.impl.rgvfuqvkyq.iobyxmoadg
        /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf ppxfxbqfkf(Size size) {
            iobyxmoadg().vdvldrhtss(androidx.camera.core.impl.rgvfuqvkyq.f3849agtfadlqog, size);
            return this;
        }

        public ppxfxbqfkf wflxmlrfwp(int i13) {
            iobyxmoadg().vdvldrhtss(istkbnxepw.f3793cqumvgiudr, Integer.valueOf(i13));
            return this;
        }

        private ppxfxbqfkf(androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVar) {
            this.f3702iobyxmoadg = oxmwwwfdhmVar;
            Class cls = (Class) oxmwwwfdhmVar.lqeggnwhkg(lmojexxdyd.btonecajqb.f63631lmojexxdyd, null);
            if (cls == null || cls.equals(gxszxtbevo.class)) {
                dxjokdxxww(cdpycssgdh.zoijcleaow.IMAGE_ANALYSIS);
                ojitshcjhn(gxszxtbevo.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Size f3703iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final dsvhmnatus.ppxfxbqfkf f3704ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final androidx.camera.core.impl.wflxmlrfwp f3705wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final iwizpuwonk f3706zoijcleaow;

        static {
            Size size = new Size(640, 480);
            f3703iobyxmoadg = size;
            iwizpuwonk iwizpuwonkVar = iwizpuwonk.f62292wkgbmnqykc;
            f3706zoijcleaow = iwizpuwonkVar;
            dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = new dsvhmnatus.ppxfxbqfkf.iobyxmoadg().wkgbmnqykc(dsvhmnatus.iobyxmoadg.f29448ppxfxbqfkf).gxszxtbevo(new dsvhmnatus.wkgbmnqykc(hcddaimhww.ppxfxbqfkf.f40071ppxfxbqfkf, 1)).iobyxmoadg();
            f3704ppxfxbqfkf = ppxfxbqfkfVarIobyxmoadg;
            f3705wkgbmnqykc = new ppxfxbqfkf().btonecajqb(size).wflxmlrfwp(1).agtfadlqog(0).draadjrbmk(ppxfxbqfkfVarIobyxmoadg).gtknphoqwx(iwizpuwonkVar).wkgbmnqykc();
        }

        public androidx.camera.core.impl.wflxmlrfwp iobyxmoadg() {
            return f3705wkgbmnqykc;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface zoijcleaow {
    }

    gxszxtbevo(androidx.camera.core.impl.wflxmlrfwp wflxmlrfwpVar) {
        super(wflxmlrfwpVar);
        this.f3699vdvldrhtss = new Object();
        if (((androidx.camera.core.impl.wflxmlrfwp) btonecajqb()).crxdokpmqz(0) == 1) {
            this.f3698rgvfuqvkyq = new btonecajqb();
        } else {
            this.f3698rgvfuqvkyq = new gtknphoqwx(wflxmlrfwpVar.ntlheqmsrt(yadqdtsiqt.iobyxmoadg.zoijcleaow()));
        }
        this.f3698rgvfuqvkyq.zdlpuopuiu(uwvvkdfqfp());
        this.f3698rgvfuqvkyq.yggfygwlhe(ydmasvzmpa());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List oipsdeybqn(Size size, List list, int i13) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void sflfametgt(vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2) {
        vdvldrhtssVar.wflxmlrfwp();
        if (vdvldrhtssVar2 != null) {
            vdvldrhtssVar2.wflxmlrfwp();
        }
    }

    private void weqkydbzbr() {
        istkbnxepw.iwizpuwonk iwizpuwonkVarLqeggnwhkg = lqeggnwhkg();
        if (iwizpuwonkVarLqeggnwhkg != null) {
            this.f3698rgvfuqvkyq.iwizpuwonk(vdvldrhtss(iwizpuwonkVarLqeggnwhkg));
        }
    }

    private boolean yfnezrywwk(istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        return ydmasvzmpa() && vdvldrhtss(iwizpuwonkVar) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zfvoamnweg(jyumaefscl jyumaefsclVar, jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkg() == null) {
            return;
        }
        jztzpxfvev();
        this.f3698rgvfuqvkyq.lqeggnwhkg();
        jyumaefscl.zoijcleaow zoijcleaowVarXrmfcynszj = xrmfcynszj(dxjokdxxww(), (androidx.camera.core.impl.wflxmlrfwp) btonecajqb(), (androidx.camera.core.impl.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo(eablkybsjg()));
        this.f3696kcexrzcfyt = zoijcleaowVarXrmfcynszj;
        sopmlzcsov(lereixgezr.istkbnxepw.iobyxmoadg(new Object[]{zoijcleaowVarXrmfcynszj.rgvfuqvkyq()}));
        lmojexxdyd();
    }

    @Override // lereixgezr.roivzttewh
    protected androidx.camera.core.impl.iwizpuwonk cllcsxoeiz(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        this.f3696kcexrzcfyt.lqeggnwhkg(btonecajqbVar);
        sopmlzcsov(lereixgezr.istkbnxepw.iobyxmoadg(new Object[]{this.f3696kcexrzcfyt.rgvfuqvkyq()}));
        return eablkybsjg().lqeggnwhkg().wkgbmnqykc(btonecajqbVar).iobyxmoadg();
    }

    public Boolean czzsidtyhn() {
        return ((androidx.camera.core.impl.wflxmlrfwp) btonecajqb()).vipkmwdibw(f3694iwizpuwonk);
    }

    @Override // lereixgezr.roivzttewh
    protected androidx.camera.core.impl.iwizpuwonk dsvhmnatus(androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar2) {
        jyumaefscl.zoijcleaow zoijcleaowVarXrmfcynszj = xrmfcynszj(dxjokdxxww(), (androidx.camera.core.impl.wflxmlrfwp) btonecajqb(), iwizpuwonkVar);
        this.f3696kcexrzcfyt = zoijcleaowVarXrmfcynszj;
        sopmlzcsov(lereixgezr.istkbnxepw.iobyxmoadg(new Object[]{zoijcleaowVarXrmfcynszj.rgvfuqvkyq()}));
        return iwizpuwonkVar;
    }

    @Override // lereixgezr.roivzttewh
    public istkbnxepw gtknphoqwx(boolean z13, cdpycssgdh cdpycssgdhVar) {
        wkgbmnqykc wkgbmnqykcVar = f3695jyumaefscl;
        androidx.camera.core.impl.btonecajqb btonecajqbVarIobyxmoadg = cdpycssgdhVar.iobyxmoadg(wkgbmnqykcVar.iobyxmoadg().dsvhmnatus(), 1);
        if (z13) {
            btonecajqbVarIobyxmoadg = androidx.camera.core.impl.btonecajqb.wypolnanlu(btonecajqbVarIobyxmoadg, wkgbmnqykcVar.iobyxmoadg());
        }
        if (btonecajqbVarIobyxmoadg == null) {
            return null;
        }
        return lereixgezr(btonecajqbVarIobyxmoadg).wkgbmnqykc();
    }

    @Override // lereixgezr.roivzttewh
    protected istkbnxepw hcddaimhww(istkbnxepw.jyumaefscl jyumaefsclVar, istkbnxepw.iobyxmoadg iobyxmoadgVar) {
        final Size sizePpxfxbqfkf;
        Boolean boolCzzsidtyhn = czzsidtyhn();
        boolean zIobyxmoadg = jyumaefsclVar.nufgyqmvbu().iobyxmoadg(OnePixelShiftQuirk.class);
        dxjokdxxww dxjokdxxwwVar = this.f3698rgvfuqvkyq;
        if (boolCzzsidtyhn != null) {
            zIobyxmoadg = boolCzzsidtyhn.booleanValue();
        }
        dxjokdxxwwVar.kcexrzcfyt(zIobyxmoadg);
        synchronized (this.f3699vdvldrhtss) {
            try {
                iobyxmoadg iobyxmoadgVar2 = this.f3697oxmwwwfdhm;
                sizePpxfxbqfkf = iobyxmoadgVar2 != null ? iobyxmoadgVar2.ppxfxbqfkf() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sizePpxfxbqfkf == null) {
            return iobyxmoadgVar.wkgbmnqykc();
        }
        if (jyumaefsclVar.agtfadlqog(((Integer) iobyxmoadgVar.iobyxmoadg().lqeggnwhkg(androidx.camera.core.impl.rgvfuqvkyq.f3852gtknphoqwx, 0)).intValue()) % 180 == 90) {
            sizePpxfxbqfkf = new Size(sizePpxfxbqfkf.getHeight(), sizePpxfxbqfkf.getWidth());
        }
        istkbnxepw istkbnxepwVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar3 = androidx.camera.core.impl.rgvfuqvkyq.f3849agtfadlqog;
        if (!istkbnxepwVarWkgbmnqykc.zoijcleaow(iobyxmoadgVar3)) {
            iobyxmoadgVar.iobyxmoadg().vdvldrhtss(iobyxmoadgVar3, sizePpxfxbqfkf);
        }
        istkbnxepw istkbnxepwVarWkgbmnqykc2 = iobyxmoadgVar.wkgbmnqykc();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar4 = androidx.camera.core.impl.rgvfuqvkyq.f3855oxmwwwfdhm;
        if (istkbnxepwVarWkgbmnqykc2.zoijcleaow(iobyxmoadgVar4)) {
            dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar = (dsvhmnatus.ppxfxbqfkf) ppxfxbqfkf().lqeggnwhkg(iobyxmoadgVar4, null);
            dsvhmnatus.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar5 = ppxfxbqfkfVar == null ? new dsvhmnatus.ppxfxbqfkf.iobyxmoadg() : dsvhmnatus.ppxfxbqfkf.iobyxmoadg.zoijcleaow(ppxfxbqfkfVar);
            if (ppxfxbqfkfVar == null || ppxfxbqfkfVar.wkgbmnqykc() == null) {
                iobyxmoadgVar5.gxszxtbevo(new dsvhmnatus.wkgbmnqykc(sizePpxfxbqfkf, 1));
            }
            if (ppxfxbqfkfVar == null) {
                iobyxmoadgVar5.eablkybsjg(new dsvhmnatus.zoijcleaow() { // from class: lereixgezr.iozdgvuglv
                    @Override // dsvhmnatus.zoijcleaow
                    public final List iobyxmoadg(List list, int i13) {
                        return androidx.camera.core.gxszxtbevo.oipsdeybqn(sizePpxfxbqfkf, list, i13);
                    }
                });
            }
            iobyxmoadgVar.iobyxmoadg().vdvldrhtss(iobyxmoadgVar4, iobyxmoadgVar5.iobyxmoadg());
        }
        return iobyxmoadgVar.wkgbmnqykc();
    }

    public void iyctptxqzt(int i13) {
        if (mbcevpiqjq(i13)) {
            weqkydbzbr();
        }
    }

    void jztzpxfvev() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar = this.f3700yggfygwlhe;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow();
            this.f3700yggfygwlhe = null;
        }
        DeferrableSurface deferrableSurface = this.f3701zdlpuopuiu;
        if (deferrableSurface != null) {
            deferrableSurface.wkgbmnqykc();
            this.f3701zdlpuopuiu = null;
        }
    }

    @Override // lereixgezr.roivzttewh
    public istkbnxepw.iobyxmoadg lereixgezr(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        return ppxfxbqfkf.gxszxtbevo(btonecajqbVar);
    }

    public int metgxyhuhe() {
        return ((androidx.camera.core.impl.wflxmlrfwp) btonecajqb()).crxdokpmqz(0);
    }

    @Override // lereixgezr.roivzttewh
    public void ntlheqmsrt(Rect rect) {
        super.ntlheqmsrt(rect);
        this.f3698rgvfuqvkyq.esjtqupxsv(rect);
    }

    public void okpsazkaxt() {
        synchronized (this.f3699vdvldrhtss) {
            try {
                this.f3698rgvfuqvkyq.oxmwwwfdhm(null, null);
                if (this.f3697oxmwwwfdhm != null) {
                    iozdgvuglv();
                }
                this.f3697oxmwwwfdhm = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void opjhrmiecq(Executor executor, final iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f3699vdvldrhtss) {
            try {
                this.f3698rgvfuqvkyq.oxmwwwfdhm(executor, new iobyxmoadg() { // from class: lereixgezr.yadqdtsiqt
                    @Override // androidx.camera.core.gxszxtbevo.iobyxmoadg
                    public final void wkgbmnqykc(androidx.camera.core.agtfadlqog agtfadlqogVar) {
                        iobyxmoadgVar.wkgbmnqykc(agtfadlqogVar);
                    }
                });
                if (this.f3697oxmwwwfdhm == null) {
                    yadqdtsiqt();
                }
                this.f3697oxmwwwfdhm = iobyxmoadgVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int rlfsiqarku() {
        return ((androidx.camera.core.impl.wflxmlrfwp) btonecajqb()).jlmebxxoox(6);
    }

    public String toString() {
        return "ImageAnalysis:" + ojitshcjhn();
    }

    @Override // lereixgezr.roivzttewh
    public void tzroggbefp(Matrix matrix) {
        super.tzroggbefp(matrix);
        this.f3698rgvfuqvkyq.cqumvgiudr(matrix);
    }

    public int uwvvkdfqfp() {
        return ((androidx.camera.core.impl.wflxmlrfwp) btonecajqb()).jhduphickx(1);
    }

    @Override // lereixgezr.roivzttewh
    public void wypolnanlu() {
        jztzpxfvev();
        this.f3698rgvfuqvkyq.btonecajqb();
    }

    jyumaefscl.zoijcleaow xrmfcynszj(String str, androidx.camera.core.impl.wflxmlrfwp wflxmlrfwpVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        Size sizeEablkybsjg = iwizpuwonkVar.eablkybsjg();
        Executor executor = (Executor) u1.nufgyqmvbu.gxszxtbevo(wflxmlrfwpVar.ntlheqmsrt(yadqdtsiqt.iobyxmoadg.zoijcleaow()));
        boolean z13 = true;
        int iRlfsiqarku = metgxyhuhe() == 1 ? rlfsiqarku() : 4;
        wflxmlrfwpVar.ribwqtqdhb();
        final vdvldrhtss vdvldrhtssVar = new vdvldrhtss(ojitshcjhn.iobyxmoadg(sizeEablkybsjg.getWidth(), sizeEablkybsjg.getHeight(), wflxmlrfwp(), iRlfsiqarku));
        boolean zYfnezrywwk = lqeggnwhkg() != null ? yfnezrywwk(lqeggnwhkg()) : false;
        int height = zYfnezrywwk ? sizeEablkybsjg.getHeight() : sizeEablkybsjg.getWidth();
        int width = zYfnezrywwk ? sizeEablkybsjg.getWidth() : sizeEablkybsjg.getHeight();
        int i13 = uwvvkdfqfp() == 2 ? 1 : 35;
        boolean z14 = wflxmlrfwp() == 35 && uwvvkdfqfp() == 2;
        if (wflxmlrfwp() != 35 || ((lqeggnwhkg() == null || vdvldrhtss(lqeggnwhkg()) == 0) && !Boolean.TRUE.equals(czzsidtyhn()))) {
            z13 = false;
        }
        final vdvldrhtss vdvldrhtssVar2 = (z14 || z13) ? new vdvldrhtss(ojitshcjhn.iobyxmoadg(height, width, i13, vdvldrhtssVar.gxszxtbevo())) : null;
        if (vdvldrhtssVar2 != null) {
            this.f3698rgvfuqvkyq.jyumaefscl(vdvldrhtssVar2);
        }
        weqkydbzbr();
        vdvldrhtssVar.lqeggnwhkg(this.f3698rgvfuqvkyq, executor);
        jyumaefscl.zoijcleaow zoijcleaowVarVdvldrhtss = jyumaefscl.zoijcleaow.vdvldrhtss(wflxmlrfwpVar, iwizpuwonkVar.eablkybsjg());
        if (iwizpuwonkVar.wkgbmnqykc() != null) {
            zoijcleaowVarVdvldrhtss.lqeggnwhkg(iwizpuwonkVar.wkgbmnqykc());
        }
        DeferrableSurface deferrableSurface = this.f3701zdlpuopuiu;
        if (deferrableSurface != null) {
            deferrableSurface.wkgbmnqykc();
        }
        dsvhmnatus dsvhmnatusVar = new dsvhmnatus(vdvldrhtssVar.iobyxmoadg(), sizeEablkybsjg, wflxmlrfwp());
        this.f3701zdlpuopuiu = dsvhmnatusVar;
        dsvhmnatusVar.gtknphoqwx().iobyxmoadg(new Runnable() { // from class: lereixgezr.lmojexxdyd
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.gxszxtbevo.sflfametgt(vdvldrhtssVar, vdvldrhtssVar2);
            }
        }, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
        zoijcleaowVarVdvldrhtss.kcexrzcfyt(iwizpuwonkVar.ppxfxbqfkf());
        zoijcleaowVarVdvldrhtss.agtfadlqog(this.f3701zdlpuopuiu, iwizpuwonkVar.zoijcleaow(), null, -1);
        jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar = this.f3700yggfygwlhe;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow();
        }
        jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar2 = new jyumaefscl.ppxfxbqfkf(new jyumaefscl.wkgbmnqykc() { // from class: lereixgezr.wwaezpbzkn
            @Override // androidx.camera.core.impl.jyumaefscl.wkgbmnqykc
            public final void iobyxmoadg(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
                this.f62451iobyxmoadg.zfvoamnweg(jyumaefsclVar, lqeggnwhkgVar);
            }
        });
        this.f3700yggfygwlhe = ppxfxbqfkfVar2;
        zoijcleaowVarVdvldrhtss.oxmwwwfdhm(ppxfxbqfkfVar2);
        return zoijcleaowVarVdvldrhtss;
    }

    public boolean ydmasvzmpa() {
        return ((androidx.camera.core.impl.wflxmlrfwp) btonecajqb()).ikoacuggdj(Boolean.FALSE).booleanValue();
    }

    @Override // lereixgezr.roivzttewh
    public void ylkuphrtab() {
        this.f3698rgvfuqvkyq.gxszxtbevo();
    }
}

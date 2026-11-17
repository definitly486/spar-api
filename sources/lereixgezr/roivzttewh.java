package lereixgezr;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class roivzttewh {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private istkbnxepw.iwizpuwonk f62368draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Rect f62369dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private androidx.camera.core.impl.istkbnxepw f62370eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private istkbnxepw.iwizpuwonk f62371gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.camera.core.impl.istkbnxepw f62372gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.camera.core.impl.iwizpuwonk f62374lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private androidx.camera.core.impl.istkbnxepw f62375nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private String f62378wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.camera.core.impl.istkbnxepw f62379wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f62373iobyxmoadg = new HashSet();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f62380zoijcleaow = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f62377ppxfxbqfkf = iobyxmoadg.INACTIVE;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Matrix f62367btonecajqb = new Matrix();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl f62366agtfadlqog = androidx.camera.core.impl.jyumaefscl.zoijcleaow();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl f62376ojitshcjhn = androidx.camera.core.impl.jyumaefscl.zoijcleaow();

    enum iobyxmoadg {
        ACTIVE,
        INACTIVE
    }

    public interface zoijcleaow {
        void eablkybsjg(roivzttewh roivzttewhVar);

        void lqeggnwhkg(roivzttewh roivzttewhVar);

        void ppxfxbqfkf(roivzttewh roivzttewhVar);

        void wkgbmnqykc(roivzttewh roivzttewhVar);
    }

    protected roivzttewh(androidx.camera.core.impl.istkbnxepw istkbnxepwVar) {
        this.f62370eablkybsjg = istkbnxepwVar;
        this.f62372gxszxtbevo = istkbnxepwVar;
    }

    private void iobyxmoadg(zoijcleaow zoijcleaowVar) {
        this.f62373iobyxmoadg.add(zoijcleaowVar);
    }

    private void stevsuqkhv(zoijcleaow zoijcleaowVar) {
        this.f62373iobyxmoadg.remove(zoijcleaowVar);
    }

    protected int agtfadlqog() {
        return ((androidx.camera.core.impl.rgvfuqvkyq) this.f62372gxszxtbevo).sopmlzcsov(-1);
    }

    public androidx.camera.core.impl.istkbnxepw btonecajqb() {
        return this.f62372gxszxtbevo;
    }

    public androidx.camera.core.impl.istkbnxepw cdpycssgdh(istkbnxepw.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar2) {
        androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVarJhduphickx;
        if (istkbnxepwVar2 != null) {
            oxmwwwfdhmVarJhduphickx = androidx.camera.core.impl.oxmwwwfdhm.ikoacuggdj(istkbnxepwVar2);
            oxmwwwfdhmVarJhduphickx.okpsazkaxt(lmojexxdyd.btonecajqb.f63630iozdgvuglv);
        } else {
            oxmwwwfdhmVarJhduphickx = androidx.camera.core.impl.oxmwwwfdhm.jhduphickx();
        }
        if (this.f62370eablkybsjg.zoijcleaow(androidx.camera.core.impl.rgvfuqvkyq.f3850btonecajqb) || this.f62370eablkybsjg.zoijcleaow(androidx.camera.core.impl.rgvfuqvkyq.f3849agtfadlqog)) {
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = androidx.camera.core.impl.rgvfuqvkyq.f3855oxmwwwfdhm;
            if (oxmwwwfdhmVarJhduphickx.zoijcleaow(iobyxmoadgVar)) {
                oxmwwwfdhmVarJhduphickx.okpsazkaxt(iobyxmoadgVar);
            }
        }
        androidx.camera.core.impl.istkbnxepw istkbnxepwVar3 = this.f62370eablkybsjg;
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 = androidx.camera.core.impl.rgvfuqvkyq.f3855oxmwwwfdhm;
        if (istkbnxepwVar3.zoijcleaow(iobyxmoadgVar2)) {
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar3 = androidx.camera.core.impl.rgvfuqvkyq.f3856rgvfuqvkyq;
            if (oxmwwwfdhmVarJhduphickx.zoijcleaow(iobyxmoadgVar3) && ((dsvhmnatus.ppxfxbqfkf) this.f62370eablkybsjg.iobyxmoadg(iobyxmoadgVar2)).wkgbmnqykc() != null) {
                oxmwwwfdhmVarJhduphickx.okpsazkaxt(iobyxmoadgVar3);
            }
        }
        Iterator it = this.f62370eablkybsjg.eablkybsjg().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.btonecajqb.iozdgvuglv(oxmwwwfdhmVarJhduphickx, oxmwwwfdhmVarJhduphickx, this.f62370eablkybsjg, (androidx.camera.core.impl.btonecajqb.iobyxmoadg) it.next());
        }
        if (istkbnxepwVar != null) {
            for (androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar4 : istkbnxepwVar.eablkybsjg()) {
                if (!iobyxmoadgVar4.ppxfxbqfkf().equals(lmojexxdyd.btonecajqb.f63630iozdgvuglv.ppxfxbqfkf())) {
                    androidx.camera.core.impl.btonecajqb.iozdgvuglv(oxmwwwfdhmVarJhduphickx, oxmwwwfdhmVarJhduphickx, istkbnxepwVar, iobyxmoadgVar4);
                }
            }
        }
        if (oxmwwwfdhmVarJhduphickx.zoijcleaow(androidx.camera.core.impl.rgvfuqvkyq.f3849agtfadlqog)) {
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar5 = androidx.camera.core.impl.rgvfuqvkyq.f3850btonecajqb;
            if (oxmwwwfdhmVarJhduphickx.zoijcleaow(iobyxmoadgVar5)) {
                oxmwwwfdhmVarJhduphickx.okpsazkaxt(iobyxmoadgVar5);
            }
        }
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar6 = androidx.camera.core.impl.rgvfuqvkyq.f3855oxmwwwfdhm;
        if (oxmwwwfdhmVarJhduphickx.zoijcleaow(iobyxmoadgVar6) && ((dsvhmnatus.ppxfxbqfkf) oxmwwwfdhmVarJhduphickx.iobyxmoadg(iobyxmoadgVar6)).iobyxmoadg() != 0) {
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(androidx.camera.core.impl.istkbnxepw.f3798lereixgezr, Boolean.TRUE);
        }
        return hcddaimhww(jyumaefsclVar, lereixgezr(oxmwwwfdhmVarJhduphickx));
    }

    protected abstract androidx.camera.core.impl.iwizpuwonk cllcsxoeiz(androidx.camera.core.impl.btonecajqb btonecajqbVar);

    protected Set cqumvgiudr() {
        return Collections.emptySet();
    }

    public void crxdokpmqz(androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar2) {
        this.f62374lqeggnwhkg = dsvhmnatus(iwizpuwonkVar, iwizpuwonkVar2);
    }

    public btonecajqb draadjrbmk() {
        return null;
    }

    protected abstract androidx.camera.core.impl.iwizpuwonk dsvhmnatus(androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar2);

    protected String dxjokdxxww() {
        return ((istkbnxepw.iwizpuwonk) u1.nufgyqmvbu.lqeggnwhkg(lqeggnwhkg(), "No camera attached to use case: " + this)).wflxmlrfwp().zoijcleaow();
    }

    public androidx.camera.core.impl.iwizpuwonk eablkybsjg() {
        return this.f62374lqeggnwhkg;
    }

    protected int esjtqupxsv() {
        return ((androidx.camera.core.impl.rgvfuqvkyq) this.f62372gxszxtbevo).yadqdtsiqt(0);
    }

    public abstract androidx.camera.core.impl.istkbnxepw gtknphoqwx(boolean z13, androidx.camera.core.impl.cdpycssgdh cdpycssgdhVar);

    public Size gxszxtbevo() {
        androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar = this.f62374lqeggnwhkg;
        if (iwizpuwonkVar != null) {
            return iwizpuwonkVar.eablkybsjg();
        }
        return null;
    }

    protected abstract androidx.camera.core.impl.istkbnxepw hcddaimhww(istkbnxepw.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw.iobyxmoadg iobyxmoadgVar);

    public void hkdspvbjdz() {
    }

    protected final void iozdgvuglv() {
        this.f62377ppxfxbqfkf = iobyxmoadg.INACTIVE;
        wwaezpbzkn();
    }

    public boolean istkbnxepw(istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        int iAgtfadlqog = agtfadlqog();
        if (iAgtfadlqog == -1 || iAgtfadlqog == 0) {
            return false;
        }
        if (iAgtfadlqog == 1) {
            return true;
        }
        if (iAgtfadlqog == 2) {
            return iwizpuwonkVar.agtfadlqog();
        }
        throw new AssertionError("Unknown mirrorMode: " + iAgtfadlqog);
    }

    public androidx.camera.core.impl.jyumaefscl iwizpuwonk() {
        return this.f62366agtfadlqog;
    }

    public void jlmebxxoox(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        this.f62374lqeggnwhkg = cllcsxoeiz(btonecajqbVar);
    }

    public void jpowsppfya() {
    }

    public Matrix jyumaefscl() {
        return this.f62367btonecajqb;
    }

    public istkbnxepw.iwizpuwonk kcexrzcfyt() {
        istkbnxepw.iwizpuwonk iwizpuwonkVar;
        synchronized (this.f62380zoijcleaow) {
            iwizpuwonkVar = this.f62368draadjrbmk;
        }
        return iwizpuwonkVar;
    }

    public void kegysxyocb(btonecajqb btonecajqbVar) {
        u1.nufgyqmvbu.iobyxmoadg(true);
    }

    public abstract androidx.camera.core.impl.istkbnxepw.iobyxmoadg lereixgezr(androidx.camera.core.impl.btonecajqb btonecajqbVar);

    protected final void lmojexxdyd() {
        Iterator it = this.f62373iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).ppxfxbqfkf(this);
        }
    }

    public istkbnxepw.iwizpuwonk lqeggnwhkg() {
        istkbnxepw.iwizpuwonk iwizpuwonkVar;
        synchronized (this.f62380zoijcleaow) {
            iwizpuwonkVar = this.f62371gtknphoqwx;
        }
        return iwizpuwonkVar;
    }

    protected boolean mbcevpiqjq(int i13) {
        int iYadqdtsiqt = ((androidx.camera.core.impl.rgvfuqvkyq) btonecajqb()).yadqdtsiqt(-1);
        if (iYadqdtsiqt != -1 && iYadqdtsiqt == i13) {
            return false;
        }
        androidx.camera.core.impl.istkbnxepw.iobyxmoadg iobyxmoadgVarLereixgezr = lereixgezr(this.f62370eablkybsjg);
        hcddaimhww.wkgbmnqykc.iobyxmoadg(iobyxmoadgVarLereixgezr, i13);
        this.f62370eablkybsjg = iobyxmoadgVarLereixgezr.wkgbmnqykc();
        istkbnxepw.iwizpuwonk iwizpuwonkVarLqeggnwhkg = lqeggnwhkg();
        if (iwizpuwonkVarLqeggnwhkg == null) {
            this.f62372gxszxtbevo = this.f62370eablkybsjg;
            return true;
        }
        this.f62372gxszxtbevo = cdpycssgdh(iwizpuwonkVarLqeggnwhkg.wflxmlrfwp(), this.f62379wkgbmnqykc, this.f62375nufgyqmvbu);
        return true;
    }

    public void ntlheqmsrt(Rect rect) {
        this.f62369dxjokdxxww = rect;
    }

    protected CameraControlInternal nufgyqmvbu() {
        synchronized (this.f62380zoijcleaow) {
            try {
                istkbnxepw.iwizpuwonk iwizpuwonkVar = this.f62371gtknphoqwx;
                if (iwizpuwonkVar == null) {
                    return CameraControlInternal.f3707iobyxmoadg;
                }
                return iwizpuwonkVar.gxszxtbevo();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String ojitshcjhn() {
        String strYggfygwlhe = this.f62372gxszxtbevo.yggfygwlhe("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strYggfygwlhe);
        return strYggfygwlhe;
    }

    protected int oxmwwwfdhm(istkbnxepw.iwizpuwonk iwizpuwonkVar, boolean z13) {
        int iAgtfadlqog = iwizpuwonkVar.wflxmlrfwp().agtfadlqog(esjtqupxsv());
        return (iwizpuwonkVar.vdvldrhtss() || !z13) ? iAgtfadlqog : cdpycssgdh.vdvldrhtss.yggfygwlhe(-iAgtfadlqog);
    }

    public void pkzmftpjix() {
    }

    public Rect pmvmpeiblj() {
        return this.f62369dxjokdxxww;
    }

    protected androidx.camera.core.impl.istkbnxepw ppxfxbqfkf() {
        return this.f62370eablkybsjg;
    }

    public String rgvfuqvkyq() {
        return this.f62378wflxmlrfwp;
    }

    protected void sopmlzcsov(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f62366agtfadlqog = (androidx.camera.core.impl.jyumaefscl) list.get(0);
        if (list.size() > 1) {
            this.f62376ojitshcjhn = (androidx.camera.core.impl.jyumaefscl) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (DeferrableSurface deferrableSurface : ((androidx.camera.core.impl.jyumaefscl) it.next()).ojitshcjhn()) {
                if (deferrableSurface.lqeggnwhkg() == null) {
                    deferrableSurface.kcexrzcfyt(getClass());
                }
            }
        }
    }

    public void tzroggbefp(Matrix matrix) {
        this.f62367btonecajqb = new Matrix(matrix);
    }

    public final void ulzqkzuiru(istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        wypolnanlu();
        synchronized (this.f62380zoijcleaow) {
            try {
                istkbnxepw.iwizpuwonk iwizpuwonkVar2 = this.f62371gtknphoqwx;
                if (iwizpuwonkVar == iwizpuwonkVar2) {
                    stevsuqkhv(iwizpuwonkVar2);
                    this.f62371gtknphoqwx = null;
                }
                istkbnxepw.iwizpuwonk iwizpuwonkVar3 = this.f62368draadjrbmk;
                if (iwizpuwonkVar == iwizpuwonkVar3) {
                    stevsuqkhv(iwizpuwonkVar3);
                    this.f62368draadjrbmk = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f62374lqeggnwhkg = null;
        this.f62369dxjokdxxww = null;
        this.f62372gxszxtbevo = this.f62370eablkybsjg;
        this.f62379wkgbmnqykc = null;
        this.f62375nufgyqmvbu = null;
    }

    protected int vdvldrhtss(istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        return oxmwwwfdhm(iwizpuwonkVar, false);
    }

    public int wflxmlrfwp() {
        return this.f62372gxszxtbevo.wflxmlrfwp();
    }

    protected int wkgbmnqykc() {
        return ((androidx.camera.core.impl.rgvfuqvkyq) this.f62372gxszxtbevo).kcexrzcfyt(-1);
    }

    public final void wwaezpbzkn() {
        int iOrdinal = this.f62377ppxfxbqfkf.ordinal();
        if (iOrdinal == 0) {
            Iterator it = this.f62373iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((zoijcleaow) it.next()).lqeggnwhkg(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = this.f62373iobyxmoadg.iterator();
            while (it2.hasNext()) {
                ((zoijcleaow) it2.next()).wkgbmnqykc(this);
            }
        }
    }

    public void wypolnanlu() {
    }

    protected final void yadqdtsiqt() {
        this.f62377ppxfxbqfkf = iobyxmoadg.ACTIVE;
        wwaezpbzkn();
    }

    public androidx.camera.core.impl.jyumaefscl yggfygwlhe() {
        return this.f62376ojitshcjhn;
    }

    public void ylkuphrtab() {
    }

    protected String zdlpuopuiu() {
        if (kcexrzcfyt() == null) {
            return null;
        }
        return kcexrzcfyt().wflxmlrfwp().zoijcleaow();
    }

    public final void zoijcleaow(istkbnxepw.iwizpuwonk iwizpuwonkVar, istkbnxepw.iwizpuwonk iwizpuwonkVar2, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar2) {
        synchronized (this.f62380zoijcleaow) {
            try {
                this.f62371gtknphoqwx = iwizpuwonkVar;
                this.f62368draadjrbmk = iwizpuwonkVar2;
                iobyxmoadg(iwizpuwonkVar);
                if (iwizpuwonkVar2 != null) {
                    iobyxmoadg(iwizpuwonkVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f62379wkgbmnqykc = istkbnxepwVar;
        this.f62375nufgyqmvbu = istkbnxepwVar2;
        this.f62372gxszxtbevo = cdpycssgdh(iwizpuwonkVar.wflxmlrfwp(), this.f62379wkgbmnqykc, this.f62375nufgyqmvbu);
        ylkuphrtab();
    }

    public boolean zynmafqrjb(int i13) {
        Iterator it = cqumvgiudr().iterator();
        while (it.hasNext()) {
            if (jpowsppfya.stevsuqkhv.zoijcleaow(i13, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }
}

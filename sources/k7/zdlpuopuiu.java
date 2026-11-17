package k7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;

/* JADX INFO: loaded from: classes2.dex */
public class zdlpuopuiu extends iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private l7.iobyxmoadg f54096jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final String f54097kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final r7.zoijcleaow f54098oxmwwwfdhm;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final l7.iobyxmoadg f54099yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f54100zdlpuopuiu;

    public zdlpuopuiu(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.kcexrzcfyt kcexrzcfytVar) {
        super(hcddaimhwwVar, zoijcleaowVar, kcexrzcfytVar.zoijcleaow().wkgbmnqykc(), kcexrzcfytVar.eablkybsjg().wkgbmnqykc(), kcexrzcfytVar.lqeggnwhkg(), kcexrzcfytVar.dxjokdxxww(), kcexrzcfytVar.btonecajqb(), kcexrzcfytVar.gxszxtbevo(), kcexrzcfytVar.wkgbmnqykc());
        this.f54098oxmwwwfdhm = zoijcleaowVar;
        this.f54097kcexrzcfyt = kcexrzcfytVar.nufgyqmvbu();
        this.f54100zdlpuopuiu = kcexrzcfytVar.gtknphoqwx();
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = kcexrzcfytVar.ppxfxbqfkf().eablkybsjg();
        this.f54099yggfygwlhe = iobyxmoadgVarEablkybsjg;
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
    }

    @Override // k7.iobyxmoadg, k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        if (this.f54100zdlpuopuiu) {
            return;
        }
        this.f53996dxjokdxxww.setColor(((l7.zoijcleaow) this.f54099yggfygwlhe).vdvldrhtss());
        l7.iobyxmoadg iobyxmoadgVar = this.f54096jyumaefscl;
        if (iobyxmoadgVar != null) {
            this.f53996dxjokdxxww.setColorFilter((ColorFilter) iobyxmoadgVar.nufgyqmvbu());
        }
        super.dxjokdxxww(canvas, matrix, i13);
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54097kcexrzcfyt;
    }

    @Override // k7.iobyxmoadg, o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.nufgyqmvbu(obj, ppxfxbqfkfVar);
        if (obj == dsvhmnatus.f20395zoijcleaow) {
            this.f54099yggfygwlhe.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20367hcddaimhww) {
            l7.iobyxmoadg iobyxmoadgVar = this.f54096jyumaefscl;
            if (iobyxmoadgVar != null) {
                this.f54098oxmwwwfdhm.ylkuphrtab(iobyxmoadgVar);
            }
            if (ppxfxbqfkfVar == null) {
                this.f54096jyumaefscl = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54096jyumaefscl = vdvldrhtssVar;
            vdvldrhtssVar.iobyxmoadg(this);
            this.f54098oxmwwwfdhm.btonecajqb(this.f54099yggfygwlhe);
        }
    }
}

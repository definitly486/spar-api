package r7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.btonecajqb;
import com.airbnb.lottie.hcddaimhww;
import java.util.Collections;
import java.util.List;
import q7.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final k7.wkgbmnqykc f81924cdpycssgdh;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final ppxfxbqfkf f81925yadqdtsiqt;

    lqeggnwhkg(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar, ppxfxbqfkf ppxfxbqfkfVar, btonecajqb btonecajqbVar) {
        super(hcddaimhwwVar, eablkybsjgVar);
        this.f81925yadqdtsiqt = ppxfxbqfkfVar;
        k7.wkgbmnqykc wkgbmnqykcVar = new k7.wkgbmnqykc(hcddaimhwwVar, this, new vdvldrhtss("__container", eablkybsjgVar.ojitshcjhn(), false), btonecajqbVar);
        this.f81924cdpycssgdh = wkgbmnqykcVar;
        wkgbmnqykcVar.zoijcleaow(Collections.emptyList(), Collections.emptyList());
    }

    @Override // r7.zoijcleaow
    public q7.iobyxmoadg cqumvgiudr() {
        q7.iobyxmoadg iobyxmoadgVarCqumvgiudr = super.cqumvgiudr();
        return iobyxmoadgVarCqumvgiudr != null ? iobyxmoadgVarCqumvgiudr : this.f81925yadqdtsiqt.cqumvgiudr();
    }

    @Override // r7.zoijcleaow, k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        super.eablkybsjg(rectF, matrix, z13);
        this.f81924cdpycssgdh.eablkybsjg(rectF, this.f81964ojitshcjhn, z13);
    }

    @Override // r7.zoijcleaow
    public t7.btonecajqb lereixgezr() {
        t7.btonecajqb btonecajqbVarLereixgezr = super.lereixgezr();
        return btonecajqbVarLereixgezr != null ? btonecajqbVarLereixgezr : this.f81925yadqdtsiqt.lereixgezr();
    }

    @Override // r7.zoijcleaow
    protected void pkzmftpjix(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        this.f81924cdpycssgdh.ppxfxbqfkf(eablkybsjgVar, i13, list, eablkybsjgVar2);
    }

    @Override // r7.zoijcleaow
    void yggfygwlhe(Canvas canvas, Matrix matrix, int i13) {
        this.f81924cdpycssgdh.dxjokdxxww(canvas, matrix, i13);
    }
}

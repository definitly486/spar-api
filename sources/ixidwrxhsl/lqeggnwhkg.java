package ixidwrxhsl;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends eablkybsjg implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Object f49992cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f49993esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gxszxtbevo f49994iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f49995lereixgezr;

    public lqeggnwhkg(gxszxtbevo gxszxtbevoVar, yggfygwlhe[] yggfygwlheVarArr) {
        super(gxszxtbevoVar.dxjokdxxww(), yggfygwlheVarArr);
        this.f49994iwizpuwonk = gxszxtbevoVar;
        this.f49995lereixgezr = gxszxtbevoVar.gxszxtbevo();
    }

    private final void btonecajqb() {
        if (!this.f49993esjtqupxsv) {
            throw new IllegalStateException();
        }
    }

    private final void dxjokdxxww() {
        if (this.f49994iwizpuwonk.gxszxtbevo() != this.f49995lereixgezr) {
            throw new ConcurrentModificationException();
        }
    }

    private final void gtknphoqwx(int i13, zdlpuopuiu zdlpuopuiuVar, Object obj, int i14) {
        int i15 = i14 * 5;
        if (i15 > 30) {
            wkgbmnqykc()[i14].draadjrbmk(zdlpuopuiuVar.rgvfuqvkyq(), zdlpuopuiuVar.rgvfuqvkyq().length, 0);
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykc()[i14].iobyxmoadg(), obj)) {
                wkgbmnqykc()[i14].dxjokdxxww();
            }
            gxszxtbevo(i14);
            return;
        }
        int iGxszxtbevo = 1 << cqumvgiudr.gxszxtbevo(i13, i15);
        if (zdlpuopuiuVar.vdvldrhtss(iGxszxtbevo)) {
            wkgbmnqykc()[i14].draadjrbmk(zdlpuopuiuVar.rgvfuqvkyq(), zdlpuopuiuVar.wflxmlrfwp() * 2, zdlpuopuiuVar.agtfadlqog(iGxszxtbevo));
            gxszxtbevo(i14);
        } else {
            int iDsvhmnatus = zdlpuopuiuVar.dsvhmnatus(iGxszxtbevo);
            zdlpuopuiu zdlpuopuiuVarCllcsxoeiz = zdlpuopuiuVar.cllcsxoeiz(iDsvhmnatus);
            wkgbmnqykc()[i14].draadjrbmk(zdlpuopuiuVar.rgvfuqvkyq(), zdlpuopuiuVar.wflxmlrfwp() * 2, iDsvhmnatus);
            gtknphoqwx(i13, zdlpuopuiuVarCllcsxoeiz, obj, i14 + 1);
        }
    }

    public final void draadjrbmk(Object obj, Object obj2) {
        if (this.f49994iwizpuwonk.containsKey(obj)) {
            if (hasNext()) {
                Object objZoijcleaow = zoijcleaow();
                this.f49994iwizpuwonk.put(obj, obj2);
                gtknphoqwx(objZoijcleaow != null ? objZoijcleaow.hashCode() : 0, this.f49994iwizpuwonk.dxjokdxxww(), objZoijcleaow, 0);
            } else {
                this.f49994iwizpuwonk.put(obj, obj2);
            }
            this.f49995lereixgezr = this.f49994iwizpuwonk.gxszxtbevo();
        }
    }

    @Override // ixidwrxhsl.eablkybsjg, java.util.Iterator
    public Object next() {
        dxjokdxxww();
        this.f49992cqumvgiudr = zoijcleaow();
        this.f49993esjtqupxsv = true;
        return super.next();
    }

    @Override // ixidwrxhsl.eablkybsjg, java.util.Iterator
    public void remove() {
        btonecajqb();
        if (hasNext()) {
            Object objZoijcleaow = zoijcleaow();
            mbcevpiqjq.ppxfxbqfkf(this.f49994iwizpuwonk).remove(this.f49992cqumvgiudr);
            gtknphoqwx(objZoijcleaow != null ? objZoijcleaow.hashCode() : 0, this.f49994iwizpuwonk.dxjokdxxww(), objZoijcleaow, 0);
        } else {
            mbcevpiqjq.ppxfxbqfkf(this.f49994iwizpuwonk).remove(this.f49992cqumvgiudr);
        }
        this.f49992cqumvgiudr = null;
        this.f49993esjtqupxsv = false;
        this.f49995lereixgezr = this.f49994iwizpuwonk.gxszxtbevo();
    }
}

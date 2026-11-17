package rj;

import java.util.concurrent.atomic.AtomicReferenceArray;
import pj.j;
import uj.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends lereixgezr {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final eablkybsjg f82925cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f82926esjtqupxsv;

    public wflxmlrfwp(long j13, wflxmlrfwp wflxmlrfwpVar, eablkybsjg eablkybsjgVar, int i13) {
        super(j13, wflxmlrfwpVar, i13);
        this.f82925cqumvgiudr = eablkybsjgVar;
        this.f82926esjtqupxsv = new AtomicReferenceArray(gxszxtbevo.f82901zoijcleaow * 2);
    }

    private final /* synthetic */ AtomicReferenceArray lereixgezr() {
        return this.f82926esjtqupxsv;
    }

    private final void yadqdtsiqt(int i13, Object obj) {
        lereixgezr().set(i13 * 2, obj);
    }

    public final Object cdpycssgdh(int i13) {
        Object objPmvmpeiblj = pmvmpeiblj(i13);
        iwizpuwonk(i13);
        return objPmvmpeiblj;
    }

    public final Object cqumvgiudr(int i13, Object obj) {
        return lereixgezr().getAndSet((i13 * 2) + 1, obj);
    }

    public final eablkybsjg esjtqupxsv() {
        eablkybsjg eablkybsjgVar = this.f82925cqumvgiudr;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVar);
        return eablkybsjgVar;
    }

    public final void iozdgvuglv(int i13, Object obj) {
        lereixgezr().set((i13 * 2) + 1, obj);
    }

    public final void istkbnxepw(int i13, boolean z13) {
        if (z13) {
            esjtqupxsv().y((this.f113652jyumaefscl * ((long) gxszxtbevo.f82901zoijcleaow)) + ((long) i13));
        }
        zdlpuopuiu();
    }

    public final void iwizpuwonk(int i13) {
        yadqdtsiqt(i13, null);
    }

    public final boolean jyumaefscl(int i13, Object obj, Object obj2) {
        return draadjrbmk.iobyxmoadg(lereixgezr(), (i13 * 2) + 1, obj, obj2);
    }

    @Override // uj.lereixgezr
    public void kcexrzcfyt(int i13, Throwable th2, lg.btonecajqb btonecajqbVar) {
        tg.draadjrbmk draadjrbmkVar;
        tg.draadjrbmk draadjrbmkVar2;
        int i14 = gxszxtbevo.f82901zoijcleaow;
        boolean z13 = i13 >= i14;
        if (z13) {
            i13 -= i14;
        }
        Object objPmvmpeiblj = pmvmpeiblj(i13);
        while (true) {
            Object objZynmafqrjb = zynmafqrjb(i13);
            if ((objZynmafqrjb instanceof j) || (objZynmafqrjb instanceof cqumvgiudr)) {
                if (jyumaefscl(i13, objZynmafqrjb, z13 ? gxszxtbevo.f82884btonecajqb : gxszxtbevo.f82888gtknphoqwx)) {
                    iwizpuwonk(i13);
                    istkbnxepw(i13, !z13);
                    if (!z13 || (draadjrbmkVar = esjtqupxsv().f82862yggfygwlhe) == null) {
                        return;
                    }
                    uj.jyumaefscl.iobyxmoadg(draadjrbmkVar, objPmvmpeiblj, btonecajqbVar);
                    return;
                }
            } else {
                if (objZynmafqrjb == gxszxtbevo.f82884btonecajqb || objZynmafqrjb == gxszxtbevo.f82888gtknphoqwx) {
                    break;
                }
                if (objZynmafqrjb != gxszxtbevo.f82892lqeggnwhkg && objZynmafqrjb != gxszxtbevo.f82889gxszxtbevo) {
                    if (objZynmafqrjb == gxszxtbevo.f82886dxjokdxxww || objZynmafqrjb == gxszxtbevo.f82900wkgbmnqykc || objZynmafqrjb == gxszxtbevo.lereixgezr()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objZynmafqrjb).toString());
                }
            }
        }
        iwizpuwonk(i13);
        if (!z13 || (draadjrbmkVar2 = esjtqupxsv().f82862yggfygwlhe) == null) {
            return;
        }
        uj.jyumaefscl.iobyxmoadg(draadjrbmkVar2, objPmvmpeiblj, btonecajqbVar);
    }

    public final void lmojexxdyd(int i13, Object obj) {
        yadqdtsiqt(i13, obj);
    }

    @Override // uj.lereixgezr
    public int oxmwwwfdhm() {
        return gxszxtbevo.f82901zoijcleaow;
    }

    public final Object pmvmpeiblj(int i13) {
        return lereixgezr().get(i13 * 2);
    }

    public final Object zynmafqrjb(int i13) {
        return lereixgezr().get((i13 * 2) + 1);
    }
}

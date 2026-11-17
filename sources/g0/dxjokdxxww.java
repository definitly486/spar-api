package g0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class dxjokdxxww implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final dxjokdxxww f35643zdlpuopuiu = new dxjokdxxww();

    private dxjokdxxww() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2) {
        g.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = zdlpuopuiuVar.draadjrbmk();
        g.lqeggnwhkg lqeggnwhkgVarDraadjrbmk2 = zdlpuopuiuVar2.draadjrbmk();
        int iCompare = Float.compare(lqeggnwhkgVarDraadjrbmk2.dxjokdxxww(), lqeggnwhkgVarDraadjrbmk.dxjokdxxww());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(lqeggnwhkgVarDraadjrbmk.gtknphoqwx(), lqeggnwhkgVarDraadjrbmk2.gtknphoqwx());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(lqeggnwhkgVarDraadjrbmk.eablkybsjg(), lqeggnwhkgVarDraadjrbmk2.eablkybsjg());
        return iCompare3 != 0 ? iCompare3 : Float.compare(lqeggnwhkgVarDraadjrbmk2.nufgyqmvbu(), lqeggnwhkgVarDraadjrbmk.nufgyqmvbu());
    }
}

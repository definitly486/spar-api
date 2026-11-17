package rj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static final lqeggnwhkg iobyxmoadg(int i13, iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        lqeggnwhkg eablkybsjgVar;
        if (i13 == -2) {
            eablkybsjgVar = iobyxmoadgVar == iobyxmoadg.SUSPEND ? new eablkybsjg(lqeggnwhkg.f82908draadjrbmk.iobyxmoadg(), draadjrbmkVar) : new vdvldrhtss(1, iobyxmoadgVar, draadjrbmkVar);
        } else {
            if (i13 == -1) {
                if (iobyxmoadgVar == iobyxmoadg.SUSPEND) {
                    return new vdvldrhtss(1, iobyxmoadg.DROP_OLDEST, draadjrbmkVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i13 != 0) {
                if (i13 != Integer.MAX_VALUE) {
                    return iobyxmoadgVar == iobyxmoadg.SUSPEND ? new eablkybsjg(i13, draadjrbmkVar) : new vdvldrhtss(i13, iobyxmoadgVar, draadjrbmkVar);
                }
                return new eablkybsjg(Integer.MAX_VALUE, draadjrbmkVar);
            }
            eablkybsjgVar = iobyxmoadgVar == iobyxmoadg.SUSPEND ? new eablkybsjg(0, draadjrbmkVar) : new vdvldrhtss(1, iobyxmoadgVar, draadjrbmkVar);
        }
        return eablkybsjgVar;
    }

    public static /* synthetic */ lqeggnwhkg zoijcleaow(int i13, iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        if ((i14 & 2) != 0) {
            iobyxmoadgVar = iobyxmoadg.SUSPEND;
        }
        if ((i14 & 4) != 0) {
            draadjrbmkVar = null;
        }
        return iobyxmoadg(i13, iobyxmoadgVar, draadjrbmkVar);
    }
}

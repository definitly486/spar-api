package sj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final uj.istkbnxepw f107053iobyxmoadg = new uj.istkbnxepw("NO_VALUE");

    public static final lqeggnwhkg eablkybsjg(iozdgvuglv iozdgvuglvVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return ((i13 == 0 || i13 == -3) && iobyxmoadgVar == rj.iobyxmoadg.SUSPEND) ? iozdgvuglvVar : new tj.nufgyqmvbu(iozdgvuglvVar, btonecajqbVar, i13, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(Object[] objArr, long j13) {
        return objArr[((int) j13) & (objArr.length - 1)];
    }

    public static final pmvmpeiblj iobyxmoadg(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar) {
        if (i13 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i13).toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i14).toString());
        }
        if (i13 > 0 || i14 > 0 || iobyxmoadgVar == rj.iobyxmoadg.SUSPEND) {
            int i15 = i14 + i13;
            if (i15 < 0) {
                i15 = Integer.MAX_VALUE;
            }
            return new lmojexxdyd(i13, i15, iobyxmoadgVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + iobyxmoadgVar).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(Object[] objArr, long j13, Object obj) {
        objArr[((int) j13) & (objArr.length - 1)] = obj;
    }

    public static /* synthetic */ pmvmpeiblj zoijcleaow(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            iobyxmoadgVar = rj.iobyxmoadg.SUSPEND;
        }
        return iobyxmoadg(i13, i14, iobyxmoadgVar);
    }
}

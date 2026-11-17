package yj;

import uj.istkbnxepw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final istkbnxepw f125500iobyxmoadg = new istkbnxepw("NO_OWNER");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final istkbnxepw f125501zoijcleaow = new istkbnxepw("ALREADY_LOCKED_BY_OWNER");

    public static final iobyxmoadg iobyxmoadg(boolean z13) {
        return new gxszxtbevo(z13);
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return iobyxmoadg(z13);
    }
}

package r9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {

    public enum iobyxmoadg {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static lqeggnwhkg eablkybsjg(long j13) {
        return new zoijcleaow(iobyxmoadg.OK, j13);
    }

    public static lqeggnwhkg gxszxtbevo() {
        return new zoijcleaow(iobyxmoadg.TRANSIENT_ERROR, -1L);
    }

    public static lqeggnwhkg iobyxmoadg() {
        return new zoijcleaow(iobyxmoadg.FATAL_ERROR, -1L);
    }

    public static lqeggnwhkg wkgbmnqykc() {
        return new zoijcleaow(iobyxmoadg.INVALID_PAYLOAD, -1L);
    }

    public abstract iobyxmoadg ppxfxbqfkf();

    public abstract long zoijcleaow();
}

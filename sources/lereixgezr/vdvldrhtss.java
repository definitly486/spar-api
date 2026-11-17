package lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdvldrhtss {

    public static abstract class iobyxmoadg {
        public static iobyxmoadg iobyxmoadg(int i13) {
            return zoijcleaow(i13, null);
        }

        public static iobyxmoadg zoijcleaow(int i13, Throwable th2) {
            return new ppxfxbqfkf(i13, th2);
        }

        public abstract Throwable ppxfxbqfkf();

        public abstract int wkgbmnqykc();
    }

    public enum zoijcleaow {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static vdvldrhtss iobyxmoadg(zoijcleaow zoijcleaowVar) {
        return zoijcleaow(zoijcleaowVar, null);
    }

    public static vdvldrhtss zoijcleaow(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
        return new lereixgezr.zoijcleaow(zoijcleaowVar, iobyxmoadgVar);
    }

    public abstract iobyxmoadg ppxfxbqfkf();

    public abstract zoijcleaow wkgbmnqykc();
}

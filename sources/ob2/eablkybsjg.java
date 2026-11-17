package ob2;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f72556iobyxmoadg = new eablkybsjg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static iobyxmoadg f72557zoijcleaow;

    private eablkybsjg() {
    }

    public final iobyxmoadg iobyxmoadg() {
        iobyxmoadg iobyxmoadgVar;
        synchronized (this) {
            iobyxmoadgVar = f72557zoijcleaow;
        }
        return iobyxmoadgVar;
    }
}

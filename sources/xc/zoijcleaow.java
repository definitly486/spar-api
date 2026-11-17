package xc;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static zoijcleaow f122028iobyxmoadg;

    private zoijcleaow() {
    }

    public static zoijcleaow iobyxmoadg() {
        if (f122028iobyxmoadg == null) {
            f122028iobyxmoadg = new zoijcleaow();
        }
        return f122028iobyxmoadg;
    }

    @Override // xc.iobyxmoadg
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

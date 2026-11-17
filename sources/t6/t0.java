package t6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static w0 f109882iobyxmoadg;

    public static synchronized h0 iobyxmoadg() {
        try {
            if (f109882iobyxmoadg == null) {
                f109882iobyxmoadg = new w0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f109882iobyxmoadg;
    }
}

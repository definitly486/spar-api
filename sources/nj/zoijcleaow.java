package nj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final boolean f70187iobyxmoadg = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ThreadLocal[] f70188zoijcleaow;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i13 = 0; i13 < 4; i13++) {
            threadLocalArr[i13] = new ThreadLocal();
        }
        f70188zoijcleaow = threadLocalArr;
    }

    public static final boolean iobyxmoadg() {
        return f70187iobyxmoadg;
    }
}

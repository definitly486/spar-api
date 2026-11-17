package s9;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements fg.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f105827ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile fg.iobyxmoadg f105828iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Object f105829zoijcleaow = f105827ppxfxbqfkf;

    private iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar) {
        this.f105828iobyxmoadg = iobyxmoadgVar;
    }

    public static fg.iobyxmoadg iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykc.zoijcleaow(iobyxmoadgVar);
        return iobyxmoadgVar instanceof iobyxmoadg ? iobyxmoadgVar : new iobyxmoadg(iobyxmoadgVar);
    }

    private static Object zoijcleaow(Object obj, Object obj2) {
        if (obj == f105827ppxfxbqfkf || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // fg.iobyxmoadg
    public Object get() {
        Object obj = this.f105829zoijcleaow;
        Object obj2 = f105827ppxfxbqfkf;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105829zoijcleaow;
                    if (obj == obj2) {
                        obj = this.f105828iobyxmoadg.get();
                        this.f105829zoijcleaow = zoijcleaow(this.f105829zoijcleaow, obj);
                        this.f105828iobyxmoadg = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}

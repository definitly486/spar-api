package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements btonecajqb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f1715ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile btonecajqb f1716iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Object f1717zoijcleaow = f1715ppxfxbqfkf;

    private ppxfxbqfkf(btonecajqb btonecajqbVar) {
        this.f1716iobyxmoadg = btonecajqbVar;
    }

    public static btonecajqb iobyxmoadg(btonecajqb btonecajqbVar) {
        dxjokdxxww.zoijcleaow(btonecajqbVar);
        return btonecajqbVar instanceof ppxfxbqfkf ? btonecajqbVar : new ppxfxbqfkf(btonecajqbVar);
    }

    private static Object ppxfxbqfkf(Object obj, Object obj2) {
        if (obj == f1715ppxfxbqfkf || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static fg.iobyxmoadg zoijcleaow(fg.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadg(gtknphoqwx.iobyxmoadg(iobyxmoadgVar));
    }

    @Override // fg.iobyxmoadg
    public Object get() {
        Object obj = this.f1717zoijcleaow;
        Object obj2 = f1715ppxfxbqfkf;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1717zoijcleaow;
                    if (obj == obj2) {
                        obj = this.f1716iobyxmoadg.get();
                        this.f1717zoijcleaow = ppxfxbqfkf(this.f1717zoijcleaow, obj);
                        this.f1716iobyxmoadg = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}

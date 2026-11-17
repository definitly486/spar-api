package wa;

/* JADX INFO: loaded from: classes2.dex */
public final class zynmafqrjb implements wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f119148ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile wkgbmnqykc f119149iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Object f119150zoijcleaow = f119148ppxfxbqfkf;

    private zynmafqrjb(wkgbmnqykc wkgbmnqykcVar) {
        this.f119149iobyxmoadg = wkgbmnqykcVar;
    }

    public static wkgbmnqykc iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.getClass();
        return wkgbmnqykcVar instanceof zynmafqrjb ? wkgbmnqykcVar : new zynmafqrjb(wkgbmnqykcVar);
    }

    @Override // wa.wkgbmnqykc
    public final Object a() {
        Object objA = this.f119150zoijcleaow;
        Object obj = f119148ppxfxbqfkf;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f119150zoijcleaow;
                    if (objA == obj) {
                        objA = this.f119149iobyxmoadg.a();
                        Object obj2 = this.f119150zoijcleaow;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f119150zoijcleaow = objA;
                        this.f119149iobyxmoadg = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objA;
    }
}

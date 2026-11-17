package pj;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final c f76674iobyxmoadg = new c();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ThreadLocal f76675zoijcleaow = uj.hkdspvbjdz.iobyxmoadg(new uj.istkbnxepw("ThreadLocalEventLoop"));

    private c() {
    }

    public final czzsidtyhn iobyxmoadg() {
        return (czzsidtyhn) f76675zoijcleaow.get();
    }

    public final void ppxfxbqfkf() {
        f76675zoijcleaow.set(null);
    }

    public final void wkgbmnqykc(czzsidtyhn czzsidtyhnVar) {
        f76675zoijcleaow.set(czzsidtyhnVar);
    }

    public final czzsidtyhn zoijcleaow() {
        ThreadLocal threadLocal = f76675zoijcleaow;
        czzsidtyhn czzsidtyhnVar = (czzsidtyhn) threadLocal.get();
        if (czzsidtyhnVar != null) {
            return czzsidtyhnVar;
        }
        czzsidtyhn czzsidtyhnVarIobyxmoadg = ydmasvzmpa.iobyxmoadg();
        threadLocal.set(czzsidtyhnVarIobyxmoadg);
        return czzsidtyhnVarIobyxmoadg;
    }
}

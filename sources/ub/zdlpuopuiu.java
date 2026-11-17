package ub;

/* JADX INFO: loaded from: classes2.dex */
public class zdlpuopuiu implements tc.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f113176ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile Object f113177iobyxmoadg = f113176ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile tc.zoijcleaow f113178zoijcleaow;

    public zdlpuopuiu(tc.zoijcleaow zoijcleaowVar) {
        this.f113178zoijcleaow = zoijcleaowVar;
    }

    @Override // tc.zoijcleaow
    public Object get() {
        Object obj = this.f113177iobyxmoadg;
        Object obj2 = f113176ppxfxbqfkf;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f113177iobyxmoadg;
                    if (obj == obj2) {
                        obj = this.f113178zoijcleaow.get();
                        this.f113177iobyxmoadg = obj;
                        this.f113178zoijcleaow = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}

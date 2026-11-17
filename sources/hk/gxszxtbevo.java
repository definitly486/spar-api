package hk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hg.wflxmlrfwp f40497iobyxmoadg = new hg.wflxmlrfwp();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f40498zoijcleaow;

    protected final void iobyxmoadg(char[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        synchronized (this) {
            try {
                if (this.f40498zoijcleaow + array.length < wkgbmnqykc.f40548iobyxmoadg) {
                    this.f40498zoijcleaow += array.length;
                    this.f40497iobyxmoadg.addLast(array);
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final char[] zoijcleaow(int i13) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f40497iobyxmoadg.pmvmpeiblj();
            if (cArr != null) {
                this.f40498zoijcleaow -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i13] : cArr;
    }
}

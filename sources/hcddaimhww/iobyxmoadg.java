package hcddaimhww;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f40063iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f40064ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final zoijcleaow f40065wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayDeque f40066zoijcleaow;

    public iobyxmoadg(int i13, zoijcleaow zoijcleaowVar) {
        this.f40063iobyxmoadg = i13;
        this.f40066zoijcleaow = new ArrayDeque(i13);
        this.f40065wkgbmnqykc = zoijcleaowVar;
    }

    public Object iobyxmoadg() {
        Object objRemoveLast;
        synchronized (this.f40064ppxfxbqfkf) {
            objRemoveLast = this.f40066zoijcleaow.removeLast();
        }
        return objRemoveLast;
    }

    public boolean ppxfxbqfkf() {
        boolean zIsEmpty;
        synchronized (this.f40064ppxfxbqfkf) {
            zIsEmpty = this.f40066zoijcleaow.isEmpty();
        }
        return zIsEmpty;
    }

    public void zoijcleaow(Object obj) {
        Object objIobyxmoadg;
        synchronized (this.f40064ppxfxbqfkf) {
            try {
                objIobyxmoadg = this.f40066zoijcleaow.size() >= this.f40063iobyxmoadg ? iobyxmoadg() : null;
                this.f40066zoijcleaow.addFirst(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zoijcleaow zoijcleaowVar = this.f40065wkgbmnqykc;
        if (zoijcleaowVar == null || objIobyxmoadg == null) {
            return;
        }
        zoijcleaowVar.iobyxmoadg(objIobyxmoadg);
    }
}

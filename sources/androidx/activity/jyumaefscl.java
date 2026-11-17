package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f2323iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private tg.iobyxmoadg f2324ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CopyOnWriteArrayList f2325zoijcleaow = new CopyOnWriteArrayList();

    public jyumaefscl(boolean z13) {
        this.f2323iobyxmoadg = z13;
    }

    public final void agtfadlqog(tg.iobyxmoadg iobyxmoadgVar) {
        this.f2324ppxfxbqfkf = iobyxmoadgVar;
    }

    public final boolean btonecajqb() {
        return this.f2323iobyxmoadg;
    }

    public final void draadjrbmk(ppxfxbqfkf cancellable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cancellable, "cancellable");
        this.f2325zoijcleaow.remove(cancellable);
    }

    public void dxjokdxxww(zoijcleaow backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
    }

    public final tg.iobyxmoadg eablkybsjg() {
        return this.f2324ppxfxbqfkf;
    }

    public final void gtknphoqwx() {
        Iterator it = this.f2325zoijcleaow.iterator();
        while (it.hasNext()) {
            ((ppxfxbqfkf) it.next()).cancel();
        }
    }

    public void gxszxtbevo() {
    }

    public abstract void lqeggnwhkg();

    public void nufgyqmvbu(zoijcleaow backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
    }

    public final void wflxmlrfwp(boolean z13) {
        this.f2323iobyxmoadg = z13;
        tg.iobyxmoadg iobyxmoadgVar = this.f2324ppxfxbqfkf;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public final void wkgbmnqykc(ppxfxbqfkf cancellable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cancellable, "cancellable");
        this.f2325zoijcleaow.add(cancellable);
    }
}

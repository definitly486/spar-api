package wkgbmnqykc;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f120162iobyxmoadg = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Context f120163zoijcleaow;

    public final void eablkybsjg(zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f120162iobyxmoadg.remove(listener);
    }

    public final void iobyxmoadg(zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        Context context = this.f120163zoijcleaow;
        if (context != null) {
            listener.iobyxmoadg(context);
        }
        this.f120162iobyxmoadg.add(listener);
    }

    public final void ppxfxbqfkf(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f120163zoijcleaow = context;
        Iterator it = this.f120162iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).iobyxmoadg(context);
        }
    }

    public final Context wkgbmnqykc() {
        return this.f120163zoijcleaow;
    }

    public final void zoijcleaow() {
        this.f120163zoijcleaow = null;
    }
}

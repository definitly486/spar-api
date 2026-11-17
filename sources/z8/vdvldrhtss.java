package z8;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class vdvldrhtss {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f129299ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f129298iobyxmoadg = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f129300zoijcleaow = new HashSet();

    public void eablkybsjg() {
        for (c9.ppxfxbqfkf ppxfxbqfkfVar : g9.draadjrbmk.btonecajqb(this.f129298iobyxmoadg)) {
            if (!ppxfxbqfkfVar.iobyxmoadg() && !ppxfxbqfkfVar.nufgyqmvbu()) {
                ppxfxbqfkfVar.clear();
                if (this.f129299ppxfxbqfkf) {
                    this.f129300zoijcleaow.add(ppxfxbqfkfVar);
                } else {
                    ppxfxbqfkfVar.btonecajqb();
                }
            }
        }
    }

    public void gxszxtbevo() {
        this.f129299ppxfxbqfkf = false;
        for (c9.ppxfxbqfkf ppxfxbqfkfVar : g9.draadjrbmk.btonecajqb(this.f129298iobyxmoadg)) {
            if (!ppxfxbqfkfVar.iobyxmoadg() && !ppxfxbqfkfVar.isRunning()) {
                ppxfxbqfkfVar.btonecajqb();
            }
        }
        this.f129300zoijcleaow.clear();
    }

    public boolean iobyxmoadg(c9.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13 = true;
        if (ppxfxbqfkfVar == null) {
            return true;
        }
        boolean zRemove = this.f129298iobyxmoadg.remove(ppxfxbqfkfVar);
        if (!this.f129300zoijcleaow.remove(ppxfxbqfkfVar) && !zRemove) {
            z13 = false;
        }
        if (z13) {
            ppxfxbqfkfVar.clear();
        }
        return z13;
    }

    public void lqeggnwhkg(c9.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f129298iobyxmoadg.add(ppxfxbqfkfVar);
        if (!this.f129299ppxfxbqfkf) {
            ppxfxbqfkfVar.btonecajqb();
            return;
        }
        ppxfxbqfkfVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f129300zoijcleaow.add(ppxfxbqfkfVar);
    }

    public void ppxfxbqfkf() {
        this.f129299ppxfxbqfkf = true;
        for (c9.ppxfxbqfkf ppxfxbqfkfVar : g9.draadjrbmk.btonecajqb(this.f129298iobyxmoadg)) {
            if (ppxfxbqfkfVar.isRunning() || ppxfxbqfkfVar.iobyxmoadg()) {
                ppxfxbqfkfVar.clear();
                this.f129300zoijcleaow.add(ppxfxbqfkfVar);
            }
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f129298iobyxmoadg.size() + ", isPaused=" + this.f129299ppxfxbqfkf + "}";
    }

    public void wkgbmnqykc() {
        this.f129299ppxfxbqfkf = true;
        for (c9.ppxfxbqfkf ppxfxbqfkfVar : g9.draadjrbmk.btonecajqb(this.f129298iobyxmoadg)) {
            if (ppxfxbqfkfVar.isRunning()) {
                ppxfxbqfkfVar.pause();
                this.f129300zoijcleaow.add(ppxfxbqfkfVar);
            }
        }
    }

    public void zoijcleaow() {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129298iobyxmoadg).iterator();
        while (it.hasNext()) {
            iobyxmoadg((c9.ppxfxbqfkf) it.next());
        }
        this.f129300zoijcleaow.clear();
    }
}

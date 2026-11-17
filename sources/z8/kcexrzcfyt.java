package z8;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Set f129271zdlpuopuiu = Collections.newSetFromMap(new WeakHashMap());

    public void draadjrbmk(d9.dxjokdxxww dxjokdxxwwVar) {
        this.f129271zdlpuopuiu.remove(dxjokdxxwwVar);
    }

    public List eablkybsjg() {
        return g9.draadjrbmk.btonecajqb(this.f129271zdlpuopuiu);
    }

    public void gtknphoqwx(d9.dxjokdxxww dxjokdxxwwVar) {
        this.f129271zdlpuopuiu.add(dxjokdxxwwVar);
    }

    @Override // z8.draadjrbmk
    public void onDestroy() {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129271zdlpuopuiu).iterator();
        while (it.hasNext()) {
            ((d9.dxjokdxxww) it.next()).onDestroy();
        }
    }

    @Override // z8.draadjrbmk
    public void onStart() {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129271zdlpuopuiu).iterator();
        while (it.hasNext()) {
            ((d9.dxjokdxxww) it.next()).onStart();
        }
    }

    @Override // z8.draadjrbmk
    public void onStop() {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129271zdlpuopuiu).iterator();
        while (it.hasNext()) {
            ((d9.dxjokdxxww) it.next()).onStop();
        }
    }

    public void wkgbmnqykc() {
        this.f129271zdlpuopuiu.clear();
    }
}

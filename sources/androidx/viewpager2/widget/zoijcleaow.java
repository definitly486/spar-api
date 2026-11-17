package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends ViewPager2.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f13775iobyxmoadg;

    zoijcleaow(int i13) {
        this.f13775iobyxmoadg = new ArrayList(i13);
    }

    private void gxszxtbevo(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void eablkybsjg(ViewPager2.dxjokdxxww dxjokdxxwwVar) {
        this.f13775iobyxmoadg.remove(dxjokdxxwwVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
    public void iobyxmoadg(int i13) {
        try {
            Iterator it = this.f13775iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((ViewPager2.dxjokdxxww) it.next()).iobyxmoadg(i13);
            }
        } catch (ConcurrentModificationException e13) {
            gxszxtbevo(e13);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
    public void ppxfxbqfkf(int i13) {
        try {
            Iterator it = this.f13775iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((ViewPager2.dxjokdxxww) it.next()).ppxfxbqfkf(i13);
            }
        } catch (ConcurrentModificationException e13) {
            gxszxtbevo(e13);
        }
    }

    void wkgbmnqykc(ViewPager2.dxjokdxxww dxjokdxxwwVar) {
        this.f13775iobyxmoadg.add(dxjokdxxwwVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
    public void zoijcleaow(int i13, float f13, int i14) {
        try {
            Iterator it = this.f13775iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((ViewPager2.dxjokdxxww) it.next()).zoijcleaow(i13, f13, i14);
            }
        } catch (ConcurrentModificationException e13) {
            gxszxtbevo(e13);
        }
    }
}

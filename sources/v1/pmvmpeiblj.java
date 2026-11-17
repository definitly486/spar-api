package v1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Runnable f115178iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CopyOnWriteArrayList f115180zoijcleaow = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f115179ppxfxbqfkf = new HashMap();

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final androidx.lifecycle.gtknphoqwx f115181iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private androidx.lifecycle.agtfadlqog f115182zoijcleaow;

        iobyxmoadg(androidx.lifecycle.gtknphoqwx gtknphoqwxVar, androidx.lifecycle.agtfadlqog agtfadlqogVar) {
            this.f115181iobyxmoadg = gtknphoqwxVar;
            this.f115182zoijcleaow = agtfadlqogVar;
            gtknphoqwxVar.iobyxmoadg(agtfadlqogVar);
        }

        void iobyxmoadg() {
            this.f115181iobyxmoadg.wkgbmnqykc(this.f115182zoijcleaow);
            this.f115182zoijcleaow = null;
        }
    }

    public pmvmpeiblj(Runnable runnable) {
        this.f115178iobyxmoadg = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(istkbnxepw istkbnxepwVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
            draadjrbmk(istkbnxepwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, istkbnxepw istkbnxepwVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.nufgyqmvbu(zoijcleaowVar)) {
            ppxfxbqfkf(istkbnxepwVar);
            return;
        }
        if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
            draadjrbmk(istkbnxepwVar);
        } else if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.wkgbmnqykc(zoijcleaowVar)) {
            this.f115180zoijcleaow.remove(istkbnxepwVar);
            this.f115178iobyxmoadg.run();
        }
    }

    public boolean btonecajqb(MenuItem menuItem) {
        Iterator it = this.f115180zoijcleaow.iterator();
        while (it.hasNext()) {
            if (((istkbnxepw) it.next()).ppxfxbqfkf(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void draadjrbmk(istkbnxepw istkbnxepwVar) {
        this.f115180zoijcleaow.remove(istkbnxepwVar);
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f115179ppxfxbqfkf.remove(istkbnxepwVar);
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
        this.f115178iobyxmoadg.run();
    }

    public void dxjokdxxww(Menu menu) {
        Iterator it = this.f115180zoijcleaow.iterator();
        while (it.hasNext()) {
            ((istkbnxepw) it.next()).iobyxmoadg(menu);
        }
    }

    public void eablkybsjg(final istkbnxepw istkbnxepwVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, final androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar) {
        androidx.lifecycle.gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f115179ppxfxbqfkf.remove(istkbnxepwVar);
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
        this.f115179ppxfxbqfkf.put(istkbnxepwVar, new iobyxmoadg(lifecycle, new androidx.lifecycle.agtfadlqog() { // from class: v1.esjtqupxsv
            @Override // androidx.lifecycle.agtfadlqog
            public final void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar2, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar2) {
                this.f115117zdlpuopuiu.lqeggnwhkg(zoijcleaowVar, istkbnxepwVar, vdvldrhtssVar2, iobyxmoadgVar2);
            }
        }));
    }

    public void gtknphoqwx(Menu menu) {
        Iterator it = this.f115180zoijcleaow.iterator();
        while (it.hasNext()) {
            ((istkbnxepw) it.next()).zoijcleaow(menu);
        }
    }

    public void nufgyqmvbu(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f115180zoijcleaow.iterator();
        while (it.hasNext()) {
            ((istkbnxepw) it.next()).wkgbmnqykc(menu, menuInflater);
        }
    }

    public void ppxfxbqfkf(istkbnxepw istkbnxepwVar) {
        this.f115180zoijcleaow.add(istkbnxepwVar);
        this.f115178iobyxmoadg.run();
    }

    public void wkgbmnqykc(final istkbnxepw istkbnxepwVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        ppxfxbqfkf(istkbnxepwVar);
        androidx.lifecycle.gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f115179ppxfxbqfkf.remove(istkbnxepwVar);
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
        this.f115179ppxfxbqfkf.put(istkbnxepwVar, new iobyxmoadg(lifecycle, new androidx.lifecycle.agtfadlqog() { // from class: v1.lereixgezr
            @Override // androidx.lifecycle.agtfadlqog
            public final void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar2, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar2) {
                this.f115160zdlpuopuiu.gxszxtbevo(istkbnxepwVar, vdvldrhtssVar2, iobyxmoadgVar2);
            }
        }));
    }
}

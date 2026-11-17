package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import g3.h0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Looper f11160eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private v2.cdpycssgdh f11161gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private h0 f11163lqeggnwhkg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f11162iobyxmoadg = new ArrayList(1);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HashSet f11166zoijcleaow = new HashSet(1);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final kcexrzcfyt.iobyxmoadg f11164ppxfxbqfkf = new kcexrzcfyt.iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg f11165wkgbmnqykc = new androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg();

    protected final boolean cqumvgiudr() {
        return !this.f11166zoijcleaow.isEmpty();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void draadjrbmk(oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean zIsEmpty = this.f11166zoijcleaow.isEmpty();
        this.f11166zoijcleaow.remove(ppxfxbqfkfVar);
        if (zIsEmpty || !this.f11166zoijcleaow.isEmpty()) {
            return;
        }
        yggfygwlhe();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void dxjokdxxww(oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar) {
        y2.iobyxmoadg.eablkybsjg(this.f11160eablkybsjg);
        boolean zIsEmpty = this.f11166zoijcleaow.isEmpty();
        this.f11166zoijcleaow.add(ppxfxbqfkfVar);
        if (zIsEmpty) {
            jyumaefscl();
        }
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void eablkybsjg(Handler handler, androidx.media3.exoplayer.drm.nufgyqmvbu nufgyqmvbuVar) {
        y2.iobyxmoadg.eablkybsjg(handler);
        y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar);
        this.f11165wkgbmnqykc.lqeggnwhkg(handler, nufgyqmvbuVar);
    }

    protected abstract void esjtqupxsv(b3.wflxmlrfwp wflxmlrfwpVar);

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void gtknphoqwx(oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f11162iobyxmoadg.remove(ppxfxbqfkfVar);
        if (!this.f11162iobyxmoadg.isEmpty()) {
            draadjrbmk(ppxfxbqfkfVar);
            return;
        }
        this.f11160eablkybsjg = null;
        this.f11161gxszxtbevo = null;
        this.f11163lqeggnwhkg = null;
        this.f11166zoijcleaow.clear();
        pmvmpeiblj();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void gxszxtbevo(androidx.media3.exoplayer.drm.nufgyqmvbu nufgyqmvbuVar) {
        this.f11165wkgbmnqykc.zdlpuopuiu(nufgyqmvbuVar);
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void iobyxmoadg(Handler handler, kcexrzcfyt kcexrzcfytVar) {
        y2.iobyxmoadg.eablkybsjg(handler);
        y2.iobyxmoadg.eablkybsjg(kcexrzcfytVar);
        this.f11164ppxfxbqfkf.lqeggnwhkg(handler, kcexrzcfytVar);
    }

    protected final h0 iwizpuwonk() {
        return (h0) y2.iobyxmoadg.dxjokdxxww(this.f11163lqeggnwhkg);
    }

    protected void jyumaefscl() {
    }

    protected final kcexrzcfyt.iobyxmoadg kcexrzcfyt(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return this.f11164ppxfxbqfkf.lereixgezr(i13, zoijcleaowVar);
    }

    protected final void lereixgezr(v2.cdpycssgdh cdpycssgdhVar) {
        this.f11161gxszxtbevo = cdpycssgdhVar;
        Iterator it = this.f11162iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((oxmwwwfdhm.ppxfxbqfkf) it.next()).iobyxmoadg(this, cdpycssgdhVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void nufgyqmvbu(oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar, b3.wflxmlrfwp wflxmlrfwpVar, h0 h0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f11160eablkybsjg;
        y2.iobyxmoadg.iobyxmoadg(looper == null || looper == looperMyLooper);
        this.f11163lqeggnwhkg = h0Var;
        v2.cdpycssgdh cdpycssgdhVar = this.f11161gxszxtbevo;
        this.f11162iobyxmoadg.add(ppxfxbqfkfVar);
        if (this.f11160eablkybsjg == null) {
            this.f11160eablkybsjg = looperMyLooper;
            this.f11166zoijcleaow.add(ppxfxbqfkfVar);
            esjtqupxsv(wflxmlrfwpVar);
        } else if (cdpycssgdhVar != null) {
            dxjokdxxww(ppxfxbqfkfVar);
            ppxfxbqfkfVar.iobyxmoadg(this, cdpycssgdhVar);
        }
    }

    protected final androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg oxmwwwfdhm(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return this.f11165wkgbmnqykc.yggfygwlhe(0, zoijcleaowVar);
    }

    protected abstract void pmvmpeiblj();

    protected final androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg vdvldrhtss(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return this.f11165wkgbmnqykc.yggfygwlhe(i13, zoijcleaowVar);
    }

    protected void yggfygwlhe() {
    }

    protected final kcexrzcfyt.iobyxmoadg zdlpuopuiu(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return this.f11164ppxfxbqfkf.lereixgezr(0, zoijcleaowVar);
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public final void zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
        this.f11164ppxfxbqfkf.esjtqupxsv(kcexrzcfytVar);
    }
}

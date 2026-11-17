package jpowsppfya;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import lereixgezr.tbqsvytpvh;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public class wwaezpbzkn {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private iobyxmoadg f52024draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f52025dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f52026eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private tbqsvytpvh f52027gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f52028gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f52029iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.camera.core.impl.iwizpuwonk f52030lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f52031nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f52033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rect f52035wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Matrix f52036zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f52023btonecajqb = false;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Set f52034wflxmlrfwp = new HashSet();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f52022agtfadlqog = false;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final List f52032ojitshcjhn = new ArrayList();

    static class iobyxmoadg extends DeferrableSurface {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        final com.google.common.util.concurrent.wkgbmnqykc f52037ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private hcddaimhww f52038oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f52039rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private DeferrableSurface f52040vdvldrhtss;

        iobyxmoadg(Size size, int i13) {
            super(size, i13);
            this.f52037ojitshcjhn = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: jpowsppfya.iozdgvuglv
                @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                    return this.f51988iobyxmoadg.agtfadlqog(iobyxmoadgVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object agtfadlqog(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.f52039rgvfuqvkyq = iobyxmoadgVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void iwizpuwonk() {
            hcddaimhww hcddaimhwwVar = this.f52038oxmwwwfdhm;
            if (hcddaimhwwVar != null) {
                hcddaimhwwVar.agtfadlqog();
            }
            if (this.f52040vdvldrhtss == null) {
                this.f52039rgvfuqvkyq.wkgbmnqykc();
            }
        }

        public void cqumvgiudr(hcddaimhww hcddaimhwwVar) {
            u1.nufgyqmvbu.dxjokdxxww(this.f52038oxmwwwfdhm == null, "Consumer can only be linked once.");
            this.f52038oxmwwwfdhm = hcddaimhwwVar;
        }

        public boolean esjtqupxsv(final DeferrableSurface deferrableSurface, Runnable runnable) {
            cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
            u1.nufgyqmvbu.gxszxtbevo(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.f52040vdvldrhtss;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            u1.nufgyqmvbu.dxjokdxxww(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            u1.nufgyqmvbu.zoijcleaow(nufgyqmvbu().equals(deferrableSurface.nufgyqmvbu()), String.format("The provider's size(%s) must match the parent(%s)", nufgyqmvbu(), deferrableSurface.nufgyqmvbu()));
            u1.nufgyqmvbu.zoijcleaow(dxjokdxxww() == deferrableSurface.dxjokdxxww(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(dxjokdxxww()), Integer.valueOf(deferrableSurface.dxjokdxxww())));
            u1.nufgyqmvbu.dxjokdxxww(!wflxmlrfwp(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f52040vdvldrhtss = deferrableSurface;
            iozdgvuglv.gtknphoqwx.yggfygwlhe(deferrableSurface.btonecajqb(), this.f52039rgvfuqvkyq);
            deferrableSurface.draadjrbmk();
            gtknphoqwx().iobyxmoadg(new Runnable() { // from class: jpowsppfya.lmojexxdyd
                @Override // java.lang.Runnable
                public final void run() {
                    deferrableSurface.eablkybsjg();
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
            deferrableSurface.gxszxtbevo().iobyxmoadg(runnable, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
            return true;
        }

        boolean jyumaefscl() {
            cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
            return this.f52040vdvldrhtss == null && !wflxmlrfwp();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        protected com.google.common.util.concurrent.wkgbmnqykc oxmwwwfdhm() {
            return this.f52037ojitshcjhn;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void wkgbmnqykc() {
            super.wkgbmnqykc();
            cdpycssgdh.rgvfuqvkyq.wkgbmnqykc(new Runnable() { // from class: jpowsppfya.yadqdtsiqt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52047zdlpuopuiu.iwizpuwonk();
                }
            });
        }
    }

    public wwaezpbzkn(int i13, int i14, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, Matrix matrix, boolean z13, Rect rect, int i15, int i16, boolean z14) {
        this.f52028gxszxtbevo = i13;
        this.f52029iobyxmoadg = i14;
        this.f52030lqeggnwhkg = iwizpuwonkVar;
        this.f52036zoijcleaow = matrix;
        this.f52033ppxfxbqfkf = z13;
        this.f52035wkgbmnqykc = rect;
        this.f52025dxjokdxxww = i15;
        this.f52031nufgyqmvbu = i16;
        this.f52026eablkybsjg = z14;
        this.f52024draadjrbmk = new iobyxmoadg(iwizpuwonkVar.eablkybsjg(), i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cqumvgiudr() {
        if (this.f52022agtfadlqog) {
            return;
        }
        yggfygwlhe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void esjtqupxsv() {
        yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: jpowsppfya.istkbnxepw
            @Override // java.lang.Runnable
            public final void run() {
                this.f51989zdlpuopuiu.cqumvgiudr();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc iwizpuwonk(final iobyxmoadg iobyxmoadgVar, int i13, ydmasvzmpa.iobyxmoadg iobyxmoadgVar2, ydmasvzmpa.iobyxmoadg iobyxmoadgVar3, Surface surface) {
        u1.nufgyqmvbu.gxszxtbevo(surface);
        try {
            iobyxmoadgVar.draadjrbmk();
            hcddaimhww hcddaimhwwVar = new hcddaimhww(surface, kcexrzcfyt(), i13, this.f52030lqeggnwhkg.eablkybsjg(), iobyxmoadgVar2, iobyxmoadgVar3, this.f52036zoijcleaow);
            hcddaimhwwVar.dxjokdxxww().iobyxmoadg(new Runnable() { // from class: jpowsppfya.cdpycssgdh
                @Override // java.lang.Runnable
                public final void run() {
                    iobyxmoadgVar.eablkybsjg();
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
            iobyxmoadgVar.cqumvgiudr(hcddaimhwwVar);
            return iozdgvuglv.gtknphoqwx.draadjrbmk(hcddaimhwwVar);
        } catch (DeferrableSurface.SurfaceClosedException e13) {
            return iozdgvuglv.gtknphoqwx.btonecajqb(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lereixgezr(int i13, int i14) {
        boolean z13;
        boolean z14 = true;
        if (this.f52025dxjokdxxww != i13) {
            this.f52025dxjokdxxww = i13;
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f52031nufgyqmvbu != i14) {
            this.f52031nufgyqmvbu = i14;
        } else {
            z14 = z13;
        }
        if (z14) {
            pmvmpeiblj();
        }
    }

    private void lqeggnwhkg() {
        u1.nufgyqmvbu.dxjokdxxww(!this.f52023btonecajqb, "Consumer can only be linked once.");
        this.f52023btonecajqb = true;
    }

    private void nufgyqmvbu() {
        u1.nufgyqmvbu.dxjokdxxww(!this.f52022agtfadlqog, "Edge is already closed.");
    }

    private void pmvmpeiblj() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        tbqsvytpvh.nufgyqmvbu nufgyqmvbuVarLqeggnwhkg = tbqsvytpvh.nufgyqmvbu.lqeggnwhkg(this.f52035wkgbmnqykc, this.f52025dxjokdxxww, this.f52031nufgyqmvbu, zdlpuopuiu(), this.f52036zoijcleaow, this.f52026eablkybsjg);
        tbqsvytpvh tbqsvytpvhVar = this.f52027gtknphoqwx;
        if (tbqsvytpvhVar != null) {
            tbqsvytpvhVar.cdpycssgdh(nufgyqmvbuVarLqeggnwhkg);
        }
        Iterator it = this.f52032ojitshcjhn.iterator();
        while (it.hasNext()) {
            ((u1.iobyxmoadg) it.next()).accept(nufgyqmvbuVarLqeggnwhkg);
        }
    }

    public Rect agtfadlqog() {
        return this.f52035wkgbmnqykc;
    }

    public com.google.common.util.concurrent.wkgbmnqykc btonecajqb(final int i13, final ydmasvzmpa.iobyxmoadg iobyxmoadgVar, final ydmasvzmpa.iobyxmoadg iobyxmoadgVar2) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        lqeggnwhkg();
        final iobyxmoadg iobyxmoadgVar3 = this.f52024draadjrbmk;
        return iozdgvuglv.gtknphoqwx.lereixgezr(iobyxmoadgVar3.btonecajqb(), new iozdgvuglv.iobyxmoadg() { // from class: jpowsppfya.zynmafqrjb
            @Override // iozdgvuglv.iobyxmoadg
            public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                return this.f52065iobyxmoadg.iwizpuwonk(iobyxmoadgVar3, i13, iobyxmoadgVar, iobyxmoadgVar2, (Surface) obj);
            }
        }, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
    }

    public tbqsvytpvh draadjrbmk(istkbnxepw.iwizpuwonk iwizpuwonkVar, boolean z13) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        tbqsvytpvh tbqsvytpvhVar = new tbqsvytpvh(this.f52030lqeggnwhkg.eablkybsjg(), iwizpuwonkVar, z13, this.f52030lqeggnwhkg.zoijcleaow(), this.f52030lqeggnwhkg.ppxfxbqfkf(), new Runnable() { // from class: jpowsppfya.cqumvgiudr
            @Override // java.lang.Runnable
            public final void run() {
                this.f51946zdlpuopuiu.esjtqupxsv();
            }
        });
        try {
            final DeferrableSurface deferrableSurfaceWflxmlrfwp = tbqsvytpvhVar.wflxmlrfwp();
            iobyxmoadg iobyxmoadgVar = this.f52024draadjrbmk;
            Objects.requireNonNull(iobyxmoadgVar);
            if (iobyxmoadgVar.esjtqupxsv(deferrableSurfaceWflxmlrfwp, new esjtqupxsv(iobyxmoadgVar))) {
                com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = iobyxmoadgVar.gtknphoqwx();
                Objects.requireNonNull(deferrableSurfaceWflxmlrfwp);
                wkgbmnqykcVarGtknphoqwx.iobyxmoadg(new Runnable() { // from class: jpowsppfya.lereixgezr
                    @Override // java.lang.Runnable
                    public final void run() {
                        deferrableSurfaceWflxmlrfwp.wkgbmnqykc();
                    }
                }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
            }
            this.f52027gtknphoqwx = tbqsvytpvhVar;
            pmvmpeiblj();
            return tbqsvytpvhVar;
        } catch (DeferrableSurface.SurfaceClosedException e13) {
            throw new AssertionError("Surface is somehow already closed", e13);
        } catch (RuntimeException e14) {
            tbqsvytpvhVar.yadqdtsiqt();
            throw e14;
        }
    }

    public final void dxjokdxxww() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f52024draadjrbmk.wkgbmnqykc();
        this.f52022agtfadlqog = true;
    }

    public void eablkybsjg(Runnable runnable) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        this.f52034wflxmlrfwp.add(runnable);
    }

    public tbqsvytpvh gtknphoqwx(istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        return draadjrbmk(iwizpuwonkVar, true);
    }

    public void gxszxtbevo(u1.iobyxmoadg iobyxmoadgVar) {
        u1.nufgyqmvbu.gxszxtbevo(iobyxmoadgVar);
        this.f52032ojitshcjhn.add(iobyxmoadgVar);
    }

    public void istkbnxepw(final int i13, final int i14) {
        cdpycssgdh.rgvfuqvkyq.wkgbmnqykc(new Runnable() { // from class: jpowsppfya.pmvmpeiblj
            @Override // java.lang.Runnable
            public final void run() {
                this.f52001zdlpuopuiu.lereixgezr(i13, i14);
            }
        });
    }

    public boolean jyumaefscl() {
        return this.f52026eablkybsjg;
    }

    public int kcexrzcfyt() {
        return this.f52028gxszxtbevo;
    }

    public DeferrableSurface ojitshcjhn() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        lqeggnwhkg();
        return this.f52024draadjrbmk;
    }

    public androidx.camera.core.impl.iwizpuwonk oxmwwwfdhm() {
        return this.f52030lqeggnwhkg;
    }

    public int rgvfuqvkyq() {
        return this.f52025dxjokdxxww;
    }

    public Matrix vdvldrhtss() {
        return this.f52036zoijcleaow;
    }

    public final void wflxmlrfwp() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        this.f52024draadjrbmk.wkgbmnqykc();
    }

    public void yggfygwlhe() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        if (this.f52024draadjrbmk.jyumaefscl()) {
            return;
        }
        this.f52023btonecajqb = false;
        this.f52024draadjrbmk.wkgbmnqykc();
        this.f52024draadjrbmk = new iobyxmoadg(this.f52030lqeggnwhkg.eablkybsjg(), this.f52029iobyxmoadg);
        Iterator it = this.f52034wflxmlrfwp.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public boolean zdlpuopuiu() {
        return this.f52033ppxfxbqfkf;
    }

    public void zynmafqrjb(DeferrableSurface deferrableSurface) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        nufgyqmvbu();
        iobyxmoadg iobyxmoadgVar = this.f52024draadjrbmk;
        Objects.requireNonNull(iobyxmoadgVar);
        iobyxmoadgVar.esjtqupxsv(deferrableSurface, new esjtqupxsv(iobyxmoadgVar));
    }
}

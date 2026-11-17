package zynmafqrjb;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Objects;
import lereixgezr.mbcevpiqjq;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
class oxmwwwfdhm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ppxfxbqfkf f131648eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private zynmafqrjb f131649gxszxtbevo = null;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    hkdspvbjdz f131650iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    androidx.camera.core.vdvldrhtss f131651ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private jpowsppfya.iobyxmoadg f131652wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    androidx.camera.core.vdvldrhtss f131653zoijcleaow;

    class iobyxmoadg extends istkbnxepw.nufgyqmvbu {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void dxjokdxxww() {
            hkdspvbjdz hkdspvbjdzVar = oxmwwwfdhm.this.f131650iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void nufgyqmvbu(int i13) {
            hkdspvbjdz hkdspvbjdzVar = oxmwwwfdhm.this.f131650iobyxmoadg;
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void eablkybsjg(int i13) {
            yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: zynmafqrjb.vdvldrhtss
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131675zdlpuopuiu.dxjokdxxww();
                }
            });
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void wkgbmnqykc(int i13, final int i14) {
            yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: zynmafqrjb.rgvfuqvkyq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131668zdlpuopuiu.nufgyqmvbu(i14);
                }
            });
        }
    }

    static abstract class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private istkbnxepw.nufgyqmvbu f131655iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private DeferrableSurface f131656ppxfxbqfkf = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private DeferrableSurface f131657zoijcleaow;

        class iobyxmoadg extends istkbnxepw.nufgyqmvbu {
            iobyxmoadg() {
            }
        }

        ppxfxbqfkf() {
        }

        static ppxfxbqfkf draadjrbmk(Size size, int i13, int i14, boolean z13, mbcevpiqjq mbcevpiqjqVar, Size size2, int i15) {
            return new zynmafqrjb.zoijcleaow(size, i13, i14, z13, mbcevpiqjqVar, size2, i15, new jpowsppfya.vdvldrhtss(), new jpowsppfya.vdvldrhtss());
        }

        void agtfadlqog(Surface surface, Size size, int i13) {
            this.f131656ppxfxbqfkf = new istkbnxepw.dsvhmnatus(surface, size, i13);
        }

        DeferrableSurface btonecajqb() {
            DeferrableSurface deferrableSurface = this.f131657zoijcleaow;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        abstract Size dxjokdxxww();

        abstract int eablkybsjg();

        abstract boolean gtknphoqwx();

        abstract Size gxszxtbevo();

        abstract jpowsppfya.vdvldrhtss iobyxmoadg();

        DeferrableSurface lqeggnwhkg() {
            return this.f131656ppxfxbqfkf;
        }

        abstract jpowsppfya.vdvldrhtss nufgyqmvbu();

        void ojitshcjhn(Surface surface) {
            u1.nufgyqmvbu.dxjokdxxww(this.f131657zoijcleaow == null, "The surface is already set.");
            this.f131657zoijcleaow = new istkbnxepw.dsvhmnatus(surface, dxjokdxxww(), ppxfxbqfkf());
        }

        abstract int ppxfxbqfkf();

        void wflxmlrfwp(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
            this.f131655iobyxmoadg = nufgyqmvbuVar;
        }

        abstract int wkgbmnqykc();

        abstract mbcevpiqjq zoijcleaow();
    }

    class zoijcleaow implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f131659iobyxmoadg;

        zoijcleaow(hkdspvbjdz hkdspvbjdzVar) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
            if (this.f131659iobyxmoadg == oxmwwwfdhm.this.f131650iobyxmoadg) {
                sopmlzcsov.draadjrbmk("CaptureNode", "request aborted, id=" + oxmwwwfdhm.this.f131650iobyxmoadg.eablkybsjg());
                if (oxmwwwfdhm.this.f131649gxszxtbevo != null) {
                    oxmwwwfdhm.this.f131649gxszxtbevo.btonecajqb();
                }
                oxmwwwfdhm.this.f131650iobyxmoadg = null;
            }
        }
    }

    oxmwwwfdhm() {
    }

    private void agtfadlqog(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        jpowsppfya.iobyxmoadg iobyxmoadgVar = this.f131652wkgbmnqykc;
        Objects.requireNonNull(iobyxmoadgVar);
        iobyxmoadgVar.iobyxmoadg().accept(jpowsppfya.zoijcleaow.ppxfxbqfkf(this.f131650iobyxmoadg, agtfadlqogVar));
        this.f131650iobyxmoadg.vdvldrhtss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void btonecajqb(androidx.camera.core.vdvldrhtss vdvldrhtssVar) {
        if (vdvldrhtssVar != null) {
            vdvldrhtssVar.wflxmlrfwp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
        try {
            androidx.camera.core.agtfadlqog agtfadlqogVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf();
            if (agtfadlqogVarPpxfxbqfkf != null) {
                ojitshcjhn(agtfadlqogVarPpxfxbqfkf);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx(hkdspvbjdz hkdspvbjdzVar) {
        rgvfuqvkyq(hkdspvbjdzVar);
        this.f131649gxszxtbevo.dxjokdxxww(hkdspvbjdzVar);
    }

    private void kcexrzcfyt(ppxfxbqfkf ppxfxbqfkfVar, final androidx.camera.core.vdvldrhtss vdvldrhtssVar, final androidx.camera.core.vdvldrhtss vdvldrhtssVar2) {
        ppxfxbqfkfVar.btonecajqb().wkgbmnqykc();
        ppxfxbqfkfVar.btonecajqb().gtknphoqwx().iobyxmoadg(new Runnable() { // from class: zynmafqrjb.agtfadlqog
            @Override // java.lang.Runnable
            public final void run() {
                vdvldrhtssVar.wflxmlrfwp();
            }
        }, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
        if (ppxfxbqfkfVar.lqeggnwhkg() != null) {
            ppxfxbqfkfVar.lqeggnwhkg().wkgbmnqykc();
            ppxfxbqfkfVar.lqeggnwhkg().gtknphoqwx().iobyxmoadg(new Runnable() { // from class: zynmafqrjb.ojitshcjhn
                @Override // java.lang.Runnable
                public final void run() {
                    oxmwwwfdhm.btonecajqb(vdvldrhtssVar2);
                }
            }, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
        }
    }

    private static istkbnxepw.cllcsxoeiz lqeggnwhkg(mbcevpiqjq mbcevpiqjqVar, int i13, int i14, int i15) {
        return mbcevpiqjqVar != null ? mbcevpiqjqVar.iobyxmoadg(i13, i14, i15, 4, 0L) : androidx.camera.core.ojitshcjhn.iobyxmoadg(i13, i14, i15, 4);
    }

    private void vdvldrhtss(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        sopmlzcsov.draadjrbmk("CaptureNode", "Postview image is closed due to request completed or aborted");
        agtfadlqogVar.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wflxmlrfwp(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
        try {
            androidx.camera.core.agtfadlqog agtfadlqogVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf();
            if (agtfadlqogVarPpxfxbqfkf != null) {
                vdvldrhtss(agtfadlqogVarPpxfxbqfkf);
            }
        } catch (IllegalStateException e13) {
            sopmlzcsov.wkgbmnqykc("CaptureNode", "Failed to acquire latest image of postview", e13);
        }
    }

    public jpowsppfya.iobyxmoadg jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar) {
        u1.iobyxmoadg iobyxmoadgVar;
        istkbnxepw.cllcsxoeiz cllcsxoeizVar;
        u1.nufgyqmvbu.dxjokdxxww(this.f131648eablkybsjg == null && this.f131653zoijcleaow == null, "CaptureNode does not support recreation yet.");
        this.f131648eablkybsjg = ppxfxbqfkfVar;
        Size sizeDxjokdxxww = ppxfxbqfkfVar.dxjokdxxww();
        int iPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        boolean zGtknphoqwx = ppxfxbqfkfVar.gtknphoqwx();
        istkbnxepw.nufgyqmvbu iobyxmoadgVar2 = new iobyxmoadg();
        if (zGtknphoqwx) {
            ppxfxbqfkfVar.zoijcleaow();
            zynmafqrjb zynmafqrjbVar = new zynmafqrjb(lqeggnwhkg(null, sizeDxjokdxxww.getWidth(), sizeDxjokdxxww.getHeight(), iPpxfxbqfkf));
            this.f131649gxszxtbevo = zynmafqrjbVar;
            iobyxmoadgVar = new u1.iobyxmoadg() { // from class: zynmafqrjb.btonecajqb
                @Override // u1.iobyxmoadg
                public final void accept(Object obj) {
                    this.f131597iobyxmoadg.gtknphoqwx((hkdspvbjdz) obj);
                }
            };
            cllcsxoeizVar = zynmafqrjbVar;
        } else {
            ppxfxbqfkfVar.zoijcleaow();
            androidx.camera.core.rgvfuqvkyq rgvfuqvkyqVar = new androidx.camera.core.rgvfuqvkyq(sizeDxjokdxxww.getWidth(), sizeDxjokdxxww.getHeight(), iPpxfxbqfkf, 4);
            iobyxmoadgVar2 = istkbnxepw.dxjokdxxww.zoijcleaow(iobyxmoadgVar2, rgvfuqvkyqVar.agtfadlqog());
            iobyxmoadgVar = new u1.iobyxmoadg() { // from class: zynmafqrjb.dxjokdxxww
                @Override // u1.iobyxmoadg
                public final void accept(Object obj) {
                    this.f131613iobyxmoadg.rgvfuqvkyq((hkdspvbjdz) obj);
                }
            };
            cllcsxoeizVar = rgvfuqvkyqVar;
        }
        ppxfxbqfkfVar.wflxmlrfwp(iobyxmoadgVar2);
        Surface surfaceIobyxmoadg = cllcsxoeizVar.iobyxmoadg();
        Objects.requireNonNull(surfaceIobyxmoadg);
        ppxfxbqfkfVar.ojitshcjhn(surfaceIobyxmoadg);
        this.f131653zoijcleaow = new androidx.camera.core.vdvldrhtss(cllcsxoeizVar);
        cllcsxoeizVar.lqeggnwhkg(new istkbnxepw.cllcsxoeiz.iobyxmoadg() { // from class: zynmafqrjb.gtknphoqwx
            @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
            public final void iobyxmoadg(istkbnxepw.cllcsxoeiz cllcsxoeizVar2) {
                this.f131616iobyxmoadg.draadjrbmk(cllcsxoeizVar2);
            }
        }, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
        if (ppxfxbqfkfVar.gxszxtbevo() != null) {
            ppxfxbqfkfVar.zoijcleaow();
            istkbnxepw.cllcsxoeiz cllcsxoeizVarLqeggnwhkg = lqeggnwhkg(null, ppxfxbqfkfVar.gxszxtbevo().getWidth(), ppxfxbqfkfVar.gxszxtbevo().getHeight(), ppxfxbqfkfVar.eablkybsjg());
            cllcsxoeizVarLqeggnwhkg.lqeggnwhkg(new istkbnxepw.cllcsxoeiz.iobyxmoadg() { // from class: zynmafqrjb.draadjrbmk
                @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
                public final void iobyxmoadg(istkbnxepw.cllcsxoeiz cllcsxoeizVar2) {
                    this.f131600iobyxmoadg.wflxmlrfwp(cllcsxoeizVar2);
                }
            }, yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
            this.f131651ppxfxbqfkf = new androidx.camera.core.vdvldrhtss(cllcsxoeizVarLqeggnwhkg);
            ppxfxbqfkfVar.agtfadlqog(cllcsxoeizVarLqeggnwhkg.iobyxmoadg(), ppxfxbqfkfVar.gxszxtbevo(), ppxfxbqfkfVar.eablkybsjg());
        }
        ppxfxbqfkfVar.nufgyqmvbu().iobyxmoadg(iobyxmoadgVar);
        ppxfxbqfkfVar.iobyxmoadg().iobyxmoadg(new u1.iobyxmoadg() { // from class: zynmafqrjb.wflxmlrfwp
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f131676iobyxmoadg.zdlpuopuiu((stevsuqkhv.iobyxmoadg) obj);
            }
        });
        jpowsppfya.iobyxmoadg iobyxmoadgVarEablkybsjg = jpowsppfya.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.wkgbmnqykc());
        this.f131652wkgbmnqykc = iobyxmoadgVarEablkybsjg;
        return iobyxmoadgVarEablkybsjg;
    }

    public int nufgyqmvbu() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        u1.nufgyqmvbu.dxjokdxxww(this.f131653zoijcleaow != null, "The ImageReader is not initialized.");
        return this.f131653zoijcleaow.btonecajqb();
    }

    void ojitshcjhn(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        sopmlzcsov.draadjrbmk("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + agtfadlqogVar);
        agtfadlqogVar.close();
    }

    public void oxmwwwfdhm() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        ppxfxbqfkf ppxfxbqfkfVar = this.f131648eablkybsjg;
        Objects.requireNonNull(ppxfxbqfkfVar);
        androidx.camera.core.vdvldrhtss vdvldrhtssVar = this.f131653zoijcleaow;
        Objects.requireNonNull(vdvldrhtssVar);
        kcexrzcfyt(ppxfxbqfkfVar, vdvldrhtssVar, this.f131651ppxfxbqfkf);
    }

    void rgvfuqvkyq(hkdspvbjdz hkdspvbjdzVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        u1.nufgyqmvbu.dxjokdxxww(hkdspvbjdzVar.nufgyqmvbu().size() == 1, "only one capture stage is supported.");
        u1.nufgyqmvbu.dxjokdxxww(nufgyqmvbu() > 0, "Too many acquire images. Close image to be able to process next.");
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(hkdspvbjdzVar.iobyxmoadg(), new zoijcleaow(hkdspvbjdzVar), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    public void yggfygwlhe(androidx.camera.core.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        u1.nufgyqmvbu.dxjokdxxww(this.f131653zoijcleaow != null, "The ImageReader is not initialized.");
        this.f131653zoijcleaow.agtfadlqog(iobyxmoadgVar);
    }

    void zdlpuopuiu(stevsuqkhv.iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
    }
}

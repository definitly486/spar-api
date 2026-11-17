package androidx.camera.core;

import android.view.Surface;
import istkbnxepw.cllcsxoeiz;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class vdvldrhtss implements cllcsxoeiz {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Surface f3970eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private eablkybsjg.iobyxmoadg f3971gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cllcsxoeiz f3975wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f3972iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f3976zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f3974ppxfxbqfkf = false;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final eablkybsjg.iobyxmoadg f3973lqeggnwhkg = new eablkybsjg.iobyxmoadg() { // from class: lereixgezr.yfnezrywwk
        @Override // androidx.camera.core.eablkybsjg.iobyxmoadg
        public final void zoijcleaow(androidx.camera.core.agtfadlqog agtfadlqogVar) {
            this.f62456iobyxmoadg.gtknphoqwx(agtfadlqogVar);
        }
    };

    public vdvldrhtss(cllcsxoeiz cllcsxoeizVar) {
        this.f3975wkgbmnqykc = cllcsxoeizVar;
        this.f3970eablkybsjg = cllcsxoeizVar.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(cllcsxoeiz.iobyxmoadg iobyxmoadgVar, cllcsxoeiz cllcsxoeizVar) {
        iobyxmoadgVar.iobyxmoadg(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx(agtfadlqog agtfadlqogVar) {
        eablkybsjg.iobyxmoadg iobyxmoadgVar;
        synchronized (this.f3972iobyxmoadg) {
            try {
                int i13 = this.f3976zoijcleaow - 1;
                this.f3976zoijcleaow = i13;
                if (this.f3974ppxfxbqfkf && i13 == 0) {
                    close();
                }
                iobyxmoadgVar = this.f3971gxszxtbevo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.zoijcleaow(agtfadlqogVar);
        }
    }

    private agtfadlqog ojitshcjhn(agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar == null) {
            return null;
        }
        this.f3976zoijcleaow++;
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(agtfadlqogVar);
        kcexrzcfytVar.iobyxmoadg(this.f3973lqeggnwhkg);
        return kcexrzcfytVar;
    }

    public void agtfadlqog(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f3972iobyxmoadg) {
            this.f3971gxszxtbevo = iobyxmoadgVar;
        }
    }

    public int btonecajqb() {
        int iGxszxtbevo;
        synchronized (this.f3972iobyxmoadg) {
            iGxszxtbevo = this.f3975wkgbmnqykc.gxszxtbevo() - this.f3976zoijcleaow;
        }
        return iGxszxtbevo;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void close() {
        synchronized (this.f3972iobyxmoadg) {
            try {
                Surface surface = this.f3970eablkybsjg;
                if (surface != null) {
                    surface.release();
                }
                this.f3975wkgbmnqykc.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void eablkybsjg() {
        synchronized (this.f3972iobyxmoadg) {
            this.f3975wkgbmnqykc.eablkybsjg();
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getHeight() {
        int height;
        synchronized (this.f3972iobyxmoadg) {
            height = this.f3975wkgbmnqykc.getHeight();
        }
        return height;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getWidth() {
        int width;
        synchronized (this.f3972iobyxmoadg) {
            width = this.f3975wkgbmnqykc.getWidth();
        }
        return width;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int gxszxtbevo() {
        int iGxszxtbevo;
        synchronized (this.f3972iobyxmoadg) {
            iGxszxtbevo = this.f3975wkgbmnqykc.gxszxtbevo();
        }
        return iGxszxtbevo;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public Surface iobyxmoadg() {
        Surface surfaceIobyxmoadg;
        synchronized (this.f3972iobyxmoadg) {
            surfaceIobyxmoadg = this.f3975wkgbmnqykc.iobyxmoadg();
        }
        return surfaceIobyxmoadg;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void lqeggnwhkg(final cllcsxoeiz.iobyxmoadg iobyxmoadgVar, Executor executor) {
        synchronized (this.f3972iobyxmoadg) {
            this.f3975wkgbmnqykc.lqeggnwhkg(new cllcsxoeiz.iobyxmoadg() { // from class: lereixgezr.uwvvkdfqfp
                @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
                public final void iobyxmoadg(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
                    this.f62435iobyxmoadg.draadjrbmk(iobyxmoadgVar, cllcsxoeizVar);
                }
            }, executor);
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public agtfadlqog nufgyqmvbu() {
        agtfadlqog agtfadlqogVarOjitshcjhn;
        synchronized (this.f3972iobyxmoadg) {
            agtfadlqogVarOjitshcjhn = ojitshcjhn(this.f3975wkgbmnqykc.nufgyqmvbu());
        }
        return agtfadlqogVarOjitshcjhn;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public agtfadlqog ppxfxbqfkf() {
        agtfadlqog agtfadlqogVarOjitshcjhn;
        synchronized (this.f3972iobyxmoadg) {
            agtfadlqogVarOjitshcjhn = ojitshcjhn(this.f3975wkgbmnqykc.ppxfxbqfkf());
        }
        return agtfadlqogVarOjitshcjhn;
    }

    public void wflxmlrfwp() {
        synchronized (this.f3972iobyxmoadg) {
            try {
                this.f3974ppxfxbqfkf = true;
                this.f3975wkgbmnqykc.eablkybsjg();
                if (this.f3976zoijcleaow == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int wkgbmnqykc() {
        int iWkgbmnqykc;
        synchronized (this.f3972iobyxmoadg) {
            iWkgbmnqykc = this.f3975wkgbmnqykc.wkgbmnqykc();
        }
        return iWkgbmnqykc;
    }
}

package esjtqupxsv;

import androidx.camera.core.CameraControl;
import iozdgvuglv.gtknphoqwx;
import java.util.concurrent.Executor;
import kcexrzcfyt.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f31911lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zdlpuopuiu f31912ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Executor f31913wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f31910iobyxmoadg = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f31914zoijcleaow = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final Object f31908eablkybsjg = new Object();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg f31909gxszxtbevo = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();

    public lqeggnwhkg(zdlpuopuiu zdlpuopuiuVar, Executor executor) {
        this.f31912ppxfxbqfkf = zdlpuopuiuVar;
        this.f31913wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void draadjrbmk() {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f31911lqeggnwhkg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(null);
            this.f31911lqeggnwhkg = null;
        }
    }

    private void gtknphoqwx() {
        synchronized (this.f31908eablkybsjg) {
            this.f31909gxszxtbevo = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        }
    }

    private void iwizpuwonk() {
        this.f31912ppxfxbqfkf.ikoacuggdj().iobyxmoadg(new Runnable() { // from class: esjtqupxsv.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f31904zdlpuopuiu.draadjrbmk();
            }
        }, this.f31913wkgbmnqykc);
        this.f31914zoijcleaow = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void vdvldrhtss(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f31914zoijcleaow = true;
        wflxmlrfwp(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.f31911lqeggnwhkg = iobyxmoadgVar;
        if (this.f31910iobyxmoadg) {
            iwizpuwonk();
        }
    }

    private void nufgyqmvbu(btonecajqb btonecajqbVar) {
        synchronized (this.f31908eablkybsjg) {
            this.f31909gxszxtbevo.ppxfxbqfkf(btonecajqbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object oxmwwwfdhm(final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f31913wkgbmnqykc.execute(new Runnable() { // from class: esjtqupxsv.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                this.f31918zdlpuopuiu.vdvldrhtss(iobyxmoadgVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object rgvfuqvkyq(final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f31913wkgbmnqykc.execute(new Runnable() { // from class: esjtqupxsv.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                this.f31906zdlpuopuiu.ojitshcjhn(iobyxmoadgVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    private void wflxmlrfwp(Exception exc) {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f31911lqeggnwhkg;
        if (iobyxmoadgVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            iobyxmoadgVar.gxszxtbevo(exc);
            this.f31911lqeggnwhkg = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public void kcexrzcfyt(boolean z13) {
        if (this.f31910iobyxmoadg == z13) {
            return;
        }
        this.f31910iobyxmoadg = z13;
        if (!z13) {
            wflxmlrfwp(new CameraControl.OperationCanceledException("The camera control has became inactive."));
        } else if (this.f31914zoijcleaow) {
            iwizpuwonk();
        }
    }

    public oxmwwwfdhm.iobyxmoadg agtfadlqog() {
        oxmwwwfdhm.iobyxmoadg iobyxmoadgVarZoijcleaow;
        synchronized (this.f31908eablkybsjg) {
            iobyxmoadgVarZoijcleaow = this.f31909gxszxtbevo.zoijcleaow();
        }
        return iobyxmoadgVarZoijcleaow;
    }

    public com.google.common.util.concurrent.wkgbmnqykc btonecajqb() {
        gtknphoqwx();
        return gtknphoqwx.zdlpuopuiu(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: esjtqupxsv.ppxfxbqfkf
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f31916iobyxmoadg.oxmwwwfdhm(iobyxmoadgVar);
            }
        }));
    }

    public void dxjokdxxww(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        synchronized (this.f31908eablkybsjg) {
            c1637iobyxmoadg.eablkybsjg(this.f31909gxszxtbevo.iobyxmoadg(), androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.ALWAYS_OVERRIDE);
        }
    }

    public com.google.common.util.concurrent.wkgbmnqykc lqeggnwhkg(btonecajqb btonecajqbVar) {
        nufgyqmvbu(btonecajqbVar);
        return gtknphoqwx.zdlpuopuiu(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: esjtqupxsv.iobyxmoadg
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f31907iobyxmoadg.rgvfuqvkyq(iobyxmoadgVar);
            }
        }));
    }

    public void zdlpuopuiu(final boolean z13) {
        this.f31913wkgbmnqykc.execute(new Runnable() { // from class: esjtqupxsv.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                this.f31920zdlpuopuiu.kcexrzcfyt(z13);
            }
        });
    }
}

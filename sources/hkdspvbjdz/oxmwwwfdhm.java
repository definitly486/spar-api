package hkdspvbjdz;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import istkbnxepw.iwizpuwonk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jpowsppfya.jpowsppfya;
import jpowsppfya.stevsuqkhv;
import jpowsppfya.wwaezpbzkn;
import lereixgezr.sopmlzcsov;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public class oxmwwwfdhm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private zoijcleaow f40689eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final jpowsppfya f40690iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final iwizpuwonk f40691ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ppxfxbqfkf f40692wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final iwizpuwonk f40693zoijcleaow;

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ wwaezpbzkn f40694iobyxmoadg;

        iobyxmoadg(wwaezpbzkn wwaezpbzknVar) {
            this.f40694iobyxmoadg = wwaezpbzknVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ydmasvzmpa ydmasvzmpaVar) {
            u1.nufgyqmvbu.gxszxtbevo(ydmasvzmpaVar);
            try {
                oxmwwwfdhm.this.f40690iobyxmoadg.zoijcleaow(ydmasvzmpaVar);
            } catch (ProcessingException e13) {
                sopmlzcsov.wkgbmnqykc("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e13);
            }
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            if (this.f40694iobyxmoadg.kcexrzcfyt() == 2 && (th2 instanceof CancellationException)) {
                sopmlzcsov.iobyxmoadg("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            sopmlzcsov.wflxmlrfwp("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + stevsuqkhv.iobyxmoadg(this.f40694iobyxmoadg.kcexrzcfyt()), th2);
        }
    }

    public static class ppxfxbqfkf extends HashMap {
    }

    public static abstract class zoijcleaow {
        public static zoijcleaow wkgbmnqykc(wwaezpbzkn wwaezpbzknVar, wwaezpbzkn wwaezpbzknVar2, List list) {
            return new hkdspvbjdz.zoijcleaow(wwaezpbzknVar, wwaezpbzknVar2, list);
        }

        public abstract List iobyxmoadg();

        public abstract wwaezpbzkn ppxfxbqfkf();

        public abstract wwaezpbzkn zoijcleaow();
    }

    public oxmwwwfdhm(iwizpuwonk iwizpuwonkVar, iwizpuwonk iwizpuwonkVar2, jpowsppfya jpowsppfyaVar) {
        this.f40693zoijcleaow = iwizpuwonkVar;
        this.f40691ppxfxbqfkf = iwizpuwonkVar2;
        this.f40690iobyxmoadg = jpowsppfyaVar;
    }

    private wwaezpbzkn btonecajqb(wwaezpbzkn wwaezpbzknVar, cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        Rect rectIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
        int iPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
        boolean zLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
        Matrix matrix = new Matrix();
        u1.nufgyqmvbu.iobyxmoadg(cdpycssgdh.vdvldrhtss.btonecajqb(cdpycssgdh.vdvldrhtss.gxszxtbevo(rectIobyxmoadg, iPpxfxbqfkf), gxszxtbevoVar.wkgbmnqykc()));
        Rect rectRgvfuqvkyq = cdpycssgdh.vdvldrhtss.rgvfuqvkyq(gxszxtbevoVar.wkgbmnqykc());
        return new wwaezpbzkn(gxszxtbevoVar.eablkybsjg(), gxszxtbevoVar.zoijcleaow(), wwaezpbzknVar.oxmwwwfdhm().lqeggnwhkg().eablkybsjg(gxszxtbevoVar.wkgbmnqykc()).iobyxmoadg(), matrix, false, rectRgvfuqvkyq, wwaezpbzknVar.rgvfuqvkyq() - iPpxfxbqfkf, -1, wwaezpbzknVar.jyumaefscl() != zLqeggnwhkg);
    }

    private void lqeggnwhkg(final iwizpuwonk iwizpuwonkVar, final iwizpuwonk iwizpuwonkVar2, final wwaezpbzkn wwaezpbzknVar, final wwaezpbzkn wwaezpbzknVar2, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            eablkybsjg(iwizpuwonkVar, iwizpuwonkVar2, wwaezpbzknVar, wwaezpbzknVar2, entry);
            ((wwaezpbzkn) entry.getValue()).eablkybsjg(new Runnable() { // from class: hkdspvbjdz.vdvldrhtss
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40706zdlpuopuiu.eablkybsjg(iwizpuwonkVar, iwizpuwonkVar2, wwaezpbzknVar, wwaezpbzknVar2, entry);
                }
            });
        }
    }

    private void nufgyqmvbu(iwizpuwonk iwizpuwonkVar, wwaezpbzkn wwaezpbzknVar, Map map, boolean z13) {
        try {
            this.f40690iobyxmoadg.iobyxmoadg(wwaezpbzknVar.draadjrbmk(iwizpuwonkVar, z13));
        } catch (ProcessingException e13) {
            sopmlzcsov.wkgbmnqykc("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(iwizpuwonk iwizpuwonkVar, iwizpuwonk iwizpuwonkVar2, wwaezpbzkn wwaezpbzknVar, wwaezpbzkn wwaezpbzknVar2, Map.Entry entry) {
        wwaezpbzkn wwaezpbzknVar3 = (wwaezpbzkn) entry.getValue();
        Size sizeEablkybsjg = wwaezpbzknVar.oxmwwwfdhm().eablkybsjg();
        Rect rectIobyxmoadg = ((wkgbmnqykc) entry.getKey()).iobyxmoadg().iobyxmoadg();
        if (!wwaezpbzknVar.zdlpuopuiu()) {
            iwizpuwonkVar = null;
        }
        ydmasvzmpa.iobyxmoadg iobyxmoadgVarGxszxtbevo = ydmasvzmpa.iobyxmoadg.gxszxtbevo(sizeEablkybsjg, rectIobyxmoadg, iwizpuwonkVar, ((wkgbmnqykc) entry.getKey()).iobyxmoadg().ppxfxbqfkf(), ((wkgbmnqykc) entry.getKey()).iobyxmoadg().lqeggnwhkg());
        Size sizeEablkybsjg2 = wwaezpbzknVar2.oxmwwwfdhm().eablkybsjg();
        Rect rectIobyxmoadg2 = ((wkgbmnqykc) entry.getKey()).zoijcleaow().iobyxmoadg();
        if (!wwaezpbzknVar2.zdlpuopuiu()) {
            iwizpuwonkVar2 = null;
        }
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wwaezpbzknVar3.btonecajqb(((wkgbmnqykc) entry.getKey()).iobyxmoadg().zoijcleaow(), iobyxmoadgVarGxszxtbevo, ydmasvzmpa.iobyxmoadg.gxszxtbevo(sizeEablkybsjg2, rectIobyxmoadg2, iwizpuwonkVar2, ((wkgbmnqykc) entry.getKey()).zoijcleaow().ppxfxbqfkf(), ((wkgbmnqykc) entry.getKey()).zoijcleaow().lqeggnwhkg())), new iobyxmoadg(wwaezpbzknVar3), yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f40692wkgbmnqykc;
        if (ppxfxbqfkfVar != null) {
            Iterator it = ppxfxbqfkfVar.values().iterator();
            while (it.hasNext()) {
                ((wwaezpbzkn) it.next()).dxjokdxxww();
            }
        }
    }

    public ppxfxbqfkf dxjokdxxww(zoijcleaow zoijcleaowVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f40689eablkybsjg = zoijcleaowVar;
        this.f40692wkgbmnqykc = new ppxfxbqfkf();
        wwaezpbzkn wwaezpbzknVarZoijcleaow = this.f40689eablkybsjg.zoijcleaow();
        wwaezpbzkn wwaezpbzknVarPpxfxbqfkf = this.f40689eablkybsjg.ppxfxbqfkf();
        for (wkgbmnqykc wkgbmnqykcVar : this.f40689eablkybsjg.iobyxmoadg()) {
            this.f40692wkgbmnqykc.put(wkgbmnqykcVar, btonecajqb(wwaezpbzknVarZoijcleaow, wkgbmnqykcVar.iobyxmoadg()));
        }
        nufgyqmvbu(this.f40693zoijcleaow, wwaezpbzknVarZoijcleaow, this.f40692wkgbmnqykc, true);
        nufgyqmvbu(this.f40691ppxfxbqfkf, wwaezpbzknVarPpxfxbqfkf, this.f40692wkgbmnqykc, false);
        lqeggnwhkg(this.f40693zoijcleaow, this.f40691ppxfxbqfkf, wwaezpbzknVarZoijcleaow, wwaezpbzknVarPpxfxbqfkf, this.f40692wkgbmnqykc);
        return this.f40692wkgbmnqykc;
    }

    public void gxszxtbevo() {
        this.f40690iobyxmoadg.release();
        cdpycssgdh.rgvfuqvkyq.wkgbmnqykc(new Runnable() { // from class: hkdspvbjdz.rgvfuqvkyq
            @Override // java.lang.Runnable
            public final void run() {
                this.f40700zdlpuopuiu.wkgbmnqykc();
            }
        });
    }
}

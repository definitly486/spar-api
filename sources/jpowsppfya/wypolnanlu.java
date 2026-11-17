package jpowsppfya;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.ProcessingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final jpowsppfya f52041iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ppxfxbqfkf f52042ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private zoijcleaow f52043wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final istkbnxepw.iwizpuwonk f52044zoijcleaow;

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ wwaezpbzkn f52045iobyxmoadg;

        iobyxmoadg(wwaezpbzkn wwaezpbzknVar) {
            this.f52045iobyxmoadg = wwaezpbzknVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ydmasvzmpa ydmasvzmpaVar) {
            u1.nufgyqmvbu.gxszxtbevo(ydmasvzmpaVar);
            try {
                wypolnanlu.this.f52041iobyxmoadg.zoijcleaow(ydmasvzmpaVar);
            } catch (ProcessingException e13) {
                sopmlzcsov.wkgbmnqykc("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e13);
            }
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            if (this.f52045iobyxmoadg.kcexrzcfyt() == 2 && (th2 instanceof CancellationException)) {
                sopmlzcsov.iobyxmoadg("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            sopmlzcsov.wflxmlrfwp("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + stevsuqkhv.iobyxmoadg(this.f52045iobyxmoadg.kcexrzcfyt()), th2);
        }
    }

    public static class ppxfxbqfkf extends HashMap {
    }

    public static abstract class zoijcleaow {
        public static zoijcleaow ppxfxbqfkf(wwaezpbzkn wwaezpbzknVar, List list) {
            return new jpowsppfya.zoijcleaow(wwaezpbzknVar, list);
        }

        public abstract List iobyxmoadg();

        public abstract wwaezpbzkn zoijcleaow();
    }

    public wypolnanlu(istkbnxepw.iwizpuwonk iwizpuwonkVar, jpowsppfya jpowsppfyaVar) {
        this.f52044zoijcleaow = iwizpuwonkVar;
        this.f52041iobyxmoadg = jpowsppfyaVar;
    }

    private void btonecajqb(wwaezpbzkn wwaezpbzknVar) {
        try {
            this.f52041iobyxmoadg.iobyxmoadg(wwaezpbzknVar.gtknphoqwx(this.f52044zoijcleaow));
        } catch (ProcessingException e13) {
            sopmlzcsov.wkgbmnqykc("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e13);
        }
    }

    private void dxjokdxxww(final wwaezpbzkn wwaezpbzknVar, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            gxszxtbevo(wwaezpbzknVar, entry);
            ((wwaezpbzkn) entry.getValue()).eablkybsjg(new Runnable() { // from class: jpowsppfya.hkdspvbjdz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51979zdlpuopuiu.gxszxtbevo(wwaezpbzknVar, entry);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f52042ppxfxbqfkf;
        if (ppxfxbqfkfVar != null) {
            Iterator it = ppxfxbqfkfVar.values().iterator();
            while (it.hasNext()) {
                ((wwaezpbzkn) it.next()).dxjokdxxww();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lqeggnwhkg(Map map, tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iZoijcleaow = nufgyqmvbuVar.zoijcleaow() - ((cllcsxoeiz.gxszxtbevo) entry.getKey()).ppxfxbqfkf();
            if (((cllcsxoeiz.gxszxtbevo) entry.getKey()).lqeggnwhkg()) {
                iZoijcleaow = -iZoijcleaow;
            }
            ((wwaezpbzkn) entry.getValue()).istkbnxepw(cdpycssgdh.vdvldrhtss.yggfygwlhe(iZoijcleaow), -1);
        }
    }

    private wwaezpbzkn wflxmlrfwp(wwaezpbzkn wwaezpbzknVar, cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        Rect rectRgvfuqvkyq;
        Rect rectIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
        int iPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
        boolean zLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg();
        Matrix matrix = new Matrix(wwaezpbzknVar.vdvldrhtss());
        Matrix matrixEablkybsjg = cdpycssgdh.vdvldrhtss.eablkybsjg(new RectF(rectIobyxmoadg), cdpycssgdh.vdvldrhtss.oxmwwwfdhm(gxszxtbevoVar.wkgbmnqykc()), iPpxfxbqfkf, zLqeggnwhkg);
        matrix.postConcat(matrixEablkybsjg);
        u1.nufgyqmvbu.iobyxmoadg(cdpycssgdh.vdvldrhtss.btonecajqb(cdpycssgdh.vdvldrhtss.gxszxtbevo(rectIobyxmoadg, iPpxfxbqfkf), gxszxtbevoVar.wkgbmnqykc()));
        if (gxszxtbevoVar.btonecajqb()) {
            u1.nufgyqmvbu.zoijcleaow(gxszxtbevoVar.iobyxmoadg().contains(wwaezpbzknVar.agtfadlqog()), String.format("Output crop rect %s must contain input crop rect %s", gxszxtbevoVar.iobyxmoadg(), wwaezpbzknVar.agtfadlqog()));
            rectRgvfuqvkyq = new Rect();
            RectF rectF = new RectF(wwaezpbzknVar.agtfadlqog());
            matrixEablkybsjg.mapRect(rectF);
            rectF.round(rectRgvfuqvkyq);
        } else {
            rectRgvfuqvkyq = cdpycssgdh.vdvldrhtss.rgvfuqvkyq(gxszxtbevoVar.wkgbmnqykc());
        }
        Rect rect = rectRgvfuqvkyq;
        return new wwaezpbzkn(gxszxtbevoVar.eablkybsjg(), gxszxtbevoVar.zoijcleaow(), wwaezpbzknVar.oxmwwwfdhm().lqeggnwhkg().eablkybsjg(gxszxtbevoVar.wkgbmnqykc()).iobyxmoadg(), matrix, false, rect, wwaezpbzknVar.rgvfuqvkyq() - iPpxfxbqfkf, -1, wwaezpbzknVar.jyumaefscl() != zLqeggnwhkg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public void gxszxtbevo(wwaezpbzkn wwaezpbzknVar, Map.Entry entry) {
        wwaezpbzkn wwaezpbzknVar2 = (wwaezpbzkn) entry.getValue();
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wwaezpbzknVar2.btonecajqb(((cllcsxoeiz.gxszxtbevo) entry.getKey()).zoijcleaow(), ydmasvzmpa.iobyxmoadg.gxszxtbevo(wwaezpbzknVar.oxmwwwfdhm().eablkybsjg(), ((cllcsxoeiz.gxszxtbevo) entry.getKey()).iobyxmoadg(), wwaezpbzknVar.zdlpuopuiu() ? this.f52044zoijcleaow : null, ((cllcsxoeiz.gxszxtbevo) entry.getKey()).ppxfxbqfkf(), ((cllcsxoeiz.gxszxtbevo) entry.getKey()).lqeggnwhkg()), null), new iobyxmoadg(wwaezpbzknVar2), yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
    }

    public ppxfxbqfkf draadjrbmk(zoijcleaow zoijcleaowVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f52043wkgbmnqykc = zoijcleaowVar;
        this.f52042ppxfxbqfkf = new ppxfxbqfkf();
        wwaezpbzkn wwaezpbzknVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        for (cllcsxoeiz.gxszxtbevo gxszxtbevoVar : zoijcleaowVar.iobyxmoadg()) {
            this.f52042ppxfxbqfkf.put(gxszxtbevoVar, wflxmlrfwp(wwaezpbzknVarZoijcleaow, gxszxtbevoVar));
        }
        btonecajqb(wwaezpbzknVarZoijcleaow);
        dxjokdxxww(wwaezpbzknVarZoijcleaow, this.f52042ppxfxbqfkf);
        gtknphoqwx(wwaezpbzknVarZoijcleaow, this.f52042ppxfxbqfkf);
        return this.f52042ppxfxbqfkf;
    }

    void gtknphoqwx(wwaezpbzkn wwaezpbzknVar, final Map map) {
        wwaezpbzknVar.gxszxtbevo(new u1.iobyxmoadg() { // from class: jpowsppfya.cllcsxoeiz
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                wypolnanlu.lqeggnwhkg(map, (tbqsvytpvh.nufgyqmvbu) obj);
            }
        });
    }

    public void nufgyqmvbu() {
        this.f52041iobyxmoadg.release();
        cdpycssgdh.rgvfuqvkyq.wkgbmnqykc(new Runnable() { // from class: jpowsppfya.dsvhmnatus
            @Override // java.lang.Runnable
            public final void run() {
                this.f51949zdlpuopuiu.eablkybsjg();
            }
        });
    }
}

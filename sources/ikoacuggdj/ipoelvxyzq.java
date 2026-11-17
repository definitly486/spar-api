package ikoacuggdj;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
final class ipoelvxyzq extends z.wflxmlrfwp implements z.zdlpuopuiu {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final ppxfxbqfkf f44817hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private RenderNode f44818hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final cdpycssgdh f44819jpowsppfya;

    public ipoelvxyzq(z.btonecajqb btonecajqbVar, ppxfxbqfkf ppxfxbqfkfVar, cdpycssgdh cdpycssgdhVar) {
        this.f44817hcddaimhww = ppxfxbqfkfVar;
        this.f44819jpowsppfya = cdpycssgdhVar;
        H0(btonecajqbVar);
    }

    private final boolean N0(EdgeEffect edgeEffect, Canvas canvas) {
        return R0(180.0f, edgeEffect, canvas);
    }

    private final boolean O0(EdgeEffect edgeEffect, Canvas canvas) {
        return R0(270.0f, edgeEffect, canvas);
    }

    private final boolean P0(EdgeEffect edgeEffect, Canvas canvas) {
        return R0(90.0f, edgeEffect, canvas);
    }

    private final boolean Q0(EdgeEffect edgeEffect, Canvas canvas) {
        return R0(0.0f, edgeEffect, canvas);
    }

    private final boolean R0(float f13, EdgeEffect edgeEffect, Canvas canvas) {
        if (f13 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f13);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode S0() {
        RenderNode renderNode = this.f44818hkdspvbjdz;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeIobyxmoadg = wizcaqwiak.iobyxmoadg("AndroidEdgeEffectOverscrollEffect");
        this.f44818hkdspvbjdz = renderNodeIobyxmoadg;
        return renderNodeIobyxmoadg;
    }

    private final boolean T0() {
        cdpycssgdh cdpycssgdhVar = this.f44819jpowsppfya;
        return cdpycssgdhVar.kcexrzcfyt() || cdpycssgdhVar.zdlpuopuiu() || cdpycssgdhVar.jyumaefscl() || cdpycssgdhVar.iwizpuwonk();
    }

    private final boolean U0() {
        cdpycssgdh cdpycssgdhVar = this.f44819jpowsppfya;
        return cdpycssgdhVar.lereixgezr() || cdpycssgdhVar.pmvmpeiblj() || cdpycssgdhVar.rgvfuqvkyq() || cdpycssgdhVar.vdvldrhtss();
    }

    @Override // z.zdlpuopuiu
    public void gtknphoqwx(j.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean zO0;
        this.f44817hcddaimhww.vdvldrhtss(ppxfxbqfkfVar.zoijcleaow());
        Canvas canvasWkgbmnqykc = h.yadqdtsiqt.wkgbmnqykc(ppxfxbqfkfVar.K().gxszxtbevo());
        this.f44817hcddaimhww.gxszxtbevo().getValue();
        if (g.gtknphoqwx.wflxmlrfwp(ppxfxbqfkfVar.zoijcleaow())) {
            ppxfxbqfkfVar.b0();
            return;
        }
        if (!canvasWkgbmnqykc.isHardwareAccelerated()) {
            this.f44819jpowsppfya.gxszxtbevo();
            ppxfxbqfkfVar.b0();
            return;
        }
        float fI = ppxfxbqfkfVar.I(cqumvgiudr.zoijcleaow());
        cdpycssgdh cdpycssgdhVar = this.f44819jpowsppfya;
        boolean zU0 = U0();
        boolean zT0 = T0();
        if (zU0 && zT0) {
            S0().setPosition(0, 0, canvasWkgbmnqykc.getWidth(), canvasWkgbmnqykc.getHeight());
        } else if (zU0) {
            S0().setPosition(0, 0, canvasWkgbmnqykc.getWidth() + (vg.iobyxmoadg.wkgbmnqykc(fI) * 2), canvasWkgbmnqykc.getHeight());
        } else {
            if (!zT0) {
                ppxfxbqfkfVar.b0();
                return;
            }
            S0().setPosition(0, 0, canvasWkgbmnqykc.getWidth(), canvasWkgbmnqykc.getHeight() + (vg.iobyxmoadg.wkgbmnqykc(fI) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = S0().beginRecording();
        if (cdpycssgdhVar.zdlpuopuiu()) {
            EdgeEffect edgeEffectBtonecajqb = cdpycssgdhVar.btonecajqb();
            P0(edgeEffectBtonecajqb, recordingCanvasBeginRecording);
            edgeEffectBtonecajqb.finish();
        }
        if (cdpycssgdhVar.kcexrzcfyt()) {
            EdgeEffect edgeEffectDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
            zO0 = O0(edgeEffectDxjokdxxww, recordingCanvasBeginRecording);
            if (cdpycssgdhVar.yggfygwlhe()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f44817hcddaimhww.eablkybsjg() & 4294967295L));
                zynmafqrjb zynmafqrjbVar = zynmafqrjb.f44967iobyxmoadg;
                zynmafqrjbVar.eablkybsjg(cdpycssgdhVar.btonecajqb(), zynmafqrjbVar.ppxfxbqfkf(edgeEffectDxjokdxxww), 1 - fIntBitsToFloat);
            }
        } else {
            zO0 = false;
        }
        if (cdpycssgdhVar.pmvmpeiblj()) {
            EdgeEffect edgeEffectAgtfadlqog = cdpycssgdhVar.agtfadlqog();
            N0(edgeEffectAgtfadlqog, recordingCanvasBeginRecording);
            edgeEffectAgtfadlqog.finish();
        }
        if (cdpycssgdhVar.lereixgezr()) {
            EdgeEffect edgeEffectWflxmlrfwp = cdpycssgdhVar.wflxmlrfwp();
            zO0 = Q0(edgeEffectWflxmlrfwp, recordingCanvasBeginRecording) || zO0;
            if (cdpycssgdhVar.zynmafqrjb()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f44817hcddaimhww.eablkybsjg() >> 32));
                zynmafqrjb zynmafqrjbVar2 = zynmafqrjb.f44967iobyxmoadg;
                zynmafqrjbVar2.eablkybsjg(cdpycssgdhVar.agtfadlqog(), zynmafqrjbVar2.ppxfxbqfkf(edgeEffectWflxmlrfwp), fIntBitsToFloat2);
            }
        }
        if (cdpycssgdhVar.iwizpuwonk()) {
            EdgeEffect edgeEffectDraadjrbmk = cdpycssgdhVar.draadjrbmk();
            O0(edgeEffectDraadjrbmk, recordingCanvasBeginRecording);
            edgeEffectDraadjrbmk.finish();
        }
        if (cdpycssgdhVar.jyumaefscl()) {
            EdgeEffect edgeEffectGtknphoqwx = cdpycssgdhVar.gtknphoqwx();
            zO0 = P0(edgeEffectGtknphoqwx, recordingCanvasBeginRecording) || zO0;
            if (cdpycssgdhVar.cqumvgiudr()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f44817hcddaimhww.eablkybsjg() & 4294967295L));
                zynmafqrjb zynmafqrjbVar3 = zynmafqrjb.f44967iobyxmoadg;
                zynmafqrjbVar3.eablkybsjg(cdpycssgdhVar.draadjrbmk(), zynmafqrjbVar3.ppxfxbqfkf(edgeEffectGtknphoqwx), fIntBitsToFloat3);
            }
        }
        if (cdpycssgdhVar.vdvldrhtss()) {
            EdgeEffect edgeEffectNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu();
            Q0(edgeEffectNufgyqmvbu, recordingCanvasBeginRecording);
            edgeEffectNufgyqmvbu.finish();
        }
        if (cdpycssgdhVar.rgvfuqvkyq()) {
            EdgeEffect edgeEffectLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
            boolean z13 = N0(edgeEffectLqeggnwhkg, recordingCanvasBeginRecording) || zO0;
            if (cdpycssgdhVar.oxmwwwfdhm()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f44817hcddaimhww.eablkybsjg() >> 32));
                zynmafqrjb zynmafqrjbVar4 = zynmafqrjb.f44967iobyxmoadg;
                zynmafqrjbVar4.eablkybsjg(cdpycssgdhVar.nufgyqmvbu(), zynmafqrjbVar4.ppxfxbqfkf(edgeEffectLqeggnwhkg), 1 - fIntBitsToFloat4);
            }
            zO0 = z13;
        }
        if (zO0) {
            this.f44817hcddaimhww.lqeggnwhkg();
        }
        float f13 = zT0 ? 0.0f : fI;
        if (zU0) {
            fI = 0.0f;
        }
        w0.zdlpuopuiu layoutDirection = ppxfxbqfkfVar.getLayoutDirection();
        h.metgxyhuhe metgxyhuheVarZoijcleaow = h.yadqdtsiqt.zoijcleaow(recordingCanvasBeginRecording);
        long jZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        w0.wkgbmnqykc density = ppxfxbqfkfVar.K().getDensity();
        w0.zdlpuopuiu layoutDirection2 = ppxfxbqfkfVar.K().getLayoutDirection();
        h.metgxyhuhe metgxyhuheVarGxszxtbevo = ppxfxbqfkfVar.K().gxszxtbevo();
        long jZoijcleaow2 = ppxfxbqfkfVar.K().zoijcleaow();
        k.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVar.K().dxjokdxxww();
        j.wkgbmnqykc wkgbmnqykcVarK = ppxfxbqfkfVar.K();
        wkgbmnqykcVarK.ppxfxbqfkf(ppxfxbqfkfVar);
        wkgbmnqykcVarK.iobyxmoadg(layoutDirection);
        wkgbmnqykcVarK.lqeggnwhkg(metgxyhuheVarZoijcleaow);
        wkgbmnqykcVarK.nufgyqmvbu(jZoijcleaow);
        wkgbmnqykcVarK.eablkybsjg(null);
        metgxyhuheVarZoijcleaow.jyumaefscl();
        try {
            ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(f13, fI);
            try {
                ppxfxbqfkfVar.b0();
                float f14 = -f13;
                float f15 = -fI;
                ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(f14, f15);
                metgxyhuheVarZoijcleaow.agtfadlqog();
                j.wkgbmnqykc wkgbmnqykcVarK2 = ppxfxbqfkfVar.K();
                wkgbmnqykcVarK2.ppxfxbqfkf(density);
                wkgbmnqykcVarK2.iobyxmoadg(layoutDirection2);
                wkgbmnqykcVarK2.lqeggnwhkg(metgxyhuheVarGxszxtbevo);
                wkgbmnqykcVarK2.nufgyqmvbu(jZoijcleaow2);
                wkgbmnqykcVarK2.eablkybsjg(ppxfxbqfkfVarDxjokdxxww);
                S0().endRecording();
                int iSave = canvasWkgbmnqykc.save();
                canvasWkgbmnqykc.translate(f14, f15);
                canvasWkgbmnqykc.drawRenderNode(S0());
                canvasWkgbmnqykc.restoreToCount(iSave);
            } catch (Throwable th2) {
                ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(-f13, -fI);
                throw th2;
            }
        } catch (Throwable th3) {
            metgxyhuheVarZoijcleaow.agtfadlqog();
            j.wkgbmnqykc wkgbmnqykcVarK3 = ppxfxbqfkfVar.K();
            wkgbmnqykcVarK3.ppxfxbqfkf(density);
            wkgbmnqykcVarK3.iobyxmoadg(layoutDirection2);
            wkgbmnqykcVarK3.lqeggnwhkg(metgxyhuheVarGxszxtbevo);
            wkgbmnqykcVarK3.nufgyqmvbu(jZoijcleaow2);
            wkgbmnqykcVarK3.eablkybsjg(ppxfxbqfkfVarDxjokdxxww);
            throw th3;
        }
    }
}

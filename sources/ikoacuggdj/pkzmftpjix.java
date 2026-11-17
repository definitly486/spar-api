package ikoacuggdj;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
final class pkzmftpjix extends z.wflxmlrfwp implements z.zdlpuopuiu {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final ppxfxbqfkf f44876hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final czzsidtyhn.ydmasvzmpa f44877hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final cdpycssgdh f44878jpowsppfya;

    public pkzmftpjix(z.btonecajqb btonecajqbVar, ppxfxbqfkf ppxfxbqfkfVar, cdpycssgdh cdpycssgdhVar, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar) {
        this.f44876hcddaimhww = ppxfxbqfkfVar;
        this.f44878jpowsppfya = cdpycssgdhVar;
        this.f44877hkdspvbjdz = ydmasvzmpaVar;
        H0(btonecajqbVar);
    }

    private final boolean N0(j.gxszxtbevo gxszxtbevoVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fI = gxszxtbevoVar.I(this.f44877hkdspvbjdz.iobyxmoadg());
        float f13 = -Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() >> 32));
        float f14 = (-Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() & 4294967295L))) + fI;
        return R0(180.0f, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean O0(j.gxszxtbevo gxszxtbevoVar, EdgeEffect edgeEffect, Canvas canvas) {
        float f13 = -Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() & 4294967295L));
        float fI = gxszxtbevoVar.I(this.f44877hkdspvbjdz.ppxfxbqfkf(gxszxtbevoVar.getLayoutDirection()));
        return R0(270.0f, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fI)))), edgeEffect, canvas);
    }

    private final boolean P0(j.gxszxtbevo gxszxtbevoVar, EdgeEffect edgeEffect, Canvas canvas) {
        return R0(90.0f, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits((-vg.iobyxmoadg.wkgbmnqykc(Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() >> 32)))) + gxszxtbevoVar.I(this.f44877hkdspvbjdz.zoijcleaow(gxszxtbevoVar.getLayoutDirection())))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean Q0(j.gxszxtbevo gxszxtbevoVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fI = gxszxtbevoVar.I(this.f44877hkdspvbjdz.wkgbmnqykc());
        return R0(0.0f, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fI)) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean R0(float f13, long j13, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f13);
        canvas.translate(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // z.zdlpuopuiu
    public void gtknphoqwx(j.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f44876hcddaimhww.vdvldrhtss(ppxfxbqfkfVar.zoijcleaow());
        if (g.gtknphoqwx.wflxmlrfwp(ppxfxbqfkfVar.zoijcleaow())) {
            ppxfxbqfkfVar.b0();
            return;
        }
        ppxfxbqfkfVar.b0();
        this.f44876hcddaimhww.gxszxtbevo().getValue();
        Canvas canvasWkgbmnqykc = h.yadqdtsiqt.wkgbmnqykc(ppxfxbqfkfVar.K().gxszxtbevo());
        cdpycssgdh cdpycssgdhVar = this.f44878jpowsppfya;
        boolean zO0 = cdpycssgdhVar.kcexrzcfyt() ? O0(ppxfxbqfkfVar, cdpycssgdhVar.dxjokdxxww(), canvasWkgbmnqykc) : false;
        if (cdpycssgdhVar.lereixgezr()) {
            zO0 = Q0(ppxfxbqfkfVar, cdpycssgdhVar.wflxmlrfwp(), canvasWkgbmnqykc) || zO0;
        }
        if (cdpycssgdhVar.jyumaefscl()) {
            zO0 = P0(ppxfxbqfkfVar, cdpycssgdhVar.gtknphoqwx(), canvasWkgbmnqykc) || zO0;
        }
        if (cdpycssgdhVar.rgvfuqvkyq()) {
            zO0 = N0(ppxfxbqfkfVar, cdpycssgdhVar.lqeggnwhkg(), canvasWkgbmnqykc) || zO0;
        }
        if (zO0) {
            this.f44876hcddaimhww.lqeggnwhkg();
        }
    }
}

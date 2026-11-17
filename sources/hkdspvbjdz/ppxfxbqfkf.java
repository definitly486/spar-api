package hkdspvbjdz;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;
import jpowsppfya.zdlpuopuiu;
import lereixgezr.iwizpuwonk;
import lereixgezr.sopmlzcsov;
import lereixgezr.ulzqkzuiru;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends zdlpuopuiu {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f40696agtfadlqog = -1;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f40697ojitshcjhn = -1;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final ulzqkzuiru f40698rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final ulzqkzuiru f40699vdvldrhtss;

    public ppxfxbqfkf(ulzqkzuiru ulzqkzuiruVar, ulzqkzuiru ulzqkzuiruVar2) {
        this.f40698rgvfuqvkyq = ulzqkzuiruVar;
        this.f40699vdvldrhtss = ulzqkzuiruVar2;
    }

    private void iwizpuwonk(cllcsxoeiz.lqeggnwhkg lqeggnwhkgVar, ydmasvzmpa ydmasvzmpaVar, SurfaceTexture surfaceTexture, ulzqkzuiru ulzqkzuiruVar, int i13, boolean z13) {
        kcexrzcfyt(i13);
        GLES20.glViewport(0, 0, lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.zoijcleaow());
        GLES20.glScissor(0, 0, lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.zoijcleaow());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        ydmasvzmpaVar.ylkuphrtab(fArr2, fArr, z13);
        cllcsxoeiz.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = (cllcsxoeiz.wkgbmnqykc.gxszxtbevo) u1.nufgyqmvbu.gxszxtbevo(this.f52053gtknphoqwx);
        if (gxszxtbevoVar instanceof cllcsxoeiz.wkgbmnqykc.lqeggnwhkg) {
            ((cllcsxoeiz.wkgbmnqykc.lqeggnwhkg) gxszxtbevoVar).nufgyqmvbu(fArr2);
        }
        gxszxtbevoVar.eablkybsjg(yggfygwlhe(new Size((int) (lqeggnwhkgVar.ppxfxbqfkf() * ulzqkzuiruVar.eablkybsjg()), (int) (lqeggnwhkgVar.zoijcleaow() * ulzqkzuiruVar.zoijcleaow())), new Size(lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.zoijcleaow()), ulzqkzuiruVar));
        gxszxtbevoVar.wkgbmnqykc(ulzqkzuiruVar.iobyxmoadg());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glDrawArrays");
        GLES20.glDisable(3042);
    }

    private static float[] yggfygwlhe(Size size, Size size2, ulzqkzuiru ulzqkzuiruVar) {
        float[] fArrDraadjrbmk = cllcsxoeiz.wkgbmnqykc.draadjrbmk();
        float[] fArrDraadjrbmk2 = cllcsxoeiz.wkgbmnqykc.draadjrbmk();
        float[] fArrDraadjrbmk3 = cllcsxoeiz.wkgbmnqykc.draadjrbmk();
        Matrix.scaleM(fArrDraadjrbmk, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArrDraadjrbmk2, 0, ulzqkzuiruVar.ppxfxbqfkf() / ulzqkzuiruVar.eablkybsjg(), ulzqkzuiruVar.wkgbmnqykc() / ulzqkzuiruVar.zoijcleaow(), 0.0f);
        Matrix.multiplyMM(fArrDraadjrbmk3, 0, fArrDraadjrbmk, 0, fArrDraadjrbmk2, 0);
        return fArrDraadjrbmk3;
    }

    @Override // jpowsppfya.zdlpuopuiu
    public void gtknphoqwx() {
        super.gtknphoqwx();
        this.f40696agtfadlqog = -1;
        this.f40697ojitshcjhn = -1;
    }

    public void jyumaefscl(long j13, Surface surface, ydmasvzmpa ydmasvzmpaVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        cllcsxoeiz.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(surface);
        if (lqeggnwhkgVarGxszxtbevo == cllcsxoeiz.wkgbmnqykc.f20030draadjrbmk) {
            lqeggnwhkgVarGxszxtbevo = ppxfxbqfkf(surface);
            if (lqeggnwhkgVarGxszxtbevo == null) {
                return;
            } else {
                this.f52061zoijcleaow.put(surface, lqeggnwhkgVarGxszxtbevo);
            }
        }
        if (surface != this.f52051dxjokdxxww) {
            dxjokdxxww(lqeggnwhkgVarGxszxtbevo.iobyxmoadg());
            this.f52051dxjokdxxww = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        cllcsxoeiz.lqeggnwhkg lqeggnwhkgVar = lqeggnwhkgVarGxszxtbevo;
        iwizpuwonk(lqeggnwhkgVar, ydmasvzmpaVar, surfaceTexture, this.f40698rgvfuqvkyq, this.f40696agtfadlqog, true);
        iwizpuwonk(lqeggnwhkgVar, ydmasvzmpaVar, surfaceTexture2, this.f40699vdvldrhtss, this.f40697ojitshcjhn, true);
        EGLExt.eglPresentationTimeANDROID(this.f52060wkgbmnqykc, lqeggnwhkgVarGxszxtbevo.iobyxmoadg(), j13);
        if (EGL14.eglSwapBuffers(this.f52060wkgbmnqykc, lqeggnwhkgVarGxszxtbevo.iobyxmoadg())) {
            return;
        }
        sopmlzcsov.draadjrbmk("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        wflxmlrfwp(surface, false);
    }

    @Override // jpowsppfya.zdlpuopuiu
    public cllcsxoeiz.eablkybsjg nufgyqmvbu(iwizpuwonk iwizpuwonkVar, Map map) throws Throwable {
        cllcsxoeiz.eablkybsjg eablkybsjgVarNufgyqmvbu = super.nufgyqmvbu(iwizpuwonkVar, map);
        this.f40696agtfadlqog = cllcsxoeiz.wkgbmnqykc.rgvfuqvkyq();
        this.f40697ojitshcjhn = cllcsxoeiz.wkgbmnqykc.rgvfuqvkyq();
        return eablkybsjgVarNufgyqmvbu;
    }

    public int zdlpuopuiu(boolean z13) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        return z13 ? this.f40696agtfadlqog : this.f40697ojitshcjhn;
    }
}

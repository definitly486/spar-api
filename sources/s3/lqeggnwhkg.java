package s3;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f105318dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f105319eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f105320gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f105321iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f105322lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f105323nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f105324ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.media3.common.util.zoijcleaow f105325wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private iobyxmoadg f105326zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final float[] f105314btonecajqb = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final float[] f105316gtknphoqwx = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final float[] f105315draadjrbmk = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final float[] f105317wflxmlrfwp = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final float[] f105313agtfadlqog = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f105327iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final FloatBuffer f105328ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f105329wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final FloatBuffer f105330zoijcleaow;

        public iobyxmoadg(eablkybsjg.zoijcleaow zoijcleaowVar) {
            this.f105327iobyxmoadg = zoijcleaowVar.iobyxmoadg();
            this.f105330zoijcleaow = GlUtil.eablkybsjg(zoijcleaowVar.f105308ppxfxbqfkf);
            this.f105328ppxfxbqfkf = GlUtil.eablkybsjg(zoijcleaowVar.f105309wkgbmnqykc);
            int i13 = zoijcleaowVar.f105310zoijcleaow;
            if (i13 == 1) {
                this.f105329wkgbmnqykc = 5;
            } else if (i13 != 2) {
                this.f105329wkgbmnqykc = 4;
            } else {
                this.f105329wkgbmnqykc = 6;
            }
        }
    }

    lqeggnwhkg() {
    }

    public static boolean ppxfxbqfkf(eablkybsjg eablkybsjgVar) {
        eablkybsjg.iobyxmoadg iobyxmoadgVar = eablkybsjgVar.f105302iobyxmoadg;
        eablkybsjg.iobyxmoadg iobyxmoadgVar2 = eablkybsjgVar.f105305zoijcleaow;
        return iobyxmoadgVar.zoijcleaow() == 1 && iobyxmoadgVar.iobyxmoadg(0).f105307iobyxmoadg == 0 && iobyxmoadgVar2.zoijcleaow() == 1 && iobyxmoadgVar2.iobyxmoadg(0).f105307iobyxmoadg == 0;
    }

    public void iobyxmoadg(int i13, float[] fArr, boolean z13) {
        float[] fArr2;
        iobyxmoadg iobyxmoadgVar = z13 ? this.f105324ppxfxbqfkf : this.f105326zoijcleaow;
        if (iobyxmoadgVar == null) {
            return;
        }
        int i14 = this.f105321iobyxmoadg;
        if (i14 == 1) {
            fArr2 = z13 ? f105315draadjrbmk : f105316gtknphoqwx;
        } else if (i14 == 2) {
            fArr2 = z13 ? f105313agtfadlqog : f105317wflxmlrfwp;
        } else {
            fArr2 = f105314btonecajqb;
        }
        GLES20.glUniformMatrix3fv(this.f105320gxszxtbevo, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f105319eablkybsjg, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i13);
        GLES20.glUniform1i(this.f105318dxjokdxxww, 0);
        try {
            GlUtil.zoijcleaow();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e13);
        }
        GLES20.glVertexAttribPointer(this.f105322lqeggnwhkg, 3, 5126, false, 12, (Buffer) iobyxmoadgVar.f105330zoijcleaow);
        try {
            GlUtil.zoijcleaow();
        } catch (GlUtil.GlException e14) {
            Log.e("ProjectionRenderer", "Failed to load position data", e14);
        }
        GLES20.glVertexAttribPointer(this.f105323nufgyqmvbu, 2, 5126, false, 8, (Buffer) iobyxmoadgVar.f105328ppxfxbqfkf);
        try {
            GlUtil.zoijcleaow();
        } catch (GlUtil.GlException e15) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e15);
        }
        GLES20.glDrawArrays(iobyxmoadgVar.f105329wkgbmnqykc, 0, iobyxmoadgVar.f105327iobyxmoadg);
        try {
            GlUtil.zoijcleaow();
        } catch (GlUtil.GlException e16) {
            Log.e("ProjectionRenderer", "Failed to render", e16);
        }
    }

    public void wkgbmnqykc(eablkybsjg eablkybsjgVar) {
        if (ppxfxbqfkf(eablkybsjgVar)) {
            this.f105321iobyxmoadg = eablkybsjgVar.f105303ppxfxbqfkf;
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(eablkybsjgVar.f105302iobyxmoadg.iobyxmoadg(0));
            this.f105326zoijcleaow = iobyxmoadgVar;
            if (!eablkybsjgVar.f105304wkgbmnqykc) {
                iobyxmoadgVar = new iobyxmoadg(eablkybsjgVar.f105305zoijcleaow.iobyxmoadg(0));
            }
            this.f105324ppxfxbqfkf = iobyxmoadgVar;
        }
    }

    public void zoijcleaow() {
        try {
            androidx.media3.common.util.zoijcleaow zoijcleaowVar = new androidx.media3.common.util.zoijcleaow("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f105325wkgbmnqykc = zoijcleaowVar;
            this.f105319eablkybsjg = zoijcleaowVar.btonecajqb("uMvpMatrix");
            this.f105320gxszxtbevo = this.f105325wkgbmnqykc.btonecajqb("uTexMatrix");
            this.f105322lqeggnwhkg = this.f105325wkgbmnqykc.eablkybsjg("aPosition");
            this.f105323nufgyqmvbu = this.f105325wkgbmnqykc.eablkybsjg("aTexCoords");
            this.f105318dxjokdxxww = this.f105325wkgbmnqykc.btonecajqb("uTexture");
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e13);
        }
    }
}

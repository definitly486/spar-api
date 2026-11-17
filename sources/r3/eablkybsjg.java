package r3;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.app.yggfygwlhe;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends GLSurfaceView implements gxszxtbevo {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final /* synthetic */ int f81523yggfygwlhe = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iobyxmoadg f81524zdlpuopuiu;

    private static final class iobyxmoadg implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private androidx.media3.common.util.zoijcleaow f81535pmvmpeiblj;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final GLSurfaceView f81537zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private int f81538zynmafqrjb;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private static final float[] f81527istkbnxepw = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private static final float[] f81525cdpycssgdh = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private static final float[] f81529yadqdtsiqt = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private static final String[] f81526iozdgvuglv = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private static final FloatBuffer f81528lmojexxdyd = GlUtil.eablkybsjg(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int[] f81536yggfygwlhe = new int[3];

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int[] f81533jyumaefscl = new int[3];

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final int[] f81532iwizpuwonk = new int[3];

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final int[] f81530cqumvgiudr = new int[3];

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final AtomicReference f81531esjtqupxsv = new AtomicReference();

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final FloatBuffer[] f81534lereixgezr = new FloatBuffer[3];

        public iobyxmoadg(GLSurfaceView gLSurfaceView) {
            this.f81537zdlpuopuiu = gLSurfaceView;
            for (int i13 = 0; i13 < 3; i13++) {
                int[] iArr = this.f81532iwizpuwonk;
                this.f81530cqumvgiudr[i13] = -1;
                iArr[i13] = -1;
            }
        }

        private void zoijcleaow() {
            try {
                GLES20.glGenTextures(3, this.f81536yggfygwlhe, 0);
                for (int i13 = 0; i13 < 3; i13++) {
                    GLES20.glUniform1i(this.f81535pmvmpeiblj.btonecajqb(f81526iozdgvuglv[i13]), i13);
                    GLES20.glActiveTexture(33984 + i13);
                    GlUtil.iobyxmoadg(3553, this.f81536yggfygwlhe[i13], 9729);
                }
                GlUtil.zoijcleaow();
            } catch (GlUtil.GlException e13) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e13);
            }
        }

        public void iobyxmoadg(e3.lqeggnwhkg lqeggnwhkgVar) {
            yggfygwlhe.iobyxmoadg(this.f81531esjtqupxsv.getAndSet(lqeggnwhkgVar));
            this.f81537zdlpuopuiu.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            yggfygwlhe.iobyxmoadg(this.f81531esjtqupxsv.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i13, int i14) {
            GLES20.glViewport(0, 0, i13, i14);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                androidx.media3.common.util.zoijcleaow zoijcleaowVar = new androidx.media3.common.util.zoijcleaow("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f81535pmvmpeiblj = zoijcleaowVar;
                GLES20.glVertexAttribPointer(zoijcleaowVar.eablkybsjg("in_pos"), 2, 5126, false, 0, (Buffer) f81528lmojexxdyd);
                this.f81533jyumaefscl[0] = this.f81535pmvmpeiblj.eablkybsjg("in_tc_y");
                this.f81533jyumaefscl[1] = this.f81535pmvmpeiblj.eablkybsjg("in_tc_u");
                this.f81533jyumaefscl[2] = this.f81535pmvmpeiblj.eablkybsjg("in_tc_v");
                this.f81538zynmafqrjb = this.f81535pmvmpeiblj.btonecajqb("mColorConversion");
                GlUtil.zoijcleaow();
                zoijcleaow();
                GlUtil.zoijcleaow();
            } catch (GlUtil.GlException e13) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e13);
            }
        }
    }

    public eablkybsjg(Context context) {
        this(context, null);
    }

    @Deprecated
    public gxszxtbevo getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(e3.lqeggnwhkg lqeggnwhkgVar) {
        this.f81524zdlpuopuiu.iobyxmoadg(lqeggnwhkgVar);
    }

    public eablkybsjg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this);
        this.f81524zdlpuopuiu = iobyxmoadgVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(iobyxmoadgVar);
        setRenderMode(0);
    }
}

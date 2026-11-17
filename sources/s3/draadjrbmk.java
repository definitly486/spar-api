package s3;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends GLSurfaceView {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final /* synthetic */ int f105265iozdgvuglv = 0;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f105266cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Handler f105267cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final wflxmlrfwp f105268esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f105269istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final wkgbmnqykc f105270iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Sensor f105271jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dxjokdxxww f105272lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private SurfaceTexture f105273pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f105274yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final SensorManager f105275yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final CopyOnWriteArrayList f105276zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Surface f105277zynmafqrjb;

    final class iobyxmoadg implements GLSurfaceView.Renderer, wflxmlrfwp.iobyxmoadg, wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final float[] f105279cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final float[] f105280esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final float[] f105282iwizpuwonk;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private float f105284lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private float f105285pmvmpeiblj;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final dxjokdxxww f105287zdlpuopuiu;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final float[] f105286yggfygwlhe = new float[16];

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final float[] f105283jyumaefscl = new float[16];

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final float[] f105288zynmafqrjb = new float[16];

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private final float[] f105281istkbnxepw = new float[16];

        public iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
            float[] fArr = new float[16];
            this.f105282iwizpuwonk = fArr;
            float[] fArr2 = new float[16];
            this.f105279cqumvgiudr = fArr2;
            float[] fArr3 = new float[16];
            this.f105280esjtqupxsv = fArr3;
            this.f105287zdlpuopuiu = dxjokdxxwwVar;
            GlUtil.gtknphoqwx(fArr);
            GlUtil.gtknphoqwx(fArr2);
            GlUtil.gtknphoqwx(fArr3);
            this.f105285pmvmpeiblj = 3.1415927f;
        }

        private float ppxfxbqfkf(float f13) {
            if (f13 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f13))) * 2.0d);
            }
            return 90.0f;
        }

        private void wkgbmnqykc() {
            Matrix.setRotateM(this.f105279cqumvgiudr, 0, -this.f105284lereixgezr, (float) Math.cos(this.f105285pmvmpeiblj), (float) Math.sin(this.f105285pmvmpeiblj), 0.0f);
        }

        @Override // s3.wkgbmnqykc.iobyxmoadg
        public synchronized void iobyxmoadg(float[] fArr, float f13) {
            float[] fArr2 = this.f105282iwizpuwonk;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f105285pmvmpeiblj = -f13;
            wkgbmnqykc();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f105281istkbnxepw, 0, this.f105282iwizpuwonk, 0, this.f105280esjtqupxsv, 0);
                Matrix.multiplyMM(this.f105288zynmafqrjb, 0, this.f105279cqumvgiudr, 0, this.f105281istkbnxepw, 0);
            }
            Matrix.multiplyMM(this.f105283jyumaefscl, 0, this.f105286yggfygwlhe, 0, this.f105288zynmafqrjb, 0);
            this.f105287zdlpuopuiu.ppxfxbqfkf(this.f105283jyumaefscl, false);
        }

        @Override // s3.wflxmlrfwp.iobyxmoadg
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return draadjrbmk.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i13, int i14) {
            GLES20.glViewport(0, 0, i13, i14);
            float f13 = i13 / i14;
            Matrix.perspectiveM(this.f105286yggfygwlhe, 0, ppxfxbqfkf(f13), f13, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            draadjrbmk.this.lqeggnwhkg(this.f105287zdlpuopuiu.wkgbmnqykc());
        }

        @Override // s3.wflxmlrfwp.iobyxmoadg
        public synchronized void zoijcleaow(PointF pointF) {
            this.f105284lereixgezr = pointF.y;
            wkgbmnqykc();
            Matrix.setRotateM(this.f105280esjtqupxsv, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }
    }

    public interface zoijcleaow {
        void cdpycssgdh(Surface surface);

        void zynmafqrjb(Surface surface);
    }

    public draadjrbmk(Context context) {
        this(context, null);
    }

    private void btonecajqb() {
        boolean z13 = this.f105269istkbnxepw && this.f105266cdpycssgdh;
        Sensor sensor = this.f105271jyumaefscl;
        if (sensor == null || z13 == this.f105274yadqdtsiqt) {
            return;
        }
        if (z13) {
            this.f105275yggfygwlhe.registerListener(this.f105270iwizpuwonk, sensor, 0);
        } else {
            this.f105275yggfygwlhe.unregisterListener(this.f105270iwizpuwonk);
        }
        this.f105274yadqdtsiqt = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg() {
        Surface surface = this.f105277zynmafqrjb;
        if (surface != null) {
            Iterator it = this.f105276zdlpuopuiu.iterator();
            while (it.hasNext()) {
                ((zoijcleaow) it.next()).zynmafqrjb(surface);
            }
        }
        nufgyqmvbu(this.f105273pmvmpeiblj, surface);
        this.f105273pmvmpeiblj = null;
        this.f105277zynmafqrjb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f105273pmvmpeiblj;
        Surface surface = this.f105277zynmafqrjb;
        Surface surface2 = new Surface(surfaceTexture);
        this.f105273pmvmpeiblj = surfaceTexture;
        this.f105277zynmafqrjb = surface2;
        Iterator it = this.f105276zdlpuopuiu.iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).cdpycssgdh(surface2);
        }
        nufgyqmvbu(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lqeggnwhkg(final SurfaceTexture surfaceTexture) {
        this.f105267cqumvgiudr.post(new Runnable() { // from class: s3.gtknphoqwx
            @Override // java.lang.Runnable
            public final void run() {
                this.f105312zdlpuopuiu.gxszxtbevo(surfaceTexture);
            }
        });
    }

    private static void nufgyqmvbu(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void dxjokdxxww(zoijcleaow zoijcleaowVar) {
        this.f105276zdlpuopuiu.remove(zoijcleaowVar);
    }

    public s3.iobyxmoadg getCameraMotionListener() {
        return this.f105272lereixgezr;
    }

    public r3.lqeggnwhkg getVideoFrameMetadataListener() {
        return this.f105272lereixgezr;
    }

    public Surface getVideoSurface() {
        return this.f105277zynmafqrjb;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f105267cqumvgiudr.post(new Runnable() { // from class: s3.btonecajqb
            @Override // java.lang.Runnable
            public final void run() {
                this.f105264zdlpuopuiu.eablkybsjg();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f105266cdpycssgdh = false;
        btonecajqb();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f105266cdpycssgdh = true;
        btonecajqb();
    }

    public void setDefaultStereoMode(int i13) {
        this.f105272lereixgezr.nufgyqmvbu(i13);
    }

    public void setUseSensorRotation(boolean z13) {
        this.f105269istkbnxepw = z13;
        btonecajqb();
    }

    public void wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        this.f105276zdlpuopuiu.add(zoijcleaowVar);
    }

    public draadjrbmk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f105276zdlpuopuiu = new CopyOnWriteArrayList();
        this.f105267cqumvgiudr = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) y2.iobyxmoadg.eablkybsjg(context.getSystemService("sensor"));
        this.f105275yggfygwlhe = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f105271jyumaefscl = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww();
        this.f105272lereixgezr = dxjokdxxwwVar;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(dxjokdxxwwVar);
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(context, iobyxmoadgVar, 25.0f);
        this.f105268esjtqupxsv = wflxmlrfwpVar;
        this.f105270iwizpuwonk = new wkgbmnqykc(((WindowManager) y2.iobyxmoadg.eablkybsjg((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), wflxmlrfwpVar, iobyxmoadgVar);
        this.f105269istkbnxepw = true;
        setEGLContextClientVersion(2);
        setRenderer(iobyxmoadgVar);
        setOnTouchListener(wflxmlrfwpVar);
    }
}

package s3;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import y2.kcexrzcfyt;
import y2.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
final class dxjokdxxww implements r3.lqeggnwhkg, iobyxmoadg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private byte[] f105292iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private SurfaceTexture f105293istkbnxepw;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f105301zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final AtomicBoolean f105300zdlpuopuiu = new AtomicBoolean();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AtomicBoolean f105299yggfygwlhe = new AtomicBoolean(true);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lqeggnwhkg f105295jyumaefscl = new lqeggnwhkg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ppxfxbqfkf f105294iwizpuwonk = new ppxfxbqfkf();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final pkzmftpjix f105290cqumvgiudr = new pkzmftpjix();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final pkzmftpjix f105291esjtqupxsv = new pkzmftpjix();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final float[] f105296lereixgezr = new float[16];

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float[] f105297pmvmpeiblj = new float[16];

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private volatile int f105289cdpycssgdh = 0;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f105298yadqdtsiqt = -1;

    private void dxjokdxxww(byte[] bArr, int i13, long j13) {
        byte[] bArr2 = this.f105292iozdgvuglv;
        int i14 = this.f105298yadqdtsiqt;
        this.f105292iozdgvuglv = bArr;
        if (i13 == -1) {
            i13 = this.f105289cdpycssgdh;
        }
        this.f105298yadqdtsiqt = i13;
        if (i14 == i13 && Arrays.equals(bArr2, this.f105292iozdgvuglv)) {
            return;
        }
        byte[] bArr3 = this.f105292iozdgvuglv;
        eablkybsjg eablkybsjgVarIobyxmoadg = bArr3 != null ? gxszxtbevo.iobyxmoadg(bArr3, this.f105298yadqdtsiqt) : null;
        if (eablkybsjgVarIobyxmoadg == null || !lqeggnwhkg.ppxfxbqfkf(eablkybsjgVarIobyxmoadg)) {
            eablkybsjgVarIobyxmoadg = eablkybsjg.zoijcleaow(this.f105298yadqdtsiqt);
        }
        this.f105291esjtqupxsv.iobyxmoadg(j13, eablkybsjgVarIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(SurfaceTexture surfaceTexture) {
        this.f105300zdlpuopuiu.set(true);
    }

    @Override // s3.iobyxmoadg
    public void eablkybsjg() {
        this.f105290cqumvgiudr.ppxfxbqfkf();
        this.f105294iwizpuwonk.wkgbmnqykc();
        this.f105299yggfygwlhe.set(true);
    }

    @Override // s3.iobyxmoadg
    public void iobyxmoadg(long j13, float[] fArr) {
        this.f105294iwizpuwonk.eablkybsjg(j13, fArr);
    }

    @Override // r3.lqeggnwhkg
    public void lqeggnwhkg(long j13, long j14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat) {
        this.f105290cqumvgiudr.iobyxmoadg(j14, Long.valueOf(j13));
        dxjokdxxww(iobyxmoadgVar.f9772pmvmpeiblj, iobyxmoadgVar.f9784zynmafqrjb, j14);
    }

    public void nufgyqmvbu(int i13) {
        this.f105289cdpycssgdh = i13;
    }

    public void ppxfxbqfkf(float[] fArr, boolean z13) {
        GLES20.glClear(16384);
        try {
            GlUtil.zoijcleaow();
        } catch (GlUtil.GlException e13) {
            kcexrzcfyt.wkgbmnqykc("SceneRenderer", "Failed to draw a frame", e13);
        }
        if (this.f105300zdlpuopuiu.compareAndSet(true, false)) {
            ((SurfaceTexture) y2.iobyxmoadg.eablkybsjg(this.f105293istkbnxepw)).updateTexImage();
            try {
                GlUtil.zoijcleaow();
            } catch (GlUtil.GlException e14) {
                kcexrzcfyt.wkgbmnqykc("SceneRenderer", "Failed to draw a frame", e14);
            }
            if (this.f105299yggfygwlhe.compareAndSet(true, false)) {
                GlUtil.gtknphoqwx(this.f105296lereixgezr);
            }
            long timestamp = this.f105293istkbnxepw.getTimestamp();
            Long l13 = (Long) this.f105290cqumvgiudr.lqeggnwhkg(timestamp);
            if (l13 != null) {
                this.f105294iwizpuwonk.ppxfxbqfkf(this.f105296lereixgezr, l13.longValue());
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) this.f105291esjtqupxsv.btonecajqb(timestamp);
            if (eablkybsjgVar != null) {
                this.f105295jyumaefscl.wkgbmnqykc(eablkybsjgVar);
            }
        }
        Matrix.multiplyMM(this.f105297pmvmpeiblj, 0, fArr, 0, this.f105296lereixgezr, 0);
        this.f105295jyumaefscl.iobyxmoadg(this.f105301zynmafqrjb, this.f105297pmvmpeiblj, z13);
    }

    public SurfaceTexture wkgbmnqykc() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.zoijcleaow();
            this.f105295jyumaefscl.zoijcleaow();
            GlUtil.zoijcleaow();
            this.f105301zynmafqrjb = GlUtil.gxszxtbevo();
        } catch (GlUtil.GlException e13) {
            kcexrzcfyt.wkgbmnqykc("SceneRenderer", "Failed to initialize the renderer", e13);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f105301zynmafqrjb);
        this.f105293istkbnxepw = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: s3.nufgyqmvbu
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f105331zdlpuopuiu.gxszxtbevo(surfaceTexture2);
            }
        });
        return this.f105293istkbnxepw;
    }
}

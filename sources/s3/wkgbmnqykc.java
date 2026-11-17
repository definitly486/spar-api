package s3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements SensorEventListener {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Display f105342eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iobyxmoadg[] f105343gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f105345lqeggnwhkg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f105344iobyxmoadg = new float[16];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float[] f105348zoijcleaow = new float[16];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float[] f105346ppxfxbqfkf = new float[16];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float[] f105347wkgbmnqykc = new float[3];

    public interface iobyxmoadg {
        void iobyxmoadg(float[] fArr, float f13);
    }

    public wkgbmnqykc(Display display, iobyxmoadg... iobyxmoadgVarArr) {
        this.f105342eablkybsjg = display;
        this.f105343gxszxtbevo = iobyxmoadgVarArr;
    }

    private static void eablkybsjg(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    private float iobyxmoadg(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f105348zoijcleaow);
        SensorManager.getOrientation(this.f105348zoijcleaow, this.f105347wkgbmnqykc);
        return this.f105347wkgbmnqykc[2];
    }

    private void ppxfxbqfkf(float[] fArr) {
        if (!this.f105345lqeggnwhkg) {
            ppxfxbqfkf.iobyxmoadg(this.f105346ppxfxbqfkf, fArr);
            this.f105345lqeggnwhkg = true;
        }
        float[] fArr2 = this.f105348zoijcleaow;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f105348zoijcleaow, 0, this.f105346ppxfxbqfkf, 0);
    }

    private void wkgbmnqykc(float[] fArr, int i13) {
        if (i13 != 0) {
            int i14 = 129;
            int i15 = 1;
            if (i13 == 1) {
                i15 = 129;
                i14 = 2;
            } else if (i13 == 2) {
                i15 = 130;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException();
                }
                i14 = 130;
            }
            float[] fArr2 = this.f105348zoijcleaow;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f105348zoijcleaow, i14, i15, fArr);
        }
    }

    private void zoijcleaow(float[] fArr, float f13) {
        for (iobyxmoadg iobyxmoadgVar : this.f105343gxszxtbevo) {
            iobyxmoadgVar.iobyxmoadg(fArr, f13);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f105344iobyxmoadg, sensorEvent.values);
        wkgbmnqykc(this.f105344iobyxmoadg, this.f105342eablkybsjg.getRotation());
        float fIobyxmoadg = iobyxmoadg(this.f105344iobyxmoadg);
        eablkybsjg(this.f105344iobyxmoadg);
        ppxfxbqfkf(this.f105344iobyxmoadg);
        zoijcleaow(this.f105344iobyxmoadg, fIobyxmoadg);
    }
}

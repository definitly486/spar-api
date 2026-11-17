package kk;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public final class y90 implements SensorEventListener {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public t80 f59398iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public long f59399zoijcleaow;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (this.f59398iobyxmoadg != null) {
            float[] fArr = event.values;
            float f13 = fArr[0] / 9.80665f;
            float f14 = fArr[1] / 9.80665f;
            float f15 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f15 * f15) + (f14 * f14) + (f13 * f13))) > 2.7f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f59399zoijcleaow + ((long) 500) > jCurrentTimeMillis) {
                    return;
                }
                this.f59399zoijcleaow = jCurrentTimeMillis;
                t80 t80Var = this.f59398iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(t80Var);
                npi.spay.uo uoVar = t80Var.f58630iobyxmoadg;
                int i13 = npi.spay.uo.f70585cdpycssgdh;
                uoVar.jlmebxxoox();
                Toast.makeText(t80Var.f58630iobyxmoadg.requireContext(), "Shake", 0).show();
            }
        }
    }
}

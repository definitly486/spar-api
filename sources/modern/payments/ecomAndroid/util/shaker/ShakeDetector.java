package modern.payments.ecomAndroid.util.shaker;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector$OnShakeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lgg/wwaezpbzkn;", "setOnShakeListener", "(Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector$OnShakeListener;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "mListener", "Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector$OnShakeListener;", "", "mShakeTimestamp", "J", "mShakeCount", "I", "Companion", "OnShakeListener", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ShakeDetector implements SensorEventListener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int SHAKE_COUNT_RESET_TIME_MS = 3000;

    @Deprecated
    public static final int SHAKE_SLOP_TIME_MS = 500;

    @Deprecated
    public static final float SHAKE_THRESHOLD_GRAVITY = 2.7f;
    private OnShakeListener mListener;
    private int mShakeCount;
    private long mShakeTimestamp;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector$Companion;", "", "()V", "SHAKE_COUNT_RESET_TIME_MS", "", "SHAKE_SLOP_TIME_MS", "SHAKE_THRESHOLD_GRAVITY", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector$OnShakeListener;", "", "", "count", "Lgg/wwaezpbzkn;", "onShake", "(I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnShakeListener {
        void onShake(int count);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        zdlpuopuiu.btonecajqb(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.mListener != null) {
            float[] fArr = event.values;
            float f13 = fArr[0] / 9.80665f;
            float f14 = fArr[1] / 9.80665f;
            float f15 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f13 * f13) + (f14 * f14) + (f15 * f15))) > 2.7f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j13 = this.mShakeTimestamp;
                if (((long) 500) + j13 > jCurrentTimeMillis) {
                    return;
                }
                if (j13 + ((long) 3000) < jCurrentTimeMillis) {
                    this.mShakeCount = 0;
                }
                this.mShakeTimestamp = jCurrentTimeMillis;
                this.mShakeCount++;
                OnShakeListener onShakeListener = this.mListener;
                zdlpuopuiu.lqeggnwhkg(onShakeListener);
                onShakeListener.onShake(this.mShakeCount);
            }
        }
    }

    public final void setOnShakeListener(OnShakeListener listener) {
        this.mListener = listener;
    }
}

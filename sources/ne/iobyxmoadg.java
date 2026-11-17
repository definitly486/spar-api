package ne;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final GmsLogger f69792ppxfxbqfkf = new GmsLogger("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinkedList f69793iobyxmoadg = new LinkedList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f69794zoijcleaow = -1;

    public void iobyxmoadg(me.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.eablkybsjg() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f69793iobyxmoadg.add(Long.valueOf(jElapsedRealtime));
        if (this.f69793iobyxmoadg.size() > 5) {
            this.f69793iobyxmoadg.removeFirst();
        }
        if (this.f69793iobyxmoadg.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.f69793iobyxmoadg.peekFirst())).longValue() >= DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
            return;
        }
        long j13 = this.f69794zoijcleaow;
        if (j13 == -1 || jElapsedRealtime - j13 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f69794zoijcleaow = jElapsedRealtime;
            f69792ppxfxbqfkf.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}

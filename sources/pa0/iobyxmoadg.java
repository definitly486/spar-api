package pa0;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.rgvfuqvkyq;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements la0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f76265iobyxmoadg;

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f76265iobyxmoadg = context;
    }

    @Override // la0.iobyxmoadg
    public boolean iobyxmoadg(String channelId) {
        zdlpuopuiu.btonecajqb(channelId, "channelId");
        NotificationChannel notificationChannelGxszxtbevo = rgvfuqvkyq.wkgbmnqykc(this.f76265iobyxmoadg).gxszxtbevo(channelId);
        boolean z13 = false;
        if (notificationChannelGxszxtbevo != null && notificationChannelGxszxtbevo.getImportance() == 0) {
            z13 = true;
        }
        return !z13;
    }

    @Override // la0.iobyxmoadg
    public boolean zoijcleaow() {
        return rgvfuqvkyq.wkgbmnqykc(this.f76265iobyxmoadg).iobyxmoadg();
    }
}

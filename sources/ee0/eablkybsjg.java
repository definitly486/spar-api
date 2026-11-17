package ee0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import androidx.core.app.wflxmlrfwp;
import dt.gxszxtbevo;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f31197eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f31198gxszxtbevo = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f31199iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final of0.zoijcleaow f31200ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final NotificationManager f31201wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zv.iobyxmoadg f31202zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public eablkybsjg(Context context, zv.iobyxmoadg notificationsRepository, of0.zoijcleaow mainActivityFeatureApi) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        zdlpuopuiu.btonecajqb(mainActivityFeatureApi, "mainActivityFeatureApi");
        this.f31199iobyxmoadg = context;
        this.f31202zoijcleaow = notificationsRepository;
        this.f31200ppxfxbqfkf = mainActivityFeatureApi;
        Object systemService = context.getSystemService("notification");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f31201wkgbmnqykc = (NotificationManager) systemService;
    }

    private final void ppxfxbqfkf() {
        NotificationChannel notificationChannel = new NotificationChannel("main_channel", "Main Channel", 4);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLockscreenVisibility(1);
        this.f31201wkgbmnqykc.createNotificationChannel(notificationChannel);
    }

    @Override // dt.gxszxtbevo
    public void iobyxmoadg(String token) {
        zdlpuopuiu.btonecajqb(token, "token");
        rs.wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("FCM_SPAR", "[PushManagerImpl], onNewToken=" + token, true);
        this.f31202zoijcleaow.iobyxmoadg(token);
    }

    @Override // dt.gxszxtbevo
    public void zoijcleaow(String str, String str2, String str3, Map map) {
        ppxfxbqfkf();
        of0.zoijcleaow zoijcleaowVar = this.f31200ppxfxbqfkf;
        Context context = this.f31199iobyxmoadg;
        NavigationPayload navigationPayloadWkgbmnqykc = g40.ppxfxbqfkf.f36186iobyxmoadg.wkgbmnqykc(map, str3);
        if (navigationPayloadWkgbmnqykc == null) {
            navigationPayloadWkgbmnqykc = new NavigationPayload(null, null, null, null, false, null, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }
        Notification notificationZoijcleaow = new wflxmlrfwp.eablkybsjg(this.f31199iobyxmoadg, "main_channel").zdlpuopuiu(s40.gxszxtbevo.ic_spar_green).lqeggnwhkg(c60.zoijcleaow.ppxfxbqfkf(this.f31199iobyxmoadg, lqeggnwhkg.iobyxmoadg.colorPrimary)).btonecajqb(str).dxjokdxxww(str2).eablkybsjg(true).gtknphoqwx(1).nufgyqmvbu(PendingIntent.getActivity(this.f31199iobyxmoadg, (int) SystemClock.currentThreadTimeMillis(), zoijcleaowVar.iobyxmoadg(context, navigationPayloadWkgbmnqykc), 1140850688)).zoijcleaow();
        zdlpuopuiu.dxjokdxxww(notificationZoijcleaow, "build(...)");
        this.f31201wkgbmnqykc.notify(str3 != null ? str3.hashCode() : 0, notificationZoijcleaow);
    }
}

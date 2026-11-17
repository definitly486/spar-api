package ac1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import androidx.core.app.wflxmlrfwp;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.net.URL;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import pj.krqnebusok;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import tg.rgvfuqvkyq;
import xr0.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements gxszxtbevo {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f1524gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f1525lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final NotificationManager f1526eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f1527iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sc1.zoijcleaow f1528ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cllcsxoeiz f1529wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tu0.iobyxmoadg f1530zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f1531cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ String f1532esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f1533iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ PendingIntent f1534jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ String f1535lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Uri f1536yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1537zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(Uri uri, PendingIntent pendingIntent, eablkybsjg eablkybsjgVar, String str, String str2, String str3, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f1536yggfygwlhe = uri;
            this.f1534jyumaefscl = pendingIntent;
            this.f1533iwizpuwonk = eablkybsjgVar;
            this.f1531cqumvgiudr = str;
            this.f1532esjtqupxsv = str2;
            this.f1535lereixgezr = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f1536yggfygwlhe, this.f1534jyumaefscl, this.f1533iwizpuwonk, this.f1531cqumvgiudr, this.f1532esjtqupxsv, this.f1535lereixgezr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0046  */
        /* JADX WARN: Code duplicated, block: B:18:0x004b  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            String str;
            int iHashCode;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f1537zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                Uri uri = this.f1536yggfygwlhe;
                if (uri != null) {
                    eablkybsjg eablkybsjgVar = this.f1533iwizpuwonk;
                    this.f1537zdlpuopuiu = 1;
                    obj = eablkybsjgVar.lqeggnwhkg(uri, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    bitmap = null;
                }
                PendingIntent pendingIntent = this.f1534jyumaefscl;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(pendingIntent);
                Notification notificationGxszxtbevo = this.f1533iwizpuwonk.gxszxtbevo(this.f1531cqumvgiudr, this.f1532esjtqupxsv, pendingIntent, bitmap);
                NotificationManager notificationManager = this.f1533iwizpuwonk.f1526eablkybsjg;
                str = this.f1535lereixgezr;
                if (str != null) {
                    iHashCode = str.hashCode();
                } else {
                    iHashCode = 0;
                }
                notificationManager.notify(iHashCode, notificationGxszxtbevo);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            bitmap = (Bitmap) obj;
            PendingIntent pendingIntent2 = this.f1534jyumaefscl;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(pendingIntent2);
            Notification notificationGxszxtbevo2 = this.f1533iwizpuwonk.gxszxtbevo(this.f1531cqumvgiudr, this.f1532esjtqupxsv, pendingIntent2, bitmap);
            NotificationManager notificationManager2 = this.f1533iwizpuwonk.f1526eablkybsjg;
            str = this.f1535lereixgezr;
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            notificationManager2.notify(iHashCode, notificationGxszxtbevo2);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Uri f1538yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1539zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Uri uri, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f1538yggfygwlhe = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f1538yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f1539zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            Uri uri = this.f1538yggfygwlhe;
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(uri.toString()))));
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                return null;
            }
            return objWkgbmnqykc;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public eablkybsjg(Context context, tu0.iobyxmoadg notificationsRepository, sc1.zoijcleaow mainActivityFeatureApi) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mainActivityFeatureApi, "mainActivityFeatureApi");
        this.f1527iobyxmoadg = context;
        this.f1530zoijcleaow = notificationsRepository;
        this.f1528ppxfxbqfkf = mainActivityFeatureApi;
        this.f1529wkgbmnqykc = dsvhmnatus.iobyxmoadg(krqnebusok.zoijcleaow(null, 1, null).plus(ikoacuggdj.ppxfxbqfkf()));
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f1526eablkybsjg = (NotificationManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Notification gxszxtbevo(String str, String str2, PendingIntent pendingIntent, Bitmap bitmap) {
        wflxmlrfwp.eablkybsjg eablkybsjgVarZdlpuopuiu = new wflxmlrfwp.eablkybsjg(this.f1527iobyxmoadg, "main_channel").zdlpuopuiu(b31.gxszxtbevo.ic_spar_green);
        if (bitmap != null) {
            eablkybsjgVarZdlpuopuiu = eablkybsjgVarZdlpuopuiu.agtfadlqog(bitmap);
        }
        if (bitmap != null) {
            wflxmlrfwp.zoijcleaow zoijcleaowVarDxjokdxxww = new wflxmlrfwp.zoijcleaow().btonecajqb(bitmap).dxjokdxxww(null);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarDxjokdxxww, "bigLargeIcon(...)");
            eablkybsjgVarZdlpuopuiu = eablkybsjgVarZdlpuopuiu.jyumaefscl(zoijcleaowVarDxjokdxxww);
        }
        Notification notificationZoijcleaow = eablkybsjgVarZdlpuopuiu.lqeggnwhkg(p41.ppxfxbqfkf.ppxfxbqfkf(this.f1527iobyxmoadg, lqeggnwhkg.iobyxmoadg.colorPrimary)).btonecajqb(str).dxjokdxxww(str2).eablkybsjg(true).gtknphoqwx(1).nufgyqmvbu(pendingIntent).zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(notificationZoijcleaow, "build(...)");
        return notificationZoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lqeggnwhkg(Uri uri, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new zoijcleaow(uri, null), gxszxtbevoVar);
    }

    private final void nufgyqmvbu() {
        NotificationChannel notificationChannel = new NotificationChannel("main_channel", "Main Channel", 4);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLockscreenVisibility(1);
        this.f1526eablkybsjg.createNotificationChannel(notificationChannel);
    }

    @Override // xr0.gxszxtbevo
    public void iobyxmoadg(String token) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(token, "token");
        kr0.wkgbmnqykc.f60450iobyxmoadg.zoijcleaow("FCM_SPAR", "[PushManagerImpl], onNewToken=" + token, true);
        this.f1530zoijcleaow.iobyxmoadg(token);
    }

    @Override // xr0.gxszxtbevo
    public void zoijcleaow(String str, String str2, Uri uri, String str3, Map map) {
        nufgyqmvbu();
        sc1.zoijcleaow zoijcleaowVar = this.f1528ppxfxbqfkf;
        Context context = this.f1527iobyxmoadg;
        NavigationPayload navigationPayloadWkgbmnqykc = l21.ppxfxbqfkf.f61375iobyxmoadg.wkgbmnqykc(map, str3);
        if (navigationPayloadWkgbmnqykc == null) {
            navigationPayloadWkgbmnqykc = new NavigationPayload(null, null, null, null, false, null, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }
        pj.gtknphoqwx.wkgbmnqykc(this.f1529wkgbmnqykc, null, null, new ppxfxbqfkf(uri, PendingIntent.getActivity(this.f1527iobyxmoadg, (int) SystemClock.currentThreadTimeMillis(), zoijcleaowVar.iobyxmoadg(context, navigationPayloadWkgbmnqykc), 1140850688), this, str, str2, str3, null), 3, null);
    }
}

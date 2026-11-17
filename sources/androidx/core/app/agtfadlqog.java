package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class agtfadlqog implements draadjrbmk {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private RemoteViews f8347dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private RemoteViews f8348eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f8350iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f8352nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp.eablkybsjg f8353ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private RemoteViews f8354wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Notification.Builder f8355zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f8349gxszxtbevo = new ArrayList();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Bundle f8351lqeggnwhkg = new Bundle();

    static class eablkybsjg {
        static Notification.Builder eablkybsjg(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder gxszxtbevo(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder iobyxmoadg(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder lqeggnwhkg(Notification.Builder builder, long j13) {
            return builder.setTimeoutAfter(j13);
        }

        static Notification.Builder ppxfxbqfkf(Notification.Builder builder, boolean z13) {
            return builder.setColorized(z13);
        }

        static Notification.Builder wkgbmnqykc(Notification.Builder builder, int i13) {
            return builder.setGroupAlertBehavior(i13);
        }

        static Notification.Builder zoijcleaow(Notification.Builder builder, int i13) {
            return builder.setBadgeIconType(i13);
        }
    }

    static class gxszxtbevo {
        static Notification.Action.Builder iobyxmoadg(Notification.Action.Builder builder, int i13) {
            return builder.setSemanticAction(i13);
        }
    }

    static class iobyxmoadg {
        static Notification.Builder eablkybsjg(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder gxszxtbevo(Notification.Builder builder, boolean z13) {
            return builder.setGroupSummary(z13);
        }

        static Notification.Builder iobyxmoadg(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Builder lqeggnwhkg(Notification.Builder builder, boolean z13) {
            return builder.setLocalOnly(z13);
        }

        static Notification.Builder nufgyqmvbu(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }

        static Notification.Action.Builder ppxfxbqfkf(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action wkgbmnqykc(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder zoijcleaow(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }
    }

    static class lqeggnwhkg {
        static Notification.Builder iobyxmoadg(Notification.Builder builder, boolean z13) {
            return builder.setAllowSystemGeneratedContextualActions(z13);
        }

        static Notification.Action.Builder ppxfxbqfkf(Notification.Action.Builder builder, boolean z13) {
            return builder.setContextual(z13);
        }

        static Notification.Builder zoijcleaow(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }
    }

    static class nufgyqmvbu {
        static Notification.Action.Builder iobyxmoadg(Notification.Action.Builder builder, boolean z13) {
            return builder.setAuthenticationRequired(z13);
        }

        static Notification.Builder zoijcleaow(Notification.Builder builder, int i13) {
            return builder.setForegroundServiceBehavior(i13);
        }
    }

    static class ppxfxbqfkf {
        static Notification.Action.Builder iobyxmoadg(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder ppxfxbqfkf(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        static Notification.Builder zoijcleaow(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class wkgbmnqykc {
        static Notification.Builder eablkybsjg(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        static Notification.Action.Builder iobyxmoadg(Notification.Action.Builder builder, boolean z13) {
            return builder.setAllowGeneratedReplies(z13);
        }

        static Notification.Builder ppxfxbqfkf(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder wkgbmnqykc(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder zoijcleaow(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }
    }

    static class zoijcleaow {
        static Notification.Builder eablkybsjg(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder gxszxtbevo(Notification.Builder builder, int i13) {
            return builder.setVisibility(i13);
        }

        static Notification.Builder iobyxmoadg(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder ppxfxbqfkf(Notification.Builder builder, int i13) {
            return builder.setColor(i13);
        }

        static Notification.Builder wkgbmnqykc(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder zoijcleaow(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    agtfadlqog(wflxmlrfwp.eablkybsjg eablkybsjgVar) {
        int i13;
        this.f8353ppxfxbqfkf = eablkybsjgVar;
        Context context = eablkybsjgVar.f8411iobyxmoadg;
        this.f8350iobyxmoadg = context;
        Notification.Builder builderIobyxmoadg = eablkybsjg.iobyxmoadg(context, eablkybsjgVar.f8409hcddaimhww);
        this.f8355zoijcleaow = builderIobyxmoadg;
        Notification notification = eablkybsjgVar.f8418kegysxyocb;
        builderIobyxmoadg.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eablkybsjgVar.f8404dxjokdxxww).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eablkybsjgVar.f8405eablkybsjg).setContentText(eablkybsjgVar.f8408gxszxtbevo).setContentInfo(eablkybsjgVar.f8407gtknphoqwx).setContentIntent(eablkybsjgVar.f8421lqeggnwhkg).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eablkybsjgVar.f8424nufgyqmvbu, (notification.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0).setNumber(eablkybsjgVar.f8402draadjrbmk).setProgress(eablkybsjgVar.f8441zdlpuopuiu, eablkybsjgVar.f8439yggfygwlhe, eablkybsjgVar.f8416jyumaefscl);
        IconCompat iconCompat = eablkybsjgVar.f8398btonecajqb;
        ppxfxbqfkf.zoijcleaow(builderIobyxmoadg, iconCompat == null ? null : iconCompat.oxmwwwfdhm(context));
        builderIobyxmoadg.setSubText(eablkybsjgVar.f8433vdvldrhtss).setUsesChronometer(eablkybsjgVar.f8425ojitshcjhn).setPriority(eablkybsjgVar.f8434wflxmlrfwp);
        Iterator it = eablkybsjgVar.f8442zoijcleaow.iterator();
        while (it.hasNext()) {
            zoijcleaow((wflxmlrfwp.iobyxmoadg) it.next());
        }
        Bundle bundle = eablkybsjgVar.f8399cdpycssgdh;
        if (bundle != null) {
            this.f8351lqeggnwhkg.putAll(bundle);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f8354wkgbmnqykc = eablkybsjgVar.f8436wwaezpbzkn;
        this.f8348eablkybsjg = eablkybsjgVar.f8440ylkuphrtab;
        this.f8355zoijcleaow.setShowWhen(eablkybsjgVar.f8397agtfadlqog);
        iobyxmoadg.lqeggnwhkg(this.f8355zoijcleaow, eablkybsjgVar.f8419lereixgezr);
        iobyxmoadg.eablkybsjg(this.f8355zoijcleaow, eablkybsjgVar.f8414iwizpuwonk);
        iobyxmoadg.nufgyqmvbu(this.f8355zoijcleaow, eablkybsjgVar.f8406esjtqupxsv);
        iobyxmoadg.gxszxtbevo(this.f8355zoijcleaow, eablkybsjgVar.f8401cqumvgiudr);
        this.f8352nufgyqmvbu = eablkybsjgVar.f8403dsvhmnatus;
        zoijcleaow.zoijcleaow(this.f8355zoijcleaow, eablkybsjgVar.f8413istkbnxepw);
        zoijcleaow.ppxfxbqfkf(this.f8355zoijcleaow, eablkybsjgVar.f8438yadqdtsiqt);
        zoijcleaow.gxszxtbevo(this.f8355zoijcleaow, eablkybsjgVar.f8412iozdgvuglv);
        zoijcleaow.wkgbmnqykc(this.f8355zoijcleaow, eablkybsjgVar.f8420lmojexxdyd);
        zoijcleaow.eablkybsjg(this.f8355zoijcleaow, notification.sound, notification.audioAttributes);
        List listEablkybsjg = i14 < 28 ? eablkybsjg(lqeggnwhkg(eablkybsjgVar.f8429ppxfxbqfkf), eablkybsjgVar.f8423ntlheqmsrt) : eablkybsjgVar.f8423ntlheqmsrt;
        if (listEablkybsjg != null && !listEablkybsjg.isEmpty()) {
            Iterator it2 = listEablkybsjg.iterator();
            while (it2.hasNext()) {
                zoijcleaow.iobyxmoadg(this.f8355zoijcleaow, (String) it2.next());
            }
        }
        this.f8347dxjokdxxww = eablkybsjgVar.f8427pkzmftpjix;
        if (eablkybsjgVar.f8435wkgbmnqykc.size() > 0) {
            Bundle bundle2 = eablkybsjgVar.ppxfxbqfkf().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i15 = 0; i15 < eablkybsjgVar.f8435wkgbmnqykc.size(); i15++) {
                bundle4.putBundle(Integer.toString(i15), ojitshcjhn.iobyxmoadg((wflxmlrfwp.iobyxmoadg) eablkybsjgVar.f8435wkgbmnqykc.get(i15)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eablkybsjgVar.ppxfxbqfkf().putBundle("android.car.EXTENSIONS", bundle2);
            this.f8351lqeggnwhkg.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i16 = Build.VERSION.SDK_INT;
        Object obj = eablkybsjgVar.f8422mbcevpiqjq;
        if (obj != null) {
            ppxfxbqfkf.ppxfxbqfkf(this.f8355zoijcleaow, obj);
        }
        this.f8355zoijcleaow.setExtras(eablkybsjgVar.f8399cdpycssgdh);
        wkgbmnqykc.eablkybsjg(this.f8355zoijcleaow, eablkybsjgVar.f8417kcexrzcfyt);
        RemoteViews remoteViews = eablkybsjgVar.f8436wwaezpbzkn;
        if (remoteViews != null) {
            wkgbmnqykc.ppxfxbqfkf(this.f8355zoijcleaow, remoteViews);
        }
        RemoteViews remoteViews2 = eablkybsjgVar.f8440ylkuphrtab;
        if (remoteViews2 != null) {
            wkgbmnqykc.zoijcleaow(this.f8355zoijcleaow, remoteViews2);
        }
        RemoteViews remoteViews3 = eablkybsjgVar.f8427pkzmftpjix;
        if (remoteViews3 != null) {
            wkgbmnqykc.wkgbmnqykc(this.f8355zoijcleaow, remoteViews3);
        }
        eablkybsjg.zoijcleaow(this.f8355zoijcleaow, eablkybsjgVar.f8415jpowsppfya);
        eablkybsjg.eablkybsjg(this.f8355zoijcleaow, eablkybsjgVar.f8426oxmwwwfdhm);
        eablkybsjg.gxszxtbevo(this.f8355zoijcleaow, eablkybsjgVar.f8410hkdspvbjdz);
        eablkybsjg.lqeggnwhkg(this.f8355zoijcleaow, eablkybsjgVar.f8400cllcsxoeiz);
        eablkybsjg.wkgbmnqykc(this.f8355zoijcleaow, eablkybsjgVar.f8403dsvhmnatus);
        if (eablkybsjgVar.f8443zynmafqrjb) {
            eablkybsjg.ppxfxbqfkf(this.f8355zoijcleaow, eablkybsjgVar.f8428pmvmpeiblj);
        }
        if (!TextUtils.isEmpty(eablkybsjgVar.f8409hcddaimhww)) {
            this.f8355zoijcleaow.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i16 >= 28) {
            Iterator it3 = eablkybsjgVar.f8429ppxfxbqfkf.iterator();
            if (it3.hasNext()) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it3.next());
                throw null;
            }
        }
        if (i16 >= 29) {
            lqeggnwhkg.iobyxmoadg(this.f8355zoijcleaow, eablkybsjgVar.f8431stevsuqkhv);
            lqeggnwhkg.zoijcleaow(this.f8355zoijcleaow, wflxmlrfwp.wkgbmnqykc.iobyxmoadg(null));
        }
        if (i16 >= 31 && (i13 = eablkybsjgVar.f8437wypolnanlu) != 0) {
            nufgyqmvbu.zoijcleaow(this.f8355zoijcleaow, i13);
        }
        if (eablkybsjgVar.f8432tzroggbefp) {
            if (this.f8353ppxfxbqfkf.f8401cqumvgiudr) {
                this.f8352nufgyqmvbu = 2;
            } else {
                this.f8352nufgyqmvbu = 1;
            }
            this.f8355zoijcleaow.setVibrate(null);
            this.f8355zoijcleaow.setSound(null);
            int i17 = notification.defaults & (-4);
            notification.defaults = i17;
            this.f8355zoijcleaow.setDefaults(i17);
            if (TextUtils.isEmpty(this.f8353ppxfxbqfkf.f8414iwizpuwonk)) {
                iobyxmoadg.eablkybsjg(this.f8355zoijcleaow, "silent");
            }
            eablkybsjg.wkgbmnqykc(this.f8355zoijcleaow, this.f8352nufgyqmvbu);
        }
    }

    private static List eablkybsjg(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.zoijcleaow zoijcleaowVar = new androidx.collection.zoijcleaow(list.size() + list2.size());
        zoijcleaowVar.addAll(list);
        zoijcleaowVar.addAll(list2);
        return new ArrayList(zoijcleaowVar);
    }

    private static List lqeggnwhkg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
        throw null;
    }

    private void zoijcleaow(wflxmlrfwp.iobyxmoadg iobyxmoadgVar) {
        IconCompat iconCompatWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        Notification.Action.Builder builderIobyxmoadg = ppxfxbqfkf.iobyxmoadg(iconCompatWkgbmnqykc != null ? iconCompatWkgbmnqykc.vdvldrhtss() : null, iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.iobyxmoadg());
        if (iobyxmoadgVar.eablkybsjg() != null) {
            for (RemoteInput remoteInput : zdlpuopuiu.zoijcleaow(iobyxmoadgVar.eablkybsjg())) {
                iobyxmoadg.ppxfxbqfkf(builderIobyxmoadg, remoteInput);
            }
        }
        Bundle bundle = iobyxmoadgVar.ppxfxbqfkf() != null ? new Bundle(iobyxmoadgVar.ppxfxbqfkf()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", iobyxmoadgVar.zoijcleaow());
        int i13 = Build.VERSION.SDK_INT;
        wkgbmnqykc.iobyxmoadg(builderIobyxmoadg, iobyxmoadgVar.zoijcleaow());
        bundle.putInt("android.support.action.semanticAction", iobyxmoadgVar.gxszxtbevo());
        if (i13 >= 28) {
            gxszxtbevo.iobyxmoadg(builderIobyxmoadg, iobyxmoadgVar.gxszxtbevo());
        }
        if (i13 >= 29) {
            lqeggnwhkg.ppxfxbqfkf(builderIobyxmoadg, iobyxmoadgVar.btonecajqb());
        }
        if (i13 >= 31) {
            nufgyqmvbu.iobyxmoadg(builderIobyxmoadg, iobyxmoadgVar.dxjokdxxww());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", iobyxmoadgVar.lqeggnwhkg());
        iobyxmoadg.zoijcleaow(builderIobyxmoadg, bundle);
        iobyxmoadg.iobyxmoadg(this.f8355zoijcleaow, iobyxmoadg.wkgbmnqykc(builderIobyxmoadg));
    }

    Context gxszxtbevo() {
        return this.f8350iobyxmoadg;
    }

    @Override // androidx.core.app.draadjrbmk
    public Notification.Builder iobyxmoadg() {
        return this.f8355zoijcleaow;
    }

    public Notification ppxfxbqfkf() {
        Bundle bundleIobyxmoadg;
        RemoteViews remoteViewsGxszxtbevo;
        RemoteViews remoteViewsWkgbmnqykc;
        wflxmlrfwp.gxszxtbevo gxszxtbevoVar = this.f8353ppxfxbqfkf.f8430rgvfuqvkyq;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.zoijcleaow(this);
        }
        RemoteViews remoteViewsEablkybsjg = gxszxtbevoVar != null ? gxszxtbevoVar.eablkybsjg(this) : null;
        Notification notificationWkgbmnqykc = wkgbmnqykc();
        if (remoteViewsEablkybsjg != null) {
            notificationWkgbmnqykc.contentView = remoteViewsEablkybsjg;
        } else {
            RemoteViews remoteViews = this.f8353ppxfxbqfkf.f8436wwaezpbzkn;
            if (remoteViews != null) {
                notificationWkgbmnqykc.contentView = remoteViews;
            }
        }
        if (gxszxtbevoVar != null && (remoteViewsWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc(this)) != null) {
            notificationWkgbmnqykc.bigContentView = remoteViewsWkgbmnqykc;
        }
        if (gxszxtbevoVar != null && (remoteViewsGxszxtbevo = this.f8353ppxfxbqfkf.f8430rgvfuqvkyq.gxszxtbevo(this)) != null) {
            notificationWkgbmnqykc.headsUpContentView = remoteViewsGxszxtbevo;
        }
        if (gxszxtbevoVar != null && (bundleIobyxmoadg = wflxmlrfwp.iobyxmoadg(notificationWkgbmnqykc)) != null) {
            gxszxtbevoVar.iobyxmoadg(bundleIobyxmoadg);
        }
        return notificationWkgbmnqykc;
    }

    protected Notification wkgbmnqykc() {
        return this.f8355zoijcleaow.build();
    }
}

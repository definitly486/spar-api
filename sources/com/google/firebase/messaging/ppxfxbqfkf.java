package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final AtomicInteger f24470iobyxmoadg = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.core.app.wflxmlrfwp.eablkybsjg f24471iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f24472ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f24473zoijcleaow;

        iobyxmoadg(androidx.core.app.wflxmlrfwp.eablkybsjg eablkybsjgVar, String str, int i13) {
            this.f24471iobyxmoadg = eablkybsjgVar;
            this.f24473zoijcleaow = str;
            this.f24472ppxfxbqfkf = i13;
        }
    }

    private static Uri agtfadlqog(String str, ylkuphrtab ylkuphrtabVar, Resources resources) {
        String strOjitshcjhn = ylkuphrtabVar.ojitshcjhn();
        if (TextUtils.isEmpty(strOjitshcjhn)) {
            return null;
        }
        if ("default".equals(strOjitshcjhn) || resources.getIdentifier(strOjitshcjhn, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strOjitshcjhn);
    }

    private static Bundle btonecajqb(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e13) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e13);
        }
        return Bundle.EMPTY;
    }

    private static int draadjrbmk(int i13) {
        return i13 | 67108864;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int dxjokdxxww(ylkuphrtab ylkuphrtabVar) {
        boolean zIobyxmoadg = ylkuphrtabVar.iobyxmoadg("gcm.n.default_sound");
        ?? r13 = zIobyxmoadg;
        if (ylkuphrtabVar.iobyxmoadg("gcm.n.default_vibrate_timings")) {
            r13 = (zIobyxmoadg ? 1 : 0) | 2;
        }
        return ylkuphrtabVar.iobyxmoadg("gcm.n.default_light_settings") ? r13 | 4 : r13;
    }

    static iobyxmoadg eablkybsjg(Context context, ylkuphrtab ylkuphrtabVar) {
        Bundle bundleBtonecajqb = btonecajqb(context.getPackageManager(), context.getPackageName());
        return wkgbmnqykc(context, context, ylkuphrtabVar, gtknphoqwx(context, ylkuphrtabVar.gtknphoqwx(), bundleBtonecajqb), bundleBtonecajqb);
    }

    public static String gtknphoqwx(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static Intent gxszxtbevo(String str, ylkuphrtab ylkuphrtabVar, PackageManager packageManager) {
        String strRgvfuqvkyq = ylkuphrtabVar.rgvfuqvkyq("gcm.n.click_action");
        if (!TextUtils.isEmpty(strRgvfuqvkyq)) {
            Intent intent = new Intent(strRgvfuqvkyq);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriGxszxtbevo = ylkuphrtabVar.gxszxtbevo();
        if (uriGxszxtbevo != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriGxszxtbevo);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static PendingIntent iobyxmoadg(Context context, ylkuphrtab ylkuphrtabVar, String str, PackageManager packageManager) {
        Intent intentGxszxtbevo = gxszxtbevo(str, ylkuphrtabVar, packageManager);
        if (intentGxszxtbevo == null) {
            return null;
        }
        intentGxszxtbevo.addFlags(67108864);
        intentGxszxtbevo.putExtras(ylkuphrtabVar.esjtqupxsv());
        if (vdvldrhtss(ylkuphrtabVar)) {
            intentGxszxtbevo.putExtra("gcm.n.analytics_data", ylkuphrtabVar.cqumvgiudr());
        }
        return PendingIntent.getActivity(context, lqeggnwhkg(), intentGxszxtbevo, draadjrbmk(1073741824));
    }

    private static int lqeggnwhkg() {
        return f24470iobyxmoadg.incrementAndGet();
    }

    private static Integer nufgyqmvbu(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i13 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i13 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.iobyxmoadg.getColor(context, i13));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static String ojitshcjhn(ylkuphrtab ylkuphrtabVar) {
        String strRgvfuqvkyq = ylkuphrtabVar.rgvfuqvkyq("gcm.n.tag");
        if (!TextUtils.isEmpty(strRgvfuqvkyq)) {
            return strRgvfuqvkyq;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static PendingIntent ppxfxbqfkf(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, lqeggnwhkg(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), draadjrbmk(1073741824));
    }

    private static boolean rgvfuqvkyq(Resources resources, int i13) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i13, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i13);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i13 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean vdvldrhtss(ylkuphrtab ylkuphrtabVar) {
        return ylkuphrtabVar.iobyxmoadg("google.c.a.e");
    }

    private static int wflxmlrfwp(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && rgvfuqvkyq(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && rgvfuqvkyq(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i13 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i13 == 0 || !rgvfuqvkyq(resources, i13)) {
            try {
                i13 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e13) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e13);
            }
        }
        return (i13 == 0 || !rgvfuqvkyq(resources, i13)) ? R.drawable.sym_def_app_icon : i13;
    }

    public static iobyxmoadg wkgbmnqykc(Context context, Context context2, ylkuphrtab ylkuphrtabVar, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        androidx.core.app.wflxmlrfwp.eablkybsjg eablkybsjgVar = new androidx.core.app.wflxmlrfwp.eablkybsjg(context2, str);
        String strAgtfadlqog = ylkuphrtabVar.agtfadlqog(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strAgtfadlqog)) {
            eablkybsjgVar.btonecajqb(strAgtfadlqog);
        }
        String strAgtfadlqog2 = ylkuphrtabVar.agtfadlqog(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strAgtfadlqog2)) {
            eablkybsjgVar.dxjokdxxww(strAgtfadlqog2);
            eablkybsjgVar.jyumaefscl(new androidx.core.app.wflxmlrfwp.ppxfxbqfkf().nufgyqmvbu(strAgtfadlqog2));
        }
        eablkybsjgVar.zdlpuopuiu(wflxmlrfwp(packageManager, resources, packageName, ylkuphrtabVar.rgvfuqvkyq("gcm.n.icon"), bundle));
        Uri uriAgtfadlqog = agtfadlqog(packageName, ylkuphrtabVar, resources);
        if (uriAgtfadlqog != null) {
            eablkybsjgVar.yggfygwlhe(uriAgtfadlqog);
        }
        eablkybsjgVar.nufgyqmvbu(iobyxmoadg(context, ylkuphrtabVar, packageName, packageManager));
        PendingIntent pendingIntentZoijcleaow = zoijcleaow(context, context2, ylkuphrtabVar);
        if (pendingIntentZoijcleaow != null) {
            eablkybsjgVar.draadjrbmk(pendingIntentZoijcleaow);
        }
        Integer numNufgyqmvbu = nufgyqmvbu(context2, ylkuphrtabVar.rgvfuqvkyq("gcm.n.color"), bundle);
        if (numNufgyqmvbu != null) {
            eablkybsjgVar.lqeggnwhkg(numNufgyqmvbu.intValue());
        }
        eablkybsjgVar.eablkybsjg(!ylkuphrtabVar.iobyxmoadg("gcm.n.sticky"));
        eablkybsjgVar.rgvfuqvkyq(ylkuphrtabVar.iobyxmoadg("gcm.n.local_only"));
        String strRgvfuqvkyq = ylkuphrtabVar.rgvfuqvkyq("gcm.n.ticker");
        if (strRgvfuqvkyq != null) {
            eablkybsjgVar.iwizpuwonk(strRgvfuqvkyq);
        }
        Integer numWflxmlrfwp = ylkuphrtabVar.wflxmlrfwp();
        if (numWflxmlrfwp != null) {
            eablkybsjgVar.oxmwwwfdhm(numWflxmlrfwp.intValue());
        }
        Integer numOxmwwwfdhm = ylkuphrtabVar.oxmwwwfdhm();
        if (numOxmwwwfdhm != null) {
            eablkybsjgVar.esjtqupxsv(numOxmwwwfdhm.intValue());
        }
        Integer numDraadjrbmk = ylkuphrtabVar.draadjrbmk();
        if (numDraadjrbmk != null) {
            eablkybsjgVar.vdvldrhtss(numDraadjrbmk.intValue());
        }
        Long lBtonecajqb = ylkuphrtabVar.btonecajqb("gcm.n.event_time");
        if (lBtonecajqb != null) {
            eablkybsjgVar.kcexrzcfyt(true);
            eablkybsjgVar.lereixgezr(lBtonecajqb.longValue());
        }
        long[] jArrVdvldrhtss = ylkuphrtabVar.vdvldrhtss();
        if (jArrVdvldrhtss != null) {
            eablkybsjgVar.cqumvgiudr(jArrVdvldrhtss);
        }
        int[] iArrEablkybsjg = ylkuphrtabVar.eablkybsjg();
        if (iArrEablkybsjg != null) {
            eablkybsjgVar.ojitshcjhn(iArrEablkybsjg[0], iArrEablkybsjg[1], iArrEablkybsjg[2]);
        }
        eablkybsjgVar.gtknphoqwx(dxjokdxxww(ylkuphrtabVar));
        return new iobyxmoadg(eablkybsjgVar, ojitshcjhn(ylkuphrtabVar), 0);
    }

    private static PendingIntent zoijcleaow(Context context, Context context2, ylkuphrtab ylkuphrtabVar) {
        if (vdvldrhtss(ylkuphrtabVar)) {
            return ppxfxbqfkf(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(ylkuphrtabVar.cqumvgiudr()));
        }
        return null;
    }
}

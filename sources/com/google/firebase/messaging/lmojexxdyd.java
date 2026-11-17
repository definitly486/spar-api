package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Tasks;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lmojexxdyd {
    static String agtfadlqog(Bundle bundle) {
        return (bundle == null || !ylkuphrtab.zdlpuopuiu(bundle)) ? "data" : "display";
    }

    private static int btonecajqb(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static boolean cdpycssgdh(Intent intent) {
        if (intent == null || yggfygwlhe(intent)) {
            return false;
        }
        return yadqdtsiqt(intent.getExtras());
    }

    public static void cqumvgiudr(Bundle bundle) {
        zynmafqrjb(bundle);
        pmvmpeiblj("_no", bundle);
    }

    static String draadjrbmk(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static String dxjokdxxww(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String eablkybsjg(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static void esjtqupxsv(Intent intent) {
        if (cdpycssgdh(intent)) {
            pmvmpeiblj("_nr", intent.getExtras());
        }
        if (istkbnxepw(intent)) {
            lereixgezr(bd.iobyxmoadg.zoijcleaow.MESSAGE_DELIVERED, intent, FirebaseMessaging.yggfygwlhe());
        }
    }

    static int gtknphoqwx(Bundle bundle) {
        int iRgvfuqvkyq = rgvfuqvkyq(bundle);
        if (iRgvfuqvkyq == 2) {
            return 5;
        }
        return iRgvfuqvkyq == 1 ? 10 : 0;
    }

    static String gxszxtbevo(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(com.google.firebase.installations.ppxfxbqfkf.vdvldrhtss(com.google.firebase.gxszxtbevo.draadjrbmk()).getId());
        } catch (InterruptedException | ExecutionException e13) {
            throw new RuntimeException(e13);
        }
    }

    static boolean iobyxmoadg() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.gxszxtbevo.draadjrbmk();
            Context contextGtknphoqwx = com.google.firebase.gxszxtbevo.draadjrbmk().gtknphoqwx();
            SharedPreferences sharedPreferences = contextGtknphoqwx.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextGtknphoqwx.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextGtknphoqwx.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean istkbnxepw(Intent intent) {
        if (intent == null || yggfygwlhe(intent)) {
            return false;
        }
        return iobyxmoadg();
    }

    public static void iwizpuwonk(Intent intent) {
        pmvmpeiblj("_nf", intent.getExtras());
    }

    public static void jyumaefscl(Intent intent) {
        pmvmpeiblj("_nd", intent.getExtras());
    }

    static int kcexrzcfyt(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    private static void lereixgezr(bd.iobyxmoadg.zoijcleaow zoijcleaowVar, Intent intent, o9.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        bd.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(zoijcleaowVar, intent);
        if (iobyxmoadgVarZoijcleaow == null) {
            return;
        }
        try {
            btonecajqbVar.iobyxmoadg("FCM_CLIENT_EVENT_LOGGING", bd.zoijcleaow.class, o9.ppxfxbqfkf.zoijcleaow("proto"), new o9.nufgyqmvbu() { // from class: com.google.firebase.messaging.iozdgvuglv
                @Override // o9.nufgyqmvbu
                public final Object apply(Object obj) {
                    return ((bd.zoijcleaow) obj).ppxfxbqfkf();
                }
            }).zoijcleaow(o9.wkgbmnqykc.lqeggnwhkg(bd.zoijcleaow.zoijcleaow().zoijcleaow(iobyxmoadgVarZoijcleaow).iobyxmoadg(), o9.lqeggnwhkg.zoijcleaow(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e13) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e13);
        }
    }

    static String lqeggnwhkg(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String nufgyqmvbu(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String ojitshcjhn() {
        return com.google.firebase.gxszxtbevo.draadjrbmk().gtknphoqwx().getPackageName();
    }

    static String oxmwwwfdhm(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static void pmvmpeiblj(String str, Bundle bundle) {
        try {
            com.google.firebase.gxszxtbevo.draadjrbmk();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strWkgbmnqykc = wkgbmnqykc(bundle);
            if (strWkgbmnqykc != null) {
                bundle2.putString("_nmid", strWkgbmnqykc);
            }
            String strEablkybsjg = eablkybsjg(bundle);
            if (strEablkybsjg != null) {
                bundle2.putString("_nmn", strEablkybsjg);
            }
            String strDxjokdxxww = dxjokdxxww(bundle);
            if (!TextUtils.isEmpty(strDxjokdxxww)) {
                bundle2.putString("label", strDxjokdxxww);
            }
            String strLqeggnwhkg = lqeggnwhkg(bundle);
            if (!TextUtils.isEmpty(strLqeggnwhkg)) {
                bundle2.putString("message_channel", strLqeggnwhkg);
            }
            String strOxmwwwfdhm = oxmwwwfdhm(bundle);
            if (strOxmwwwfdhm != null) {
                bundle2.putString("_nt", strOxmwwwfdhm);
            }
            String strDraadjrbmk = draadjrbmk(bundle);
            if (strDraadjrbmk != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strDraadjrbmk));
                } catch (NumberFormatException e13) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e13);
                }
            }
            String strZdlpuopuiu = zdlpuopuiu(bundle);
            if (strZdlpuopuiu != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strZdlpuopuiu));
                } catch (NumberFormatException e14) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e14);
                }
            }
            String strAgtfadlqog = agtfadlqog(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strAgtfadlqog);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(com.google.firebase.gxszxtbevo.draadjrbmk().btonecajqb(sb.iobyxmoadg.class));
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    static String ppxfxbqfkf(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static int rgvfuqvkyq(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return btonecajqb(string);
    }

    static long vdvldrhtss(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing project number", e13);
            }
        }
        com.google.firebase.gxszxtbevo gxszxtbevoVarDraadjrbmk = com.google.firebase.gxszxtbevo.draadjrbmk();
        String strWkgbmnqykc = gxszxtbevoVarDraadjrbmk.agtfadlqog().wkgbmnqykc();
        if (strWkgbmnqykc != null) {
            try {
                return Long.parseLong(strWkgbmnqykc);
            } catch (NumberFormatException e14) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e14);
            }
        }
        String strPpxfxbqfkf = gxszxtbevoVarDraadjrbmk.agtfadlqog().ppxfxbqfkf();
        if (strPpxfxbqfkf.startsWith("1:")) {
            String[] strArrSplit = strPpxfxbqfkf.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e15) {
                Log.w("FirebaseMessaging", "error parsing app ID", e15);
            }
        } else {
            try {
                return Long.parseLong(strPpxfxbqfkf);
            } catch (NumberFormatException e16) {
                Log.w("FirebaseMessaging", "error parsing app ID", e16);
            }
        }
        return 0L;
    }

    static bd.iobyxmoadg.ppxfxbqfkf wflxmlrfwp(Bundle bundle) {
        return (bundle == null || !ylkuphrtab.zdlpuopuiu(bundle)) ? bd.iobyxmoadg.ppxfxbqfkf.DATA_MESSAGE : bd.iobyxmoadg.ppxfxbqfkf.DISPLAY_NOTIFICATION;
    }

    static String wkgbmnqykc(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static boolean yadqdtsiqt(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    private static boolean yggfygwlhe(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    static String zdlpuopuiu(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    static bd.iobyxmoadg zoijcleaow(bd.iobyxmoadg.zoijcleaow zoijcleaowVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        bd.iobyxmoadg.C0274iobyxmoadg c0274iobyxmoadgBtonecajqb = bd.iobyxmoadg.rgvfuqvkyq().agtfadlqog(kcexrzcfyt(extras)).eablkybsjg(zoijcleaowVar).gxszxtbevo(gxszxtbevo(extras)).dxjokdxxww(ojitshcjhn()).draadjrbmk(bd.iobyxmoadg.wkgbmnqykc.ANDROID).nufgyqmvbu(wflxmlrfwp(extras)).btonecajqb(gtknphoqwx(extras));
        String strNufgyqmvbu = nufgyqmvbu(extras);
        if (strNufgyqmvbu != null) {
            c0274iobyxmoadgBtonecajqb.lqeggnwhkg(strNufgyqmvbu);
        }
        String strOxmwwwfdhm = oxmwwwfdhm(extras);
        if (strOxmwwwfdhm != null) {
            c0274iobyxmoadgBtonecajqb.wflxmlrfwp(strOxmwwwfdhm);
        }
        String strPpxfxbqfkf = ppxfxbqfkf(extras);
        if (strPpxfxbqfkf != null) {
            c0274iobyxmoadgBtonecajqb.ppxfxbqfkf(strPpxfxbqfkf);
        }
        String strDxjokdxxww = dxjokdxxww(extras);
        if (strDxjokdxxww != null) {
            c0274iobyxmoadgBtonecajqb.zoijcleaow(strDxjokdxxww);
        }
        String strEablkybsjg = eablkybsjg(extras);
        if (strEablkybsjg != null) {
            c0274iobyxmoadgBtonecajqb.wkgbmnqykc(strEablkybsjg);
        }
        long jVdvldrhtss = vdvldrhtss(extras);
        if (jVdvldrhtss > 0) {
            c0274iobyxmoadgBtonecajqb.gtknphoqwx(jVdvldrhtss);
        }
        return c0274iobyxmoadgBtonecajqb.iobyxmoadg();
    }

    private static void zynmafqrjb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        } else {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(com.google.firebase.gxszxtbevo.draadjrbmk().btonecajqb(sb.iobyxmoadg.class));
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        }
    }
}

package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Bundle f24521iobyxmoadg;

    public ylkuphrtab(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f24521iobyxmoadg = new Bundle(bundle);
    }

    private String iwizpuwonk(String str) {
        if (!this.f24521iobyxmoadg.containsKey(str) && str.startsWith("gcm.n.")) {
            String strJyumaefscl = jyumaefscl(str);
            if (this.f24521iobyxmoadg.containsKey(strJyumaefscl)) {
                return strJyumaefscl;
            }
        }
        return str;
    }

    private static String jyumaefscl(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private static boolean kcexrzcfyt(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    private static String lereixgezr(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    private static int wkgbmnqykc(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean yggfygwlhe(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static boolean zdlpuopuiu(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(jyumaefscl("gcm.n.e")));
    }

    public String agtfadlqog(Resources resources, String str, String str2) {
        String strRgvfuqvkyq = rgvfuqvkyq(str2);
        return !TextUtils.isEmpty(strRgvfuqvkyq) ? strRgvfuqvkyq : dxjokdxxww(resources, str, str2);
    }

    public Long btonecajqb(String str) {
        String strRgvfuqvkyq = rgvfuqvkyq(str);
        if (TextUtils.isEmpty(strRgvfuqvkyq)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strRgvfuqvkyq));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + lereixgezr(str) + "(" + strRgvfuqvkyq + ") into a long");
            return null;
        }
    }

    public Bundle cqumvgiudr() {
        Bundle bundle = new Bundle(this.f24521iobyxmoadg);
        for (String str : this.f24521iobyxmoadg.keySet()) {
            if (!kcexrzcfyt(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    Integer draadjrbmk() {
        Integer numZoijcleaow = zoijcleaow("gcm.n.notification_count");
        if (numZoijcleaow == null) {
            return null;
        }
        if (numZoijcleaow.intValue() >= 0) {
            return numZoijcleaow;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + numZoijcleaow + ". Skipping setting notificationCount.");
        return null;
    }

    public String dxjokdxxww(Resources resources, String str, String str2) {
        String strNufgyqmvbu = nufgyqmvbu(str2);
        if (TextUtils.isEmpty(strNufgyqmvbu)) {
            return null;
        }
        int identifier = resources.getIdentifier(strNufgyqmvbu, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", lereixgezr(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrLqeggnwhkg = lqeggnwhkg(str2);
        if (objArrLqeggnwhkg == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrLqeggnwhkg);
        } catch (MissingFormatArgumentException e13) {
            Log.w("NotificationParams", "Missing format argument for " + lereixgezr(str2) + ": " + Arrays.toString(objArrLqeggnwhkg) + " Default value will be used.", e13);
            return null;
        }
    }

    int[] eablkybsjg() {
        JSONArray jSONArrayPpxfxbqfkf = ppxfxbqfkf("gcm.n.light_settings");
        if (jSONArrayPpxfxbqfkf == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayPpxfxbqfkf.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = wkgbmnqykc(jSONArrayPpxfxbqfkf.optString(0));
            iArr[1] = jSONArrayPpxfxbqfkf.optInt(1);
            iArr[2] = jSONArrayPpxfxbqfkf.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e13) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayPpxfxbqfkf + ". " + e13.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayPpxfxbqfkf + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Bundle esjtqupxsv() {
        Bundle bundle = new Bundle(this.f24521iobyxmoadg);
        for (String str : this.f24521iobyxmoadg.keySet()) {
            if (yggfygwlhe(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public String gtknphoqwx() {
        return rgvfuqvkyq("gcm.n.android_channel_id");
    }

    public Uri gxszxtbevo() {
        String strRgvfuqvkyq = rgvfuqvkyq("gcm.n.link_android");
        if (TextUtils.isEmpty(strRgvfuqvkyq)) {
            strRgvfuqvkyq = rgvfuqvkyq("gcm.n.link");
        }
        if (TextUtils.isEmpty(strRgvfuqvkyq)) {
            return null;
        }
        return Uri.parse(strRgvfuqvkyq);
    }

    public boolean iobyxmoadg(String str) {
        String strRgvfuqvkyq = rgvfuqvkyq(str);
        return "1".equals(strRgvfuqvkyq) || Boolean.parseBoolean(strRgvfuqvkyq);
    }

    public Object[] lqeggnwhkg(String str) {
        JSONArray jSONArrayPpxfxbqfkf = ppxfxbqfkf(str + "_loc_args");
        if (jSONArrayPpxfxbqfkf == null) {
            return null;
        }
        int length = jSONArrayPpxfxbqfkf.length();
        String[] strArr = new String[length];
        for (int i13 = 0; i13 < length; i13++) {
            strArr[i13] = jSONArrayPpxfxbqfkf.optString(i13);
        }
        return strArr;
    }

    public String nufgyqmvbu(String str) {
        return rgvfuqvkyq(str + "_loc_key");
    }

    public String ojitshcjhn() {
        String strRgvfuqvkyq = rgvfuqvkyq("gcm.n.sound2");
        return TextUtils.isEmpty(strRgvfuqvkyq) ? rgvfuqvkyq("gcm.n.sound") : strRgvfuqvkyq;
    }

    Integer oxmwwwfdhm() {
        Integer numZoijcleaow = zoijcleaow("gcm.n.visibility");
        if (numZoijcleaow == null) {
            return null;
        }
        if (numZoijcleaow.intValue() >= -1 && numZoijcleaow.intValue() <= 1) {
            return numZoijcleaow;
        }
        Log.w("NotificationParams", "visibility is invalid: " + numZoijcleaow + ". Skipping setting visibility.");
        return null;
    }

    public JSONArray ppxfxbqfkf(String str) {
        String strRgvfuqvkyq = rgvfuqvkyq(str);
        if (TextUtils.isEmpty(strRgvfuqvkyq)) {
            return null;
        }
        try {
            return new JSONArray(strRgvfuqvkyq);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + lereixgezr(str) + ": " + strRgvfuqvkyq + ", falling back to default");
            return null;
        }
    }

    public String rgvfuqvkyq(String str) {
        return this.f24521iobyxmoadg.getString(iwizpuwonk(str));
    }

    public long[] vdvldrhtss() {
        JSONArray jSONArrayPpxfxbqfkf = ppxfxbqfkf("gcm.n.vibrate_timings");
        if (jSONArrayPpxfxbqfkf == null) {
            return null;
        }
        try {
            if (jSONArrayPpxfxbqfkf.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayPpxfxbqfkf.length();
            long[] jArr = new long[length];
            for (int i13 = 0; i13 < length; i13++) {
                jArr[i13] = jSONArrayPpxfxbqfkf.optLong(i13);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayPpxfxbqfkf + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    Integer wflxmlrfwp() {
        Integer numZoijcleaow = zoijcleaow("gcm.n.notification_priority");
        if (numZoijcleaow == null) {
            return null;
        }
        if (numZoijcleaow.intValue() >= -2 && numZoijcleaow.intValue() <= 2) {
            return numZoijcleaow;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + numZoijcleaow + ". Skipping setting notificationPriority.");
        return null;
    }

    public Integer zoijcleaow(String str) {
        String strRgvfuqvkyq = rgvfuqvkyq(str);
        if (TextUtils.isEmpty(strRgvfuqvkyq)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strRgvfuqvkyq));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + lereixgezr(str) + "(" + strRgvfuqvkyq + ") into an int");
            return null;
        }
    }
}

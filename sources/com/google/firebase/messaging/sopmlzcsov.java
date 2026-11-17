package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class sopmlzcsov {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final SharedPreferences f24479iobyxmoadg;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final long f24480wkgbmnqykc = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f24481iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final long f24482ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final String f24483zoijcleaow;

        private iobyxmoadg(String str, String str2, long j13) {
            this.f24481iobyxmoadg = str;
            this.f24483zoijcleaow = str2;
            this.f24482ppxfxbqfkf = j13;
        }

        static String iobyxmoadg(String str, String str2, long j13) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j13);
                return jSONObject.toString();
            } catch (JSONException e13) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e13);
                return null;
            }
        }

        static iobyxmoadg ppxfxbqfkf(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new iobyxmoadg(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new iobyxmoadg(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e13) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e13);
                return null;
            }
        }

        boolean zoijcleaow(String str) {
            return System.currentTimeMillis() > this.f24482ppxfxbqfkf + f24480wkgbmnqykc || !str.equals(this.f24483zoijcleaow);
        }
    }

    public sopmlzcsov(Context context) {
        this.f24479iobyxmoadg = context.getSharedPreferences("com.google.android.gms.appid", 0);
        iobyxmoadg(context, "com.google.android.gms.appid-no-backup");
    }

    private void iobyxmoadg(Context context, String str) {
        File file = new File(androidx.core.content.iobyxmoadg.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || gxszxtbevo()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            ppxfxbqfkf();
        } catch (IOException e13) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e13.getMessage());
            }
        }
    }

    private String zoijcleaow(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized iobyxmoadg eablkybsjg(String str, String str2) {
        return iobyxmoadg.ppxfxbqfkf(this.f24479iobyxmoadg.getString(zoijcleaow(str, str2), null));
    }

    public synchronized boolean gxszxtbevo() {
        return this.f24479iobyxmoadg.getAll().isEmpty();
    }

    public synchronized void lqeggnwhkg(String str, String str2, String str3, String str4) {
        String strIobyxmoadg = iobyxmoadg.iobyxmoadg(str3, str4, System.currentTimeMillis());
        if (strIobyxmoadg == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f24479iobyxmoadg.edit();
        editorEdit.putString(zoijcleaow(str, str2), strIobyxmoadg);
        editorEdit.commit();
    }

    public synchronized void ppxfxbqfkf() {
        this.f24479iobyxmoadg.edit().clear().commit();
    }

    public synchronized void wkgbmnqykc(String str, String str2) {
        String strZoijcleaow = zoijcleaow(str, str2);
        SharedPreferences.Editor editorEdit = this.f24479iobyxmoadg.edit();
        editorEdit.remove(strZoijcleaow);
        editorEdit.commit();
    }
}

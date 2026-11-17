package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb3.append("Received non-success response code ");
                        sb3.append(responseCode);
                        sb3.append(" from pinging URL: ");
                        sb3.append(str);
                        Log.w("HttpUrlPinger", sb3.toString());
                    }
                    httpURLConnection.disconnect();
                    zzi.zza();
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    throw th2;
                }
            } catch (IOException e13) {
                e = e13;
                String message = e.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb4.append("Error while pinging URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message);
                Log.w("HttpUrlPinger", sb4.toString(), e);
                zzi.zza();
            } catch (IndexOutOfBoundsException e14) {
                String message2 = e14.getMessage();
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb5.append("Error while parsing ping URL: ");
                sb5.append(str);
                sb5.append(". ");
                sb5.append(message2);
                Log.w("HttpUrlPinger", sb5.toString(), e14);
                zzi.zza();
            } catch (RuntimeException e15) {
                e = e15;
                String message3 = e.getMessage();
                StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb6.append("Error while pinging URL: ");
                sb6.append(str);
                sb6.append(". ");
                sb6.append(message3);
                Log.w("HttpUrlPinger", sb6.toString(), e);
                zzi.zza();
            }
        } catch (Throwable th3) {
            zzi.zza();
            throw th3;
        }
    }
}

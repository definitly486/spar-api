package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
class istkbnxepw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tc.zoijcleaow f24417eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final uc.eablkybsjg f24418gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f24419iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Rpc f24420ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tc.zoijcleaow f24421wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f24422zoijcleaow;

    istkbnxepw(com.google.firebase.gxszxtbevo gxszxtbevoVar, wwaezpbzkn wwaezpbzknVar, tc.zoijcleaow zoijcleaowVar, tc.zoijcleaow zoijcleaowVar2, uc.eablkybsjg eablkybsjgVar) {
        this(gxszxtbevoVar, wwaezpbzknVar, new Rpc(gxszxtbevoVar.gtknphoqwx()), zoijcleaowVar, zoijcleaowVar2, eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String btonecajqb(Task task) {
        return nufgyqmvbu((Bundle) task.getResult(IOException.class));
    }

    static boolean dxjokdxxww(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private String eablkybsjg() {
        try {
            return zoijcleaow(MessageDigest.getInstance("SHA-1").digest(this.f24419iobyxmoadg.wflxmlrfwp().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private void gtknphoqwx(String str, String str2, Bundle bundle) {
        rc.btonecajqb.iobyxmoadg iobyxmoadgVarZoijcleaow;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f24419iobyxmoadg.agtfadlqog().ppxfxbqfkf());
        bundle.putString("gmsv", Integer.toString(this.f24422zoijcleaow.wkgbmnqykc()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f24422zoijcleaow.iobyxmoadg());
        bundle.putString("app_ver_name", this.f24422zoijcleaow.zoijcleaow());
        bundle.putString("firebase-app-name-hash", eablkybsjg());
        try {
            String strZoijcleaow = ((com.google.firebase.installations.gxszxtbevo) Tasks.await(this.f24418gxszxtbevo.iobyxmoadg(false))).zoijcleaow();
            if (TextUtils.isEmpty(strZoijcleaow)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strZoijcleaow);
            }
        } catch (InterruptedException e13) {
            e = e13;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e14) {
            e = e14;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f24418gxszxtbevo.getId()));
        bundle.putString("cliv", "fcm-24.0.3");
        rc.btonecajqb btonecajqbVar = (rc.btonecajqb) this.f24417eablkybsjg.get();
        od.dxjokdxxww dxjokdxxwwVar = (od.dxjokdxxww) this.f24421wkgbmnqykc.get();
        if (btonecajqbVar == null || dxjokdxxwwVar == null || (iobyxmoadgVarZoijcleaow = btonecajqbVar.zoijcleaow("fire-iid")) == rc.btonecajqb.iobyxmoadg.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(iobyxmoadgVarZoijcleaow.wkgbmnqykc()));
        bundle.putString("Firebase-Client", dxjokdxxwwVar.getUserAgent());
    }

    private String nufgyqmvbu(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private Task wflxmlrfwp(String str, String str2, Bundle bundle) {
        try {
            gtknphoqwx(str, str2, bundle);
            return this.f24420ppxfxbqfkf.send(bundle);
        } catch (InterruptedException | ExecutionException e13) {
            return Tasks.forException(e13);
        }
    }

    private Task wkgbmnqykc(Task task) {
        return task.continueWith(new l5.zoijcleaow(), new Continuation() { // from class: com.google.firebase.messaging.zynmafqrjb
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.f24525iobyxmoadg.btonecajqb(task2);
            }
        });
    }

    private static String zoijcleaow(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    Task agtfadlqog(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return wkgbmnqykc(wflxmlrfwp(str, "/topics/" + str2, bundle));
    }

    Task draadjrbmk(boolean z13) {
        return this.f24420ppxfxbqfkf.setRetainProxiedNotifications(z13);
    }

    Task gxszxtbevo() {
        return this.f24420ppxfxbqfkf.getProxiedNotificationData();
    }

    Task lqeggnwhkg() {
        return wkgbmnqykc(wflxmlrfwp(wwaezpbzkn.ppxfxbqfkf(this.f24419iobyxmoadg), "*", new Bundle()));
    }

    Task ojitshcjhn(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return wkgbmnqykc(wflxmlrfwp(str, "/topics/" + str2, bundle));
    }

    Task ppxfxbqfkf() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return wkgbmnqykc(wflxmlrfwp(wwaezpbzkn.ppxfxbqfkf(this.f24419iobyxmoadg), "*", bundle));
    }

    istkbnxepw(com.google.firebase.gxszxtbevo gxszxtbevoVar, wwaezpbzkn wwaezpbzknVar, Rpc rpc, tc.zoijcleaow zoijcleaowVar, tc.zoijcleaow zoijcleaowVar2, uc.eablkybsjg eablkybsjgVar) {
        this.f24419iobyxmoadg = gxszxtbevoVar;
        this.f24422zoijcleaow = wwaezpbzknVar;
        this.f24420ppxfxbqfkf = rpc;
        this.f24421wkgbmnqykc = zoijcleaowVar;
        this.f24417eablkybsjg = zoijcleaowVar2;
        this.f24418gxszxtbevo = eablkybsjgVar;
    }
}

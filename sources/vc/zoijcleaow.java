package vc;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.gxszxtbevo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String[] f116488ppxfxbqfkf = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f116489iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f116490zoijcleaow;

    public zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        this.f116489iobyxmoadg = gxszxtbevoVar.gtknphoqwx().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f116490zoijcleaow = zoijcleaow(gxszxtbevoVar);
    }

    private PublicKey eablkybsjg(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e13) {
            Log.w("ContentValues", "Invalid key stored " + e13);
            return null;
        }
    }

    private String iobyxmoadg(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private String lqeggnwhkg() {
        String string;
        synchronized (this.f116489iobyxmoadg) {
            string = this.f116489iobyxmoadg.getString("|S|id", null);
        }
        return string;
    }

    private String nufgyqmvbu() {
        synchronized (this.f116489iobyxmoadg) {
            try {
                String string = this.f116489iobyxmoadg.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyEablkybsjg = eablkybsjg(string);
                if (publicKeyEablkybsjg == null) {
                    return null;
                }
                return ppxfxbqfkf(publicKeyEablkybsjg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static String ppxfxbqfkf(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String wkgbmnqykc(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        String strWkgbmnqykc = gxszxtbevoVar.agtfadlqog().wkgbmnqykc();
        if (strWkgbmnqykc != null) {
            return strWkgbmnqykc;
        }
        String strPpxfxbqfkf = gxszxtbevoVar.agtfadlqog().ppxfxbqfkf();
        if (!strPpxfxbqfkf.startsWith("1:") && !strPpxfxbqfkf.startsWith("2:")) {
            return strPpxfxbqfkf;
        }
        String[] strArrSplit = strPpxfxbqfkf.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public String dxjokdxxww() {
        synchronized (this.f116489iobyxmoadg) {
            try {
                for (String str : f116488ppxfxbqfkf) {
                    String string = this.f116489iobyxmoadg.getString(iobyxmoadg(this.f116490zoijcleaow, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = wkgbmnqykc(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String gxszxtbevo() {
        synchronized (this.f116489iobyxmoadg) {
            try {
                String strLqeggnwhkg = lqeggnwhkg();
                if (strLqeggnwhkg != null) {
                    return strLqeggnwhkg;
                }
                return nufgyqmvbu();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

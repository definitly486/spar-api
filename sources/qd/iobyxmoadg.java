package qd;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.gxszxtbevo;
import com.google.firebase.remoteconfig.internal.lqeggnwhkg;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    gxszxtbevo f78590iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    gxszxtbevo f78591zoijcleaow;

    iobyxmoadg(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
        this.f78590iobyxmoadg = gxszxtbevoVar;
        this.f78591zoijcleaow = gxszxtbevoVar2;
    }

    public static iobyxmoadg iobyxmoadg(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
        return new iobyxmoadg(gxszxtbevoVar, gxszxtbevoVar2);
    }

    private String ppxfxbqfkf(String str) {
        String strWkgbmnqykc = wkgbmnqykc(this.f78590iobyxmoadg, str);
        if (strWkgbmnqykc != null) {
            return strWkgbmnqykc;
        }
        String strWkgbmnqykc2 = wkgbmnqykc(this.f78591zoijcleaow, str);
        return strWkgbmnqykc2 != null ? strWkgbmnqykc2 : "";
    }

    private static String wkgbmnqykc(gxszxtbevo gxszxtbevoVar, String str) {
        lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo();
        if (lqeggnwhkgVarGxszxtbevo == null) {
            return null;
        }
        try {
            return lqeggnwhkgVarGxszxtbevo.lqeggnwhkg().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    sd.eablkybsjg zoijcleaow(lqeggnwhkg lqeggnwhkgVar) throws FirebaseRemoteConfigClientException {
        JSONArray jSONArrayBtonecajqb = lqeggnwhkgVar.btonecajqb();
        long jGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
        HashSet hashSet = new HashSet();
        for (int i13 = 0; i13 < jSONArrayBtonecajqb.length(); i13++) {
            try {
                JSONObject jSONObject = jSONArrayBtonecajqb.getJSONObject(i13);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(sd.wkgbmnqykc.iobyxmoadg().wkgbmnqykc(string).gxszxtbevo(jSONObject.getString("variantId")).zoijcleaow(strOptString).ppxfxbqfkf(ppxfxbqfkf(strOptString)).eablkybsjg(jGtknphoqwx).iobyxmoadg());
            } catch (JSONException e13) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e13);
            }
        }
        return sd.eablkybsjg.iobyxmoadg(hashSet);
    }
}

package androidx.media3.exoplayer.drm;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class iobyxmoadg {
    public static byte[] iobyxmoadg(byte[] bArr) {
        return stevsuqkhv.f123602iobyxmoadg >= 27 ? bArr : stevsuqkhv.opjhrmiecq(ppxfxbqfkf(stevsuqkhv.lmojexxdyd(bArr)));
    }

    private static String ppxfxbqfkf(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String wkgbmnqykc(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] zoijcleaow(byte[] bArr) {
        if (stevsuqkhv.f123602iobyxmoadg >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(stevsuqkhv.lmojexxdyd(bArr));
            StringBuilder sb3 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                if (i13 != 0) {
                    sb3.append(StringUtils.COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i13);
                sb3.append("{\"k\":\"");
                sb3.append(wkgbmnqykc(jSONObject2.getString("k")));
                sb3.append("\",\"kid\":\"");
                sb3.append(wkgbmnqykc(jSONObject2.getString("kid")));
                sb3.append("\",\"kty\":\"");
                sb3.append(jSONObject2.getString("kty"));
                sb3.append("\"}");
            }
            sb3.append("]}");
            return stevsuqkhv.opjhrmiecq(sb3.toString());
        } catch (JSONException e13) {
            kcexrzcfyt.wkgbmnqykc("ClearKeyUtil", "Failed to adjust response data: " + stevsuqkhv.lmojexxdyd(bArr), e13);
            return bArr;
        }
    }
}

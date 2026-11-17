package di0;

import gg.kcexrzcfyt;
import kotlin.jvm.internal.zdlpuopuiu;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import ru.myspar.networkpanel.impl.domain.model.NetworkPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    private static final String iobyxmoadg(String str) {
        Object objWkgbmnqykc;
        String str2;
        String string;
        String string2;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            if ((zoijcleaow(str) ? str : null) != null) {
                Object objNextValue = new JSONTokener(str).nextValue();
                if (objNextValue instanceof JSONObject) {
                    string2 = ((JSONObject) objNextValue).toString(1);
                } else {
                    JSONArray jSONArray = objNextValue instanceof JSONArray ? (JSONArray) objNextValue : null;
                    if (jSONArray == null || (string = jSONArray.toString(1)) == null) {
                        zdlpuopuiu.nufgyqmvbu(objNextValue, "null cannot be cast to non-null type kotlin.String");
                        str2 = (String) objNextValue;
                    } else {
                        str2 = string;
                    }
                }
                if (str2 == null) {
                    str2 = string2;
                    str2 = str;
                }
            } else {
                str2 = string2;
                str2 = str;
            }
            str2 = string2;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(str2);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Object obj = str;
        if (!kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            obj = objWkgbmnqykc;
        }
        return (String) obj;
    }

    public static final NetworkPayload ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return new NetworkPayload(ppxfxbqfkfVar.iobyxmoadg(), iobyxmoadg(ppxfxbqfkfVar.zoijcleaow()));
    }

    private static final boolean zoijcleaow(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                new JSONArray(str);
                return true;
            }
        } catch (JSONException unused2) {
            return false;
        }
    }
}

package nb2;

import java.util.ArrayList;
import java.util.Iterator;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class okpsazkaxt {
    public static ikoacuggdj iobyxmoadg(String uuid, String jsonString) throws JSONException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuid, "uuid");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString(ExternalMetricsManagerImpl.NAME);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "jsonObject.getString(NAME_KEY)");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jSONObject2, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(next, jSONObject2.get(next).toString()));
        }
        return new ikoacuggdj(uuid, string, hg.tzroggbefp.kcexrzcfyt(arrayList));
    }
}

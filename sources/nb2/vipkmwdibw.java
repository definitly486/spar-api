package nb2;

import java.util.Map;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class vipkmwdibw {
    public static String iobyxmoadg(mb2.ppxfxbqfkf model) throws JSONException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ExternalMetricsManagerImpl.NAME, model.zoijcleaow());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : model.iobyxmoadg().entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put("time", model.ppxfxbqfkf());
        String string = jSONObject.toString(0);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "jsonObject.toString(0)");
        return string;
    }
}

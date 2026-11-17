package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Rl implements NetworkResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yl f46471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3801r3 f46472b;

    public Rl() {
        this(new Yl(), new C3801r3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3470dm handle(ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!io.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f46472b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Yl yl2 = this.f46471a;
                yl2.getClass();
                C3470dm c3470dm = new C3470dm();
                try {
                    yl2.f46827i.getClass();
                    Ab ab3 = new Ab(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = ab3.optJSONObject("device_id");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c3470dm.f47114h = strOptString2;
                    c3470dm.f47115i = strOptString;
                    yl2.a(c3470dm, ab3);
                    c3470dm.f47107a = TextUtils.isEmpty(c3470dm.f47115i) ? 1 : 2;
                } catch (Throwable unused) {
                    c3470dm = new C3470dm();
                    c3470dm.f47107a = 1;
                }
                if (2 == c3470dm.f47107a) {
                    return c3470dm;
                }
            }
        }
        return null;
    }

    public Rl(Yl yl2, C3801r3 c3801r3) {
        this.f46471a = yl2;
        this.f46472b = c3801r3;
    }
}

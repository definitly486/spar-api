package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3413bh extends AbstractC3490eh {
    public C3413bh(C3828s5 c3828s5) {
        super(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        String value = c3655l6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            uo uoVar = this.f47182a.f48049t;
            synchronized (uoVar) {
                uoVar.c(uoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c3655l6.f47644n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        uo uoVar = this.f47182a.f48049t;
        synchronized (uoVar) {
            uoVar.a(uoVar.a() + 1);
        }
        this.f47182a.y();
        C3508f9 c3508f9 = this.f47182a.f48041l;
        if (c3508f9.f47215c == null) {
            c3508f9.a();
        }
        C3559h9 c3559h9 = c3508f9.f47215c;
        c3559h9.getClass();
        c3559h9.f47378b = new HashSet();
        c3559h9.f47380d = 0;
        C3559h9 c3559h10 = c3508f9.f47215c;
        c3559h10.f47377a = true;
        C3633k9 c3633k9 = c3508f9.f47214b;
        IBinaryDataHelper iBinaryDataHelper = c3633k9.f47584c;
        C3608j9 c3608j9 = c3633k9.f47583b;
        c3633k9.f47582a.getClass();
        P9 p9A = C3584i9.a(c3559h10);
        c3608j9.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(p9A));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C3800r2 c3800r2 = this.f47182a.s().f47253z;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String strDecode = Uri.decode(str2);
                        int iIndexOf = strDecode.indexOf("=");
                        if (iIndexOf >= 0 && a(Uri.decode(strDecode.substring(0, iIndexOf)), Uri.decode(strDecode.substring(iIndexOf + 1)), c3800r2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C3800r2 c3800r2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c3800r2 == null) {
            return false;
        }
        for (Pair pair : c3800r2.f47957a) {
            if (io.a(pair.first, str) && ((obj = pair.second) == null || ((C3776q2) obj).f47909a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}

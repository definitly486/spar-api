package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Ff implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Df f45818a = new Df();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4013zf fromModel(Ef ef2) {
        C4013zf c4013zf = new C4013zf();
        if (!TextUtils.isEmpty(ef2.f45727a)) {
            c4013zf.f48607a = ef2.f45727a;
        }
        c4013zf.f48608b = ef2.f45728b.toString();
        c4013zf.f48609c = ef2.f45729c;
        c4013zf.f48610d = ef2.f45730d;
        c4013zf.f48611e = this.f45818a.fromModel(ef2.f45731e).intValue();
        return c4013zf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ef toModel(C4013zf c4013zf) {
        JSONObject jSONObject;
        String str = c4013zf.f48607a;
        String str2 = c4013zf.f48608b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new Ef(str, jSONObject, c4013zf.f48609c, c4013zf.f48610d, this.f45818a.toModel(Integer.valueOf(c4013zf.f48611e)));
    }
}

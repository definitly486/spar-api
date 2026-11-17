package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3739of implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Df f47832a;

    public C3739of() {
        this(new Df());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Af fromModel(C3789qf c3789qf) {
        Af af2 = new Af();
        if (!TextUtils.isEmpty(c3789qf.f47922a)) {
            af2.f45465a = c3789qf.f47922a;
        }
        af2.f45466b = c3789qf.f47923b.toString();
        af2.f45467c = this.f47832a.fromModel(c3789qf.f47924c).intValue();
        return af2;
    }

    public C3739of(Df df2) {
        this.f47832a = df2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3789qf toModel(Af af2) {
        JSONObject jSONObject;
        String str = af2.f45465a;
        String str2 = af2.f45466b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C3789qf(str, jSONObject, this.f47832a.toModel(Integer.valueOf(af2.f45467c)));
    }
}

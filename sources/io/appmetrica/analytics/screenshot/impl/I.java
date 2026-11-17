package io.appmetrica.analytics.screenshot.impl;

import hg.jyumaefscl;
import hg.stevsuqkhv;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import zg.btonecajqb;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f48930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f48931b;

    /* JADX WARN: Multi-variable type inference failed */
    public I() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G parse(JSONObject jSONObject) {
        K k13;
        M m13;
        N n13;
        boolean zExtractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC4035n.f49004a);
        V v13 = this.f48930a;
        U u13 = this.f48931b;
        u13.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screenshot");
        if (jSONObjectOptJSONObject == null) {
            n13 = new N();
            n13.f48943a = new K();
            n13.f48944b = new M();
            L l13 = new L();
            l13.f48938c = AbstractC4035n.f49005b;
            n13.f48945c = l13;
        } else {
            N n14 = new N();
            u13.f48953a.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("api_captor_config");
            L l14 = null;
            if (jSONObjectOptJSONObject2 == null) {
                k13 = null;
            } else {
                k13 = new K();
                Boolean boolOptBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject2, "enabled");
                if (boolOptBooleanOrNull != null) {
                    k13.f48934a = boolOptBooleanOrNull.booleanValue();
                }
            }
            if (k13 != null) {
                n14.f48943a = k13;
            }
            u13.f48954b.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("service_captor_config");
            if (jSONObjectOptJSONObject3 == null) {
                m13 = null;
            } else {
                m13 = new M();
                Boolean boolOptBooleanOrNull2 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject3, "enabled");
                if (boolOptBooleanOrNull2 != null) {
                    m13.f48940a = boolOptBooleanOrNull2.booleanValue();
                }
                Long lOptLongOrNull = JsonUtils.optLongOrNull(jSONObjectOptJSONObject3, "delay_seconds");
                if (lOptLongOrNull != null) {
                    m13.f48941b = lOptLongOrNull.longValue();
                }
            }
            if (m13 != null) {
                n14.f48944b = m13;
            }
            u13.f48955c.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("content_observer_captor_config");
            if (jSONObjectOptJSONObject4 != null) {
                l14 = new L();
                Boolean boolOptBooleanOrNull3 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject4, "enabled");
                if (boolOptBooleanOrNull3 != null) {
                    l14.f48936a = boolOptBooleanOrNull3.booleanValue();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("media_store_column_names");
                if (jSONArrayOptJSONArray != null) {
                    btonecajqb btonecajqbVarJyumaefscl = gtknphoqwx.jyumaefscl(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(btonecajqbVarJyumaefscl, 10));
                    Iterator it = btonecajqbVarJyumaefscl.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((stevsuqkhv) it).iobyxmoadg()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    l14.f48938c = (String[]) array;
                }
                Long lOptLongOrNull2 = JsonUtils.optLongOrNull(jSONObjectOptJSONObject4, "detect_window_seconds");
                if (lOptLongOrNull2 != null) {
                    l14.f48937b = lOptLongOrNull2.longValue();
                }
            }
            if (l14 != null) {
                n14.f48945c = l14;
            }
            n13 = n14;
        }
        return new G(zExtractFeature, v13.toModel(n13));
    }

    public final G b(JSONObject jSONObject) {
        return (G) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (G) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public I(V v13, U u13) {
        this.f48930a = v13;
        this.f48931b = u13;
    }

    public /* synthetic */ I(V v13, U u13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new V(null, null, null, 7, null) : v13, (i13 & 2) != 0 ? new U() : u13);
    }
}

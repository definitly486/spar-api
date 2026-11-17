package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3432ca extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3458da f47016b;

    public C3432ca(C3828s5 c3828s5, TimeProvider timeProvider) {
        super(c3828s5);
        this.f47016b = new C3458da(c3828s5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        long jOptLong;
        C3458da c3458da = this.f47016b;
        W9 w13 = c3458da.f47097a.s().C;
        Long lValueOf = w13 != null ? Long.valueOf(w13.f46708a) : null;
        if (lValueOf != null) {
            uo uoVar = c3458da.f47097a.f48049t;
            synchronized (uoVar) {
                jOptLong = uoVar.f48216a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = c3458da.f47098b.currentTimeMillis();
                c3458da.f47097a.f48049t.a(jOptLong);
            }
            if (c3458da.f47098b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                V9 v13 = (V9) MessageNano.mergeFrom(new V9(), c3655l6.getValueBytes());
                int i13 = v13.f46665a;
                String str = new String(v13.f46666b, mj.wkgbmnqykc.f67326zoijcleaow);
                String str2 = this.f47016b.f47097a.f48032c.j().get(Integer.valueOf(i13));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f47182a.f48042m.info("Ignoring attribution of type `" + AbstractC3509fa.a(i13) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C3458da c3458da2 = this.f47016b;
                Map<Integer, String> mapJ = c3458da2.f47097a.f48032c.j();
                mapJ.put(Integer.valueOf(i13), str);
                c3458da2.f47097a.f48032c.a(mapJ);
                this.f47182a.f48042m.info("Handling attribution of type `" + AbstractC3509fa.a(i13) + '`', new Object[0]);
                return false;
            }
        }
        this.f47182a.f48042m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}

package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class P7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M7 f46376a;

    /* JADX WARN: Multi-variable type inference failed */
    public P7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(O7 o13) {
        ContentValues contentValues = new ContentValues();
        Long l13 = o13.f46310a;
        if (l13 != null) {
            contentValues.put("id", Long.valueOf(l13.longValue()));
        }
        Wk wk2 = o13.f46311b;
        if (wk2 != null) {
            contentValues.put("type", Integer.valueOf(wk2.f46734a));
        }
        String str = o13.f46312c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        M7 m13 = this.f46376a;
        contentValues.put("session_description", MessageNano.toByteArray(m13.f46228a.fromModel(o13.f46313d)));
        return contentValues;
    }

    public P7(M7 m13) {
        this.f46376a = m13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ P7(M7 m13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new M7(null, 1, 0 == true ? 1 : 0) : m13);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O7 toModel(ContentValues contentValues) {
        Wk wk2;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            wk2 = Wk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        return new O7(asLong, wk2, contentValues.getAsString("report_request_parameters"), this.f46376a.toModel(contentValues.getAsByteArray("session_description")));
    }
}

package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class B7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3980y7 f45495a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(A7 a13) {
        ContentValues contentValues = new ContentValues();
        Long l13 = a13.f45442a;
        if (l13 != null) {
            contentValues.put("session_id", Long.valueOf(l13.longValue()));
        }
        Wk wk2 = a13.f45443b;
        if (wk2 != null) {
            contentValues.put("session_type", Integer.valueOf(wk2.f46734a));
        }
        Long l14 = a13.f45444c;
        if (l14 != null) {
            contentValues.put("number_in_session", Long.valueOf(l14.longValue()));
        }
        EnumC3934wb enumC3934wb = a13.f45445d;
        if (enumC3934wb != null) {
            contentValues.put("type", Integer.valueOf(enumC3934wb.f48324a));
        }
        Long l15 = a13.f45446e;
        if (l15 != null) {
            contentValues.put("global_number", Long.valueOf(l15.longValue()));
        }
        Long l16 = a13.f45447f;
        if (l16 != null) {
            contentValues.put("time", Long.valueOf(l16.longValue()));
        }
        C3980y7 c3980y7 = this.f45495a;
        contentValues.put("event_description", MessageNano.toByteArray(c3980y7.f48508a.fromModel(a13.f45448g)));
        return contentValues;
    }

    public B7(C3980y7 c3980y7) {
        this.f45495a = c3980y7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B7(C3980y7 c3980y7, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new C3980y7(null, 1, 0 == true ? 1 : 0) : c3980y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(ContentValues contentValues) {
        Wk wk2;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            wk2 = Wk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new A7(asLong, wk2, asLong2, asInteger2 != null ? EnumC3934wb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f45495a.toModel(contentValues.getAsByteArray("event_description")));
    }
}

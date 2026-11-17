package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class L3 implements U5 {
    @Override // io.appmetrica.analytics.impl.U5, tg.draadjrbmk
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = Bb.c(asString);
        if (Gm.a(mapC)) {
            return mapC;
        }
        AbstractC3842sj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}

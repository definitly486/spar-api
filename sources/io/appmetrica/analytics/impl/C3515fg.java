package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3515fg implements po {
    @Override // io.appmetrica.analytics.impl.po
    public final no a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new no(this, true, "");
        }
        return new no(this, false, "Invalid quantity value " + num);
    }
}

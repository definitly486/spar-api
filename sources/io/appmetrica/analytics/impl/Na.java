package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Na extends O2 {
    public Na(int i13) {
        super(i13);
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Oa
    public final Jn a(String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i13 = this.f46302a;
            if (length2 > i13) {
                String strSubstring = str.substring(0, i13);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new Jn(str, new C3926w3(length));
    }
}

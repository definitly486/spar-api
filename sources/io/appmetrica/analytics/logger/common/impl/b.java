package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f48722a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] strArrSplit = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            int i13 = 0;
            while (str2.length() > i13) {
                int length = str2.length();
                int i14 = i13 + 3800;
                int iMin = Math.min(length, i14);
                if (length > i14) {
                    int iA = e.a(this.f48722a.f48727a.matcher(str2), i13, iMin);
                    length = iA == -1 ? iMin : iA + 1;
                }
                arrayList.add(str2.substring(i13, length));
                i13 = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f48722a = eVar;
    }
}

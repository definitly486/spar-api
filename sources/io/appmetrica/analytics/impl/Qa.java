package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Qa extends O2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Na f46416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Na f46417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pa f46418d;

    public Qa(int i13, int i14, int i15) {
        this(i13, new Na(i14), new Na(i15));
    }

    public Qa(int i13, Na na3, Na na4) {
        super(i13);
        this.f46418d = new Pa();
        this.f46416b = na3;
        this.f46417c = na4;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Oa
    public final Jn a(Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i13 = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f46418d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i14 = 0;
            boolean z13 = false;
            int i15 = 0;
            while (i13 < length) {
                Map.Entry entry = entryArr[i13];
                Jn jnA = this.f46416b.a((String) entry.getKey());
                Jn jnA2 = this.f46417c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) jnA2.f46116a) + StringUtils.getUtf8BytesLength((String) jnA.f46116a);
                if (z13 || utf8BytesLength2 + i15 > this.f46302a) {
                    i14++;
                    bytesTruncated += utf8BytesLength;
                    z13 = true;
                } else {
                    bytesTruncated = jnA2.f46117b.getBytesTruncated() + jnA.f46117b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) jnA2.f46116a) + StringUtils.getUtf8BytesLength((String) jnA.f46116a) + i15;
                    map2.put((String) jnA.f46116a, (String) jnA2.f46116a);
                    i15 = utf8BytesLength3;
                }
                i13++;
            }
            i13 = i14;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new Jn(map2, new I4(i13, bytesTruncated));
    }
}

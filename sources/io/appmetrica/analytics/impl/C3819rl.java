package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3819rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xc f48017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wc f48018b;

    public C3819rl(PublicLogger publicLogger, String str) {
        this(new Xc(str, publicLogger), new Wc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(C3383ad c3383ad, String str, String str2) {
        try {
            int size = c3383ad.size();
            int i13 = this.f48017a.f46767c.f45878a;
            if (size < i13 || (i13 == c3383ad.size() && c3383ad.containsKey(str))) {
                this.f48018b.getClass();
                int length = c3383ad.f46916a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (c3383ad.containsKey(str)) {
                    String str3 = (String) c3383ad.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    c3383ad.put(str, str2);
                    return true;
                }
                Wc wc2 = this.f48018b;
                wc2.f46716b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", wc2.f46715a, 4500, str);
            } else {
                Xc xc2 = this.f48017a;
                xc2.f46768d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", xc2.f46769e, Integer.valueOf(xc2.f46767c.f45878a), str);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean b(C3383ad c3383ad, String str, String str2) {
        if (c3383ad == null) {
            return false;
        }
        String strA = this.f48017a.f46765a.a(str);
        String strA2 = this.f48017a.f46766b.a(str2);
        if (!c3383ad.containsKey(strA)) {
            if (strA2 != null) {
                return a(c3383ad, strA, strA2);
            }
            return false;
        }
        String str3 = (String) c3383ad.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(c3383ad, strA, strA2);
        }
        return false;
    }

    public C3819rl(Xc xc2, Wc wc2) {
        this.f48017a = xc2;
        this.f48018b = wc2;
    }
}

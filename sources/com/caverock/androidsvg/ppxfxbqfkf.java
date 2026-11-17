package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f21672iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f21673zoijcleaow;

    ppxfxbqfkf(long j13, int i13) {
        this.f21673zoijcleaow = j13;
        this.f21672iobyxmoadg = i13;
    }

    static ppxfxbqfkf ppxfxbqfkf(String str, int i13, int i14, boolean z13) {
        if (i13 >= i14) {
            return null;
        }
        boolean z14 = false;
        if (z13) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '+') {
                i13++;
            } else if (cCharAt == '-') {
                z14 = true;
                i13++;
            }
        }
        long j13 = 0;
        int i15 = i13;
        while (i15 < i14) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z14) {
                j13 = (j13 * 10) - ((long) (cCharAt2 - '0'));
                if (j13 < -2147483648L) {
                    return null;
                }
            } else {
                j13 = (j13 * 10) + ((long) (cCharAt2 - '0'));
                if (j13 > 2147483647L) {
                    return null;
                }
            }
            i15++;
        }
        if (i15 == i13) {
            return null;
        }
        return new ppxfxbqfkf(j13, i15);
    }

    static ppxfxbqfkf zoijcleaow(String str, int i13, int i14) {
        long j13;
        int i15;
        if (i13 >= i14) {
            return null;
        }
        long j14 = 0;
        int i16 = i13;
        while (i16 < i14) {
            char cCharAt = str.charAt(i16);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j13 = j14 * 16;
                    i15 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j13 = j14 * 16;
                    i15 = cCharAt - 'a';
                }
                j14 = j13 + ((long) i15) + 10;
            } else {
                j14 = (j14 * 16) + ((long) (cCharAt - '0'));
            }
            if (j14 > 4294967295L) {
                return null;
            }
            i16++;
        }
        if (i16 == i13) {
            return null;
        }
        return new ppxfxbqfkf(j14, i16);
    }

    int iobyxmoadg() {
        return this.f21672iobyxmoadg;
    }

    public int wkgbmnqykc() {
        return (int) this.f21673zoijcleaow;
    }
}

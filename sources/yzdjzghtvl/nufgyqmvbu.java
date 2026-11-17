package yzdjzghtvl;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {
    public static final long[] eablkybsjg(long[] jArr, int i13) {
        int length = jArr.length;
        int i14 = length - 1;
        if (i14 == 0) {
            return null;
        }
        long[] jArr2 = new long[i14];
        if (i13 > 0) {
            hg.agtfadlqog.wflxmlrfwp(jArr, jArr2, 0, 0, i13);
        }
        if (i13 < i14) {
            hg.agtfadlqog.wflxmlrfwp(jArr, jArr2, i13, i13 + 1, length);
        }
        return jArr2;
    }

    public static final int iobyxmoadg(long[] jArr, long j13) {
        int length = jArr.length - 1;
        int i13 = 0;
        while (i13 <= length) {
            int i14 = (i13 + length) >>> 1;
            long j14 = jArr[i14];
            if (j13 > j14) {
                i13 = i14 + 1;
            } else {
                if (j13 >= j14) {
                    return i14;
                }
                length = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static final long ppxfxbqfkf(int i13) {
        return i13;
    }

    public static final long[] wkgbmnqykc(long[] jArr, int i13, long j13) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        hg.agtfadlqog.wflxmlrfwp(jArr, jArr2, 0, 0, i13);
        hg.agtfadlqog.wflxmlrfwp(jArr, jArr2, i13 + 1, i13, length);
        jArr2[i13] = j13;
        return jArr2;
    }

    public static final long[] zoijcleaow(int i13) {
        return new long[i13];
    }
}

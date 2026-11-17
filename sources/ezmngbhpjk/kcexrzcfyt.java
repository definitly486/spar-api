package ezmngbhpjk;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f32437iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object[] f32438ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long[] f32439zoijcleaow;

    public kcexrzcfyt(int i13, long[] jArr, Object[] objArr) {
        this.f32437iobyxmoadg = i13;
        this.f32439zoijcleaow = jArr;
        this.f32438ppxfxbqfkf = objArr;
    }

    private final int iobyxmoadg(long j13) {
        int i13 = this.f32437iobyxmoadg - 1;
        if (i13 == -1) {
            return -1;
        }
        int i14 = 0;
        if (i13 == 0) {
            long j14 = this.f32439zoijcleaow[0];
            if (j14 == j13) {
                return 0;
            }
            return j14 > j13 ? -2 : -1;
        }
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            long j15 = this.f32439zoijcleaow[i15] - j13;
            if (j15 < 0) {
                i14 = i15 + 1;
            } else {
                if (j15 <= 0) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public final kcexrzcfyt ppxfxbqfkf(long j13, Object obj) {
        int i13 = this.f32437iobyxmoadg;
        int i14 = 0;
        int i15 = 0;
        for (Object obj2 : this.f32438ppxfxbqfkf) {
            if (obj2 != null) {
                i15++;
            }
        }
        int i16 = i15 + 1;
        long[] jArr = new long[i16];
        Object[] objArr = new Object[i16];
        if (i16 > 1) {
            int i17 = 0;
            while (i14 < i16 && i17 < i13) {
                long j14 = this.f32439zoijcleaow[i17];
                Object obj3 = this.f32438ppxfxbqfkf[i17];
                if (j14 > j13) {
                    jArr[i14] = j13;
                    objArr[i14] = obj;
                    i14++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i14] = j14;
                    objArr[i14] = obj3;
                    i14++;
                }
                i17++;
            }
            if (i17 == i13) {
                jArr[i15] = j13;
                objArr[i15] = obj;
            } else {
                while (i14 < i16) {
                    long j15 = this.f32439zoijcleaow[i17];
                    Object obj4 = this.f32438ppxfxbqfkf[i17];
                    if (obj4 != null) {
                        jArr[i14] = j15;
                        objArr[i14] = obj4;
                        i14++;
                    }
                    i17++;
                }
            }
        } else {
            jArr[0] = j13;
            objArr[0] = obj;
        }
        return new kcexrzcfyt(i16, jArr, objArr);
    }

    public final boolean wkgbmnqykc(long j13, Object obj) {
        int iIobyxmoadg = iobyxmoadg(j13);
        if (iIobyxmoadg < 0) {
            return false;
        }
        this.f32438ppxfxbqfkf[iIobyxmoadg] = obj;
        return true;
    }

    public final Object zoijcleaow(long j13) {
        int iIobyxmoadg = iobyxmoadg(j13);
        if (iIobyxmoadg >= 0) {
            return this.f32438ppxfxbqfkf[iIobyxmoadg];
        }
        return null;
    }
}

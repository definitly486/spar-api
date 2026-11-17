package z0;

/* JADX INFO: loaded from: classes.dex */
class lqeggnwhkg implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object[] f127465iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f127466zoijcleaow;

    lqeggnwhkg(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f127465iobyxmoadg = new Object[i13];
    }

    @Override // z0.gxszxtbevo
    public boolean iobyxmoadg(Object obj) {
        int i13 = this.f127466zoijcleaow;
        Object[] objArr = this.f127465iobyxmoadg;
        if (i13 >= objArr.length) {
            return false;
        }
        objArr[i13] = obj;
        this.f127466zoijcleaow = i13 + 1;
        return true;
    }

    @Override // z0.gxszxtbevo
    public void ppxfxbqfkf(Object[] objArr, int i13) {
        if (i13 > objArr.length) {
            i13 = objArr.length;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = objArr[i14];
            int i15 = this.f127466zoijcleaow;
            Object[] objArr2 = this.f127465iobyxmoadg;
            if (i15 < objArr2.length) {
                objArr2[i15] = obj;
                this.f127466zoijcleaow = i15 + 1;
            }
        }
    }

    @Override // z0.gxszxtbevo
    public Object zoijcleaow() {
        int i13 = this.f127466zoijcleaow;
        if (i13 <= 0) {
            return null;
        }
        int i14 = i13 - 1;
        Object[] objArr = this.f127465iobyxmoadg;
        Object obj = objArr[i14];
        objArr[i14] = null;
        this.f127466zoijcleaow = i13 - 1;
        return obj;
    }
}

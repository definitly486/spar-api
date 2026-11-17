package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes2.dex */
public class iwizpuwonk implements pd.draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f24740iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f24741zoijcleaow;

    iwizpuwonk(String str, int i13) {
        this.f24740iobyxmoadg = str;
        this.f24741zoijcleaow = i13;
    }

    private String eablkybsjg() {
        return iobyxmoadg().trim();
    }

    private void gxszxtbevo() {
        if (this.f24740iobyxmoadg == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // pd.draadjrbmk
    public String iobyxmoadg() {
        if (this.f24741zoijcleaow == 0) {
            return "";
        }
        gxszxtbevo();
        return this.f24740iobyxmoadg;
    }

    @Override // pd.draadjrbmk
    public int lqeggnwhkg() {
        return this.f24741zoijcleaow;
    }

    @Override // pd.draadjrbmk
    public long ppxfxbqfkf() {
        if (this.f24741zoijcleaow == 0) {
            return 0L;
        }
        String strEablkybsjg = eablkybsjg();
        try {
            return Long.valueOf(strEablkybsjg).longValue();
        } catch (NumberFormatException e13) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strEablkybsjg, "long"), e13);
        }
    }

    @Override // pd.draadjrbmk
    public double wkgbmnqykc() {
        if (this.f24741zoijcleaow == 0) {
            return 0.0d;
        }
        String strEablkybsjg = eablkybsjg();
        try {
            return Double.valueOf(strEablkybsjg).doubleValue();
        } catch (NumberFormatException e13) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strEablkybsjg, "double"), e13);
        }
    }

    @Override // pd.draadjrbmk
    public boolean zoijcleaow() {
        if (this.f24741zoijcleaow == 0) {
            return false;
        }
        String strEablkybsjg = eablkybsjg();
        if (ojitshcjhn.f24769gxszxtbevo.matcher(strEablkybsjg).matches()) {
            return true;
        }
        if (ojitshcjhn.f24770lqeggnwhkg.matcher(strEablkybsjg).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strEablkybsjg, "boolean"));
    }
}

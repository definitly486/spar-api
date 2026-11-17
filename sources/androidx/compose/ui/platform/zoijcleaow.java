package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected String f7199iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f7200zoijcleaow = new int[2];

    public void eablkybsjg(String str) {
        gxszxtbevo(str);
    }

    protected final void gxszxtbevo(String str) {
        this.f7199iobyxmoadg = str;
    }

    protected final int[] ppxfxbqfkf(int i13, int i14) {
        if (i13 < 0 || i14 < 0 || i13 == i14) {
            return null;
        }
        int[] iArr = this.f7200zoijcleaow;
        iArr[0] = i13;
        iArr[1] = i14;
        return iArr;
    }

    protected final String wkgbmnqykc() {
        String str = this.f7199iobyxmoadg;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("text");
        return null;
    }
}

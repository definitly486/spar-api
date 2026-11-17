package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private zoijcleaow f19810eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private bf.zoijcleaow f19811iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private bf.ppxfxbqfkf f19812ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f19813wkgbmnqykc = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private bf.iobyxmoadg f19814zoijcleaow;

    public static boolean zoijcleaow(int i13) {
        return i13 >= 0 && i13 < 8;
    }

    public void eablkybsjg(zoijcleaow zoijcleaowVar) {
        this.f19810eablkybsjg = zoijcleaowVar;
    }

    public void gxszxtbevo(bf.zoijcleaow zoijcleaowVar) {
        this.f19811iobyxmoadg = zoijcleaowVar;
    }

    public zoijcleaow iobyxmoadg() {
        return this.f19810eablkybsjg;
    }

    public void lqeggnwhkg(bf.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f19812ppxfxbqfkf = ppxfxbqfkfVar;
    }

    public void ppxfxbqfkf(bf.iobyxmoadg iobyxmoadgVar) {
        this.f19814zoijcleaow = iobyxmoadgVar;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(200);
        sb3.append("<<\n");
        sb3.append(" mode: ");
        sb3.append(this.f19811iobyxmoadg);
        sb3.append("\n ecLevel: ");
        sb3.append(this.f19814zoijcleaow);
        sb3.append("\n version: ");
        sb3.append(this.f19812ppxfxbqfkf);
        sb3.append("\n maskPattern: ");
        sb3.append(this.f19813wkgbmnqykc);
        if (this.f19810eablkybsjg == null) {
            sb3.append("\n matrix: null\n");
        } else {
            sb3.append("\n matrix:\n");
            sb3.append(this.f19810eablkybsjg);
        }
        sb3.append(">>\n");
        return sb3.toString();
    }

    public void wkgbmnqykc(int i13) {
        this.f19813wkgbmnqykc = i13;
    }
}

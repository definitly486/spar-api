package xl;

/* JADX INFO: loaded from: classes3.dex */
public class pmvmpeiblj extends kcexrzcfyt {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f122722cqumvgiudr;

    public pmvmpeiblj(String str, boolean z13) {
        super(str);
        this.f122722cqumvgiudr = z13;
    }

    private void ydmasvzmpa(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        for (iobyxmoadg iobyxmoadgVar2 : eablkybsjg()) {
            String key = iobyxmoadgVar2.getKey();
            String value = iobyxmoadgVar2.getValue();
            if (!key.equals(istkbnxepw())) {
                lqeggnwhkgVar.iobyxmoadg(' ');
                lqeggnwhkgVar.zoijcleaow(key);
                if (!value.isEmpty()) {
                    lqeggnwhkgVar.zoijcleaow("=\"");
                    ojitshcjhn.draadjrbmk(lqeggnwhkgVar, value, iobyxmoadgVar, 2);
                    lqeggnwhkgVar.iobyxmoadg('\"');
                }
            }
        }
    }

    @Override // xl.zdlpuopuiu
    void hcddaimhww(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        lqeggnwhkgVar.zoijcleaow("<").zoijcleaow(this.f122722cqumvgiudr ? "!" : "?").zoijcleaow(metgxyhuhe());
        ydmasvzmpa(lqeggnwhkgVar, iobyxmoadgVar);
        lqeggnwhkgVar.zoijcleaow(this.f122722cqumvgiudr ? "" : "?").zoijcleaow(">");
    }

    @Override // xl.zdlpuopuiu
    public String istkbnxepw() {
        return "#declaration";
    }

    @Override // xl.zdlpuopuiu
    public String toString() {
        return ylkuphrtab();
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj clone() {
        return (pmvmpeiblj) super.clone();
    }
}

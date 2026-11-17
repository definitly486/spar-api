package q7;

import com.airbnb.lottie.hcddaimhww;
import k7.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public class zdlpuopuiu implements ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final p7.zoijcleaow f78157eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f78158gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78159iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final p7.zoijcleaow f78160ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p7.zoijcleaow f78161wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f78162zoijcleaow;

    public enum iobyxmoadg {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static iobyxmoadg wkgbmnqykc(int i13) {
            if (i13 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i13 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i13);
        }
    }

    public zdlpuopuiu(String str, iobyxmoadg iobyxmoadgVar, p7.zoijcleaow zoijcleaowVar, p7.zoijcleaow zoijcleaowVar2, p7.zoijcleaow zoijcleaowVar3, boolean z13) {
        this.f78159iobyxmoadg = str;
        this.f78162zoijcleaow = iobyxmoadgVar;
        this.f78160ppxfxbqfkf = zoijcleaowVar;
        this.f78161wkgbmnqykc = zoijcleaowVar2;
        this.f78157eablkybsjg = zoijcleaowVar3;
        this.f78158gxszxtbevo = z13;
    }

    public p7.zoijcleaow eablkybsjg() {
        return this.f78160ppxfxbqfkf;
    }

    public iobyxmoadg gxszxtbevo() {
        return this.f78162zoijcleaow;
    }

    @Override // q7.ppxfxbqfkf
    public k7.ppxfxbqfkf iobyxmoadg(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar) {
        return new yggfygwlhe(zoijcleaowVar, this);
    }

    public boolean lqeggnwhkg() {
        return this.f78158gxszxtbevo;
    }

    public String ppxfxbqfkf() {
        return this.f78159iobyxmoadg;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f78160ppxfxbqfkf + ", end: " + this.f78161wkgbmnqykc + ", offset: " + this.f78157eablkybsjg + "}";
    }

    public p7.zoijcleaow wkgbmnqykc() {
        return this.f78157eablkybsjg;
    }

    public p7.zoijcleaow zoijcleaow() {
        return this.f78161wkgbmnqykc;
    }
}

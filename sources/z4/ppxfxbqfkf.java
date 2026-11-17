package z4;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f127770gxszxtbevo;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f127773nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f127774ojitshcjhn;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f127771iobyxmoadg = "";

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f127780zoijcleaow = "";

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Set f127775ppxfxbqfkf = Collections.emptySet();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f127779wkgbmnqykc = "";

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f127768eablkybsjg = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f127772lqeggnwhkg = false;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f127767dxjokdxxww = false;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f127765btonecajqb = -1;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f127769gtknphoqwx = -1;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f127766draadjrbmk = -1;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f127778wflxmlrfwp = -1;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f127764agtfadlqog = -1;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f127776rgvfuqvkyq = -1;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f127777vdvldrhtss = false;

    private static int zynmafqrjb(int i13, String str, String str2, int i14) {
        if (str.isEmpty() || i13 == -1) {
            return i13;
        }
        if (str.equals(str2)) {
            return i13 + i14;
        }
        return -1;
    }

    public ppxfxbqfkf agtfadlqog(int i13) {
        this.f127773nufgyqmvbu = i13;
        this.f127767dxjokdxxww = true;
        return this;
    }

    public boolean btonecajqb() {
        return this.f127767dxjokdxxww;
    }

    public void cqumvgiudr(String str) {
        this.f127771iobyxmoadg = str;
    }

    public boolean draadjrbmk() {
        return this.f127765btonecajqb == 1;
    }

    public int dxjokdxxww() {
        int i13 = this.f127766draadjrbmk;
        if (i13 == -1 && this.f127778wflxmlrfwp == -1) {
            return -1;
        }
        return (i13 == 1 ? 1 : 0) | (this.f127778wflxmlrfwp == 1 ? 2 : 0);
    }

    public float eablkybsjg() {
        return this.f127774ojitshcjhn;
    }

    public void esjtqupxsv(String str) {
        this.f127780zoijcleaow = str;
    }

    public boolean gtknphoqwx() {
        return this.f127772lqeggnwhkg;
    }

    public int gxszxtbevo() {
        return this.f127764agtfadlqog;
    }

    public int iobyxmoadg() {
        if (this.f127767dxjokdxxww) {
            return this.f127773nufgyqmvbu;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public void iwizpuwonk(String[] strArr) {
        this.f127775ppxfxbqfkf = new HashSet(Arrays.asList(strArr));
    }

    public ppxfxbqfkf jyumaefscl(int i13) {
        this.f127776rgvfuqvkyq = i13;
        return this;
    }

    public ppxfxbqfkf kcexrzcfyt(float f13) {
        this.f127774ojitshcjhn = f13;
        return this;
    }

    public void lereixgezr(String str) {
        this.f127779wkgbmnqykc = str;
    }

    public int lqeggnwhkg() {
        return this.f127776rgvfuqvkyq;
    }

    public int nufgyqmvbu(String str, String str2, Set set, String str3) {
        if (this.f127771iobyxmoadg.isEmpty() && this.f127780zoijcleaow.isEmpty() && this.f127775ppxfxbqfkf.isEmpty() && this.f127779wkgbmnqykc.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZynmafqrjb = zynmafqrjb(zynmafqrjb(zynmafqrjb(0, this.f127771iobyxmoadg, str, 1073741824), this.f127780zoijcleaow, str2, 2), this.f127779wkgbmnqykc, str3, 4);
        if (iZynmafqrjb == -1 || !set.containsAll(this.f127775ppxfxbqfkf)) {
            return 0;
        }
        return iZynmafqrjb + (this.f127775ppxfxbqfkf.size() * 4);
    }

    public ppxfxbqfkf ojitshcjhn(boolean z13) {
        this.f127766draadjrbmk = z13 ? 1 : 0;
        return this;
    }

    public ppxfxbqfkf oxmwwwfdhm(String str) {
        this.f127768eablkybsjg = str == null ? null : xa.zoijcleaow.eablkybsjg(str);
        return this;
    }

    public ppxfxbqfkf pmvmpeiblj(boolean z13) {
        this.f127769gtknphoqwx = z13 ? 1 : 0;
        return this;
    }

    public int ppxfxbqfkf() {
        if (this.f127772lqeggnwhkg) {
            return this.f127770gxszxtbevo;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public ppxfxbqfkf rgvfuqvkyq(boolean z13) {
        this.f127777vdvldrhtss = z13;
        return this;
    }

    public ppxfxbqfkf vdvldrhtss(int i13) {
        this.f127770gxszxtbevo = i13;
        this.f127772lqeggnwhkg = true;
        return this;
    }

    public boolean wflxmlrfwp() {
        return this.f127769gtknphoqwx == 1;
    }

    public String wkgbmnqykc() {
        return this.f127768eablkybsjg;
    }

    public ppxfxbqfkf yggfygwlhe(boolean z13) {
        this.f127778wflxmlrfwp = z13 ? 1 : 0;
        return this;
    }

    public ppxfxbqfkf zdlpuopuiu(int i13) {
        this.f127764agtfadlqog = i13;
        return this;
    }

    public boolean zoijcleaow() {
        return this.f127777vdvldrhtss;
    }
}

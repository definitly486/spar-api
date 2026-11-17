package z0;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class dxjokdxxww implements Comparable {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static int f127429hcddaimhww = 1;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public float f127432esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    iobyxmoadg f127434istkbnxepw;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f127443yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public boolean f127445zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public int f127436jyumaefscl = -1;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f127435iwizpuwonk = -1;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public int f127431cqumvgiudr = 0;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public boolean f127437lereixgezr = false;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    float[] f127440pmvmpeiblj = new float[9];

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    float[] f127446zynmafqrjb = new float[9];

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    zoijcleaow[] f127430cdpycssgdh = new zoijcleaow[16];

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    int f127442yadqdtsiqt = 0;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public int f127433iozdgvuglv = 0;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    boolean f127438lmojexxdyd = false;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    int f127441wwaezpbzkn = -1;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    float f127444ylkuphrtab = 0.0f;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    HashSet f127439pkzmftpjix = null;

    public enum iobyxmoadg {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public dxjokdxxww(iobyxmoadg iobyxmoadgVar, String str) {
        this.f127434istkbnxepw = iobyxmoadgVar;
    }

    static void ppxfxbqfkf() {
        f127429hcddaimhww++;
    }

    public void eablkybsjg() {
        this.f127443yggfygwlhe = null;
        this.f127434istkbnxepw = iobyxmoadg.UNKNOWN;
        this.f127431cqumvgiudr = 0;
        this.f127436jyumaefscl = -1;
        this.f127435iwizpuwonk = -1;
        this.f127432esjtqupxsv = 0.0f;
        this.f127437lereixgezr = false;
        this.f127438lmojexxdyd = false;
        this.f127441wwaezpbzkn = -1;
        this.f127444ylkuphrtab = 0.0f;
        int i13 = this.f127442yadqdtsiqt;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f127430cdpycssgdh[i14] = null;
        }
        this.f127442yadqdtsiqt = 0;
        this.f127433iozdgvuglv = 0;
        this.f127445zdlpuopuiu = false;
        Arrays.fill(this.f127446zynmafqrjb, 0.0f);
    }

    public void gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, float f13) {
        this.f127432esjtqupxsv = f13;
        this.f127437lereixgezr = true;
        this.f127438lmojexxdyd = false;
        this.f127441wwaezpbzkn = -1;
        this.f127444ylkuphrtab = 0.0f;
        int i13 = this.f127442yadqdtsiqt;
        this.f127435iwizpuwonk = -1;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f127430cdpycssgdh[i14].pmvmpeiblj(wkgbmnqykcVar, this, false);
        }
        this.f127442yadqdtsiqt = 0;
    }

    public final void iobyxmoadg(zoijcleaow zoijcleaowVar) {
        int i13 = 0;
        while (true) {
            int i14 = this.f127442yadqdtsiqt;
            if (i13 >= i14) {
                zoijcleaow[] zoijcleaowVarArr = this.f127430cdpycssgdh;
                if (i14 >= zoijcleaowVarArr.length) {
                    this.f127430cdpycssgdh = (zoijcleaow[]) Arrays.copyOf(zoijcleaowVarArr, zoijcleaowVarArr.length * 2);
                }
                zoijcleaow[] zoijcleaowVarArr2 = this.f127430cdpycssgdh;
                int i15 = this.f127442yadqdtsiqt;
                zoijcleaowVarArr2[i15] = zoijcleaowVar;
                this.f127442yadqdtsiqt = i15 + 1;
                return;
            }
            if (this.f127430cdpycssgdh[i13] == zoijcleaowVar) {
                return;
            } else {
                i13++;
            }
        }
    }

    public void lqeggnwhkg(iobyxmoadg iobyxmoadgVar, String str) {
        this.f127434istkbnxepw = iobyxmoadgVar;
    }

    public final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar) {
        int i13 = this.f127442yadqdtsiqt;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f127430cdpycssgdh[i14].zynmafqrjb(wkgbmnqykcVar, zoijcleaowVar, false);
        }
        this.f127442yadqdtsiqt = 0;
    }

    public String toString() {
        if (this.f127443yggfygwlhe != null) {
            return "" + this.f127443yggfygwlhe;
        }
        return "" + this.f127436jyumaefscl;
    }

    public final void wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        int i13 = this.f127442yadqdtsiqt;
        int i14 = 0;
        while (i14 < i13) {
            if (this.f127430cdpycssgdh[i14] == zoijcleaowVar) {
                while (i14 < i13 - 1) {
                    zoijcleaow[] zoijcleaowVarArr = this.f127430cdpycssgdh;
                    int i15 = i14 + 1;
                    zoijcleaowVarArr[i14] = zoijcleaowVarArr[i15];
                    i14 = i15;
                }
                this.f127442yadqdtsiqt--;
                return;
            }
            i14++;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compareTo(dxjokdxxww dxjokdxxwwVar) {
        return this.f127436jyumaefscl - dxjokdxxwwVar.f127436jyumaefscl;
    }
}

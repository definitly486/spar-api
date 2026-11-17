package yl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class kcexrzcfyt implements Cloneable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static int f125778cdpycssgdh = 64;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static int f125779cqumvgiudr = 1;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static int f125780esjtqupxsv = 2;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static int f125781iozdgvuglv = 256;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static int f125782istkbnxepw = 32;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static int f125783lereixgezr = 4;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static int f125784lmojexxdyd = 512;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static int f125785pmvmpeiblj = 8;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static int f125786yadqdtsiqt = 128;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static int f125787zynmafqrjb = 16;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f125788iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    String f125789jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    String f125790yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    String f125791zdlpuopuiu;

    public kcexrzcfyt(String str, String str2) {
        this(str, vdvldrhtss.iobyxmoadg(str), str2);
    }

    public static kcexrzcfyt vdvldrhtss(String str, String str2, vdvldrhtss vdvldrhtssVar) {
        return wwaezpbzkn.ojitshcjhn().ylkuphrtab(str, vdvldrhtss.iobyxmoadg(str), str2, vdvldrhtssVar.gxszxtbevo());
    }

    public kcexrzcfyt agtfadlqog(int i13) {
        this.f125788iwizpuwonk = i13 | this.f125788iwizpuwonk | f125779cqumvgiudr;
        return this;
    }

    public String draadjrbmk() {
        return this.f125789jyumaefscl;
    }

    public boolean eablkybsjg() {
        return (this.f125788iwizpuwonk & f125780esjtqupxsv) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return Objects.equals(this.f125790yggfygwlhe, kcexrzcfytVar.f125790yggfygwlhe) && Objects.equals(this.f125791zdlpuopuiu, kcexrzcfytVar.f125791zdlpuopuiu) && Objects.equals(this.f125789jyumaefscl, kcexrzcfytVar.f125789jyumaefscl) && this.f125788iwizpuwonk == kcexrzcfytVar.f125788iwizpuwonk;
    }

    public String gtknphoqwx() {
        return this.f125791zdlpuopuiu;
    }

    public boolean gxszxtbevo() {
        return (this.f125788iwizpuwonk & f125783lereixgezr) == 0;
    }

    public int hashCode() {
        return Objects.hash(this.f125790yggfygwlhe, this.f125791zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt clone() {
        try {
            return (kcexrzcfyt) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public boolean lqeggnwhkg() {
        return (this.f125788iwizpuwonk & f125779cqumvgiudr) != 0;
    }

    public boolean nufgyqmvbu() {
        int i13 = this.f125788iwizpuwonk;
        return ((f125787zynmafqrjb & i13) == 0 && (i13 & f125780esjtqupxsv) == 0) ? false : true;
    }

    void ojitshcjhn() {
        this.f125788iwizpuwonk |= f125782istkbnxepw;
    }

    public boolean ppxfxbqfkf(int i13) {
        return (i13 & this.f125788iwizpuwonk) != 0;
    }

    cllcsxoeiz rgvfuqvkyq() {
        if (ppxfxbqfkf(f125786yadqdtsiqt)) {
            return cllcsxoeiz.f125679jyumaefscl;
        }
        if (ppxfxbqfkf(f125781iozdgvuglv)) {
            return cllcsxoeiz.f125656cqumvgiudr;
        }
        return null;
    }

    public String toString() {
        return this.f125790yggfygwlhe;
    }

    public boolean wflxmlrfwp() {
        return (this.f125788iwizpuwonk & f125778cdpycssgdh) != 0;
    }

    public boolean wkgbmnqykc() {
        return (this.f125788iwizpuwonk & f125783lereixgezr) != 0;
    }

    public String zoijcleaow() {
        return this.f125790yggfygwlhe;
    }

    kcexrzcfyt(String str, String str2, String str3) {
        this.f125788iwizpuwonk = 0;
        this.f125790yggfygwlhe = str;
        this.f125789jyumaefscl = str2;
        this.f125791zdlpuopuiu = str3;
    }
}

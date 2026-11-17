package org.xbill.DNS;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class jlmebxxoox implements Cloneable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final Random f74424iwizpuwonk = new SecureRandom();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int[] f74425jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f74426yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f74427zdlpuopuiu;

    public jlmebxxoox(int i13) {
        if (i13 >= 0 && i13 <= 65535) {
            this.f74425jyumaefscl = new int[4];
            this.f74426yggfygwlhe = 0;
            this.f74427zdlpuopuiu = i13;
        } else {
            throw new IllegalArgumentException("DNS message ID " + i13 + " is out of range");
        }
    }

    private void draadjrbmk(StringBuilder sb3) {
        for (int i13 = 0; i13 < 16; i13++) {
            if (oxmwwwfdhm(i13) && wkgbmnqykc(i13)) {
                sb3.append(wypolnanlu.zoijcleaow(i13));
                sb3.append(" ");
            }
        }
    }

    private static void iobyxmoadg(int i13) {
        if (oxmwwwfdhm(i13)) {
            return;
        }
        throw new IllegalArgumentException("invalid flag bit " + i13);
    }

    private static boolean oxmwwwfdhm(int i13) {
        return i13 >= 0 && i13 <= 15 && wypolnanlu.iobyxmoadg(i13);
    }

    static int wflxmlrfwp(int i13, int i14, boolean z13) {
        iobyxmoadg(i14);
        return z13 ? i13 | (1 << (15 - i14)) : i13 & (~(1 << (15 - i14)));
    }

    public void agtfadlqog(int i13) {
        iobyxmoadg(i13);
        this.f74426yggfygwlhe = wflxmlrfwp(this.f74426yggfygwlhe, i13, true);
    }

    int eablkybsjg() {
        return this.f74426yggfygwlhe;
    }

    void gtknphoqwx(int i13) {
        int[] iArr = this.f74425jyumaefscl;
        int i14 = iArr[i13];
        if (i14 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i13] = i14 + 1;
    }

    public int gxszxtbevo() {
        return this.f74427zdlpuopuiu;
    }

    public int lqeggnwhkg() {
        return (this.f74426yggfygwlhe >> 11) & 15;
    }

    public int nufgyqmvbu() {
        return this.f74426yggfygwlhe & 15;
    }

    public void ojitshcjhn(int i13) {
        if (i13 >= 0 && i13 <= 15) {
            this.f74426yggfygwlhe = (i13 << 11) | (this.f74426yggfygwlhe & 34815);
        } else {
            throw new IllegalArgumentException("DNS Opcode " + i13 + "is out of range");
        }
    }

    public int ppxfxbqfkf(int i13) {
        return this.f74425jyumaefscl[i13];
    }

    String rgvfuqvkyq(int i13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(";; ->>HEADER<<- ");
        sb3.append("opcode: ");
        sb3.append(ezmngbhpjk.iobyxmoadg(lqeggnwhkg()));
        sb3.append(", status: ");
        sb3.append(d.zoijcleaow(i13));
        sb3.append(", id: ");
        sb3.append(gxszxtbevo());
        sb3.append("\n");
        sb3.append(";; flags: ");
        draadjrbmk(sb3);
        sb3.append("; ");
        for (int i14 = 0; i14 < 4; i14++) {
            sb3.append(x.zoijcleaow(i14));
            sb3.append(": ");
            sb3.append(ppxfxbqfkf(i14));
            sb3.append(" ");
        }
        return sb3.toString();
    }

    public String toString() {
        return rgvfuqvkyq(nufgyqmvbu());
    }

    void vdvldrhtss(jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.dxjokdxxww(gxszxtbevo());
        jyumaefsclVar.dxjokdxxww(this.f74426yggfygwlhe);
        for (int i13 : this.f74425jyumaefscl) {
            jyumaefsclVar.dxjokdxxww(i13);
        }
    }

    public boolean wkgbmnqykc(int i13) {
        iobyxmoadg(i13);
        return ((1 << (15 - i13)) & this.f74426yggfygwlhe) != 0;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public jlmebxxoox clone() {
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) super.clone();
        jlmebxxooxVar.f74427zdlpuopuiu = this.f74427zdlpuopuiu;
        jlmebxxooxVar.f74426yggfygwlhe = this.f74426yggfygwlhe;
        int[] iArr = new int[jlmebxxooxVar.f74425jyumaefscl.length];
        jlmebxxooxVar.f74425jyumaefscl = iArr;
        int[] iArr2 = this.f74425jyumaefscl;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        return jlmebxxooxVar;
    }

    public jlmebxxoox() {
        this(f74424iwizpuwonk.nextInt(65535));
    }

    jlmebxxoox(zdlpuopuiu zdlpuopuiuVar) {
        this(zdlpuopuiuVar.nufgyqmvbu());
        this.f74426yggfygwlhe = zdlpuopuiuVar.nufgyqmvbu();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f74425jyumaefscl;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = zdlpuopuiuVar.nufgyqmvbu();
            i13++;
        }
    }
}

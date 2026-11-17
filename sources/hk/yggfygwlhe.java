package hk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Object[] f40560iobyxmoadg = new Object[8];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f40561ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int[] f40562zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f40563iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public yggfygwlhe() {
        int[] iArr = new int[8];
        for (int i13 = 0; i13 < 8; i13++) {
            iArr[i13] = -1;
        }
        this.f40562zoijcleaow = iArr;
        this.f40561ppxfxbqfkf = -1;
    }

    private final void eablkybsjg() {
        int i13 = this.f40561ppxfxbqfkf * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f40560iobyxmoadg, i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        this.f40560iobyxmoadg = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f40562zoijcleaow, i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
        this.f40562zoijcleaow = iArrCopyOf;
    }

    public final void gxszxtbevo(Object obj) {
        int[] iArr = this.f40562zoijcleaow;
        int i13 = this.f40561ppxfxbqfkf;
        if (iArr[i13] != -2) {
            int i14 = i13 + 1;
            this.f40561ppxfxbqfkf = i14;
            if (i14 == this.f40560iobyxmoadg.length) {
                eablkybsjg();
            }
        }
        Object[] objArr = this.f40560iobyxmoadg;
        int i15 = this.f40561ppxfxbqfkf;
        objArr[i15] = obj;
        this.f40562zoijcleaow[i15] = -2;
    }

    public final String iobyxmoadg() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("$");
        int i13 = this.f40561ppxfxbqfkf + 1;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = this.f40560iobyxmoadg[i14];
            if (obj instanceof dk.gxszxtbevo) {
                dk.gxszxtbevo gxszxtbevoVar = (dk.gxszxtbevo) obj;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar.getKind(), dk.ojitshcjhn.zoijcleaow.f29098iobyxmoadg)) {
                    int i15 = this.f40562zoijcleaow[i14];
                    if (i15 >= 0) {
                        sb3.append(".");
                        sb3.append(gxszxtbevoVar.eablkybsjg(i15));
                    }
                } else if (this.f40562zoijcleaow[i14] != -1) {
                    sb3.append("[");
                    sb3.append(this.f40562zoijcleaow[i14]);
                    sb3.append("]");
                }
            } else if (obj != iobyxmoadg.f40563iobyxmoadg) {
                sb3.append("[");
                sb3.append("'");
                sb3.append(obj);
                sb3.append("'");
                sb3.append("]");
            }
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final void lqeggnwhkg(int i13) {
        this.f40562zoijcleaow[this.f40561ppxfxbqfkf] = i13;
    }

    public final void ppxfxbqfkf(dk.gxszxtbevo sd2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sd2, "sd");
        int i13 = this.f40561ppxfxbqfkf + 1;
        this.f40561ppxfxbqfkf = i13;
        if (i13 == this.f40560iobyxmoadg.length) {
            eablkybsjg();
        }
        this.f40560iobyxmoadg[i13] = sd2;
    }

    public String toString() {
        return iobyxmoadg();
    }

    public final void wkgbmnqykc() {
        int[] iArr = this.f40562zoijcleaow;
        int i13 = this.f40561ppxfxbqfkf;
        if (iArr[i13] == -2) {
            this.f40560iobyxmoadg[i13] = iobyxmoadg.f40563iobyxmoadg;
        }
    }

    public final void zoijcleaow() {
        int i13 = this.f40561ppxfxbqfkf;
        int[] iArr = this.f40562zoijcleaow;
        if (iArr[i13] == -2) {
            iArr[i13] = -1;
            this.f40561ppxfxbqfkf = i13 - 1;
        }
        int i14 = this.f40561ppxfxbqfkf;
        if (i14 != -1) {
            this.f40561ppxfxbqfkf = i14 - 1;
        }
    }
}

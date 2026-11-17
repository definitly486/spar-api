package androidx.collection;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt extends wflxmlrfwp {
    public yadqdtsiqt(int i13) {
        super(i13, null);
    }

    public final int agtfadlqog(int i13) {
        if (i13 < 0 || i13 >= this.f4401zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        int[] iArr = this.f4400iobyxmoadg;
        int i14 = iArr[i13];
        int i15 = this.f4401zoijcleaow;
        if (i13 != i15 - 1) {
            hg.agtfadlqog.draadjrbmk(iArr, iArr, i13, i13 + 1, i15);
        }
        this.f4401zoijcleaow--;
        return i14;
    }

    public final boolean btonecajqb(int i13) {
        wflxmlrfwp(this.f4401zoijcleaow + 1);
        int[] iArr = this.f4400iobyxmoadg;
        int i14 = this.f4401zoijcleaow;
        iArr[i14] = i13;
        this.f4401zoijcleaow = i14 + 1;
        return true;
    }

    public final void draadjrbmk() {
        this.f4401zoijcleaow = 0;
    }

    public final void dxjokdxxww(int i13, int i14) {
        if (i13 < 0 || i13 > this.f4401zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        wflxmlrfwp(this.f4401zoijcleaow + 1);
        int[] iArr = this.f4400iobyxmoadg;
        int i15 = this.f4401zoijcleaow;
        if (i13 != i15) {
            hg.agtfadlqog.draadjrbmk(iArr, iArr, i13 + 1, i13, i15);
        }
        iArr[i13] = i14;
        this.f4401zoijcleaow++;
    }

    public final boolean gtknphoqwx(int i13, int[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (i13 < 0 || i13 > this.f4401zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("");
        }
        if (elements.length == 0) {
            return false;
        }
        wflxmlrfwp(this.f4401zoijcleaow + elements.length);
        int[] iArr = this.f4400iobyxmoadg;
        int i14 = this.f4401zoijcleaow;
        if (i13 != i14) {
            hg.agtfadlqog.draadjrbmk(iArr, iArr, elements.length + i13, i13, i14);
        }
        hg.agtfadlqog.vdvldrhtss(elements, iArr, i13, 0, 0, 12, null);
        this.f4401zoijcleaow += elements.length;
        return true;
    }

    public final void ojitshcjhn(int i13, int i14) {
        int i15;
        if (i13 < 0 || i13 > (i15 = this.f4401zoijcleaow) || i14 < 0 || i14 > i15) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        if (i14 < i13) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("The end index must be < start index");
        }
        if (i14 != i13) {
            int i16 = this.f4401zoijcleaow;
            if (i14 < i16) {
                int[] iArr = this.f4400iobyxmoadg;
                hg.agtfadlqog.draadjrbmk(iArr, iArr, i13, i14, i16);
            }
            this.f4401zoijcleaow -= i14 - i13;
        }
    }

    public final int rgvfuqvkyq(int i13, int i14) {
        if (i13 < 0 || i13 >= this.f4401zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        int[] iArr = this.f4400iobyxmoadg;
        int i15 = iArr[i13];
        iArr[i13] = i14;
        return i15;
    }

    public final void vdvldrhtss() {
        int i13 = this.f4401zoijcleaow;
        if (i13 == 0) {
            return;
        }
        hg.agtfadlqog.cllcsxoeiz(this.f4400iobyxmoadg, 0, i13);
    }

    public final void wflxmlrfwp(int i13) {
        int[] iArr = this.f4400iobyxmoadg;
        if (iArr.length < i13) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i13, (iArr.length * 3) / 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f4400iobyxmoadg = iArrCopyOf;
        }
    }

    public /* synthetic */ yadqdtsiqt(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 16 : i13);
    }
}

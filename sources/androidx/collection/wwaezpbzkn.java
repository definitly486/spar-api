package androidx.collection;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wwaezpbzkn extends zdlpuopuiu {
    public wwaezpbzkn(int i13) {
        super(i13, null);
    }

    public final void dxjokdxxww(int i13, int i14) {
        int i15;
        if (i13 < 0 || i13 > (i15 = this.f4414zoijcleaow) || i14 < 0 || i14 > i15) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        if (i14 < i13) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("The end index must be < start index");
        }
        if (i14 != i13) {
            int i16 = this.f4414zoijcleaow;
            if (i14 < i16) {
                long[] jArr = this.f4413iobyxmoadg;
                hg.agtfadlqog.wflxmlrfwp(jArr, jArr, i13, i14, i16);
            }
            this.f4414zoijcleaow -= i14 - i13;
        }
    }

    public final boolean eablkybsjg(int i13, long[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (i13 < 0 || i13 > this.f4414zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("");
        }
        if (elements.length == 0) {
            return false;
        }
        lqeggnwhkg(this.f4414zoijcleaow + elements.length);
        long[] jArr = this.f4413iobyxmoadg;
        int i14 = this.f4414zoijcleaow;
        if (i13 != i14) {
            hg.agtfadlqog.wflxmlrfwp(jArr, jArr, elements.length + i13, i13, i14);
        }
        hg.agtfadlqog.oxmwwwfdhm(elements, jArr, i13, 0, 0, 12, null);
        this.f4414zoijcleaow += elements.length;
        return true;
    }

    public final void gxszxtbevo() {
        this.f4414zoijcleaow = 0;
    }

    public final void lqeggnwhkg(int i13) {
        long[] jArr = this.f4413iobyxmoadg;
        if (jArr.length < i13) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i13, (jArr.length * 3) / 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
            this.f4413iobyxmoadg = jArrCopyOf;
        }
    }

    public final long nufgyqmvbu(int i13) {
        if (i13 < 0 || i13 >= this.f4414zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        long[] jArr = this.f4413iobyxmoadg;
        long j13 = jArr[i13];
        int i14 = this.f4414zoijcleaow;
        if (i13 != i14 - 1) {
            hg.agtfadlqog.wflxmlrfwp(jArr, jArr, i13, i13 + 1, i14);
        }
        this.f4414zoijcleaow--;
        return j13;
    }

    public final boolean wkgbmnqykc(long j13) {
        lqeggnwhkg(this.f4414zoijcleaow + 1);
        long[] jArr = this.f4413iobyxmoadg;
        int i13 = this.f4414zoijcleaow;
        jArr[i13] = j13;
        this.f4414zoijcleaow = i13 + 1;
        return true;
    }

    public /* synthetic */ wwaezpbzkn(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 16 : i13);
    }
}

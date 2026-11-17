package c41;

import j0.eablkybsjg;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.jhduphickx;
import p0.okpsazkaxt;
import p0.ylkuphrtab;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements okpsazkaxt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final char f18729ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f18730wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f18731zoijcleaow;

    /* JADX INFO: renamed from: c41.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0342iobyxmoadg implements ylkuphrtab {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final char f18732ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18733zoijcleaow;

        public C0342iobyxmoadg(String mask, char c13) {
            zdlpuopuiu.btonecajqb(mask, "mask");
            this.f18733zoijcleaow = mask;
            this.f18732ppxfxbqfkf = c13;
        }

        @Override // p0.ylkuphrtab
        public int iobyxmoadg(int i13) {
            String strY = kcexrzcfyt.y(this.f18733zoijcleaow, i13);
            int i14 = 0;
            for (int i15 = 0; i15 < strY.length(); i15++) {
                if (strY.charAt(i15) != this.f18732ppxfxbqfkf) {
                    i14++;
                }
            }
            return i13 - i14;
        }

        @Override // p0.ylkuphrtab
        public int zoijcleaow(int i13) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = i13 + i15;
                if (i14 >= i16) {
                    return i16;
                }
                int i17 = i14 + 1;
                if (this.f18733zoijcleaow.charAt(i14) != this.f18732ppxfxbqfkf) {
                    i15++;
                }
                i14 = i17;
            }
        }
    }

    public iobyxmoadg(String mask, char c13) {
        zdlpuopuiu.btonecajqb(mask, "mask");
        this.f18731zoijcleaow = mask;
        this.f18729ppxfxbqfkf = c13;
        int i13 = 0;
        for (int i14 = 0; i14 < mask.length(); i14++) {
            if (mask.charAt(i14) == this.f18729ppxfxbqfkf) {
                i13++;
            }
        }
        this.f18730wkgbmnqykc = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f18731zoijcleaow, iobyxmoadgVar.f18731zoijcleaow) && this.f18729ppxfxbqfkf == iobyxmoadgVar.f18729ppxfxbqfkf;
    }

    public int hashCode() {
        return this.f18731zoijcleaow.hashCode();
    }

    @Override // p0.okpsazkaxt
    public jhduphickx iobyxmoadg(eablkybsjg text) {
        zdlpuopuiu.btonecajqb(text, "text");
        int length = text.length();
        int i13 = this.f18730wkgbmnqykc;
        CharSequence charSequenceX = text;
        if (length > i13) {
            charSequenceX = kcexrzcfyt.x(text, i13);
        }
        eablkybsjg.zoijcleaow zoijcleaowVar = new eablkybsjg.zoijcleaow(0, 1, null);
        if (charSequenceX.length() != 0) {
            int i14 = 0;
            for (int i15 = 0; i15 < charSequenceX.length() && i14 < this.f18731zoijcleaow.length(); i15++) {
                char cCharAt = this.f18731zoijcleaow.charAt(i14);
                char c13 = this.f18729ppxfxbqfkf;
                if (cCharAt != c13) {
                    int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(this.f18731zoijcleaow, c13, i14, false, 4, null);
                    String strSubstring = this.f18731zoijcleaow.substring(i14, iYfnezrywwk);
                    zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                    zoijcleaowVar.gtknphoqwx(strSubstring);
                    i14 = iYfnezrywwk;
                }
                zoijcleaowVar.append(charSequenceX.charAt(i15));
                i14++;
            }
        }
        return new jhduphickx(zoijcleaowVar.yggfygwlhe(), new C0342iobyxmoadg(this.f18731zoijcleaow, this.f18729ppxfxbqfkf));
    }
}

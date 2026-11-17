package l0;

import java.text.BreakIterator;
import java.util.Locale;
import k0.cdpycssgdh;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f61205eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f61206gxszxtbevo = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f61207iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f61208ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final BreakIterator f61209wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f61210zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg(int i13) {
            int type = Character.getType(i13);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private iobyxmoadg() {
        }
    }

    public dxjokdxxww(CharSequence charSequence, int i13, int i14, Locale locale) {
        this.f61207iobyxmoadg = charSequence;
        if (!(i13 >= 0 && i13 <= charSequence.length())) {
            q0.iobyxmoadg.iobyxmoadg("input start index is outside the CharSequence");
        }
        if (!(i14 >= 0 && i14 <= charSequence.length())) {
            q0.iobyxmoadg.iobyxmoadg("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f61209wkgbmnqykc = wordInstance;
        this.f61210zoijcleaow = Math.max(0, i13 - 50);
        this.f61208ppxfxbqfkf = Math.min(charSequence.length(), i14 + 50);
        wordInstance.setText(new cdpycssgdh(charSequence, i13, i14));
    }

    private final boolean agtfadlqog(int i13) {
        return !wflxmlrfwp(i13) && dxjokdxxww(i13);
    }

    private final boolean btonecajqb(int i13) {
        iobyxmoadg(i13);
        if (this.f61209wkgbmnqykc.isBoundary(i13) && (!draadjrbmk(i13) || !draadjrbmk(i13 - 1) || !draadjrbmk(i13 + 1))) {
            if (i13 <= 0 || i13 >= this.f61207iobyxmoadg.length() - 1) {
                return true;
            }
            if (!gtknphoqwx(i13) && !gtknphoqwx(i13 + 1)) {
                return true;
            }
        }
        return false;
    }

    private final boolean draadjrbmk(int i13) {
        int i14 = this.f61210zoijcleaow;
        if (i13 >= this.f61208ppxfxbqfkf || i14 > i13) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.f61207iobyxmoadg, i13)) || Character.isSurrogate(this.f61207iobyxmoadg.charAt(i13))) {
            return true;
        }
        if (!i2.iobyxmoadg.wkgbmnqykc()) {
            return false;
        }
        i2.iobyxmoadg.iobyxmoadg();
        throw null;
    }

    private final boolean gtknphoqwx(int i13) {
        int i14 = i13 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.f61207iobyxmoadg.charAt(i14));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        return (zdlpuopuiu.eablkybsjg(unicodeBlockOf, unicodeBlock) && zdlpuopuiu.eablkybsjg(Character.UnicodeBlock.of(this.f61207iobyxmoadg.charAt(i13)), Character.UnicodeBlock.KATAKANA)) || (zdlpuopuiu.eablkybsjg(Character.UnicodeBlock.of(this.f61207iobyxmoadg.charAt(i13)), unicodeBlock) && zdlpuopuiu.eablkybsjg(Character.UnicodeBlock.of(this.f61207iobyxmoadg.charAt(i14)), Character.UnicodeBlock.KATAKANA));
    }

    private final void iobyxmoadg(int i13) {
        int i14 = this.f61210zoijcleaow;
        boolean z13 = false;
        if (i13 <= this.f61208ppxfxbqfkf && i14 <= i13) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("Invalid offset: " + i13 + ". Valid range is [" + this.f61210zoijcleaow + " , " + this.f61208ppxfxbqfkf + ']');
    }

    private final boolean nufgyqmvbu(int i13) {
        int i14 = this.f61210zoijcleaow + 1;
        if (i13 > this.f61208ppxfxbqfkf || i14 > i13) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.f61207iobyxmoadg, i13)) || Character.isSurrogate(this.f61207iobyxmoadg.charAt(i13 - 1))) {
            return true;
        }
        if (!i2.iobyxmoadg.wkgbmnqykc()) {
            return false;
        }
        i2.iobyxmoadg.iobyxmoadg();
        throw null;
    }

    private final boolean ojitshcjhn(int i13) {
        return wflxmlrfwp(i13) && !dxjokdxxww(i13);
    }

    private final int ppxfxbqfkf(int i13, boolean z13) {
        iobyxmoadg(i13);
        if (nufgyqmvbu(i13)) {
            return (!btonecajqb(i13) || (draadjrbmk(i13) && z13)) ? rgvfuqvkyq(i13) : i13;
        }
        if (draadjrbmk(i13)) {
            return rgvfuqvkyq(i13);
        }
        return -1;
    }

    private final int zoijcleaow(int i13, boolean z13) {
        iobyxmoadg(i13);
        if (draadjrbmk(i13)) {
            return (!btonecajqb(i13) || (nufgyqmvbu(i13) && z13)) ? vdvldrhtss(i13) : i13;
        }
        if (nufgyqmvbu(i13)) {
            return vdvldrhtss(i13);
        }
        return -1;
    }

    public final boolean dxjokdxxww(int i13) {
        int i14 = this.f61210zoijcleaow + 1;
        if (i13 > this.f61208ppxfxbqfkf || i14 > i13) {
            return false;
        }
        return f61205eablkybsjg.iobyxmoadg(Character.codePointBefore(this.f61207iobyxmoadg, i13));
    }

    public final int eablkybsjg(int i13) {
        return zoijcleaow(i13, true);
    }

    public final int gxszxtbevo(int i13) {
        iobyxmoadg(i13);
        while (i13 != -1 && !ojitshcjhn(i13)) {
            i13 = vdvldrhtss(i13);
        }
        return i13;
    }

    public final int lqeggnwhkg(int i13) {
        iobyxmoadg(i13);
        while (i13 != -1 && !agtfadlqog(i13)) {
            i13 = rgvfuqvkyq(i13);
        }
        return i13;
    }

    public final int rgvfuqvkyq(int i13) {
        iobyxmoadg(i13);
        int iFollowing = this.f61209wkgbmnqykc.following(i13);
        return (draadjrbmk(iFollowing + (-1)) && draadjrbmk(iFollowing) && !gtknphoqwx(iFollowing)) ? rgvfuqvkyq(iFollowing) : iFollowing;
    }

    public final int vdvldrhtss(int i13) {
        iobyxmoadg(i13);
        int iPreceding = this.f61209wkgbmnqykc.preceding(i13);
        return (draadjrbmk(iPreceding) && nufgyqmvbu(iPreceding) && !gtknphoqwx(iPreceding)) ? vdvldrhtss(iPreceding) : iPreceding;
    }

    public final boolean wflxmlrfwp(int i13) {
        int i14 = this.f61210zoijcleaow;
        if (i13 >= this.f61208ppxfxbqfkf || i14 > i13) {
            return false;
        }
        return f61205eablkybsjg.iobyxmoadg(Character.codePointAt(this.f61207iobyxmoadg, i13));
    }

    public final int wkgbmnqykc(int i13) {
        return ppxfxbqfkf(i13, true);
    }
}

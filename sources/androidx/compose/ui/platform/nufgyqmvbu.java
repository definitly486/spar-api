package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu extends zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static nufgyqmvbu f7018gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private BreakIterator f7020ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f7019wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f7017eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg(Locale locale) {
            if (nufgyqmvbu.f7018gxszxtbevo == null) {
                nufgyqmvbu.f7018gxszxtbevo = new nufgyqmvbu(locale, null);
            }
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f7018gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return nufgyqmvbuVar;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ nufgyqmvbu(Locale locale, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(locale);
    }

    private final boolean btonecajqb(int i13) {
        if (i13 < 0 || i13 >= wkgbmnqykc().length()) {
            return false;
        }
        return Character.isLetterOrDigit(wkgbmnqykc().codePointAt(i13));
    }

    private final void draadjrbmk(Locale locale) {
        this.f7020ppxfxbqfkf = BreakIterator.getWordInstance(locale);
    }

    private final boolean dxjokdxxww(int i13) {
        return i13 > 0 && btonecajqb(i13 + (-1)) && (i13 == wkgbmnqykc().length() || !btonecajqb(i13));
    }

    private final boolean gtknphoqwx(int i13) {
        return btonecajqb(i13) && (i13 == 0 || !btonecajqb(i13 - 1));
    }

    @Override // androidx.compose.ui.platform.zoijcleaow
    public void eablkybsjg(String str) {
        super.eablkybsjg(str);
        BreakIterator breakIterator = this.f7020ppxfxbqfkf;
        if (breakIterator == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] iobyxmoadg(int i13) {
        if (wkgbmnqykc().length() <= 0 || i13 >= wkgbmnqykc().length()) {
            return null;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        while (!btonecajqb(i13) && !gtknphoqwx(i13)) {
            BreakIterator breakIterator = this.f7020ppxfxbqfkf;
            if (breakIterator == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                breakIterator = null;
            }
            i13 = breakIterator.following(i13);
            if (i13 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f7020ppxfxbqfkf;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i13);
        if (iFollowing == -1 || !dxjokdxxww(iFollowing)) {
            return null;
        }
        return ppxfxbqfkf(i13, iFollowing);
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] zoijcleaow(int i13) {
        int length = wkgbmnqykc().length();
        if (length <= 0 || i13 <= 0) {
            return null;
        }
        if (i13 > length) {
            i13 = length;
        }
        while (i13 > 0 && !btonecajqb(i13 - 1) && !dxjokdxxww(i13)) {
            BreakIterator breakIterator = this.f7020ppxfxbqfkf;
            if (breakIterator == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                breakIterator = null;
            }
            i13 = breakIterator.preceding(i13);
            if (i13 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f7020ppxfxbqfkf;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i13);
        if (iPreceding == -1 || !gtknphoqwx(iPreceding)) {
            return null;
        }
        return ppxfxbqfkf(iPreceding, i13);
    }

    private nufgyqmvbu(Locale locale) {
        draadjrbmk(locale);
    }
}

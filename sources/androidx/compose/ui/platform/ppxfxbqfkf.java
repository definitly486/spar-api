package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static ppxfxbqfkf f7031gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private BreakIterator f7033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f7032wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f7030eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(Locale locale) {
            if (ppxfxbqfkf.f7031gxszxtbevo == null) {
                ppxfxbqfkf.f7031gxszxtbevo = new ppxfxbqfkf(locale, null);
            }
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.f7031gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return ppxfxbqfkfVar;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ ppxfxbqfkf(Locale locale, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(locale);
    }

    private final void dxjokdxxww(Locale locale) {
        this.f7033ppxfxbqfkf = BreakIterator.getCharacterInstance(locale);
    }

    @Override // androidx.compose.ui.platform.zoijcleaow
    public void eablkybsjg(String str) {
        super.eablkybsjg(str);
        BreakIterator breakIterator = this.f7033ppxfxbqfkf;
        if (breakIterator == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] iobyxmoadg(int i13) {
        int length = wkgbmnqykc().length();
        if (length <= 0 || i13 >= length) {
            return null;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        do {
            BreakIterator breakIterator = this.f7033ppxfxbqfkf;
            if (breakIterator == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i13)) {
                BreakIterator breakIterator2 = this.f7033ppxfxbqfkf;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i13);
                if (iFollowing == -1) {
                    return null;
                }
                return ppxfxbqfkf(i13, iFollowing);
            }
            BreakIterator breakIterator3 = this.f7033ppxfxbqfkf;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                breakIterator3 = null;
            }
            i13 = breakIterator3.following(i13);
        } while (i13 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f7033ppxfxbqfkf;
            if (breakIterator == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i13)) {
                BreakIterator breakIterator2 = this.f7033ppxfxbqfkf;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i13);
                if (iPreceding == -1) {
                    return null;
                }
                return ppxfxbqfkf(iPreceding, i13);
            }
            BreakIterator breakIterator3 = this.f7033ppxfxbqfkf;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("impl");
                breakIterator3 = null;
            }
            i13 = breakIterator3.preceding(i13);
        } while (i13 != -1);
        return null;
    }

    private ppxfxbqfkf(Locale locale) {
        dxjokdxxww(locale);
    }
}

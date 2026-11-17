package mj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq implements Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f67306yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Pattern f67307zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f67308zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, draadjrbmk.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final draadjrbmk invoke(draadjrbmk p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return p13.next();
        }
    }

    private static final class zoijcleaow implements Serializable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final iobyxmoadg f67309jyumaefscl = new iobyxmoadg(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f67310yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f67311zdlpuopuiu;

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private iobyxmoadg() {
            }
        }

        public zoijcleaow(String pattern, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pattern, "pattern");
            this.f67311zdlpuopuiu = pattern;
            this.f67310yggfygwlhe = i13;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f67311zdlpuopuiu, this.f67310yggfygwlhe);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(patternCompile, "compile(...)");
            return new rgvfuqvkyq(patternCompile);
        }
    }

    public rgvfuqvkyq(Pattern nativePattern) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nativePattern, "nativePattern");
        this.f67307zdlpuopuiu = nativePattern;
    }

    public static /* synthetic */ lj.btonecajqb btonecajqb(rgvfuqvkyq rgvfuqvkyqVar, CharSequence charSequence, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return rgvfuqvkyqVar.dxjokdxxww(charSequence, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk draadjrbmk(rgvfuqvkyq rgvfuqvkyqVar, CharSequence charSequence, int i13) {
        return rgvfuqvkyqVar.lqeggnwhkg(charSequence, i13);
    }

    public static /* synthetic */ draadjrbmk nufgyqmvbu(rgvfuqvkyq rgvfuqvkyqVar, CharSequence charSequence, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return rgvfuqvkyqVar.lqeggnwhkg(charSequence, i13);
    }

    private final Object writeReplace() {
        String strPattern = this.f67307zdlpuopuiu.pattern();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strPattern, "pattern(...)");
        return new zoijcleaow(strPattern, this.f67307zdlpuopuiu.flags());
    }

    public final draadjrbmk agtfadlqog(CharSequence input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        Matcher matcher = this.f67307zdlpuopuiu.matcher(input);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(matcher, "matcher(...)");
        return vdvldrhtss.gxszxtbevo(matcher, input);
    }

    public final lj.btonecajqb dxjokdxxww(final CharSequence input, final int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        if (i13 >= 0 && i13 <= input.length()) {
            return lj.wflxmlrfwp.rgvfuqvkyq(new tg.iobyxmoadg() { // from class: mj.ojitshcjhn
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return rgvfuqvkyq.draadjrbmk(this.f67303zdlpuopuiu, input, i13);
                }
            }, ppxfxbqfkf.f67308zdlpuopuiu);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i13 + ", input length: " + input.length());
    }

    public final List kcexrzcfyt(CharSequence input, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        lmojexxdyd.ageimvtcrz(i13);
        Matcher matcher = this.f67307zdlpuopuiu.matcher(input);
        if (i13 == 1 || !matcher.find()) {
            return hg.jyumaefscl.eablkybsjg(input.toString());
        }
        ArrayList arrayList = new ArrayList(i13 > 0 ? zg.gtknphoqwx.btonecajqb(i13, 10) : 10);
        int i14 = i13 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i14 >= 0 && arrayList.size() == i14) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final draadjrbmk lqeggnwhkg(CharSequence input, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        Matcher matcher = this.f67307zdlpuopuiu.matcher(input);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(matcher, "matcher(...)");
        return vdvldrhtss.eablkybsjg(matcher, i13, input);
    }

    public final boolean ojitshcjhn(CharSequence input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        return this.f67307zdlpuopuiu.matcher(input).matches();
    }

    public final String rgvfuqvkyq(CharSequence input, String replacement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replacement, "replacement");
        String strReplaceAll = this.f67307zdlpuopuiu.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f67307zdlpuopuiu.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String vdvldrhtss(CharSequence input, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        int iIntValue = 0;
        draadjrbmk draadjrbmkVarNufgyqmvbu = nufgyqmvbu(this, input, 0, 2, null);
        if (draadjrbmkVarNufgyqmvbu == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb3 = new StringBuilder(length);
        do {
            sb3.append(input, iIntValue, draadjrbmkVarNufgyqmvbu.ppxfxbqfkf().wflxmlrfwp().intValue());
            sb3.append((CharSequence) transform.invoke(draadjrbmkVarNufgyqmvbu));
            iIntValue = draadjrbmkVarNufgyqmvbu.ppxfxbqfkf().draadjrbmk().intValue() + 1;
            draadjrbmkVarNufgyqmvbu = draadjrbmkVarNufgyqmvbu.next();
            if (iIntValue >= length) {
                break;
            }
        } while (draadjrbmkVarNufgyqmvbu != null);
        if (iIntValue < length) {
            sb3.append(input, iIntValue, length);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final boolean wkgbmnqykc(CharSequence input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        return this.f67307zdlpuopuiu.matcher(input).find();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rgvfuqvkyq(String pattern) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(patternCompile, "compile(...)");
        this(patternCompile);
    }
}

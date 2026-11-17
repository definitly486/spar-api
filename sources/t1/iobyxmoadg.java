package t1;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f109270eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f109271gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final iobyxmoadg f109272lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    static final iobyxmoadg f109273nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final wflxmlrfwp f109274wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f109275iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f109276ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f109277zoijcleaow;

    /* JADX INFO: renamed from: t1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2683iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f109278iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private wflxmlrfwp f109279ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f109280zoijcleaow;

        public C2683iobyxmoadg() {
            ppxfxbqfkf(iobyxmoadg.eablkybsjg(Locale.getDefault()));
        }

        private void ppxfxbqfkf(boolean z13) {
            this.f109278iobyxmoadg = z13;
            this.f109279ppxfxbqfkf = iobyxmoadg.f109274wkgbmnqykc;
            this.f109280zoijcleaow = 2;
        }

        private static iobyxmoadg zoijcleaow(boolean z13) {
            return z13 ? iobyxmoadg.f109273nufgyqmvbu : iobyxmoadg.f109272lqeggnwhkg;
        }

        public iobyxmoadg iobyxmoadg() {
            return (this.f109280zoijcleaow == 2 && this.f109279ppxfxbqfkf == iobyxmoadg.f109274wkgbmnqykc) ? zoijcleaow(this.f109278iobyxmoadg) : new iobyxmoadg(this.f109278iobyxmoadg, this.f109280zoijcleaow, this.f109279ppxfxbqfkf);
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final byte[] f109281gxszxtbevo = new byte[1792];

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private char f109282eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f109283iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f109284ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f109285wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f109286zoijcleaow;

        static {
            for (int i13 = 0; i13 < 1792; i13++) {
                f109281gxszxtbevo[i13] = Character.getDirectionality(i13);
            }
        }

        zoijcleaow(CharSequence charSequence, boolean z13) {
            this.f109283iobyxmoadg = charSequence;
            this.f109286zoijcleaow = z13;
            this.f109284ppxfxbqfkf = charSequence.length();
        }

        private byte dxjokdxxww() {
            char cCharAt;
            int i13 = this.f109285wkgbmnqykc;
            while (true) {
                int i14 = this.f109285wkgbmnqykc;
                if (i14 >= this.f109284ppxfxbqfkf) {
                    this.f109285wkgbmnqykc = i13;
                    this.f109282eablkybsjg = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f109283iobyxmoadg;
                this.f109285wkgbmnqykc = i14 + 1;
                char cCharAt2 = charSequence.charAt(i14);
                this.f109282eablkybsjg = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i15 = this.f109285wkgbmnqykc;
                        if (i15 >= this.f109284ppxfxbqfkf) {
                            break;
                        }
                        CharSequence charSequence2 = this.f109283iobyxmoadg;
                        this.f109285wkgbmnqykc = i15 + 1;
                        cCharAt = charSequence2.charAt(i15);
                        this.f109282eablkybsjg = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        private byte gxszxtbevo() {
            char cCharAt;
            int i13 = this.f109285wkgbmnqykc;
            do {
                int i14 = this.f109285wkgbmnqykc;
                if (i14 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f109283iobyxmoadg;
                int i15 = i14 - 1;
                this.f109285wkgbmnqykc = i15;
                cCharAt = charSequence.charAt(i15);
                this.f109282eablkybsjg = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f109285wkgbmnqykc = i13;
            this.f109282eablkybsjg = ';';
            return (byte) 13;
        }

        private byte lqeggnwhkg() {
            char cCharAt;
            do {
                int i13 = this.f109285wkgbmnqykc;
                if (i13 >= this.f109284ppxfxbqfkf) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f109283iobyxmoadg;
                this.f109285wkgbmnqykc = i13 + 1;
                cCharAt = charSequence.charAt(i13);
                this.f109282eablkybsjg = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte nufgyqmvbu() {
            char cCharAt;
            int i13 = this.f109285wkgbmnqykc;
            while (true) {
                int i14 = this.f109285wkgbmnqykc;
                if (i14 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f109283iobyxmoadg;
                int i15 = i14 - 1;
                this.f109285wkgbmnqykc = i15;
                char cCharAt2 = charSequence.charAt(i15);
                this.f109282eablkybsjg = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i16 = this.f109285wkgbmnqykc;
                        if (i16 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f109283iobyxmoadg;
                        int i17 = i16 - 1;
                        this.f109285wkgbmnqykc = i17;
                        cCharAt = charSequence2.charAt(i17);
                        this.f109282eablkybsjg = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f109285wkgbmnqykc = i13;
            this.f109282eablkybsjg = '>';
            return (byte) 13;
        }

        private static byte ppxfxbqfkf(char c13) {
            return c13 < 1792 ? f109281gxszxtbevo[c13] : Character.getDirectionality(c13);
        }

        int eablkybsjg() {
            this.f109285wkgbmnqykc = this.f109284ppxfxbqfkf;
            int i13 = 0;
            while (true) {
                int i14 = i13;
                while (this.f109285wkgbmnqykc > 0) {
                    byte bIobyxmoadg = iobyxmoadg();
                    if (bIobyxmoadg == 0) {
                        if (i13 == 0) {
                            return -1;
                        }
                        if (i14 == 0) {
                        }
                    } else if (bIobyxmoadg == 1 || bIobyxmoadg == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                        if (i14 == 0) {
                        }
                    } else if (bIobyxmoadg != 9) {
                        switch (bIobyxmoadg) {
                            case 14:
                            case 15:
                                if (i14 == i13) {
                                    return -1;
                                }
                                i13--;
                                break;
                            case 16:
                            case 17:
                                if (i14 == i13) {
                                    return 1;
                                }
                                i13--;
                                break;
                            case 18:
                                i13++;
                                break;
                            default:
                                if (i14 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        byte iobyxmoadg() {
            char cCharAt = this.f109283iobyxmoadg.charAt(this.f109285wkgbmnqykc - 1);
            this.f109282eablkybsjg = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f109283iobyxmoadg, this.f109285wkgbmnqykc);
                this.f109285wkgbmnqykc -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f109285wkgbmnqykc--;
            byte bPpxfxbqfkf = ppxfxbqfkf(this.f109282eablkybsjg);
            if (!this.f109286zoijcleaow) {
                return bPpxfxbqfkf;
            }
            char c13 = this.f109282eablkybsjg;
            if (c13 == '>') {
                return nufgyqmvbu();
            }
            return c13 == ';' ? gxszxtbevo() : bPpxfxbqfkf;
        }

        int wkgbmnqykc() {
            this.f109285wkgbmnqykc = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (this.f109285wkgbmnqykc < this.f109284ppxfxbqfkf && i13 == 0) {
                byte bZoijcleaow = zoijcleaow();
                if (bZoijcleaow != 0) {
                    if (bZoijcleaow == 1 || bZoijcleaow == 2) {
                        if (i15 == 0) {
                            return 1;
                        }
                    } else if (bZoijcleaow != 9) {
                        switch (bZoijcleaow) {
                            case 14:
                            case 15:
                                i15++;
                                i14 = -1;
                                continue;
                            case 16:
                            case 17:
                                i15++;
                                i14 = 1;
                                continue;
                            case 18:
                                i15--;
                                i14 = 0;
                                continue;
                        }
                    }
                } else if (i15 == 0) {
                    return -1;
                }
                i13 = i15;
            }
            if (i13 == 0) {
                return 0;
            }
            if (i14 != 0) {
                return i14;
            }
            while (this.f109285wkgbmnqykc > 0) {
                switch (iobyxmoadg()) {
                    case 14:
                    case 15:
                        if (i13 == i15) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i13 == i15) {
                            return 1;
                        }
                        break;
                    case 18:
                        i15++;
                        continue;
                    default:
                        continue;
                }
                i15--;
            }
            return 0;
        }

        byte zoijcleaow() {
            char cCharAt = this.f109283iobyxmoadg.charAt(this.f109285wkgbmnqykc);
            this.f109282eablkybsjg = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f109283iobyxmoadg, this.f109285wkgbmnqykc);
                this.f109285wkgbmnqykc += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f109285wkgbmnqykc++;
            byte bPpxfxbqfkf = ppxfxbqfkf(this.f109282eablkybsjg);
            if (!this.f109286zoijcleaow) {
                return bPpxfxbqfkf;
            }
            char c13 = this.f109282eablkybsjg;
            if (c13 == '<') {
                return dxjokdxxww();
            }
            return c13 == '&' ? lqeggnwhkg() : bPpxfxbqfkf;
        }
    }

    static {
        wflxmlrfwp wflxmlrfwpVar = agtfadlqog.f109252ppxfxbqfkf;
        f109274wkgbmnqykc = wflxmlrfwpVar;
        f109270eablkybsjg = Character.toString((char) 8206);
        f109271gxszxtbevo = Character.toString((char) 8207);
        f109272lqeggnwhkg = new iobyxmoadg(false, 2, wflxmlrfwpVar);
        f109273nufgyqmvbu = new iobyxmoadg(true, 2, wflxmlrfwpVar);
    }

    iobyxmoadg(boolean z13, int i13, wflxmlrfwp wflxmlrfwpVar) {
        this.f109275iobyxmoadg = z13;
        this.f109277zoijcleaow = i13;
        this.f109276ppxfxbqfkf = wflxmlrfwpVar;
    }

    static boolean eablkybsjg(Locale locale) {
        return ojitshcjhn.iobyxmoadg(locale) == 1;
    }

    private String gxszxtbevo(CharSequence charSequence, wflxmlrfwp wflxmlrfwpVar) {
        boolean zIobyxmoadg = wflxmlrfwpVar.iobyxmoadg(charSequence, 0, charSequence.length());
        if (!this.f109275iobyxmoadg && (zIobyxmoadg || zoijcleaow(charSequence) == 1)) {
            return f109270eablkybsjg;
        }
        if (this.f109275iobyxmoadg) {
            return (!zIobyxmoadg || zoijcleaow(charSequence) == -1) ? f109271gxszxtbevo : "";
        }
        return "";
    }

    private static int iobyxmoadg(CharSequence charSequence) {
        return new zoijcleaow(charSequence, false).wkgbmnqykc();
    }

    private String lqeggnwhkg(CharSequence charSequence, wflxmlrfwp wflxmlrfwpVar) {
        boolean zIobyxmoadg = wflxmlrfwpVar.iobyxmoadg(charSequence, 0, charSequence.length());
        if (!this.f109275iobyxmoadg && (zIobyxmoadg || iobyxmoadg(charSequence) == 1)) {
            return f109270eablkybsjg;
        }
        if (this.f109275iobyxmoadg) {
            return (!zIobyxmoadg || iobyxmoadg(charSequence) == -1) ? f109271gxszxtbevo : "";
        }
        return "";
    }

    public static iobyxmoadg ppxfxbqfkf() {
        return new C2683iobyxmoadg().iobyxmoadg();
    }

    private static int zoijcleaow(CharSequence charSequence) {
        return new zoijcleaow(charSequence, false).eablkybsjg();
    }

    public String btonecajqb(String str) {
        return gtknphoqwx(str, this.f109276ppxfxbqfkf, true);
    }

    public CharSequence dxjokdxxww(CharSequence charSequence, wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        if (charSequence == null) {
            return null;
        }
        boolean zIobyxmoadg = wflxmlrfwpVar.iobyxmoadg(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (wkgbmnqykc() && z13) {
            spannableStringBuilder.append((CharSequence) lqeggnwhkg(charSequence, zIobyxmoadg ? agtfadlqog.f109254zoijcleaow : agtfadlqog.f109251iobyxmoadg));
        }
        if (zIobyxmoadg != this.f109275iobyxmoadg) {
            spannableStringBuilder.append(zIobyxmoadg ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z13) {
            spannableStringBuilder.append((CharSequence) gxszxtbevo(charSequence, zIobyxmoadg ? agtfadlqog.f109254zoijcleaow : agtfadlqog.f109251iobyxmoadg));
        }
        return spannableStringBuilder;
    }

    public String gtknphoqwx(String str, wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        if (str == null) {
            return null;
        }
        return dxjokdxxww(str, wflxmlrfwpVar, z13).toString();
    }

    public CharSequence nufgyqmvbu(CharSequence charSequence) {
        return dxjokdxxww(charSequence, this.f109276ppxfxbqfkf, true);
    }

    public boolean wkgbmnqykc() {
        return (this.f109277zoijcleaow & 2) != 0;
    }
}

package xa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf implements wflxmlrfwp {

    static abstract class iobyxmoadg extends ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // xa.wflxmlrfwp
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.zoijcleaow((Character) obj);
        }
    }

    /* JADX INFO: renamed from: xa.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static abstract class AbstractC3066ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f121874zdlpuopuiu;

        AbstractC3066ppxfxbqfkf(String str) {
            this.f121874zdlpuopuiu = (String) draadjrbmk.btonecajqb(str);
        }

        public final String toString() {
            return this.f121874zdlpuopuiu;
        }
    }

    private static final class wkgbmnqykc extends AbstractC3066ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        static final ppxfxbqfkf f121875yggfygwlhe = new wkgbmnqykc();

        private wkgbmnqykc() {
            super("CharMatcher.none()");
        }

        @Override // xa.ppxfxbqfkf
        public boolean eablkybsjg(char c13) {
            return false;
        }

        @Override // xa.ppxfxbqfkf
        public int ppxfxbqfkf(CharSequence charSequence, int i13) {
            draadjrbmk.draadjrbmk(i13, charSequence.length());
            return -1;
        }
    }

    private static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final char f121876zdlpuopuiu;

        zoijcleaow(char c13) {
            this.f121876zdlpuopuiu = c13;
        }

        @Override // xa.ppxfxbqfkf
        public boolean eablkybsjg(char c13) {
            return c13 == this.f121876zdlpuopuiu;
        }

        public String toString() {
            return "CharMatcher.is('" + ppxfxbqfkf.lqeggnwhkg(this.f121876zdlpuopuiu) + "')";
        }
    }

    protected ppxfxbqfkf() {
    }

    public static ppxfxbqfkf gxszxtbevo() {
        return wkgbmnqykc.f121875yggfygwlhe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lqeggnwhkg(char c13) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            cArr[5 - i13] = "0123456789ABCDEF".charAt(c13 & 15);
            c13 = (char) (c13 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static ppxfxbqfkf wkgbmnqykc(char c13) {
        return new zoijcleaow(c13);
    }

    public abstract boolean eablkybsjg(char c13);

    public int ppxfxbqfkf(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        draadjrbmk.draadjrbmk(i13, length);
        while (i13 < length) {
            if (eablkybsjg(charSequence.charAt(i13))) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public boolean zoijcleaow(Character ch2) {
        return eablkybsjg(ch2.charValue());
    }
}

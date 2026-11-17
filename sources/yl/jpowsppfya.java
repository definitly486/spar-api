package yl;

/* JADX INFO: loaded from: classes3.dex */
public class jpowsppfya implements AutoCloseable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final draadjrbmk f125777zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final char[] f125776yggfygwlhe = {'*', '|', '_', '-'};

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final char[] f125775jyumaefscl = {'-', '_'};

    public jpowsppfya(String str) {
        this.f125777zdlpuopuiu = new draadjrbmk(str);
    }

    private String agtfadlqog(char... cArr) {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        while (!kcexrzcfyt()) {
            char cVdvldrhtss = vdvldrhtss();
            if (cVdvldrhtss != '\\') {
                if (!dsvhmnatus(cArr)) {
                    break;
                }
                sbEablkybsjg.append(cVdvldrhtss);
                wkgbmnqykc();
            } else {
                wkgbmnqykc();
                if (kcexrzcfyt()) {
                    break;
                }
                sbEablkybsjg.append(nufgyqmvbu());
            }
        }
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    private static boolean cqumvgiudr(char c13) {
        return c13 == '\n' || c13 == '\r' || c13 == '\f';
    }

    private boolean dsvhmnatus(char... cArr) {
        return kegysxyocb() || this.f125777zdlpuopuiu.f(cArr);
    }

    private void dxjokdxxww(StringBuilder sb3) {
        if (kcexrzcfyt()) {
            sb3.append((char) 65533);
            return;
        }
        char cNufgyqmvbu = nufgyqmvbu();
        if (!wl.kcexrzcfyt.draadjrbmk(cNufgyqmvbu)) {
            sb3.append(cNufgyqmvbu);
            return;
        }
        this.f125777zdlpuopuiu.M();
        String strDsvhmnatus = this.f125777zdlpuopuiu.dsvhmnatus(new gtknphoqwx(), 6);
        try {
            int i13 = Integer.parseInt(strDsvhmnatus, 16);
            if (pmvmpeiblj(i13)) {
                sb3.appendCodePoint(i13);
            } else {
                sb3.append((char) 65533);
            }
            if (kcexrzcfyt()) {
                return;
            }
            char cVdvldrhtss = vdvldrhtss();
            if (cVdvldrhtss == '\r') {
                wkgbmnqykc();
                if (kcexrzcfyt() || vdvldrhtss() != '\n') {
                    return;
                }
                wkgbmnqykc();
                return;
            }
            if (cVdvldrhtss == ' ' || cVdvldrhtss == '\t' || cqumvgiudr(cVdvldrhtss)) {
                wkgbmnqykc();
            }
        } catch (NumberFormatException e13) {
            throw new IllegalArgumentException("Invalid escape sequence: " + strDsvhmnatus, e13);
        }
    }

    private static boolean jyumaefscl(char c13) {
        return c13 == '_' || wl.kcexrzcfyt.dxjokdxxww(c13) || lereixgezr(c13);
    }

    private static boolean lereixgezr(char c13) {
        return c13 >= 128;
    }

    public static String ntlheqmsrt(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        char c13 = 0;
        for (char c14 : str.toCharArray()) {
            if (c14 == '\\') {
                if (c13 == '\\') {
                    sbEablkybsjg.append(c14);
                    c13 = 0;
                }
            } else {
                sbEablkybsjg.append(c14);
            }
            c13 = c14;
        }
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    private static boolean pmvmpeiblj(int i13) {
        return (i13 == 0 || !Character.isValidCodePoint(i13) || Character.isSurrogate((char) i13)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zdlpuopuiu(char c13) {
        return c13 == '-' || wl.kcexrzcfyt.gtknphoqwx(c13) || jyumaefscl(c13);
    }

    public String btonecajqb() {
        if (kcexrzcfyt()) {
            throw new IllegalArgumentException("CSS identifier expected, but end of input found");
        }
        String strHkdspvbjdz = this.f125777zdlpuopuiu.hkdspvbjdz(new draadjrbmk.iobyxmoadg() { // from class: yl.hcddaimhww
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return jpowsppfya.zdlpuopuiu(c13);
            }
        });
        char cVdvldrhtss = vdvldrhtss();
        if (cVdvldrhtss != '\\' && cVdvldrhtss != 0) {
            return strHkdspvbjdz;
        }
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        if (!strHkdspvbjdz.isEmpty()) {
            sbEablkybsjg.append(strHkdspvbjdz);
        }
        while (!kcexrzcfyt()) {
            char cVdvldrhtss2 = vdvldrhtss();
            if (!zdlpuopuiu(cVdvldrhtss2)) {
                if (cVdvldrhtss2 != 0) {
                    if (cVdvldrhtss2 != '\\') {
                        break;
                    }
                    wkgbmnqykc();
                    if (!kcexrzcfyt() && cqumvgiudr(vdvldrhtss())) {
                        this.f125777zdlpuopuiu.M();
                        break;
                    }
                    dxjokdxxww(sbEablkybsjg);
                } else {
                    wkgbmnqykc();
                    sbEablkybsjg.append((char) 65533);
                }
            } else {
                sbEablkybsjg.append(nufgyqmvbu());
            }
        }
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    public boolean cdpycssgdh(char c13) {
        return this.f125777zdlpuopuiu.a(c13);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f125777zdlpuopuiu.close();
    }

    public String draadjrbmk() {
        return agtfadlqog(f125776yggfygwlhe);
    }

    public boolean hkdspvbjdz(char... cArr) {
        return this.f125777zdlpuopuiu.f(cArr);
    }

    public boolean istkbnxepw(String str) {
        return this.f125777zdlpuopuiu.krqnebusok(str);
    }

    public boolean kcexrzcfyt() {
        return this.f125777zdlpuopuiu.czzsidtyhn();
    }

    public boolean kegysxyocb() {
        return Character.isLetterOrDigit(this.f125777zdlpuopuiu.xrmfcynszj());
    }

    public String lqeggnwhkg(char c13, char c14) {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        this.f125777zdlpuopuiu.ezmngbhpjk();
        char c15 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i13 = 0;
        boolean z15 = false;
        while (!kcexrzcfyt()) {
            char cNufgyqmvbu = nufgyqmvbu();
            if (c15 == '\\') {
                if (cNufgyqmvbu == 'Q') {
                    z15 = true;
                } else if (cNufgyqmvbu == 'E') {
                    z15 = false;
                }
                sbEablkybsjg.append(cNufgyqmvbu);
            } else {
                if (cNufgyqmvbu == '\'' && cNufgyqmvbu != c13 && !z13) {
                    z14 = !z14;
                } else if (cNufgyqmvbu == '\"' && cNufgyqmvbu != c13 && !z14) {
                    z13 = !z13;
                }
                if (z14 || z13 || z15) {
                    sbEablkybsjg.append(cNufgyqmvbu);
                } else if (cNufgyqmvbu == c13) {
                    i13++;
                    if (i13 > 1) {
                        sbEablkybsjg.append(cNufgyqmvbu);
                    }
                } else if (cNufgyqmvbu != c14 || (i13 = i13 - 1) > 0) {
                    sbEablkybsjg.append(cNufgyqmvbu);
                }
            }
            if (i13 <= 0) {
                break;
            }
            c15 = cNufgyqmvbu;
        }
        String strEsjtqupxsv = wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
        if (i13 > 0) {
            this.f125777zdlpuopuiu.D();
            vl.zoijcleaow.iobyxmoadg("Did not find balanced marker at '" + strEsjtqupxsv + "'");
        }
        return strEsjtqupxsv;
    }

    public String mbcevpiqjq() {
        return this.f125777zdlpuopuiu.jlmebxxoox();
    }

    public char nufgyqmvbu() {
        return this.f125777zdlpuopuiu.cqumvgiudr();
    }

    public String ojitshcjhn(String... strArr) {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        loop0: while (!kcexrzcfyt()) {
            for (String str : strArr) {
                if (this.f125777zdlpuopuiu.q(str)) {
                    break loop0;
                }
            }
            sbEablkybsjg.append(nufgyqmvbu());
        }
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    public boolean rgvfuqvkyq() {
        boolean z13 = false;
        while (wypolnanlu()) {
            wkgbmnqykc();
            z13 = true;
        }
        return z13;
    }

    public String toString() {
        return this.f125777zdlpuopuiu.toString();
    }

    char vdvldrhtss() {
        return this.f125777zdlpuopuiu.xrmfcynszj();
    }

    public void wkgbmnqykc() {
        if (kcexrzcfyt()) {
            return;
        }
        this.f125777zdlpuopuiu.rgvfuqvkyq();
    }

    public boolean wwaezpbzkn(String str) {
        return this.f125777zdlpuopuiu.q(str);
    }

    public boolean wypolnanlu() {
        return wl.kcexrzcfyt.ojitshcjhn(this.f125777zdlpuopuiu.xrmfcynszj());
    }

    public boolean zynmafqrjb(char c13) {
        if (!this.f125777zdlpuopuiu.a(c13)) {
            return false;
        }
        nufgyqmvbu();
        return true;
    }
}

package org.jsoup.select;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import wl.kcexrzcfyt;
import xl.lereixgezr;
import xl.zdlpuopuiu;
import yl.jpowsppfya;

/* JADX INFO: loaded from: classes3.dex */
public class nufgyqmvbu implements AutoCloseable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f74158jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f74159yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final jpowsppfya f74160zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final char[] f74155iwizpuwonk = {'>', '+', '~'};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String[] f74153cqumvgiudr = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final char[] f74154esjtqupxsv = {',', ')'};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Pattern f74156lereixgezr = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Pattern f74157pmvmpeiblj = Pattern.compile("([+-])?(\\d+)");

    private nufgyqmvbu(String str) {
        vl.zoijcleaow.lqeggnwhkg(str);
        String strTrim = str.trim();
        this.f74159yggfygwlhe = strTrim;
        this.f74160zdlpuopuiu = new jpowsppfya(strTrim);
    }

    private String agtfadlqog() {
        return this.f74160zdlpuopuiu.lqeggnwhkg('(', ')');
    }

    static wkgbmnqykc btonecajqb(wkgbmnqykc wkgbmnqykcVar, char c13, wkgbmnqykc wkgbmnqykcVar2) {
        if (c13 == ' ') {
            return iobyxmoadg(new btonecajqb.iobyxmoadg(wkgbmnqykcVar), wkgbmnqykcVar2);
        }
        if (c13 == '+') {
            return iobyxmoadg(new btonecajqb.wkgbmnqykc(wkgbmnqykcVar), wkgbmnqykcVar2);
        }
        if (c13 != '>') {
            if (c13 == '~') {
                return iobyxmoadg(new btonecajqb.lqeggnwhkg(wkgbmnqykcVar), wkgbmnqykcVar2);
            }
            throw new Selector.SelectorParseException("Unknown combinator '%s'", Character.valueOf(c13));
        }
        btonecajqb.ppxfxbqfkf ppxfxbqfkfVar = wkgbmnqykcVar instanceof btonecajqb.ppxfxbqfkf ? (btonecajqb.ppxfxbqfkf) wkgbmnqykcVar : new btonecajqb.ppxfxbqfkf(wkgbmnqykcVar);
        ppxfxbqfkfVar.vdvldrhtss(wkgbmnqykcVar2);
        return ppxfxbqfkfVar;
    }

    private wkgbmnqykc cqumvgiudr() {
        return hkdspvbjdz(new Function() { // from class: org.jsoup.select.gxszxtbevo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new btonecajqb.eablkybsjg((wkgbmnqykc) obj);
            }
        }, ":is() must have a selector");
    }

    private int draadjrbmk() {
        String strTrim = agtfadlqog().trim();
        vl.zoijcleaow.wkgbmnqykc(kcexrzcfyt.agtfadlqog(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private wkgbmnqykc dsvhmnatus() {
        wkgbmnqykc ppxfxbqfkfVar;
        String strBtonecajqb = this.f74160zdlpuopuiu.btonecajqb();
        byte b13 = 1;
        this.f74158jyumaefscl = true;
        strBtonecajqb.hashCode();
        switch (strBtonecajqb.hashCode()) {
            case 3076010:
                b13 = !strBtonecajqb.equals("data") ? (byte) -1 : (byte) 0;
                break;
            case 3386882:
                if (!strBtonecajqb.equals("node")) {
                    b13 = -1;
                }
                break;
            case 3556653:
                b13 = !strBtonecajqb.equals("text") ? (byte) -1 : (byte) 2;
                break;
            case 94504589:
                b13 = !strBtonecajqb.equals("cdata") ? (byte) -1 : (byte) 3;
                break;
            case 950398559:
                b13 = !strBtonecajqb.equals("comment") ? (byte) -1 : (byte) 4;
                break;
            case 1563127392:
                b13 = !strBtonecajqb.equals("leafnode") ? (byte) -1 : (byte) 5;
                break;
            default:
                b13 = -1;
                break;
        }
        switch (b13) {
            case 0:
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(xl.eablkybsjg.class, strBtonecajqb);
                break;
            case 1:
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(zdlpuopuiu.class, strBtonecajqb);
                break;
            case 2:
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(lereixgezr.class, strBtonecajqb);
                break;
            case 3:
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(xl.ppxfxbqfkf.class, strBtonecajqb);
                break;
            case 4:
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(xl.wkgbmnqykc.class, strBtonecajqb);
                break;
            case 5:
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(xl.kcexrzcfyt.class, strBtonecajqb);
                break;
            default:
                throw new Selector.SelectorParseException("Could not parse query '%s': unknown node type '::%s'", this.f74159yggfygwlhe, strBtonecajqb);
        }
        while (true) {
            wkgbmnqykc wkgbmnqykcVarUlzqkzuiru = ulzqkzuiru();
            if (wkgbmnqykcVarUlzqkzuiru == null) {
                this.f74158jyumaefscl = false;
                return ppxfxbqfkfVar;
            }
            ppxfxbqfkfVar = iobyxmoadg(ppxfxbqfkfVar, wkgbmnqykcVarUlzqkzuiru);
        }
    }

    private wkgbmnqykc dxjokdxxww() {
        String strZoijcleaow = wl.gxszxtbevo.zoijcleaow(this.f74160zdlpuopuiu.draadjrbmk());
        vl.zoijcleaow.lqeggnwhkg(strZoijcleaow);
        if (strZoijcleaow.startsWith("*|")) {
            String strSubstring = strZoijcleaow.substring(2);
            return new ppxfxbqfkf.zoijcleaow(new wkgbmnqykc.cllcsxoeiz(strSubstring), new wkgbmnqykc.dsvhmnatus(StringUtils.PROCESS_POSTFIX_DELIMITER + strSubstring));
        }
        if (!strZoijcleaow.endsWith("|*")) {
            if (strZoijcleaow.contains("|")) {
                strZoijcleaow = strZoijcleaow.replace("|", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return new wkgbmnqykc.cllcsxoeiz(strZoijcleaow);
        }
        return new wkgbmnqykc.wypolnanlu(strZoijcleaow.substring(0, strZoijcleaow.length() - 2) + StringUtils.PROCESS_POSTFIX_DELIMITER);
    }

    private wkgbmnqykc hkdspvbjdz(Function function, String str) {
        vl.zoijcleaow.wkgbmnqykc(this.f74160zdlpuopuiu.zynmafqrjb('('), str);
        wkgbmnqykc wkgbmnqykcVarMbcevpiqjq = mbcevpiqjq();
        vl.zoijcleaow.wkgbmnqykc(this.f74160zdlpuopuiu.zynmafqrjb(')'), str);
        return (wkgbmnqykc) function.apply(wkgbmnqykcVarMbcevpiqjq);
    }

    static wkgbmnqykc iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
        if (wkgbmnqykcVar == null) {
            return wkgbmnqykcVar2;
        }
        if (!(wkgbmnqykcVar instanceof ppxfxbqfkf.iobyxmoadg)) {
            return new ppxfxbqfkf.iobyxmoadg(wkgbmnqykcVar, wkgbmnqykcVar2);
        }
        ((ppxfxbqfkf.iobyxmoadg) wkgbmnqykcVar).wflxmlrfwp(wkgbmnqykcVar2);
        return wkgbmnqykcVar;
    }

    static wkgbmnqykc istkbnxepw(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
        if (!(wkgbmnqykcVar instanceof ppxfxbqfkf.zoijcleaow)) {
            return new ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar, wkgbmnqykcVar2);
        }
        ((ppxfxbqfkf.zoijcleaow) wkgbmnqykcVar).wflxmlrfwp(wkgbmnqykcVar2);
        return wkgbmnqykcVar;
    }

    private wkgbmnqykc jyumaefscl() {
        return hkdspvbjdz(new Function() { // from class: org.jsoup.select.lqeggnwhkg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new btonecajqb.zoijcleaow((wkgbmnqykc) obj);
            }
        }, ":has() must have a selector");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d A[PHI: r3
      0x001d: PHI (r3v7 int) = (r3v0 int), (r3v5 int) binds: [B:6:0x001b, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    private wkgbmnqykc kcexrzcfyt(boolean z13, boolean z14) {
        String strZoijcleaow = wl.gxszxtbevo.zoijcleaow(agtfadlqog());
        int i13 = 1;
        int i14 = 2;
        if (!"odd".equals(strZoijcleaow)) {
            if ("even".equals(strZoijcleaow)) {
                i13 = 0;
            } else {
                Matcher matcher = f74156lereixgezr.matcher(strZoijcleaow);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i14 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        i14 = "-".equals(matcher.group(2)) ? -1 : 1;
                    }
                    if (matcher.group(4) != null) {
                        i13 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    } else {
                        i13 = 0;
                    }
                } else {
                    Matcher matcher2 = f74157pmvmpeiblj.matcher(strZoijcleaow);
                    if (!matcher2.matches()) {
                        throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", strZoijcleaow);
                    }
                    i13 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                    i14 = 0;
                }
            }
        }
        if (z14) {
            return z13 ? new wkgbmnqykc.cdpycssgdh(i14, i13) : new wkgbmnqykc.yadqdtsiqt(i14, i13);
        }
        return z13 ? new wkgbmnqykc.istkbnxepw(i14, i13) : new wkgbmnqykc.zynmafqrjb(i14, i13);
    }

    private wkgbmnqykc lereixgezr(boolean z13) {
        String str = z13 ? ":matchesOwn" : ":matches";
        String strAgtfadlqog = agtfadlqog();
        vl.zoijcleaow.nufgyqmvbu(strAgtfadlqog, str + "(regex) query must not be empty");
        Pattern patternCompile = Pattern.compile(strAgtfadlqog);
        if (this.f74158jyumaefscl) {
            return new eablkybsjg.wkgbmnqykc(patternCompile);
        }
        return z13 ? new wkgbmnqykc.hcddaimhww(patternCompile) : new wkgbmnqykc.pkzmftpjix(patternCompile);
    }

    private wkgbmnqykc lqeggnwhkg() {
        String strBtonecajqb = this.f74160zdlpuopuiu.btonecajqb();
        vl.zoijcleaow.lqeggnwhkg(strBtonecajqb);
        return new wkgbmnqykc.gtknphoqwx(strBtonecajqb.trim());
    }

    private wkgbmnqykc nufgyqmvbu() {
        String strBtonecajqb = this.f74160zdlpuopuiu.btonecajqb();
        vl.zoijcleaow.lqeggnwhkg(strBtonecajqb);
        return new wkgbmnqykc.oxmwwwfdhm(strBtonecajqb);
    }

    private wkgbmnqykc ojitshcjhn(boolean z13) {
        String str = z13 ? ":containsOwn" : ":contains";
        String strNtlheqmsrt = jpowsppfya.ntlheqmsrt(agtfadlqog());
        vl.zoijcleaow.nufgyqmvbu(strNtlheqmsrt, str + "(text) query must not be empty");
        if (this.f74158jyumaefscl) {
            return new eablkybsjg.zoijcleaow(strNtlheqmsrt);
        }
        return z13 ? new wkgbmnqykc.wflxmlrfwp(strNtlheqmsrt) : new wkgbmnqykc.agtfadlqog(strNtlheqmsrt);
    }

    private wkgbmnqykc pmvmpeiblj(boolean z13) {
        String str = z13 ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strAgtfadlqog = agtfadlqog();
        vl.zoijcleaow.nufgyqmvbu(strAgtfadlqog, str + "(regex) query must not be empty");
        return z13 ? new wkgbmnqykc.jpowsppfya(Pattern.compile(strAgtfadlqog)) : new wkgbmnqykc.hkdspvbjdz(Pattern.compile(strAgtfadlqog));
    }

    private wkgbmnqykc rgvfuqvkyq() {
        String strNtlheqmsrt = jpowsppfya.ntlheqmsrt(agtfadlqog());
        vl.zoijcleaow.nufgyqmvbu(strNtlheqmsrt, ":containsData(text) query must not be empty");
        return new wkgbmnqykc.draadjrbmk(strNtlheqmsrt);
    }

    private wkgbmnqykc vdvldrhtss(boolean z13) {
        String str = z13 ? ":containsWholeOwnText" : ":containsWholeText";
        String strNtlheqmsrt = jpowsppfya.ntlheqmsrt(agtfadlqog());
        vl.zoijcleaow.nufgyqmvbu(strNtlheqmsrt, str + "(text) query must not be empty");
        return z13 ? new wkgbmnqykc.ojitshcjhn(strNtlheqmsrt) : new wkgbmnqykc.rgvfuqvkyq(strNtlheqmsrt);
    }

    private wkgbmnqykc wkgbmnqykc() {
        jpowsppfya jpowsppfyaVar = new jpowsppfya(this.f74160zdlpuopuiu.lqeggnwhkg('[', ']'));
        try {
            wkgbmnqykc wkgbmnqykcVarZdlpuopuiu = zdlpuopuiu(jpowsppfyaVar);
            jpowsppfyaVar.close();
            return wkgbmnqykcVarZdlpuopuiu;
        } catch (Throwable th2) {
            try {
                jpowsppfyaVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static wkgbmnqykc wwaezpbzkn(String str) {
        try {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(str);
            try {
                wkgbmnqykc wkgbmnqykcVarCdpycssgdh = nufgyqmvbuVar.cdpycssgdh();
                nufgyqmvbuVar.close();
                return wkgbmnqykcVarCdpycssgdh;
            } catch (Throwable th2) {
                try {
                    nufgyqmvbuVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalArgumentException e13) {
            throw new Selector.SelectorParseException(e13.getMessage());
        }
    }

    private wkgbmnqykc wypolnanlu() {
        String strBtonecajqb = this.f74160zdlpuopuiu.btonecajqb();
        strBtonecajqb.hashCode();
        switch (strBtonecajqb) {
            case "containsData":
                return rgvfuqvkyq();
            case "first-child":
                return new wkgbmnqykc.cqumvgiudr();
            case "matchesWholeText":
                return pmvmpeiblj(false);
            case "nth-child":
                return kcexrzcfyt(false, false);
            case "nth-last-child":
                return kcexrzcfyt(true, false);
            case "only-child":
                return new wkgbmnqykc.iozdgvuglv();
            case "nth-of-type":
                return kcexrzcfyt(false, true);
            case "nth-last-of-type":
                return kcexrzcfyt(true, true);
            case "contains":
                return ojitshcjhn(false);
            case "containsWholeOwnText":
                return vdvldrhtss(true);
            case "eq":
                return new wkgbmnqykc.kcexrzcfyt(draadjrbmk());
            case "gt":
                return new wkgbmnqykc.yggfygwlhe(draadjrbmk());
            case "is":
                return cqumvgiudr();
            case "lt":
                return new wkgbmnqykc.jyumaefscl(draadjrbmk());
            case "has":
                return jyumaefscl();
            case "not":
                return zynmafqrjb();
            case "root":
                return new wkgbmnqykc.wwaezpbzkn();
            case "blank":
                return new eablkybsjg.iobyxmoadg();
            case "empty":
                return new wkgbmnqykc.iwizpuwonk();
            case "containsOwn":
                return ojitshcjhn(true);
            case "matchText":
                return new wkgbmnqykc.ylkuphrtab();
            case "last-child":
                return new wkgbmnqykc.lereixgezr();
            case "matches":
                return lereixgezr(false);
            case "matchesWholeOwnText":
                return pmvmpeiblj(true);
            case "first-of-type":
                return new wkgbmnqykc.esjtqupxsv();
            case "only-of-type":
                return new wkgbmnqykc.lmojexxdyd();
            case "matchesOwn":
                return lereixgezr(true);
            case "containsWholeText":
                return vdvldrhtss(false);
            case "last-of-type":
                return new wkgbmnqykc.pmvmpeiblj();
            default:
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f74159yggfygwlhe, this.f74160zdlpuopuiu.mbcevpiqjq());
        }
    }

    private wkgbmnqykc zdlpuopuiu(jpowsppfya jpowsppfyaVar) {
        wkgbmnqykc nufgyqmvbuVar;
        String strOjitshcjhn = jpowsppfyaVar.ojitshcjhn(f74153cqumvgiudr);
        vl.zoijcleaow.lqeggnwhkg(strOjitshcjhn);
        jpowsppfyaVar.rgvfuqvkyq();
        if (jpowsppfyaVar.kcexrzcfyt()) {
            if (strOjitshcjhn.startsWith("^")) {
                return new wkgbmnqykc.C1614wkgbmnqykc(strOjitshcjhn.substring(1));
            }
            return strOjitshcjhn.equals("*") ? new wkgbmnqykc.C1614wkgbmnqykc("") : new wkgbmnqykc.zoijcleaow(strOjitshcjhn);
        }
        if (jpowsppfyaVar.zynmafqrjb('=')) {
            nufgyqmvbuVar = new wkgbmnqykc.eablkybsjg(strOjitshcjhn, jpowsppfyaVar.mbcevpiqjq());
        } else if (jpowsppfyaVar.istkbnxepw("!=")) {
            nufgyqmvbuVar = new wkgbmnqykc.dxjokdxxww(strOjitshcjhn, jpowsppfyaVar.mbcevpiqjq());
        } else if (jpowsppfyaVar.istkbnxepw("^=")) {
            nufgyqmvbuVar = new wkgbmnqykc.btonecajqb(strOjitshcjhn, jpowsppfyaVar.mbcevpiqjq());
        } else if (jpowsppfyaVar.istkbnxepw("$=")) {
            nufgyqmvbuVar = new wkgbmnqykc.lqeggnwhkg(strOjitshcjhn, jpowsppfyaVar.mbcevpiqjq());
        } else if (jpowsppfyaVar.istkbnxepw("*=")) {
            nufgyqmvbuVar = new wkgbmnqykc.gxszxtbevo(strOjitshcjhn, jpowsppfyaVar.mbcevpiqjq());
        } else {
            if (!jpowsppfyaVar.istkbnxepw("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f74159yggfygwlhe, jpowsppfyaVar.mbcevpiqjq());
            }
            nufgyqmvbuVar = new wkgbmnqykc.nufgyqmvbu(strOjitshcjhn, Pattern.compile(jpowsppfyaVar.mbcevpiqjq()));
        }
        return nufgyqmvbuVar;
    }

    private wkgbmnqykc zynmafqrjb() {
        String strAgtfadlqog = agtfadlqog();
        vl.zoijcleaow.nufgyqmvbu(strAgtfadlqog, ":not(selector) subselect must not be empty");
        return new btonecajqb.gxszxtbevo(wwaezpbzkn(strAgtfadlqog));
    }

    wkgbmnqykc cdpycssgdh() {
        wkgbmnqykc wkgbmnqykcVarMbcevpiqjq = mbcevpiqjq();
        this.f74160zdlpuopuiu.rgvfuqvkyq();
        if (this.f74160zdlpuopuiu.kcexrzcfyt()) {
            return wkgbmnqykcVarMbcevpiqjq;
        }
        throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f74159yggfygwlhe, this.f74160zdlpuopuiu.mbcevpiqjq());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f74160zdlpuopuiu.close();
    }

    wkgbmnqykc kegysxyocb() {
        this.f74160zdlpuopuiu.rgvfuqvkyq();
        wkgbmnqykc nufgyqmvbuVar = this.f74160zdlpuopuiu.hkdspvbjdz(f74155iwizpuwonk) ? new btonecajqb.nufgyqmvbu() : ntlheqmsrt();
        while (true) {
            char cNufgyqmvbu = this.f74160zdlpuopuiu.rgvfuqvkyq() ? ' ' : (char) 0;
            if (!this.f74160zdlpuopuiu.hkdspvbjdz(f74155iwizpuwonk)) {
                if (!this.f74160zdlpuopuiu.hkdspvbjdz(f74154esjtqupxsv)) {
                    break;
                }
                break;
            }
            cNufgyqmvbu = this.f74160zdlpuopuiu.nufgyqmvbu();
            if (cNufgyqmvbu == 0) {
                break;
            }
            nufgyqmvbuVar = btonecajqb(nufgyqmvbuVar, cNufgyqmvbu, ntlheqmsrt());
        }
        return nufgyqmvbuVar;
    }

    wkgbmnqykc mbcevpiqjq() {
        wkgbmnqykc wkgbmnqykcVarKegysxyocb = kegysxyocb();
        while (this.f74160zdlpuopuiu.zynmafqrjb(',')) {
            wkgbmnqykcVarKegysxyocb = istkbnxepw(wkgbmnqykcVarKegysxyocb, kegysxyocb());
        }
        return wkgbmnqykcVarKegysxyocb;
    }

    wkgbmnqykc ntlheqmsrt() {
        wkgbmnqykc wkgbmnqykcVarDxjokdxxww;
        this.f74160zdlpuopuiu.rgvfuqvkyq();
        if (this.f74160zdlpuopuiu.kegysxyocb() || this.f74160zdlpuopuiu.wwaezpbzkn("*|")) {
            wkgbmnqykcVarDxjokdxxww = dxjokdxxww();
        } else {
            wkgbmnqykcVarDxjokdxxww = this.f74160zdlpuopuiu.zynmafqrjb('*') ? new wkgbmnqykc.iobyxmoadg() : null;
        }
        while (true) {
            wkgbmnqykc wkgbmnqykcVarUlzqkzuiru = ulzqkzuiru();
            if (wkgbmnqykcVarUlzqkzuiru == null) {
                break;
            }
            wkgbmnqykcVarDxjokdxxww = iobyxmoadg(wkgbmnqykcVarDxjokdxxww, wkgbmnqykcVarUlzqkzuiru);
        }
        if (wkgbmnqykcVarDxjokdxxww != null) {
            return wkgbmnqykcVarDxjokdxxww;
        }
        throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f74159yggfygwlhe, this.f74160zdlpuopuiu.mbcevpiqjq());
    }

    public String toString() {
        return this.f74159yggfygwlhe;
    }

    wkgbmnqykc ulzqkzuiru() {
        if (this.f74160zdlpuopuiu.zynmafqrjb('#')) {
            return nufgyqmvbu();
        }
        if (this.f74160zdlpuopuiu.zynmafqrjb('.')) {
            return lqeggnwhkg();
        }
        if (this.f74160zdlpuopuiu.cdpycssgdh('[')) {
            return wkgbmnqykc();
        }
        if (this.f74160zdlpuopuiu.istkbnxepw("::")) {
            return dsvhmnatus();
        }
        if (this.f74160zdlpuopuiu.zynmafqrjb(':')) {
            return wypolnanlu();
        }
        return null;
    }
}

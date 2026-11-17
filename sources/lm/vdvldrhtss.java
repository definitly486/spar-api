package lm;

import java.util.regex.Pattern;
import lk.esjtqupxsv;
import lk.istkbnxepw;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
final class vdvldrhtss {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final char[] f63554draadjrbmk = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Pattern f63555wflxmlrfwp = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private lk.kcexrzcfyt.iobyxmoadg f63556btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private esjtqupxsv.iobyxmoadg f63557dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zynmafqrjb.iobyxmoadg f63558eablkybsjg = new zynmafqrjb.iobyxmoadg();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private istkbnxepw f63559gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lk.yggfygwlhe.iobyxmoadg f63560gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f63561iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private lk.cqumvgiudr f63562lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f63563nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f63564ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private lk.jyumaefscl.iobyxmoadg f63565wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lk.jyumaefscl f63566zoijcleaow;

    private static class iobyxmoadg extends istkbnxepw {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lk.cqumvgiudr f63567ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final istkbnxepw f63568zoijcleaow;

        iobyxmoadg(istkbnxepw istkbnxepwVar, lk.cqumvgiudr cqumvgiudrVar) {
            this.f63568zoijcleaow = istkbnxepwVar;
            this.f63567ppxfxbqfkf = cqumvgiudrVar;
        }

        @Override // lk.istkbnxepw
        public void dxjokdxxww(bl.wkgbmnqykc wkgbmnqykcVar) {
            this.f63568zoijcleaow.dxjokdxxww(wkgbmnqykcVar);
        }

        @Override // lk.istkbnxepw
        public long iobyxmoadg() {
            return this.f63568zoijcleaow.iobyxmoadg();
        }

        @Override // lk.istkbnxepw
        public lk.cqumvgiudr zoijcleaow() {
            return this.f63567ppxfxbqfkf;
        }
    }

    vdvldrhtss(String str, lk.jyumaefscl jyumaefsclVar, String str2, lk.yggfygwlhe yggfygwlheVar, lk.cqumvgiudr cqumvgiudrVar, boolean z13, boolean z14, boolean z15) {
        this.f63561iobyxmoadg = str;
        this.f63566zoijcleaow = jyumaefsclVar;
        this.f63564ppxfxbqfkf = str2;
        this.f63562lqeggnwhkg = cqumvgiudrVar;
        this.f63563nufgyqmvbu = z13;
        if (yggfygwlheVar != null) {
            this.f63560gxszxtbevo = yggfygwlheVar.eablkybsjg();
        } else {
            this.f63560gxszxtbevo = new lk.yggfygwlhe.iobyxmoadg();
        }
        if (z14) {
            this.f63556btonecajqb = new lk.kcexrzcfyt.iobyxmoadg();
        } else if (z15) {
            esjtqupxsv.iobyxmoadg iobyxmoadgVar = new esjtqupxsv.iobyxmoadg();
            this.f63557dxjokdxxww = iobyxmoadgVar;
            iobyxmoadgVar.wkgbmnqykc(esjtqupxsv.f63032draadjrbmk);
        }
    }

    private static void btonecajqb(bl.ppxfxbqfkf ppxfxbqfkfVar, String str, int i13, int i14, boolean z13) {
        bl.ppxfxbqfkf ppxfxbqfkfVar2 = null;
        while (i13 < i14) {
            int iCodePointAt = str.codePointAt(i13);
            if (!z13 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z13 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (ppxfxbqfkfVar2 == null) {
                        ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
                    }
                    ppxfxbqfkfVar2.uawqvzlxes(iCodePointAt);
                    while (!ppxfxbqfkfVar2.n()) {
                        byte b13 = ppxfxbqfkfVar2.readByte();
                        ppxfxbqfkfVar.o(37);
                        char[] cArr = f63554draadjrbmk;
                        ppxfxbqfkfVar.o(cArr[((b13 & 255) >> 4) & 15]);
                        ppxfxbqfkfVar.o(cArr[b13 & 15]);
                    }
                } else {
                    ppxfxbqfkfVar.uawqvzlxes(iCodePointAt);
                }
            }
            i13 += Character.charCount(iCodePointAt);
        }
    }

    private static String dxjokdxxww(String str, boolean z13) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z13 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
                ppxfxbqfkfVar.sflfametgt(str, 0, iCharCount);
                btonecajqb(ppxfxbqfkfVar, str, iCharCount, length, z13);
                return ppxfxbqfkfVar.istkbnxepw();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    void draadjrbmk(istkbnxepw istkbnxepwVar) {
        this.f63559gtknphoqwx = istkbnxepwVar;
    }

    void eablkybsjg(esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f63557dxjokdxxww.zoijcleaow(ppxfxbqfkfVar);
    }

    zynmafqrjb.iobyxmoadg gtknphoqwx() {
        lk.jyumaefscl jyumaefsclVarKcexrzcfyt;
        lk.jyumaefscl.iobyxmoadg iobyxmoadgVar = this.f63565wkgbmnqykc;
        if (iobyxmoadgVar != null) {
            jyumaefsclVarKcexrzcfyt = iobyxmoadgVar.ppxfxbqfkf();
        } else {
            jyumaefsclVarKcexrzcfyt = this.f63566zoijcleaow.kcexrzcfyt(this.f63564ppxfxbqfkf);
            if (jyumaefsclVarKcexrzcfyt == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f63566zoijcleaow + ", Relative: " + this.f63564ppxfxbqfkf);
            }
        }
        istkbnxepw iobyxmoadgVar2 = this.f63559gtknphoqwx;
        if (iobyxmoadgVar2 == null) {
            lk.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = this.f63556btonecajqb;
            if (iobyxmoadgVar3 != null) {
                iobyxmoadgVar2 = iobyxmoadgVar3.ppxfxbqfkf();
            } else {
                esjtqupxsv.iobyxmoadg iobyxmoadgVar4 = this.f63557dxjokdxxww;
                if (iobyxmoadgVar4 != null) {
                    iobyxmoadgVar2 = iobyxmoadgVar4.ppxfxbqfkf();
                } else if (this.f63563nufgyqmvbu) {
                    iobyxmoadgVar2 = istkbnxepw.eablkybsjg(null, new byte[0]);
                }
            }
        }
        lk.cqumvgiudr cqumvgiudrVar = this.f63562lqeggnwhkg;
        if (cqumvgiudrVar != null) {
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2 = new iobyxmoadg(iobyxmoadgVar2, cqumvgiudrVar);
            } else {
                this.f63560gxszxtbevo.iobyxmoadg("Content-Type", cqumvgiudrVar.toString());
            }
        }
        return this.f63558eablkybsjg.zdlpuopuiu(jyumaefsclVarKcexrzcfyt).btonecajqb(this.f63560gxszxtbevo.gxszxtbevo()).gtknphoqwx(this.f63561iobyxmoadg, iobyxmoadgVar2);
    }

    void gxszxtbevo(String str, String str2, boolean z13) {
        if (this.f63564ppxfxbqfkf == null) {
            throw new AssertionError();
        }
        String strDxjokdxxww = dxjokdxxww(str2, z13);
        String strReplace = this.f63564ppxfxbqfkf.replace("{" + str + "}", strDxjokdxxww);
        if (!f63555wflxmlrfwp.matcher(strReplace).matches()) {
            this.f63564ppxfxbqfkf = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void iobyxmoadg(String str, String str2, boolean z13) {
        if (z13) {
            this.f63556btonecajqb.zoijcleaow(str, str2);
        } else {
            this.f63556btonecajqb.iobyxmoadg(str, str2);
        }
    }

    void lqeggnwhkg(String str, String str2, boolean z13) {
        String str3 = this.f63564ppxfxbqfkf;
        if (str3 != null) {
            lk.jyumaefscl.iobyxmoadg iobyxmoadgVarDraadjrbmk = this.f63566zoijcleaow.draadjrbmk(str3);
            this.f63565wkgbmnqykc = iobyxmoadgVarDraadjrbmk;
            if (iobyxmoadgVarDraadjrbmk == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f63566zoijcleaow + ", Relative: " + this.f63564ppxfxbqfkf);
            }
            this.f63564ppxfxbqfkf = null;
        }
        if (z13) {
            this.f63565wkgbmnqykc.iobyxmoadg(str, str2);
        } else {
            this.f63565wkgbmnqykc.zoijcleaow(str, str2);
        }
    }

    void nufgyqmvbu(Class cls, Object obj) {
        this.f63558eablkybsjg.oxmwwwfdhm(cls, obj);
    }

    void ppxfxbqfkf(lk.yggfygwlhe yggfygwlheVar) {
        this.f63560gxszxtbevo.zoijcleaow(yggfygwlheVar);
    }

    void wflxmlrfwp(Object obj) {
        this.f63564ppxfxbqfkf = obj.toString();
    }

    void wkgbmnqykc(lk.yggfygwlhe yggfygwlheVar, istkbnxepw istkbnxepwVar) {
        this.f63557dxjokdxxww.iobyxmoadg(yggfygwlheVar, istkbnxepwVar);
    }

    void zoijcleaow(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f63560gxszxtbevo.iobyxmoadg(str, str2);
            return;
        }
        try {
            this.f63562lqeggnwhkg = lk.cqumvgiudr.ppxfxbqfkf(str2);
        } catch (IllegalArgumentException e13) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e13);
        }
    }
}

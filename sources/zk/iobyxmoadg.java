package zk;

import bl.agtfadlqog;
import bl.ppxfxbqfkf;
import hg.ikoacuggdj;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.btonecajqb;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import lk.yadqdtsiqt;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import rk.eablkybsjg;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f130291iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile EnumC3324iobyxmoadg f130292ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Set f130293zoijcleaow;

    /* JADX INFO: renamed from: zk.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC3324iobyxmoadg {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface zoijcleaow {
        void log(String str);
    }

    public iobyxmoadg(zoijcleaow logger) {
        zdlpuopuiu.btonecajqb(logger, "logger");
        this.f130291iobyxmoadg = logger;
        this.f130293zoijcleaow = ikoacuggdj.eablkybsjg();
        this.f130292ppxfxbqfkf = EnumC3324iobyxmoadg.NONE;
    }

    private final boolean iobyxmoadg(yggfygwlhe yggfygwlheVar) {
        String strIobyxmoadg = yggfygwlheVar.iobyxmoadg("Content-Encoding");
        return (strIobyxmoadg == null || kcexrzcfyt.istkbnxepw(strIobyxmoadg, "identity", true) || kcexrzcfyt.istkbnxepw(strIobyxmoadg, "gzip", true)) ? false : true;
    }

    private final void wkgbmnqykc(yggfygwlhe yggfygwlheVar, int i13) {
        String strBtonecajqb = this.f130293zoijcleaow.contains(yggfygwlheVar.wkgbmnqykc(i13)) ? "██" : yggfygwlheVar.btonecajqb(i13);
        this.f130291iobyxmoadg.log(yggfygwlheVar.wkgbmnqykc(i13) + ": " + strBtonecajqb);
    }

    private final boolean zoijcleaow(cdpycssgdh cdpycssgdhVar) {
        cqumvgiudr cqumvgiudrVarDxjokdxxww = cdpycssgdhVar.wkgbmnqykc().dxjokdxxww();
        return cqumvgiudrVarDxjokdxxww != null && zdlpuopuiu.eablkybsjg(cqumvgiudrVarDxjokdxxww.nufgyqmvbu(), "text") && zdlpuopuiu.eablkybsjg(cqumvgiudrVarDxjokdxxww.lqeggnwhkg(), "event-stream");
    }

    public final iobyxmoadg eablkybsjg(EnumC3324iobyxmoadg level) {
        zdlpuopuiu.btonecajqb(level, "level");
        this.f130292ppxfxbqfkf = level;
        return this;
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) throws Exception {
        String string;
        boolean z13;
        String str;
        String str2;
        char c13;
        String string2;
        Long lValueOf;
        Long lValueOf2;
        zdlpuopuiu.btonecajqb(chain, "chain");
        EnumC3324iobyxmoadg enumC3324iobyxmoadg = this.f130292ppxfxbqfkf;
        zynmafqrjb zynmafqrjbVarDxjokdxxww = chain.dxjokdxxww();
        if (enumC3324iobyxmoadg == EnumC3324iobyxmoadg.NONE) {
            return chain.zoijcleaow(zynmafqrjbVarDxjokdxxww);
        }
        boolean z14 = enumC3324iobyxmoadg == EnumC3324iobyxmoadg.BODY;
        boolean z15 = z14 || enumC3324iobyxmoadg == EnumC3324iobyxmoadg.HEADERS;
        istkbnxepw istkbnxepwVarIobyxmoadg = zynmafqrjbVarDxjokdxxww.iobyxmoadg();
        btonecajqb btonecajqbVarWkgbmnqykc = chain.wkgbmnqykc();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(zynmafqrjbVarDxjokdxxww.lqeggnwhkg());
        sb3.append(' ');
        sb3.append(zynmafqrjbVarDxjokdxxww.gtknphoqwx());
        if (btonecajqbVarWkgbmnqykc != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(' ');
            sb4.append(btonecajqbVarWkgbmnqykc.iobyxmoadg());
            string = sb4.toString();
        } else {
            string = "";
        }
        sb3.append(string);
        String string3 = sb3.toString();
        String str3 = "-byte body)";
        if (!z15 && istkbnxepwVarIobyxmoadg != null) {
            string3 = string3 + " (" + istkbnxepwVarIobyxmoadg.iobyxmoadg() + "-byte body)";
        }
        this.f130291iobyxmoadg.log(string3);
        String str4 = "-gzipped-byte body)";
        if (z15) {
            yggfygwlhe yggfygwlheVarEablkybsjg = zynmafqrjbVarDxjokdxxww.eablkybsjg();
            if (istkbnxepwVarIobyxmoadg != null) {
                cqumvgiudr cqumvgiudrVarZoijcleaow = istkbnxepwVarIobyxmoadg.zoijcleaow();
                z13 = z15;
                if (cqumvgiudrVarZoijcleaow != null && yggfygwlheVarEablkybsjg.iobyxmoadg("Content-Type") == null) {
                    this.f130291iobyxmoadg.log("Content-Type: " + cqumvgiudrVarZoijcleaow);
                }
                if (istkbnxepwVarIobyxmoadg.iobyxmoadg() != -1 && yggfygwlheVarEablkybsjg.iobyxmoadg("Content-Length") == null) {
                    this.f130291iobyxmoadg.log("Content-Length: " + istkbnxepwVarIobyxmoadg.iobyxmoadg());
                }
            } else {
                z13 = z15;
                str3 = "-byte body)";
            }
            int size = yggfygwlheVarEablkybsjg.size();
            for (int i13 = 0; i13 < size; i13++) {
                wkgbmnqykc(yggfygwlheVarEablkybsjg, i13);
            }
            if (!z14 || istkbnxepwVarIobyxmoadg == null) {
                str = "gzip";
                str2 = str3;
                this.f130291iobyxmoadg.log("--> END " + zynmafqrjbVarDxjokdxxww.lqeggnwhkg());
            } else {
                if (iobyxmoadg(zynmafqrjbVarDxjokdxxww.eablkybsjg())) {
                    this.f130291iobyxmoadg.log("--> END " + zynmafqrjbVarDxjokdxxww.lqeggnwhkg() + " (encoded body omitted)");
                } else if (istkbnxepwVarIobyxmoadg.lqeggnwhkg()) {
                    this.f130291iobyxmoadg.log("--> END " + zynmafqrjbVarDxjokdxxww.lqeggnwhkg() + " (duplex request body omitted)");
                } else if (istkbnxepwVarIobyxmoadg.nufgyqmvbu()) {
                    this.f130291iobyxmoadg.log("--> END " + zynmafqrjbVarDxjokdxxww.lqeggnwhkg() + " (one-shot body omitted)");
                } else {
                    ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
                    istkbnxepwVarIobyxmoadg.dxjokdxxww(ppxfxbqfkfVar);
                    if (kcexrzcfyt.istkbnxepw("gzip", yggfygwlheVarEablkybsjg.iobyxmoadg("Content-Encoding"), true)) {
                        lValueOf2 = Long.valueOf(ppxfxbqfkfVar.dsvhmnatus());
                        agtfadlqog agtfadlqogVar = new agtfadlqog(ppxfxbqfkfVar);
                        try {
                            ppxfxbqfkfVar = new ppxfxbqfkf();
                            ppxfxbqfkfVar.xrmfcynszj(agtfadlqogVar);
                            rg.zoijcleaow.iobyxmoadg(agtfadlqogVar, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                rg.zoijcleaow.iobyxmoadg(agtfadlqogVar, th2);
                                throw th3;
                            }
                        }
                    } else {
                        lValueOf2 = null;
                    }
                    str = "gzip";
                    Charset charsetZoijcleaow = mk.iobyxmoadg.zoijcleaow(istkbnxepwVarIobyxmoadg.zoijcleaow(), null, 1, null);
                    this.f130291iobyxmoadg.log("");
                    if (!al.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar)) {
                        this.f130291iobyxmoadg.log("--> END " + zynmafqrjbVarDxjokdxxww.lqeggnwhkg() + " (binary " + istkbnxepwVarIobyxmoadg.iobyxmoadg() + "-byte body omitted)");
                    } else if (lValueOf2 != null) {
                        this.f130291iobyxmoadg.log("--> END " + zynmafqrjbVarDxjokdxxww.lqeggnwhkg() + " (" + ppxfxbqfkfVar.dsvhmnatus() + "-byte, " + lValueOf2 + str4);
                    } else {
                        this.f130291iobyxmoadg.log(ppxfxbqfkfVar.F(charsetZoijcleaow));
                        zoijcleaow zoijcleaowVar = this.f130291iobyxmoadg;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("--> END ");
                        sb5.append(zynmafqrjbVarDxjokdxxww.lqeggnwhkg());
                        sb5.append(" (");
                        sb5.append(istkbnxepwVarIobyxmoadg.iobyxmoadg());
                        str2 = str3;
                        sb5.append(str2);
                        zoijcleaowVar.log(sb5.toString());
                    }
                    str2 = str3;
                }
                str = "gzip";
                str2 = str3;
            }
        } else {
            z13 = z15;
            str = "gzip";
            str4 = "-gzipped-byte body)";
            str2 = "-byte body)";
        }
        long jNanoTime = System.nanoTime();
        try {
            cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(zynmafqrjbVarDxjokdxxww);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVarZoijcleaow.wkgbmnqykc();
            zdlpuopuiu.lqeggnwhkg(yadqdtsiqtVarWkgbmnqykc);
            long jNufgyqmvbu = yadqdtsiqtVarWkgbmnqykc.nufgyqmvbu();
            String str5 = jNufgyqmvbu != -1 ? jNufgyqmvbu + "-byte" : "unknown-length";
            zoijcleaow zoijcleaowVar2 = this.f130291iobyxmoadg;
            String str6 = str4;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<-- ");
            sb6.append(cdpycssgdhVarZoijcleaow.btonecajqb());
            if (cdpycssgdhVarZoijcleaow.zdlpuopuiu().length() == 0) {
                string2 = "";
                c13 = ' ';
            } else {
                String strZdlpuopuiu = cdpycssgdhVarZoijcleaow.zdlpuopuiu();
                StringBuilder sb7 = new StringBuilder();
                c13 = ' ';
                sb7.append(' ');
                sb7.append(strZdlpuopuiu);
                string2 = sb7.toString();
            }
            sb6.append(string2);
            sb6.append(c13);
            sb6.append(cdpycssgdhVarZoijcleaow.cdpycssgdh().gtknphoqwx());
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(z13 ? "" : ", " + str5 + " body");
            sb6.append(')');
            zoijcleaowVar2.log(sb6.toString());
            if (z13) {
                yggfygwlhe yggfygwlheVarKcexrzcfyt = cdpycssgdhVarZoijcleaow.kcexrzcfyt();
                int size2 = yggfygwlheVarKcexrzcfyt.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    wkgbmnqykc(yggfygwlheVarKcexrzcfyt, i14);
                }
                if (!z14 || !eablkybsjg.zoijcleaow(cdpycssgdhVarZoijcleaow)) {
                    this.f130291iobyxmoadg.log("<-- END HTTP");
                } else if (iobyxmoadg(cdpycssgdhVarZoijcleaow.kcexrzcfyt())) {
                    this.f130291iobyxmoadg.log("<-- END HTTP (encoded body omitted)");
                } else if (zoijcleaow(cdpycssgdhVarZoijcleaow)) {
                    this.f130291iobyxmoadg.log("<-- END HTTP (streaming)");
                } else {
                    bl.eablkybsjg eablkybsjgVarDraadjrbmk = yadqdtsiqtVarWkgbmnqykc.draadjrbmk();
                    eablkybsjgVarDraadjrbmk.lrnfpwlwnk(Long.MAX_VALUE);
                    ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = eablkybsjgVarDraadjrbmk.zoijcleaow();
                    if (kcexrzcfyt.istkbnxepw(str, yggfygwlheVarKcexrzcfyt.iobyxmoadg("Content-Encoding"), true)) {
                        lValueOf = Long.valueOf(ppxfxbqfkfVarZoijcleaow.dsvhmnatus());
                        agtfadlqog agtfadlqogVar2 = new agtfadlqog(ppxfxbqfkfVarZoijcleaow.clone());
                        try {
                            ppxfxbqfkfVarZoijcleaow = new ppxfxbqfkf();
                            ppxfxbqfkfVarZoijcleaow.xrmfcynszj(agtfadlqogVar2);
                            rg.zoijcleaow.iobyxmoadg(agtfadlqogVar2, null);
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                rg.zoijcleaow.iobyxmoadg(agtfadlqogVar2, th4);
                                throw th5;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    Charset charsetZoijcleaow2 = mk.iobyxmoadg.zoijcleaow(yadqdtsiqtVarWkgbmnqykc.dxjokdxxww(), null, 1, null);
                    if (!al.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVarZoijcleaow)) {
                        this.f130291iobyxmoadg.log("");
                        this.f130291iobyxmoadg.log("<-- END HTTP (binary " + ppxfxbqfkfVarZoijcleaow.dsvhmnatus() + "-byte body omitted)");
                        return cdpycssgdhVarZoijcleaow;
                    }
                    if (jNufgyqmvbu != 0) {
                        this.f130291iobyxmoadg.log("");
                        this.f130291iobyxmoadg.log(ppxfxbqfkfVarZoijcleaow.clone().F(charsetZoijcleaow2));
                    }
                    if (lValueOf != null) {
                        this.f130291iobyxmoadg.log("<-- END HTTP (" + ppxfxbqfkfVarZoijcleaow.dsvhmnatus() + "-byte, " + lValueOf + str6);
                    } else {
                        this.f130291iobyxmoadg.log("<-- END HTTP (" + ppxfxbqfkfVarZoijcleaow.dsvhmnatus() + str2);
                    }
                }
            }
            return cdpycssgdhVarZoijcleaow;
        } catch (Exception e13) {
            this.f130291iobyxmoadg.log("<-- HTTP FAILED: " + e13);
            throw e13;
        }
    }

    public final void ppxfxbqfkf(EnumC3324iobyxmoadg enumC3324iobyxmoadg) {
        zdlpuopuiu.btonecajqb(enumC3324iobyxmoadg, "<set-?>");
        this.f130292ppxfxbqfkf = enumC3324iobyxmoadg;
    }
}

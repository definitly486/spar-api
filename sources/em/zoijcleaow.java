package em;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.bp.DateTimeException;
import t6.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    static final Comparator f31492btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final Map f31493dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final gm.btonecajqb f31494nufgyqmvbu = new iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f31495eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private char f31496gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private zoijcleaow f31497iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f31498lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f31499ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f31500wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f31501zoijcleaow;

    static final class btonecajqb implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final em.dxjokdxxww f31505zdlpuopuiu;

        public btonecajqb(em.dxjokdxxww dxjokdxxwwVar) {
            this.f31505zdlpuopuiu = dxjokdxxwwVar;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            Long lGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(gm.iobyxmoadg.f37838vipkmwdibw);
            if (lGxszxtbevo == null) {
                return false;
            }
            sb3.append("GMT");
            if (this.f31505zdlpuopuiu == em.dxjokdxxww.FULL) {
                return new draadjrbmk("", "+HH:MM:ss").iobyxmoadg(ppxfxbqfkfVar, sb3);
            }
            int iWflxmlrfwp = fm.ppxfxbqfkf.wflxmlrfwp(lGxszxtbevo.longValue());
            if (iWflxmlrfwp == 0) {
                return true;
            }
            int iAbs = Math.abs((iWflxmlrfwp / 3600) % 100);
            int iAbs2 = Math.abs((iWflxmlrfwp / 60) % 60);
            int iAbs3 = Math.abs(iWflxmlrfwp % 60);
            sb3.append(iWflxmlrfwp < 0 ? "-" : "+");
            sb3.append(iAbs);
            if (iAbs2 <= 0 && iAbs3 <= 0) {
                return true;
            }
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append((char) ((iAbs2 / 10) + 48));
            sb3.append((char) ((iAbs2 % 10) + 48));
            if (iAbs3 <= 0) {
                return true;
            }
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append((char) ((iAbs3 / 10) + 48));
            sb3.append((char) ((iAbs3 % 10) + 48));
            return true;
        }
    }

    static final class draadjrbmk implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f31509yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f31510zdlpuopuiu;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        static final String[] f31508jyumaefscl = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        static final draadjrbmk f31507iwizpuwonk = new draadjrbmk("Z", "+HH:MM:ss");

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        static final draadjrbmk f31506cqumvgiudr = new draadjrbmk(CommonUrlParts.Values.FALSE_INTEGER, "+HH:MM:ss");

        draadjrbmk(String str, String str2) {
            fm.ppxfxbqfkf.dxjokdxxww(str, "noOffsetText");
            fm.ppxfxbqfkf.dxjokdxxww(str2, "pattern");
            this.f31510zdlpuopuiu = str;
            this.f31509yggfygwlhe = zoijcleaow(str2);
        }

        private int zoijcleaow(String str) {
            int i13 = 0;
            while (true) {
                String[] strArr = f31508jyumaefscl;
                if (i13 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
                if (strArr[i13].equals(str)) {
                    return i13;
                }
                i13++;
            }
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            Long lGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(gm.iobyxmoadg.f37838vipkmwdibw);
            if (lGxszxtbevo == null) {
                return false;
            }
            int iWflxmlrfwp = fm.ppxfxbqfkf.wflxmlrfwp(lGxszxtbevo.longValue());
            if (iWflxmlrfwp == 0) {
                sb3.append(this.f31510zdlpuopuiu);
            } else {
                int iAbs = Math.abs((iWflxmlrfwp / 3600) % 100);
                int iAbs2 = Math.abs((iWflxmlrfwp / 60) % 60);
                int iAbs3 = Math.abs(iWflxmlrfwp % 60);
                int length = sb3.length();
                sb3.append(iWflxmlrfwp < 0 ? "-" : "+");
                sb3.append((char) ((iAbs / 10) + 48));
                sb3.append((char) ((iAbs % 10) + 48));
                int i13 = this.f31509yggfygwlhe;
                if (i13 >= 3 || (i13 >= 1 && iAbs2 > 0)) {
                    sb3.append(i13 % 2 == 0 ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
                    sb3.append((char) ((iAbs2 / 10) + 48));
                    sb3.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i14 = this.f31509yggfygwlhe;
                    if (i14 >= 7 || (i14 >= 5 && iAbs3 > 0)) {
                        sb3.append(i14 % 2 == 0 ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
                        sb3.append((char) ((iAbs3 / 10) + 48));
                        sb3.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb3.setLength(length);
                    sb3.append(this.f31510zdlpuopuiu);
                }
            }
            return true;
        }

        public String toString() {
            return "Offset(" + f31508jyumaefscl[this.f31509yggfygwlhe] + ",'" + this.f31510zdlpuopuiu.replace("'", "''") + "')";
        }
    }

    static final class dxjokdxxww implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f31511zdlpuopuiu;

        dxjokdxxww(int i13) {
            this.f31511zdlpuopuiu = i13;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            Long lGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(gm.iobyxmoadg.f37833ribwqtqdhb);
            gm.eablkybsjg eablkybsjgVarEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
            gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37815cqumvgiudr;
            Long lValueOf = eablkybsjgVarEablkybsjg.iobyxmoadg(iobyxmoadgVar) ? Long.valueOf(ppxfxbqfkfVar.eablkybsjg().agtfadlqog(iobyxmoadgVar)) : 0L;
            int i13 = 0;
            if (lGxszxtbevo == null) {
                return false;
            }
            long jLongValue = lGxszxtbevo.longValue();
            int iAgtfadlqog = iobyxmoadgVar.agtfadlqog(lValueOf.longValue());
            if (jLongValue >= -62167219200L) {
                long j13 = jLongValue - 253402300800L;
                long jEablkybsjg = 1 + fm.ppxfxbqfkf.eablkybsjg(j13, 315569520000L);
                cm.gxszxtbevo gxszxtbevoVarStevsuqkhv = cm.gxszxtbevo.stevsuqkhv(fm.ppxfxbqfkf.nufgyqmvbu(j13, 315569520000L) - 62167219200L, 0, cm.vdvldrhtss.f20155pmvmpeiblj);
                if (jEablkybsjg > 0) {
                    sb3.append('+');
                    sb3.append(jEablkybsjg);
                }
                sb3.append(gxszxtbevoVarStevsuqkhv);
                if (gxszxtbevoVarStevsuqkhv.pkzmftpjix() == 0) {
                    sb3.append(":00");
                }
            } else {
                long j14 = jLongValue + 62167219200L;
                long j15 = j14 / 315569520000L;
                long j16 = j14 % 315569520000L;
                cm.gxszxtbevo gxszxtbevoVarStevsuqkhv2 = cm.gxszxtbevo.stevsuqkhv(j16 - 62167219200L, 0, cm.vdvldrhtss.f20155pmvmpeiblj);
                int length = sb3.length();
                sb3.append(gxszxtbevoVarStevsuqkhv2);
                if (gxszxtbevoVarStevsuqkhv2.pkzmftpjix() == 0) {
                    sb3.append(":00");
                }
                if (j15 < 0) {
                    if (gxszxtbevoVarStevsuqkhv2.hcddaimhww() == -10000) {
                        sb3.replace(length, length + 2, Long.toString(j15 - 1));
                    } else if (j16 == 0) {
                        sb3.insert(length, j15);
                    } else {
                        sb3.insert(length + 1, Math.abs(j15));
                    }
                }
            }
            int i14 = this.f31511zdlpuopuiu;
            if (i14 == -2) {
                if (iAgtfadlqog != 0) {
                    sb3.append('.');
                    if (iAgtfadlqog % 1000000 == 0) {
                        sb3.append(Integer.toString((iAgtfadlqog / 1000000) + 1000).substring(1));
                    } else if (iAgtfadlqog % 1000 == 0) {
                        sb3.append(Integer.toString((iAgtfadlqog / 1000) + 1000000).substring(1));
                    } else {
                        sb3.append(Integer.toString(iAgtfadlqog + 1000000000).substring(1));
                    }
                }
            } else if (i14 > 0 || (i14 == -1 && iAgtfadlqog > 0)) {
                sb3.append('.');
                int i15 = 100000000;
                while (true) {
                    int i16 = this.f31511zdlpuopuiu;
                    if ((i16 != -1 || iAgtfadlqog <= 0) && i13 >= i16) {
                        break;
                    }
                    int i17 = iAgtfadlqog / i15;
                    sb3.append((char) (i17 + 48));
                    iAgtfadlqog -= i17 * i15;
                    i15 /= 10;
                    i13++;
                }
            }
            sb3.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    static final class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final char f31512zdlpuopuiu;

        eablkybsjg(char c13) {
            this.f31512zdlpuopuiu = c13;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            sb3.append(this.f31512zdlpuopuiu);
            return true;
        }

        public String toString() {
            if (this.f31512zdlpuopuiu == '\'') {
                return "''";
            }
            return "'" + this.f31512zdlpuopuiu + "'";
        }
    }

    static class gtknphoqwx implements lqeggnwhkg {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        static final int[] f31513esjtqupxsv = {0, 10, 100, 1000, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final int f31514cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final em.lqeggnwhkg f31515iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final int f31516jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final int f31517yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final gm.nufgyqmvbu f31518zdlpuopuiu;

        /* synthetic */ gtknphoqwx(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, em.lqeggnwhkg lqeggnwhkgVar, int i15, iobyxmoadg iobyxmoadgVar) {
            this(nufgyqmvbuVar, i13, i14, lqeggnwhkgVar, i15);
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            Long lGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(this.f31518zdlpuopuiu);
            if (lGxszxtbevo == null) {
                return false;
            }
            long jZoijcleaow = zoijcleaow(ppxfxbqfkfVar, lGxszxtbevo.longValue());
            em.eablkybsjg eablkybsjgVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
            String string = jZoijcleaow == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jZoijcleaow));
            if (string.length() > this.f31516jyumaefscl) {
                throw new DateTimeException("Field " + this.f31518zdlpuopuiu + " cannot be printed as the value " + jZoijcleaow + " exceeds the maximum print width of " + this.f31516jyumaefscl);
            }
            String strIobyxmoadg = eablkybsjgVarWkgbmnqykc.iobyxmoadg(string);
            if (jZoijcleaow >= 0) {
                int i13 = wkgbmnqykc.f31542iobyxmoadg[this.f31515iwizpuwonk.ordinal()];
                if (i13 == 1) {
                    int i14 = this.f31517yggfygwlhe;
                    if (i14 < 19 && jZoijcleaow >= f31513esjtqupxsv[i14]) {
                        sb3.append(eablkybsjgVarWkgbmnqykc.wkgbmnqykc());
                    }
                } else if (i13 == 2) {
                    sb3.append(eablkybsjgVarWkgbmnqykc.wkgbmnqykc());
                }
            } else {
                int i15 = wkgbmnqykc.f31542iobyxmoadg[this.f31515iwizpuwonk.ordinal()];
                if (i15 == 1 || i15 == 2 || i15 == 3) {
                    sb3.append(eablkybsjgVarWkgbmnqykc.ppxfxbqfkf());
                } else if (i15 == 4) {
                    throw new DateTimeException("Field " + this.f31518zdlpuopuiu + " cannot be printed as the value " + jZoijcleaow + " cannot be negative according to the SignStyle");
                }
            }
            for (int i16 = 0; i16 < this.f31517yggfygwlhe - strIobyxmoadg.length(); i16++) {
                sb3.append(eablkybsjgVarWkgbmnqykc.eablkybsjg());
            }
            sb3.append(strIobyxmoadg);
            return true;
        }

        gtknphoqwx ppxfxbqfkf() {
            return this.f31514cqumvgiudr == -1 ? this : new gtknphoqwx(this.f31518zdlpuopuiu, this.f31517yggfygwlhe, this.f31516jyumaefscl, this.f31515iwizpuwonk, -1);
        }

        public String toString() {
            int i13 = this.f31517yggfygwlhe;
            if (i13 == 1 && this.f31516jyumaefscl == 19 && this.f31515iwizpuwonk == em.lqeggnwhkg.NORMAL) {
                return "Value(" + this.f31518zdlpuopuiu + ")";
            }
            if (i13 == this.f31516jyumaefscl && this.f31515iwizpuwonk == em.lqeggnwhkg.NOT_NEGATIVE) {
                return "Value(" + this.f31518zdlpuopuiu + StringUtils.COMMA + this.f31517yggfygwlhe + ")";
            }
            return "Value(" + this.f31518zdlpuopuiu + StringUtils.COMMA + this.f31517yggfygwlhe + StringUtils.COMMA + this.f31516jyumaefscl + StringUtils.COMMA + this.f31515iwizpuwonk + ")";
        }

        gtknphoqwx wkgbmnqykc(int i13) {
            return new gtknphoqwx(this.f31518zdlpuopuiu, this.f31517yggfygwlhe, this.f31516jyumaefscl, this.f31515iwizpuwonk, this.f31514cqumvgiudr + i13);
        }

        long zoijcleaow(em.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
            return j13;
        }

        gtknphoqwx(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, em.lqeggnwhkg lqeggnwhkgVar) {
            this.f31518zdlpuopuiu = nufgyqmvbuVar;
            this.f31517yggfygwlhe = i13;
            this.f31516jyumaefscl = i14;
            this.f31515iwizpuwonk = lqeggnwhkgVar;
            this.f31514cqumvgiudr = 0;
        }

        private gtknphoqwx(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, em.lqeggnwhkg lqeggnwhkgVar, int i15) {
            this.f31518zdlpuopuiu = nufgyqmvbuVar;
            this.f31517yggfygwlhe = i13;
            this.f31516jyumaefscl = i14;
            this.f31515iwizpuwonk = lqeggnwhkgVar;
            this.f31514cqumvgiudr = i15;
        }
    }

    static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f31519yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lqeggnwhkg[] f31520zdlpuopuiu;

        gxszxtbevo(List list, boolean z13) {
            this((lqeggnwhkg[]) list.toArray(new lqeggnwhkg[list.size()]), z13);
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            int length = sb3.length();
            if (this.f31519yggfygwlhe) {
                ppxfxbqfkfVar.nufgyqmvbu();
            }
            try {
                for (lqeggnwhkg lqeggnwhkgVar : this.f31520zdlpuopuiu) {
                    if (!lqeggnwhkgVar.iobyxmoadg(ppxfxbqfkfVar, sb3)) {
                        sb3.setLength(length);
                        return true;
                    }
                }
                return true;
            } finally {
                if (this.f31519yggfygwlhe) {
                    ppxfxbqfkfVar.zoijcleaow();
                }
            }
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            if (this.f31520zdlpuopuiu != null) {
                sb3.append(this.f31519yggfygwlhe ? "[" : "(");
                for (lqeggnwhkg lqeggnwhkgVar : this.f31520zdlpuopuiu) {
                    sb3.append(lqeggnwhkgVar);
                }
                sb3.append(this.f31519yggfygwlhe ? "]" : ")");
            }
            return sb3.toString();
        }

        public gxszxtbevo zoijcleaow(boolean z13) {
            return z13 == this.f31519yggfygwlhe ? this : new gxszxtbevo(this.f31520zdlpuopuiu, z13);
        }

        gxszxtbevo(lqeggnwhkg[] lqeggnwhkgVarArr, boolean z13) {
            this.f31520zdlpuopuiu = lqeggnwhkgVarArr;
            this.f31519yggfygwlhe = z13;
        }
    }

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public cm.rgvfuqvkyq iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            cm.rgvfuqvkyq rgvfuqvkyqVar = (cm.rgvfuqvkyq) eablkybsjgVar.btonecajqb(gm.dxjokdxxww.lqeggnwhkg());
            if (rgvfuqvkyqVar == null || (rgvfuqvkyqVar instanceof cm.vdvldrhtss)) {
                return null;
            }
            return rgvfuqvkyqVar;
        }
    }

    static final class kcexrzcfyt implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f31521yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final gm.btonecajqb f31522zdlpuopuiu;

        kcexrzcfyt(gm.btonecajqb btonecajqbVar, String str) {
            this.f31522zdlpuopuiu = btonecajqbVar;
            this.f31521yggfygwlhe = str;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            cm.rgvfuqvkyq rgvfuqvkyqVar = (cm.rgvfuqvkyq) ppxfxbqfkfVar.lqeggnwhkg(this.f31522zdlpuopuiu);
            if (rgvfuqvkyqVar == null) {
                return false;
            }
            sb3.append(rgvfuqvkyqVar.kcexrzcfyt());
            return true;
        }

        public String toString() {
            return this.f31521yggfygwlhe;
        }
    }

    interface lqeggnwhkg {
        boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3);
    }

    static final class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final boolean f31523iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f31524jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f31525yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final gm.nufgyqmvbu f31526zdlpuopuiu;

        nufgyqmvbu(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, boolean z13) {
            fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
            if (!nufgyqmvbuVar.dxjokdxxww().dxjokdxxww()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + nufgyqmvbuVar);
            }
            if (i13 < 0 || i13 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i13);
            }
            if (i14 < 1 || i14 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i14);
            }
            if (i14 >= i13) {
                this.f31526zdlpuopuiu = nufgyqmvbuVar;
                this.f31525yggfygwlhe = i13;
                this.f31524jyumaefscl = i14;
                this.f31523iwizpuwonk = z13;
                return;
            }
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i14 + " < " + i13);
        }

        private BigDecimal zoijcleaow(long j13) {
            gm.draadjrbmk draadjrbmkVarDxjokdxxww = this.f31526zdlpuopuiu.dxjokdxxww();
            draadjrbmkVarDxjokdxxww.wkgbmnqykc(j13, this.f31526zdlpuopuiu);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(draadjrbmkVarDxjokdxxww.nufgyqmvbu());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j13).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(draadjrbmkVarDxjokdxxww.lqeggnwhkg()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return bigDecimalDivide.compareTo(bigDecimal) == 0 ? bigDecimal : lereixgezr.iobyxmoadg(bigDecimalDivide);
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            Long lGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(this.f31526zdlpuopuiu);
            if (lGxszxtbevo == null) {
                return false;
            }
            em.eablkybsjg eablkybsjgVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
            BigDecimal bigDecimalZoijcleaow = zoijcleaow(lGxszxtbevo.longValue());
            if (bigDecimalZoijcleaow.scale() != 0) {
                String strIobyxmoadg = eablkybsjgVarWkgbmnqykc.iobyxmoadg(bigDecimalZoijcleaow.setScale(Math.min(Math.max(bigDecimalZoijcleaow.scale(), this.f31525yggfygwlhe), this.f31524jyumaefscl), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f31523iwizpuwonk) {
                    sb3.append(eablkybsjgVarWkgbmnqykc.zoijcleaow());
                }
                sb3.append(strIobyxmoadg);
                return true;
            }
            if (this.f31525yggfygwlhe <= 0) {
                return true;
            }
            if (this.f31523iwizpuwonk) {
                sb3.append(eablkybsjgVarWkgbmnqykc.zoijcleaow());
            }
            for (int i13 = 0; i13 < this.f31525yggfygwlhe; i13++) {
                sb3.append(eablkybsjgVarWkgbmnqykc.eablkybsjg());
            }
            return true;
        }

        public String toString() {
            return "Fraction(" + this.f31526zdlpuopuiu + StringUtils.COMMA + this.f31525yggfygwlhe + StringUtils.COMMA + this.f31524jyumaefscl + (this.f31523iwizpuwonk ? ",DecimalPoint" : "") + ")";
        }
    }

    enum ojitshcjhn implements lqeggnwhkg {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class oxmwwwfdhm implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f31532yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final char f31533zdlpuopuiu;

        public oxmwwwfdhm(char c13, int i13) {
            this.f31533zdlpuopuiu = c13;
            this.f31532yggfygwlhe = i13;
        }

        private lqeggnwhkg zoijcleaow(gm.wflxmlrfwp wflxmlrfwpVar) {
            char c13 = this.f31533zdlpuopuiu;
            if (c13 == 'W') {
                return new gtknphoqwx(wflxmlrfwpVar.agtfadlqog(), 1, 2, em.lqeggnwhkg.NOT_NEGATIVE);
            }
            if (c13 == 'Y') {
                if (this.f31532yggfygwlhe == 2) {
                    return new agtfadlqog(wflxmlrfwpVar.draadjrbmk(), 2, 2, 0, agtfadlqog.f31502zynmafqrjb);
                }
                gm.nufgyqmvbu nufgyqmvbuVarDraadjrbmk = wflxmlrfwpVar.draadjrbmk();
                int i13 = this.f31532yggfygwlhe;
                return new gtknphoqwx(nufgyqmvbuVarDraadjrbmk, i13, 19, i13 < 4 ? em.lqeggnwhkg.NORMAL : em.lqeggnwhkg.EXCEEDS_PAD, -1, null);
            }
            if (c13 != 'c' && c13 != 'e') {
                if (c13 != 'w') {
                    return null;
                }
                return new gtknphoqwx(wflxmlrfwpVar.ojitshcjhn(), this.f31532yggfygwlhe, 2, em.lqeggnwhkg.NOT_NEGATIVE);
            }
            return new gtknphoqwx(wflxmlrfwpVar.wkgbmnqykc(), this.f31532yggfygwlhe, 2, em.lqeggnwhkg.NOT_NEGATIVE);
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            return zoijcleaow(gm.wflxmlrfwp.btonecajqb(ppxfxbqfkfVar.ppxfxbqfkf())).iobyxmoadg(ppxfxbqfkfVar, sb3);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Localized(");
            char c13 = this.f31533zdlpuopuiu;
            if (c13 == 'Y') {
                int i13 = this.f31532yggfygwlhe;
                if (i13 == 1) {
                    sb3.append("WeekBasedYear");
                } else if (i13 == 2) {
                    sb3.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb3.append("WeekBasedYear,");
                    sb3.append(this.f31532yggfygwlhe);
                    sb3.append(StringUtils.COMMA);
                    sb3.append(19);
                    sb3.append(StringUtils.COMMA);
                    sb3.append(this.f31532yggfygwlhe < 4 ? em.lqeggnwhkg.NORMAL : em.lqeggnwhkg.EXCEEDS_PAD);
                }
            } else {
                if (c13 == 'c' || c13 == 'e') {
                    sb3.append("DayOfWeek");
                } else if (c13 == 'w') {
                    sb3.append("WeekOfWeekBasedYear");
                } else if (c13 == 'W') {
                    sb3.append("WeekOfMonth");
                }
                sb3.append(StringUtils.COMMA);
                sb3.append(this.f31532yggfygwlhe);
            }
            sb3.append(")");
            return sb3.toString();
        }
    }

    class ppxfxbqfkf implements Comparator {
        ppxfxbqfkf() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    static final class rgvfuqvkyq implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f31534zdlpuopuiu;

        rgvfuqvkyq(String str) {
            this.f31534zdlpuopuiu = str;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            sb3.append(this.f31534zdlpuopuiu);
            return true;
        }

        public String toString() {
            return "'" + this.f31534zdlpuopuiu.replace("'", "''") + "'";
        }
    }

    static final class vdvldrhtss implements lqeggnwhkg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private volatile gtknphoqwx f31535iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final em.wkgbmnqykc f31536jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final em.dxjokdxxww f31537yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final gm.nufgyqmvbu f31538zdlpuopuiu;

        vdvldrhtss(gm.nufgyqmvbu nufgyqmvbuVar, em.dxjokdxxww dxjokdxxwwVar, em.wkgbmnqykc wkgbmnqykcVar) {
            this.f31538zdlpuopuiu = nufgyqmvbuVar;
            this.f31537yggfygwlhe = dxjokdxxwwVar;
            this.f31536jyumaefscl = wkgbmnqykcVar;
        }

        private gtknphoqwx zoijcleaow() {
            if (this.f31535iwizpuwonk == null) {
                this.f31535iwizpuwonk = new gtknphoqwx(this.f31538zdlpuopuiu, 1, 19, em.lqeggnwhkg.NORMAL);
            }
            return this.f31535iwizpuwonk;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            Long lGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo(this.f31538zdlpuopuiu);
            if (lGxszxtbevo == null) {
                return false;
            }
            String strPpxfxbqfkf = this.f31536jyumaefscl.ppxfxbqfkf(this.f31538zdlpuopuiu, lGxszxtbevo.longValue(), this.f31537yggfygwlhe, ppxfxbqfkfVar.ppxfxbqfkf());
            if (strPpxfxbqfkf == null) {
                return zoijcleaow().iobyxmoadg(ppxfxbqfkfVar, sb3);
            }
            sb3.append(strPpxfxbqfkf);
            return true;
        }

        public String toString() {
            if (this.f31537yggfygwlhe == em.dxjokdxxww.FULL) {
                return "Text(" + this.f31538zdlpuopuiu + ")";
            }
            return "Text(" + this.f31538zdlpuopuiu + StringUtils.COMMA + this.f31537yggfygwlhe + ")";
        }
    }

    static final class wflxmlrfwp implements lqeggnwhkg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final char f31539jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f31540yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lqeggnwhkg f31541zdlpuopuiu;

        wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar, int i13, char c13) {
            this.f31541zdlpuopuiu = lqeggnwhkgVar;
            this.f31540yggfygwlhe = i13;
            this.f31539jyumaefscl = c13;
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            int length = sb3.length();
            if (!this.f31541zdlpuopuiu.iobyxmoadg(ppxfxbqfkfVar, sb3)) {
                return false;
            }
            int length2 = sb3.length() - length;
            if (length2 <= this.f31540yggfygwlhe) {
                for (int i13 = 0; i13 < this.f31540yggfygwlhe - length2; i13++) {
                    sb3.insert(length, this.f31539jyumaefscl);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f31540yggfygwlhe);
        }

        public String toString() {
            String str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Pad(");
            sb3.append(this.f31541zdlpuopuiu);
            sb3.append(StringUtils.COMMA);
            sb3.append(this.f31540yggfygwlhe);
            if (this.f31539jyumaefscl == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f31539jyumaefscl + "')";
            }
            sb3.append(str);
            return sb3.toString();
        }
    }

    static /* synthetic */ class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f31542iobyxmoadg;

        static {
            int[] iArr = new int[em.lqeggnwhkg.values().length];
            f31542iobyxmoadg = iArr;
            try {
                iArr[em.lqeggnwhkg.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31542iobyxmoadg[em.lqeggnwhkg.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31542iobyxmoadg[em.lqeggnwhkg.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31542iobyxmoadg[em.lqeggnwhkg.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class zdlpuopuiu implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private static final Comparator f31543yggfygwlhe = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final em.dxjokdxxww f31544zdlpuopuiu;

        class iobyxmoadg implements Comparator {
            iobyxmoadg() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        zdlpuopuiu(em.dxjokdxxww dxjokdxxwwVar) {
            this.f31544zdlpuopuiu = (em.dxjokdxxww) fm.ppxfxbqfkf.dxjokdxxww(dxjokdxxwwVar, "textStyle");
        }

        @Override // em.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(em.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
            boolean zNufgyqmvbu;
            cm.rgvfuqvkyq rgvfuqvkyqVar = (cm.rgvfuqvkyq) ppxfxbqfkfVar.lqeggnwhkg(gm.dxjokdxxww.lqeggnwhkg());
            if (rgvfuqvkyqVar == null) {
                return false;
            }
            if (rgvfuqvkyqVar.jyumaefscl() instanceof cm.vdvldrhtss) {
                sb3.append(rgvfuqvkyqVar.kcexrzcfyt());
                return true;
            }
            gm.eablkybsjg eablkybsjgVarEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
            gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37833ribwqtqdhb;
            if (eablkybsjgVarEablkybsjg.iobyxmoadg(iobyxmoadgVar)) {
                zNufgyqmvbu = rgvfuqvkyqVar.zdlpuopuiu().nufgyqmvbu(cm.wkgbmnqykc.zynmafqrjb(eablkybsjgVarEablkybsjg.agtfadlqog(iobyxmoadgVar)));
            } else {
                zNufgyqmvbu = false;
            }
            sb3.append(TimeZone.getTimeZone(rgvfuqvkyqVar.kcexrzcfyt()).getDisplayName(zNufgyqmvbu, this.f31544zdlpuopuiu.iobyxmoadg() == em.dxjokdxxww.FULL ? 1 : 0, ppxfxbqfkfVar.ppxfxbqfkf()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.f31544zdlpuopuiu + ")";
        }
    }

    /* JADX INFO: renamed from: em.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C0673zoijcleaow extends em.wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ em.nufgyqmvbu.zoijcleaow f31546zoijcleaow;

        C0673zoijcleaow(em.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            this.f31546zoijcleaow = zoijcleaowVar;
        }

        @Override // em.wkgbmnqykc
        public String ppxfxbqfkf(gm.nufgyqmvbu nufgyqmvbuVar, long j13, em.dxjokdxxww dxjokdxxwwVar, Locale locale) {
            return this.f31546zoijcleaow.iobyxmoadg(j13, dxjokdxxwwVar);
        }
    }

    static {
        HashMap map = new HashMap();
        f31493dxjokdxxww = map;
        map.put('G', gm.iobyxmoadg.f37824jlmebxxoox);
        map.put('y', gm.iobyxmoadg.f37834sopmlzcsov);
        map.put('u', gm.iobyxmoadg.f37816crxdokpmqz);
        gm.nufgyqmvbu nufgyqmvbuVar = gm.ppxfxbqfkf.f37855zoijcleaow;
        map.put('Q', nufgyqmvbuVar);
        map.put('q', nufgyqmvbuVar);
        gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37830ntlheqmsrt;
        map.put('M', iobyxmoadgVar);
        map.put('L', iobyxmoadgVar);
        map.put('D', gm.iobyxmoadg.f37835stevsuqkhv);
        map.put('d', gm.iobyxmoadg.f37840wypolnanlu);
        map.put('F', gm.iobyxmoadg.f37814cllcsxoeiz);
        gm.iobyxmoadg iobyxmoadgVar2 = gm.iobyxmoadg.f37820hkdspvbjdz;
        map.put('E', iobyxmoadgVar2);
        map.put('c', iobyxmoadgVar2);
        map.put('e', iobyxmoadgVar2);
        map.put('a', gm.iobyxmoadg.f37825jpowsppfya);
        map.put('H', gm.iobyxmoadg.f37831pkzmftpjix);
        map.put('k', gm.iobyxmoadg.f37819hcddaimhww);
        map.put('K', gm.iobyxmoadg.f37839wwaezpbzkn);
        map.put('h', gm.iobyxmoadg.f37842ylkuphrtab);
        map.put('m', gm.iobyxmoadg.f37821iozdgvuglv);
        map.put('s', gm.iobyxmoadg.f37813cdpycssgdh);
        gm.iobyxmoadg iobyxmoadgVar3 = gm.iobyxmoadg.f37815cqumvgiudr;
        map.put('S', iobyxmoadgVar3);
        map.put('A', gm.iobyxmoadg.f37822istkbnxepw);
        map.put('n', iobyxmoadgVar3);
        map.put('N', gm.iobyxmoadg.f37818esjtqupxsv);
        f31492btonecajqb = new ppxfxbqfkf();
    }

    public zoijcleaow() {
        this.f31497iobyxmoadg = this;
        this.f31499ppxfxbqfkf = new ArrayList();
        this.f31498lqeggnwhkg = -1;
        this.f31501zoijcleaow = null;
        this.f31500wkgbmnqykc = false;
    }

    private void istkbnxepw(String str) {
        int i13;
        int i14 = 0;
        while (i14 < str.length()) {
            char cCharAt = str.charAt(i14);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i15 = i14 + 1;
                while (i15 < str.length() && str.charAt(i15) == cCharAt) {
                    i15++;
                }
                int i16 = i15 - i14;
                if (cCharAt == 'p') {
                    if (i15 >= str.length() || (((cCharAt = str.charAt(i15)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i13 = i16;
                        i16 = 0;
                    } else {
                        int i17 = i15 + 1;
                        while (i17 < str.length() && str.charAt(i17) == cCharAt) {
                            i17++;
                        }
                        i13 = i17 - i15;
                        i15 = i17;
                    }
                    if (i16 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                    iwizpuwonk(i16);
                    i16 = i13;
                }
                gm.nufgyqmvbu nufgyqmvbuVar = (gm.nufgyqmvbu) f31493dxjokdxxww.get(Character.valueOf(cCharAt));
                if (nufgyqmvbuVar != null) {
                    pmvmpeiblj(cCharAt, i16, nufgyqmvbuVar);
                } else if (cCharAt == 'z') {
                    if (i16 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i16 == 4) {
                        zdlpuopuiu(em.dxjokdxxww.FULL);
                    } else {
                        zdlpuopuiu(em.dxjokdxxww.SHORT);
                    }
                } else if (cCharAt != 'V') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i16 < 4) {
                            nufgyqmvbu("+HHMM", "+0000");
                        } else if (i16 == 4) {
                            lqeggnwhkg(em.dxjokdxxww.FULL);
                        } else {
                            if (i16 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            nufgyqmvbu("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i16 == 1) {
                            lqeggnwhkg(em.dxjokdxxww.SHORT);
                        } else {
                            if (i16 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            lqeggnwhkg(em.dxjokdxxww.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i16 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        nufgyqmvbu(draadjrbmk.f31508jyumaefscl[i16 + (i16 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i16 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i16 == 1) {
                            str2 = "+00";
                        } else if (i16 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        nufgyqmvbu(draadjrbmk.f31508jyumaefscl[i16 + (i16 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i16 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        wkgbmnqykc(new oxmwwwfdhm('W', i16));
                    } else if (cCharAt == 'w') {
                        if (i16 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        wkgbmnqykc(new oxmwwwfdhm('w', i16));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        wkgbmnqykc(new oxmwwwfdhm('Y', i16));
                    }
                } else {
                    if (i16 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    oxmwwwfdhm();
                }
                i14 = i15 - 1;
            } else if (cCharAt == '\'') {
                int i18 = i14 + 1;
                int i19 = i18;
                while (i19 < str.length()) {
                    if (str.charAt(i19) == '\'') {
                        int i23 = i19 + 1;
                        if (i23 >= str.length() || str.charAt(i23) != '\'') {
                            break;
                        } else {
                            i19 = i23;
                        }
                    }
                    i19++;
                }
                if (i19 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
                String strSubstring = str.substring(i18, i19);
                if (strSubstring.length() == 0) {
                    eablkybsjg('\'');
                } else {
                    gxszxtbevo(strSubstring.replace("''", "'"));
                }
                i14 = i19;
            } else if (cCharAt == '[') {
                jyumaefscl();
            } else if (cCharAt == ']') {
                if (this.f31497iobyxmoadg.f31501zoijcleaow == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                yggfygwlhe();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                eablkybsjg(cCharAt);
            }
            i14++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b5  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x01b5, please report this as an issue */
    private void pmvmpeiblj(char c13, int i13, gm.nufgyqmvbu nufgyqmvbuVar) {
        if (c13 != 'Q') {
            if (c13 == 'S') {
                zoijcleaow(gm.iobyxmoadg.f37815cqumvgiudr, i13, i13, false);
                return;
            }
            if (c13 == 'a') {
                if (i13 == 1) {
                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.SHORT);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c13);
            }
            if (c13 != 'h' && c13 != 'k' && c13 != 'm') {
                if (c13 != 'q') {
                    if (c13 != 's') {
                        if (c13 == 'u' || c13 == 'y') {
                            if (i13 == 2) {
                                vdvldrhtss(nufgyqmvbuVar, 2, 2, agtfadlqog.f31502zynmafqrjb);
                                return;
                            } else if (i13 < 4) {
                                rgvfuqvkyq(nufgyqmvbuVar, i13, 19, em.lqeggnwhkg.NORMAL);
                                return;
                            } else {
                                rgvfuqvkyq(nufgyqmvbuVar, i13, 19, em.lqeggnwhkg.EXCEEDS_PAD);
                                return;
                            }
                        }
                        switch (c13) {
                            case 'D':
                                if (i13 == 1) {
                                    agtfadlqog(nufgyqmvbuVar);
                                    return;
                                } else {
                                    if (i13 <= 3) {
                                        ojitshcjhn(nufgyqmvbuVar, i13);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c13);
                                }
                            case 'E':
                            case 'G':
                                if (i13 == 1 || i13 == 2 || i13 == 3) {
                                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.SHORT);
                                    return;
                                }
                                if (i13 == 4) {
                                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.FULL);
                                    return;
                                } else {
                                    if (i13 == 5) {
                                        gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.NARROW);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c13);
                                }
                            case 'F':
                                if (i13 == 1) {
                                    agtfadlqog(nufgyqmvbuVar);
                                    return;
                                }
                                throw new IllegalArgumentException("Too many pattern letters: " + c13);
                            default:
                                switch (c13) {
                                    case 'K':
                                        break;
                                    case 'L':
                                        break;
                                    case 'M':
                                        break;
                                    default:
                                        switch (c13) {
                                            case 'c':
                                                if (i13 == 1) {
                                                    wkgbmnqykc(new oxmwwwfdhm('c', i13));
                                                    return;
                                                }
                                                if (i13 == 2) {
                                                    throw new IllegalArgumentException("Invalid number of pattern letters: " + c13);
                                                }
                                                if (i13 == 3) {
                                                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.SHORT_STANDALONE);
                                                    return;
                                                }
                                                if (i13 == 4) {
                                                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.FULL_STANDALONE);
                                                    return;
                                                } else {
                                                    if (i13 == 5) {
                                                        gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.NARROW_STANDALONE);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c13);
                                                }
                                            case 'd':
                                                break;
                                            case 'e':
                                                if (i13 == 1 || i13 == 2) {
                                                    wkgbmnqykc(new oxmwwwfdhm('e', i13));
                                                    return;
                                                }
                                                if (i13 == 3) {
                                                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.SHORT);
                                                    return;
                                                }
                                                if (i13 == 4) {
                                                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.FULL);
                                                    return;
                                                } else {
                                                    if (i13 == 5) {
                                                        gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.NARROW);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c13);
                                                }
                                            default:
                                                if (i13 == 1) {
                                                    agtfadlqog(nufgyqmvbuVar);
                                                    return;
                                                } else {
                                                    ojitshcjhn(nufgyqmvbuVar, i13);
                                                    return;
                                                }
                                        }
                                        break;
                                }
                            case 'H':
                                if (i13 == 1) {
                                    agtfadlqog(nufgyqmvbuVar);
                                    return;
                                } else {
                                    if (i13 == 2) {
                                        ojitshcjhn(nufgyqmvbuVar, i13);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c13);
                                }
                        }
                    }
                }
                if (i13 == 1) {
                    agtfadlqog(nufgyqmvbuVar);
                    return;
                }
                if (i13 == 2) {
                    ojitshcjhn(nufgyqmvbuVar, 2);
                    return;
                }
                if (i13 == 3) {
                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.SHORT_STANDALONE);
                    return;
                }
                if (i13 == 4) {
                    gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.FULL_STANDALONE);
                    return;
                } else {
                    if (i13 == 5) {
                        gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.NARROW_STANDALONE);
                        return;
                    }
                    throw new IllegalArgumentException("Too many pattern letters: " + c13);
                }
            }
            if (i13 == 1) {
                agtfadlqog(nufgyqmvbuVar);
                return;
            } else {
                if (i13 == 2) {
                    ojitshcjhn(nufgyqmvbuVar, i13);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c13);
            }
        }
        if (i13 == 1) {
            agtfadlqog(nufgyqmvbuVar);
            return;
        }
        if (i13 == 2) {
            ojitshcjhn(nufgyqmvbuVar, 2);
            return;
        }
        if (i13 == 3) {
            gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.SHORT);
            return;
        }
        if (i13 == 4) {
            gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.FULL);
        } else {
            if (i13 == 5) {
                gtknphoqwx(nufgyqmvbuVar, em.dxjokdxxww.NARROW);
                return;
            }
            throw new IllegalArgumentException("Too many pattern letters: " + c13);
        }
    }

    private zoijcleaow wflxmlrfwp(gtknphoqwx gtknphoqwxVar) {
        gtknphoqwx gtknphoqwxVarPpxfxbqfkf;
        zoijcleaow zoijcleaowVar = this.f31497iobyxmoadg;
        int i13 = zoijcleaowVar.f31498lqeggnwhkg;
        if (i13 < 0 || !(zoijcleaowVar.f31499ppxfxbqfkf.get(i13) instanceof gtknphoqwx)) {
            this.f31497iobyxmoadg.f31498lqeggnwhkg = wkgbmnqykc(gtknphoqwxVar);
        } else {
            zoijcleaow zoijcleaowVar2 = this.f31497iobyxmoadg;
            int i14 = zoijcleaowVar2.f31498lqeggnwhkg;
            gtknphoqwx gtknphoqwxVar2 = (gtknphoqwx) zoijcleaowVar2.f31499ppxfxbqfkf.get(i14);
            int i15 = gtknphoqwxVar.f31517yggfygwlhe;
            int i16 = gtknphoqwxVar.f31516jyumaefscl;
            if (i15 == i16 && gtknphoqwxVar.f31515iwizpuwonk == em.lqeggnwhkg.NOT_NEGATIVE) {
                gtknphoqwxVarPpxfxbqfkf = gtknphoqwxVar2.wkgbmnqykc(i16);
                wkgbmnqykc(gtknphoqwxVar.ppxfxbqfkf());
                this.f31497iobyxmoadg.f31498lqeggnwhkg = i14;
            } else {
                gtknphoqwxVarPpxfxbqfkf = gtknphoqwxVar2.ppxfxbqfkf();
                this.f31497iobyxmoadg.f31498lqeggnwhkg = wkgbmnqykc(gtknphoqwxVar);
            }
            this.f31497iobyxmoadg.f31499ppxfxbqfkf.set(i14, gtknphoqwxVarPpxfxbqfkf);
        }
        return this;
    }

    private int wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(lqeggnwhkgVar, "pp");
        zoijcleaow zoijcleaowVar = this.f31497iobyxmoadg;
        int i13 = zoijcleaowVar.f31495eablkybsjg;
        if (i13 > 0) {
            if (lqeggnwhkgVar != null) {
                lqeggnwhkgVar = new wflxmlrfwp(lqeggnwhkgVar, i13, zoijcleaowVar.f31496gxszxtbevo);
            }
            zoijcleaow zoijcleaowVar2 = this.f31497iobyxmoadg;
            zoijcleaowVar2.f31495eablkybsjg = 0;
            zoijcleaowVar2.f31496gxszxtbevo = (char) 0;
        }
        this.f31497iobyxmoadg.f31499ppxfxbqfkf.add(lqeggnwhkgVar);
        zoijcleaow zoijcleaowVar3 = this.f31497iobyxmoadg;
        zoijcleaowVar3.f31498lqeggnwhkg = -1;
        return zoijcleaowVar3.f31499ppxfxbqfkf.size() - 1;
    }

    public zoijcleaow agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
        wflxmlrfwp(new gtknphoqwx(nufgyqmvbuVar, 1, 19, em.lqeggnwhkg.NORMAL));
        return this;
    }

    public zoijcleaow btonecajqb(String str) {
        fm.ppxfxbqfkf.dxjokdxxww(str, "pattern");
        istkbnxepw(str);
        return this;
    }

    public em.iobyxmoadg cdpycssgdh() {
        return iozdgvuglv(Locale.getDefault());
    }

    public zoijcleaow cqumvgiudr(int i13, char c13) {
        if (i13 < 1) {
            throw new IllegalArgumentException("The pad width must be at least one but was " + i13);
        }
        zoijcleaow zoijcleaowVar = this.f31497iobyxmoadg;
        zoijcleaowVar.f31495eablkybsjg = i13;
        zoijcleaowVar.f31496gxszxtbevo = c13;
        zoijcleaowVar.f31498lqeggnwhkg = -1;
        return this;
    }

    public zoijcleaow draadjrbmk(gm.nufgyqmvbu nufgyqmvbuVar, Map map) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
        fm.ppxfxbqfkf.dxjokdxxww(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        em.dxjokdxxww dxjokdxxwwVar = em.dxjokdxxww.FULL;
        wkgbmnqykc(new vdvldrhtss(nufgyqmvbuVar, dxjokdxxwwVar, new C0673zoijcleaow(new em.nufgyqmvbu.zoijcleaow(Collections.singletonMap(dxjokdxxwwVar, linkedHashMap)))));
        return this;
    }

    public zoijcleaow dxjokdxxww() {
        wkgbmnqykc(draadjrbmk.f31507iwizpuwonk);
        return this;
    }

    public zoijcleaow eablkybsjg(char c13) {
        wkgbmnqykc(new eablkybsjg(c13));
        return this;
    }

    public zoijcleaow esjtqupxsv() {
        wkgbmnqykc(ojitshcjhn.INSENSITIVE);
        return this;
    }

    public zoijcleaow gtknphoqwx(gm.nufgyqmvbu nufgyqmvbuVar, em.dxjokdxxww dxjokdxxwwVar) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
        fm.ppxfxbqfkf.dxjokdxxww(dxjokdxxwwVar, "textStyle");
        wkgbmnqykc(new vdvldrhtss(nufgyqmvbuVar, dxjokdxxwwVar, em.wkgbmnqykc.zoijcleaow()));
        return this;
    }

    public zoijcleaow gxszxtbevo(String str) {
        fm.ppxfxbqfkf.dxjokdxxww(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                wkgbmnqykc(new eablkybsjg(str.charAt(0)));
            } else {
                wkgbmnqykc(new rgvfuqvkyq(str));
            }
        }
        return this;
    }

    public zoijcleaow iobyxmoadg(em.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "formatter");
        wkgbmnqykc(iobyxmoadgVar.nufgyqmvbu(false));
        return this;
    }

    public em.iobyxmoadg iozdgvuglv(Locale locale) {
        fm.ppxfxbqfkf.dxjokdxxww(locale, CommonUrlParts.LOCALE);
        while (this.f31497iobyxmoadg.f31501zoijcleaow != null) {
            yggfygwlhe();
        }
        return new em.iobyxmoadg(new gxszxtbevo(this.f31499ppxfxbqfkf, false), locale, em.eablkybsjg.f31438eablkybsjg, em.gxszxtbevo.SMART, null, null, null);
    }

    public zoijcleaow iwizpuwonk(int i13) {
        return cqumvgiudr(i13, ' ');
    }

    public zoijcleaow jyumaefscl() {
        zoijcleaow zoijcleaowVar = this.f31497iobyxmoadg;
        zoijcleaowVar.f31498lqeggnwhkg = -1;
        this.f31497iobyxmoadg = new zoijcleaow(zoijcleaowVar, true);
        return this;
    }

    public zoijcleaow kcexrzcfyt() {
        wkgbmnqykc(new kcexrzcfyt(f31494nufgyqmvbu, "ZoneRegionId()"));
        return this;
    }

    public zoijcleaow lereixgezr() {
        wkgbmnqykc(ojitshcjhn.SENSITIVE);
        return this;
    }

    public zoijcleaow lqeggnwhkg(em.dxjokdxxww dxjokdxxwwVar) {
        fm.ppxfxbqfkf.dxjokdxxww(dxjokdxxwwVar, "style");
        if (dxjokdxxwwVar != em.dxjokdxxww.FULL && dxjokdxxwwVar != em.dxjokdxxww.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        wkgbmnqykc(new btonecajqb(dxjokdxxwwVar));
        return this;
    }

    public zoijcleaow nufgyqmvbu(String str, String str2) {
        wkgbmnqykc(new draadjrbmk(str2, str));
        return this;
    }

    public zoijcleaow ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar, int i13) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
        if (i13 >= 1 && i13 <= 19) {
            wflxmlrfwp(new gtknphoqwx(nufgyqmvbuVar, i13, i13, em.lqeggnwhkg.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i13);
    }

    public zoijcleaow oxmwwwfdhm() {
        wkgbmnqykc(new kcexrzcfyt(gm.dxjokdxxww.lqeggnwhkg(), "ZoneId()"));
        return this;
    }

    public zoijcleaow ppxfxbqfkf() {
        wkgbmnqykc(new dxjokdxxww(-2));
        return this;
    }

    public zoijcleaow rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, em.lqeggnwhkg lqeggnwhkgVar) {
        if (i13 == i14 && lqeggnwhkgVar == em.lqeggnwhkg.NOT_NEGATIVE) {
            return ojitshcjhn(nufgyqmvbuVar, i14);
        }
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
        fm.ppxfxbqfkf.dxjokdxxww(lqeggnwhkgVar, "signStyle");
        if (i13 < 1 || i13 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i13);
        }
        if (i14 < 1 || i14 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i14);
        }
        if (i14 >= i13) {
            wflxmlrfwp(new gtknphoqwx(nufgyqmvbuVar, i13, i14, lqeggnwhkgVar));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i14 + " < " + i13);
    }

    public zoijcleaow vdvldrhtss(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, dm.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "field");
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "baseDate");
        wflxmlrfwp(new agtfadlqog(nufgyqmvbuVar, i13, i14, 0, iobyxmoadgVar));
        return this;
    }

    em.iobyxmoadg yadqdtsiqt(em.gxszxtbevo gxszxtbevoVar) {
        return cdpycssgdh().btonecajqb(gxszxtbevoVar);
    }

    public zoijcleaow yggfygwlhe() {
        zoijcleaow zoijcleaowVar = this.f31497iobyxmoadg;
        if (zoijcleaowVar.f31501zoijcleaow == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (zoijcleaowVar.f31499ppxfxbqfkf.size() > 0) {
            zoijcleaow zoijcleaowVar2 = this.f31497iobyxmoadg;
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo(zoijcleaowVar2.f31499ppxfxbqfkf, zoijcleaowVar2.f31500wkgbmnqykc);
            this.f31497iobyxmoadg = this.f31497iobyxmoadg.f31501zoijcleaow;
            wkgbmnqykc(gxszxtbevoVar);
        } else {
            this.f31497iobyxmoadg = this.f31497iobyxmoadg.f31501zoijcleaow;
        }
        return this;
    }

    public zoijcleaow zdlpuopuiu(em.dxjokdxxww dxjokdxxwwVar) {
        wkgbmnqykc(new zdlpuopuiu(dxjokdxxwwVar));
        return this;
    }

    public zoijcleaow zoijcleaow(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, boolean z13) {
        wkgbmnqykc(new nufgyqmvbu(nufgyqmvbuVar, i13, i14, z13));
        return this;
    }

    public zoijcleaow zynmafqrjb() {
        wkgbmnqykc(ojitshcjhn.LENIENT);
        return this;
    }

    private zoijcleaow(zoijcleaow zoijcleaowVar, boolean z13) {
        this.f31497iobyxmoadg = this;
        this.f31499ppxfxbqfkf = new ArrayList();
        this.f31498lqeggnwhkg = -1;
        this.f31501zoijcleaow = zoijcleaowVar;
        this.f31500wkgbmnqykc = z13;
    }

    static final class agtfadlqog extends gtknphoqwx {

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        static final cm.eablkybsjg f31502zynmafqrjb = cm.eablkybsjg.wypolnanlu(2000, 1, 1);

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final int f31503lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final dm.iobyxmoadg f31504pmvmpeiblj;

        agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, int i15, dm.iobyxmoadg iobyxmoadgVar) {
            super(nufgyqmvbuVar, i13, i14, em.lqeggnwhkg.NOT_NEGATIVE);
            if (i13 < 1 || i13 > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i13);
            }
            if (i14 < 1 || i14 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i14);
            }
            if (i14 < i13) {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
            if (iobyxmoadgVar == null) {
                long j13 = i15;
                if (!nufgyqmvbuVar.dxjokdxxww().agtfadlqog(j13)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j13 + ((long) gtknphoqwx.f31513esjtqupxsv[i13]) > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.f31503lereixgezr = i15;
            this.f31504pmvmpeiblj = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // em.zoijcleaow.gtknphoqwx
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public agtfadlqog wkgbmnqykc(int i13) {
            return new agtfadlqog(this.f31518zdlpuopuiu, this.f31517yggfygwlhe, this.f31516jyumaefscl, this.f31503lereixgezr, this.f31504pmvmpeiblj, this.f31514cqumvgiudr + i13);
        }

        @Override // em.zoijcleaow.gtknphoqwx
        gtknphoqwx ppxfxbqfkf() {
            return this.f31514cqumvgiudr == -1 ? this : new agtfadlqog(this.f31518zdlpuopuiu, this.f31517yggfygwlhe, this.f31516jyumaefscl, this.f31503lereixgezr, this.f31504pmvmpeiblj, -1);
        }

        @Override // em.zoijcleaow.gtknphoqwx
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ReducedValue(");
            sb3.append(this.f31518zdlpuopuiu);
            sb3.append(StringUtils.COMMA);
            sb3.append(this.f31517yggfygwlhe);
            sb3.append(StringUtils.COMMA);
            sb3.append(this.f31516jyumaefscl);
            sb3.append(StringUtils.COMMA);
            Object objValueOf = this.f31504pmvmpeiblj;
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(this.f31503lereixgezr);
            }
            sb3.append(objValueOf);
            sb3.append(")");
            return sb3.toString();
        }

        @Override // em.zoijcleaow.gtknphoqwx
        long zoijcleaow(em.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
            long jAbs = Math.abs(j13);
            int iOjitshcjhn = this.f31503lereixgezr;
            if (this.f31504pmvmpeiblj != null) {
                iOjitshcjhn = dm.eablkybsjg.lqeggnwhkg(ppxfxbqfkfVar.eablkybsjg()).wkgbmnqykc(this.f31504pmvmpeiblj).ojitshcjhn(this.f31518zdlpuopuiu);
            }
            if (j13 >= iOjitshcjhn) {
                int i13 = gtknphoqwx.f31513esjtqupxsv[this.f31517yggfygwlhe];
                if (j13 < iOjitshcjhn + i13) {
                    return jAbs % ((long) i13);
                }
            }
            return jAbs % ((long) gtknphoqwx.f31513esjtqupxsv[this.f31516jyumaefscl]);
        }

        private agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar, int i13, int i14, int i15, dm.iobyxmoadg iobyxmoadgVar, int i16) {
            super(nufgyqmvbuVar, i13, i14, em.lqeggnwhkg.NOT_NEGATIVE, i16, null);
            this.f31503lereixgezr = i15;
            this.f31504pmvmpeiblj = iobyxmoadgVar;
        }
    }
}

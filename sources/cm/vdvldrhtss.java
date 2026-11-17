package cm;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss extends rgvfuqvkyq implements gm.eablkybsjg, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final transient String f20157iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f20158jyumaefscl;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gm.btonecajqb f20151cqumvgiudr = new iobyxmoadg();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final ConcurrentMap f20152esjtqupxsv = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final ConcurrentMap f20154lereixgezr = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final vdvldrhtss f20155pmvmpeiblj = pkzmftpjix(0);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final vdvldrhtss f20156zynmafqrjb = pkzmftpjix(-64800);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final vdvldrhtss f20153istkbnxepw = pkzmftpjix(64800);

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public vdvldrhtss iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return vdvldrhtss.yadqdtsiqt(eablkybsjgVar);
        }
    }

    private vdvldrhtss(int i13) {
        this.f20158jyumaefscl = i13;
        this.f20157iwizpuwonk = istkbnxepw(i13);
    }

    private static void cllcsxoeiz(int i13, int i14, int i15) {
        if (i13 < -18 || i13 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i13 + " is not in the range -18 to 18");
        }
        if (i13 > 0) {
            if (i14 < 0 || i15 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i13 < 0) {
            if (i14 > 0 || i15 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i14 > 0 && i15 < 0) || (i14 < 0 && i15 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i14) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i14) + " is not in the range 0 to 59");
        }
        if (Math.abs(i15) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i15) + " is not in the range 0 to 59");
        }
        if (Math.abs(i13) == 18) {
            if (Math.abs(i14) > 0 || Math.abs(i15) > 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private static int hcddaimhww(CharSequence charSequence, int i13, boolean z13) {
        if (z13 && charSequence.charAt(i13 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i13);
        char cCharAt2 = charSequence.charAt(i13 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return ((cCharAt - '0') * 10) + (cCharAt2 - '0');
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    private static int hkdspvbjdz(int i13, int i14, int i15) {
        return (i13 * 3600) + (i14 * 60) + i15;
    }

    private static String istkbnxepw(int i13) {
        if (i13 == 0) {
            return "Z";
        }
        int iAbs = Math.abs(i13);
        StringBuilder sb3 = new StringBuilder();
        int i14 = iAbs / 3600;
        int i15 = (iAbs / 60) % 60;
        sb3.append(i13 < 0 ? "-" : "+");
        sb3.append(i14 < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb3.append(i14);
        String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
        sb3.append(i15 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb3.append(i15);
        int i16 = iAbs % 60;
        if (i16 != 0) {
            if (i16 < 10) {
                str = ":0";
            }
            sb3.append(str);
            sb3.append(i16);
        }
        return sb3.toString();
    }

    static vdvldrhtss jpowsppfya(DataInput dataInput) throws IOException {
        byte b13 = dataInput.readByte();
        return b13 == 127 ? pkzmftpjix(dataInput.readInt()) : pkzmftpjix(b13 * 900);
    }

    public static vdvldrhtss pkzmftpjix(int i13) {
        if (Math.abs(i13) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i13 % 900 != 0) {
            return new vdvldrhtss(i13);
        }
        Integer numValueOf = Integer.valueOf(i13);
        ConcurrentMap concurrentMap = f20152esjtqupxsv;
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) concurrentMap.get(numValueOf);
        if (vdvldrhtssVar != null) {
            return vdvldrhtssVar;
        }
        concurrentMap.putIfAbsent(numValueOf, new vdvldrhtss(i13));
        vdvldrhtss vdvldrhtssVar2 = (vdvldrhtss) concurrentMap.get(numValueOf);
        f20154lereixgezr.putIfAbsent(vdvldrhtssVar2.kcexrzcfyt(), vdvldrhtssVar2);
        return vdvldrhtssVar2;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 8, this);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    public static vdvldrhtss wwaezpbzkn(String str) {
        int iHcddaimhww;
        int iHcddaimhww2;
        int iHcddaimhww3;
        char cCharAt;
        fm.ppxfxbqfkf.dxjokdxxww(str, "offsetId");
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) f20154lereixgezr.get(str);
        if (vdvldrhtssVar != null) {
            return vdvldrhtssVar;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iHcddaimhww = hcddaimhww(str, 1, false);
                    iHcddaimhww2 = hcddaimhww(str, 3, false);
                } else if (length == 6) {
                    iHcddaimhww = hcddaimhww(str, 1, false);
                    iHcddaimhww2 = hcddaimhww(str, 4, true);
                } else if (length == 7) {
                    iHcddaimhww = hcddaimhww(str, 1, false);
                    iHcddaimhww2 = hcddaimhww(str, 3, false);
                    iHcddaimhww3 = hcddaimhww(str, 5, false);
                } else {
                    if (length != 9) {
                        throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: " + str);
                    }
                    iHcddaimhww = hcddaimhww(str, 1, false);
                    iHcddaimhww2 = hcddaimhww(str, 4, true);
                    iHcddaimhww3 = hcddaimhww(str, 7, true);
                }
                iHcddaimhww3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? ylkuphrtab(-iHcddaimhww, -iHcddaimhww2, -iHcddaimhww3) : ylkuphrtab(iHcddaimhww, iHcddaimhww2, iHcddaimhww3);
            }
            throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: " + str);
        }
        str = str.charAt(0) + CommonUrlParts.Values.FALSE_INTEGER + str.charAt(1);
        iHcddaimhww = hcddaimhww(str, 1, false);
        iHcddaimhww2 = 0;
        iHcddaimhww3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static vdvldrhtss yadqdtsiqt(gm.eablkybsjg eablkybsjgVar) {
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) eablkybsjgVar.btonecajqb(gm.dxjokdxxww.wkgbmnqykc());
        if (vdvldrhtssVar != null) {
            return vdvldrhtssVar;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
    }

    public static vdvldrhtss ylkuphrtab(int i13, int i14, int i15) {
        cllcsxoeiz(i13, i14, i15);
        return pkzmftpjix(hkdspvbjdz(i13, i14, i15));
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw) {
            return this.f20158jyumaefscl;
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        throw new DateTimeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo()) {
            return this;
        }
        if (btonecajqbVar == gm.dxjokdxxww.zoijcleaow() || btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf() || btonecajqbVar == gm.dxjokdxxww.eablkybsjg() || btonecajqbVar == gm.dxjokdxxww.iobyxmoadg() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg()) {
            return null;
        }
        return btonecajqbVar.iobyxmoadg(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public int compareTo(vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar.f20158jyumaefscl - this.f20158jyumaefscl;
    }

    void dsvhmnatus(DataOutput dataOutput) {
        int i13 = this.f20158jyumaefscl;
        int i14 = i13 % 900 == 0 ? i13 / 900 : 127;
        dataOutput.writeByte(i14);
        if (i14 == 127) {
            dataOutput.writeInt(i13);
        }
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37838vipkmwdibw, this.f20158jyumaefscl);
    }

    @Override // cm.rgvfuqvkyq
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdvldrhtss) && this.f20158jyumaefscl == ((vdvldrhtss) obj).f20158jyumaefscl;
    }

    @Override // cm.rgvfuqvkyq
    public int hashCode() {
        return this.f20158jyumaefscl;
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // cm.rgvfuqvkyq
    public String kcexrzcfyt() {
        return this.f20157iwizpuwonk;
    }

    public int lmojexxdyd() {
        return this.f20158jyumaefscl;
    }

    @Override // gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw) {
            return nufgyqmvbuVar.dxjokdxxww();
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.lqeggnwhkg(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw) {
            return this.f20158jyumaefscl;
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // cm.rgvfuqvkyq
    public String toString() {
        return this.f20157iwizpuwonk;
    }

    @Override // cm.rgvfuqvkyq
    public hm.gxszxtbevo zdlpuopuiu() {
        return hm.gxszxtbevo.draadjrbmk(this);
    }

    @Override // cm.rgvfuqvkyq
    void zynmafqrjb(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        dsvhmnatus(dataOutput);
    }
}

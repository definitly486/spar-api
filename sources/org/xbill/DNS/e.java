package org.xbill.DNS;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Cloneable, Comparable, Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final am.iobyxmoadg f74318cqumvgiudr = am.zoijcleaow.dxjokdxxww(e.class);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final DecimalFormat f74319esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected long f74320iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected int f74321jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected int f74322yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected auzgnhcxok f74323zdlpuopuiu;

    private static class iobyxmoadg implements Serializable {
        private static final long serialVersionUID = 1434159920070152561L;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f74324yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final byte[] f74325zdlpuopuiu;

        iobyxmoadg(e eVar) {
            boolean z13 = eVar instanceof iozdgvuglv;
            this.f74324yggfygwlhe = z13;
            this.f74325zdlpuopuiu = eVar.wypolnanlu(!z13 ? 1 : 0);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                return e.vdvldrhtss(this.f74325zdlpuopuiu, !this.f74324yggfygwlhe ? 1 : 0);
            } catch (IOException e13) {
                throw new InvalidObjectException(e13.getMessage());
            }
        }
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        f74319esjtqupxsv = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    protected e() {
    }

    public static e cdpycssgdh(auzgnhcxok auzgnhcxokVar, int i13, int i14, long j13) {
        if (!auzgnhcxokVar.zdlpuopuiu()) {
            throw new RelativeNameException(auzgnhcxokVar);
        }
        x2.iobyxmoadg(i13);
        rgvfuqvkyq.iobyxmoadg(i14);
        k0.iobyxmoadg(j13);
        return jyumaefscl(auzgnhcxokVar, i13, i14, j13, false);
    }

    static int draadjrbmk(String str, int i13) {
        if (i13 >= 0 && i13 <= 255) {
            return i13;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + i13 + " must be an unsigned 8 bit value");
    }

    protected static String iobyxmoadg(byte[] bArr, boolean z13) {
        StringBuilder sb3 = new StringBuilder();
        if (z13) {
            sb3.append('\"');
        }
        for (byte b13 : bArr) {
            int i13 = b13 & 255;
            if (i13 < 32 || i13 >= 127) {
                sb3.append('\\');
                sb3.append(f74319esjtqupxsv.format(i13));
            } else if (i13 == 34 || i13 == 92) {
                sb3.append('\\');
                sb3.append((char) i13);
            } else {
                sb3.append((char) i13);
            }
        }
        if (z13) {
            sb3.append('\"');
        }
        return sb3.toString();
    }

    public static e istkbnxepw(auzgnhcxok auzgnhcxokVar, int i13, int i14) {
        return cdpycssgdh(auzgnhcxokVar, i13, i14, 0L);
    }

    private static e jyumaefscl(auzgnhcxok auzgnhcxokVar, int i13, int i14, long j13, boolean z13) {
        e iozdgvuglvVar;
        if (z13) {
            Supplier supplierZoijcleaow = x2.zoijcleaow(i13);
            iozdgvuglvVar = supplierZoijcleaow != null ? (e) supplierZoijcleaow.get() : new a3();
        } else {
            iozdgvuglvVar = new iozdgvuglv();
        }
        iozdgvuglvVar.f74323zdlpuopuiu = auzgnhcxokVar;
        iozdgvuglvVar.f74322yggfygwlhe = i13;
        iozdgvuglvVar.f74321jyumaefscl = i14;
        iozdgvuglvVar.f74320iwizpuwonk = j13;
        return iozdgvuglvVar;
    }

    static int lqeggnwhkg(String str, int i13) {
        if (i13 >= 0 && i13 <= 65535) {
            return i13;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + i13 + " must be an unsigned 16 bit value");
    }

    private byte[] mbcevpiqjq(boolean z13) {
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        stevsuqkhv(jyumaefsclVar, z13);
        return jyumaefsclVar.eablkybsjg();
    }

    protected static String ntlheqmsrt(byte[] bArr) {
        return "\\# " + bArr.length + " " + km.iobyxmoadg.iobyxmoadg(bArr);
    }

    static long nufgyqmvbu(String str, long j13) {
        if (j13 >= 0 && j13 <= 4294967295L) {
            return j13;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + j13 + " must be an unsigned 32 bit value");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use RecordSerializationProxy");
    }

    static e rgvfuqvkyq(zdlpuopuiu zdlpuopuiuVar, int i13, boolean z13) throws WireParseException {
        auzgnhcxok auzgnhcxokVar = new auzgnhcxok(zdlpuopuiuVar);
        int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
        int iNufgyqmvbu2 = zdlpuopuiuVar.nufgyqmvbu();
        if (i13 == 0) {
            return istkbnxepw(auzgnhcxokVar, iNufgyqmvbu, iNufgyqmvbu2);
        }
        long jDxjokdxxww = zdlpuopuiuVar.dxjokdxxww();
        int iNufgyqmvbu3 = zdlpuopuiuVar.nufgyqmvbu();
        return (iNufgyqmvbu3 == 0 && z13 && (i13 == 1 || i13 == 2)) ? cdpycssgdh(auzgnhcxokVar, iNufgyqmvbu, iNufgyqmvbu2, jDxjokdxxww) : yadqdtsiqt(auzgnhcxokVar, iNufgyqmvbu, iNufgyqmvbu2, jDxjokdxxww, iNufgyqmvbu3, zdlpuopuiuVar);
    }

    private void stevsuqkhv(jyumaefscl jyumaefsclVar, boolean z13) {
        this.f74323zdlpuopuiu.wwaezpbzkn(jyumaefsclVar);
        jyumaefsclVar.dxjokdxxww(this.f74322yggfygwlhe);
        jyumaefsclVar.dxjokdxxww(this.f74321jyumaefscl);
        if (z13) {
            jyumaefsclVar.gtknphoqwx(0L);
        } else {
            jyumaefsclVar.gtknphoqwx(this.f74320iwizpuwonk);
        }
        int iZoijcleaow = jyumaefsclVar.zoijcleaow();
        jyumaefsclVar.dxjokdxxww(0);
        jpowsppfya(jyumaefsclVar, null, true);
        jyumaefsclVar.btonecajqb((jyumaefsclVar.zoijcleaow() - iZoijcleaow) - 2, iZoijcleaow);
    }

    public static e vdvldrhtss(byte[] bArr, int i13) {
        return rgvfuqvkyq(new zdlpuopuiu(bArr), i13, false);
    }

    static auzgnhcxok wkgbmnqykc(String str, auzgnhcxok auzgnhcxokVar) {
        if (auzgnhcxokVar.zdlpuopuiu()) {
            return auzgnhcxokVar;
        }
        throw new RelativeNameException("'" + auzgnhcxokVar + "' on field " + str + " is not an absolute name");
    }

    private static e yadqdtsiqt(auzgnhcxok auzgnhcxokVar, int i13, int i14, long j13, int i15, zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        e eVarJyumaefscl = jyumaefscl(auzgnhcxokVar, i13, i14, j13, zdlpuopuiuVar != null);
        if (zdlpuopuiuVar != null) {
            if (zdlpuopuiuVar.gtknphoqwx() < i15) {
                throw new WireParseException("truncated record");
            }
            zdlpuopuiuVar.vdvldrhtss(i15);
            eVarJyumaefscl.pkzmftpjix(zdlpuopuiuVar);
            if (zdlpuopuiuVar.gtknphoqwx() > 0) {
                throw new WireParseException("invalid record length");
            }
            zdlpuopuiuVar.iobyxmoadg();
        }
        return eVarJyumaefscl;
    }

    e agtfadlqog() {
        try {
            return (e) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    void cllcsxoeiz(long j13) {
        this.f74320iwizpuwonk = j13;
    }

    public auzgnhcxok cqumvgiudr() {
        return this.f74323zdlpuopuiu;
    }

    void dsvhmnatus(jyumaefscl jyumaefsclVar, int i13, agtfadlqog agtfadlqogVar) {
        this.f74323zdlpuopuiu.yadqdtsiqt(jyumaefsclVar, agtfadlqogVar);
        jyumaefsclVar.dxjokdxxww(this.f74322yggfygwlhe);
        jyumaefsclVar.dxjokdxxww(this.f74321jyumaefscl);
        if (i13 == 0) {
            return;
        }
        jyumaefsclVar.gtknphoqwx(this.f74320iwizpuwonk);
        int iZoijcleaow = jyumaefsclVar.zoijcleaow();
        jyumaefsclVar.dxjokdxxww(0);
        jpowsppfya(jyumaefsclVar, agtfadlqogVar, false);
        jyumaefsclVar.btonecajqb((jyumaefsclVar.zoijcleaow() - iZoijcleaow) - 2, iZoijcleaow);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f74322yggfygwlhe == eVar.f74322yggfygwlhe && this.f74321jyumaefscl == eVar.f74321jyumaefscl && this.f74323zdlpuopuiu.equals(eVar.f74323zdlpuopuiu)) {
            return Arrays.equals(ylkuphrtab(), eVar.ylkuphrtab());
        }
        return false;
    }

    public int hashCode() {
        int i13 = 0;
        for (byte b13 : mbcevpiqjq(true)) {
            i13 += (i13 << 3) + (b13 & 255);
        }
        return i13;
    }

    protected abstract String hcddaimhww();

    public boolean hkdspvbjdz(e eVar) {
        return lereixgezr() == eVar.lereixgezr() && this.f74321jyumaefscl == eVar.f74321jyumaefscl && this.f74323zdlpuopuiu.equals(eVar.f74323zdlpuopuiu);
    }

    protected abstract void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13);

    public auzgnhcxok kcexrzcfyt() {
        return null;
    }

    public int lereixgezr() {
        return this.f74322yggfygwlhe;
    }

    public String lmojexxdyd() {
        return hcddaimhww();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        if (this == eVar) {
            return 0;
        }
        int iCompareTo = this.f74323zdlpuopuiu.compareTo(eVar.f74323zdlpuopuiu);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i13 = this.f74321jyumaefscl - eVar.f74321jyumaefscl;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f74322yggfygwlhe - eVar.f74322yggfygwlhe;
        if (i14 != 0) {
            return i14;
        }
        byte[] bArrYlkuphrtab = ylkuphrtab();
        byte[] bArrYlkuphrtab2 = eVar.ylkuphrtab();
        int iMin = Math.min(bArrYlkuphrtab.length, bArrYlkuphrtab2.length);
        for (int i15 = 0; i15 < iMin; i15++) {
            byte b13 = bArrYlkuphrtab[i15];
            byte b14 = bArrYlkuphrtab2[i15];
            if (b13 != b14) {
                return (b13 & 255) - (b14 & 255);
            }
        }
        return bArrYlkuphrtab.length - bArrYlkuphrtab2.length;
    }

    protected abstract void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar);

    public long pmvmpeiblj() {
        return this.f74320iwizpuwonk;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74323zdlpuopuiu);
        if (sb3.length() < 8) {
            sb3.append("\t");
        }
        if (sb3.length() < 16) {
            sb3.append("\t");
        }
        sb3.append("\t");
        if (rhgxfdycjh.iobyxmoadg("BINDTTL")) {
            sb3.append(k0.zoijcleaow(this.f74320iwizpuwonk));
        } else {
            sb3.append(this.f74320iwizpuwonk);
        }
        sb3.append("\t");
        if (this.f74321jyumaefscl != 1 || !rhgxfdycjh.iobyxmoadg("noPrintIN")) {
            sb3.append(rgvfuqvkyq.zoijcleaow(this.f74321jyumaefscl));
            sb3.append("\t");
        }
        sb3.append(x2.wkgbmnqykc(this.f74322yggfygwlhe));
        String strHcddaimhww = hcddaimhww();
        if (!strHcddaimhww.equals("")) {
            sb3.append("\t");
            sb3.append(strHcddaimhww);
        }
        return sb3.toString();
    }

    public byte[] tzroggbefp() {
        return mbcevpiqjq(false);
    }

    Object writeReplace() {
        f74318cqumvgiudr.lereixgezr("Creating proxy object for serialization");
        return new iobyxmoadg(this);
    }

    public byte[] wypolnanlu(int i13) {
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        dsvhmnatus(jyumaefsclVar, i13, null);
        return jyumaefsclVar.eablkybsjg();
    }

    public byte[] ylkuphrtab() {
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        jpowsppfya(jyumaefsclVar, null, true);
        return jyumaefsclVar.eablkybsjg();
    }

    public int zdlpuopuiu() {
        return this.f74321jyumaefscl;
    }

    public int zynmafqrjb() {
        return this.f74322yggfygwlhe;
    }

    protected e(auzgnhcxok auzgnhcxokVar, int i13, int i14, long j13) {
        if (!auzgnhcxokVar.zdlpuopuiu()) {
            throw new RelativeNameException(auzgnhcxokVar);
        }
        x2.iobyxmoadg(i13);
        rgvfuqvkyq.iobyxmoadg(i14);
        k0.iobyxmoadg(j13);
        this.f74323zdlpuopuiu = auzgnhcxokVar;
        this.f74322yggfygwlhe = i13;
        this.f74321jyumaefscl = i14;
        this.f74320iwizpuwonk = j13;
    }
}

package org.xbill.DNS;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public class auzgnhcxok implements Comparable, Serializable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final auzgnhcxok f74228cdpycssgdh;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final auzgnhcxok f74233pmvmpeiblj;
    private static final long serialVersionUID = -6036624806201621219L;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final auzgnhcxok f74234zynmafqrjb;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f74235iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private transient int f74236jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f74237yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private byte[] f74238zdlpuopuiu;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final am.iobyxmoadg f74229cqumvgiudr = am.zoijcleaow.dxjokdxxww(auzgnhcxok.class);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final byte[] f74230esjtqupxsv = {0};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final byte[] f74232lereixgezr = {1, 42};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final byte[] f74231istkbnxepw = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    static {
        int i13 = 0;
        while (true) {
            byte[] bArr = f74231istkbnxepw;
            if (i13 >= bArr.length) {
                auzgnhcxok auzgnhcxokVar = new auzgnhcxok();
                f74233pmvmpeiblj = auzgnhcxokVar;
                auzgnhcxokVar.f74238zdlpuopuiu = f74230esjtqupxsv;
                auzgnhcxokVar.f74235iwizpuwonk = 1;
                auzgnhcxok auzgnhcxokVar2 = new auzgnhcxok();
                f74234zynmafqrjb = auzgnhcxokVar2;
                auzgnhcxokVar2.f74238zdlpuopuiu = new byte[0];
                auzgnhcxok auzgnhcxokVar3 = new auzgnhcxok();
                f74228cdpycssgdh = auzgnhcxokVar3;
                auzgnhcxokVar3.f74238zdlpuopuiu = f74232lereixgezr;
                auzgnhcxokVar3.f74235iwizpuwonk = 1;
                return;
            }
            if (i13 < 65 || i13 > 90) {
                bArr[i13] = (byte) i13;
            } else {
                bArr[i13] = (byte) (i13 + 32);
            }
            i13++;
        }
    }

    private auzgnhcxok() {
    }

    private static void agtfadlqog(auzgnhcxok auzgnhcxokVar, auzgnhcxok auzgnhcxokVar2) {
        auzgnhcxokVar2.f74238zdlpuopuiu = auzgnhcxokVar.f74238zdlpuopuiu;
        auzgnhcxokVar2.f74237yggfygwlhe = auzgnhcxokVar.f74237yggfygwlhe;
        auzgnhcxokVar2.f74235iwizpuwonk = auzgnhcxokVar.f74235iwizpuwonk;
    }

    public static auzgnhcxok draadjrbmk(auzgnhcxok auzgnhcxokVar, auzgnhcxok auzgnhcxokVar2) throws NameTooLongException {
        if (auzgnhcxokVar.zdlpuopuiu()) {
            return auzgnhcxokVar;
        }
        auzgnhcxok auzgnhcxokVar3 = new auzgnhcxok();
        auzgnhcxokVar3.iobyxmoadg(auzgnhcxokVar.f74238zdlpuopuiu, 0, auzgnhcxokVar.f74235iwizpuwonk);
        auzgnhcxokVar3.iobyxmoadg(auzgnhcxokVar2.f74238zdlpuopuiu, 0, auzgnhcxokVar2.f74235iwizpuwonk);
        return auzgnhcxokVar3;
    }

    private String dxjokdxxww(byte[] bArr, int i13) {
        StringBuilder sb3 = new StringBuilder();
        int i14 = i13 + 1;
        int i15 = bArr[i13];
        for (int i16 = i14; i16 < i14 + i15; i16++) {
            int i17 = bArr[i16] & 255;
            if (i17 <= 32 || i17 >= 127) {
                sb3.append('\\');
                if (i17 < 10) {
                    sb3.append("00");
                } else if (i17 < 100) {
                    sb3.append('0');
                }
                sb3.append(i17);
            } else if (i17 == 34 || i17 == 40 || i17 == 41 || i17 == 46 || i17 == 59 || i17 == 92 || i17 == 64 || i17 == 36) {
                sb3.append('\\');
                sb3.append((char) i17);
            } else {
                sb3.append((char) i17);
            }
        }
        return sb3.toString();
    }

    private void iobyxmoadg(byte[] bArr, int i13, int i14) throws NameTooLongException {
        byte[] bArr2 = this.f74238zdlpuopuiu;
        int length = bArr2 == null ? 0 : bArr2.length;
        int i15 = i13;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = bArr[i15] + 1;
            i15 += i18;
            i16 += i18;
        }
        int i19 = length + i16;
        if (i19 > 255) {
            throw new NameTooLongException();
        }
        byte[] bArr3 = this.f74238zdlpuopuiu;
        byte[] bArrCopyOf = bArr3 != null ? Arrays.copyOf(bArr3, i19) : new byte[i19];
        System.arraycopy(bArr, i13, bArrCopyOf, length, i16);
        this.f74238zdlpuopuiu = bArrCopyOf;
        for (int i23 = 0; i23 < i14 && i23 < 9; i23++) {
            zynmafqrjb(this.f74235iwizpuwonk + i23, length);
            length += bArrCopyOf[length] + 1;
        }
        this.f74235iwizpuwonk += i14;
    }

    public static auzgnhcxok kcexrzcfyt(String str, auzgnhcxok auzgnhcxokVar) {
        if (str.equals("@")) {
            return auzgnhcxokVar != null ? auzgnhcxokVar : f74234zynmafqrjb;
        }
        return str.equals(".") ? f74233pmvmpeiblj : new auzgnhcxok(str, auzgnhcxokVar);
    }

    private int lereixgezr(int i13) {
        if (i13 == 0) {
            return 0;
        }
        if (i13 < 1 || i13 >= this.f74235iwizpuwonk) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i13 < 9) {
            return ((int) (this.f74237yggfygwlhe >>> ((i13 - 1) * 8))) & KotlinVersion.MAX_COMPONENT_VALUE;
        }
        int i14 = ((int) (this.f74237yggfygwlhe >>> 56)) & KotlinVersion.MAX_COMPONENT_VALUE;
        for (int i15 = 8; i15 < i13; i15++) {
            i14 += this.f74238zdlpuopuiu[i14] + 1;
        }
        return i14;
    }

    private void lqeggnwhkg(String str, byte[] bArr, int i13) throws TextParseException {
        try {
            iobyxmoadg(bArr, 0, i13);
        } catch (NameTooLongException unused) {
            throw new TextParseException(str, "Name too long");
        }
    }

    private void nufgyqmvbu(String str, char[] cArr, int i13) throws TextParseException {
        try {
            wkgbmnqykc(cArr, i13);
        } catch (NameTooLongException e13) {
            throw new TextParseException(str, "Name too long", e13);
        }
    }

    private boolean ojitshcjhn(byte[] bArr, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < this.f74235iwizpuwonk; i15++) {
            byte b13 = this.f74238zdlpuopuiu[i14];
            if (b13 != bArr[i13]) {
                return false;
            }
            i14++;
            i13++;
            int i16 = 0;
            while (i16 < b13) {
                byte[] bArr2 = f74231istkbnxepw;
                int i17 = i14 + 1;
                int i18 = i13 + 1;
                if (bArr2[this.f74238zdlpuopuiu[i14] & 255] != bArr2[bArr[i13] & 255]) {
                    return false;
                }
                i16++;
                i13 = i18;
                i14 = i17;
            }
        }
        return true;
    }

    private int pmvmpeiblj(int i13) throws NameTooLongException {
        byte[] bArr = this.f74238zdlpuopuiu;
        int length = bArr == null ? 0 : bArr.length;
        int i14 = length + 1;
        int i15 = i14 + i13;
        if (i15 > 255) {
            throw new NameTooLongException();
        }
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, i15) : new byte[i15];
        bArrCopyOf[length] = (byte) i13;
        this.f74238zdlpuopuiu = bArrCopyOf;
        zynmafqrjb(this.f74235iwizpuwonk, length);
        this.f74235iwizpuwonk++;
        return i14;
    }

    public static auzgnhcxok vdvldrhtss(String str) {
        return kcexrzcfyt(str, null);
    }

    private void wkgbmnqykc(char[] cArr, int i13) throws NameTooLongException {
        int iPmvmpeiblj = pmvmpeiblj(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            this.f74238zdlpuopuiu[iPmvmpeiblj + i14] = (byte) cArr[i14];
        }
    }

    private void zynmafqrjb(int i13, int i14) {
        if (i13 == 0 || i13 >= 9) {
            return;
        }
        int i15 = (i13 - 1) * 8;
        this.f74237yggfygwlhe = (((long) i14) << i15) | (this.f74237yggfygwlhe & (~(255 << i15)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public int compareTo(auzgnhcxok auzgnhcxokVar) {
        if (this == auzgnhcxokVar) {
            return 0;
        }
        int i13 = auzgnhcxokVar.f74235iwizpuwonk;
        int iMin = Math.min(this.f74235iwizpuwonk, i13);
        for (int i14 = 1; i14 <= iMin; i14++) {
            int iLereixgezr = lereixgezr(this.f74235iwizpuwonk - i14);
            int iLereixgezr2 = auzgnhcxokVar.lereixgezr(i13 - i14);
            byte b13 = this.f74238zdlpuopuiu[iLereixgezr];
            byte b14 = auzgnhcxokVar.f74238zdlpuopuiu[iLereixgezr2];
            for (int i15 = 0; i15 < b13 && i15 < b14; i15++) {
                byte[] bArr = f74231istkbnxepw;
                int i16 = (bArr[this.f74238zdlpuopuiu[(i15 + iLereixgezr) + 1] & 255] & 255) - (bArr[auzgnhcxokVar.f74238zdlpuopuiu[(i15 + iLereixgezr2) + 1] & 255] & 255);
                if (i16 != 0) {
                    return i16;
                }
            }
            if (b13 != b14) {
                return b13 - b14;
            }
        }
        return this.f74235iwizpuwonk - i13;
    }

    public String cdpycssgdh(boolean z13) {
        int i13 = this.f74235iwizpuwonk;
        if (i13 == 0) {
            return "@";
        }
        if (i13 == 1 && this.f74238zdlpuopuiu[0] == 0) {
            return ".";
        }
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i15 < this.f74235iwizpuwonk; i15++) {
            byte b13 = this.f74238zdlpuopuiu[i14];
            if (b13 == 0) {
                if (!z13) {
                    sb3.append('.');
                    break;
                }
                break;
            }
            if (i15 > 0) {
                sb3.append('.');
            }
            sb3.append(dxjokdxxww(this.f74238zdlpuopuiu, i14));
            i14 += b13 + 1;
        }
        return sb3.toString();
    }

    public short cqumvgiudr() {
        if (this.f74235iwizpuwonk == 0) {
            return (short) 0;
        }
        return (short) this.f74238zdlpuopuiu.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auzgnhcxok)) {
            return false;
        }
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) obj;
        if (auzgnhcxokVar.f74235iwizpuwonk == this.f74235iwizpuwonk && auzgnhcxokVar.hashCode() == hashCode()) {
            return ojitshcjhn(auzgnhcxokVar.f74238zdlpuopuiu, 0);
        }
        return false;
    }

    public int hashCode() {
        int i13 = this.f74236jyumaefscl;
        if (i13 != 0) {
            return i13;
        }
        int i14 = 0;
        int iLereixgezr = lereixgezr(0);
        while (true) {
            byte[] bArr = this.f74238zdlpuopuiu;
            if (iLereixgezr >= bArr.length) {
                this.f74236jyumaefscl = i14;
                return i14;
            }
            i14 += (i14 << 3) + (f74231istkbnxepw[bArr[iLereixgezr] & 255] & 255);
            iLereixgezr++;
        }
    }

    public boolean istkbnxepw(auzgnhcxok auzgnhcxokVar) {
        int i13 = auzgnhcxokVar.f74235iwizpuwonk;
        int i14 = this.f74235iwizpuwonk;
        if (i13 > i14) {
            return false;
        }
        return i13 == i14 ? equals(auzgnhcxokVar) : auzgnhcxokVar.ojitshcjhn(this.f74238zdlpuopuiu, lereixgezr(i14 - i13));
    }

    public int jyumaefscl() {
        return this.f74235iwizpuwonk;
    }

    public void lmojexxdyd(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        if (z13) {
            wwaezpbzkn(jyumaefsclVar);
        } else {
            yadqdtsiqt(jyumaefsclVar, agtfadlqogVar);
        }
    }

    public auzgnhcxok rgvfuqvkyq(kcexrzcfyt kcexrzcfytVar) throws NameTooLongException {
        auzgnhcxok auzgnhcxokVarCqumvgiudr = kcexrzcfytVar.cqumvgiudr();
        auzgnhcxok auzgnhcxokVarSopmlzcsov = kcexrzcfytVar.sopmlzcsov();
        if (!istkbnxepw(auzgnhcxokVarCqumvgiudr)) {
            return null;
        }
        int i13 = this.f74235iwizpuwonk - auzgnhcxokVarCqumvgiudr.f74235iwizpuwonk;
        int iCqumvgiudr = cqumvgiudr() - auzgnhcxokVarCqumvgiudr.cqumvgiudr();
        int i14 = auzgnhcxokVarSopmlzcsov.f74235iwizpuwonk;
        short sCqumvgiudr = auzgnhcxokVarSopmlzcsov.cqumvgiudr();
        int i15 = iCqumvgiudr + sCqumvgiudr;
        if (i15 > 255) {
            throw new NameTooLongException();
        }
        auzgnhcxok auzgnhcxokVar = new auzgnhcxok();
        int i16 = i13 + i14;
        auzgnhcxokVar.f74235iwizpuwonk = i16;
        byte[] bArrCopyOf = Arrays.copyOf(this.f74238zdlpuopuiu, i15);
        auzgnhcxokVar.f74238zdlpuopuiu = bArrCopyOf;
        System.arraycopy(auzgnhcxokVarSopmlzcsov.f74238zdlpuopuiu, 0, bArrCopyOf, iCqumvgiudr, sCqumvgiudr);
        int i17 = 0;
        for (int i18 = 0; i18 < 9 && i18 < i16; i18++) {
            auzgnhcxokVar.zynmafqrjb(i18, i17);
            i17 += auzgnhcxokVar.f74238zdlpuopuiu[i17] + 1;
        }
        return auzgnhcxokVar;
    }

    public String toString() {
        return cdpycssgdh(false);
    }

    public void wwaezpbzkn(jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.gxszxtbevo(ylkuphrtab());
    }

    public void yadqdtsiqt(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar) {
        if (!zdlpuopuiu()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int i13 = 0;
        while (i13 < this.f74235iwizpuwonk - 1) {
            auzgnhcxok auzgnhcxokVar = i13 == 0 ? this : new auzgnhcxok(this, i13);
            int iZoijcleaow = agtfadlqogVar != null ? agtfadlqogVar.zoijcleaow(auzgnhcxokVar) : -1;
            if (iZoijcleaow >= 0) {
                jyumaefsclVar.dxjokdxxww(49152 | iZoijcleaow);
                return;
            }
            if (agtfadlqogVar != null) {
                agtfadlqogVar.iobyxmoadg(jyumaefsclVar.zoijcleaow(), auzgnhcxokVar);
            }
            int iLereixgezr = lereixgezr(i13);
            byte[] bArr = this.f74238zdlpuopuiu;
            jyumaefsclVar.lqeggnwhkg(bArr, iLereixgezr, bArr[iLereixgezr] + 1);
            i13++;
        }
        jyumaefsclVar.draadjrbmk(0);
    }

    public byte[] ylkuphrtab() {
        if (this.f74235iwizpuwonk == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[this.f74238zdlpuopuiu.length];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < this.f74235iwizpuwonk; i15++) {
            byte b13 = this.f74238zdlpuopuiu[i13];
            i13++;
            bArr[i14] = b13;
            i14++;
            int i16 = 0;
            while (i16 < b13) {
                bArr[i14] = f74231istkbnxepw[this.f74238zdlpuopuiu[i13] & 255];
                i16++;
                i14++;
                i13++;
            }
        }
        return bArr;
    }

    public boolean zdlpuopuiu() {
        int i13 = this.f74235iwizpuwonk;
        return i13 != 0 && this.f74238zdlpuopuiu[lereixgezr(i13 - 1)] == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    /* JADX WARN: Code duplicated, block: B:99:0x0093 A[SYNTHETIC] */
    public auzgnhcxok(String str, auzgnhcxok auzgnhcxokVar) throws TextParseException {
        boolean zZdlpuopuiu;
        char c13;
        char c14 = '0';
        str.hashCode();
        switch (str) {
            case "":
                throw new TextParseException("empty name");
            case ".":
                agtfadlqog(f74233pmvmpeiblj, this);
                return;
            case "@":
                if (auzgnhcxokVar == null) {
                    agtfadlqog(f74234zynmafqrjb, this);
                    return;
                } else {
                    agtfadlqog(auzgnhcxokVar, this);
                    return;
                }
            default:
                char[] cArr = new char[63];
                int i13 = 0;
                boolean z13 = false;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < str.length(); i17++) {
                    char cCharAt = str.charAt(i17);
                    if (cCharAt > 255) {
                        throw new TextParseException(str, "Illegal character in name");
                    }
                    if (z13) {
                        if (cCharAt < c14) {
                            if (i13 > 0 && i13 < 3) {
                                throw new TextParseException(str, "bad escape");
                            }
                            if (i15 >= 63) {
                                throw new TextParseException(str, "label too long");
                            }
                            cArr[i15] = cCharAt;
                            i14 = i15;
                            z13 = false;
                            i15++;
                        } else if (cCharAt > '9' || i13 >= 3) {
                            c14 = '0';
                            if (i13 > 0) {
                                throw new TextParseException(str, "bad escape");
                            }
                            if (i15 >= 63) {
                                throw new TextParseException(str, "label too long");
                            }
                            cArr[i15] = cCharAt;
                            i14 = i15;
                            z13 = false;
                            i15++;
                        } else {
                            i13++;
                            c14 = '0';
                            i16 = (i16 * 10) + (cCharAt - '0');
                            if (i16 > 255) {
                                throw new TextParseException(str, "bad escape");
                            }
                            if (i13 >= 3) {
                                cCharAt = (char) i16;
                                if (i15 >= 63) {
                                    throw new TextParseException(str, "label too long");
                                }
                                cArr[i15] = cCharAt;
                                i14 = i15;
                                z13 = false;
                                i15++;
                            }
                        }
                        c13 = '?';
                    } else if (cCharAt == '\\') {
                        z13 = true;
                        c13 = '?';
                        i13 = 0;
                        i16 = 0;
                    } else if (cCharAt != '.') {
                        i14 = i14 == -1 ? i17 : i14;
                        c13 = '?';
                        if (i15 >= 63) {
                            throw new TextParseException(str, "label too long");
                        }
                        cArr[i15] = cCharAt;
                        i15++;
                    } else {
                        if (i14 == -1) {
                            throw new TextParseException(str, "invalid empty label");
                        }
                        nufgyqmvbu(str, cArr, i15);
                        i14 = -1;
                        c13 = '?';
                        i15 = 0;
                    }
                }
                if ((i13 > 0 && i13 < 3) || z13) {
                    throw new TextParseException(str, "bad escape");
                }
                if (i14 == -1) {
                    lqeggnwhkg(str, f74230esjtqupxsv, 1);
                    zZdlpuopuiu = true;
                } else {
                    nufgyqmvbu(str, cArr, i15);
                    zZdlpuopuiu = false;
                }
                if (auzgnhcxokVar != null && !zZdlpuopuiu) {
                    zZdlpuopuiu = auzgnhcxokVar.zdlpuopuiu();
                    lqeggnwhkg(str, auzgnhcxokVar.f74238zdlpuopuiu, auzgnhcxokVar.f74235iwizpuwonk);
                }
                if (!zZdlpuopuiu && cqumvgiudr() == 255) {
                    throw new TextParseException(str, "Name too long");
                }
                return;
        }
    }

    public auzgnhcxok(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        byte[] bArr = new byte[64];
        boolean z13 = false;
        boolean z14 = false;
        while (!z13) {
            int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
            int i13 = iBtonecajqb & 192;
            if (i13 != 0) {
                if (i13 == 192) {
                    int iBtonecajqb2 = zdlpuopuiuVar.btonecajqb() + ((iBtonecajqb & (-193)) << 8);
                    am.iobyxmoadg iobyxmoadgVar = f74229cqumvgiudr;
                    iobyxmoadgVar.dxjokdxxww("currently {}, pointer to {}", Integer.valueOf(zdlpuopuiuVar.zoijcleaow()), Integer.valueOf(iBtonecajqb2));
                    if (iBtonecajqb2 < zdlpuopuiuVar.zoijcleaow() - 2) {
                        if (!z14) {
                            zdlpuopuiuVar.ojitshcjhn();
                            z14 = true;
                        }
                        zdlpuopuiuVar.ppxfxbqfkf(iBtonecajqb2);
                        iobyxmoadgVar.dxjokdxxww("current name '{}', seeking to {}", this, Integer.valueOf(iBtonecajqb2));
                    } else {
                        throw new WireParseException("bad compression");
                    }
                } else {
                    throw new WireParseException("bad label type");
                }
            } else if (iBtonecajqb == 0) {
                iobyxmoadg(f74230esjtqupxsv, 0, 1);
                z13 = true;
            } else {
                bArr[0] = (byte) iBtonecajqb;
                zdlpuopuiuVar.wkgbmnqykc(bArr, 1, iBtonecajqb);
                iobyxmoadg(bArr, 0, 1);
            }
        }
        if (z14) {
            zdlpuopuiuVar.wflxmlrfwp();
        }
    }

    public auzgnhcxok(auzgnhcxok auzgnhcxokVar, int i13) {
        int i14 = auzgnhcxokVar.f74235iwizpuwonk;
        if (i13 > i14) {
            throw new IllegalArgumentException("attempted to remove too many labels");
        }
        if (i13 == i14) {
            agtfadlqog(f74234zynmafqrjb, this);
            return;
        }
        this.f74235iwizpuwonk = i14 - i13;
        this.f74238zdlpuopuiu = Arrays.copyOfRange(auzgnhcxokVar.f74238zdlpuopuiu, auzgnhcxokVar.lereixgezr(i13), auzgnhcxokVar.f74238zdlpuopuiu.length);
        int iLereixgezr = auzgnhcxokVar.lereixgezr(i13);
        for (int i15 = 1; i15 < 9 && i15 < this.f74235iwizpuwonk; i15++) {
            zynmafqrjb(i15, auzgnhcxokVar.lereixgezr(i15 + i13) - iLereixgezr);
        }
    }
}

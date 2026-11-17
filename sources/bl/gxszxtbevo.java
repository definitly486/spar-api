package bl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo implements Serializable, Comparable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private transient String f16675jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private transient int f16676yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final byte[] f16677zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f16674iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gxszxtbevo f16673cqumvgiudr = new gxszxtbevo(new byte[0]);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ gxszxtbevo gxszxtbevo(iobyxmoadg iobyxmoadgVar, byte[] bArr, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = 0;
            }
            if ((i15 & 2) != 0) {
                i14 = cllcsxoeiz.ppxfxbqfkf();
            }
            return iobyxmoadgVar.eablkybsjg(bArr, i13, i14);
        }

        public final gxszxtbevo eablkybsjg(byte[] bArr, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
            int iEablkybsjg = cllcsxoeiz.eablkybsjg(bArr, i14);
            cllcsxoeiz.zoijcleaow(bArr.length, i13, iEablkybsjg);
            return new gxszxtbevo(hg.agtfadlqog.zdlpuopuiu(bArr, i13, iEablkybsjg + i13));
        }

        public final gxszxtbevo iobyxmoadg(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            byte[] bArrIobyxmoadg = jpowsppfya.iobyxmoadg(str);
            if (bArrIobyxmoadg != null) {
                return new gxszxtbevo(bArrIobyxmoadg);
            }
            return null;
        }

        public final gxszxtbevo lqeggnwhkg(InputStream inputStream, int i13) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inputStream, "<this>");
            if (i13 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i13).toString());
            }
            byte[] bArr = new byte[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = inputStream.read(bArr, i14, i13 - i14);
                if (i15 == -1) {
                    throw new EOFException();
                }
                i14 += i15;
            }
            return new gxszxtbevo(bArr);
        }

        public final gxszxtbevo ppxfxbqfkf(String str, Charset charset) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
            return new gxszxtbevo(bytes);
        }

        public final gxszxtbevo wkgbmnqykc(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo(hkdspvbjdz.iobyxmoadg(str));
            gxszxtbevoVar.ylkuphrtab(str);
            return gxszxtbevoVar;
        }

        public final gxszxtbevo zoijcleaow(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = i13 * 2;
                bArr[i13] = (byte) ((cl.lqeggnwhkg.eablkybsjg(str.charAt(i14)) << 4) + cl.lqeggnwhkg.eablkybsjg(str.charAt(i14 + 1)));
            }
            return new gxszxtbevo(bArr);
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(byte[] data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f16677zdlpuopuiu = data;
    }

    public static /* synthetic */ int cdpycssgdh(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i14 & 2) != 0) {
            i13 = cllcsxoeiz.ppxfxbqfkf();
        }
        return gxszxtbevoVar.zynmafqrjb(gxszxtbevoVar2, i13);
    }

    public static /* synthetic */ gxszxtbevo cllcsxoeiz(gxszxtbevo gxszxtbevoVar, int i13, int i14, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = cllcsxoeiz.ppxfxbqfkf();
        }
        return gxszxtbevoVar.hkdspvbjdz(i13, i14);
    }

    public static /* synthetic */ int cqumvgiudr(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return gxszxtbevoVar.zdlpuopuiu(gxszxtbevoVar2, i13);
    }

    public static final gxszxtbevo dxjokdxxww(String str) {
        return f16674iwizpuwonk.wkgbmnqykc(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        gxszxtbevo gxszxtbevoVarLqeggnwhkg = f16674iwizpuwonk.lqeggnwhkg(objectInputStream, objectInputStream.readInt());
        Field declaredField = gxszxtbevo.class.getDeclaredField("zdlpuopuiu");
        declaredField.setAccessible(true);
        declaredField.set(this, gxszxtbevoVarLqeggnwhkg.f16677zdlpuopuiu);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f16677zdlpuopuiu.length);
        objectOutputStream.write(this.f16677zdlpuopuiu);
    }

    public final byte[] agtfadlqog() {
        return this.f16677zdlpuopuiu;
    }

    public final boolean btonecajqb(gxszxtbevo suffix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
        return yadqdtsiqt(hcddaimhww() - suffix.hcddaimhww(), suffix, 0, suffix.hcddaimhww());
    }

    public final byte draadjrbmk(int i13) {
        return pmvmpeiblj(i13);
    }

    public gxszxtbevo dsvhmnatus() {
        for (int i13 = 0; i13 < agtfadlqog().length; i13++) {
            byte b13 = agtfadlqog()[i13];
            if (b13 >= 65 && b13 <= 90) {
                byte[] bArrAgtfadlqog = agtfadlqog();
                byte[] bArrCopyOf = Arrays.copyOf(bArrAgtfadlqog, bArrAgtfadlqog.length);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i13] = (byte) (b13 + 32);
                for (int i14 = i13 + 1; i14 < bArrCopyOf.length; i14++) {
                    byte b14 = bArrCopyOf[i14];
                    if (b14 >= 65 && b14 <= 90) {
                        bArrCopyOf[i14] = (byte) (b14 + 32);
                    }
                }
                return new gxszxtbevo(bArrCopyOf);
            }
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxszxtbevo) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            if (gxszxtbevoVar.hcddaimhww() == agtfadlqog().length && gxszxtbevoVar.lmojexxdyd(0, agtfadlqog(), 0, agtfadlqog().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iOjitshcjhn = ojitshcjhn();
        if (iOjitshcjhn != 0) {
            return iOjitshcjhn;
        }
        int iHashCode = Arrays.hashCode(agtfadlqog());
        wwaezpbzkn(iHashCode);
        return iHashCode;
    }

    public final int hcddaimhww() {
        return rgvfuqvkyq();
    }

    public gxszxtbevo hkdspvbjdz(int i13, int i14) {
        int iWkgbmnqykc = cllcsxoeiz.wkgbmnqykc(this, i14);
        if (i13 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iWkgbmnqykc <= agtfadlqog().length) {
            if (iWkgbmnqykc - i13 >= 0) {
                return (i13 == 0 && iWkgbmnqykc == agtfadlqog().length) ? this : new gxszxtbevo(hg.agtfadlqog.zdlpuopuiu(agtfadlqog(), i13, iWkgbmnqykc));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + agtfadlqog().length + ')').toString());
    }

    public ByteBuffer iobyxmoadg() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f16677zdlpuopuiu).asReadOnlyBuffer();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(byteBufferAsReadOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    public int istkbnxepw(byte[] other, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        for (int iMin = Math.min(cllcsxoeiz.wkgbmnqykc(this, i13), agtfadlqog().length - other.length); -1 < iMin; iMin--) {
            if (cllcsxoeiz.iobyxmoadg(agtfadlqog(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final boolean jpowsppfya(gxszxtbevo prefix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        return yadqdtsiqt(0, prefix, 0, prefix.hcddaimhww());
    }

    public int jyumaefscl(byte[] other, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        int length = agtfadlqog().length - other.length;
        int iMax = Math.max(i13, 0);
        if (iMax <= length) {
            while (!cllcsxoeiz.iobyxmoadg(agtfadlqog(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public String kcexrzcfyt() {
        char[] cArr = new char[agtfadlqog().length * 2];
        int i13 = 0;
        for (byte b13 : agtfadlqog()) {
            int i14 = i13 + 1;
            cArr[i13] = cl.lqeggnwhkg.gxszxtbevo()[(b13 >> 4) & 15];
            i13 += 2;
            cArr[i14] = cl.lqeggnwhkg.gxszxtbevo()[b13 & 15];
        }
        return mj.kcexrzcfyt.yggfygwlhe(cArr);
    }

    public byte[] lereixgezr() {
        return agtfadlqog();
    }

    public boolean lmojexxdyd(int i13, byte[] other, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return i13 >= 0 && i13 <= agtfadlqog().length - i15 && i14 >= 0 && i14 <= other.length - i15 && cllcsxoeiz.iobyxmoadg(agtfadlqog(), i13, other, i14, i15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(bl.gxszxtbevo r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r10, r0)
            int r0 = r9.hcddaimhww()
            int r1 = r10.hcddaimhww()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.draadjrbmk(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.draadjrbmk(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.gxszxtbevo.compareTo(bl.gxszxtbevo):int");
    }

    public gxszxtbevo nufgyqmvbu(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f16677zdlpuopuiu, 0, hcddaimhww());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(digestBytes, "digestBytes");
        return new gxszxtbevo(digestBytes);
    }

    public final int ojitshcjhn() {
        return this.f16676yggfygwlhe;
    }

    public final gxszxtbevo pkzmftpjix() {
        return nufgyqmvbu("SHA-256");
    }

    public byte pmvmpeiblj(int i13) {
        return agtfadlqog()[i13];
    }

    public int rgvfuqvkyq() {
        return agtfadlqog().length;
    }

    public void stevsuqkhv(ppxfxbqfkf buffer, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        cl.lqeggnwhkg.wkgbmnqykc(this, buffer, i13, i14);
    }

    public String toString() {
        String str;
        if (agtfadlqog().length == 0) {
            str = "[size=0]";
        } else {
            int iPpxfxbqfkf = cl.lqeggnwhkg.ppxfxbqfkf(agtfadlqog(), 64);
            if (iPpxfxbqfkf != -1) {
                String strWypolnanlu = wypolnanlu();
                String strSubstring = strWypolnanlu.substring(0, iPpxfxbqfkf);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strHcddaimhww = mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(mj.kcexrzcfyt.hcddaimhww(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iPpxfxbqfkf >= strWypolnanlu.length()) {
                    return "[text=" + strHcddaimhww + ']';
                }
                return "[size=" + agtfadlqog().length + " text=" + strHcddaimhww + "…]";
            }
            if (agtfadlqog().length > 64) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[size=");
                sb3.append(agtfadlqog().length);
                sb3.append(" hex=");
                int iWkgbmnqykc = cllcsxoeiz.wkgbmnqykc(this, 64);
                if (iWkgbmnqykc <= agtfadlqog().length) {
                    if (iWkgbmnqykc < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb3.append((iWkgbmnqykc == agtfadlqog().length ? this : new gxszxtbevo(hg.agtfadlqog.zdlpuopuiu(agtfadlqog(), 0, iWkgbmnqykc))).kcexrzcfyt());
                    sb3.append("…]");
                    return sb3.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + agtfadlqog().length + ')').toString());
            }
            str = "[hex=" + kcexrzcfyt() + ']';
        }
        return str;
    }

    public final String vdvldrhtss() {
        return this.f16675jyumaefscl;
    }

    public String wkgbmnqykc() {
        return jpowsppfya.ppxfxbqfkf(agtfadlqog(), null, 1, null);
    }

    public final void wwaezpbzkn(int i13) {
        this.f16676yggfygwlhe = i13;
    }

    public String wypolnanlu() {
        String strVdvldrhtss = vdvldrhtss();
        if (strVdvldrhtss != null) {
            return strVdvldrhtss;
        }
        String strPpxfxbqfkf = hkdspvbjdz.ppxfxbqfkf(lereixgezr());
        ylkuphrtab(strPpxfxbqfkf);
        return strPpxfxbqfkf;
    }

    public boolean yadqdtsiqt(int i13, gxszxtbevo other, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return other.lmojexxdyd(i14, agtfadlqog(), i13, i15);
    }

    public final void ylkuphrtab(String str) {
        this.f16675jyumaefscl = str;
    }

    public final int zdlpuopuiu(gxszxtbevo other, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return jyumaefscl(other.lereixgezr(), i13);
    }

    public final int zynmafqrjb(gxszxtbevo other, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return istkbnxepw(other.lereixgezr(), i13);
    }
}

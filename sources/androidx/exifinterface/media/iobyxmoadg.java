package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    static final byte[] f8914bfopjjpdmp;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    static final wkgbmnqykc[][] f8919czzsidtyhn;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private static final wkgbmnqykc[] f8924ikoacuggdj;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private static final Pattern f8928iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private static final wkgbmnqykc[] f8929jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private static final wkgbmnqykc[] f8930jlmebxxoox;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private static final wkgbmnqykc[] f8933jztzpxfvev;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private static final Pattern f8937lrnfpwlwnk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private static SimpleDateFormat f8938mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private static final wkgbmnqykc[] f8939metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private static SimpleDateFormat f8940ntlheqmsrt;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    static final Charset f8941oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private static final wkgbmnqykc f8942okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private static final byte[] f8943opjhrmiecq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private static final wkgbmnqykc[] f8946ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private static final wkgbmnqykc[] f8947rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private static final HashSet f8948sflfametgt;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private static final wkgbmnqykc[] f8953uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private static final wkgbmnqykc[] f8954vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private static final Pattern f8955weqkydbzbr;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private static final wkgbmnqykc[] f8958xrmfcynszj;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final HashMap[] f8960ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private static final HashMap[] f8961yfnezrywwk;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private static final Pattern f8964zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private static final HashMap f8965zfvoamnweg;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private byte[] f8967agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f8968btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f8969draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f8970dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f8971eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f8972gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final HashMap[] f8973gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f8974iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f8975kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Set f8976lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ByteOrder f8977nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f8978ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f8979oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private AssetManager.AssetInputStream f8980ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f8981rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f8982vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f8983wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f8984wkgbmnqykc;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f8985zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private FileDescriptor f8986zoijcleaow;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final boolean f8962yggfygwlhe = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final List f8932jyumaefscl = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final List f8927iwizpuwonk = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int[] f8917cqumvgiudr = {8, 8, 8};

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int[] f8921esjtqupxsv = {4};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int[] f8935lereixgezr = {8};

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final byte[] f8945pmvmpeiblj = {-1, -40, -1};

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final byte[] f8966zynmafqrjb = {102, 116, 121, 112};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final byte[] f8926istkbnxepw = {109, 105, 102, 49};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final byte[] f8915cdpycssgdh = {104, 101, 105, 99};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final byte[] f8959yadqdtsiqt = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final byte[] f8925iozdgvuglv = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final byte[] f8936lmojexxdyd = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final byte[] f8956wwaezpbzkn = {101, 88, 73, 102};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private static final byte[] f8963ylkuphrtab = {73, 72, 68, 82};

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private static final byte[] f8944pkzmftpjix = {73, 69, 78, 68};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final byte[] f8922hcddaimhww = {82, 73, 70, 70};

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private static final byte[] f8931jpowsppfya = {87, 69, 66, 80};

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private static final byte[] f8923hkdspvbjdz = {69, 88, 73, 70};

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private static final byte[] f8916cllcsxoeiz = {-99, 1, 42};

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private static final byte[] f8920dsvhmnatus = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private static final byte[] f8957wypolnanlu = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private static final byte[] f8950stevsuqkhv = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final byte[] f8934kegysxyocb = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final byte[] f8951tzroggbefp = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    static final String[] f8952ulzqkzuiru = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    static final int[] f8949sopmlzcsov = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    static final byte[] f8918crxdokpmqz = {65, 83, 67, 73, 73, 0, 0, 0};

    private static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f8987iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f8988zoijcleaow;

        eablkybsjg(double d13) {
            this((long) (d13 * 10000.0d), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        }

        public double iobyxmoadg() {
            return this.f8987iobyxmoadg / this.f8988zoijcleaow;
        }

        public String toString() {
            return this.f8987iobyxmoadg + CardDateFormatTextWatcher.DIVIDER_CHARACTER + this.f8988zoijcleaow;
        }

        eablkybsjg(long j13, long j14) {
            if (j14 == 0) {
                this.f8987iobyxmoadg = 0L;
                this.f8988zoijcleaow = 1L;
            } else {
                this.f8987iobyxmoadg = j13;
                this.f8988zoijcleaow = j14;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0141iobyxmoadg extends MediaDataSource {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f8990yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f8991zdlpuopuiu;

        C0141iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            this.f8990yggfygwlhe = gxszxtbevoVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j13, byte[] bArr, int i13, int i14) {
            if (i14 == 0) {
                return 0;
            }
            if (j13 < 0) {
                return -1;
            }
            try {
                long j14 = this.f8991zdlpuopuiu;
                if (j14 != j13) {
                    if (j14 >= 0 && j13 >= j14 + ((long) this.f8990yggfygwlhe.available())) {
                        return -1;
                    }
                    this.f8990yggfygwlhe.dxjokdxxww(j13);
                    this.f8991zdlpuopuiu = j13;
                }
                if (i14 > this.f8990yggfygwlhe.available()) {
                    i14 = this.f8990yggfygwlhe.available();
                }
                int i15 = this.f8990yggfygwlhe.read(bArr, i13, i14);
                if (i15 >= 0) {
                    this.f8991zdlpuopuiu += (long) i15;
                    return i15;
                }
            } catch (IOException unused) {
            }
            this.f8991zdlpuopuiu = -1L;
            return -1;
        }
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f8992iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f8993ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final byte[] f8994wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f8995zoijcleaow;

        ppxfxbqfkf(int i13, int i14, byte[] bArr) {
            this(i13, i14, -1L, bArr);
        }

        public static ppxfxbqfkf btonecajqb(int i13, ByteOrder byteOrder) {
            return gtknphoqwx(new int[]{i13}, byteOrder);
        }

        public static ppxfxbqfkf dxjokdxxww(eablkybsjg[] eablkybsjgVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iobyxmoadg.f8949sopmlzcsov[5] * eablkybsjgVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (eablkybsjg eablkybsjgVar : eablkybsjgVarArr) {
                byteBufferWrap.putInt((int) eablkybsjgVar.f8987iobyxmoadg);
                byteBufferWrap.putInt((int) eablkybsjgVar.f8988zoijcleaow);
            }
            return new ppxfxbqfkf(5, eablkybsjgVarArr.length, byteBufferWrap.array());
        }

        public static ppxfxbqfkf eablkybsjg(String str) {
            byte[] bytes = (str + (char) 0).getBytes(iobyxmoadg.f8941oipsdeybqn);
            return new ppxfxbqfkf(2, bytes.length, bytes);
        }

        public static ppxfxbqfkf gtknphoqwx(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iobyxmoadg.f8949sopmlzcsov[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i13 : iArr) {
                byteBufferWrap.putShort((short) i13);
            }
            return new ppxfxbqfkf(3, iArr.length, byteBufferWrap.array());
        }

        public static ppxfxbqfkf gxszxtbevo(long j13, ByteOrder byteOrder) {
            return lqeggnwhkg(new long[]{j13}, byteOrder);
        }

        public static ppxfxbqfkf iobyxmoadg(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new ppxfxbqfkf(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(iobyxmoadg.f8941oipsdeybqn);
            return new ppxfxbqfkf(1, bytes.length, bytes);
        }

        public static ppxfxbqfkf lqeggnwhkg(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iobyxmoadg.f8949sopmlzcsov[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j13 : jArr) {
                byteBufferWrap.putInt((int) j13);
            }
            return new ppxfxbqfkf(4, jArr.length, byteBufferWrap.array());
        }

        public static ppxfxbqfkf nufgyqmvbu(eablkybsjg eablkybsjgVar, ByteOrder byteOrder) {
            return dxjokdxxww(new eablkybsjg[]{eablkybsjgVar}, byteOrder);
        }

        public static ppxfxbqfkf ppxfxbqfkf(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iobyxmoadg.f8949sopmlzcsov[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i13 : iArr) {
                byteBufferWrap.putInt(i13);
            }
            return new ppxfxbqfkf(9, iArr.length, byteBufferWrap.array());
        }

        public static ppxfxbqfkf wkgbmnqykc(eablkybsjg[] eablkybsjgVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iobyxmoadg.f8949sopmlzcsov[10] * eablkybsjgVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (eablkybsjg eablkybsjgVar : eablkybsjgVarArr) {
                byteBufferWrap.putInt((int) eablkybsjgVar.f8987iobyxmoadg);
                byteBufferWrap.putInt((int) eablkybsjgVar.f8988zoijcleaow);
            }
            return new ppxfxbqfkf(10, eablkybsjgVarArr.length, byteBufferWrap.array());
        }

        public static ppxfxbqfkf zoijcleaow(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iobyxmoadg.f8949sopmlzcsov[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d13 : dArr) {
                byteBufferWrap.putDouble(d13);
            }
            return new ppxfxbqfkf(12, dArr.length, byteBufferWrap.array());
        }

        public String agtfadlqog(ByteOrder byteOrder) throws Throwable {
            Object objOjitshcjhn = ojitshcjhn(byteOrder);
            if (objOjitshcjhn == null) {
                return null;
            }
            if (objOjitshcjhn instanceof String) {
                return (String) objOjitshcjhn;
            }
            StringBuilder sb3 = new StringBuilder();
            int i13 = 0;
            if (objOjitshcjhn instanceof long[]) {
                long[] jArr = (long[]) objOjitshcjhn;
                while (i13 < jArr.length) {
                    sb3.append(jArr[i13]);
                    i13++;
                    if (i13 != jArr.length) {
                        sb3.append(StringUtils.COMMA);
                    }
                }
                return sb3.toString();
            }
            if (objOjitshcjhn instanceof int[]) {
                int[] iArr = (int[]) objOjitshcjhn;
                while (i13 < iArr.length) {
                    sb3.append(iArr[i13]);
                    i13++;
                    if (i13 != iArr.length) {
                        sb3.append(StringUtils.COMMA);
                    }
                }
                return sb3.toString();
            }
            if (objOjitshcjhn instanceof double[]) {
                double[] dArr = (double[]) objOjitshcjhn;
                while (i13 < dArr.length) {
                    sb3.append(dArr[i13]);
                    i13++;
                    if (i13 != dArr.length) {
                        sb3.append(StringUtils.COMMA);
                    }
                }
                return sb3.toString();
            }
            if (!(objOjitshcjhn instanceof eablkybsjg[])) {
                return null;
            }
            eablkybsjg[] eablkybsjgVarArr = (eablkybsjg[]) objOjitshcjhn;
            while (i13 < eablkybsjgVarArr.length) {
                sb3.append(eablkybsjgVarArr[i13].f8987iobyxmoadg);
                sb3.append('/');
                sb3.append(eablkybsjgVarArr[i13].f8988zoijcleaow);
                i13++;
                if (i13 != eablkybsjgVarArr.length) {
                    sb3.append(StringUtils.COMMA);
                }
            }
            return sb3.toString();
        }

        public double draadjrbmk(ByteOrder byteOrder) throws Throwable {
            Object objOjitshcjhn = ojitshcjhn(byteOrder);
            if (objOjitshcjhn == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objOjitshcjhn instanceof String) {
                return Double.parseDouble((String) objOjitshcjhn);
            }
            if (objOjitshcjhn instanceof long[]) {
                long[] jArr = (long[]) objOjitshcjhn;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objOjitshcjhn instanceof int[]) {
                int[] iArr = (int[]) objOjitshcjhn;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objOjitshcjhn instanceof double[]) {
                double[] dArr = (double[]) objOjitshcjhn;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objOjitshcjhn instanceof eablkybsjg[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            eablkybsjg[] eablkybsjgVarArr = (eablkybsjg[]) objOjitshcjhn;
            if (eablkybsjgVarArr.length == 1) {
                return eablkybsjgVarArr[0].iobyxmoadg();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX WARN: Code duplicated, block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
        Object ojitshcjhn(ByteOrder byteOrder) throws Throwable {
            zoijcleaow zoijcleaowVar;
            InputStream inputStream;
            byte b13;
            byte b14;
            int length = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    zoijcleaowVar = new zoijcleaow(this.f8994wkgbmnqykc);
                    try {
                        zoijcleaowVar.lqeggnwhkg(byteOrder);
                        switch (this.f8992iobyxmoadg) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f8994wkgbmnqykc;
                                if (bArr.length != 1 || (b13 = bArr[0]) < 0 || b13 > 1) {
                                    String str = new String(bArr, iobyxmoadg.f8941oipsdeybqn);
                                    try {
                                        zoijcleaowVar.close();
                                        break;
                                    } catch (IOException e13) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b13 + 48)});
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f8995zoijcleaow >= iobyxmoadg.f8918crxdokpmqz.length) {
                                    int i13 = 0;
                                    while (true) {
                                        byte[] bArr2 = iobyxmoadg.f8918crxdokpmqz;
                                        if (i13 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (this.f8994wkgbmnqykc[i13] == bArr2[i13]) {
                                            i13++;
                                        }
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder();
                                while (length < this.f8995zoijcleaow && (b14 = this.f8994wkgbmnqykc[length]) != 0) {
                                    if (b14 >= 32) {
                                        sb3.append((char) b14);
                                    } else {
                                        sb3.append('?');
                                    }
                                    length++;
                                }
                                String string = sb3.toString();
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    iArr[length] = zoijcleaowVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    jArr[length] = zoijcleaowVar.wkgbmnqykc();
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                }
                                return jArr;
                            case 5:
                                eablkybsjg[] eablkybsjgVarArr = new eablkybsjg[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    eablkybsjgVarArr[length] = new eablkybsjg(zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.wkgbmnqykc());
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                }
                                return eablkybsjgVarArr;
                            case 8:
                                int[] iArr2 = new int[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    iArr2[length] = zoijcleaowVar.readShort();
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    iArr3[length] = zoijcleaowVar.readInt();
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e23) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                                }
                                return iArr3;
                            case 10:
                                eablkybsjg[] eablkybsjgVarArr2 = new eablkybsjg[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    eablkybsjgVarArr2[length] = new eablkybsjg(zoijcleaowVar.readInt(), zoijcleaowVar.readInt());
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e24) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e24);
                                }
                                return eablkybsjgVarArr2;
                            case 11:
                                double[] dArr = new double[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    dArr[length] = zoijcleaowVar.readFloat();
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e25) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e25);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f8995zoijcleaow];
                                while (length < this.f8995zoijcleaow) {
                                    dArr2[length] = zoijcleaowVar.readDouble();
                                    length++;
                                }
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e26) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e26);
                                }
                                return dArr2;
                            default:
                                try {
                                    zoijcleaowVar.close();
                                    break;
                                } catch (IOException e27) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e27);
                                }
                                return null;
                        }
                    } catch (IOException e28) {
                        e = e28;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (zoijcleaowVar != null) {
                            try {
                                zoijcleaowVar.close();
                            } catch (IOException e29) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e29);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e33) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e33);
                        }
                    }
                    throw th;
                }
            } catch (IOException e34) {
                e = e34;
                zoijcleaowVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public String toString() {
            return "(" + iobyxmoadg.f8952ulzqkzuiru[this.f8992iobyxmoadg] + ", data length:" + this.f8994wkgbmnqykc.length + ")";
        }

        public int wflxmlrfwp(ByteOrder byteOrder) throws Throwable {
            Object objOjitshcjhn = ojitshcjhn(byteOrder);
            if (objOjitshcjhn == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objOjitshcjhn instanceof String) {
                return Integer.parseInt((String) objOjitshcjhn);
            }
            if (objOjitshcjhn instanceof long[]) {
                long[] jArr = (long[]) objOjitshcjhn;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objOjitshcjhn instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objOjitshcjhn;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        ppxfxbqfkf(int i13, int i14, long j13, byte[] bArr) {
            this.f8992iobyxmoadg = i13;
            this.f8995zoijcleaow = i14;
            this.f8993ppxfxbqfkf = j13;
            this.f8994wkgbmnqykc = bArr;
        }
    }

    private static class zoijcleaow extends InputStream implements DataInput {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final ByteOrder f9000cqumvgiudr = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final ByteOrder f9001esjtqupxsv = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private byte[] f9002iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f9003jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private ByteOrder f9004yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final DataInputStream f9005zdlpuopuiu;

        zoijcleaow(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f9005zdlpuopuiu.available();
        }

        public int iobyxmoadg() {
            return this.f9003jyumaefscl;
        }

        public void lqeggnwhkg(ByteOrder byteOrder) {
            this.f9004yggfygwlhe = byteOrder;
        }

        @Override // java.io.InputStream
        public void mark(int i13) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void nufgyqmvbu(int i13) throws IOException {
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i13 - i14;
                int iSkip = (int) this.f9005zdlpuopuiu.skip(i15);
                if (iSkip <= 0) {
                    if (this.f9002iwizpuwonk == null) {
                        this.f9002iwizpuwonk = new byte[8192];
                    }
                    iSkip = this.f9005zdlpuopuiu.read(this.f9002iwizpuwonk, 0, Math.min(8192, i15));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i13 + " bytes.");
                    }
                }
                i14 += iSkip;
            }
            this.f9003jyumaefscl += i14;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f9003jyumaefscl++;
            return this.f9005zdlpuopuiu.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f9003jyumaefscl++;
            return this.f9005zdlpuopuiu.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f9003jyumaefscl++;
            int i13 = this.f9005zdlpuopuiu.read();
            if (i13 >= 0) {
                return (byte) i13;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f9003jyumaefscl += 2;
            return this.f9005zdlpuopuiu.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i13, int i14) throws IOException {
            this.f9003jyumaefscl += i14;
            this.f9005zdlpuopuiu.readFully(bArr, i13, i14);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f9003jyumaefscl += 4;
            int i13 = this.f9005zdlpuopuiu.read();
            int i14 = this.f9005zdlpuopuiu.read();
            int i15 = this.f9005zdlpuopuiu.read();
            int i16 = this.f9005zdlpuopuiu.read();
            if ((i13 | i14 | i15 | i16) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9004yggfygwlhe;
            if (byteOrder == f9000cqumvgiudr) {
                return (i16 << 24) + (i15 << 16) + (i14 << 8) + i13;
            }
            if (byteOrder == f9001esjtqupxsv) {
                return (i13 << 24) + (i14 << 16) + (i15 << 8) + i16;
            }
            throw new IOException("Invalid byte order: " + this.f9004yggfygwlhe);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f9003jyumaefscl += 8;
            int i13 = this.f9005zdlpuopuiu.read();
            int i14 = this.f9005zdlpuopuiu.read();
            int i15 = this.f9005zdlpuopuiu.read();
            int i16 = this.f9005zdlpuopuiu.read();
            int i17 = this.f9005zdlpuopuiu.read();
            int i18 = this.f9005zdlpuopuiu.read();
            int i19 = this.f9005zdlpuopuiu.read();
            int i23 = this.f9005zdlpuopuiu.read();
            if ((i13 | i14 | i15 | i16 | i17 | i18 | i19 | i23) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9004yggfygwlhe;
            if (byteOrder == f9000cqumvgiudr) {
                return (((long) i23) << 56) + (((long) i19) << 48) + (((long) i18) << 40) + (((long) i17) << 32) + (((long) i16) << 24) + (((long) i15) << 16) + (((long) i14) << 8) + ((long) i13);
            }
            if (byteOrder == f9001esjtqupxsv) {
                return (((long) i13) << 56) + (((long) i14) << 48) + (((long) i15) << 40) + (((long) i16) << 32) + (((long) i17) << 24) + (((long) i18) << 16) + (((long) i19) << 8) + ((long) i23);
            }
            throw new IOException("Invalid byte order: " + this.f9004yggfygwlhe);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f9003jyumaefscl += 2;
            int i13 = this.f9005zdlpuopuiu.read();
            int i14 = this.f9005zdlpuopuiu.read();
            if ((i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9004yggfygwlhe;
            if (byteOrder == f9000cqumvgiudr) {
                return (short) ((i14 << 8) + i13);
            }
            if (byteOrder == f9001esjtqupxsv) {
                return (short) ((i13 << 8) + i14);
            }
            throw new IOException("Invalid byte order: " + this.f9004yggfygwlhe);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f9003jyumaefscl += 2;
            return this.f9005zdlpuopuiu.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f9003jyumaefscl++;
            return this.f9005zdlpuopuiu.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f9003jyumaefscl += 2;
            int i13 = this.f9005zdlpuopuiu.read();
            int i14 = this.f9005zdlpuopuiu.read();
            if ((i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9004yggfygwlhe;
            if (byteOrder == f9000cqumvgiudr) {
                return (i14 << 8) + i13;
            }
            if (byteOrder == f9001esjtqupxsv) {
                return (i13 << 8) + i14;
            }
            throw new IOException("Invalid byte order: " + this.f9004yggfygwlhe);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i13) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public long wkgbmnqykc() {
            return ((long) readInt()) & 4294967295L;
        }

        zoijcleaow(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        zoijcleaow(InputStream inputStream, ByteOrder byteOrder) {
            this.f9004yggfygwlhe = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f9005zdlpuopuiu = dataInputStream;
            dataInputStream.mark(0);
            this.f9003jyumaefscl = 0;
            this.f9004yggfygwlhe = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i13, int i14) throws IOException {
            int i15 = this.f9005zdlpuopuiu.read(bArr, i13, i14);
            this.f9003jyumaefscl += i15;
            return i15;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f9003jyumaefscl += bArr.length;
            this.f9005zdlpuopuiu.readFully(bArr);
        }
    }

    static {
        wkgbmnqykc[] wkgbmnqykcVarArr = {new wkgbmnqykc("NewSubfileType", 254, 4), new wkgbmnqykc("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new wkgbmnqykc("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new wkgbmnqykc("ImageLength", 257, 3, 4), new wkgbmnqykc("BitsPerSample", 258, 3), new wkgbmnqykc("Compression", 259, 3), new wkgbmnqykc("PhotometricInterpretation", 262, 3), new wkgbmnqykc("ImageDescription", 270, 2), new wkgbmnqykc("Make", 271, 2), new wkgbmnqykc("Model", 272, 2), new wkgbmnqykc("StripOffsets", 273, 3, 4), new wkgbmnqykc("Orientation", 274, 3), new wkgbmnqykc("SamplesPerPixel", 277, 3), new wkgbmnqykc("RowsPerStrip", 278, 3, 4), new wkgbmnqykc("StripByteCounts", 279, 3, 4), new wkgbmnqykc("XResolution", 282, 5), new wkgbmnqykc("YResolution", 283, 5), new wkgbmnqykc("PlanarConfiguration", 284, 3), new wkgbmnqykc("ResolutionUnit", 296, 3), new wkgbmnqykc("TransferFunction", 301, 3), new wkgbmnqykc("Software", 305, 2), new wkgbmnqykc("DateTime", 306, 2), new wkgbmnqykc("Artist", 315, 2), new wkgbmnqykc("WhitePoint", 318, 5), new wkgbmnqykc("PrimaryChromaticities", 319, 5), new wkgbmnqykc("SubIFDPointer", 330, 4), new wkgbmnqykc("JPEGInterchangeFormat", 513, 4), new wkgbmnqykc("JPEGInterchangeFormatLength", 514, 4), new wkgbmnqykc("YCbCrCoefficients", 529, 5), new wkgbmnqykc("YCbCrSubSampling", 530, 3), new wkgbmnqykc("YCbCrPositioning", 531, 3), new wkgbmnqykc("ReferenceBlackWhite", 532, 5), new wkgbmnqykc("Copyright", 33432, 2), new wkgbmnqykc("ExifIFDPointer", 34665, 4), new wkgbmnqykc("GPSInfoIFDPointer", 34853, 4), new wkgbmnqykc("SensorTopBorder", 4, 4), new wkgbmnqykc("SensorLeftBorder", 5, 4), new wkgbmnqykc("SensorBottomBorder", 6, 4), new wkgbmnqykc("SensorRightBorder", 7, 4), new wkgbmnqykc("ISO", 23, 3), new wkgbmnqykc("JpgFromRaw", 46, 7), new wkgbmnqykc("Xmp", 700, 1)};
        f8930jlmebxxoox = wkgbmnqykcVarArr;
        wkgbmnqykc[] wkgbmnqykcVarArr2 = {new wkgbmnqykc("ExposureTime", 33434, 5), new wkgbmnqykc("FNumber", 33437, 5), new wkgbmnqykc("ExposureProgram", 34850, 3), new wkgbmnqykc("SpectralSensitivity", 34852, 2), new wkgbmnqykc("PhotographicSensitivity", 34855, 3), new wkgbmnqykc("OECF", 34856, 7), new wkgbmnqykc("SensitivityType", 34864, 3), new wkgbmnqykc("StandardOutputSensitivity", 34865, 4), new wkgbmnqykc("RecommendedExposureIndex", 34866, 4), new wkgbmnqykc("ISOSpeed", 34867, 4), new wkgbmnqykc("ISOSpeedLatitudeyyy", 34868, 4), new wkgbmnqykc("ISOSpeedLatitudezzz", 34869, 4), new wkgbmnqykc("ExifVersion", 36864, 2), new wkgbmnqykc("DateTimeOriginal", 36867, 2), new wkgbmnqykc("DateTimeDigitized", 36868, 2), new wkgbmnqykc("OffsetTime", 36880, 2), new wkgbmnqykc("OffsetTimeOriginal", 36881, 2), new wkgbmnqykc("OffsetTimeDigitized", 36882, 2), new wkgbmnqykc("ComponentsConfiguration", 37121, 7), new wkgbmnqykc("CompressedBitsPerPixel", 37122, 5), new wkgbmnqykc("ShutterSpeedValue", 37377, 10), new wkgbmnqykc("ApertureValue", 37378, 5), new wkgbmnqykc("BrightnessValue", 37379, 10), new wkgbmnqykc("ExposureBiasValue", 37380, 10), new wkgbmnqykc("MaxApertureValue", 37381, 5), new wkgbmnqykc("SubjectDistance", 37382, 5), new wkgbmnqykc("MeteringMode", 37383, 3), new wkgbmnqykc("LightSource", 37384, 3), new wkgbmnqykc("Flash", 37385, 3), new wkgbmnqykc("FocalLength", 37386, 5), new wkgbmnqykc("SubjectArea", 37396, 3), new wkgbmnqykc("MakerNote", 37500, 7), new wkgbmnqykc("UserComment", 37510, 7), new wkgbmnqykc("SubSecTime", 37520, 2), new wkgbmnqykc("SubSecTimeOriginal", 37521, 2), new wkgbmnqykc("SubSecTimeDigitized", 37522, 2), new wkgbmnqykc("FlashpixVersion", 40960, 7), new wkgbmnqykc("ColorSpace", 40961, 3), new wkgbmnqykc("PixelXDimension", 40962, 3, 4), new wkgbmnqykc("PixelYDimension", 40963, 3, 4), new wkgbmnqykc("RelatedSoundFile", 40964, 2), new wkgbmnqykc("InteroperabilityIFDPointer", 40965, 4), new wkgbmnqykc("FlashEnergy", 41483, 5), new wkgbmnqykc("SpatialFrequencyResponse", 41484, 7), new wkgbmnqykc("FocalPlaneXResolution", 41486, 5), new wkgbmnqykc("FocalPlaneYResolution", 41487, 5), new wkgbmnqykc("FocalPlaneResolutionUnit", 41488, 3), new wkgbmnqykc("SubjectLocation", 41492, 3), new wkgbmnqykc("ExposureIndex", 41493, 5), new wkgbmnqykc("SensingMethod", 41495, 3), new wkgbmnqykc("FileSource", 41728, 7), new wkgbmnqykc("SceneType", 41729, 7), new wkgbmnqykc("CFAPattern", 41730, 7), new wkgbmnqykc("CustomRendered", 41985, 3), new wkgbmnqykc("ExposureMode", 41986, 3), new wkgbmnqykc("WhiteBalance", 41987, 3), new wkgbmnqykc("DigitalZoomRatio", 41988, 5), new wkgbmnqykc("FocalLengthIn35mmFilm", 41989, 3), new wkgbmnqykc("SceneCaptureType", 41990, 3), new wkgbmnqykc("GainControl", 41991, 3), new wkgbmnqykc("Contrast", 41992, 3), new wkgbmnqykc("Saturation", 41993, 3), new wkgbmnqykc("Sharpness", 41994, 3), new wkgbmnqykc("DeviceSettingDescription", 41995, 7), new wkgbmnqykc("SubjectDistanceRange", 41996, 3), new wkgbmnqykc("ImageUniqueID", 42016, 2), new wkgbmnqykc("CameraOwnerName", 42032, 2), new wkgbmnqykc("BodySerialNumber", 42033, 2), new wkgbmnqykc("LensSpecification", 42034, 5), new wkgbmnqykc("LensMake", 42035, 2), new wkgbmnqykc("LensModel", 42036, 2), new wkgbmnqykc("Gamma", 42240, 5), new wkgbmnqykc("DNGVersion", 50706, 1), new wkgbmnqykc("DefaultCropSize", 50720, 3, 4)};
        f8946ribwqtqdhb = wkgbmnqykcVarArr2;
        wkgbmnqykc[] wkgbmnqykcVarArr3 = {new wkgbmnqykc("GPSVersionID", 0, 1), new wkgbmnqykc("GPSLatitudeRef", 1, 2), new wkgbmnqykc("GPSLatitude", 2, 5, 10), new wkgbmnqykc("GPSLongitudeRef", 3, 2), new wkgbmnqykc("GPSLongitude", 4, 5, 10), new wkgbmnqykc("GPSAltitudeRef", 5, 1), new wkgbmnqykc("GPSAltitude", 6, 5), new wkgbmnqykc("GPSTimeStamp", 7, 5), new wkgbmnqykc("GPSSatellites", 8, 2), new wkgbmnqykc("GPSStatus", 9, 2), new wkgbmnqykc("GPSMeasureMode", 10, 2), new wkgbmnqykc("GPSDOP", 11, 5), new wkgbmnqykc("GPSSpeedRef", 12, 2), new wkgbmnqykc("GPSSpeed", 13, 5), new wkgbmnqykc("GPSTrackRef", 14, 2), new wkgbmnqykc("GPSTrack", 15, 5), new wkgbmnqykc("GPSImgDirectionRef", 16, 2), new wkgbmnqykc("GPSImgDirection", 17, 5), new wkgbmnqykc("GPSMapDatum", 18, 2), new wkgbmnqykc("GPSDestLatitudeRef", 19, 2), new wkgbmnqykc("GPSDestLatitude", 20, 5), new wkgbmnqykc("GPSDestLongitudeRef", 21, 2), new wkgbmnqykc("GPSDestLongitude", 22, 5), new wkgbmnqykc("GPSDestBearingRef", 23, 2), new wkgbmnqykc("GPSDestBearing", 24, 5), new wkgbmnqykc("GPSDestDistanceRef", 25, 2), new wkgbmnqykc("GPSDestDistance", 26, 5), new wkgbmnqykc("GPSProcessingMethod", 27, 7), new wkgbmnqykc("GPSAreaInformation", 28, 7), new wkgbmnqykc("GPSDateStamp", 29, 2), new wkgbmnqykc("GPSDifferential", 30, 3), new wkgbmnqykc("GPSHPositioningError", 31, 5)};
        f8954vipkmwdibw = wkgbmnqykcVarArr3;
        wkgbmnqykc[] wkgbmnqykcVarArr4 = {new wkgbmnqykc("InteroperabilityIndex", 1, 2)};
        f8929jhduphickx = wkgbmnqykcVarArr4;
        wkgbmnqykc[] wkgbmnqykcVarArr5 = {new wkgbmnqykc("NewSubfileType", 254, 4), new wkgbmnqykc("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new wkgbmnqykc("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new wkgbmnqykc("ThumbnailImageLength", 257, 3, 4), new wkgbmnqykc("BitsPerSample", 258, 3), new wkgbmnqykc("Compression", 259, 3), new wkgbmnqykc("PhotometricInterpretation", 262, 3), new wkgbmnqykc("ImageDescription", 270, 2), new wkgbmnqykc("Make", 271, 2), new wkgbmnqykc("Model", 272, 2), new wkgbmnqykc("StripOffsets", 273, 3, 4), new wkgbmnqykc("ThumbnailOrientation", 274, 3), new wkgbmnqykc("SamplesPerPixel", 277, 3), new wkgbmnqykc("RowsPerStrip", 278, 3, 4), new wkgbmnqykc("StripByteCounts", 279, 3, 4), new wkgbmnqykc("XResolution", 282, 5), new wkgbmnqykc("YResolution", 283, 5), new wkgbmnqykc("PlanarConfiguration", 284, 3), new wkgbmnqykc("ResolutionUnit", 296, 3), new wkgbmnqykc("TransferFunction", 301, 3), new wkgbmnqykc("Software", 305, 2), new wkgbmnqykc("DateTime", 306, 2), new wkgbmnqykc("Artist", 315, 2), new wkgbmnqykc("WhitePoint", 318, 5), new wkgbmnqykc("PrimaryChromaticities", 319, 5), new wkgbmnqykc("SubIFDPointer", 330, 4), new wkgbmnqykc("JPEGInterchangeFormat", 513, 4), new wkgbmnqykc("JPEGInterchangeFormatLength", 514, 4), new wkgbmnqykc("YCbCrCoefficients", 529, 5), new wkgbmnqykc("YCbCrSubSampling", 530, 3), new wkgbmnqykc("YCbCrPositioning", 531, 3), new wkgbmnqykc("ReferenceBlackWhite", 532, 5), new wkgbmnqykc("Copyright", 33432, 2), new wkgbmnqykc("ExifIFDPointer", 34665, 4), new wkgbmnqykc("GPSInfoIFDPointer", 34853, 4), new wkgbmnqykc("DNGVersion", 50706, 1), new wkgbmnqykc("DefaultCropSize", 50720, 3, 4)};
        f8924ikoacuggdj = wkgbmnqykcVarArr5;
        f8942okpsazkaxt = new wkgbmnqykc("StripOffsets", 273, 3);
        wkgbmnqykc[] wkgbmnqykcVarArr6 = {new wkgbmnqykc("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new wkgbmnqykc("CameraSettingsIFDPointer", 8224, 4), new wkgbmnqykc("ImageProcessingIFDPointer", 8256, 4)};
        f8933jztzpxfvev = wkgbmnqykcVarArr6;
        wkgbmnqykc[] wkgbmnqykcVarArr7 = {new wkgbmnqykc("PreviewImageStart", 257, 4), new wkgbmnqykc("PreviewImageLength", 258, 4)};
        f8958xrmfcynszj = wkgbmnqykcVarArr7;
        wkgbmnqykc[] wkgbmnqykcVarArr8 = {new wkgbmnqykc("AspectFrame", 4371, 3)};
        f8939metgxyhuhe = wkgbmnqykcVarArr8;
        wkgbmnqykc[] wkgbmnqykcVarArr9 = {new wkgbmnqykc("ColorSpace", 55, 3)};
        f8947rlfsiqarku = wkgbmnqykcVarArr9;
        wkgbmnqykc[][] wkgbmnqykcVarArr10 = {wkgbmnqykcVarArr, wkgbmnqykcVarArr2, wkgbmnqykcVarArr3, wkgbmnqykcVarArr4, wkgbmnqykcVarArr5, wkgbmnqykcVarArr, wkgbmnqykcVarArr6, wkgbmnqykcVarArr7, wkgbmnqykcVarArr8, wkgbmnqykcVarArr9};
        f8919czzsidtyhn = wkgbmnqykcVarArr10;
        f8953uwvvkdfqfp = new wkgbmnqykc[]{new wkgbmnqykc("SubIFDPointer", 330, 4), new wkgbmnqykc("ExifIFDPointer", 34665, 4), new wkgbmnqykc("GPSInfoIFDPointer", 34853, 4), new wkgbmnqykc("InteroperabilityIFDPointer", 40965, 4), new wkgbmnqykc("CameraSettingsIFDPointer", 8224, 1), new wkgbmnqykc("ImageProcessingIFDPointer", 8256, 1)};
        f8961yfnezrywwk = new HashMap[wkgbmnqykcVarArr10.length];
        f8960ydmasvzmpa = new HashMap[wkgbmnqykcVarArr10.length];
        f8948sflfametgt = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f8965zfvoamnweg = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f8941oipsdeybqn = charsetForName;
        f8914bfopjjpdmp = "Exif\u0000\u0000".getBytes(charsetForName);
        f8943opjhrmiecq = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f8938mbcevpiqjq = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f8940ntlheqmsrt = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i13 = 0;
        while (true) {
            wkgbmnqykc[][] wkgbmnqykcVarArr11 = f8919czzsidtyhn;
            if (i13 >= wkgbmnqykcVarArr11.length) {
                HashMap map = f8965zfvoamnweg;
                wkgbmnqykc[] wkgbmnqykcVarArr12 = f8953uwvvkdfqfp;
                map.put(Integer.valueOf(wkgbmnqykcVarArr12[0].f8996iobyxmoadg), 5);
                map.put(Integer.valueOf(wkgbmnqykcVarArr12[1].f8996iobyxmoadg), 1);
                map.put(Integer.valueOf(wkgbmnqykcVarArr12[2].f8996iobyxmoadg), 2);
                map.put(Integer.valueOf(wkgbmnqykcVarArr12[3].f8996iobyxmoadg), 3);
                map.put(Integer.valueOf(wkgbmnqykcVarArr12[4].f8996iobyxmoadg), 7);
                map.put(Integer.valueOf(wkgbmnqykcVarArr12[5].f8996iobyxmoadg), 8);
                f8928iyctptxqzt = Pattern.compile(".*[1-9].*");
                f8955weqkydbzbr = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f8937lrnfpwlwnk = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f8964zeieaojujs = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f8961yfnezrywwk[i13] = new HashMap();
            f8960ydmasvzmpa[i13] = new HashMap();
            for (wkgbmnqykc wkgbmnqykcVar : wkgbmnqykcVarArr11[i13]) {
                f8961yfnezrywwk[i13].put(Integer.valueOf(wkgbmnqykcVar.f8996iobyxmoadg), wkgbmnqykcVar);
                f8960ydmasvzmpa[i13].put(wkgbmnqykcVar.f8999zoijcleaow, wkgbmnqykcVar);
            }
            i13++;
        }
    }

    public iobyxmoadg(String str) throws Throwable {
        wkgbmnqykc[][] wkgbmnqykcVarArr = f8919czzsidtyhn;
        this.f8973gxszxtbevo = new HashMap[wkgbmnqykcVarArr.length];
        this.f8976lqeggnwhkg = new HashSet(wkgbmnqykcVarArr.length);
        this.f8977nufgyqmvbu = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        iwizpuwonk(str);
    }

    private void agtfadlqog(zoijcleaow zoijcleaowVar) throws Throwable {
        boolean z13 = f8962yggfygwlhe;
        if (z13) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + zoijcleaowVar);
        }
        zoijcleaowVar.nufgyqmvbu(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        zoijcleaowVar.read(bArr);
        zoijcleaowVar.read(bArr2);
        zoijcleaowVar.read(bArr3);
        int i13 = ByteBuffer.wrap(bArr).getInt();
        int i14 = ByteBuffer.wrap(bArr2).getInt();
        int i15 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i14];
        zoijcleaowVar.nufgyqmvbu(i13 - zoijcleaowVar.iobyxmoadg());
        zoijcleaowVar.read(bArr4);
        dxjokdxxww(new zoijcleaow(bArr4), i13, 5);
        zoijcleaowVar.nufgyqmvbu(i15 - zoijcleaowVar.iobyxmoadg());
        zoijcleaowVar.lqeggnwhkg(ByteOrder.BIG_ENDIAN);
        int i16 = zoijcleaowVar.readInt();
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i16);
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int unsignedShort = zoijcleaowVar.readUnsignedShort();
            int unsignedShort2 = zoijcleaowVar.readUnsignedShort();
            if (unsignedShort == f8942okpsazkaxt.f8996iobyxmoadg) {
                short s13 = zoijcleaowVar.readShort();
                short s14 = zoijcleaowVar.readShort();
                ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = ppxfxbqfkf.btonecajqb(s13, this.f8977nufgyqmvbu);
                ppxfxbqfkf ppxfxbqfkfVarBtonecajqb2 = ppxfxbqfkf.btonecajqb(s14, this.f8977nufgyqmvbu);
                this.f8973gxszxtbevo[0].put("ImageLength", ppxfxbqfkfVarBtonecajqb);
                this.f8973gxszxtbevo[0].put("ImageWidth", ppxfxbqfkfVarBtonecajqb2);
                if (f8962yggfygwlhe) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s13) + ", width: " + ((int) s14));
                    return;
                }
                return;
            }
            zoijcleaowVar.nufgyqmvbu(unsignedShort2);
        }
    }

    private boolean cdpycssgdh(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i13 = 0; i13 < bytes.length; i13++) {
            if (bArr[i13] != bytes[i13]) {
                return false;
            }
        }
        return true;
    }

    private void cllcsxoeiz(byte[] bArr, int i13) throws IOException {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(bArr);
        hcddaimhww(gxszxtbevoVar);
        dsvhmnatus(gxszxtbevoVar, i13);
    }

    private static boolean cqumvgiudr(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f8914bfopjjpdmp;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr3 = f8914bfopjjpdmp;
            if (i13 >= bArr3.length) {
                return true;
            }
            if (bArr2[i13] != bArr3[i13]) {
                return false;
            }
            i13++;
        }
    }

    private void draadjrbmk(gxszxtbevo gxszxtbevoVar) throws Throwable {
        int i13;
        int i14;
        ojitshcjhn(gxszxtbevoVar);
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[1].get("MakerNote");
        if (ppxfxbqfkfVar != null) {
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(ppxfxbqfkfVar.f8994wkgbmnqykc);
            gxszxtbevoVar2.lqeggnwhkg(this.f8977nufgyqmvbu);
            byte[] bArr = f8959yadqdtsiqt;
            byte[] bArr2 = new byte[bArr.length];
            gxszxtbevoVar2.readFully(bArr2);
            gxszxtbevoVar2.dxjokdxxww(0L);
            byte[] bArr3 = f8925iozdgvuglv;
            byte[] bArr4 = new byte[bArr3.length];
            gxszxtbevoVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gxszxtbevoVar2.dxjokdxxww(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gxszxtbevoVar2.dxjokdxxww(12L);
            }
            dsvhmnatus(gxszxtbevoVar2, 6);
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[7].get("PreviewImageStart");
            ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) this.f8973gxszxtbevo[7].get("PreviewImageLength");
            if (ppxfxbqfkfVar2 != null && ppxfxbqfkfVar3 != null) {
                this.f8973gxszxtbevo[5].put("JPEGInterchangeFormat", ppxfxbqfkfVar2);
                this.f8973gxszxtbevo[5].put("JPEGInterchangeFormatLength", ppxfxbqfkfVar3);
            }
            ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) this.f8973gxszxtbevo[8].get("AspectFrame");
            if (ppxfxbqfkfVar4 != null) {
                int[] iArr = (int[]) ppxfxbqfkfVar4.ojitshcjhn(this.f8977nufgyqmvbu);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i15 = iArr[2];
                int i16 = iArr[0];
                if (i15 <= i16 || (i13 = iArr[3]) <= (i14 = iArr[1])) {
                    return;
                }
                int i17 = (i15 - i16) + 1;
                int i18 = (i13 - i14) + 1;
                if (i17 < i18) {
                    int i19 = i17 + i18;
                    i18 = i19 - i18;
                    i17 = i19 - i18;
                }
                ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = ppxfxbqfkf.btonecajqb(i17, this.f8977nufgyqmvbu);
                ppxfxbqfkf ppxfxbqfkfVarBtonecajqb2 = ppxfxbqfkf.btonecajqb(i18, this.f8977nufgyqmvbu);
                this.f8973gxszxtbevo[0].put("ImageWidth", ppxfxbqfkfVarBtonecajqb);
                this.f8973gxszxtbevo[0].put("ImageLength", ppxfxbqfkfVarBtonecajqb2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02be  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:114:0x0302  */
    /* JADX WARN: Code duplicated, block: B:138:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0154  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0206  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x023d  */
    /* JADX WARN: Code duplicated, block: B:93:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x024c  */
    /* JADX WARN: Code duplicated, block: B:95:0x026e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0270  */
    /* JADX WARN: Code duplicated, block: B:98:0x028a  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x013b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01cd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x024c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0270, please report this as an issue */
    private void dsvhmnatus(gxszxtbevo gxszxtbevoVar, int i13) throws IOException {
        wkgbmnqykc wkgbmnqykcVar;
        long j13;
        boolean z13;
        long j14;
        int i14;
        wkgbmnqykc wkgbmnqykcVar2;
        Integer num;
        long j15;
        int unsignedShort;
        long jWkgbmnqykc;
        int i15;
        this.f8976lqeggnwhkg.add(Integer.valueOf(gxszxtbevoVar.f9003jyumaefscl));
        short s13 = gxszxtbevoVar.readShort();
        if (f8962yggfygwlhe) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s13));
        }
        if (s13 <= 0) {
            return;
        }
        short s14 = 0;
        while (s14 < s13) {
            int unsignedShort2 = gxszxtbevoVar.readUnsignedShort();
            int unsignedShort3 = gxszxtbevoVar.readUnsignedShort();
            int i16 = gxszxtbevoVar.readInt();
            long jIobyxmoadg = ((long) gxszxtbevoVar.iobyxmoadg()) + 4;
            wkgbmnqykc wkgbmnqykcVar3 = (wkgbmnqykc) f8961yfnezrywwk[i13].get(Integer.valueOf(unsignedShort2));
            boolean z14 = f8962yggfygwlhe;
            if (z14) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i13), Integer.valueOf(unsignedShort2), wkgbmnqykcVar3 != null ? wkgbmnqykcVar3.f8999zoijcleaow : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i16)));
            }
            if (wkgbmnqykcVar3 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f8949sopmlzcsov;
                    if (unsignedShort3 < iArr.length) {
                        if (wkgbmnqykcVar3.iobyxmoadg(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = wkgbmnqykcVar3.f8997ppxfxbqfkf;
                            }
                            wkgbmnqykcVar = wkgbmnqykcVar3;
                            j13 = ((long) iArr[unsignedShort3]) * ((long) i16);
                            if (j13 < 0 || j13 > 2147483647L) {
                                if (z14) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i16);
                                }
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                        } else if (z14) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f8952ulzqkzuiru[unsignedShort3] + ") is unexpected for tag: " + wkgbmnqykcVar3.f8999zoijcleaow);
                        }
                    }
                    if (z13) {
                        if (j13 > 4) {
                            i15 = gxszxtbevoVar.readInt();
                            if (z14) {
                                Log.d("ExifInterface", "seek to data offset: " + i15);
                            }
                            if (this.f8984wkgbmnqykc == 7) {
                                wkgbmnqykcVar2 = wkgbmnqykcVar;
                                j14 = jIobyxmoadg;
                                if ("MakerNote".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                                    this.f8982vdvldrhtss = i15;
                                } else if (i13 != 6 && "ThumbnailImage".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                                    this.f8979oxmwwwfdhm = i15;
                                    this.f8975kcexrzcfyt = i16;
                                    ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = ppxfxbqfkf.btonecajqb(6, this.f8977nufgyqmvbu);
                                    ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ppxfxbqfkf.gxszxtbevo(this.f8979oxmwwwfdhm, this.f8977nufgyqmvbu);
                                    i14 = i16;
                                    ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo2 = ppxfxbqfkf.gxszxtbevo(this.f8975kcexrzcfyt, this.f8977nufgyqmvbu);
                                    this.f8973gxszxtbevo[4].put("Compression", ppxfxbqfkfVarBtonecajqb);
                                    this.f8973gxszxtbevo[4].put("JPEGInterchangeFormat", ppxfxbqfkfVarGxszxtbevo);
                                    this.f8973gxszxtbevo[4].put("JPEGInterchangeFormatLength", ppxfxbqfkfVarGxszxtbevo2);
                                }
                                i14 = i16;
                            } else {
                                j14 = jIobyxmoadg;
                                i14 = i16;
                                wkgbmnqykcVar2 = wkgbmnqykcVar;
                            }
                            gxszxtbevoVar.dxjokdxxww(i15);
                        } else {
                            j14 = jIobyxmoadg;
                            i14 = i16;
                            wkgbmnqykcVar2 = wkgbmnqykcVar;
                        }
                        num = (Integer) f8965zfvoamnweg.get(Integer.valueOf(unsignedShort2));
                        if (z14) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j13);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    jWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gxszxtbevoVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gxszxtbevoVar.readInt();
                                } else {
                                    jWkgbmnqykc = -1;
                                }
                                if (z14) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jWkgbmnqykc), wkgbmnqykcVar2.f8999zoijcleaow));
                                }
                                if (jWkgbmnqykc > 0) {
                                    if (!this.f8976lqeggnwhkg.contains(Integer.valueOf((int) jWkgbmnqykc))) {
                                        gxszxtbevoVar.dxjokdxxww(jWkgbmnqykc);
                                        dsvhmnatus(gxszxtbevoVar, num.intValue());
                                    } else if (z14) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jWkgbmnqykc + ")");
                                    }
                                } else if (z14) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jWkgbmnqykc);
                                }
                                gxszxtbevoVar.dxjokdxxww(j14);
                            } else {
                                unsignedShort = gxszxtbevoVar.readUnsignedShort();
                            }
                            jWkgbmnqykc = unsignedShort;
                            if (z14) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jWkgbmnqykc), wkgbmnqykcVar2.f8999zoijcleaow));
                            }
                            if (jWkgbmnqykc > 0) {
                                if (!this.f8976lqeggnwhkg.contains(Integer.valueOf((int) jWkgbmnqykc))) {
                                    gxszxtbevoVar.dxjokdxxww(jWkgbmnqykc);
                                    dsvhmnatus(gxszxtbevoVar, num.intValue());
                                } else if (z14) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jWkgbmnqykc + ")");
                                }
                            } else if (z14) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jWkgbmnqykc);
                            }
                            gxszxtbevoVar.dxjokdxxww(j14);
                        } else {
                            j15 = j14;
                            int iIobyxmoadg = gxszxtbevoVar.iobyxmoadg() + this.f8981rgvfuqvkyq;
                            byte[] bArr = new byte[(int) j13];
                            gxszxtbevoVar.readFully(bArr);
                            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(unsignedShort3, i14, iIobyxmoadg, bArr);
                            this.f8973gxszxtbevo[i13].put(wkgbmnqykcVar2.f8999zoijcleaow, ppxfxbqfkfVar);
                            if ("DNGVersion".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                                this.f8984wkgbmnqykc = 3;
                            }
                            if (((!"Make".equals(wkgbmnqykcVar2.f8999zoijcleaow) || "Model".equals(wkgbmnqykcVar2.f8999zoijcleaow)) && ppxfxbqfkfVar.agtfadlqog(this.f8977nufgyqmvbu).contains("PENTAX")) || ("Compression".equals(wkgbmnqykcVar2.f8999zoijcleaow) && ppxfxbqfkfVar.wflxmlrfwp(this.f8977nufgyqmvbu) == 65535)) {
                                this.f8984wkgbmnqykc = 8;
                            }
                            if (gxszxtbevoVar.iobyxmoadg() != j15) {
                                gxszxtbevoVar.dxjokdxxww(j15);
                            }
                        }
                    } else {
                        gxszxtbevoVar.dxjokdxxww(jIobyxmoadg);
                    }
                    s14 = (short) (s14 + 1);
                    s13 = s13;
                }
                wkgbmnqykcVar = wkgbmnqykcVar3;
                if (z14) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j13 = 0;
                z13 = false;
                if (z13) {
                    gxszxtbevoVar.dxjokdxxww(jIobyxmoadg);
                } else {
                    if (j13 > 4) {
                        i15 = gxszxtbevoVar.readInt();
                        if (z14) {
                            Log.d("ExifInterface", "seek to data offset: " + i15);
                        }
                        if (this.f8984wkgbmnqykc == 7) {
                            wkgbmnqykcVar2 = wkgbmnqykcVar;
                            j14 = jIobyxmoadg;
                            if ("MakerNote".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                                this.f8982vdvldrhtss = i15;
                            } else if (i13 != 6) {
                            }
                            i14 = i16;
                        } else {
                            j14 = jIobyxmoadg;
                            i14 = i16;
                            wkgbmnqykcVar2 = wkgbmnqykcVar;
                        }
                        gxszxtbevoVar.dxjokdxxww(i15);
                    } else {
                        j14 = jIobyxmoadg;
                        i14 = i16;
                        wkgbmnqykcVar2 = wkgbmnqykcVar;
                    }
                    num = (Integer) f8965zfvoamnweg.get(Integer.valueOf(unsignedShort2));
                    if (z14) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j13);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                jWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gxszxtbevoVar.readInt();
                            } else {
                                unsignedShort = gxszxtbevoVar.readShort();
                            }
                            if (z14) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jWkgbmnqykc), wkgbmnqykcVar2.f8999zoijcleaow));
                            }
                            if (jWkgbmnqykc > 0) {
                                if (!this.f8976lqeggnwhkg.contains(Integer.valueOf((int) jWkgbmnqykc))) {
                                    gxszxtbevoVar.dxjokdxxww(jWkgbmnqykc);
                                    dsvhmnatus(gxszxtbevoVar, num.intValue());
                                } else if (z14) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jWkgbmnqykc + ")");
                                }
                            } else if (z14) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jWkgbmnqykc);
                            }
                            gxszxtbevoVar.dxjokdxxww(j14);
                        } else {
                            unsignedShort = gxszxtbevoVar.readUnsignedShort();
                        }
                        jWkgbmnqykc = unsignedShort;
                        if (z14) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jWkgbmnqykc), wkgbmnqykcVar2.f8999zoijcleaow));
                        }
                        if (jWkgbmnqykc > 0) {
                            if (!this.f8976lqeggnwhkg.contains(Integer.valueOf((int) jWkgbmnqykc))) {
                                gxszxtbevoVar.dxjokdxxww(jWkgbmnqykc);
                                dsvhmnatus(gxszxtbevoVar, num.intValue());
                            } else if (z14) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jWkgbmnqykc + ")");
                            }
                        } else if (z14) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jWkgbmnqykc);
                        }
                        gxszxtbevoVar.dxjokdxxww(j14);
                    } else {
                        j15 = j14;
                        int iIobyxmoadg2 = gxszxtbevoVar.iobyxmoadg() + this.f8981rgvfuqvkyq;
                        byte[] bArr2 = new byte[(int) j13];
                        gxszxtbevoVar.readFully(bArr2);
                        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(unsignedShort3, i14, iIobyxmoadg2, bArr2);
                        this.f8973gxszxtbevo[i13].put(wkgbmnqykcVar2.f8999zoijcleaow, ppxfxbqfkfVar2);
                        if ("DNGVersion".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                            this.f8984wkgbmnqykc = 3;
                        }
                        if (!"Make".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                        }
                        this.f8984wkgbmnqykc = 8;
                        if (gxszxtbevoVar.iobyxmoadg() != j15) {
                            gxszxtbevoVar.dxjokdxxww(j15);
                        }
                    }
                }
                s14 = (short) (s14 + 1);
                s13 = s13;
            } else if (z14) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            wkgbmnqykcVar = wkgbmnqykcVar3;
            j13 = 0;
            z13 = false;
            if (z13) {
                gxszxtbevoVar.dxjokdxxww(jIobyxmoadg);
            } else {
                if (j13 > 4) {
                    i15 = gxszxtbevoVar.readInt();
                    if (z14) {
                        Log.d("ExifInterface", "seek to data offset: " + i15);
                    }
                    if (this.f8984wkgbmnqykc == 7) {
                        wkgbmnqykcVar2 = wkgbmnqykcVar;
                        j14 = jIobyxmoadg;
                        if ("MakerNote".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                            this.f8982vdvldrhtss = i15;
                        } else if (i13 != 6) {
                        }
                        i14 = i16;
                    } else {
                        j14 = jIobyxmoadg;
                        i14 = i16;
                        wkgbmnqykcVar2 = wkgbmnqykcVar;
                    }
                    gxszxtbevoVar.dxjokdxxww(i15);
                } else {
                    j14 = jIobyxmoadg;
                    i14 = i16;
                    wkgbmnqykcVar2 = wkgbmnqykcVar;
                }
                num = (Integer) f8965zfvoamnweg.get(Integer.valueOf(unsignedShort2));
                if (z14) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j13);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            jWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gxszxtbevoVar.readInt();
                        } else {
                            unsignedShort = gxszxtbevoVar.readShort();
                        }
                        if (z14) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jWkgbmnqykc), wkgbmnqykcVar2.f8999zoijcleaow));
                        }
                        if (jWkgbmnqykc > 0) {
                            if (!this.f8976lqeggnwhkg.contains(Integer.valueOf((int) jWkgbmnqykc))) {
                                gxszxtbevoVar.dxjokdxxww(jWkgbmnqykc);
                                dsvhmnatus(gxszxtbevoVar, num.intValue());
                            } else if (z14) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jWkgbmnqykc + ")");
                            }
                        } else if (z14) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jWkgbmnqykc);
                        }
                        gxszxtbevoVar.dxjokdxxww(j14);
                    } else {
                        unsignedShort = gxszxtbevoVar.readUnsignedShort();
                    }
                    jWkgbmnqykc = unsignedShort;
                    if (z14) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jWkgbmnqykc), wkgbmnqykcVar2.f8999zoijcleaow));
                    }
                    if (jWkgbmnqykc > 0) {
                        if (!this.f8976lqeggnwhkg.contains(Integer.valueOf((int) jWkgbmnqykc))) {
                            gxszxtbevoVar.dxjokdxxww(jWkgbmnqykc);
                            dsvhmnatus(gxszxtbevoVar, num.intValue());
                        } else if (z14) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jWkgbmnqykc + ")");
                        }
                    } else if (z14) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jWkgbmnqykc);
                    }
                    gxszxtbevoVar.dxjokdxxww(j14);
                } else {
                    j15 = j14;
                    int iIobyxmoadg3 = gxszxtbevoVar.iobyxmoadg() + this.f8981rgvfuqvkyq;
                    byte[] bArr3 = new byte[(int) j13];
                    gxszxtbevoVar.readFully(bArr3);
                    ppxfxbqfkf ppxfxbqfkfVar3 = new ppxfxbqfkf(unsignedShort3, i14, iIobyxmoadg3, bArr3);
                    this.f8973gxszxtbevo[i13].put(wkgbmnqykcVar2.f8999zoijcleaow, ppxfxbqfkfVar3);
                    if ("DNGVersion".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                        this.f8984wkgbmnqykc = 3;
                    }
                    if (!"Make".equals(wkgbmnqykcVar2.f8999zoijcleaow)) {
                    }
                    this.f8984wkgbmnqykc = 8;
                    if (gxszxtbevoVar.iobyxmoadg() != j15) {
                        gxszxtbevoVar.dxjokdxxww(j15);
                    }
                }
            }
            s14 = (short) (s14 + 1);
            s13 = s13;
        }
        int i17 = gxszxtbevoVar.readInt();
        boolean z15 = f8962yggfygwlhe;
        if (z15) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i17)));
        }
        long j16 = i17;
        if (j16 <= 0) {
            if (z15) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i17);
                return;
            }
            return;
        }
        if (this.f8976lqeggnwhkg.contains(Integer.valueOf(i17))) {
            if (z15) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i17);
                return;
            }
            return;
        }
        gxszxtbevoVar.dxjokdxxww(j16);
        if (this.f8973gxszxtbevo[4].isEmpty()) {
            dsvhmnatus(gxszxtbevoVar, 4);
        } else if (this.f8973gxszxtbevo[5].isEmpty()) {
            dsvhmnatus(gxszxtbevoVar, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b A[LOOP:0: B:10:0x0037->B:63:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void dxjokdxxww(androidx.exifinterface.media.iobyxmoadg.zoijcleaow r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.iobyxmoadg.dxjokdxxww(androidx.exifinterface.media.iobyxmoadg$zoijcleaow, int, int):void");
    }

    private int gtknphoqwx(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (pmvmpeiblj(bArr)) {
            return 4;
        }
        if (cdpycssgdh(bArr)) {
            return 9;
        }
        if (lereixgezr(bArr)) {
            return 12;
        }
        if (zynmafqrjb(bArr)) {
            return 7;
        }
        if (yadqdtsiqt(bArr)) {
            return 10;
        }
        if (istkbnxepw(bArr)) {
            return 13;
        }
        return ylkuphrtab(bArr) ? 14 : 0;
    }

    private void hcddaimhww(zoijcleaow zoijcleaowVar) throws IOException {
        ByteOrder byteOrderHkdspvbjdz = hkdspvbjdz(zoijcleaowVar);
        this.f8977nufgyqmvbu = byteOrderHkdspvbjdz;
        zoijcleaowVar.lqeggnwhkg(byteOrderHkdspvbjdz);
        int unsignedShort = zoijcleaowVar.readUnsignedShort();
        int i13 = this.f8984wkgbmnqykc;
        if (i13 != 7 && i13 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i14 = zoijcleaowVar.readInt();
        if (i14 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i14);
        }
        int i15 = i14 - 8;
        if (i15 > 0) {
            zoijcleaowVar.nufgyqmvbu(i15);
        }
    }

    private ByteOrder hkdspvbjdz(zoijcleaow zoijcleaowVar) throws IOException {
        short s13 = zoijcleaowVar.readShort();
        if (s13 == 18761) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s13 == 19789) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s13));
    }

    private void iobyxmoadg() {
        String strWkgbmnqykc = wkgbmnqykc("DateTimeOriginal");
        if (strWkgbmnqykc != null && wkgbmnqykc("DateTime") == null) {
            this.f8973gxszxtbevo[0].put("DateTime", ppxfxbqfkf.eablkybsjg(strWkgbmnqykc));
        }
        if (wkgbmnqykc("ImageWidth") == null) {
            this.f8973gxszxtbevo[0].put("ImageWidth", ppxfxbqfkf.gxszxtbevo(0L, this.f8977nufgyqmvbu));
        }
        if (wkgbmnqykc("ImageLength") == null) {
            this.f8973gxszxtbevo[0].put("ImageLength", ppxfxbqfkf.gxszxtbevo(0L, this.f8977nufgyqmvbu));
        }
        if (wkgbmnqykc("Orientation") == null) {
            this.f8973gxszxtbevo[0].put("Orientation", ppxfxbqfkf.gxszxtbevo(0L, this.f8977nufgyqmvbu));
        }
        if (wkgbmnqykc("LightSource") == null) {
            this.f8973gxszxtbevo[1].put("LightSource", ppxfxbqfkf.gxszxtbevo(0L, this.f8977nufgyqmvbu));
        }
    }

    private static boolean iozdgvuglv(FileDescriptor fileDescriptor) {
        try {
            androidx.exifinterface.media.zoijcleaow.iobyxmoadg.ppxfxbqfkf(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f8962yggfygwlhe) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean istkbnxepw(byte[] bArr) {
        int i13 = 0;
        while (true) {
            byte[] bArr2 = f8936lmojexxdyd;
            if (i13 >= bArr2.length) {
                return true;
            }
            if (bArr[i13] != bArr2[i13]) {
                return false;
            }
            i13++;
        }
    }

    private void iwizpuwonk(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f8980ppxfxbqfkf = null;
        this.f8974iobyxmoadg = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (iozdgvuglv(fileInputStream2.getFD())) {
                    this.f8986zoijcleaow = fileInputStream2.getFD();
                } else {
                    this.f8986zoijcleaow = null;
                }
                pkzmftpjix(fileInputStream2);
                androidx.exifinterface.media.zoijcleaow.zoijcleaow(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.zoijcleaow.zoijcleaow(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void jpowsppfya() {
        for (int i13 = 0; i13 < this.f8973gxszxtbevo.length; i13++) {
            Log.d("ExifInterface", "The size of tag group[" + i13 + "]: " + this.f8973gxszxtbevo[i13].size());
            for (Map.Entry entry : this.f8973gxszxtbevo[i13].entrySet()) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + ppxfxbqfkfVar.toString() + ", tagValue: '" + ppxfxbqfkfVar.agtfadlqog(this.f8977nufgyqmvbu) + "'");
            }
        }
    }

    private void jyumaefscl(zoijcleaow zoijcleaowVar, HashMap map) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) map.get("StripOffsets");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) map.get("StripByteCounts");
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar2 == null) {
            return;
        }
        long[] jArrPpxfxbqfkf = androidx.exifinterface.media.zoijcleaow.ppxfxbqfkf(ppxfxbqfkfVar.ojitshcjhn(this.f8977nufgyqmvbu));
        long[] jArrPpxfxbqfkf2 = androidx.exifinterface.media.zoijcleaow.ppxfxbqfkf(ppxfxbqfkfVar2.ojitshcjhn(this.f8977nufgyqmvbu));
        if (jArrPpxfxbqfkf == null || jArrPpxfxbqfkf.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrPpxfxbqfkf2 == null || jArrPpxfxbqfkf2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrPpxfxbqfkf.length != jArrPpxfxbqfkf2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j13 = 0;
        for (long j14 : jArrPpxfxbqfkf2) {
            j13 += j14;
        }
        int i13 = (int) j13;
        byte[] bArr = new byte[i13];
        this.f8972gtknphoqwx = true;
        this.f8968btonecajqb = true;
        this.f8970dxjokdxxww = true;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < jArrPpxfxbqfkf.length; i16++) {
            int i17 = (int) jArrPpxfxbqfkf[i16];
            int i18 = (int) jArrPpxfxbqfkf2[i16];
            if (i16 < jArrPpxfxbqfkf.length - 1 && i17 + i18 != jArrPpxfxbqfkf[i16 + 1]) {
                this.f8972gtknphoqwx = false;
            }
            int i19 = i17 - i14;
            if (i19 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j15 = i19;
            if (zoijcleaowVar.skip(j15) != j15) {
                Log.d("ExifInterface", "Failed to skip " + i19 + " bytes.");
                return;
            }
            int i23 = i14 + i19;
            byte[] bArr2 = new byte[i18];
            if (zoijcleaowVar.read(bArr2) != i18) {
                Log.d("ExifInterface", "Failed to read " + i18 + " bytes.");
                return;
            }
            i14 = i23 + i18;
            System.arraycopy(bArr2, 0, bArr, i15, i18);
            i15 += i18;
        }
        this.f8967agtfadlqog = bArr;
        if (this.f8972gtknphoqwx) {
            this.f8969draadjrbmk = (int) jArrPpxfxbqfkf[0];
            this.f8983wflxmlrfwp = i13;
        }
    }

    private void kcexrzcfyt(zoijcleaow zoijcleaowVar) throws Throwable {
        if (f8962yggfygwlhe) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + zoijcleaowVar);
        }
        zoijcleaowVar.lqeggnwhkg(ByteOrder.LITTLE_ENDIAN);
        zoijcleaowVar.nufgyqmvbu(f8922hcddaimhww.length);
        int i13 = zoijcleaowVar.readInt() + 8;
        byte[] bArr = f8931jpowsppfya;
        zoijcleaowVar.nufgyqmvbu(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (zoijcleaowVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i14 = zoijcleaowVar.readInt();
                int i15 = length + 8;
                if (Arrays.equals(f8923hkdspvbjdz, bArr2)) {
                    byte[] bArr3 = new byte[i14];
                    if (zoijcleaowVar.read(bArr3) == i14) {
                        this.f8981rgvfuqvkyq = i15;
                        cllcsxoeiz(bArr3, 0);
                        tzroggbefp(new zoijcleaow(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.zoijcleaow.iobyxmoadg(bArr2));
                    }
                }
                if (i14 % 2 == 1) {
                    i14++;
                }
                length = i15 + i14;
                if (length == i13) {
                    return;
                }
                if (length > i13) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                zoijcleaowVar.nufgyqmvbu(i14);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private boolean lereixgezr(byte[] bArr) throws Throwable {
        long j13;
        zoijcleaow zoijcleaowVar = null;
        try {
            try {
                zoijcleaow zoijcleaowVar2 = new zoijcleaow(bArr);
                try {
                    long length = zoijcleaowVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    zoijcleaowVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, f8966zynmafqrjb)) {
                        zoijcleaowVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = zoijcleaowVar2.readLong();
                        j13 = 16;
                        if (length < 16) {
                            zoijcleaowVar2.close();
                            return false;
                        }
                    } else {
                        j13 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j14 = length - j13;
                    if (j14 < 8) {
                        zoijcleaowVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z13 = false;
                    boolean z14 = false;
                    for (long j15 = 0; j15 < j14 / 4; j15++) {
                        if (zoijcleaowVar2.read(bArr3) != 4) {
                            zoijcleaowVar2.close();
                            return false;
                        }
                        if (j15 != 1) {
                            if (Arrays.equals(bArr3, f8926istkbnxepw)) {
                                z13 = true;
                            } else if (Arrays.equals(bArr3, f8915cdpycssgdh)) {
                                z14 = true;
                            }
                            if (z13 && z14) {
                                zoijcleaowVar2.close();
                                return true;
                            }
                        }
                    }
                    zoijcleaowVar2.close();
                } catch (Exception e13) {
                    e = e13;
                    zoijcleaowVar = zoijcleaowVar2;
                    if (f8962yggfygwlhe) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (zoijcleaowVar != null) {
                        zoijcleaowVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zoijcleaowVar = zoijcleaowVar2;
                    if (zoijcleaowVar != null) {
                        zoijcleaowVar.close();
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean lmojexxdyd(HashMap map) {
        ppxfxbqfkf ppxfxbqfkfVar;
        int iWflxmlrfwp;
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) map.get("BitsPerSample");
        if (ppxfxbqfkfVar2 != null) {
            int[] iArr = (int[]) ppxfxbqfkfVar2.ojitshcjhn(this.f8977nufgyqmvbu);
            int[] iArr2 = f8917cqumvgiudr;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f8984wkgbmnqykc == 3 && (ppxfxbqfkfVar = (ppxfxbqfkf) map.get("PhotometricInterpretation")) != null && (((iWflxmlrfwp = ppxfxbqfkfVar.wflxmlrfwp(this.f8977nufgyqmvbu)) == 1 && Arrays.equals(iArr, f8935lereixgezr)) || (iWflxmlrfwp == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f8962yggfygwlhe) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private ppxfxbqfkf lqeggnwhkg(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i13 = 0; i13 < f8919czzsidtyhn.length; i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get(str);
            if (ppxfxbqfkfVar != null) {
                return ppxfxbqfkfVar;
            }
        }
        return null;
    }

    private static boolean mbcevpiqjq(int i13) {
        return (i13 == 4 || i13 == 9 || i13 == 13 || i13 == 14) ? false : true;
    }

    private void ntlheqmsrt(int i13, int i14) throws Throwable {
        if (this.f8973gxszxtbevo[i13].isEmpty() || this.f8973gxszxtbevo[i14].isEmpty()) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("ImageLength");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("ImageWidth");
        ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) this.f8973gxszxtbevo[i14].get("ImageLength");
        ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) this.f8973gxszxtbevo[i14].get("ImageWidth");
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar2 == null) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (ppxfxbqfkfVar3 == null || ppxfxbqfkfVar4 == null) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iWflxmlrfwp = ppxfxbqfkfVar.wflxmlrfwp(this.f8977nufgyqmvbu);
        int iWflxmlrfwp2 = ppxfxbqfkfVar2.wflxmlrfwp(this.f8977nufgyqmvbu);
        int iWflxmlrfwp3 = ppxfxbqfkfVar3.wflxmlrfwp(this.f8977nufgyqmvbu);
        int iWflxmlrfwp4 = ppxfxbqfkfVar4.wflxmlrfwp(this.f8977nufgyqmvbu);
        if (iWflxmlrfwp >= iWflxmlrfwp3 || iWflxmlrfwp2 >= iWflxmlrfwp4) {
            return;
        }
        HashMap[] mapArr = this.f8973gxszxtbevo;
        HashMap map = mapArr[i13];
        mapArr[i13] = mapArr[i14];
        mapArr[i14] = map;
    }

    private void nufgyqmvbu(gxszxtbevo gxszxtbevoVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i13;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.zoijcleaow.C0142zoijcleaow.iobyxmoadg(mediaMetadataRetriever, new C0141iobyxmoadg(gxszxtbevoVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f8973gxszxtbevo[0].put("ImageWidth", ppxfxbqfkf.btonecajqb(Integer.parseInt(strExtractMetadata), this.f8977nufgyqmvbu));
                }
                if (strExtractMetadata2 != null) {
                    this.f8973gxszxtbevo[0].put("ImageLength", ppxfxbqfkf.btonecajqb(Integer.parseInt(strExtractMetadata2), this.f8977nufgyqmvbu));
                }
                if (strExtractMetadata3 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata3);
                    if (i14 == 90) {
                        i13 = 6;
                    } else if (i14 != 180) {
                        i13 = i14 != 270 ? 1 : 8;
                    } else {
                        i13 = 3;
                    }
                    this.f8973gxszxtbevo[0].put("Orientation", ppxfxbqfkf.btonecajqb(i13, this.f8977nufgyqmvbu));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i15 = Integer.parseInt(strExtractMetadata4);
                    int i16 = Integer.parseInt(strExtractMetadata5);
                    if (i16 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gxszxtbevoVar.dxjokdxxww(i15);
                    byte[] bArr = new byte[6];
                    if (gxszxtbevoVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i17 = i15 + 6;
                    int i18 = i16 - 6;
                    if (!Arrays.equals(bArr, f8914bfopjjpdmp)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i18];
                    if (gxszxtbevoVar.read(bArr2) != i18) {
                        throw new IOException("Can't read exif");
                    }
                    this.f8981rgvfuqvkyq = i17;
                    cllcsxoeiz(bArr2, 0);
                }
                if (f8962yggfygwlhe) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    private void ojitshcjhn(gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        hcddaimhww(gxszxtbevoVar);
        dsvhmnatus(gxszxtbevoVar, 0);
        ulzqkzuiru(gxszxtbevoVar, 0);
        ulzqkzuiru(gxszxtbevoVar, 5);
        ulzqkzuiru(gxszxtbevoVar, 4);
        sopmlzcsov();
        if (this.f8984wkgbmnqykc != 8 || (ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[1].get("MakerNote")) == null) {
            return;
        }
        gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(ppxfxbqfkfVar.f8994wkgbmnqykc);
        gxszxtbevoVar2.lqeggnwhkg(this.f8977nufgyqmvbu);
        gxszxtbevoVar2.nufgyqmvbu(6);
        dsvhmnatus(gxszxtbevoVar2, 9);
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[9].get("ColorSpace");
        if (ppxfxbqfkfVar2 != null) {
            this.f8973gxszxtbevo[1].put("ColorSpace", ppxfxbqfkfVar2);
        }
    }

    private void oxmwwwfdhm(gxszxtbevo gxszxtbevoVar) throws IOException {
        byte[] bArr = f8914bfopjjpdmp;
        gxszxtbevoVar.nufgyqmvbu(bArr.length);
        byte[] bArr2 = new byte[gxszxtbevoVar.available()];
        gxszxtbevoVar.readFully(bArr2);
        this.f8981rgvfuqvkyq = bArr.length;
        cllcsxoeiz(bArr2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    private void pkzmftpjix(InputStream inputStream) {
        boolean z13;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i13 = 0; i13 < f8919czzsidtyhn.length; i13++) {
            try {
                try {
                    this.f8973gxszxtbevo[i13] = new HashMap();
                } catch (Throwable th2) {
                    iobyxmoadg();
                    if (f8962yggfygwlhe) {
                        jpowsppfya();
                    }
                    throw th2;
                }
            } catch (IOException e13) {
                e = e13;
                z13 = f8962yggfygwlhe;
                if (z13) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                iobyxmoadg();
                if (!z13) {
                    return;
                }
            } catch (UnsupportedOperationException e14) {
                e = e14;
                z13 = f8962yggfygwlhe;
                if (z13) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                iobyxmoadg();
                if (!z13) {
                    return;
                }
            }
        }
        if (!this.f8971eablkybsjg) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f8984wkgbmnqykc = gtknphoqwx(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (mbcevpiqjq(this.f8984wkgbmnqykc)) {
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo(inputStream);
            if (this.f8971eablkybsjg) {
                oxmwwwfdhm(gxszxtbevoVar);
            } else {
                int i14 = this.f8984wkgbmnqykc;
                if (i14 == 12) {
                    nufgyqmvbu(gxszxtbevoVar);
                } else if (i14 == 7) {
                    draadjrbmk(gxszxtbevoVar);
                } else if (i14 == 10) {
                    vdvldrhtss(gxszxtbevoVar);
                } else {
                    ojitshcjhn(gxszxtbevoVar);
                }
            }
            gxszxtbevoVar.dxjokdxxww(this.f8981rgvfuqvkyq);
            tzroggbefp(gxszxtbevoVar);
        } else {
            zoijcleaow zoijcleaowVar = new zoijcleaow(inputStream);
            int i15 = this.f8984wkgbmnqykc;
            if (i15 == 4) {
                dxjokdxxww(zoijcleaowVar, 0, 0);
            } else if (i15 == 13) {
                wflxmlrfwp(zoijcleaowVar);
            } else if (i15 == 9) {
                agtfadlqog(zoijcleaowVar);
            } else if (i15 == 14) {
                kcexrzcfyt(zoijcleaowVar);
            }
        }
        iobyxmoadg();
        if (!f8962yggfygwlhe) {
            return;
        }
        jpowsppfya();
    }

    private static boolean pmvmpeiblj(byte[] bArr) {
        int i13 = 0;
        while (true) {
            byte[] bArr2 = f8945pmvmpeiblj;
            if (i13 >= bArr2.length) {
                return true;
            }
            if (bArr[i13] != bArr2[i13]) {
                return false;
            }
            i13++;
        }
    }

    private void sopmlzcsov() throws Throwable {
        ntlheqmsrt(0, 5);
        ntlheqmsrt(0, 4);
        ntlheqmsrt(5, 4);
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[1].get("PixelXDimension");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[1].get("PixelYDimension");
        if (ppxfxbqfkfVar != null && ppxfxbqfkfVar2 != null) {
            this.f8973gxszxtbevo[0].put("ImageWidth", ppxfxbqfkfVar);
            this.f8973gxszxtbevo[0].put("ImageLength", ppxfxbqfkfVar2);
        }
        if (this.f8973gxszxtbevo[4].isEmpty() && wwaezpbzkn(this.f8973gxszxtbevo[5])) {
            HashMap[] mapArr = this.f8973gxszxtbevo;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!wwaezpbzkn(this.f8973gxszxtbevo[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        wypolnanlu(0, "ThumbnailOrientation", "Orientation");
        wypolnanlu(0, "ThumbnailImageLength", "ImageLength");
        wypolnanlu(0, "ThumbnailImageWidth", "ImageWidth");
        wypolnanlu(5, "ThumbnailOrientation", "Orientation");
        wypolnanlu(5, "ThumbnailImageLength", "ImageLength");
        wypolnanlu(5, "ThumbnailImageWidth", "ImageWidth");
        wypolnanlu(4, "Orientation", "ThumbnailOrientation");
        wypolnanlu(4, "ImageLength", "ThumbnailImageLength");
        wypolnanlu(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void stevsuqkhv(gxszxtbevo gxszxtbevoVar, int i13) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("ImageLength");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("ImageWidth");
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar2 == null) {
            ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("JPEGInterchangeFormat");
            ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("JPEGInterchangeFormatLength");
            if (ppxfxbqfkfVar3 == null || ppxfxbqfkfVar4 == null) {
                return;
            }
            int iWflxmlrfwp = ppxfxbqfkfVar3.wflxmlrfwp(this.f8977nufgyqmvbu);
            int iWflxmlrfwp2 = ppxfxbqfkfVar3.wflxmlrfwp(this.f8977nufgyqmvbu);
            gxszxtbevoVar.dxjokdxxww(iWflxmlrfwp);
            byte[] bArr = new byte[iWflxmlrfwp2];
            gxszxtbevoVar.read(bArr);
            dxjokdxxww(new zoijcleaow(bArr), iWflxmlrfwp, i13);
        }
    }

    private void tzroggbefp(zoijcleaow zoijcleaowVar) throws Throwable {
        HashMap map = this.f8973gxszxtbevo[4];
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) map.get("Compression");
        if (ppxfxbqfkfVar == null) {
            this.f8978ojitshcjhn = 6;
            yggfygwlhe(zoijcleaowVar, map);
            return;
        }
        int iWflxmlrfwp = ppxfxbqfkfVar.wflxmlrfwp(this.f8977nufgyqmvbu);
        this.f8978ojitshcjhn = iWflxmlrfwp;
        if (iWflxmlrfwp != 1) {
            if (iWflxmlrfwp == 6) {
                yggfygwlhe(zoijcleaowVar, map);
                return;
            } else if (iWflxmlrfwp != 7) {
                return;
            }
        }
        if (lmojexxdyd(map)) {
            jyumaefscl(zoijcleaowVar, map);
        }
    }

    private void ulzqkzuiru(gxszxtbevo gxszxtbevoVar, int i13) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVarBtonecajqb;
        ppxfxbqfkf ppxfxbqfkfVarBtonecajqb2;
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("DefaultCropSize");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("SensorTopBorder");
        ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("SensorLeftBorder");
        ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("SensorBottomBorder");
        ppxfxbqfkf ppxfxbqfkfVar5 = (ppxfxbqfkf) this.f8973gxszxtbevo[i13].get("SensorRightBorder");
        if (ppxfxbqfkfVar == null) {
            if (ppxfxbqfkfVar2 == null || ppxfxbqfkfVar3 == null || ppxfxbqfkfVar4 == null || ppxfxbqfkfVar5 == null) {
                stevsuqkhv(gxszxtbevoVar, i13);
                return;
            }
            int iWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(this.f8977nufgyqmvbu);
            int iWflxmlrfwp2 = ppxfxbqfkfVar4.wflxmlrfwp(this.f8977nufgyqmvbu);
            int iWflxmlrfwp3 = ppxfxbqfkfVar5.wflxmlrfwp(this.f8977nufgyqmvbu);
            int iWflxmlrfwp4 = ppxfxbqfkfVar3.wflxmlrfwp(this.f8977nufgyqmvbu);
            if (iWflxmlrfwp2 <= iWflxmlrfwp || iWflxmlrfwp3 <= iWflxmlrfwp4) {
                return;
            }
            ppxfxbqfkf ppxfxbqfkfVarBtonecajqb3 = ppxfxbqfkf.btonecajqb(iWflxmlrfwp2 - iWflxmlrfwp, this.f8977nufgyqmvbu);
            ppxfxbqfkf ppxfxbqfkfVarBtonecajqb4 = ppxfxbqfkf.btonecajqb(iWflxmlrfwp3 - iWflxmlrfwp4, this.f8977nufgyqmvbu);
            this.f8973gxszxtbevo[i13].put("ImageLength", ppxfxbqfkfVarBtonecajqb3);
            this.f8973gxszxtbevo[i13].put("ImageWidth", ppxfxbqfkfVarBtonecajqb4);
            return;
        }
        if (ppxfxbqfkfVar.f8992iobyxmoadg == 5) {
            eablkybsjg[] eablkybsjgVarArr = (eablkybsjg[]) ppxfxbqfkfVar.ojitshcjhn(this.f8977nufgyqmvbu);
            if (eablkybsjgVarArr == null || eablkybsjgVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eablkybsjgVarArr));
                return;
            }
            ppxfxbqfkfVarBtonecajqb = ppxfxbqfkf.nufgyqmvbu(eablkybsjgVarArr[0], this.f8977nufgyqmvbu);
            ppxfxbqfkfVarBtonecajqb2 = ppxfxbqfkf.nufgyqmvbu(eablkybsjgVarArr[1], this.f8977nufgyqmvbu);
        } else {
            int[] iArr = (int[]) ppxfxbqfkfVar.ojitshcjhn(this.f8977nufgyqmvbu);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            ppxfxbqfkfVarBtonecajqb = ppxfxbqfkf.btonecajqb(iArr[0], this.f8977nufgyqmvbu);
            ppxfxbqfkfVarBtonecajqb2 = ppxfxbqfkf.btonecajqb(iArr[1], this.f8977nufgyqmvbu);
        }
        this.f8973gxszxtbevo[i13].put("ImageWidth", ppxfxbqfkfVarBtonecajqb);
        this.f8973gxszxtbevo[i13].put("ImageLength", ppxfxbqfkfVarBtonecajqb2);
    }

    private void vdvldrhtss(gxszxtbevo gxszxtbevoVar) throws Throwable {
        if (f8962yggfygwlhe) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gxszxtbevoVar);
        }
        ojitshcjhn(gxszxtbevoVar);
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f8973gxszxtbevo[0].get("JpgFromRaw");
        if (ppxfxbqfkfVar != null) {
            dxjokdxxww(new zoijcleaow(ppxfxbqfkfVar.f8994wkgbmnqykc), (int) ppxfxbqfkfVar.f8993ppxfxbqfkf, 5);
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f8973gxszxtbevo[0].get("ISO");
        ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) this.f8973gxszxtbevo[1].get("PhotographicSensitivity");
        if (ppxfxbqfkfVar2 == null || ppxfxbqfkfVar3 != null) {
            return;
        }
        this.f8973gxszxtbevo[1].put("PhotographicSensitivity", ppxfxbqfkfVar2);
    }

    private void wflxmlrfwp(zoijcleaow zoijcleaowVar) throws Throwable {
        if (f8962yggfygwlhe) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + zoijcleaowVar);
        }
        zoijcleaowVar.lqeggnwhkg(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f8936lmojexxdyd;
        zoijcleaowVar.nufgyqmvbu(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i13 = zoijcleaowVar.readInt();
                byte[] bArr2 = new byte[4];
                if (zoijcleaowVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i14 = length + 8;
                if (i14 == 16 && !Arrays.equals(bArr2, f8963ylkuphrtab)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f8944pkzmftpjix)) {
                    return;
                }
                if (Arrays.equals(bArr2, f8956wwaezpbzkn)) {
                    byte[] bArr3 = new byte[i13];
                    if (zoijcleaowVar.read(bArr3) != i13) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.zoijcleaow.iobyxmoadg(bArr2));
                    }
                    int i15 = zoijcleaowVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i15) {
                        this.f8981rgvfuqvkyq = i14;
                        cllcsxoeiz(bArr3, 0);
                        sopmlzcsov();
                        tzroggbefp(new zoijcleaow(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i15 + ", calculated CRC value: " + crc32.getValue());
                }
                int i16 = i13 + 4;
                zoijcleaowVar.nufgyqmvbu(i16);
                length = i14 + i16;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private boolean wwaezpbzkn(HashMap map) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) map.get("ImageLength");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) map.get("ImageWidth");
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar2 == null) {
            return false;
        }
        return ppxfxbqfkfVar.wflxmlrfwp(this.f8977nufgyqmvbu) <= 512 && ppxfxbqfkfVar2.wflxmlrfwp(this.f8977nufgyqmvbu) <= 512;
    }

    private void wypolnanlu(int i13, String str, String str2) {
        if (this.f8973gxszxtbevo[i13].isEmpty() || this.f8973gxszxtbevo[i13].get(str) == null) {
            return;
        }
        HashMap map = this.f8973gxszxtbevo[i13];
        map.put(str2, map.get(str));
        this.f8973gxszxtbevo[i13].remove(str);
    }

    private boolean yadqdtsiqt(byte[] bArr) throws Throwable {
        zoijcleaow zoijcleaowVar = null;
        try {
            zoijcleaow zoijcleaowVar2 = new zoijcleaow(bArr);
            try {
                ByteOrder byteOrderHkdspvbjdz = hkdspvbjdz(zoijcleaowVar2);
                this.f8977nufgyqmvbu = byteOrderHkdspvbjdz;
                zoijcleaowVar2.lqeggnwhkg(byteOrderHkdspvbjdz);
                boolean z13 = zoijcleaowVar2.readShort() == 85;
                zoijcleaowVar2.close();
                return z13;
            } catch (Exception unused) {
                zoijcleaowVar = zoijcleaowVar2;
                if (zoijcleaowVar != null) {
                    zoijcleaowVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = zoijcleaowVar2;
                if (zoijcleaowVar != null) {
                    zoijcleaowVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void yggfygwlhe(zoijcleaow zoijcleaowVar, HashMap map) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) map.get("JPEGInterchangeFormat");
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) map.get("JPEGInterchangeFormatLength");
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar2 == null) {
            return;
        }
        int iWflxmlrfwp = ppxfxbqfkfVar.wflxmlrfwp(this.f8977nufgyqmvbu);
        int iWflxmlrfwp2 = ppxfxbqfkfVar2.wflxmlrfwp(this.f8977nufgyqmvbu);
        if (this.f8984wkgbmnqykc == 7) {
            iWflxmlrfwp += this.f8982vdvldrhtss;
        }
        if (iWflxmlrfwp > 0 && iWflxmlrfwp2 > 0) {
            this.f8970dxjokdxxww = true;
            if (this.f8974iobyxmoadg == null && this.f8980ppxfxbqfkf == null && this.f8986zoijcleaow == null) {
                byte[] bArr = new byte[iWflxmlrfwp2];
                zoijcleaowVar.skip(iWflxmlrfwp);
                zoijcleaowVar.read(bArr);
                this.f8967agtfadlqog = bArr;
            }
            this.f8969draadjrbmk = iWflxmlrfwp;
            this.f8983wflxmlrfwp = iWflxmlrfwp2;
        }
        if (f8962yggfygwlhe) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iWflxmlrfwp + ", length: " + iWflxmlrfwp2);
        }
    }

    private boolean ylkuphrtab(byte[] bArr) {
        int i13 = 0;
        while (true) {
            byte[] bArr2 = f8922hcddaimhww;
            if (i13 >= bArr2.length) {
                int i14 = 0;
                while (true) {
                    byte[] bArr3 = f8931jpowsppfya;
                    if (i14 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f8922hcddaimhww.length + i14 + 4] != bArr3[i14]) {
                        return false;
                    }
                    i14++;
                }
            } else {
                if (bArr[i13] != bArr2[i13]) {
                    return false;
                }
                i13++;
            }
        }
    }

    private static Pair zdlpuopuiu(String str) {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairZdlpuopuiu = zdlpuopuiu(strArrSplit[0]);
            if (((Integer) pairZdlpuopuiu.first).intValue() == 2) {
                return pairZdlpuopuiu;
            }
            for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                Pair pairZdlpuopuiu2 = zdlpuopuiu(strArrSplit[i13]);
                int iIntValue = (((Integer) pairZdlpuopuiu2.first).equals(pairZdlpuopuiu.first) || ((Integer) pairZdlpuopuiu2.second).equals(pairZdlpuopuiu.first)) ? ((Integer) pairZdlpuopuiu.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairZdlpuopuiu.second).intValue() == -1 || !(((Integer) pairZdlpuopuiu2.first).equals(pairZdlpuopuiu.second) || ((Integer) pairZdlpuopuiu2.second).equals(pairZdlpuopuiu.second))) ? -1 : ((Integer) pairZdlpuopuiu.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairZdlpuopuiu = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairZdlpuopuiu = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairZdlpuopuiu;
        }
        if (!str.contains(CardDateFormatTextWatcher.DIVIDER_CHARACTER)) {
            try {
                try {
                    long j13 = Long.parseLong(str);
                    if (j13 < 0 || j13 > 65535) {
                        return j13 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j14 = (long) Double.parseDouble(strArrSplit2[0]);
                long j15 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j14 >= 0 && j15 >= 0) {
                    if (j14 <= 2147483647L && j15 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    private static double zoijcleaow(String str, String str2) {
        try {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, -1);
            double d13 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, -1);
            double d14 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, -1);
            double d15 = d13 + (d14 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d15;
            }
            return -d15;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private boolean zynmafqrjb(byte[] bArr) throws Throwable {
        zoijcleaow zoijcleaowVar = null;
        try {
            zoijcleaow zoijcleaowVar2 = new zoijcleaow(bArr);
            try {
                ByteOrder byteOrderHkdspvbjdz = hkdspvbjdz(zoijcleaowVar2);
                this.f8977nufgyqmvbu = byteOrderHkdspvbjdz;
                zoijcleaowVar2.lqeggnwhkg(byteOrderHkdspvbjdz);
                short s13 = zoijcleaowVar2.readShort();
                boolean z13 = s13 == 20306 || s13 == 21330;
                zoijcleaowVar2.close();
                return z13;
            } catch (Exception unused) {
                zoijcleaowVar = zoijcleaowVar2;
                if (zoijcleaowVar != null) {
                    zoijcleaowVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = zoijcleaowVar2;
                if (zoijcleaowVar != null) {
                    zoijcleaowVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public double[] btonecajqb() {
        String strWkgbmnqykc = wkgbmnqykc("GPSLatitude");
        String strWkgbmnqykc2 = wkgbmnqykc("GPSLatitudeRef");
        String strWkgbmnqykc3 = wkgbmnqykc("GPSLongitude");
        String strWkgbmnqykc4 = wkgbmnqykc("GPSLongitudeRef");
        if (strWkgbmnqykc == null || strWkgbmnqykc2 == null || strWkgbmnqykc3 == null || strWkgbmnqykc4 == null) {
            return null;
        }
        try {
            return new double[]{zoijcleaow(strWkgbmnqykc, strWkgbmnqykc2), zoijcleaow(strWkgbmnqykc3, strWkgbmnqykc4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strWkgbmnqykc, strWkgbmnqykc2, strWkgbmnqykc3, strWkgbmnqykc4));
            return null;
        }
    }

    public double eablkybsjg(String str, double d13) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = lqeggnwhkg(str);
        if (ppxfxbqfkfVarLqeggnwhkg == null) {
            return d13;
        }
        try {
            return ppxfxbqfkfVarLqeggnwhkg.draadjrbmk(this.f8977nufgyqmvbu);
        } catch (NumberFormatException unused) {
            return d13;
        }
    }

    public boolean esjtqupxsv() {
        int iGxszxtbevo = gxszxtbevo("Orientation", 1);
        return iGxszxtbevo == 2 || iGxszxtbevo == 7 || iGxszxtbevo == 4 || iGxszxtbevo == 5;
    }

    public int gxszxtbevo(String str, int i13) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = lqeggnwhkg(str);
        if (ppxfxbqfkfVarLqeggnwhkg == null) {
            return i13;
        }
        try {
            return ppxfxbqfkfVarLqeggnwhkg.wflxmlrfwp(this.f8977nufgyqmvbu);
        } catch (NumberFormatException unused) {
            return i13;
        }
    }

    public void kegysxyocb(String str, String str2) {
        wkgbmnqykc wkgbmnqykcVar;
        int i13;
        int i14;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = f8937lrnfpwlwnk.matcher(strReplaceAll).find();
            boolean zFind2 = f8964zeieaojujs.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f8962yggfygwlhe) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i15 = 2;
        int i16 = 1;
        if (strReplaceAll != null && f8948sflfametgt.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f8955weqkydbzbr.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new eablkybsjg(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i18 < f8919czzsidtyhn.length) {
            if ((i18 != 4 || this.f8970dxjokdxxww) && (wkgbmnqykcVar = (wkgbmnqykc) f8960ydmasvzmpa[i18].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair pairZdlpuopuiu = zdlpuopuiu(strReplaceAll);
                    int i19 = -1;
                    if (wkgbmnqykcVar.f8997ppxfxbqfkf == ((Integer) pairZdlpuopuiu.first).intValue() || wkgbmnqykcVar.f8997ppxfxbqfkf == ((Integer) pairZdlpuopuiu.second).intValue()) {
                        i13 = wkgbmnqykcVar.f8997ppxfxbqfkf;
                    } else {
                        int i23 = wkgbmnqykcVar.f8998wkgbmnqykc;
                        if (i23 == -1 || !(i23 == ((Integer) pairZdlpuopuiu.first).intValue() || wkgbmnqykcVar.f8998wkgbmnqykc == ((Integer) pairZdlpuopuiu.second).intValue())) {
                            int i24 = wkgbmnqykcVar.f8997ppxfxbqfkf;
                            if (i24 == i16 || i24 == 7 || i24 == i15) {
                                i13 = i24;
                            } else if (f8962yggfygwlhe) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Given tag (");
                                sb3.append(str3);
                                sb3.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f8952ulzqkzuiru;
                                sb3.append(strArr[wkgbmnqykcVar.f8997ppxfxbqfkf]);
                                sb3.append(wkgbmnqykcVar.f8998wkgbmnqykc == -1 ? "" : ", " + strArr[wkgbmnqykcVar.f8998wkgbmnqykc]);
                                sb3.append(" (guess: ");
                                sb3.append(strArr[((Integer) pairZdlpuopuiu.first).intValue()]);
                                sb3.append(((Integer) pairZdlpuopuiu.second).intValue() != -1 ? ", " + strArr[((Integer) pairZdlpuopuiu.second).intValue()] : "");
                                sb3.append(")");
                                Log.d("ExifInterface", sb3.toString());
                            }
                        } else {
                            i13 = wkgbmnqykcVar.f8998wkgbmnqykc;
                        }
                    }
                    switch (i13) {
                        case 1:
                            i14 = i16;
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.iobyxmoadg(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i14 = i16;
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.eablkybsjg(strReplaceAll));
                            break;
                        case 3:
                            i14 = i16;
                            String[] strArrSplit = strReplaceAll.split(StringUtils.COMMA, -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i25 = 0; i25 < strArrSplit.length; i25++) {
                                iArr[i25] = Integer.parseInt(strArrSplit[i25]);
                            }
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.gtknphoqwx(iArr, this.f8977nufgyqmvbu));
                            break;
                        case 4:
                            i14 = i16;
                            String[] strArrSplit2 = strReplaceAll.split(StringUtils.COMMA, -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i26 = 0; i26 < strArrSplit2.length; i26++) {
                                jArr[i26] = Long.parseLong(strArrSplit2[i26]);
                            }
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.lqeggnwhkg(jArr, this.f8977nufgyqmvbu));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(StringUtils.COMMA, -1);
                            eablkybsjg[] eablkybsjgVarArr = new eablkybsjg[strArrSplit3.length];
                            int i27 = 0;
                            while (i27 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i27].split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, i19);
                                eablkybsjgVarArr[i27] = new eablkybsjg((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                i27++;
                                i19 = -1;
                            }
                            i14 = 1;
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.dxjokdxxww(eablkybsjgVarArr, this.f8977nufgyqmvbu));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f8962yggfygwlhe) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i13);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(StringUtils.COMMA, -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i28 = 0; i28 < strArrSplit5.length; i28++) {
                                iArr2[i28] = Integer.parseInt(strArrSplit5[i28]);
                            }
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.ppxfxbqfkf(iArr2, this.f8977nufgyqmvbu));
                            i14 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(StringUtils.COMMA, -1);
                            eablkybsjg[] eablkybsjgVarArr2 = new eablkybsjg[strArrSplit6.length];
                            int i29 = i17;
                            while (i29 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i29].split(CardDateFormatTextWatcher.DIVIDER_CHARACTER, -1);
                                eablkybsjgVarArr2[i29] = new eablkybsjg((long) Double.parseDouble(strArrSplit7[i17]), (long) Double.parseDouble(strArrSplit7[i16]));
                                i29++;
                                strArrSplit6 = strArrSplit6;
                                i17 = 0;
                                i16 = 1;
                            }
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.wkgbmnqykc(eablkybsjgVarArr2, this.f8977nufgyqmvbu));
                            i14 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(StringUtils.COMMA, -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i33 = i17; i33 < strArrSplit8.length; i33++) {
                                dArr[i33] = Double.parseDouble(strArrSplit8[i33]);
                            }
                            this.f8973gxszxtbevo[i18].put(str3, ppxfxbqfkf.zoijcleaow(dArr, this.f8977nufgyqmvbu));
                            break;
                    }
                } else {
                    this.f8973gxszxtbevo[i18].remove(str3);
                }
                i14 = i16;
            } else {
                i14 = i16;
            }
            i18++;
            i16 = i14;
            i15 = 2;
            i17 = 0;
        }
    }

    public double ppxfxbqfkf(double d13) {
        double dEablkybsjg = eablkybsjg("GPSAltitude", -1.0d);
        int iGxszxtbevo = gxszxtbevo("GPSAltitudeRef", -1);
        if (dEablkybsjg < 0.0d || iGxszxtbevo < 0) {
            return d13;
        }
        return dEablkybsjg * ((double) (iGxszxtbevo != 1 ? 1 : -1));
    }

    public int rgvfuqvkyq() {
        switch (gxszxtbevo("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public String wkgbmnqykc(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = lqeggnwhkg(str);
        if (ppxfxbqfkfVarLqeggnwhkg != null) {
            if (!f8948sflfametgt.contains(str)) {
                return ppxfxbqfkfVarLqeggnwhkg.agtfadlqog(this.f8977nufgyqmvbu);
            }
            if (str.equals("GPSTimeStamp")) {
                int i13 = ppxfxbqfkfVarLqeggnwhkg.f8992iobyxmoadg;
                if (i13 != 5 && i13 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + ppxfxbqfkfVarLqeggnwhkg.f8992iobyxmoadg);
                    return null;
                }
                eablkybsjg[] eablkybsjgVarArr = (eablkybsjg[]) ppxfxbqfkfVarLqeggnwhkg.ojitshcjhn(this.f8977nufgyqmvbu);
                if (eablkybsjgVarArr == null || eablkybsjgVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eablkybsjgVarArr));
                    return null;
                }
                eablkybsjg eablkybsjgVar = eablkybsjgVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eablkybsjgVar.f8987iobyxmoadg / eablkybsjgVar.f8988zoijcleaow));
                eablkybsjg eablkybsjgVar2 = eablkybsjgVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eablkybsjgVar2.f8987iobyxmoadg / eablkybsjgVar2.f8988zoijcleaow));
                eablkybsjg eablkybsjgVar3 = eablkybsjgVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eablkybsjgVar3.f8987iobyxmoadg / eablkybsjgVar3.f8988zoijcleaow)));
            }
            try {
                return Double.toString(ppxfxbqfkfVarLqeggnwhkg.draadjrbmk(this.f8977nufgyqmvbu));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static class gxszxtbevo extends zoijcleaow {
        gxszxtbevo(byte[] bArr) {
            super(bArr);
            this.f9005zdlpuopuiu.mark(Integer.MAX_VALUE);
        }

        public void dxjokdxxww(long j13) throws IOException {
            int i13 = this.f9003jyumaefscl;
            if (i13 > j13) {
                this.f9003jyumaefscl = 0;
                this.f9005zdlpuopuiu.reset();
            } else {
                j13 -= (long) i13;
            }
            nufgyqmvbu((int) j13);
        }

        gxszxtbevo(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f9005zdlpuopuiu.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f8996iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f8997ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f8998wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f8999zoijcleaow;

        wkgbmnqykc(String str, int i13, int i14) {
            this.f8999zoijcleaow = str;
            this.f8996iobyxmoadg = i13;
            this.f8997ppxfxbqfkf = i14;
            this.f8998wkgbmnqykc = -1;
        }

        boolean iobyxmoadg(int i13) {
            int i14;
            int i15 = this.f8997ppxfxbqfkf;
            if (i15 == 7 || i13 == 7 || i15 == i13 || (i14 = this.f8998wkgbmnqykc) == i13) {
                return true;
            }
            if ((i15 == 4 || i14 == 4) && i13 == 3) {
                return true;
            }
            if ((i15 == 9 || i14 == 9) && i13 == 8) {
                return true;
            }
            return (i15 == 12 || i14 == 12) && i13 == 11;
        }

        wkgbmnqykc(String str, int i13, int i14, int i15) {
            this.f8999zoijcleaow = str;
            this.f8996iobyxmoadg = i13;
            this.f8997ppxfxbqfkf = i14;
            this.f8998wkgbmnqykc = i15;
        }
    }

    public iobyxmoadg(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public iobyxmoadg(InputStream inputStream, int i13) {
        wkgbmnqykc[][] wkgbmnqykcVarArr = f8919czzsidtyhn;
        this.f8973gxszxtbevo = new HashMap[wkgbmnqykcVarArr.length];
        this.f8976lqeggnwhkg = new HashSet(wkgbmnqykcVarArr.length);
        this.f8977nufgyqmvbu = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f8974iobyxmoadg = null;
            if (i13 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f8914bfopjjpdmp.length);
                if (!cqumvgiudr(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f8971eablkybsjg = true;
                this.f8980ppxfxbqfkf = null;
                this.f8986zoijcleaow = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f8980ppxfxbqfkf = (AssetManager.AssetInputStream) inputStream;
                this.f8986zoijcleaow = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (iozdgvuglv(fileInputStream.getFD())) {
                    this.f8980ppxfxbqfkf = null;
                    this.f8986zoijcleaow = fileInputStream.getFD();
                } else {
                    this.f8980ppxfxbqfkf = null;
                    this.f8986zoijcleaow = null;
                }
            } else {
                this.f8980ppxfxbqfkf = null;
                this.f8986zoijcleaow = null;
            }
            pkzmftpjix(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}

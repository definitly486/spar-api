package androidx.datastore.preferences.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class hcddaimhww implements sopmlzcsov {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final esjtqupxsv f8652agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int[] f8653btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f8654draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f8655dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wwaezpbzkn f8656eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f8657gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f8658gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int[] f8659iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f8660lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f8661nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final ikoacuggdj f8662ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f8663ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final wflxmlrfwp f8664rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final istkbnxepw f8665vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final hkdspvbjdz f8666wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f8667wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object[] f8668zoijcleaow;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final int[] f8651oxmwwwfdhm = new int[0];

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final Unsafe f8650kcexrzcfyt = metgxyhuhe.zynmafqrjb();

    private hcddaimhww(int[] iArr, Object[] objArr, int i13, int i14, wwaezpbzkn wwaezpbzknVar, boolean z13, boolean z14, int[] iArr2, int i15, int i16, hkdspvbjdz hkdspvbjdzVar, esjtqupxsv esjtqupxsvVar, ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, istkbnxepw istkbnxepwVar) {
        this.f8659iobyxmoadg = iArr;
        this.f8668zoijcleaow = objArr;
        this.f8663ppxfxbqfkf = i13;
        this.f8667wkgbmnqykc = i14;
        this.f8660lqeggnwhkg = wwaezpbzknVar instanceof kcexrzcfyt;
        this.f8661nufgyqmvbu = z13;
        this.f8658gxszxtbevo = wflxmlrfwpVar != null && wflxmlrfwpVar.eablkybsjg(wwaezpbzknVar);
        this.f8655dxjokdxxww = z14;
        this.f8653btonecajqb = iArr2;
        this.f8657gtknphoqwx = i15;
        this.f8654draadjrbmk = i16;
        this.f8666wflxmlrfwp = hkdspvbjdzVar;
        this.f8652agtfadlqog = esjtqupxsvVar;
        this.f8662ojitshcjhn = ikoacuggdjVar;
        this.f8664rgvfuqvkyq = wflxmlrfwpVar;
        this.f8656eablkybsjg = wwaezpbzknVar;
        this.f8665vdvldrhtss = istkbnxepwVar;
    }

    private int agtfadlqog(ikoacuggdj ikoacuggdjVar, Object obj) {
        return ikoacuggdjVar.nufgyqmvbu(ikoacuggdjVar.lqeggnwhkg(obj));
    }

    private Object btonecajqb(int i13) {
        return this.f8668zoijcleaow[(i13 / 3) * 2];
    }

    private void cdpycssgdh(Object obj, Object obj2, int i13) {
        int iVipkmwdibw = vipkmwdibw(i13);
        int iYlkuphrtab = ylkuphrtab(i13);
        long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
        if (iwizpuwonk(obj2, iYlkuphrtab, i13)) {
            Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
            Object objPmvmpeiblj2 = metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix);
            if (objPmvmpeiblj != null && objPmvmpeiblj2 != null) {
                metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, zdlpuopuiu.nufgyqmvbu(objPmvmpeiblj, objPmvmpeiblj2));
                crxdokpmqz(obj, iYlkuphrtab, i13);
            } else if (objPmvmpeiblj2 != null) {
                metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, objPmvmpeiblj2);
                crxdokpmqz(obj, iYlkuphrtab, i13);
            }
        }
    }

    private static int cllcsxoeiz(Object obj, long j13) {
        return ((Integer) metgxyhuhe.pmvmpeiblj(obj, j13)).intValue();
    }

    private static boolean cqumvgiudr(int i13) {
        return (i13 & 268435456) != 0;
    }

    private void crxdokpmqz(Object obj, int i13, int i14) {
        metgxyhuhe.hkdspvbjdz(obj, stevsuqkhv(i14) & 1048575, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[PHI: r6
      0x0079: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
     binds: [B:21:0x0060, B:225:0x04ca, B:222:0x04bf, B:216:0x04a3, B:213:0x0491, B:210:0x0481, B:207:0x0473, B:204:0x0465, B:201:0x045a, B:198:0x0450, B:195:0x0442, B:192:0x0434, B:189:0x0420, B:165:0x032f, B:159:0x0311, B:153:0x02f3, B:147:0x02d5, B:141:0x02b7, B:135:0x0299, B:129:0x027b, B:123:0x025d, B:117:0x023f, B:111:0x0222, B:105:0x0205, B:99:0x01e8, B:93:0x01cb, B:86:0x01ab, B:81:0x0177, B:78:0x016b, B:75:0x015b, B:72:0x014b, B:69:0x013b, B:66:0x012f, B:63:0x0123, B:60:0x0116, B:54:0x00f8, B:51:0x00e5, B:48:0x00d4, B:45:0x00c5, B:42:0x00b6, B:40:0x00b0, B:38:0x00a9, B:35:0x009e, B:32:0x008f, B:29:0x0080, B:26:0x0078, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    private int draadjrbmk(Object obj) {
        int i13;
        int i14;
        int iNufgyqmvbu;
        int iPpxfxbqfkf;
        int iIozdgvuglv;
        boolean z13;
        int iGxszxtbevo;
        int iDxjokdxxww;
        int iWypolnanlu;
        int iKegysxyocb;
        Unsafe unsafe = f8650kcexrzcfyt;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < this.f8659iobyxmoadg.length) {
            int iVipkmwdibw = vipkmwdibw(i16);
            int iYlkuphrtab = ylkuphrtab(i16);
            int iRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            if (iRibwqtqdhb <= 17) {
                i13 = this.f8659iobyxmoadg[i16 + 2];
                int i19 = 1048575 & i13;
                int i23 = 1 << (i13 >>> 20);
                if (i19 != i15) {
                    i18 = unsafe.getInt(obj, i19);
                    i15 = i19;
                }
                i14 = i23;
            } else {
                i13 = (!this.f8655dxjokdxxww || iRibwqtqdhb < vdvldrhtss.f8842rlfsiqarku.iobyxmoadg() || iRibwqtqdhb > vdvldrhtss.f8861zeieaojujs.iobyxmoadg()) ? 0 : this.f8659iobyxmoadg[i16 + 2] & 1048575;
                i14 = 0;
            }
            long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
            int i24 = i15;
            switch (iRibwqtqdhb) {
                case 0:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.nufgyqmvbu(iYlkuphrtab, 0.0d);
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 1:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.rgvfuqvkyq(iYlkuphrtab, 0.0f);
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 2:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.iwizpuwonk(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 3:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.tzroggbefp(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 4:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.yggfygwlhe(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 5:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.agtfadlqog(iYlkuphrtab, 0L);
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 6:
                    if ((i18 & i14) != 0) {
                        iNufgyqmvbu = CodedOutputStream.draadjrbmk(iYlkuphrtab, 0);
                        i17 += iNufgyqmvbu;
                    }
                    break;
                case 7:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.ppxfxbqfkf(iYlkuphrtab, true);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 8:
                    if ((i18 & i14) != 0) {
                        Object object = unsafe.getObject(obj, jPkzmftpjix);
                        iPpxfxbqfkf = object instanceof gxszxtbevo ? CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) object) : CodedOutputStream.cllcsxoeiz(iYlkuphrtab, (String) object);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 9:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = jlmebxxoox.ojitshcjhn(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i16));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 10:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) unsafe.getObject(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 11:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.stevsuqkhv(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 12:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.btonecajqb(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 13:
                    if ((i18 & i14) != 0) {
                        iIozdgvuglv = CodedOutputStream.iozdgvuglv(iYlkuphrtab, 0);
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 14:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.wwaezpbzkn(iYlkuphrtab, 0L);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 15:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.pkzmftpjix(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 16:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.jpowsppfya(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 17:
                    if ((i18 & i14) != 0) {
                        iPpxfxbqfkf = CodedOutputStream.oxmwwwfdhm(iYlkuphrtab, (wwaezpbzkn) unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i16));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 18:
                    iPpxfxbqfkf = jlmebxxoox.nufgyqmvbu(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iPpxfxbqfkf;
                    break;
                case 19:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.gxszxtbevo(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 20:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.wflxmlrfwp(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 21:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.cqumvgiudr(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 22:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.gtknphoqwx(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 23:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.nufgyqmvbu(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 24:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.gxszxtbevo(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case C4007z9.F /* 25 */:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.iobyxmoadg(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case C4007z9.G /* 26 */:
                    iPpxfxbqfkf = jlmebxxoox.yggfygwlhe(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix));
                    i17 += iPpxfxbqfkf;
                    break;
                case 27:
                    iPpxfxbqfkf = jlmebxxoox.rgvfuqvkyq(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i16));
                    i17 += iPpxfxbqfkf;
                    break;
                case 28:
                    iPpxfxbqfkf = jlmebxxoox.ppxfxbqfkf(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix));
                    i17 += iPpxfxbqfkf;
                    break;
                case C4007z9.I /* 29 */:
                    iPpxfxbqfkf = jlmebxxoox.jyumaefscl(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iPpxfxbqfkf;
                    break;
                case 30:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.wkgbmnqykc(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.gxszxtbevo(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 32:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.nufgyqmvbu(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case 33:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.vdvldrhtss(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z13 = false;
                    iGxszxtbevo = jlmebxxoox.kcexrzcfyt(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), false);
                    i17 += iGxszxtbevo;
                    break;
                case C4007z9.J /* 35 */:
                    iDxjokdxxww = jlmebxxoox.dxjokdxxww((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iDxjokdxxww = jlmebxxoox.lqeggnwhkg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iDxjokdxxww = jlmebxxoox.agtfadlqog((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case C4007z9.K /* 38 */:
                    iDxjokdxxww = jlmebxxoox.esjtqupxsv((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iDxjokdxxww = jlmebxxoox.draadjrbmk((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 40:
                    iDxjokdxxww = jlmebxxoox.dxjokdxxww((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iDxjokdxxww = jlmebxxoox.lqeggnwhkg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 42:
                    iDxjokdxxww = jlmebxxoox.zoijcleaow((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 43:
                    iDxjokdxxww = jlmebxxoox.iwizpuwonk((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iDxjokdxxww = jlmebxxoox.eablkybsjg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iDxjokdxxww = jlmebxxoox.lqeggnwhkg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 46:
                    iDxjokdxxww = jlmebxxoox.dxjokdxxww((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 47:
                    iDxjokdxxww = jlmebxxoox.oxmwwwfdhm((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 48:
                    iDxjokdxxww = jlmebxxoox.zdlpuopuiu((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i13, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iIozdgvuglv = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 49:
                    iPpxfxbqfkf = jlmebxxoox.btonecajqb(iYlkuphrtab, (List) unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i16));
                    i17 += iPpxfxbqfkf;
                    break;
                case 50:
                    iPpxfxbqfkf = this.f8665vdvldrhtss.getSerializedSize(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), btonecajqb(i16));
                    i17 += iPpxfxbqfkf;
                    break;
                case 51:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.nufgyqmvbu(iYlkuphrtab, 0.0d);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 52:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.rgvfuqvkyq(iYlkuphrtab, 0.0f);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 53:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.iwizpuwonk(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 54:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.tzroggbefp(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 55:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.yggfygwlhe(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 56:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.agtfadlqog(iYlkuphrtab, 0L);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 57:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iIozdgvuglv = CodedOutputStream.draadjrbmk(iYlkuphrtab, 0);
                        i17 += iIozdgvuglv;
                    }
                    break;
                case 58:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.ppxfxbqfkf(iYlkuphrtab, true);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 59:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        Object object2 = unsafe.getObject(obj, jPkzmftpjix);
                        iPpxfxbqfkf = object2 instanceof gxszxtbevo ? CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) object2) : CodedOutputStream.cllcsxoeiz(iYlkuphrtab, (String) object2);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 60:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = jlmebxxoox.ojitshcjhn(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i16));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 61:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) unsafe.getObject(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 62:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.stevsuqkhv(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 63:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.btonecajqb(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iIozdgvuglv = CodedOutputStream.iozdgvuglv(iYlkuphrtab, 0);
                        i17 += iIozdgvuglv;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.wwaezpbzkn(iYlkuphrtab, 0L);
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 66:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.pkzmftpjix(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 67:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.jpowsppfya(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                case 68:
                    if (iwizpuwonk(obj, iYlkuphrtab, i16)) {
                        iPpxfxbqfkf = CodedOutputStream.oxmwwwfdhm(iYlkuphrtab, (wwaezpbzkn) unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i16));
                        i17 += iPpxfxbqfkf;
                    }
                    break;
                default:
                    break;
            }
            i16 += 3;
            i15 = i24;
        }
        int iAgtfadlqog = i17 + agtfadlqog(this.f8662ojitshcjhn, obj);
        return this.f8658gxszxtbevo ? iAgtfadlqog + this.f8664rgvfuqvkyq.ppxfxbqfkf(obj).nufgyqmvbu() : iAgtfadlqog;
    }

    private static long dsvhmnatus(Object obj, long j13) {
        return ((Long) metgxyhuhe.pmvmpeiblj(obj, j13)).longValue();
    }

    private zdlpuopuiu.iobyxmoadg dxjokdxxww(int i13) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f8668zoijcleaow[((i13 / 3) * 2) + 1]);
        return null;
    }

    private static double eablkybsjg(Object obj, long j13) {
        return metgxyhuhe.jyumaefscl(obj, j13);
    }

    private static List esjtqupxsv(Object obj, long j13) {
        return (List) metgxyhuhe.pmvmpeiblj(obj, j13);
    }

    private sopmlzcsov gtknphoqwx(int i13) {
        int i14 = (i13 / 3) * 2;
        sopmlzcsov sopmlzcsovVar = (sopmlzcsov) this.f8668zoijcleaow[i14];
        if (sopmlzcsovVar != null) {
            return sopmlzcsovVar;
        }
        sopmlzcsov sopmlzcsovVarPpxfxbqfkf = tzroggbefp.iobyxmoadg().ppxfxbqfkf((Class) this.f8668zoijcleaow[i14 + 1]);
        this.f8668zoijcleaow[i14] = sopmlzcsovVarPpxfxbqfkf;
        return sopmlzcsovVarPpxfxbqfkf;
    }

    private boolean gxszxtbevo(Object obj, Object obj2, int i13) {
        int iVipkmwdibw = vipkmwdibw(i13);
        long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
        switch (ribwqtqdhb(iVipkmwdibw)) {
            case 0:
                return ppxfxbqfkf(obj, obj2, i13) && Double.doubleToLongBits(metgxyhuhe.jyumaefscl(obj, jPkzmftpjix)) == Double.doubleToLongBits(metgxyhuhe.jyumaefscl(obj2, jPkzmftpjix));
            case 1:
                return ppxfxbqfkf(obj, obj2, i13) && Float.floatToIntBits(metgxyhuhe.iwizpuwonk(obj, jPkzmftpjix)) == Float.floatToIntBits(metgxyhuhe.iwizpuwonk(obj2, jPkzmftpjix));
            case 2:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) == metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix);
            case 3:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) == metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix);
            case 4:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) == metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix);
            case 5:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) == metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix);
            case 6:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) == metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix);
            case 7:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.rgvfuqvkyq(obj, jPkzmftpjix) == metgxyhuhe.rgvfuqvkyq(obj2, jPkzmftpjix);
            case 8:
                return ppxfxbqfkf(obj, obj2, i13) && jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            case 9:
                return ppxfxbqfkf(obj, obj2, i13) && jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            case 10:
                return ppxfxbqfkf(obj, obj2, i13) && jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            case 11:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) == metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix);
            case 12:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) == metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix);
            case 13:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) == metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix);
            case 14:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) == metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix);
            case 15:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) == metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix);
            case 16:
                return ppxfxbqfkf(obj, obj2, i13) && metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) == metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix);
            case 17:
                return ppxfxbqfkf(obj, obj2, i13) && jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                return jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            case 50:
                return jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 68:
                return jyumaefscl(obj, obj2, i13) && jlmebxxoox.pkzmftpjix(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
            default:
                return true;
        }
    }

    private static boolean hcddaimhww(Object obj, long j13) {
        return ((Boolean) metgxyhuhe.pmvmpeiblj(obj, j13)).booleanValue();
    }

    private static float hkdspvbjdz(Object obj, long j13) {
        return ((Float) metgxyhuhe.pmvmpeiblj(obj, j13)).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void ikoacuggdj(Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        Iterator itAgtfadlqog;
        Map.Entry entry;
        if (this.f8658gxszxtbevo) {
            rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = this.f8664rgvfuqvkyq.ppxfxbqfkf(obj);
            if (rgvfuqvkyqVarPpxfxbqfkf.btonecajqb()) {
                itAgtfadlqog = null;
                entry = null;
            } else {
                itAgtfadlqog = rgvfuqvkyqVarPpxfxbqfkf.agtfadlqog();
                entry = (Map.Entry) itAgtfadlqog.next();
            }
        } else {
            itAgtfadlqog = null;
            entry = null;
        }
        int length = this.f8659iobyxmoadg.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iVipkmwdibw = vipkmwdibw(i13);
            int iYlkuphrtab = ylkuphrtab(i13);
            while (entry != null && this.f8664rgvfuqvkyq.iobyxmoadg(entry) <= iYlkuphrtab) {
                this.f8664rgvfuqvkyq.btonecajqb(uwvvkdfqfpVar, entry);
                entry = itAgtfadlqog.hasNext() ? (Map.Entry) itAgtfadlqog.next() : null;
            }
            switch (ribwqtqdhb(iVipkmwdibw)) {
                case 0:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeDouble(iYlkuphrtab, eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 1:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeFloat(iYlkuphrtab, nufgyqmvbu(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 2:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeInt64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 3:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeUInt64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 4:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeInt32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 5:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeFixed64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 6:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeFixed32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 7:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeBool(iYlkuphrtab, wkgbmnqykc(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 8:
                    if (vdvldrhtss(obj, i13)) {
                        xrmfcynszj(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    }
                    break;
                case 9:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.ppxfxbqfkf(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(i13));
                    }
                    break;
                case 10:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.zoijcleaow(iYlkuphrtab, (gxszxtbevo) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 11:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeUInt32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 12:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeEnum(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 13:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeSFixed32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 14:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeSFixed64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 15:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeSInt32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 16:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.writeSInt64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 17:
                    if (vdvldrhtss(obj, i13)) {
                        uwvvkdfqfpVar.eablkybsjg(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(i13));
                    }
                    break;
                case 18:
                    jlmebxxoox.dsvhmnatus(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 19:
                    jlmebxxoox.tzroggbefp(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 20:
                    jlmebxxoox.ulzqkzuiru(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 21:
                    jlmebxxoox.okpsazkaxt(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 22:
                    jlmebxxoox.ntlheqmsrt(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 23:
                    jlmebxxoox.kegysxyocb(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 24:
                    jlmebxxoox.stevsuqkhv(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case C4007z9.F /* 25 */:
                    jlmebxxoox.hkdspvbjdz(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case C4007z9.G /* 26 */:
                    jlmebxxoox.jhduphickx(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    break;
                case 27:
                    jlmebxxoox.sopmlzcsov(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, gtknphoqwx(i13));
                    break;
                case 28:
                    jlmebxxoox.cllcsxoeiz(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    break;
                case C4007z9.I /* 29 */:
                    jlmebxxoox.ikoacuggdj(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 30:
                    jlmebxxoox.wypolnanlu(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    jlmebxxoox.crxdokpmqz(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 32:
                    jlmebxxoox.jlmebxxoox(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 33:
                    jlmebxxoox.ribwqtqdhb(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    jlmebxxoox.vipkmwdibw(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case C4007z9.J /* 35 */:
                    jlmebxxoox.dsvhmnatus(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    jlmebxxoox.tzroggbefp(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    jlmebxxoox.ulzqkzuiru(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case C4007z9.K /* 38 */:
                    jlmebxxoox.okpsazkaxt(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    jlmebxxoox.ntlheqmsrt(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 40:
                    jlmebxxoox.kegysxyocb(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    jlmebxxoox.stevsuqkhv(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 42:
                    jlmebxxoox.hkdspvbjdz(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 43:
                    jlmebxxoox.ikoacuggdj(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    jlmebxxoox.wypolnanlu(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    jlmebxxoox.crxdokpmqz(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 46:
                    jlmebxxoox.jlmebxxoox(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 47:
                    jlmebxxoox.ribwqtqdhb(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 48:
                    jlmebxxoox.vipkmwdibw(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 49:
                    jlmebxxoox.mbcevpiqjq(ylkuphrtab(i13), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, gtknphoqwx(i13));
                    break;
                case 50:
                    jztzpxfvev(uwvvkdfqfpVar, iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), i13);
                    break;
                case 51:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeDouble(iYlkuphrtab, jpowsppfya(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 52:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeFloat(iYlkuphrtab, hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 53:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeInt64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 54:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeUInt64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 55:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeInt32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 56:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeFixed64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 57:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeFixed32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 58:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeBool(iYlkuphrtab, hcddaimhww(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 59:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        xrmfcynszj(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    }
                    break;
                case 60:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.ppxfxbqfkf(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(i13));
                    }
                    break;
                case 61:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.zoijcleaow(iYlkuphrtab, (gxszxtbevo) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 62:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeUInt32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 63:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeEnum(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeSFixed32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeSFixed64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 66:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeSInt32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 67:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.writeSInt64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 68:
                    if (iwizpuwonk(obj, iYlkuphrtab, i13)) {
                        uwvvkdfqfpVar.eablkybsjg(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(i13));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f8664rgvfuqvkyq.btonecajqb(uwvvkdfqfpVar, entry);
            entry = itAgtfadlqog.hasNext() ? (Map.Entry) itAgtfadlqog.next() : null;
        }
        metgxyhuhe(this.f8662ojitshcjhn, obj, uwvvkdfqfpVar);
    }

    static hcddaimhww iozdgvuglv(Class cls, iozdgvuglv iozdgvuglvVar, hkdspvbjdz hkdspvbjdzVar, esjtqupxsv esjtqupxsvVar, ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, istkbnxepw istkbnxepwVar) {
        if (iozdgvuglvVar instanceof ntlheqmsrt) {
            return wwaezpbzkn((ntlheqmsrt) iozdgvuglvVar, hkdspvbjdzVar, esjtqupxsvVar, ikoacuggdjVar, wflxmlrfwpVar, istkbnxepwVar);
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(iozdgvuglvVar);
        return lmojexxdyd(null, hkdspvbjdzVar, esjtqupxsvVar, ikoacuggdjVar, wflxmlrfwpVar, istkbnxepwVar);
    }

    private void istkbnxepw(Object obj, Object obj2, int i13) {
        long jPkzmftpjix = pkzmftpjix(vipkmwdibw(i13));
        if (vdvldrhtss(obj2, i13)) {
            Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
            Object objPmvmpeiblj2 = metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix);
            if (objPmvmpeiblj != null && objPmvmpeiblj2 != null) {
                metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, zdlpuopuiu.nufgyqmvbu(objPmvmpeiblj, objPmvmpeiblj2));
                sopmlzcsov(obj, i13);
            } else if (objPmvmpeiblj2 != null) {
                metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, objPmvmpeiblj2);
                sopmlzcsov(obj, i13);
            }
        }
    }

    private boolean iwizpuwonk(Object obj, int i13, int i14) {
        return metgxyhuhe.cqumvgiudr(obj, (long) (stevsuqkhv(i14) & 1048575)) == i13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void jhduphickx(Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        Iterator itAgtfadlqog;
        Map.Entry entry;
        Map.Entry entry2;
        int i13;
        if (this.f8658gxszxtbevo) {
            rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = this.f8664rgvfuqvkyq.ppxfxbqfkf(obj);
            if (rgvfuqvkyqVarPpxfxbqfkf.btonecajqb()) {
                itAgtfadlqog = null;
                entry = null;
            } else {
                itAgtfadlqog = rgvfuqvkyqVarPpxfxbqfkf.agtfadlqog();
                entry = (Map.Entry) itAgtfadlqog.next();
            }
        } else {
            itAgtfadlqog = null;
            entry = null;
        }
        int length = this.f8659iobyxmoadg.length;
        Unsafe unsafe = f8650kcexrzcfyt;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int iVipkmwdibw = vipkmwdibw(i15);
            int iYlkuphrtab = ylkuphrtab(i15);
            int iRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            if (this.f8661nufgyqmvbu || iRibwqtqdhb > 17) {
                entry2 = entry;
                i13 = 0;
            } else {
                int i17 = this.f8659iobyxmoadg[i15 + 2];
                int i18 = i17 & 1048575;
                Map.Entry entry3 = entry;
                if (i18 != i14) {
                    i16 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
                i13 = 1 << (i17 >>> 20);
                entry2 = entry3;
            }
            while (entry2 != null && this.f8664rgvfuqvkyq.iobyxmoadg(entry2) <= iYlkuphrtab) {
                this.f8664rgvfuqvkyq.btonecajqb(uwvvkdfqfpVar, entry2);
                entry2 = itAgtfadlqog.hasNext() ? (Map.Entry) itAgtfadlqog.next() : null;
            }
            Map.Entry entry4 = entry2;
            int i19 = length;
            long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
            switch (iRibwqtqdhb) {
                case 0:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeDouble(iYlkuphrtab, eablkybsjg(obj, jPkzmftpjix));
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 1:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeFloat(iYlkuphrtab, nufgyqmvbu(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 2:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeInt64(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 3:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeUInt64(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 4:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeInt32(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 5:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeFixed64(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 6:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeFixed32(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 7:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeBool(iYlkuphrtab, wkgbmnqykc(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 8:
                    if ((i13 & i16) != 0) {
                        xrmfcynszj(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar);
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 9:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.ppxfxbqfkf(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i15));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 10:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.zoijcleaow(iYlkuphrtab, (gxszxtbevo) unsafe.getObject(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 11:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeUInt32(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 12:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeEnum(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 13:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeSFixed32(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 14:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeSFixed64(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 15:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeSInt32(iYlkuphrtab, unsafe.getInt(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 16:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.writeSInt64(iYlkuphrtab, unsafe.getLong(obj, jPkzmftpjix));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 17:
                    if ((i13 & i16) != 0) {
                        uwvvkdfqfpVar.eablkybsjg(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i15));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 18:
                    jlmebxxoox.dsvhmnatus(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 19:
                    jlmebxxoox.tzroggbefp(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 20:
                    jlmebxxoox.ulzqkzuiru(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 21:
                    jlmebxxoox.okpsazkaxt(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 22:
                    jlmebxxoox.ntlheqmsrt(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 23:
                    jlmebxxoox.kegysxyocb(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 24:
                    jlmebxxoox.stevsuqkhv(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case C4007z9.F /* 25 */:
                    jlmebxxoox.hkdspvbjdz(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case C4007z9.G /* 26 */:
                    jlmebxxoox.jhduphickx(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar);
                    break;
                case 27:
                    jlmebxxoox.sopmlzcsov(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, gtknphoqwx(i15));
                    break;
                case 28:
                    jlmebxxoox.cllcsxoeiz(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar);
                    break;
                case C4007z9.I /* 29 */:
                    jlmebxxoox.ikoacuggdj(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 30:
                    jlmebxxoox.wypolnanlu(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    jlmebxxoox.crxdokpmqz(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 32:
                    jlmebxxoox.jlmebxxoox(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case 33:
                    jlmebxxoox.ribwqtqdhb(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    jlmebxxoox.vipkmwdibw(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, false);
                    continue;
                    i15 += 3;
                    length = i19;
                    entry = entry4;
                    break;
                case C4007z9.J /* 35 */:
                    jlmebxxoox.dsvhmnatus(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    jlmebxxoox.tzroggbefp(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    jlmebxxoox.ulzqkzuiru(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case C4007z9.K /* 38 */:
                    jlmebxxoox.okpsazkaxt(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    jlmebxxoox.ntlheqmsrt(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 40:
                    jlmebxxoox.kegysxyocb(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    jlmebxxoox.stevsuqkhv(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 42:
                    jlmebxxoox.hkdspvbjdz(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 43:
                    jlmebxxoox.ikoacuggdj(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    jlmebxxoox.wypolnanlu(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    jlmebxxoox.crxdokpmqz(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 46:
                    jlmebxxoox.jlmebxxoox(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 47:
                    jlmebxxoox.ribwqtqdhb(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 48:
                    jlmebxxoox.vipkmwdibw(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, true);
                    break;
                case 49:
                    jlmebxxoox.mbcevpiqjq(ylkuphrtab(i15), (List) unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar, gtknphoqwx(i15));
                    break;
                case 50:
                    jztzpxfvev(uwvvkdfqfpVar, iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), i15);
                    break;
                case 51:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeDouble(iYlkuphrtab, jpowsppfya(obj, jPkzmftpjix));
                    }
                    break;
                case 52:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeFloat(iYlkuphrtab, hkdspvbjdz(obj, jPkzmftpjix));
                    }
                    break;
                case 53:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeInt64(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                    }
                    break;
                case 54:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeUInt64(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                    }
                    break;
                case 55:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeInt32(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                    }
                    break;
                case 56:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeFixed64(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                    }
                    break;
                case 57:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeFixed32(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                    }
                    break;
                case 58:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeBool(iYlkuphrtab, hcddaimhww(obj, jPkzmftpjix));
                    }
                    break;
                case 59:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        xrmfcynszj(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), uwvvkdfqfpVar);
                    }
                    break;
                case 60:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.ppxfxbqfkf(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i15));
                    }
                    break;
                case 61:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.zoijcleaow(iYlkuphrtab, (gxszxtbevo) unsafe.getObject(obj, jPkzmftpjix));
                    }
                    break;
                case 62:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeUInt32(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                    }
                    break;
                case 63:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeEnum(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeSFixed32(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeSFixed64(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                    }
                    break;
                case 66:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeSInt32(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                    }
                    break;
                case 67:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.writeSInt64(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                    }
                    break;
                case 68:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        uwvvkdfqfpVar.eablkybsjg(iYlkuphrtab, unsafe.getObject(obj, jPkzmftpjix), gtknphoqwx(i15));
                    }
                    break;
            }
            i15 += 3;
            length = i19;
            entry = entry4;
        }
        while (entry != null) {
            this.f8664rgvfuqvkyq.btonecajqb(uwvvkdfqfpVar, entry);
            entry = itAgtfadlqog.hasNext() ? (Map.Entry) itAgtfadlqog.next() : null;
        }
        metgxyhuhe(this.f8662ojitshcjhn, obj, uwvvkdfqfpVar);
    }

    private int jlmebxxoox(int i13, int i14) {
        int length = (this.f8659iobyxmoadg.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int iYlkuphrtab = ylkuphrtab(i16);
            if (i13 == iYlkuphrtab) {
                return i16;
            }
            if (i13 < iYlkuphrtab) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    private static double jpowsppfya(Object obj, long j13) {
        return ((Double) metgxyhuhe.pmvmpeiblj(obj, j13)).doubleValue();
    }

    private boolean jyumaefscl(Object obj, Object obj2, int i13) {
        long jStevsuqkhv = stevsuqkhv(i13) & 1048575;
        return metgxyhuhe.cqumvgiudr(obj, jStevsuqkhv) == metgxyhuhe.cqumvgiudr(obj2, jStevsuqkhv);
    }

    private void jztzpxfvev(uwvvkdfqfp uwvvkdfqfpVar, int i13, Object obj, int i14) {
        if (obj != null) {
            uwvvkdfqfpVar.wkgbmnqykc(i13, this.f8665vdvldrhtss.forMapMetadata(btonecajqb(i14)), this.f8665vdvldrhtss.forMapData(obj));
        }
    }

    private static boolean kcexrzcfyt(Object obj, int i13, sopmlzcsov sopmlzcsovVar) {
        return sopmlzcsovVar.isInitialized(metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(i13)));
    }

    private void kegysxyocb(Object obj, long j13, ulzqkzuiru ulzqkzuiruVar, sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) {
        ulzqkzuiruVar.eablkybsjg(this.f8652agtfadlqog.eablkybsjg(obj, j13), sopmlzcsovVar, draadjrbmkVar);
    }

    private static long lereixgezr(Object obj, long j13) {
        return metgxyhuhe.esjtqupxsv(obj, j13);
    }

    static hcddaimhww lmojexxdyd(vipkmwdibw vipkmwdibwVar, hkdspvbjdz hkdspvbjdzVar, esjtqupxsv esjtqupxsvVar, ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, istkbnxepw istkbnxepwVar) {
        throw null;
    }

    private final Object lqeggnwhkg(Object obj, int i13, Object obj2, ikoacuggdj ikoacuggdjVar) {
        ylkuphrtab(i13);
        if (metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(vipkmwdibw(i13))) == null) {
            return obj2;
        }
        dxjokdxxww(i13);
        return obj2;
    }

    private void mbcevpiqjq(Object obj, int i13, ulzqkzuiru ulzqkzuiruVar) {
        if (rgvfuqvkyq(i13)) {
            metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(i13), ulzqkzuiruVar.readStringRequireUtf8());
        } else if (this.f8660lqeggnwhkg) {
            metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(i13), ulzqkzuiruVar.readString());
        } else {
            metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(i13), ulzqkzuiruVar.readBytes());
        }
    }

    private void metgxyhuhe(ikoacuggdj ikoacuggdjVar, Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        ikoacuggdjVar.zdlpuopuiu(ikoacuggdjVar.lqeggnwhkg(obj), uwvvkdfqfpVar);
    }

    private void ntlheqmsrt(Object obj, int i13, ulzqkzuiru ulzqkzuiruVar) {
        if (rgvfuqvkyq(i13)) {
            ulzqkzuiruVar.readStringListRequireUtf8(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(i13)));
        } else {
            ulzqkzuiruVar.readStringList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(i13)));
        }
    }

    private static float nufgyqmvbu(Object obj, long j13) {
        return metgxyhuhe.iwizpuwonk(obj, j13);
    }

    private static int ojitshcjhn(Object obj, long j13) {
        return metgxyhuhe.cqumvgiudr(obj, j13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void okpsazkaxt(Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        Iterator itEablkybsjg;
        Map.Entry entry;
        metgxyhuhe(this.f8662ojitshcjhn, obj, uwvvkdfqfpVar);
        if (this.f8658gxszxtbevo) {
            rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = this.f8664rgvfuqvkyq.ppxfxbqfkf(obj);
            if (rgvfuqvkyqVarPpxfxbqfkf.btonecajqb()) {
                itEablkybsjg = null;
                entry = null;
            } else {
                itEablkybsjg = rgvfuqvkyqVarPpxfxbqfkf.eablkybsjg();
                entry = (Map.Entry) itEablkybsjg.next();
            }
        } else {
            itEablkybsjg = null;
            entry = null;
        }
        for (int length = this.f8659iobyxmoadg.length - 3; length >= 0; length -= 3) {
            int iVipkmwdibw = vipkmwdibw(length);
            int iYlkuphrtab = ylkuphrtab(length);
            while (entry != null && this.f8664rgvfuqvkyq.iobyxmoadg(entry) > iYlkuphrtab) {
                this.f8664rgvfuqvkyq.btonecajqb(uwvvkdfqfpVar, entry);
                entry = itEablkybsjg.hasNext() ? (Map.Entry) itEablkybsjg.next() : null;
            }
            switch (ribwqtqdhb(iVipkmwdibw)) {
                case 0:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeDouble(iYlkuphrtab, eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 1:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeFloat(iYlkuphrtab, nufgyqmvbu(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 2:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeInt64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 3:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeUInt64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 4:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeInt32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 5:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeFixed64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 6:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeFixed32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 7:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeBool(iYlkuphrtab, wkgbmnqykc(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 8:
                    if (vdvldrhtss(obj, length)) {
                        xrmfcynszj(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    }
                    break;
                case 9:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.ppxfxbqfkf(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(length));
                    }
                    break;
                case 10:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.zoijcleaow(iYlkuphrtab, (gxszxtbevo) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 11:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeUInt32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 12:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeEnum(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 13:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeSFixed32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 14:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeSFixed64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 15:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeSInt32(iYlkuphrtab, ojitshcjhn(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 16:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.writeSInt64(iYlkuphrtab, lereixgezr(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 17:
                    if (vdvldrhtss(obj, length)) {
                        uwvvkdfqfpVar.eablkybsjg(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(length));
                    }
                    break;
                case 18:
                    jlmebxxoox.dsvhmnatus(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 19:
                    jlmebxxoox.tzroggbefp(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 20:
                    jlmebxxoox.ulzqkzuiru(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 21:
                    jlmebxxoox.okpsazkaxt(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 22:
                    jlmebxxoox.ntlheqmsrt(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 23:
                    jlmebxxoox.kegysxyocb(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 24:
                    jlmebxxoox.stevsuqkhv(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case C4007z9.F /* 25 */:
                    jlmebxxoox.hkdspvbjdz(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case C4007z9.G /* 26 */:
                    jlmebxxoox.jhduphickx(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    break;
                case 27:
                    jlmebxxoox.sopmlzcsov(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, gtknphoqwx(length));
                    break;
                case 28:
                    jlmebxxoox.cllcsxoeiz(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    break;
                case C4007z9.I /* 29 */:
                    jlmebxxoox.ikoacuggdj(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 30:
                    jlmebxxoox.wypolnanlu(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    jlmebxxoox.crxdokpmqz(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 32:
                    jlmebxxoox.jlmebxxoox(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case 33:
                    jlmebxxoox.ribwqtqdhb(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    jlmebxxoox.vipkmwdibw(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, false);
                    break;
                case C4007z9.J /* 35 */:
                    jlmebxxoox.dsvhmnatus(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    jlmebxxoox.tzroggbefp(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    jlmebxxoox.ulzqkzuiru(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case C4007z9.K /* 38 */:
                    jlmebxxoox.okpsazkaxt(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    jlmebxxoox.ntlheqmsrt(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 40:
                    jlmebxxoox.kegysxyocb(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    jlmebxxoox.stevsuqkhv(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 42:
                    jlmebxxoox.hkdspvbjdz(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 43:
                    jlmebxxoox.ikoacuggdj(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    jlmebxxoox.wypolnanlu(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    jlmebxxoox.crxdokpmqz(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 46:
                    jlmebxxoox.jlmebxxoox(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 47:
                    jlmebxxoox.ribwqtqdhb(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 48:
                    jlmebxxoox.vipkmwdibw(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, true);
                    break;
                case 49:
                    jlmebxxoox.mbcevpiqjq(ylkuphrtab(length), (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar, gtknphoqwx(length));
                    break;
                case 50:
                    jztzpxfvev(uwvvkdfqfpVar, iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), length);
                    break;
                case 51:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeDouble(iYlkuphrtab, jpowsppfya(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 52:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeFloat(iYlkuphrtab, hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 53:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeInt64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 54:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeUInt64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 55:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeInt32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 56:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeFixed64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 57:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeFixed32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 58:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeBool(iYlkuphrtab, hcddaimhww(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 59:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        xrmfcynszj(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), uwvvkdfqfpVar);
                    }
                    break;
                case 60:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.ppxfxbqfkf(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(length));
                    }
                    break;
                case 61:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.zoijcleaow(iYlkuphrtab, (gxszxtbevo) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 62:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeUInt32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 63:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeEnum(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeSFixed32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeSFixed64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 66:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeSInt32(iYlkuphrtab, cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 67:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.writeSInt64(iYlkuphrtab, dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw)));
                    }
                    break;
                case 68:
                    if (iwizpuwonk(obj, iYlkuphrtab, length)) {
                        uwvvkdfqfpVar.eablkybsjg(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), gtknphoqwx(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f8664rgvfuqvkyq.btonecajqb(uwvvkdfqfpVar, entry);
            entry = itEablkybsjg.hasNext() ? (Map.Entry) itEablkybsjg.next() : null;
        }
    }

    private boolean oxmwwwfdhm(Object obj, int i13, int i14, int i15) {
        if (this.f8661nufgyqmvbu) {
            return vdvldrhtss(obj, i13);
        }
        return (i14 & i15) != 0;
    }

    private static long pkzmftpjix(int i13) {
        return i13 & 1048575;
    }

    private void pmvmpeiblj(ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, Object obj, ulzqkzuiru ulzqkzuiruVar, draadjrbmk draadjrbmkVar) {
        Object objLqeggnwhkg = null;
        rgvfuqvkyq rgvfuqvkyqVarWkgbmnqykc = null;
        while (true) {
            try {
                int fieldNumber = ulzqkzuiruVar.getFieldNumber();
                int iWypolnanlu = wypolnanlu(fieldNumber);
                if (iWypolnanlu >= 0) {
                    int iVipkmwdibw = vipkmwdibw(iWypolnanlu);
                    try {
                        switch (ribwqtqdhb(iVipkmwdibw)) {
                            case 0:
                                metgxyhuhe.hcddaimhww(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readDouble());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 1:
                                metgxyhuhe.jpowsppfya(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readFloat());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 2:
                                metgxyhuhe.cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readInt64());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 3:
                                metgxyhuhe.cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readUInt64());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 4:
                                metgxyhuhe.hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readInt32());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 5:
                                metgxyhuhe.cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readFixed64());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 6:
                                metgxyhuhe.hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readFixed32());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 7:
                                metgxyhuhe.yadqdtsiqt(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readBool());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 8:
                                mbcevpiqjq(obj, iVipkmwdibw, ulzqkzuiruVar);
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 9:
                                if (vdvldrhtss(obj, iWypolnanlu)) {
                                    metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), zdlpuopuiu.nufgyqmvbu(metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), ulzqkzuiruVar.iobyxmoadg(gtknphoqwx(iWypolnanlu), draadjrbmkVar)));
                                } else {
                                    metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.iobyxmoadg(gtknphoqwx(iWypolnanlu), draadjrbmkVar));
                                    sopmlzcsov(obj, iWypolnanlu);
                                }
                                break;
                            case 10:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readBytes());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 11:
                                metgxyhuhe.hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readUInt32());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 12:
                                int i13 = ulzqkzuiruVar.readEnum();
                                dxjokdxxww(iWypolnanlu);
                                metgxyhuhe.hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw), i13);
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 13:
                                metgxyhuhe.hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readSFixed32());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 14:
                                metgxyhuhe.cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readSFixed64());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 15:
                                metgxyhuhe.hkdspvbjdz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readSInt32());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 16:
                                metgxyhuhe.cllcsxoeiz(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readSInt64());
                                sopmlzcsov(obj, iWypolnanlu);
                                break;
                            case 17:
                                if (vdvldrhtss(obj, iWypolnanlu)) {
                                    metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), zdlpuopuiu.nufgyqmvbu(metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), ulzqkzuiruVar.ppxfxbqfkf(gtknphoqwx(iWypolnanlu), draadjrbmkVar)));
                                } else {
                                    metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.ppxfxbqfkf(gtknphoqwx(iWypolnanlu), draadjrbmkVar));
                                    sopmlzcsov(obj, iWypolnanlu);
                                }
                                break;
                            case 18:
                                ulzqkzuiruVar.readDoubleList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 19:
                                ulzqkzuiruVar.readFloatList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 20:
                                ulzqkzuiruVar.readInt64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 21:
                                ulzqkzuiruVar.readUInt64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 22:
                                ulzqkzuiruVar.readInt32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 23:
                                ulzqkzuiruVar.readFixed64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 24:
                                ulzqkzuiruVar.readFixed32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case C4007z9.F /* 25 */:
                                ulzqkzuiruVar.readBoolList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case C4007z9.G /* 26 */:
                                ntlheqmsrt(obj, iVipkmwdibw, ulzqkzuiruVar);
                                break;
                            case 27:
                                tzroggbefp(obj, iVipkmwdibw, ulzqkzuiruVar, gtknphoqwx(iWypolnanlu), draadjrbmkVar);
                                break;
                            case 28:
                                ulzqkzuiruVar.readBytesList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case C4007z9.I /* 29 */:
                                ulzqkzuiruVar.readUInt32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 30:
                                List listEablkybsjg = this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw));
                                ulzqkzuiruVar.readEnumList(listEablkybsjg);
                                dxjokdxxww(iWypolnanlu);
                                objLqeggnwhkg = jlmebxxoox.lereixgezr(fieldNumber, listEablkybsjg, null, objLqeggnwhkg, ikoacuggdjVar);
                                break;
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                ulzqkzuiruVar.readSFixed32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 32:
                                ulzqkzuiruVar.readSFixed64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 33:
                                ulzqkzuiruVar.readSInt32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                ulzqkzuiruVar.readSInt64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case C4007z9.J /* 35 */:
                                ulzqkzuiruVar.readDoubleList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                ulzqkzuiruVar.readFloatList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                ulzqkzuiruVar.readInt64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case C4007z9.K /* 38 */:
                                ulzqkzuiruVar.readUInt64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                ulzqkzuiruVar.readInt32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 40:
                                ulzqkzuiruVar.readFixed64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                ulzqkzuiruVar.readFixed32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 42:
                                ulzqkzuiruVar.readBoolList(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 43:
                                ulzqkzuiruVar.readUInt32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                List listEablkybsjg2 = this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw));
                                ulzqkzuiruVar.readEnumList(listEablkybsjg2);
                                dxjokdxxww(iWypolnanlu);
                                objLqeggnwhkg = jlmebxxoox.lereixgezr(fieldNumber, listEablkybsjg2, null, objLqeggnwhkg, ikoacuggdjVar);
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                ulzqkzuiruVar.readSFixed32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 46:
                                ulzqkzuiruVar.readSFixed64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 47:
                                ulzqkzuiruVar.readSInt32List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 48:
                                ulzqkzuiruVar.readSInt64List(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(iVipkmwdibw)));
                                break;
                            case 49:
                                kegysxyocb(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar, gtknphoqwx(iWypolnanlu), draadjrbmkVar);
                                break;
                            case 50:
                                zynmafqrjb(obj, iWypolnanlu, btonecajqb(iWypolnanlu), draadjrbmkVar, ulzqkzuiruVar);
                                break;
                            case 51:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Double.valueOf(ulzqkzuiruVar.readDouble()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 52:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Float.valueOf(ulzqkzuiruVar.readFloat()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 53:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Long.valueOf(ulzqkzuiruVar.readInt64()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 54:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Long.valueOf(ulzqkzuiruVar.readUInt64()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 55:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Integer.valueOf(ulzqkzuiruVar.readInt32()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 56:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Long.valueOf(ulzqkzuiruVar.readFixed64()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 57:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Integer.valueOf(ulzqkzuiruVar.readFixed32()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 58:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Boolean.valueOf(ulzqkzuiruVar.readBool()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 59:
                                mbcevpiqjq(obj, iVipkmwdibw, ulzqkzuiruVar);
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 60:
                                if (iwizpuwonk(obj, fieldNumber, iWypolnanlu)) {
                                    metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), zdlpuopuiu.nufgyqmvbu(metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(iVipkmwdibw)), ulzqkzuiruVar.iobyxmoadg(gtknphoqwx(iWypolnanlu), draadjrbmkVar)));
                                } else {
                                    metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.iobyxmoadg(gtknphoqwx(iWypolnanlu), draadjrbmkVar));
                                    sopmlzcsov(obj, iWypolnanlu);
                                }
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 61:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.readBytes());
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 62:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Integer.valueOf(ulzqkzuiruVar.readUInt32()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 63:
                                int i14 = ulzqkzuiruVar.readEnum();
                                dxjokdxxww(iWypolnanlu);
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Integer.valueOf(i14));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Integer.valueOf(ulzqkzuiruVar.readSFixed32()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Long.valueOf(ulzqkzuiruVar.readSFixed64()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 66:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Integer.valueOf(ulzqkzuiruVar.readSInt32()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 67:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), Long.valueOf(ulzqkzuiruVar.readSInt64()));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            case 68:
                                metgxyhuhe.dsvhmnatus(obj, pkzmftpjix(iVipkmwdibw), ulzqkzuiruVar.ppxfxbqfkf(gtknphoqwx(iWypolnanlu), draadjrbmkVar));
                                crxdokpmqz(obj, fieldNumber, iWypolnanlu);
                                break;
                            default:
                                if (objLqeggnwhkg == null) {
                                    objLqeggnwhkg = ikoacuggdjVar.agtfadlqog();
                                }
                                if (!ikoacuggdjVar.wflxmlrfwp(objLqeggnwhkg, ulzqkzuiruVar)) {
                                    for (int i15 = this.f8657gtknphoqwx; i15 < this.f8654draadjrbmk; i15++) {
                                        objLqeggnwhkg = lqeggnwhkg(obj, this.f8653btonecajqb[i15], objLqeggnwhkg, ikoacuggdjVar);
                                    }
                                    if (objLqeggnwhkg != null) {
                                        ikoacuggdjVar.ojitshcjhn(obj, objLqeggnwhkg);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!ikoacuggdjVar.vdvldrhtss(ulzqkzuiruVar)) {
                            if (objLqeggnwhkg == null) {
                                objLqeggnwhkg = ikoacuggdjVar.gxszxtbevo(obj);
                            }
                            if (!ikoacuggdjVar.wflxmlrfwp(objLqeggnwhkg, ulzqkzuiruVar)) {
                                for (int i16 = this.f8657gtknphoqwx; i16 < this.f8654draadjrbmk; i16++) {
                                    objLqeggnwhkg = lqeggnwhkg(obj, this.f8653btonecajqb[i16], objLqeggnwhkg, ikoacuggdjVar);
                                }
                                if (objLqeggnwhkg != null) {
                                    ikoacuggdjVar.ojitshcjhn(obj, objLqeggnwhkg);
                                    return;
                                }
                                return;
                            }
                        } else if (!ulzqkzuiruVar.skipField()) {
                            for (int i17 = this.f8657gtknphoqwx; i17 < this.f8654draadjrbmk; i17++) {
                                objLqeggnwhkg = lqeggnwhkg(obj, this.f8653btonecajqb[i17], objLqeggnwhkg, ikoacuggdjVar);
                            }
                            if (objLqeggnwhkg != null) {
                                ikoacuggdjVar.ojitshcjhn(obj, objLqeggnwhkg);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        for (int i18 = this.f8657gtknphoqwx; i18 < this.f8654draadjrbmk; i18++) {
                            objLqeggnwhkg = lqeggnwhkg(obj, this.f8653btonecajqb[i18], objLqeggnwhkg, ikoacuggdjVar);
                        }
                        if (objLqeggnwhkg != null) {
                            ikoacuggdjVar.ojitshcjhn(obj, objLqeggnwhkg);
                            return;
                        }
                        return;
                    }
                    Object objZoijcleaow = !this.f8658gxszxtbevo ? null : wflxmlrfwpVar.zoijcleaow(draadjrbmkVar, this.f8656eablkybsjg, fieldNumber);
                    if (objZoijcleaow != null) {
                        if (rgvfuqvkyqVarWkgbmnqykc == null) {
                            rgvfuqvkyqVarWkgbmnqykc = wflxmlrfwpVar.wkgbmnqykc(obj);
                        }
                        objLqeggnwhkg = wflxmlrfwpVar.lqeggnwhkg(ulzqkzuiruVar, objZoijcleaow, draadjrbmkVar, rgvfuqvkyqVarWkgbmnqykc, objLqeggnwhkg, ikoacuggdjVar);
                    } else if (!ikoacuggdjVar.vdvldrhtss(ulzqkzuiruVar)) {
                        if (objLqeggnwhkg == null) {
                            objLqeggnwhkg = ikoacuggdjVar.gxszxtbevo(obj);
                        }
                        if (ikoacuggdjVar.wflxmlrfwp(objLqeggnwhkg, ulzqkzuiruVar)) {
                        }
                    } else if (ulzqkzuiruVar.skipField()) {
                    }
                }
            } catch (Throwable th2) {
                for (int i19 = this.f8657gtknphoqwx; i19 < this.f8654draadjrbmk; i19++) {
                    objLqeggnwhkg = lqeggnwhkg(obj, this.f8653btonecajqb[i19], objLqeggnwhkg, ikoacuggdjVar);
                }
                if (objLqeggnwhkg != null) {
                    ikoacuggdjVar.ojitshcjhn(obj, objLqeggnwhkg);
                }
                throw th2;
            }
        }
        for (int i23 = this.f8657gtknphoqwx; i23 < this.f8654draadjrbmk; i23++) {
            objLqeggnwhkg = lqeggnwhkg(obj, this.f8653btonecajqb[i23], objLqeggnwhkg, ikoacuggdjVar);
        }
        if (objLqeggnwhkg != null) {
            ikoacuggdjVar.ojitshcjhn(obj, objLqeggnwhkg);
        }
    }

    private boolean ppxfxbqfkf(Object obj, Object obj2, int i13) {
        return vdvldrhtss(obj, i13) == vdvldrhtss(obj2, i13);
    }

    private static boolean rgvfuqvkyq(int i13) {
        return (i13 & 536870912) != 0;
    }

    private static int ribwqtqdhb(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    private void sopmlzcsov(Object obj, int i13) {
        if (this.f8661nufgyqmvbu) {
            return;
        }
        int iStevsuqkhv = stevsuqkhv(i13);
        long j13 = iStevsuqkhv & 1048575;
        metgxyhuhe.hkdspvbjdz(obj, j13, metgxyhuhe.cqumvgiudr(obj, j13) | (1 << (iStevsuqkhv >>> 20)));
    }

    private int stevsuqkhv(int i13) {
        return this.f8659iobyxmoadg[i13 + 2];
    }

    private void tzroggbefp(Object obj, int i13, ulzqkzuiru ulzqkzuiruVar, sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) {
        ulzqkzuiruVar.zoijcleaow(this.f8652agtfadlqog.eablkybsjg(obj, pkzmftpjix(i13)), sopmlzcsovVar, draadjrbmkVar);
    }

    private static Field ulzqkzuiru(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private boolean vdvldrhtss(Object obj, int i13) {
        if (!this.f8661nufgyqmvbu) {
            int iStevsuqkhv = stevsuqkhv(i13);
            return (metgxyhuhe.cqumvgiudr(obj, (long) (iStevsuqkhv & 1048575)) & (1 << (iStevsuqkhv >>> 20))) != 0;
        }
        int iVipkmwdibw = vipkmwdibw(i13);
        long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
        switch (ribwqtqdhb(iVipkmwdibw)) {
            case 0:
                return metgxyhuhe.jyumaefscl(obj, jPkzmftpjix) != 0.0d;
            case 1:
                return metgxyhuhe.iwizpuwonk(obj, jPkzmftpjix) != 0.0f;
            case 2:
                return metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) != 0;
            case 3:
                return metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) != 0;
            case 4:
                return metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) != 0;
            case 5:
                return metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) != 0;
            case 6:
                return metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) != 0;
            case 7:
                return metgxyhuhe.rgvfuqvkyq(obj, jPkzmftpjix);
            case 8:
                Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
                if (objPmvmpeiblj instanceof String) {
                    return !((String) objPmvmpeiblj).isEmpty();
                }
                if (objPmvmpeiblj instanceof gxszxtbevo) {
                    return !gxszxtbevo.f8642yggfygwlhe.equals(objPmvmpeiblj);
                }
                throw new IllegalArgumentException();
            case 9:
                return metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix) != null;
            case 10:
                return !gxszxtbevo.f8642yggfygwlhe.equals(metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix));
            case 11:
                return metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) != 0;
            case 12:
                return metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) != 0;
            case 13:
                return metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) != 0;
            case 14:
                return metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) != 0;
            case 15:
                return metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix) != 0;
            case 16:
                return metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix) != 0;
            case 17:
                return metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int vipkmwdibw(int i13) {
        return this.f8659iobyxmoadg[i13 + 1];
    }

    private int wflxmlrfwp(Object obj) {
        int iNufgyqmvbu;
        int iDxjokdxxww;
        int iWypolnanlu;
        int iKegysxyocb;
        Unsafe unsafe = f8650kcexrzcfyt;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f8659iobyxmoadg.length; i14 += 3) {
            int iVipkmwdibw = vipkmwdibw(i14);
            int iRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            int iYlkuphrtab = ylkuphrtab(i14);
            long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
            int i15 = (iRibwqtqdhb < vdvldrhtss.f8842rlfsiqarku.iobyxmoadg() || iRibwqtqdhb > vdvldrhtss.f8861zeieaojujs.iobyxmoadg()) ? 0 : this.f8659iobyxmoadg[i14 + 2] & 1048575;
            switch (iRibwqtqdhb) {
                case 0:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.nufgyqmvbu(iYlkuphrtab, 0.0d);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 1:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.rgvfuqvkyq(iYlkuphrtab, 0.0f);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 2:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.iwizpuwonk(iYlkuphrtab, metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 3:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.tzroggbefp(iYlkuphrtab, metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 4:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.yggfygwlhe(iYlkuphrtab, metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 5:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.agtfadlqog(iYlkuphrtab, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 6:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.draadjrbmk(iYlkuphrtab, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 7:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.ppxfxbqfkf(iYlkuphrtab, true);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 8:
                    if (vdvldrhtss(obj, i14)) {
                        Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
                        iNufgyqmvbu = objPmvmpeiblj instanceof gxszxtbevo ? CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) objPmvmpeiblj) : CodedOutputStream.cllcsxoeiz(iYlkuphrtab, (String) objPmvmpeiblj);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 9:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = jlmebxxoox.ojitshcjhn(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), gtknphoqwx(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 10:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 11:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.stevsuqkhv(iYlkuphrtab, metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 12:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.btonecajqb(iYlkuphrtab, metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 13:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.iozdgvuglv(iYlkuphrtab, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 14:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.wwaezpbzkn(iYlkuphrtab, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 15:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.pkzmftpjix(iYlkuphrtab, metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 16:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.jpowsppfya(iYlkuphrtab, metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 17:
                    if (vdvldrhtss(obj, i14)) {
                        iNufgyqmvbu = CodedOutputStream.oxmwwwfdhm(iYlkuphrtab, (wwaezpbzkn) metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), gtknphoqwx(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 18:
                    iNufgyqmvbu = jlmebxxoox.nufgyqmvbu(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 19:
                    iNufgyqmvbu = jlmebxxoox.gxszxtbevo(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 20:
                    iNufgyqmvbu = jlmebxxoox.wflxmlrfwp(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 21:
                    iNufgyqmvbu = jlmebxxoox.cqumvgiudr(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 22:
                    iNufgyqmvbu = jlmebxxoox.gtknphoqwx(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 23:
                    iNufgyqmvbu = jlmebxxoox.nufgyqmvbu(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 24:
                    iNufgyqmvbu = jlmebxxoox.gxszxtbevo(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.F /* 25 */:
                    iNufgyqmvbu = jlmebxxoox.iobyxmoadg(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.G /* 26 */:
                    iNufgyqmvbu = jlmebxxoox.yggfygwlhe(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix));
                    i13 += iNufgyqmvbu;
                    break;
                case 27:
                    iNufgyqmvbu = jlmebxxoox.rgvfuqvkyq(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), gtknphoqwx(i14));
                    i13 += iNufgyqmvbu;
                    break;
                case 28:
                    iNufgyqmvbu = jlmebxxoox.ppxfxbqfkf(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix));
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.I /* 29 */:
                    iNufgyqmvbu = jlmebxxoox.jyumaefscl(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 30:
                    iNufgyqmvbu = jlmebxxoox.wkgbmnqykc(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iNufgyqmvbu = jlmebxxoox.gxszxtbevo(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 32:
                    iNufgyqmvbu = jlmebxxoox.nufgyqmvbu(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case 33:
                    iNufgyqmvbu = jlmebxxoox.vdvldrhtss(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iNufgyqmvbu = jlmebxxoox.kcexrzcfyt(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), false);
                    i13 += iNufgyqmvbu;
                    break;
                case C4007z9.J /* 35 */:
                    iDxjokdxxww = jlmebxxoox.dxjokdxxww((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iDxjokdxxww = jlmebxxoox.lqeggnwhkg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iDxjokdxxww = jlmebxxoox.agtfadlqog((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case C4007z9.K /* 38 */:
                    iDxjokdxxww = jlmebxxoox.esjtqupxsv((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iDxjokdxxww = jlmebxxoox.draadjrbmk((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 40:
                    iDxjokdxxww = jlmebxxoox.dxjokdxxww((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iDxjokdxxww = jlmebxxoox.lqeggnwhkg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 42:
                    iDxjokdxxww = jlmebxxoox.zoijcleaow((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 43:
                    iDxjokdxxww = jlmebxxoox.iwizpuwonk((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iDxjokdxxww = jlmebxxoox.eablkybsjg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iDxjokdxxww = jlmebxxoox.lqeggnwhkg((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 46:
                    iDxjokdxxww = jlmebxxoox.dxjokdxxww((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 47:
                    iDxjokdxxww = jlmebxxoox.oxmwwwfdhm((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 48:
                    iDxjokdxxww = jlmebxxoox.zdlpuopuiu((List) unsafe.getObject(obj, jPkzmftpjix));
                    if (iDxjokdxxww > 0) {
                        if (this.f8655dxjokdxxww) {
                            unsafe.putInt(obj, i15, iDxjokdxxww);
                        }
                        iWypolnanlu = CodedOutputStream.wypolnanlu(iYlkuphrtab);
                        iKegysxyocb = CodedOutputStream.kegysxyocb(iDxjokdxxww);
                        iNufgyqmvbu = iWypolnanlu + iKegysxyocb + iDxjokdxxww;
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 49:
                    iNufgyqmvbu = jlmebxxoox.btonecajqb(iYlkuphrtab, esjtqupxsv(obj, jPkzmftpjix), gtknphoqwx(i14));
                    i13 += iNufgyqmvbu;
                    break;
                case 50:
                    iNufgyqmvbu = this.f8665vdvldrhtss.getSerializedSize(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), btonecajqb(i14));
                    i13 += iNufgyqmvbu;
                    break;
                case 51:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.nufgyqmvbu(iYlkuphrtab, 0.0d);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 52:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.rgvfuqvkyq(iYlkuphrtab, 0.0f);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 53:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.iwizpuwonk(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 54:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.tzroggbefp(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 55:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.yggfygwlhe(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 56:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.agtfadlqog(iYlkuphrtab, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 57:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.draadjrbmk(iYlkuphrtab, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 58:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.ppxfxbqfkf(iYlkuphrtab, true);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 59:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        Object objPmvmpeiblj2 = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
                        iNufgyqmvbu = objPmvmpeiblj2 instanceof gxszxtbevo ? CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) objPmvmpeiblj2) : CodedOutputStream.cllcsxoeiz(iYlkuphrtab, (String) objPmvmpeiblj2);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 60:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = jlmebxxoox.ojitshcjhn(iYlkuphrtab, metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), gtknphoqwx(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 61:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.gxszxtbevo(iYlkuphrtab, (gxszxtbevo) metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 62:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.stevsuqkhv(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 63:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.btonecajqb(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.iozdgvuglv(iYlkuphrtab, 0);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.wwaezpbzkn(iYlkuphrtab, 0L);
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 66:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.pkzmftpjix(iYlkuphrtab, cllcsxoeiz(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 67:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.jpowsppfya(iYlkuphrtab, dsvhmnatus(obj, jPkzmftpjix));
                        i13 += iNufgyqmvbu;
                    }
                    break;
                case 68:
                    if (iwizpuwonk(obj, iYlkuphrtab, i14)) {
                        iNufgyqmvbu = CodedOutputStream.oxmwwwfdhm(iYlkuphrtab, (wwaezpbzkn) metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix), gtknphoqwx(i14));
                        i13 += iNufgyqmvbu;
                    }
                    break;
            }
        }
        return i13 + agtfadlqog(this.f8662ojitshcjhn, obj);
    }

    private static boolean wkgbmnqykc(Object obj, long j13) {
        return metgxyhuhe.rgvfuqvkyq(obj, j13);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:126:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x0298  */
    /* JADX WARN: Code duplicated, block: B:166:0x034f  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    static hcddaimhww wwaezpbzkn(ntlheqmsrt ntlheqmsrtVar, hkdspvbjdz hkdspvbjdzVar, esjtqupxsv esjtqupxsvVar, ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, istkbnxepw istkbnxepwVar) {
        int i13;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i23;
        char cCharAt4;
        int i24;
        char cCharAt5;
        int i25;
        char cCharAt6;
        int i26;
        char cCharAt7;
        int i27;
        char cCharAt8;
        int i28;
        int i29;
        boolean z13;
        int i33;
        int i34;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i35;
        int i36;
        int i37;
        Field fieldUlzqkzuiru;
        int i38;
        char cCharAt9;
        int i39;
        int i43;
        int i44;
        Object obj;
        Field fieldUlzqkzuiru2;
        int i45;
        Object obj2;
        Field fieldUlzqkzuiru3;
        int i46;
        char cCharAt10;
        int i47;
        char cCharAt11;
        int i48;
        char cCharAt12;
        int i49;
        char cCharAt13;
        char cCharAt14;
        int i53 = 0;
        boolean z14 = ntlheqmsrtVar.getSyntax() == kegysxyocb.PROTO3;
        String strZoijcleaow = ntlheqmsrtVar.zoijcleaow();
        int length = strZoijcleaow.length();
        int iCharAt4 = strZoijcleaow.charAt(0);
        if (iCharAt4 >= 55296) {
            int i54 = iCharAt4 & 8191;
            int i55 = 1;
            int i56 = 13;
            while (true) {
                i13 = i55 + 1;
                cCharAt14 = strZoijcleaow.charAt(i55);
                if (cCharAt14 < 55296) {
                    break;
                }
                i54 |= (cCharAt14 & 8191) << i56;
                i56 += 13;
                i55 = i13;
            }
            iCharAt4 = i54 | (cCharAt14 << i56);
        } else {
            i13 = 1;
        }
        int i57 = i13 + 1;
        int iCharAt5 = strZoijcleaow.charAt(i13);
        if (iCharAt5 >= 55296) {
            int i58 = iCharAt5 & 8191;
            int i59 = 13;
            while (true) {
                i49 = i57 + 1;
                cCharAt13 = strZoijcleaow.charAt(i57);
                if (cCharAt13 < 55296) {
                    break;
                }
                i58 |= (cCharAt13 & 8191) << i59;
                i59 += 13;
                i57 = i49;
            }
            iCharAt5 = i58 | (cCharAt13 << i59);
            i57 = i49;
        }
        if (iCharAt5 == 0) {
            i16 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            iCharAt3 = 0;
            iArr = f8651oxmwwwfdhm;
            i15 = 0;
        } else {
            int i63 = i57 + 1;
            int iCharAt6 = strZoijcleaow.charAt(i57);
            if (iCharAt6 >= 55296) {
                int i64 = iCharAt6 & 8191;
                int i65 = 13;
                while (true) {
                    i27 = i63 + 1;
                    cCharAt8 = strZoijcleaow.charAt(i63);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt8 & 8191) << i65;
                    i65 += 13;
                    i63 = i27;
                }
                iCharAt6 = i64 | (cCharAt8 << i65);
                i63 = i27;
            }
            int i66 = i63 + 1;
            int iCharAt7 = strZoijcleaow.charAt(i63);
            if (iCharAt7 >= 55296) {
                int i67 = iCharAt7 & 8191;
                int i68 = 13;
                while (true) {
                    i26 = i66 + 1;
                    cCharAt7 = strZoijcleaow.charAt(i66);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt7 & 8191) << i68;
                    i68 += 13;
                    i66 = i26;
                }
                iCharAt7 = i67 | (cCharAt7 << i68);
                i66 = i26;
            }
            int i69 = i66 + 1;
            int iCharAt8 = strZoijcleaow.charAt(i66);
            if (iCharAt8 >= 55296) {
                int i73 = iCharAt8 & 8191;
                int i74 = 13;
                while (true) {
                    i25 = i69 + 1;
                    cCharAt6 = strZoijcleaow.charAt(i69);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt6 & 8191) << i74;
                    i74 += 13;
                    i69 = i25;
                }
                iCharAt8 = i73 | (cCharAt6 << i74);
                i69 = i25;
            }
            int i75 = i69 + 1;
            iCharAt = strZoijcleaow.charAt(i69);
            if (iCharAt >= 55296) {
                int i76 = iCharAt & 8191;
                int i77 = 13;
                while (true) {
                    i24 = i75 + 1;
                    cCharAt5 = strZoijcleaow.charAt(i75);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt5 & 8191) << i77;
                    i77 += 13;
                    i75 = i24;
                }
                iCharAt = i76 | (cCharAt5 << i77);
                i75 = i24;
            }
            int i78 = i75 + 1;
            iCharAt2 = strZoijcleaow.charAt(i75);
            if (iCharAt2 >= 55296) {
                int i79 = iCharAt2 & 8191;
                int i83 = 13;
                while (true) {
                    i23 = i78 + 1;
                    cCharAt4 = strZoijcleaow.charAt(i78);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt4 & 8191) << i83;
                    i83 += 13;
                    i78 = i23;
                }
                iCharAt2 = i79 | (cCharAt4 << i83);
                i78 = i23;
            }
            int i84 = i78 + 1;
            int iCharAt9 = strZoijcleaow.charAt(i78);
            if (iCharAt9 >= 55296) {
                int i85 = iCharAt9 & 8191;
                int i86 = 13;
                while (true) {
                    i19 = i84 + 1;
                    cCharAt3 = strZoijcleaow.charAt(i84);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt3 & 8191) << i86;
                    i86 += 13;
                    i84 = i19;
                }
                iCharAt9 = i85 | (cCharAt3 << i86);
                i84 = i19;
            }
            int i87 = i84 + 1;
            int iCharAt10 = strZoijcleaow.charAt(i84);
            if (iCharAt10 >= 55296) {
                int i88 = iCharAt10 & 8191;
                int i89 = 13;
                while (true) {
                    i18 = i87 + 1;
                    cCharAt2 = strZoijcleaow.charAt(i87);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i88 |= (cCharAt2 & 8191) << i89;
                    i89 += 13;
                    i87 = i18;
                }
                iCharAt10 = i88 | (cCharAt2 << i89);
                i87 = i18;
            }
            int i93 = i87 + 1;
            iCharAt3 = strZoijcleaow.charAt(i87);
            if (iCharAt3 >= 55296) {
                int i94 = iCharAt3 & 8191;
                int i95 = i93;
                int i96 = 13;
                while (true) {
                    i17 = i95 + 1;
                    cCharAt = strZoijcleaow.charAt(i95);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i94 |= (cCharAt & 8191) << i96;
                    i96 += 13;
                    i95 = i17;
                }
                iCharAt3 = i94 | (cCharAt << i96);
                i93 = i17;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt9 + iCharAt10];
            i14 = (iCharAt6 * 2) + iCharAt7;
            i15 = iCharAt6;
            i57 = i93;
            int i97 = iCharAt9;
            iArr = iArr2;
            i53 = iCharAt8;
            i16 = i97;
        }
        Unsafe unsafe = f8650kcexrzcfyt;
        Object[] objArrIobyxmoadg = ntlheqmsrtVar.iobyxmoadg();
        Class<?> cls = ntlheqmsrtVar.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 * 2];
        int i98 = iCharAt3 + i16;
        int i99 = iCharAt3;
        int i100 = i98;
        int i101 = 0;
        int i102 = 0;
        while (i57 < length) {
            int i103 = i57 + 1;
            int iCharAt11 = strZoijcleaow.charAt(i57);
            int i104 = length;
            if (iCharAt11 >= 55296) {
                int i105 = iCharAt11 & 8191;
                int i106 = i103;
                int i107 = 13;
                while (true) {
                    i48 = i106 + 1;
                    cCharAt12 = strZoijcleaow.charAt(i106);
                    i28 = iCharAt3;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i105 |= (cCharAt12 & 8191) << i107;
                    i107 += 13;
                    i106 = i48;
                    iCharAt3 = i28;
                }
                iCharAt11 = i105 | (cCharAt12 << i107);
                i29 = i48;
            } else {
                i28 = iCharAt3;
                i29 = i103;
            }
            int i108 = i29 + 1;
            int iCharAt12 = strZoijcleaow.charAt(i29);
            if (iCharAt12 >= 55296) {
                int i109 = iCharAt12 & 8191;
                int i110 = i108;
                int i111 = 13;
                while (true) {
                    i47 = i110 + 1;
                    cCharAt11 = strZoijcleaow.charAt(i110);
                    z13 = z14;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i109 |= (cCharAt11 & 8191) << i111;
                    i111 += 13;
                    i110 = i47;
                    z14 = z13;
                }
                iCharAt12 = i109 | (cCharAt11 << i111);
                i33 = i47;
            } else {
                z13 = z14;
                i33 = i108;
            }
            int i112 = iCharAt12 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i113 = iCharAt;
            if ((iCharAt12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i101] = i102;
                i101++;
            }
            int i114 = i101;
            if (i112 >= 51) {
                int i115 = i33 + 1;
                int iCharAt13 = strZoijcleaow.charAt(i33);
                char c13 = 55296;
                if (iCharAt13 >= 55296) {
                    int i116 = iCharAt13 & 8191;
                    int i117 = 13;
                    while (true) {
                        i46 = i115 + 1;
                        cCharAt10 = strZoijcleaow.charAt(i115);
                        if (cCharAt10 < c13) {
                            break;
                        }
                        i116 |= (cCharAt10 & 8191) << i117;
                        i117 += 13;
                        i115 = i46;
                        c13 = 55296;
                    }
                    iCharAt13 = i116 | (cCharAt10 << i117);
                    i115 = i46;
                }
                int i118 = i112 - 51;
                int i119 = i115;
                if (i118 == 9 || i118 == 17) {
                    i43 = i14 + 1;
                    objArr[((i102 / 3) * 2) + 1] = objArrIobyxmoadg[i14];
                } else {
                    if (i118 == 12 && (iCharAt4 & 1) == 1) {
                        i43 = i14 + 1;
                        objArr[((i102 / 3) * 2) + 1] = objArrIobyxmoadg[i14];
                    }
                    i44 = iCharAt13 * 2;
                    obj = objArrIobyxmoadg[i44];
                    if (obj instanceof Field) {
                        fieldUlzqkzuiru2 = (Field) obj;
                    } else {
                        fieldUlzqkzuiru2 = ulzqkzuiru(cls, (String) obj);
                        objArrIobyxmoadg[i44] = fieldUlzqkzuiru2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru2);
                    i45 = i44 + 1;
                    obj2 = objArrIobyxmoadg[i45];
                    if (obj2 instanceof Field) {
                        fieldUlzqkzuiru3 = (Field) obj2;
                    } else {
                        fieldUlzqkzuiru3 = ulzqkzuiru(cls, (String) obj2);
                        objArrIobyxmoadg[i45] = fieldUlzqkzuiru3;
                    }
                    i34 = i53;
                    iCharAt4 = iCharAt4;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru3);
                    i36 = iObjectFieldOffset3;
                    i37 = i14;
                    i57 = i119;
                    i35 = 0;
                    cls = cls;
                }
                i14 = i43;
                i44 = iCharAt13 * 2;
                obj = objArrIobyxmoadg[i44];
                if (obj instanceof Field) {
                    fieldUlzqkzuiru2 = (Field) obj;
                } else {
                    fieldUlzqkzuiru2 = ulzqkzuiru(cls, (String) obj);
                    objArrIobyxmoadg[i44] = fieldUlzqkzuiru2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru2);
                i45 = i44 + 1;
                obj2 = objArrIobyxmoadg[i45];
                if (obj2 instanceof Field) {
                    fieldUlzqkzuiru3 = (Field) obj2;
                } else {
                    fieldUlzqkzuiru3 = ulzqkzuiru(cls, (String) obj2);
                    objArrIobyxmoadg[i45] = fieldUlzqkzuiru3;
                }
                i34 = i53;
                iCharAt4 = iCharAt4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru3);
                i36 = iObjectFieldOffset4;
                i37 = i14;
                i57 = i119;
                i35 = 0;
                cls = cls;
            } else {
                int i120 = i14 + 1;
                Field fieldUlzqkzuiru4 = ulzqkzuiru(cls, (String) objArrIobyxmoadg[i14]);
                if (i112 == 9 || i112 == 17) {
                    i34 = i53;
                    objArr[((i102 / 3) * 2) + 1] = fieldUlzqkzuiru4.getType();
                } else {
                    if (i112 == 27 || i112 == 49) {
                        i34 = i53;
                        i39 = i14 + 2;
                        objArr[((i102 / 3) * 2) + 1] = objArrIobyxmoadg[i120];
                    } else if (i112 == 12 || i112 == 30 || i112 == 44) {
                        i34 = i53;
                        if ((iCharAt4 & 1) == 1) {
                            i39 = i14 + 2;
                            objArr[((i102 / 3) * 2) + 1] = objArrIobyxmoadg[i120];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru4);
                        if ((iCharAt4 & 1) == 1 || i112 > 17) {
                            iObjectFieldOffset2 = 0;
                            i35 = 0;
                        } else {
                            int i121 = i33 + 1;
                            int iCharAt14 = strZoijcleaow.charAt(i33);
                            if (iCharAt14 >= 55296) {
                                int i122 = iCharAt14 & 8191;
                                int i123 = 13;
                                while (true) {
                                    i38 = i121 + 1;
                                    cCharAt9 = strZoijcleaow.charAt(i121);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i122 |= (cCharAt9 & 8191) << i123;
                                    i123 += 13;
                                    i121 = i38;
                                }
                                iCharAt14 = i122 | (cCharAt9 << i123);
                                i121 = i38;
                            }
                            int i124 = (i15 * 2) + (iCharAt14 / 32);
                            Object obj3 = objArrIobyxmoadg[i124];
                            if (obj3 instanceof Field) {
                                fieldUlzqkzuiru = (Field) obj3;
                            } else {
                                fieldUlzqkzuiru = ulzqkzuiru(cls, (String) obj3);
                                objArrIobyxmoadg[i124] = fieldUlzqkzuiru;
                            }
                            i33 = i121;
                            i35 = iCharAt14 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru);
                        }
                        if (i112 >= 18 && i112 <= 49) {
                            iArr[i100] = iObjectFieldOffset;
                            i100++;
                        }
                        i57 = i33;
                        int i125 = i120;
                        i36 = iObjectFieldOffset;
                        i37 = i125;
                    } else if (i112 == 50) {
                        int i126 = i99 + 1;
                        iArr[i99] = i102;
                        int i127 = (i102 / 3) * 2;
                        int i128 = i14 + 2;
                        objArr[i127] = objArrIobyxmoadg[i120];
                        if ((iCharAt12 & 2048) != 0) {
                            i120 = i14 + 3;
                            objArr[i127 + 1] = objArrIobyxmoadg[i128];
                            i34 = i53;
                            i99 = i126;
                        } else {
                            i99 = i126;
                            i120 = i128;
                            i34 = i53;
                        }
                    } else {
                        i34 = i53;
                    }
                    i120 = i39;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru4);
                    if ((iCharAt4 & 1) == 1) {
                        iObjectFieldOffset2 = 0;
                        i35 = 0;
                    } else {
                        iObjectFieldOffset2 = 0;
                        i35 = 0;
                    }
                    if (i112 >= 18) {
                        iArr[i100] = iObjectFieldOffset;
                        i100++;
                    }
                    i57 = i33;
                    int i129 = i120;
                    i36 = iObjectFieldOffset;
                    i37 = i129;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldUlzqkzuiru4);
                if ((iCharAt4 & 1) == 1) {
                    iObjectFieldOffset2 = 0;
                    i35 = 0;
                } else {
                    iObjectFieldOffset2 = 0;
                    i35 = 0;
                }
                if (i112 >= 18) {
                    iArr[i100] = iObjectFieldOffset;
                    i100++;
                }
                i57 = i33;
                int i1210 = i120;
                i36 = iObjectFieldOffset;
                i37 = i1210;
            }
            int i130 = i102 + 1;
            iArr3[i102] = iCharAt11;
            int i131 = i102 + 2;
            iArr3[i130] = ((iCharAt12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((iCharAt12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | (i112 << 20) | i36;
            i102 += 3;
            iArr3[i131] = (i35 << 20) | iObjectFieldOffset2;
            i14 = i37;
            cls = cls;
            iArr3 = iArr3;
            iCharAt4 = iCharAt4;
            iCharAt = i113;
            length = i104;
            i53 = i34;
            iCharAt3 = i28;
            z14 = z13;
            i101 = i114;
        }
        return new hcddaimhww(iArr3, objArr, i53, iCharAt, ntlheqmsrtVar.getDefaultInstance(), z14, false, iArr, iCharAt3, i98, hkdspvbjdzVar, esjtqupxsvVar, ikoacuggdjVar, wflxmlrfwpVar, istkbnxepwVar);
    }

    private int wypolnanlu(int i13) {
        if (i13 < this.f8663ppxfxbqfkf || i13 > this.f8667wkgbmnqykc) {
            return -1;
        }
        return jlmebxxoox(i13, 0);
    }

    private void xrmfcynszj(int i13, Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        if (obj instanceof String) {
            uwvvkdfqfpVar.writeString(i13, (String) obj);
        } else {
            uwvvkdfqfpVar.zoijcleaow(i13, (gxszxtbevo) obj);
        }
    }

    private void yadqdtsiqt(Object obj, Object obj2, int i13) {
        int iVipkmwdibw = vipkmwdibw(i13);
        long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
        int iYlkuphrtab = ylkuphrtab(i13);
        switch (ribwqtqdhb(iVipkmwdibw)) {
            case 0:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hcddaimhww(obj, jPkzmftpjix, metgxyhuhe.jyumaefscl(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 1:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.jpowsppfya(obj, jPkzmftpjix, metgxyhuhe.iwizpuwonk(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 2:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.cllcsxoeiz(obj, jPkzmftpjix, metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 3:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.cllcsxoeiz(obj, jPkzmftpjix, metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 4:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hkdspvbjdz(obj, jPkzmftpjix, metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 5:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.cllcsxoeiz(obj, jPkzmftpjix, metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 6:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hkdspvbjdz(obj, jPkzmftpjix, metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 7:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.yadqdtsiqt(obj, jPkzmftpjix, metgxyhuhe.rgvfuqvkyq(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 8:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 9:
                istkbnxepw(obj, obj2, i13);
                break;
            case 10:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 11:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hkdspvbjdz(obj, jPkzmftpjix, metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 12:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hkdspvbjdz(obj, jPkzmftpjix, metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 13:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hkdspvbjdz(obj, jPkzmftpjix, metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 14:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.cllcsxoeiz(obj, jPkzmftpjix, metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 15:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.hkdspvbjdz(obj, jPkzmftpjix, metgxyhuhe.cqumvgiudr(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 16:
                if (vdvldrhtss(obj2, i13)) {
                    metgxyhuhe.cllcsxoeiz(obj, jPkzmftpjix, metgxyhuhe.esjtqupxsv(obj2, jPkzmftpjix));
                    sopmlzcsov(obj, i13);
                }
                break;
            case 17:
                istkbnxepw(obj, obj2, i13);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
            case C4007z9.I /* 29 */:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f8652agtfadlqog.wkgbmnqykc(obj, obj2, jPkzmftpjix);
                break;
            case 50:
                jlmebxxoox.yadqdtsiqt(this.f8665vdvldrhtss, obj, obj2, jPkzmftpjix);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (iwizpuwonk(obj2, iYlkuphrtab, i13)) {
                    metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
                    crxdokpmqz(obj, iYlkuphrtab, i13);
                }
                break;
            case 60:
                cdpycssgdh(obj, obj2, i13);
                break;
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
                if (iwizpuwonk(obj2, iYlkuphrtab, i13)) {
                    metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, metgxyhuhe.pmvmpeiblj(obj2, jPkzmftpjix));
                    crxdokpmqz(obj, iYlkuphrtab, i13);
                }
                break;
            case 68:
                cdpycssgdh(obj, obj2, i13);
                break;
        }
    }

    private boolean yggfygwlhe(Object obj, int i13, int i14) {
        Map mapForMapData = this.f8665vdvldrhtss.forMapData(metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(i13)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f8665vdvldrhtss.forMapMetadata(btonecajqb(i14)).f8772ppxfxbqfkf.iobyxmoadg() != czzsidtyhn.ppxfxbqfkf.MESSAGE) {
            return true;
        }
        sopmlzcsov sopmlzcsovVarPpxfxbqfkf = null;
        for (Object obj2 : mapForMapData.values()) {
            if (sopmlzcsovVarPpxfxbqfkf == null) {
                sopmlzcsovVarPpxfxbqfkf = tzroggbefp.iobyxmoadg().ppxfxbqfkf(obj2.getClass());
            }
            if (!sopmlzcsovVarPpxfxbqfkf.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private int ylkuphrtab(int i13) {
        return this.f8659iobyxmoadg[i13];
    }

    private boolean zdlpuopuiu(Object obj, int i13, int i14) {
        List list = (List) metgxyhuhe.pmvmpeiblj(obj, pkzmftpjix(i13));
        if (list.isEmpty()) {
            return true;
        }
        sopmlzcsov sopmlzcsovVarGtknphoqwx = gtknphoqwx(i14);
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (!sopmlzcsovVarGtknphoqwx.isInitialized(list.get(i15))) {
                return false;
            }
        }
        return true;
    }

    private final void zynmafqrjb(Object obj, int i13, Object obj2, draadjrbmk draadjrbmkVar, ulzqkzuiru ulzqkzuiruVar) {
        long jPkzmftpjix = pkzmftpjix(vipkmwdibw(i13));
        Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
        if (objPmvmpeiblj == null) {
            objPmvmpeiblj = this.f8665vdvldrhtss.newMapField(obj2);
            metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, objPmvmpeiblj);
        } else if (this.f8665vdvldrhtss.isImmutable(objPmvmpeiblj)) {
            Object objNewMapField = this.f8665vdvldrhtss.newMapField(obj2);
            this.f8665vdvldrhtss.mergeFrom(objNewMapField, objPmvmpeiblj);
            metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, objNewMapField);
            objPmvmpeiblj = objNewMapField;
        }
        ulzqkzuiruVar.wkgbmnqykc(this.f8665vdvldrhtss.forMutableMapData(objPmvmpeiblj), this.f8665vdvldrhtss.forMapMetadata(obj2), draadjrbmkVar);
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public boolean equals(Object obj, Object obj2) {
        int length = this.f8659iobyxmoadg.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            if (!gxszxtbevo(obj, obj2, i13)) {
                return false;
            }
        }
        if (!this.f8662ojitshcjhn.lqeggnwhkg(obj).equals(this.f8662ojitshcjhn.lqeggnwhkg(obj2))) {
            return false;
        }
        if (this.f8658gxszxtbevo) {
            return this.f8664rgvfuqvkyq.ppxfxbqfkf(obj).equals(this.f8664rgvfuqvkyq.ppxfxbqfkf(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public int getSerializedSize(Object obj) {
        return this.f8661nufgyqmvbu ? wflxmlrfwp(obj) : draadjrbmk(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public int hashCode(Object obj) {
        int i13;
        int iGxszxtbevo;
        int length = this.f8659iobyxmoadg.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iVipkmwdibw = vipkmwdibw(i15);
            int iYlkuphrtab = ylkuphrtab(i15);
            long jPkzmftpjix = pkzmftpjix(iVipkmwdibw);
            int iHashCode = 37;
            switch (ribwqtqdhb(iVipkmwdibw)) {
                case 0:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.gxszxtbevo(Double.doubleToLongBits(metgxyhuhe.jyumaefscl(obj, jPkzmftpjix)));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 1:
                    i13 = i14 * 53;
                    iGxszxtbevo = Float.floatToIntBits(metgxyhuhe.iwizpuwonk(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 2:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.gxszxtbevo(metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 3:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.gxszxtbevo(metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 5:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.gxszxtbevo(metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 7:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.ppxfxbqfkf(metgxyhuhe.rgvfuqvkyq(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 8:
                    i13 = i14 * 53;
                    iGxszxtbevo = ((String) metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix)).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 9:
                    Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
                    if (objPmvmpeiblj != null) {
                        iHashCode = objPmvmpeiblj.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 14:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.gxszxtbevo(metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.cqumvgiudr(obj, jPkzmftpjix);
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 16:
                    i13 = i14 * 53;
                    iGxszxtbevo = zdlpuopuiu.gxszxtbevo(metgxyhuhe.esjtqupxsv(obj, jPkzmftpjix));
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 17:
                    Object objPmvmpeiblj2 = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
                    if (objPmvmpeiblj2 != null) {
                        iHashCode = objPmvmpeiblj2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                case 28:
                case C4007z9.I /* 29 */:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case C4007z9.J /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case C4007z9.K /* 38 */:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 50:
                    i13 = i14 * 53;
                    iGxszxtbevo = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix).hashCode();
                    i14 = i13 + iGxszxtbevo;
                    break;
                case 51:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.gxszxtbevo(Double.doubleToLongBits(jpowsppfya(obj, jPkzmftpjix)));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 52:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = Float.floatToIntBits(hkdspvbjdz(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 53:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.gxszxtbevo(dsvhmnatus(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 54:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.gxszxtbevo(dsvhmnatus(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 55:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = cllcsxoeiz(obj, jPkzmftpjix);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 56:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.gxszxtbevo(dsvhmnatus(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 57:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = cllcsxoeiz(obj, jPkzmftpjix);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 58:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.ppxfxbqfkf(hcddaimhww(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 59:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = ((String) metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix)).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 60:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 61:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 62:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = cllcsxoeiz(obj, jPkzmftpjix);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 63:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = cllcsxoeiz(obj, jPkzmftpjix);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = cllcsxoeiz(obj, jPkzmftpjix);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.gxszxtbevo(dsvhmnatus(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 66:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = cllcsxoeiz(obj, jPkzmftpjix);
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 67:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = zdlpuopuiu.gxszxtbevo(dsvhmnatus(obj, jPkzmftpjix));
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
                case 68:
                    if (iwizpuwonk(obj, iYlkuphrtab, i15)) {
                        i13 = i14 * 53;
                        iGxszxtbevo = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix).hashCode();
                        i14 = i13 + iGxszxtbevo;
                    }
                    break;
            }
        }
        int iHashCode2 = (i14 * 53) + this.f8662ojitshcjhn.lqeggnwhkg(obj).hashCode();
        return this.f8658gxszxtbevo ? (iHashCode2 * 53) + this.f8664rgvfuqvkyq.ppxfxbqfkf(obj).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void iobyxmoadg(Object obj, ulzqkzuiru ulzqkzuiruVar, draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.getClass();
        pmvmpeiblj(this.f8662ojitshcjhn, this.f8664rgvfuqvkyq, obj, ulzqkzuiruVar, draadjrbmkVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0090 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public final boolean isInitialized(Object obj) {
        int i13;
        int i14 = -1;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f8657gtknphoqwx; i16++) {
            int i17 = this.f8653btonecajqb[i16];
            int iYlkuphrtab = ylkuphrtab(i17);
            int iVipkmwdibw = vipkmwdibw(i17);
            if (this.f8661nufgyqmvbu) {
                i13 = 0;
            } else {
                int i18 = this.f8659iobyxmoadg[i17 + 2];
                int i19 = 1048575 & i18;
                i13 = 1 << (i18 >>> 20);
                if (i19 != i14) {
                    i15 = f8650kcexrzcfyt.getInt(obj, i19);
                    i14 = i19;
                }
            }
            if (cqumvgiudr(iVipkmwdibw) && !oxmwwwfdhm(obj, i17, i15, i13)) {
                return false;
            }
            int iRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            if (iRibwqtqdhb == 9 || iRibwqtqdhb == 17) {
                if (oxmwwwfdhm(obj, i17, i15, i13) && !kcexrzcfyt(obj, iVipkmwdibw, gtknphoqwx(i17))) {
                    return false;
                }
            } else if (iRibwqtqdhb == 27) {
                if (!zdlpuopuiu(obj, iVipkmwdibw, i17)) {
                    return false;
                }
            } else if (iRibwqtqdhb == 60 || iRibwqtqdhb == 68) {
                if (iwizpuwonk(obj, iYlkuphrtab, i17) && !kcexrzcfyt(obj, iVipkmwdibw, gtknphoqwx(i17))) {
                    return false;
                }
            } else if (iRibwqtqdhb != 49) {
                if (iRibwqtqdhb == 50 && !yggfygwlhe(obj, iVipkmwdibw, i17)) {
                    return false;
                }
            } else if (!zdlpuopuiu(obj, iVipkmwdibw, i17)) {
                return false;
            }
        }
        return !this.f8658gxszxtbevo || this.f8664rgvfuqvkyq.ppxfxbqfkf(obj).gtknphoqwx();
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void makeImmutable(Object obj) {
        int i13;
        int i14 = this.f8657gtknphoqwx;
        while (true) {
            i13 = this.f8654draadjrbmk;
            if (i14 >= i13) {
                break;
            }
            long jPkzmftpjix = pkzmftpjix(vipkmwdibw(this.f8653btonecajqb[i14]));
            Object objPmvmpeiblj = metgxyhuhe.pmvmpeiblj(obj, jPkzmftpjix);
            if (objPmvmpeiblj != null) {
                metgxyhuhe.dsvhmnatus(obj, jPkzmftpjix, this.f8665vdvldrhtss.toImmutable(objPmvmpeiblj));
            }
            i14++;
        }
        int length = this.f8653btonecajqb.length;
        while (i13 < length) {
            this.f8652agtfadlqog.ppxfxbqfkf(obj, this.f8653btonecajqb[i13]);
            i13++;
        }
        this.f8662ojitshcjhn.btonecajqb(obj);
        if (this.f8658gxszxtbevo) {
            this.f8664rgvfuqvkyq.gxszxtbevo(obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void mergeFrom(Object obj, Object obj2) {
        obj2.getClass();
        for (int i13 = 0; i13 < this.f8659iobyxmoadg.length; i13 += 3) {
            yadqdtsiqt(obj, obj2, i13);
        }
        if (this.f8661nufgyqmvbu) {
            return;
        }
        jlmebxxoox.iozdgvuglv(this.f8662ojitshcjhn, obj, obj2);
        if (this.f8658gxszxtbevo) {
            jlmebxxoox.cdpycssgdh(this.f8664rgvfuqvkyq, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public Object newInstance() {
        return this.f8666wflxmlrfwp.newInstance(this.f8656eablkybsjg);
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void zoijcleaow(Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        if (uwvvkdfqfpVar.fieldOrder() == uwvvkdfqfp.iobyxmoadg.DESCENDING) {
            okpsazkaxt(obj, uwvvkdfqfpVar);
        } else if (this.f8661nufgyqmvbu) {
            ikoacuggdj(obj, uwvvkdfqfpVar);
        } else {
            jhduphickx(obj, uwvvkdfqfpVar);
        }
    }
}

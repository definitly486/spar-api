package h8;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final String f39780yggfygwlhe = "eablkybsjg";

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f39781agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int[] f39782btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private ppxfxbqfkf f39783draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private byte[] f39784dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private byte[] f39785eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f39786gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private short[] f39787gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int[] f39788iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private Boolean f39789kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private byte[] f39790lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private byte[] f39791nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f39792ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f39793oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg.InterfaceC0923iobyxmoadg f39794ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f39795rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f39796vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Bitmap f39797wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ByteBuffer f39798wkgbmnqykc;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Bitmap.Config f39799zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f39800zoijcleaow;

    public eablkybsjg(iobyxmoadg.InterfaceC0923iobyxmoadg interfaceC0923iobyxmoadg, ppxfxbqfkf ppxfxbqfkfVar, ByteBuffer byteBuffer, int i13) {
        this(interfaceC0923iobyxmoadg);
        vdvldrhtss(ppxfxbqfkfVar, byteBuffer, i13);
    }

    private Bitmap agtfadlqog() {
        Boolean bool = this.f39789kcexrzcfyt;
        Bitmap bitmapPpxfxbqfkf = this.f39794ppxfxbqfkf.ppxfxbqfkf(this.f39793oxmwwwfdhm, this.f39796vdvldrhtss, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f39799zdlpuopuiu);
        bitmapPpxfxbqfkf.setHasAlpha(true);
        return bitmapPpxfxbqfkf;
    }

    private void btonecajqb(zoijcleaow zoijcleaowVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr = this.f39782btonecajqb;
        int i18 = zoijcleaowVar.f39827wkgbmnqykc;
        int i19 = this.f39795rgvfuqvkyq;
        int i23 = i18 / i19;
        int i24 = zoijcleaowVar.f39828zoijcleaow / i19;
        int i25 = zoijcleaowVar.f39826ppxfxbqfkf / i19;
        int i26 = zoijcleaowVar.f39823iobyxmoadg / i19;
        boolean z13 = this.f39786gtknphoqwx == 0;
        int i27 = this.f39793oxmwwwfdhm;
        int i28 = this.f39796vdvldrhtss;
        byte[] bArr = this.f39784dxjokdxxww;
        int[] iArr2 = this.f39788iobyxmoadg;
        Boolean bool = this.f39789kcexrzcfyt;
        int i29 = 8;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1;
        while (i34 < i23) {
            Boolean bool2 = bool;
            if (zoijcleaowVar.f39820eablkybsjg) {
                if (i33 >= i23) {
                    int i36 = i35 + 1;
                    i13 = i23;
                    if (i36 == 2) {
                        i33 = 4;
                    } else if (i36 == 3) {
                        i29 = 4;
                        i35 = i36;
                        i33 = 2;
                    } else if (i36 == 4) {
                        i35 = i36;
                        i33 = 1;
                        i29 = 2;
                    }
                    i35 = i36;
                } else {
                    i13 = i23;
                }
                i14 = i33 + i29;
            } else {
                i13 = i23;
                i14 = i33;
                i33 = i34;
            }
            int i37 = i33 + i24;
            boolean z14 = i19 == 1;
            if (i37 < i28) {
                int i38 = i37 * i27;
                int i39 = i38 + i26;
                int i43 = i39 + i25;
                int i44 = i38 + i27;
                if (i44 < i43) {
                    i43 = i44;
                }
                i15 = i14;
                int i45 = i34 * i19 * zoijcleaowVar.f39826ppxfxbqfkf;
                if (!z14) {
                    i17 = i24;
                    int i46 = ((i43 - i39) * i19) + i45;
                    int i47 = i39;
                    while (true) {
                        i16 = i25;
                        if (i47 >= i43) {
                            break;
                        }
                        int iDxjokdxxww = dxjokdxxww(i45, i46, zoijcleaowVar.f39826ppxfxbqfkf);
                        if (iDxjokdxxww != 0) {
                            iArr[i47] = iDxjokdxxww;
                        } else if (z13 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i45 += i19;
                        i47++;
                        i25 = i16;
                    }
                } else {
                    int i48 = i39;
                    while (i48 < i43) {
                        int i49 = i24;
                        int i53 = iArr2[bArr[i45] & 255];
                        if (i53 != 0) {
                            iArr[i48] = i53;
                        } else if (z13 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i45 += i19;
                        i48++;
                        i24 = i49;
                    }
                }
                bool = bool2;
                i34++;
                i24 = i17;
                i23 = i13;
                i25 = i16;
                i33 = i15;
            } else {
                i15 = i14;
            }
            i17 = i24;
            i16 = i25;
            bool = bool2;
            i34++;
            i24 = i17;
            i23 = i13;
            i25 = i16;
            i33 = i15;
        }
        Boolean bool3 = bool;
        if (this.f39789kcexrzcfyt == null) {
            this.f39789kcexrzcfyt = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void draadjrbmk(zoijcleaow zoijcleaowVar) {
        int i13;
        int i14;
        short s13;
        eablkybsjg eablkybsjgVar = this;
        if (zoijcleaowVar != null) {
            eablkybsjgVar.f39798wkgbmnqykc.position(zoijcleaowVar.f39818btonecajqb);
        }
        if (zoijcleaowVar == null) {
            ppxfxbqfkf ppxfxbqfkfVar = eablkybsjgVar.f39783draadjrbmk;
            i13 = ppxfxbqfkfVar.f39806gxszxtbevo;
            i14 = ppxfxbqfkfVar.f39808lqeggnwhkg;
        } else {
            i13 = zoijcleaowVar.f39826ppxfxbqfkf;
            i14 = zoijcleaowVar.f39827wkgbmnqykc;
        }
        int i15 = i13 * i14;
        byte[] bArr = eablkybsjgVar.f39784dxjokdxxww;
        if (bArr == null || bArr.length < i15) {
            eablkybsjgVar.f39784dxjokdxxww = eablkybsjgVar.f39794ppxfxbqfkf.zoijcleaow(i15);
        }
        byte[] bArr2 = eablkybsjgVar.f39784dxjokdxxww;
        if (eablkybsjgVar.f39787gxszxtbevo == null) {
            eablkybsjgVar.f39787gxszxtbevo = new short[4096];
        }
        short[] sArr = eablkybsjgVar.f39787gxszxtbevo;
        if (eablkybsjgVar.f39790lqeggnwhkg == null) {
            eablkybsjgVar.f39790lqeggnwhkg = new byte[4096];
        }
        byte[] bArr3 = eablkybsjgVar.f39790lqeggnwhkg;
        if (eablkybsjgVar.f39791nufgyqmvbu == null) {
            eablkybsjgVar.f39791nufgyqmvbu = new byte[4097];
        }
        byte[] bArr4 = eablkybsjgVar.f39791nufgyqmvbu;
        int iRgvfuqvkyq = rgvfuqvkyq();
        int i16 = 1 << iRgvfuqvkyq;
        int i17 = i16 + 1;
        int i18 = i16 + 2;
        int i19 = iRgvfuqvkyq + 1;
        int i23 = (1 << i19) - 1;
        int i24 = 0;
        for (int i25 = 0; i25 < i16; i25++) {
            sArr[i25] = 0;
            bArr3[i25] = (byte) i25;
        }
        byte[] bArr5 = eablkybsjgVar.f39785eablkybsjg;
        int i26 = i19;
        int i27 = i18;
        int i28 = i23;
        int iOjitshcjhn = 0;
        int i29 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = -1;
        while (i24 < i15) {
            if (iOjitshcjhn == 0) {
                iOjitshcjhn = ojitshcjhn();
                if (iOjitshcjhn <= 0) {
                    eablkybsjgVar.f39792ojitshcjhn = 3;
                    break;
                }
                i29 = 0;
            }
            i34 += (bArr5[i29] & 255) << i33;
            i29++;
            iOjitshcjhn--;
            int i39 = i33 + 8;
            i27 = i27;
            i38 = i38;
            i26 = i26;
            i19 = i19;
            i37 = i37;
            while (true) {
                if (i39 < i26) {
                    i33 = i39;
                    break;
                }
                int i43 = i18;
                int i44 = i34 & i28;
                i34 >>= i26;
                i39 -= i26;
                if (i44 == i16) {
                    i28 = i23;
                    i26 = i19;
                    i27 = i43;
                    i18 = i27;
                    i38 = -1;
                } else {
                    if (i44 == i17) {
                        i33 = i39;
                        i18 = i43;
                        break;
                    }
                    if (i38 == -1) {
                        bArr2[i35] = bArr3[i44];
                        i35++;
                        i24++;
                        i38 = i44;
                        i37 = i38;
                        i18 = i43;
                        i39 = i39;
                    } else {
                        if (i44 >= i27) {
                            bArr4[i36] = (byte) i37;
                            i36++;
                            s13 = i38;
                        } else {
                            s13 = i44;
                        }
                        while (s13 >= i16) {
                            bArr4[i36] = bArr3[s13];
                            i36++;
                            s13 = sArr[s13];
                        }
                        i37 = bArr3[s13] & 255;
                        byte b13 = (byte) i37;
                        bArr2[i35] = b13;
                        while (true) {
                            i35++;
                            i24++;
                            if (i36 <= 0) {
                                break;
                            }
                            i36--;
                            bArr2[i35] = bArr4[i36];
                        }
                        byte[] bArr6 = bArr4;
                        if (i27 < 4096) {
                            sArr[i27] = (short) i38;
                            bArr3[i27] = b13;
                            i27++;
                            if ((i27 & i28) == 0 && i27 < 4096) {
                                i26++;
                                i28 += i27;
                            }
                        }
                        i38 = i44;
                        i18 = i43;
                        i39 = i39;
                        bArr4 = bArr6;
                    }
                }
            }
            eablkybsjgVar = this;
        }
        Arrays.fill(bArr2, i35, i15, (byte) 0);
    }

    private int dxjokdxxww(int i13, int i14, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        for (int i24 = i13; i24 < this.f39795rgvfuqvkyq + i13; i24++) {
            byte[] bArr = this.f39784dxjokdxxww;
            if (i24 >= bArr.length || i24 >= i14) {
                break;
            }
            int i25 = this.f39788iobyxmoadg[bArr[i24] & 255];
            if (i25 != 0) {
                i16 += (i25 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                i17 += (i25 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                i18 += (i25 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                i19 += i25 & KotlinVersion.MAX_COMPONENT_VALUE;
                i23++;
            }
        }
        int i26 = i13 + i15;
        for (int i27 = i26; i27 < this.f39795rgvfuqvkyq + i26; i27++) {
            byte[] bArr2 = this.f39784dxjokdxxww;
            if (i27 >= bArr2.length || i27 >= i14) {
                break;
            }
            int i28 = this.f39788iobyxmoadg[bArr2[i27] & 255];
            if (i28 != 0) {
                i16 += (i28 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                i17 += (i28 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                i18 += (i28 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                i19 += i28 & KotlinVersion.MAX_COMPONENT_VALUE;
                i23++;
            }
        }
        if (i23 == 0) {
            return 0;
        }
        return ((i16 / i23) << 24) | ((i17 / i23) << 16) | ((i18 / i23) << 8) | (i19 / i23);
    }

    private void gtknphoqwx(zoijcleaow zoijcleaowVar) {
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        int[] iArr = this.f39782btonecajqb;
        int i13 = zoijcleaowVar2.f39827wkgbmnqykc;
        int i14 = zoijcleaowVar2.f39828zoijcleaow;
        int i15 = zoijcleaowVar2.f39826ppxfxbqfkf;
        int i16 = zoijcleaowVar2.f39823iobyxmoadg;
        boolean z13 = this.f39786gtknphoqwx == 0;
        int i17 = this.f39793oxmwwwfdhm;
        byte[] bArr = this.f39784dxjokdxxww;
        int[] iArr2 = this.f39788iobyxmoadg;
        int i18 = 0;
        byte b13 = -1;
        while (i18 < i13) {
            int i19 = (i18 + i14) * i17;
            int i23 = i19 + i16;
            int i24 = i23 + i15;
            int i25 = i19 + i17;
            if (i25 < i24) {
                i24 = i25;
            }
            int i26 = zoijcleaowVar2.f39826ppxfxbqfkf * i18;
            int i27 = i23;
            while (i27 < i24) {
                byte b14 = bArr[i26];
                int i28 = i13;
                int i29 = b14 & 255;
                if (i29 != b13) {
                    int i33 = iArr2[i29];
                    if (i33 != 0) {
                        iArr[i27] = i33;
                    } else {
                        b13 = b14;
                    }
                }
                i26++;
                i27++;
                i13 = i28;
            }
            i18++;
            zoijcleaowVar2 = zoijcleaowVar;
        }
        Boolean bool = this.f39789kcexrzcfyt;
        this.f39789kcexrzcfyt = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f39789kcexrzcfyt == null && z13 && b13 != -1));
    }

    private int ojitshcjhn() {
        int iRgvfuqvkyq = rgvfuqvkyq();
        if (iRgvfuqvkyq <= 0) {
            return iRgvfuqvkyq;
        }
        ByteBuffer byteBuffer = this.f39798wkgbmnqykc;
        byteBuffer.get(this.f39785eablkybsjg, 0, Math.min(iRgvfuqvkyq, byteBuffer.remaining()));
        return iRgvfuqvkyq;
    }

    private Bitmap oxmwwwfdhm(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
        int i13;
        int i14;
        Bitmap bitmap;
        int[] iArr = this.f39782btonecajqb;
        int i15 = 0;
        if (zoijcleaowVar2 == null) {
            Bitmap bitmap2 = this.f39797wflxmlrfwp;
            if (bitmap2 != null) {
                this.f39794ppxfxbqfkf.iobyxmoadg(bitmap2);
            }
            this.f39797wflxmlrfwp = null;
            Arrays.fill(iArr, 0);
        }
        if (zoijcleaowVar2 != null && zoijcleaowVar2.f39824lqeggnwhkg == 3 && this.f39797wflxmlrfwp == null) {
            Arrays.fill(iArr, 0);
        }
        if (zoijcleaowVar2 != null && (i14 = zoijcleaowVar2.f39824lqeggnwhkg) > 0) {
            if (i14 == 2) {
                if (!zoijcleaowVar.f39822gxszxtbevo) {
                    ppxfxbqfkf ppxfxbqfkfVar = this.f39783draadjrbmk;
                    int i16 = ppxfxbqfkfVar.f39802draadjrbmk;
                    if (zoijcleaowVar.f39821gtknphoqwx == null || ppxfxbqfkfVar.f39801btonecajqb != zoijcleaowVar.f39825nufgyqmvbu) {
                        i15 = i16;
                    }
                }
                int i17 = zoijcleaowVar2.f39827wkgbmnqykc;
                int i18 = this.f39795rgvfuqvkyq;
                int i19 = i17 / i18;
                int i23 = zoijcleaowVar2.f39828zoijcleaow / i18;
                int i24 = zoijcleaowVar2.f39826ppxfxbqfkf / i18;
                int i25 = zoijcleaowVar2.f39823iobyxmoadg / i18;
                int i26 = this.f39793oxmwwwfdhm;
                int i27 = (i23 * i26) + i25;
                int i28 = (i19 * i26) + i27;
                while (i27 < i28) {
                    int i29 = i27 + i24;
                    for (int i33 = i27; i33 < i29; i33++) {
                        iArr[i33] = i15;
                    }
                    i27 += this.f39793oxmwwwfdhm;
                }
            } else if (i14 == 3 && (bitmap = this.f39797wflxmlrfwp) != null) {
                int i34 = this.f39793oxmwwwfdhm;
                bitmap.getPixels(iArr, 0, i34, 0, 0, i34, this.f39796vdvldrhtss);
            }
        }
        draadjrbmk(zoijcleaowVar);
        if (zoijcleaowVar.f39820eablkybsjg || this.f39795rgvfuqvkyq != 1) {
            btonecajqb(zoijcleaowVar);
        } else {
            gtknphoqwx(zoijcleaowVar);
        }
        if (this.f39781agtfadlqog && ((i13 = zoijcleaowVar.f39824lqeggnwhkg) == 0 || i13 == 1)) {
            if (this.f39797wflxmlrfwp == null) {
                this.f39797wflxmlrfwp = agtfadlqog();
            }
            Bitmap bitmap3 = this.f39797wflxmlrfwp;
            int i35 = this.f39793oxmwwwfdhm;
            bitmap3.setPixels(iArr, 0, i35, 0, 0, i35, this.f39796vdvldrhtss);
        }
        Bitmap bitmapAgtfadlqog = agtfadlqog();
        int i36 = this.f39793oxmwwwfdhm;
        bitmapAgtfadlqog.setPixels(iArr, 0, i36, 0, 0, i36, this.f39796vdvldrhtss);
        return bitmapAgtfadlqog;
    }

    private int rgvfuqvkyq() {
        return this.f39798wkgbmnqykc.get() & 255;
    }

    @Override // h8.iobyxmoadg
    public void clear() {
        this.f39783draadjrbmk = null;
        byte[] bArr = this.f39784dxjokdxxww;
        if (bArr != null) {
            this.f39794ppxfxbqfkf.eablkybsjg(bArr);
        }
        int[] iArr = this.f39782btonecajqb;
        if (iArr != null) {
            this.f39794ppxfxbqfkf.gxszxtbevo(iArr);
        }
        Bitmap bitmap = this.f39797wflxmlrfwp;
        if (bitmap != null) {
            this.f39794ppxfxbqfkf.iobyxmoadg(bitmap);
        }
        this.f39797wflxmlrfwp = null;
        this.f39798wkgbmnqykc = null;
        this.f39789kcexrzcfyt = null;
        byte[] bArr2 = this.f39785eablkybsjg;
        if (bArr2 != null) {
            this.f39794ppxfxbqfkf.eablkybsjg(bArr2);
        }
    }

    @Override // h8.iobyxmoadg
    public int eablkybsjg() {
        int i13;
        if (this.f39783draadjrbmk.f39810ppxfxbqfkf <= 0 || (i13 = this.f39786gtknphoqwx) < 0) {
            return 0;
        }
        return wflxmlrfwp(i13);
    }

    @Override // h8.iobyxmoadg
    public ByteBuffer getData() {
        return this.f39798wkgbmnqykc;
    }

    @Override // h8.iobyxmoadg
    public void gxszxtbevo() {
        this.f39786gtknphoqwx = -1;
    }

    @Override // h8.iobyxmoadg
    public synchronized Bitmap iobyxmoadg() {
        try {
            if (this.f39783draadjrbmk.f39810ppxfxbqfkf <= 0 || this.f39786gtknphoqwx < 0) {
                String str = f39780yggfygwlhe;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f39783draadjrbmk.f39810ppxfxbqfkf + ", framePointer=" + this.f39786gtknphoqwx);
                }
                this.f39792ojitshcjhn = 1;
            }
            int i13 = this.f39792ojitshcjhn;
            if (i13 != 1 && i13 != 2) {
                this.f39792ojitshcjhn = 0;
                if (this.f39785eablkybsjg == null) {
                    this.f39785eablkybsjg = this.f39794ppxfxbqfkf.zoijcleaow(KotlinVersion.MAX_COMPONENT_VALUE);
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) this.f39783draadjrbmk.f39804eablkybsjg.get(this.f39786gtknphoqwx);
                int i14 = this.f39786gtknphoqwx - 1;
                zoijcleaow zoijcleaowVar2 = i14 >= 0 ? (zoijcleaow) this.f39783draadjrbmk.f39804eablkybsjg.get(i14) : null;
                int[] iArr = zoijcleaowVar.f39821gtknphoqwx;
                if (iArr == null) {
                    iArr = this.f39783draadjrbmk.f39807iobyxmoadg;
                }
                this.f39788iobyxmoadg = iArr;
                if (iArr == null) {
                    String str2 = f39780yggfygwlhe;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f39786gtknphoqwx);
                    }
                    this.f39792ojitshcjhn = 1;
                    return null;
                }
                if (zoijcleaowVar.f39822gxszxtbevo) {
                    System.arraycopy(iArr, 0, this.f39800zoijcleaow, 0, iArr.length);
                    int[] iArr2 = this.f39800zoijcleaow;
                    this.f39788iobyxmoadg = iArr2;
                    iArr2[zoijcleaowVar.f39825nufgyqmvbu] = 0;
                    if (zoijcleaowVar.f39824lqeggnwhkg == 2 && this.f39786gtknphoqwx == 0) {
                        this.f39789kcexrzcfyt = Boolean.TRUE;
                    }
                }
                return oxmwwwfdhm(zoijcleaowVar, zoijcleaowVar2);
            }
            String str3 = f39780yggfygwlhe;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f39792ojitshcjhn);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // h8.iobyxmoadg
    public int lqeggnwhkg() {
        return this.f39786gtknphoqwx;
    }

    @Override // h8.iobyxmoadg
    public int nufgyqmvbu() {
        return this.f39798wkgbmnqykc.limit() + this.f39784dxjokdxxww.length + (this.f39782btonecajqb.length * 4);
    }

    @Override // h8.iobyxmoadg
    public int ppxfxbqfkf() {
        return this.f39783draadjrbmk.f39810ppxfxbqfkf;
    }

    public synchronized void vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, ByteBuffer byteBuffer, int i13) {
        try {
            if (i13 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i13);
            }
            int iHighestOneBit = Integer.highestOneBit(i13);
            this.f39792ojitshcjhn = 0;
            this.f39783draadjrbmk = ppxfxbqfkfVar;
            this.f39786gtknphoqwx = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f39798wkgbmnqykc = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f39798wkgbmnqykc.order(ByteOrder.LITTLE_ENDIAN);
            this.f39781agtfadlqog = false;
            Iterator it = ppxfxbqfkfVar.f39804eablkybsjg.iterator();
            while (it.hasNext()) {
                if (((zoijcleaow) it.next()).f39824lqeggnwhkg == 3) {
                    this.f39781agtfadlqog = true;
                    break;
                }
            }
            this.f39795rgvfuqvkyq = iHighestOneBit;
            int i14 = ppxfxbqfkfVar.f39806gxszxtbevo;
            this.f39793oxmwwwfdhm = i14 / iHighestOneBit;
            int i15 = ppxfxbqfkfVar.f39808lqeggnwhkg;
            this.f39796vdvldrhtss = i15 / iHighestOneBit;
            this.f39784dxjokdxxww = this.f39794ppxfxbqfkf.zoijcleaow(i14 * i15);
            this.f39782btonecajqb = this.f39794ppxfxbqfkf.wkgbmnqykc(this.f39793oxmwwwfdhm * this.f39796vdvldrhtss);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int wflxmlrfwp(int i13) {
        if (i13 >= 0) {
            ppxfxbqfkf ppxfxbqfkfVar = this.f39783draadjrbmk;
            if (i13 < ppxfxbqfkfVar.f39810ppxfxbqfkf) {
                return ((zoijcleaow) ppxfxbqfkfVar.f39804eablkybsjg.get(i13)).f39819dxjokdxxww;
            }
        }
        return -1;
    }

    @Override // h8.iobyxmoadg
    public void wkgbmnqykc(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f39799zdlpuopuiu = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // h8.iobyxmoadg
    public void zoijcleaow() {
        this.f39786gtknphoqwx = (this.f39786gtknphoqwx + 1) % this.f39783draadjrbmk.f39810ppxfxbqfkf;
    }

    public eablkybsjg(iobyxmoadg.InterfaceC0923iobyxmoadg interfaceC0923iobyxmoadg) {
        this.f39800zoijcleaow = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        this.f39799zdlpuopuiu = Bitmap.Config.ARGB_8888;
        this.f39794ppxfxbqfkf = interfaceC0923iobyxmoadg;
        this.f39783draadjrbmk = new ppxfxbqfkf();
    }
}

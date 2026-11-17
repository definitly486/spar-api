package cdpycssgdh;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends FilterOutputStream {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final byte[] f19685lereixgezr = "Exif\u0000\u0000".getBytes(lqeggnwhkg.f19710eablkybsjg);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f19686cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f19687esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f19688iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ByteBuffer f19689jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final byte[] f19690yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final nufgyqmvbu f19691zdlpuopuiu;

    static final class iobyxmoadg {
        public static boolean iobyxmoadg(short s13) {
            return (s13 < -64 || s13 > -49 || s13 == -60 || s13 == -56 || s13 == -52) ? false : true;
        }
    }

    public dxjokdxxww(OutputStream outputStream, nufgyqmvbu nufgyqmvbuVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f19690yggfygwlhe = new byte[1];
        this.f19689jyumaefscl = ByteBuffer.allocate(4);
        this.f19688iwizpuwonk = 0;
        this.f19691zdlpuopuiu = nufgyqmvbuVar;
    }

    private int iobyxmoadg(int i13, byte[] bArr, int i14, int i15) {
        int iMin = Math.min(i15, i13 - this.f19689jyumaefscl.position());
        this.f19689jyumaefscl.put(bArr, i14, iMin);
        return iMin;
    }

    private void wkgbmnqykc(zoijcleaow zoijcleaowVar) throws IOException {
        btonecajqb[][] btonecajqbVarArr = nufgyqmvbu.f19719dxjokdxxww;
        int[] iArr = new int[btonecajqbVarArr.length];
        int[] iArr2 = new int[btonecajqbVarArr.length];
        for (btonecajqb btonecajqbVar : nufgyqmvbu.f19722lqeggnwhkg) {
            for (int i13 = 0; i13 < nufgyqmvbu.f19719dxjokdxxww.length; i13++) {
                this.f19691zdlpuopuiu.ppxfxbqfkf(i13).remove(btonecajqbVar.f19683zoijcleaow);
            }
        }
        if (!this.f19691zdlpuopuiu.ppxfxbqfkf(1).isEmpty()) {
            this.f19691zdlpuopuiu.ppxfxbqfkf(0).put(nufgyqmvbu.f19722lqeggnwhkg[1].f19683zoijcleaow, lqeggnwhkg.gxszxtbevo(0L, this.f19691zdlpuopuiu.wkgbmnqykc()));
        }
        if (!this.f19691zdlpuopuiu.ppxfxbqfkf(2).isEmpty()) {
            this.f19691zdlpuopuiu.ppxfxbqfkf(0).put(nufgyqmvbu.f19722lqeggnwhkg[2].f19683zoijcleaow, lqeggnwhkg.gxszxtbevo(0L, this.f19691zdlpuopuiu.wkgbmnqykc()));
        }
        if (!this.f19691zdlpuopuiu.ppxfxbqfkf(3).isEmpty()) {
            this.f19691zdlpuopuiu.ppxfxbqfkf(1).put(nufgyqmvbu.f19722lqeggnwhkg[3].f19683zoijcleaow, lqeggnwhkg.gxszxtbevo(0L, this.f19691zdlpuopuiu.wkgbmnqykc()));
        }
        for (int i14 = 0; i14 < nufgyqmvbu.f19719dxjokdxxww.length; i14++) {
            Iterator it = this.f19691zdlpuopuiu.ppxfxbqfkf(i14).entrySet().iterator();
            int i15 = 0;
            while (it.hasNext()) {
                int iBtonecajqb = ((lqeggnwhkg) ((Map.Entry) it.next()).getValue()).btonecajqb();
                if (iBtonecajqb > 4) {
                    i15 += iBtonecajqb;
                }
            }
            iArr2[i14] = iArr2[i14] + i15;
        }
        int size = 8;
        for (int i16 = 0; i16 < nufgyqmvbu.f19719dxjokdxxww.length; i16++) {
            if (!this.f19691zdlpuopuiu.ppxfxbqfkf(i16).isEmpty()) {
                iArr[i16] = size;
                size += (this.f19691zdlpuopuiu.ppxfxbqfkf(i16).size() * 12) + 6 + iArr2[i16];
            }
        }
        int i17 = size + 8;
        if (!this.f19691zdlpuopuiu.ppxfxbqfkf(1).isEmpty()) {
            this.f19691zdlpuopuiu.ppxfxbqfkf(0).put(nufgyqmvbu.f19722lqeggnwhkg[1].f19683zoijcleaow, lqeggnwhkg.gxszxtbevo(iArr[1], this.f19691zdlpuopuiu.wkgbmnqykc()));
        }
        if (!this.f19691zdlpuopuiu.ppxfxbqfkf(2).isEmpty()) {
            this.f19691zdlpuopuiu.ppxfxbqfkf(0).put(nufgyqmvbu.f19722lqeggnwhkg[2].f19683zoijcleaow, lqeggnwhkg.gxszxtbevo(iArr[2], this.f19691zdlpuopuiu.wkgbmnqykc()));
        }
        if (!this.f19691zdlpuopuiu.ppxfxbqfkf(3).isEmpty()) {
            this.f19691zdlpuopuiu.ppxfxbqfkf(1).put(nufgyqmvbu.f19722lqeggnwhkg[3].f19683zoijcleaow, lqeggnwhkg.gxszxtbevo(iArr[3], this.f19691zdlpuopuiu.wkgbmnqykc()));
        }
        zoijcleaowVar.btonecajqb(i17);
        zoijcleaowVar.write(f19685lereixgezr);
        zoijcleaowVar.nufgyqmvbu(this.f19691zdlpuopuiu.wkgbmnqykc() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        zoijcleaowVar.iobyxmoadg(this.f19691zdlpuopuiu.wkgbmnqykc());
        zoijcleaowVar.btonecajqb(42);
        zoijcleaowVar.dxjokdxxww(8L);
        for (int i18 = 0; i18 < nufgyqmvbu.f19719dxjokdxxww.length; i18++) {
            if (!this.f19691zdlpuopuiu.ppxfxbqfkf(i18).isEmpty()) {
                zoijcleaowVar.btonecajqb(this.f19691zdlpuopuiu.ppxfxbqfkf(i18).size());
                int size2 = iArr[i18] + 2 + (this.f19691zdlpuopuiu.ppxfxbqfkf(i18).size() * 12) + 4;
                for (Map.Entry entry : this.f19691zdlpuopuiu.ppxfxbqfkf(i18).entrySet()) {
                    int i19 = ((btonecajqb) u1.nufgyqmvbu.lqeggnwhkg((btonecajqb) ((HashMap) nufgyqmvbu.zoijcleaow.f19733gxszxtbevo.get(i18)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f19680iobyxmoadg;
                    lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) entry.getValue();
                    int iBtonecajqb2 = lqeggnwhkgVar.btonecajqb();
                    zoijcleaowVar.btonecajqb(i19);
                    zoijcleaowVar.btonecajqb(lqeggnwhkgVar.f19714iobyxmoadg);
                    zoijcleaowVar.lqeggnwhkg(lqeggnwhkgVar.f19717zoijcleaow);
                    if (iBtonecajqb2 > 4) {
                        zoijcleaowVar.dxjokdxxww(size2);
                        size2 += iBtonecajqb2;
                    } else {
                        zoijcleaowVar.write(lqeggnwhkgVar.f19716wkgbmnqykc);
                        if (iBtonecajqb2 < 4) {
                            while (iBtonecajqb2 < 4) {
                                zoijcleaowVar.wkgbmnqykc(0);
                                iBtonecajqb2++;
                            }
                        }
                    }
                }
                zoijcleaowVar.dxjokdxxww(0L);
                Iterator it2 = this.f19691zdlpuopuiu.ppxfxbqfkf(i18).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((lqeggnwhkg) ((Map.Entry) it2.next()).getValue()).f19716wkgbmnqykc;
                    if (bArr.length > 4) {
                        zoijcleaowVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        zoijcleaowVar.iobyxmoadg(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i13, int i14) throws IOException {
        while (true) {
            int i15 = this.f19686cqumvgiudr;
            if ((i15 <= 0 && this.f19687esjtqupxsv <= 0 && this.f19688iwizpuwonk == 2) || i14 <= 0) {
                break;
            }
            if (i15 > 0) {
                int iMin = Math.min(i14, i15);
                i14 -= iMin;
                this.f19686cqumvgiudr -= iMin;
                i13 += iMin;
            }
            int i16 = this.f19687esjtqupxsv;
            if (i16 > 0) {
                int iMin2 = Math.min(i14, i16);
                ((FilterOutputStream) this).out.write(bArr, i13, iMin2);
                i14 -= iMin2;
                this.f19687esjtqupxsv -= iMin2;
                i13 += iMin2;
            }
            if (i14 == 0) {
                return;
            }
            int i17 = this.f19688iwizpuwonk;
            if (i17 == 0) {
                int iIobyxmoadg = iobyxmoadg(2, bArr, i13, i14);
                i13 += iIobyxmoadg;
                i14 -= iIobyxmoadg;
                if (this.f19689jyumaefscl.position() < 2) {
                    return;
                }
                this.f19689jyumaefscl.rewind();
                if (this.f19689jyumaefscl.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f19689jyumaefscl.array(), 0, 2);
                this.f19688iwizpuwonk = 1;
                this.f19689jyumaefscl.rewind();
                zoijcleaow zoijcleaowVar = new zoijcleaow(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                zoijcleaowVar.nufgyqmvbu((short) -31);
                wkgbmnqykc(zoijcleaowVar);
            } else if (i17 != 1) {
                continue;
            } else {
                int iIobyxmoadg2 = iobyxmoadg(4, bArr, i13, i14);
                i13 += iIobyxmoadg2;
                i14 -= iIobyxmoadg2;
                if (this.f19689jyumaefscl.position() == 2 && this.f19689jyumaefscl.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f19689jyumaefscl.array(), 0, 2);
                    this.f19689jyumaefscl.rewind();
                }
                if (this.f19689jyumaefscl.position() < 4) {
                    return;
                }
                this.f19689jyumaefscl.rewind();
                short s13 = this.f19689jyumaefscl.getShort();
                if (s13 == -31) {
                    this.f19686cqumvgiudr = (this.f19689jyumaefscl.getShort() & 65535) - 2;
                    this.f19688iwizpuwonk = 2;
                } else if (iobyxmoadg.iobyxmoadg(s13)) {
                    ((FilterOutputStream) this).out.write(this.f19689jyumaefscl.array(), 0, 4);
                    this.f19688iwizpuwonk = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f19689jyumaefscl.array(), 0, 4);
                    this.f19687esjtqupxsv = (this.f19689jyumaefscl.getShort() & 65535) - 2;
                }
                this.f19689jyumaefscl.rewind();
            }
        }
        if (i14 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i13, i14);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i13) throws IOException {
        byte[] bArr = this.f19690yggfygwlhe;
        bArr[0] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}

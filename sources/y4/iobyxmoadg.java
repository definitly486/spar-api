package y4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.zdlpuopuiu;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import q4.eablkybsjg;
import q4.oxmwwwfdhm;
import y2.cdpycssgdh;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f123883ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Inflater f123884wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f123882iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f123885zoijcleaow = new yadqdtsiqt();

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f123887eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f123888gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private Rect f123890lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f123892ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int[] f123893wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f123894zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int[] f123889iobyxmoadg = new int[4];

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f123891nufgyqmvbu = -1;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f123886dxjokdxxww = -1;

        /* JADX INFO: renamed from: y4.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        private static final class C3129iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public int f123895iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public int f123896zoijcleaow;

            private C3129iobyxmoadg() {
            }
        }

        private static int agtfadlqog(int i13, int i14) {
            return (i13 & 16777215) | ((i14 * 17) << 24);
        }

        private void btonecajqb(cdpycssgdh cdpycssgdhVar, boolean z13, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i13 = !z13 ? 1 : 0;
            int i14 = i13 * iWidth;
            C3129iobyxmoadg c3129iobyxmoadg = new C3129iobyxmoadg();
            while (true) {
                int i15 = 0;
                do {
                    gtknphoqwx(cdpycssgdhVar, iWidth, c3129iobyxmoadg);
                    int iMin = Math.min(c3129iobyxmoadg.f123896zoijcleaow, iWidth - i15);
                    if (iMin > 0) {
                        int i16 = i14 + iMin;
                        Arrays.fill(iArr, i14, i16, this.f123889iobyxmoadg[c3129iobyxmoadg.f123895iobyxmoadg]);
                        i15 += iMin;
                        i14 = i16;
                    }
                } while (i15 < iWidth);
                i13 += 2;
                if (i13 >= iHeight) {
                    return;
                }
                i14 = i13 * iWidth;
                cdpycssgdhVar.ppxfxbqfkf();
            }
        }

        private boolean eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
            if (yadqdtsiqtVar.iobyxmoadg() < 2 || !this.f123892ppxfxbqfkf) {
                return false;
            }
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
            int[] iArr = this.f123889iobyxmoadg;
            iArr[3] = agtfadlqog(iArr[3], iWwaezpbzkn >> 4);
            int[] iArr2 = this.f123889iobyxmoadg;
            iArr2[2] = agtfadlqog(iArr2[2], iWwaezpbzkn & 15);
            int[] iArr3 = this.f123889iobyxmoadg;
            iArr3[1] = agtfadlqog(iArr3[1], iWwaezpbzkn2 >> 4);
            int[] iArr4 = this.f123889iobyxmoadg;
            iArr4[0] = agtfadlqog(iArr4[0], iWwaezpbzkn2 & 15);
            return true;
        }

        private static void gtknphoqwx(cdpycssgdh cdpycssgdhVar, int i13, C3129iobyxmoadg c3129iobyxmoadg) {
            int iNufgyqmvbu = 0;
            for (int i14 = 1; iNufgyqmvbu < i14 && i14 <= 64; i14 <<= 2) {
                if (cdpycssgdhVar.zoijcleaow() < 4) {
                    c3129iobyxmoadg.f123895iobyxmoadg = -1;
                    c3129iobyxmoadg.f123896zoijcleaow = 0;
                    return;
                }
                iNufgyqmvbu = (iNufgyqmvbu << 4) | cdpycssgdhVar.nufgyqmvbu(4);
            }
            c3129iobyxmoadg.f123895iobyxmoadg = iNufgyqmvbu & 3;
            if (iNufgyqmvbu >= 4) {
                i13 = iNufgyqmvbu >> 2;
            }
            c3129iobyxmoadg.f123896zoijcleaow = i13;
        }

        private boolean gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
            if (yadqdtsiqtVar.iobyxmoadg() < 6) {
                return false;
            }
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
            int i13 = (iWwaezpbzkn << 4) | (iWwaezpbzkn2 >> 4);
            int iWwaezpbzkn3 = ((iWwaezpbzkn2 & 15) << 8) | yadqdtsiqtVar.wwaezpbzkn();
            int iWwaezpbzkn4 = yadqdtsiqtVar.wwaezpbzkn();
            int iWwaezpbzkn5 = yadqdtsiqtVar.wwaezpbzkn();
            this.f123890lqeggnwhkg = new Rect(i13, (iWwaezpbzkn4 << 4) | (iWwaezpbzkn5 >> 4), iWwaezpbzkn3 + 1, (yadqdtsiqtVar.wwaezpbzkn() | ((iWwaezpbzkn5 & 15) << 8)) + 1);
            return true;
        }

        private boolean lqeggnwhkg(int[] iArr, yadqdtsiqt yadqdtsiqtVar) {
            if (yadqdtsiqtVar.iobyxmoadg() < 2) {
                return false;
            }
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
            this.f123889iobyxmoadg[3] = zoijcleaow(iArr, iWwaezpbzkn >> 4);
            this.f123889iobyxmoadg[2] = zoijcleaow(iArr, iWwaezpbzkn & 15);
            this.f123889iobyxmoadg[1] = zoijcleaow(iArr, iWwaezpbzkn2 >> 4);
            this.f123889iobyxmoadg[0] = zoijcleaow(iArr, iWwaezpbzkn2 & 15);
            this.f123892ppxfxbqfkf = true;
            return true;
        }

        private boolean nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar) {
            if (yadqdtsiqtVar.iobyxmoadg() < 4) {
                return false;
            }
            this.f123891nufgyqmvbu = yadqdtsiqtVar.wypolnanlu();
            this.f123886dxjokdxxww = yadqdtsiqtVar.wypolnanlu();
            return true;
        }

        private static int ppxfxbqfkf(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void wkgbmnqykc(int[] iArr, yadqdtsiqt yadqdtsiqtVar, int i13) {
            while (yadqdtsiqtVar.gxszxtbevo() < i13 && yadqdtsiqtVar.iobyxmoadg() > 0) {
                switch (yadqdtsiqtVar.wwaezpbzkn()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!lqeggnwhkg(iArr, yadqdtsiqtVar)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!eablkybsjg(yadqdtsiqtVar)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!gxszxtbevo(yadqdtsiqtVar)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!nufgyqmvbu(yadqdtsiqtVar)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private static int zoijcleaow(int[] iArr, int i13) {
            return (i13 < 0 || i13 >= iArr.length) ? iArr[0] : iArr[i13];
        }

        public void draadjrbmk(yadqdtsiqt yadqdtsiqtVar) {
            int[] iArr = this.f123893wkgbmnqykc;
            if (iArr == null || !this.f123894zoijcleaow) {
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(yadqdtsiqtVar.wypolnanlu() - 2);
            wkgbmnqykc(iArr, yadqdtsiqtVar, yadqdtsiqtVar.wypolnanlu());
        }

        public void dxjokdxxww(String str) {
            for (String str2 : stevsuqkhv.k(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrK = stevsuqkhv.k(str2.substring(9), StringUtils.COMMA);
                    this.f123893wkgbmnqykc = new int[strArrK.length];
                    for (int i13 = 0; i13 < strArrK.length; i13++) {
                        this.f123893wkgbmnqykc[i13] = ppxfxbqfkf(strArrK[i13].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrK2 = stevsuqkhv.k(str2.substring(6).trim(), "x");
                    if (strArrK2.length == 2) {
                        try {
                            this.f123887eablkybsjg = Integer.parseInt(strArrK2[0]);
                            this.f123888gxszxtbevo = Integer.parseInt(strArrK2[1]);
                            this.f123894zoijcleaow = true;
                        } catch (RuntimeException e13) {
                            kcexrzcfyt.dxjokdxxww("VobsubParser", "Parsing IDX failed", e13);
                        }
                    }
                }
            }
        }

        public x2.iobyxmoadg iobyxmoadg(yadqdtsiqt yadqdtsiqtVar) {
            Rect rect;
            if (this.f123893wkgbmnqykc == null || !this.f123894zoijcleaow || !this.f123892ppxfxbqfkf || (rect = this.f123890lqeggnwhkg) == null || this.f123891nufgyqmvbu == -1 || this.f123886dxjokdxxww == -1 || rect.width() < 2 || this.f123890lqeggnwhkg.height() < 2) {
                return null;
            }
            Rect rect2 = this.f123890lqeggnwhkg;
            int[] iArr = new int[rect2.width() * rect2.height()];
            cdpycssgdh cdpycssgdhVar = new cdpycssgdh();
            yadqdtsiqtVar.sopmlzcsov(this.f123891nufgyqmvbu);
            cdpycssgdhVar.wflxmlrfwp(yadqdtsiqtVar);
            btonecajqb(cdpycssgdhVar, true, rect2, iArr);
            yadqdtsiqtVar.sopmlzcsov(this.f123886dxjokdxxww);
            cdpycssgdhVar.wflxmlrfwp(yadqdtsiqtVar);
            btonecajqb(cdpycssgdhVar, false, rect2, iArr);
            return new x2.iobyxmoadg.zoijcleaow().gxszxtbevo(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).gtknphoqwx(rect2.left / this.f123887eablkybsjg).draadjrbmk(0).nufgyqmvbu(rect2.top / this.f123888gxszxtbevo, 0).dxjokdxxww(0).agtfadlqog(rect2.width() / this.f123887eablkybsjg).lqeggnwhkg(rect2.height() / this.f123888gxszxtbevo).iobyxmoadg();
        }

        public void wflxmlrfwp() {
            this.f123892ppxfxbqfkf = false;
            this.f123890lqeggnwhkg = null;
            this.f123891nufgyqmvbu = -1;
            this.f123886dxjokdxxww = -1;
        }
    }

    public iobyxmoadg(List list) {
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f123883ppxfxbqfkf = zoijcleaowVar;
        zoijcleaowVar.dxjokdxxww(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    private x2.iobyxmoadg eablkybsjg() {
        if (this.f123884wkgbmnqykc == null) {
            this.f123884wkgbmnqykc = new Inflater();
        }
        if (stevsuqkhv.grlcpdaxtj(this.f123882iobyxmoadg, this.f123885zoijcleaow, this.f123884wkgbmnqykc)) {
            this.f123882iobyxmoadg.ntlheqmsrt(this.f123885zoijcleaow.eablkybsjg(), this.f123885zoijcleaow.lqeggnwhkg());
        }
        this.f123883ppxfxbqfkf.wflxmlrfwp();
        int iIobyxmoadg = this.f123882iobyxmoadg.iobyxmoadg();
        if (iIobyxmoadg < 2 || this.f123882iobyxmoadg.wypolnanlu() != iIobyxmoadg) {
            return null;
        }
        this.f123883ppxfxbqfkf.draadjrbmk(this.f123882iobyxmoadg);
        return this.f123883ppxfxbqfkf.iobyxmoadg(this.f123882iobyxmoadg);
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        this.f123882iobyxmoadg.ntlheqmsrt(bArr, i14 + i13);
        this.f123882iobyxmoadg.sopmlzcsov(i13);
        x2.iobyxmoadg iobyxmoadgVarEablkybsjg = eablkybsjg();
        wflxmlrfwpVar.accept(new eablkybsjg(iobyxmoadgVarEablkybsjg != null ? zdlpuopuiu.istkbnxepw(iobyxmoadgVarEablkybsjg) : zdlpuopuiu.zynmafqrjb(), -9223372036854775807L, 5000000L));
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 2;
    }
}

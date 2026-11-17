package o3;

import android.util.Pair;
import androidx.media3.exoplayer.hszhottldk;
import f3.hcddaimhww;
import java.util.Arrays;
import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class pmvmpeiblj extends cdpycssgdh {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f71883ppxfxbqfkf;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int[] f71884eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int[][][] f71885gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f71886iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final m3.iwizpuwonk f71887lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int[] f71888ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final m3.iwizpuwonk[] f71889wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String[] f71890zoijcleaow;

        iobyxmoadg(String[] strArr, int[] iArr, m3.iwizpuwonk[] iwizpuwonkVarArr, int[] iArr2, int[][][] iArr3, m3.iwizpuwonk iwizpuwonkVar) {
            this.f71890zoijcleaow = strArr;
            this.f71888ppxfxbqfkf = iArr;
            this.f71889wkgbmnqykc = iwizpuwonkVarArr;
            this.f71885gxszxtbevo = iArr3;
            this.f71884eablkybsjg = iArr2;
            this.f71887lqeggnwhkg = iwizpuwonkVar;
            this.f71886iobyxmoadg = iArr.length;
        }

        public int eablkybsjg(int i13) {
            return this.f71888ppxfxbqfkf[i13];
        }

        public m3.iwizpuwonk gxszxtbevo(int i13) {
            return this.f71889wkgbmnqykc[i13];
        }

        public int iobyxmoadg(int i13, int i14, boolean z13) {
            int i15 = this.f71889wkgbmnqykc[i13].zoijcleaow(i14).f115705iobyxmoadg;
            int[] iArr = new int[i15];
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                int iLqeggnwhkg = lqeggnwhkg(i13, i14, i17);
                if (iLqeggnwhkg == 4 || (z13 && iLqeggnwhkg == 3)) {
                    iArr[i16] = i17;
                    i16++;
                }
            }
            return zoijcleaow(i13, i14, Arrays.copyOf(iArr, i16));
        }

        public int lqeggnwhkg(int i13, int i14, int i15) {
            return hszhottldk.tzroggbefp(ppxfxbqfkf(i13, i14, i15));
        }

        public m3.iwizpuwonk nufgyqmvbu() {
            return this.f71887lqeggnwhkg;
        }

        public int ppxfxbqfkf(int i13, int i14, int i15) {
            return this.f71885gxszxtbevo[i13][i14][i15];
        }

        public int wkgbmnqykc() {
            return this.f71886iobyxmoadg;
        }

        public int zoijcleaow(int i13, int i14, int[] iArr) {
            int i15 = 0;
            int iMin = 16;
            String str = null;
            boolean z13 = false;
            int i16 = 0;
            while (i15 < iArr.length) {
                String str2 = this.f71889wkgbmnqykc[i13].zoijcleaow(i14).iobyxmoadg(iArr[i15]).f9769ojitshcjhn;
                int i17 = i16 + 1;
                if (i16 == 0) {
                    str = str2;
                } else {
                    z13 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, hszhottldk.yggfygwlhe(this.f71885gxszxtbevo[i13][i14][i15]));
                i15++;
                i16 = i17;
            }
            return z13 ? Math.min(iMin, this.f71884eablkybsjg[i13]) : iMin;
        }
    }

    private static int agtfadlqog(hszhottldk[] hszhottldkVarArr, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr, boolean z13) {
        int length = hszhottldkVarArr.length;
        int i13 = 0;
        boolean z14 = true;
        for (int i14 = 0; i14 < hszhottldkVarArr.length; i14++) {
            hszhottldk hszhottldkVar = hszhottldkVarArr[i14];
            int iMax = 0;
            for (int i15 = 0; i15 < yadqdtsiqtVar.f115705iobyxmoadg; i15++) {
                iMax = Math.max(iMax, hszhottldk.tzroggbefp(hszhottldkVar.iobyxmoadg(yadqdtsiqtVar.iobyxmoadg(i15))));
            }
            boolean z15 = iArr[i14] == 0;
            if (iMax > i13 || (iMax == i13 && z13 && !z14 && z15)) {
                length = i14;
                z14 = z15;
                i13 = iMax;
            }
        }
        return length;
    }

    private static int[] ojitshcjhn(hszhottldk hszhottldkVar, v2.yadqdtsiqt yadqdtsiqtVar) {
        int[] iArr = new int[yadqdtsiqtVar.f115705iobyxmoadg];
        for (int i13 = 0; i13 < yadqdtsiqtVar.f115705iobyxmoadg; i13++) {
            iArr[i13] = hszhottldkVar.iobyxmoadg(yadqdtsiqtVar.iobyxmoadg(i13));
        }
        return iArr;
    }

    private static int[] rgvfuqvkyq(hszhottldk[] hszhottldkVarArr) {
        int length = hszhottldkVarArr.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = hszhottldkVarArr[i13].cllcsxoeiz();
        }
        return iArr;
    }

    @Override // o3.cdpycssgdh
    public final void dxjokdxxww(Object obj) {
        this.f71883ppxfxbqfkf = (iobyxmoadg) obj;
    }

    @Override // o3.cdpycssgdh
    public final yadqdtsiqt gtknphoqwx(hszhottldk[] hszhottldkVarArr, m3.iwizpuwonk iwizpuwonkVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar) {
        int[] iArr = new int[hszhottldkVarArr.length + 1];
        int length = hszhottldkVarArr.length + 1;
        v2.yadqdtsiqt[][] yadqdtsiqtVarArr = new v2.yadqdtsiqt[length][];
        int[][][] iArr2 = new int[hszhottldkVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iwizpuwonkVar.f65036iobyxmoadg;
            yadqdtsiqtVarArr[i13] = new v2.yadqdtsiqt[i14];
            iArr2[i13] = new int[i14][];
        }
        int[] iArrRgvfuqvkyq = rgvfuqvkyq(hszhottldkVarArr);
        for (int i15 = 0; i15 < iwizpuwonkVar.f65036iobyxmoadg; i15++) {
            v2.yadqdtsiqt yadqdtsiqtVarZoijcleaow = iwizpuwonkVar.zoijcleaow(i15);
            int iAgtfadlqog = agtfadlqog(hszhottldkVarArr, yadqdtsiqtVarZoijcleaow, iArr, yadqdtsiqtVarZoijcleaow.f115706ppxfxbqfkf == 5);
            int[] iArrOjitshcjhn = iAgtfadlqog == hszhottldkVarArr.length ? new int[yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg] : ojitshcjhn(hszhottldkVarArr[iAgtfadlqog], yadqdtsiqtVarZoijcleaow);
            int i16 = iArr[iAgtfadlqog];
            yadqdtsiqtVarArr[iAgtfadlqog][i16] = yadqdtsiqtVarZoijcleaow;
            iArr2[iAgtfadlqog][i16] = iArrOjitshcjhn;
            iArr[iAgtfadlqog] = i16 + 1;
        }
        m3.iwizpuwonk[] iwizpuwonkVarArr = new m3.iwizpuwonk[hszhottldkVarArr.length];
        String[] strArr = new String[hszhottldkVarArr.length];
        int[] iArr3 = new int[hszhottldkVarArr.length];
        for (int i17 = 0; i17 < hszhottldkVarArr.length; i17++) {
            int i18 = iArr[i17];
            iwizpuwonkVarArr[i17] = new m3.iwizpuwonk((v2.yadqdtsiqt[]) stevsuqkhv.yzdjzghtvl(yadqdtsiqtVarArr[i17], i18));
            iArr2[i17] = (int[][]) stevsuqkhv.yzdjzghtvl(iArr2[i17], i18);
            strArr[i17] = hszhottldkVarArr[i17].getName();
            iArr3[i17] = hszhottldkVarArr[i17].dxjokdxxww();
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(strArr, iArr3, iwizpuwonkVarArr, iArrRgvfuqvkyq, iArr2, new m3.iwizpuwonk((v2.yadqdtsiqt[]) stevsuqkhv.yzdjzghtvl(yadqdtsiqtVarArr[hszhottldkVarArr.length], iArr[hszhottldkVarArr.length])));
        Pair pairVdvldrhtss = vdvldrhtss(iobyxmoadgVar, iArr2, iArrRgvfuqvkyq, zoijcleaowVar, cdpycssgdhVar);
        return new yadqdtsiqt((hcddaimhww[]) pairVdvldrhtss.first, (esjtqupxsv[]) pairVdvldrhtss.second, istkbnxepw.zoijcleaow(iobyxmoadgVar, (zynmafqrjb[]) pairVdvldrhtss.second), iobyxmoadgVar);
    }

    protected abstract Pair vdvldrhtss(iobyxmoadg iobyxmoadgVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar);
}

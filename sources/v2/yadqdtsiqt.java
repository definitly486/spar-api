package v2;

import java.util.Arrays;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f115702gxszxtbevo = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f115703lqeggnwhkg = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f115704eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f115705iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f115706ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.media3.common.iobyxmoadg[] f115707wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f115708zoijcleaow;

    public yadqdtsiqt(androidx.media3.common.iobyxmoadg... iobyxmoadgVarArr) {
        this("", iobyxmoadgVarArr);
    }

    private static int eablkybsjg(int i13) {
        return i13 | 16384;
    }

    private void gxszxtbevo() {
        String strWkgbmnqykc = wkgbmnqykc(this.f115707wkgbmnqykc[0].f9777wkgbmnqykc);
        int iEablkybsjg = eablkybsjg(this.f115707wkgbmnqykc[0].f9755gxszxtbevo);
        int i13 = 1;
        while (true) {
            androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr = this.f115707wkgbmnqykc;
            if (i13 >= iobyxmoadgVarArr.length) {
                return;
            }
            if (!strWkgbmnqykc.equals(wkgbmnqykc(iobyxmoadgVarArr[i13].f9777wkgbmnqykc))) {
                androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr2 = this.f115707wkgbmnqykc;
                ppxfxbqfkf("languages", iobyxmoadgVarArr2[0].f9777wkgbmnqykc, iobyxmoadgVarArr2[i13].f9777wkgbmnqykc, i13);
                return;
            } else {
                if (iEablkybsjg != eablkybsjg(this.f115707wkgbmnqykc[i13].f9755gxszxtbevo)) {
                    ppxfxbqfkf("role flags", Integer.toBinaryString(this.f115707wkgbmnqykc[0].f9755gxszxtbevo), Integer.toBinaryString(this.f115707wkgbmnqykc[i13].f9755gxszxtbevo), i13);
                    return;
                }
                i13++;
            }
        }
    }

    private static void ppxfxbqfkf(String str, String str2, String str3, int i13) {
        y2.kcexrzcfyt.wkgbmnqykc("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i13 + ")"));
    }

    private static String wkgbmnqykc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yadqdtsiqt.class != obj.getClass()) {
            return false;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        return this.f115708zoijcleaow.equals(yadqdtsiqtVar.f115708zoijcleaow) && Arrays.equals(this.f115707wkgbmnqykc, yadqdtsiqtVar.f115707wkgbmnqykc);
    }

    public int hashCode() {
        if (this.f115704eablkybsjg == 0) {
            this.f115704eablkybsjg = ((527 + this.f115708zoijcleaow.hashCode()) * 31) + Arrays.hashCode(this.f115707wkgbmnqykc);
        }
        return this.f115704eablkybsjg;
    }

    public androidx.media3.common.iobyxmoadg iobyxmoadg(int i13) {
        return this.f115707wkgbmnqykc[i13];
    }

    public String toString() {
        return this.f115708zoijcleaow + ": " + Arrays.toString(this.f115707wkgbmnqykc);
    }

    public int zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13 = 0;
        while (true) {
            androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr = this.f115707wkgbmnqykc;
            if (i13 >= iobyxmoadgVarArr.length) {
                return -1;
            }
            if (iobyxmoadgVar == iobyxmoadgVarArr[i13]) {
                return i13;
            }
            i13++;
        }
    }

    public yadqdtsiqt(String str, androidx.media3.common.iobyxmoadg... iobyxmoadgVarArr) {
        y2.iobyxmoadg.iobyxmoadg(iobyxmoadgVarArr.length > 0);
        this.f115708zoijcleaow = str;
        this.f115707wkgbmnqykc = iobyxmoadgVarArr;
        this.f115705iobyxmoadg = iobyxmoadgVarArr.length;
        int iGtknphoqwx = iwizpuwonk.gtknphoqwx(iobyxmoadgVarArr[0].f9769ojitshcjhn);
        this.f115706ppxfxbqfkf = iGtknphoqwx == -1 ? iwizpuwonk.gtknphoqwx(iobyxmoadgVarArr[0].f9744agtfadlqog) : iGtknphoqwx;
        gxszxtbevo();
    }
}

package iwxlajgraz;

import android.view.inputmethod.CursorAnchorInfo;
import j0.f;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final cdpycssgdh f49840iobyxmoadg = new cdpycssgdh();

    private cdpycssgdh() {
    }

    public static final CursorAnchorInfo.Builder iobyxmoadg(CursorAnchorInfo.Builder builder, f fVar, g.lqeggnwhkg lqeggnwhkgVar) {
        int iOxmwwwfdhm;
        int iOxmwwwfdhm2;
        if (!lqeggnwhkgVar.ojitshcjhn() && (iOxmwwwfdhm = fVar.oxmwwwfdhm(lqeggnwhkgVar.gtknphoqwx())) <= (iOxmwwwfdhm2 = fVar.oxmwwwfdhm(lqeggnwhkgVar.eablkybsjg()))) {
            while (true) {
                builder.addVisibleLineBounds(fVar.kcexrzcfyt(iOxmwwwfdhm), fVar.jyumaefscl(iOxmwwwfdhm), fVar.zdlpuopuiu(iOxmwwwfdhm), fVar.wflxmlrfwp(iOxmwwwfdhm));
                if (iOxmwwwfdhm == iOxmwwwfdhm2) {
                    break;
                }
                iOxmwwwfdhm++;
            }
        }
        return builder;
    }
}

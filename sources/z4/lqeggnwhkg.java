package z4;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import q4.oxmwwwfdhm;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f127761iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f127762zoijcleaow = new zoijcleaow();

    private static int eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
        int i13 = -1;
        int iGxszxtbevo = 0;
        while (i13 == -1) {
            iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            String strKcexrzcfyt = yadqdtsiqtVar.kcexrzcfyt();
            if (strKcexrzcfyt == null) {
                i13 = 0;
            } else if ("STYLE".equals(strKcexrzcfyt)) {
                i13 = 2;
            } else {
                i13 = strKcexrzcfyt.startsWith("NOTE") ? 1 : 3;
            }
        }
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        return i13;
    }

    private static void gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        while (!TextUtils.isEmpty(yadqdtsiqtVar.kcexrzcfyt())) {
        }
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        wkgbmnqykc wkgbmnqykcVarOjitshcjhn;
        this.f127761iobyxmoadg.ntlheqmsrt(bArr, i14 + i13);
        this.f127761iobyxmoadg.sopmlzcsov(i13);
        ArrayList arrayList = new ArrayList();
        try {
            nufgyqmvbu.wkgbmnqykc(this.f127761iobyxmoadg);
            while (!TextUtils.isEmpty(this.f127761iobyxmoadg.kcexrzcfyt())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iEablkybsjg = eablkybsjg(this.f127761iobyxmoadg);
                if (iEablkybsjg == 0) {
                    q4.dxjokdxxww.ppxfxbqfkf(new btonecajqb(arrayList2), zoijcleaowVar, wflxmlrfwpVar);
                    return;
                }
                if (iEablkybsjg == 1) {
                    gxszxtbevo(this.f127761iobyxmoadg);
                } else if (iEablkybsjg == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f127761iobyxmoadg.kcexrzcfyt();
                    arrayList.addAll(this.f127762zoijcleaow.wkgbmnqykc(this.f127761iobyxmoadg));
                } else if (iEablkybsjg == 3 && (wkgbmnqykcVarOjitshcjhn = eablkybsjg.ojitshcjhn(this.f127761iobyxmoadg, arrayList)) != null) {
                    arrayList2.add(wkgbmnqykcVarOjitshcjhn);
                }
            }
        } catch (ParserException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 1;
    }
}

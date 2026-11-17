package vw1;

import m9.wkgbmnqykc;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.webview_screen.api.models.GameScreenArgs;
import ru.myspar.proloyalty.webview_screen.api.models.SpecialProductsWebViewArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {
    static /* synthetic */ wkgbmnqykc nufgyqmvbu(iobyxmoadg iobyxmoadgVar, String str, AnalyticsPage analyticsPage, ww1.iobyxmoadg iobyxmoadgVar2, String str2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: simpleWebViewScreen");
        }
        if ((i13 & 4) != 0) {
            iobyxmoadgVar2 = ww1.iobyxmoadg.NONE;
        }
        if ((i13 & 8) != 0) {
            str2 = "";
        }
        return iobyxmoadgVar.lqeggnwhkg(str, analyticsPage, iobyxmoadgVar2, str2);
    }

    wkgbmnqykc eablkybsjg(SpecialProductsWebViewArgs specialProductsWebViewArgs);

    wkgbmnqykc gxszxtbevo(GameScreenArgs gameScreenArgs);

    wkgbmnqykc iobyxmoadg();

    wkgbmnqykc lqeggnwhkg(String str, AnalyticsPage analyticsPage, ww1.iobyxmoadg iobyxmoadgVar, String str2);

    wkgbmnqykc ppxfxbqfkf();

    wkgbmnqykc wkgbmnqykc(String str);

    wkgbmnqykc zoijcleaow();
}

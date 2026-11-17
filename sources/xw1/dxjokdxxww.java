package xw1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.webview_screen.api.models.GameScreenArgs;
import ru.myspar.proloyalty.webview_screen.api.models.SpecialProductsWebViewArgs;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewArgs;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;
import ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.MySparWebViewFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements vw1.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment agtfadlqog(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ojitshcjhn(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment oxmwwwfdhm(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment rgvfuqvkyq(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment vdvldrhtss(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc eablkybsjg(SpecialProductsWebViewArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.StringValue(args.getTitle()), args.getUrl(), null, true, null, 20, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xw1.eablkybsjg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.oxmwwwfdhm(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc gxszxtbevo(GameScreenArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.StringValue(q11.dxjokdxxww.ppxfxbqfkf()), args.getUrl(), ww1.iobyxmoadg.GAMES, false, null, 24, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xw1.gxszxtbevo
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.ojitshcjhn(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg() {
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.ResValue(ppxfxbqfkf.proloyalty_delivery_n_payment), "https://myspar.ru/m/shipping/", null, false, null, 28, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xw1.lqeggnwhkg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.agtfadlqog(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc lqeggnwhkg(String url, AnalyticsPage analyticsPage, ww1.iobyxmoadg scenario, String title) {
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(scenario, "scenario");
        zdlpuopuiu.btonecajqb(title, "title");
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.StringValue(title), url, scenario, false, analyticsPage, 8, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xw1.nufgyqmvbu
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.vdvldrhtss(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf() {
        return ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.ppxfxbqfkf.zoijcleaow();
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc wkgbmnqykc(String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.zoijcleaow.zoijcleaow(orderId);
    }

    @Override // vw1.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow() {
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.ResValue(ppxfxbqfkf.proloyalty_legal_information), "https://myspar.ru/m/info/", ww1.iobyxmoadg.LEGAL_INFORMATION, false, null, 24, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xw1.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.rgvfuqvkyq(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}

package za2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import k30.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.webview_screen.api.models.GameScreenArgs;
import ru.myspar.webview_screen.api.models.SpecialProductsWebViewArgs;
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewArgs;
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;
import ru.myspar.webview_screen.impl.myspar.presentation.MySparWebViewFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements ya2.iobyxmoadg {
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
    public static final Fragment rgvfuqvkyq(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment vdvldrhtss(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wflxmlrfwp(MySparWebViewArgs mySparWebViewArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return MySparWebViewFragment.INSTANCE.iobyxmoadg(mySparWebViewArgs);
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc eablkybsjg(GameScreenArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.StringValue(draadjrbmk.ppxfxbqfkf()), args.getUrl(), eb2.iobyxmoadg.GAMES, false, null, 24, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: za2.gxszxtbevo
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.agtfadlqog(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc gxszxtbevo(SpecialProductsWebViewArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.StringValue(args.getTitle()), args.getUrl(), null, true, null, 20, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: za2.eablkybsjg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.vdvldrhtss(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg() {
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.ResValue(ppxfxbqfkf.delivery_n_payment), "https://myspar.ru/m/shipping/", null, false, null, 28, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: za2.lqeggnwhkg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.wflxmlrfwp(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc lqeggnwhkg(String url, AnalyticsPage analyticsPage) {
        zdlpuopuiu.btonecajqb(url, "url");
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.StringValue(draadjrbmk.ppxfxbqfkf()), url, null, false, analyticsPage, 12, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: za2.nufgyqmvbu
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.rgvfuqvkyq(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf() {
        return ru.myspar.webview_screen.impl.chatorder.presentation.ppxfxbqfkf.zoijcleaow();
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc wkgbmnqykc(String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return ru.myspar.webview_screen.impl.trackingorder.presentation.zoijcleaow.zoijcleaow(orderId);
    }

    @Override // ya2.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow() {
        final MySparWebViewArgs mySparWebViewArgs = new MySparWebViewArgs(new MySparWebViewTitle.ResValue(ppxfxbqfkf.legal_information), "https://myspar.ru/m/info/", eb2.iobyxmoadg.LEGAL_INFORMATION, false, null, 24, null);
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: za2.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return dxjokdxxww.ojitshcjhn(mySparWebViewArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}

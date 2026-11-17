package eu;

import android.net.Uri;
import android.webkit.WebViewClient;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final iobyxmoadg f32035gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f32036lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f32037eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f32038iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private tg.iobyxmoadg f32039ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private draadjrbmk f32040wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private tg.iobyxmoadg f32041zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private enum zoijcleaow {
        SUCCESS("success", true),
        VERIFY("verify", true),
        CANCEL("cancel", false);


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f32046lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f32047yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f32048zdlpuopuiu;

        zoijcleaow(String str, boolean z13) {
            this.f32048zdlpuopuiu = str;
            this.f32047yggfygwlhe = z13;
        }

        public static ng.iobyxmoadg wkgbmnqykc() {
            return f32046lereixgezr;
        }

        public final String lqeggnwhkg() {
            return this.f32048zdlpuopuiu;
        }

        public final boolean nufgyqmvbu() {
            return this.f32047yggfygwlhe;
        }
    }

    public ppxfxbqfkf(l40.zoijcleaow apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f32037eablkybsjg = jyumaefscl.rgvfuqvkyq(apiEndPointsProvider.ppxfxbqfkf(), "sbox.payecom.ru");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        draadjrbmk draadjrbmkVar = ppxfxbqfkfVar.f32040wkgbmnqykc;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(message);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean gxszxtbevo(String str) {
        String strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(str);
        if (strWkgbmnqykc != null) {
            return this.f32037eablkybsjg.contains(strWkgbmnqykc);
        }
        return false;
    }

    private final zoijcleaow lqeggnwhkg(String str) {
        Object next;
        Iterator<E> it = zoijcleaow.wkgbmnqykc().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (zdlpuopuiu.eablkybsjg(((zoijcleaow) next).lqeggnwhkg(), str)) {
                return (zoijcleaow) next;
            }
        }
        next = null;
        return (zoijcleaow) next;
    }

    private final void nufgyqmvbu(String str) {
        zoijcleaow zoijcleaowVarLqeggnwhkg;
        if (this.f32038iobyxmoadg) {
            return;
        }
        Uri uri = Uri.parse(str);
        String lastPathSegment = uri.getLastPathSegment();
        if (!gxszxtbevo(uri.getHost())) {
            lastPathSegment = null;
        }
        if (lastPathSegment == null || (zoijcleaowVarLqeggnwhkg = lqeggnwhkg(lastPathSegment)) == null) {
            return;
        }
        if (zoijcleaowVarLqeggnwhkg.nufgyqmvbu()) {
            tg.iobyxmoadg iobyxmoadgVar = this.f32041zoijcleaow;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        } else {
            tg.iobyxmoadg iobyxmoadgVar2 = this.f32039ppxfxbqfkf;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.invoke();
            }
        }
        this.f32038iobyxmoadg = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, String str) {
        if (str != null) {
            ppxfxbqfkfVar.nufgyqmvbu(str);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void btonecajqb(tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.f32039ppxfxbqfkf = action;
    }

    public final void draadjrbmk(tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.f32041zoijcleaow = action;
    }

    public final void dxjokdxxww() {
        this.f32041zoijcleaow = null;
        this.f32039ppxfxbqfkf = null;
        this.f32040wkgbmnqykc = null;
    }

    public final void gtknphoqwx(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.f32040wkgbmnqykc = action;
    }

    public final WebViewClient ppxfxbqfkf() {
        return new ru.myspar.core.domain.utils.webview.iobyxmoadg(new p30.iobyxmoadg(null, new draadjrbmk() { // from class: eu.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wkgbmnqykc(this.f32034zdlpuopuiu, (String) obj);
            }
        }, null, new draadjrbmk() { // from class: eu.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.eablkybsjg(this.f32055zdlpuopuiu, (String) obj);
            }
        }, 5, null));
    }
}

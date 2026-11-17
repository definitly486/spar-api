package ys0;

import android.net.Uri;
import android.webkit.WebViewClient;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import q11.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f126328eablkybsjg = jyumaefscl.rgvfuqvkyq("myspar", "sbox.payecom.ru");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f126329iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private tg.iobyxmoadg f126330ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private draadjrbmk f126331wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private tg.iobyxmoadg f126332zoijcleaow;

    private enum iobyxmoadg {
        SUCCESS("success", true),
        VERIFY("verify", true),
        CANCEL("cancel", false);


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f126337lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f126338yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f126339zdlpuopuiu;

        iobyxmoadg(String str, boolean z13) {
            this.f126339zdlpuopuiu = str;
            this.f126338yggfygwlhe = z13;
        }

        public static ng.iobyxmoadg wkgbmnqykc() {
            return f126337lereixgezr;
        }

        public final String lqeggnwhkg() {
            return this.f126339zdlpuopuiu;
        }

        public final boolean nufgyqmvbu() {
            return this.f126338yggfygwlhe;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        draadjrbmk draadjrbmkVar = ppxfxbqfkfVar.f126331wkgbmnqykc;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(message);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean gxszxtbevo(String str) {
        String strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(str);
        if (strWkgbmnqykc == null) {
            return false;
        }
        List list = this.f126328eablkybsjg;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (kcexrzcfyt.sopmlzcsov(strWkgbmnqykc, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final iobyxmoadg lqeggnwhkg(String str) {
        Object next;
        Iterator<E> it = iobyxmoadg.wkgbmnqykc().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (zdlpuopuiu.eablkybsjg(((iobyxmoadg) next).lqeggnwhkg(), str)) {
                return (iobyxmoadg) next;
            }
        }
        next = null;
        return (iobyxmoadg) next;
    }

    private final void nufgyqmvbu(String str) {
        iobyxmoadg iobyxmoadgVarLqeggnwhkg;
        if (this.f126329iobyxmoadg) {
            return;
        }
        Uri uri = Uri.parse(str);
        String lastPathSegment = uri.getLastPathSegment();
        if (!gxszxtbevo(uri.getHost())) {
            lastPathSegment = null;
        }
        if (lastPathSegment == null || (iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(lastPathSegment)) == null) {
            return;
        }
        if (iobyxmoadgVarLqeggnwhkg.nufgyqmvbu()) {
            tg.iobyxmoadg iobyxmoadgVar = this.f126332zoijcleaow;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        } else {
            tg.iobyxmoadg iobyxmoadgVar2 = this.f126330ppxfxbqfkf;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.invoke();
            }
        }
        this.f126329iobyxmoadg = true;
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
        this.f126330ppxfxbqfkf = action;
    }

    public final void draadjrbmk(tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.f126332zoijcleaow = action;
    }

    public final void dxjokdxxww() {
        this.f126332zoijcleaow = null;
        this.f126330ppxfxbqfkf = null;
        this.f126331wkgbmnqykc = null;
    }

    public final void gtknphoqwx(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.f126331wkgbmnqykc = action;
    }

    public final WebViewClient ppxfxbqfkf() {
        return new ru.myspar.proloyalty.core.domain.utils.webview.iobyxmoadg(new v11.iobyxmoadg(null, new draadjrbmk() { // from class: ys0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wkgbmnqykc(this.f126327zdlpuopuiu, (String) obj);
            }
        }, null, new draadjrbmk() { // from class: ys0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.eablkybsjg(this.f126346zdlpuopuiu, (String) obj);
            }
        }, 5, null));
    }
}

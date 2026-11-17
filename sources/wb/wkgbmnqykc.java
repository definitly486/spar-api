package wb;

import android.os.Bundle;
import androidx.appcompat.app.yggfygwlhe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.iobyxmoadg f119207iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile zb.zoijcleaow f119208ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f119209wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile yb.iobyxmoadg f119210zoijcleaow;

    public wkgbmnqykc(tc.iobyxmoadg iobyxmoadgVar) {
        this(iobyxmoadgVar, new zb.ppxfxbqfkf(), new yb.ppxfxbqfkf());
    }

    private static sb.iobyxmoadg.InterfaceC2591iobyxmoadg btonecajqb(sb.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        iobyxmoadgVar.iobyxmoadg("clx", eablkybsjgVar);
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        iobyxmoadgVar.iobyxmoadg("crash", eablkybsjgVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dxjokdxxww(tc.zoijcleaow zoijcleaowVar) {
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("AnalyticsConnector now available.");
        yggfygwlhe.iobyxmoadg(zoijcleaowVar.get());
        new yb.zoijcleaow(null);
        btonecajqb(null, new eablkybsjg());
        xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private void gxszxtbevo() {
        this.f119207iobyxmoadg.iobyxmoadg(new tc.iobyxmoadg.InterfaceC2704iobyxmoadg() { // from class: wb.ppxfxbqfkf
            @Override // tc.iobyxmoadg.InterfaceC2704iobyxmoadg
            public final void iobyxmoadg(tc.zoijcleaow zoijcleaowVar) {
                this.f119206iobyxmoadg.dxjokdxxww(zoijcleaowVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(String str, Bundle bundle) {
        this.f119210zoijcleaow.iobyxmoadg(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nufgyqmvbu(zb.iobyxmoadg iobyxmoadgVar) {
        synchronized (this) {
            try {
                if (this.f119208ppxfxbqfkf instanceof zb.ppxfxbqfkf) {
                    this.f119209wkgbmnqykc.add(iobyxmoadgVar);
                }
                this.f119208ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zb.zoijcleaow eablkybsjg() {
        return new zb.zoijcleaow() { // from class: wb.iobyxmoadg
            @Override // zb.zoijcleaow
            public final void iobyxmoadg(zb.iobyxmoadg iobyxmoadgVar) {
                this.f119205iobyxmoadg.nufgyqmvbu(iobyxmoadgVar);
            }
        };
    }

    public yb.iobyxmoadg wkgbmnqykc() {
        return new yb.iobyxmoadg() { // from class: wb.zoijcleaow
            @Override // yb.iobyxmoadg
            public final void iobyxmoadg(String str, Bundle bundle) {
                this.f119211iobyxmoadg.lqeggnwhkg(str, bundle);
            }
        };
    }

    public wkgbmnqykc(tc.iobyxmoadg iobyxmoadgVar, zb.zoijcleaow zoijcleaowVar, yb.iobyxmoadg iobyxmoadgVar2) {
        this.f119207iobyxmoadg = iobyxmoadgVar;
        this.f119208ppxfxbqfkf = zoijcleaowVar;
        this.f119209wkgbmnqykc = new ArrayList();
        this.f119210zoijcleaow = iobyxmoadgVar2;
        gxszxtbevo();
    }
}

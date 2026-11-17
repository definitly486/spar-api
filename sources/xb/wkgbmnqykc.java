package xb;

import dc.iozdgvuglv;
import dc.lmojexxdyd;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements xb.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final nufgyqmvbu f121967ppxfxbqfkf = new zoijcleaow();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.iobyxmoadg f121968iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicReference f121969zoijcleaow = new AtomicReference(null);

    private static final class zoijcleaow implements nufgyqmvbu {
        private zoijcleaow() {
        }

        @Override // xb.nufgyqmvbu
        public File eablkybsjg() {
            return null;
        }

        @Override // xb.nufgyqmvbu
        public File gxszxtbevo() {
            return null;
        }

        @Override // xb.nufgyqmvbu
        public File iobyxmoadg() {
            return null;
        }

        @Override // xb.nufgyqmvbu
        public File lqeggnwhkg() {
            return null;
        }

        @Override // xb.nufgyqmvbu
        public File ppxfxbqfkf() {
            return null;
        }

        @Override // xb.nufgyqmvbu
        public File wkgbmnqykc() {
            return null;
        }

        @Override // xb.nufgyqmvbu
        public iozdgvuglv.iobyxmoadg zoijcleaow() {
            return null;
        }
    }

    public wkgbmnqykc(tc.iobyxmoadg iobyxmoadgVar) {
        this.f121968iobyxmoadg = iobyxmoadgVar;
        iobyxmoadgVar.iobyxmoadg(new tc.iobyxmoadg.InterfaceC2704iobyxmoadg() { // from class: xb.zoijcleaow
            @Override // tc.iobyxmoadg.InterfaceC2704iobyxmoadg
            public final void iobyxmoadg(tc.zoijcleaow zoijcleaowVar) {
                this.f121970iobyxmoadg.lqeggnwhkg(zoijcleaowVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(tc.zoijcleaow zoijcleaowVar) {
        lqeggnwhkg.gxszxtbevo().zoijcleaow("Crashlytics native component now available.");
        this.f121969zoijcleaow.set((xb.iobyxmoadg) zoijcleaowVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nufgyqmvbu(String str, String str2, long j13, lmojexxdyd lmojexxdydVar, tc.zoijcleaow zoijcleaowVar) {
        ((xb.iobyxmoadg) zoijcleaowVar.get()).wkgbmnqykc(str, str2, j13, lmojexxdydVar);
    }

    @Override // xb.iobyxmoadg
    public nufgyqmvbu iobyxmoadg(String str) {
        xb.iobyxmoadg iobyxmoadgVar = (xb.iobyxmoadg) this.f121969zoijcleaow.get();
        return iobyxmoadgVar == null ? f121967ppxfxbqfkf : iobyxmoadgVar.iobyxmoadg(str);
    }

    @Override // xb.iobyxmoadg
    public boolean ppxfxbqfkf(String str) {
        xb.iobyxmoadg iobyxmoadgVar = (xb.iobyxmoadg) this.f121969zoijcleaow.get();
        return iobyxmoadgVar != null && iobyxmoadgVar.ppxfxbqfkf(str);
    }

    @Override // xb.iobyxmoadg
    public void wkgbmnqykc(final String str, final String str2, final long j13, final lmojexxdyd lmojexxdydVar) {
        lqeggnwhkg.gxszxtbevo().dxjokdxxww("Deferring native open session: " + str);
        this.f121968iobyxmoadg.iobyxmoadg(new tc.iobyxmoadg.InterfaceC2704iobyxmoadg() { // from class: xb.ppxfxbqfkf
            @Override // tc.iobyxmoadg.InterfaceC2704iobyxmoadg
            public final void iobyxmoadg(tc.zoijcleaow zoijcleaowVar) {
                wkgbmnqykc.nufgyqmvbu(str, str2, j13, lmojexxdydVar, zoijcleaowVar);
            }
        });
    }

    @Override // xb.iobyxmoadg
    public boolean zoijcleaow() {
        xb.iobyxmoadg iobyxmoadgVar = (xb.iobyxmoadg) this.f121969zoijcleaow.get();
        return iobyxmoadgVar != null && iobyxmoadgVar.zoijcleaow();
    }
}

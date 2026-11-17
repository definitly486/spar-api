package androidx.camera.view;

import androidx.lifecycle.pmvmpeiblj;
import istkbnxepw.iwizpuwonk;
import istkbnxepw.jyumaefscl;
import istkbnxepw.sopmlzcsov;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements sopmlzcsov.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    com.google.common.util.concurrent.wkgbmnqykc f4186eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f4187gxszxtbevo = false;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f4188iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private PreviewView.eablkybsjg f4189ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f4190wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pmvmpeiblj f4191zoijcleaow;

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f4192iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ lereixgezr.agtfadlqog f4194zoijcleaow;

        iobyxmoadg(List list, lereixgezr.agtfadlqog agtfadlqogVar) {
            this.f4192iobyxmoadg = list;
            this.f4194zoijcleaow = agtfadlqogVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            wkgbmnqykc.this.f4186eablkybsjg = null;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            wkgbmnqykc.this.f4186eablkybsjg = null;
            if (this.f4192iobyxmoadg.isEmpty()) {
                return;
            }
            Iterator it = this.f4192iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((jyumaefscl) this.f4194zoijcleaow).lqeggnwhkg((istkbnxepw.nufgyqmvbu) it.next());
            }
            this.f4192iobyxmoadg.clear();
        }
    }

    class zoijcleaow extends istkbnxepw.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f4195iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ lereixgezr.agtfadlqog f4197zoijcleaow;

        zoijcleaow(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, lereixgezr.agtfadlqog agtfadlqogVar) {
            this.f4195iobyxmoadg = iobyxmoadgVar;
            this.f4197zoijcleaow = agtfadlqogVar;
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(int i13, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            this.f4195iobyxmoadg.ppxfxbqfkf(null);
            ((jyumaefscl) this.f4197zoijcleaow).lqeggnwhkg(this);
        }
    }

    wkgbmnqykc(jyumaefscl jyumaefsclVar, pmvmpeiblj pmvmpeibljVar, dxjokdxxww dxjokdxxwwVar) {
        this.f4188iobyxmoadg = jyumaefsclVar;
        this.f4191zoijcleaow = pmvmpeibljVar;
        this.f4190wkgbmnqykc = dxjokdxxwwVar;
        synchronized (this) {
            this.f4189ppxfxbqfkf = (PreviewView.eablkybsjg) pmvmpeibljVar.gxszxtbevo();
        }
    }

    private com.google.common.util.concurrent.wkgbmnqykc agtfadlqog(final lereixgezr.agtfadlqog agtfadlqogVar, final List list) {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: androidx.camera.view.iobyxmoadg
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f4165iobyxmoadg.btonecajqb(agtfadlqogVar, list, iobyxmoadgVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object btonecajqb(lereixgezr.agtfadlqog agtfadlqogVar, List list, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVar, agtfadlqogVar);
        list.add(zoijcleaowVar);
        ((jyumaefscl) agtfadlqogVar).btonecajqb(yadqdtsiqt.iobyxmoadg.iobyxmoadg(), zoijcleaowVar);
        return "waitForCaptureResult";
    }

    private void draadjrbmk(lereixgezr.agtfadlqog agtfadlqogVar) {
        wflxmlrfwp(PreviewView.eablkybsjg.IDLE);
        ArrayList arrayList = new ArrayList();
        iozdgvuglv.wkgbmnqykc wkgbmnqykcVarEablkybsjg = iozdgvuglv.wkgbmnqykc.zoijcleaow(agtfadlqog(agtfadlqogVar, arrayList)).gxszxtbevo(new iozdgvuglv.iobyxmoadg() { // from class: androidx.camera.view.zoijcleaow
            @Override // iozdgvuglv.iobyxmoadg
            public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                return this.f4210iobyxmoadg.nufgyqmvbu((Void) obj);
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg()).eablkybsjg(new ojitshcjhn.iobyxmoadg() { // from class: androidx.camera.view.ppxfxbqfkf
            @Override // ojitshcjhn.iobyxmoadg
            public final Object apply(Object obj) {
                return this.f4181iobyxmoadg.dxjokdxxww((Void) obj);
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        this.f4186eablkybsjg = wkgbmnqykcVarEablkybsjg;
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarEablkybsjg, new iobyxmoadg(arrayList, agtfadlqogVar), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void dxjokdxxww(Void r13) {
        wflxmlrfwp(PreviewView.eablkybsjg.STREAMING);
        return null;
    }

    private void gxszxtbevo() {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = this.f4186eablkybsjg;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.cancel(false);
            this.f4186eablkybsjg = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc nufgyqmvbu(Void r13) {
        return this.f4190wkgbmnqykc.dxjokdxxww();
    }

    @Override // istkbnxepw.sopmlzcsov.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == iwizpuwonk.iobyxmoadg.CLOSING || iobyxmoadgVar == iwizpuwonk.iobyxmoadg.CLOSED || iobyxmoadgVar == iwizpuwonk.iobyxmoadg.RELEASING || iobyxmoadgVar == iwizpuwonk.iobyxmoadg.RELEASED) {
            wflxmlrfwp(PreviewView.eablkybsjg.IDLE);
            if (this.f4187gxszxtbevo) {
                this.f4187gxszxtbevo = false;
                gxszxtbevo();
                return;
            }
            return;
        }
        if ((iobyxmoadgVar == iwizpuwonk.iobyxmoadg.OPENING || iobyxmoadgVar == iwizpuwonk.iobyxmoadg.OPEN || iobyxmoadgVar == iwizpuwonk.iobyxmoadg.PENDING_OPEN) && !this.f4187gxszxtbevo) {
            draadjrbmk(this.f4188iobyxmoadg);
            this.f4187gxszxtbevo = true;
        }
    }

    void lqeggnwhkg() {
        gxszxtbevo();
    }

    @Override // istkbnxepw.sopmlzcsov.iobyxmoadg
    public void ppxfxbqfkf(Throwable th2) {
        lqeggnwhkg();
        wflxmlrfwp(PreviewView.eablkybsjg.IDLE);
    }

    void wflxmlrfwp(PreviewView.eablkybsjg eablkybsjgVar) {
        synchronized (this) {
            try {
                if (this.f4189ppxfxbqfkf.equals(eablkybsjgVar)) {
                    return;
                }
                this.f4189ppxfxbqfkf = eablkybsjgVar;
                lereixgezr.sopmlzcsov.iobyxmoadg("StreamStateObserver", "Update Preview stream state to " + eablkybsjgVar);
                this.f4191zoijcleaow.wflxmlrfwp(eablkybsjgVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

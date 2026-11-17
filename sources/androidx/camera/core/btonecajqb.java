package androidx.camera.core;

import istkbnxepw.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb extends dxjokdxxww {

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f3662iobyxmoadg;

        iobyxmoadg(agtfadlqog agtfadlqogVar) {
            this.f3662iobyxmoadg = agtfadlqogVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            this.f3662iobyxmoadg.close();
        }
    }

    btonecajqb() {
    }

    @Override // androidx.camera.core.dxjokdxxww
    void lqeggnwhkg() {
    }

    @Override // androidx.camera.core.dxjokdxxww
    void ojitshcjhn(agtfadlqog agtfadlqogVar) {
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(eablkybsjg(agtfadlqogVar), new iobyxmoadg(agtfadlqogVar), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    @Override // androidx.camera.core.dxjokdxxww
    agtfadlqog wkgbmnqykc(cllcsxoeiz cllcsxoeizVar) {
        return cllcsxoeizVar.nufgyqmvbu();
    }
}

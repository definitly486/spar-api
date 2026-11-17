package zs;

import ah.gtknphoqwx;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.cqumvgiudr;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements wg.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f131109iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private d8.zoijcleaow f131110zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f131111yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f131112zdlpuopuiu;

        /* JADX INFO: renamed from: zs.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3350iobyxmoadg implements gxszxtbevo {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f131113zdlpuopuiu;

            C3350iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
                this.f131113zdlpuopuiu = ppxfxbqfkfVar;
            }

            @Override // androidx.lifecycle.gxszxtbevo
            public void onDestroy(vdvldrhtss owner) {
                zdlpuopuiu.btonecajqb(owner, "owner");
                this.f131113zdlpuopuiu.f131110zoijcleaow = null;
            }
        }

        iobyxmoadg(Fragment fragment, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f131112zdlpuopuiu = fragment;
            this.f131111yggfygwlhe = ppxfxbqfkfVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, vdvldrhtss vdvldrhtssVar) {
            vdvldrhtssVar.getLifecycle().iobyxmoadg(new C3350iobyxmoadg(ppxfxbqfkfVar));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void lqeggnwhkg(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            cqumvgiudr viewLifecycleOwnerLiveData = this.f131112zdlpuopuiu.getViewLifecycleOwnerLiveData();
            Fragment fragment = this.f131112zdlpuopuiu;
            final ppxfxbqfkf ppxfxbqfkfVar = this.f131111yggfygwlhe;
            viewLifecycleOwnerLiveData.dxjokdxxww(fragment, new wkgbmnqykc.iobyxmoadg(new draadjrbmk() { // from class: zs.zoijcleaow
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ppxfxbqfkf.iobyxmoadg.zoijcleaow(ppxfxbqfkfVar, (vdvldrhtss) obj);
                }
            }));
        }
    }

    public ppxfxbqfkf(Fragment fragment, tg.iobyxmoadg viewFactory) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(viewFactory, "viewFactory");
        this.f131109iobyxmoadg = viewFactory;
        fragment.getLifecycle().iobyxmoadg(new iobyxmoadg(fragment, this));
    }

    @Override // wg.wkgbmnqykc
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public d8.zoijcleaow iobyxmoadg(Fragment thisRef, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(thisRef, "thisRef");
        zdlpuopuiu.btonecajqb(property, "property");
        d8.zoijcleaow zoijcleaowVar = this.f131110zoijcleaow;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        if (!thisRef.getViewLifecycleOwner().getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get viewImpl when Fragment views are destroyed.");
        }
        d8.zoijcleaow zoijcleaowVar2 = (d8.zoijcleaow) this.f131109iobyxmoadg.invoke();
        this.f131110zoijcleaow = zoijcleaowVar2;
        return zoijcleaowVar2;
    }
}

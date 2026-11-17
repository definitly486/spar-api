package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f9420iobyxmoadg = new btonecajqb();

    public static final class iobyxmoadg implements q5.gxszxtbevo.iobyxmoadg {
        @Override // q5.gxszxtbevo.iobyxmoadg
        public void iobyxmoadg(q5.dxjokdxxww owner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
            if (!(owner instanceof ribwqtqdhb)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            jlmebxxoox viewModelStore = ((ribwqtqdhb) owner).getViewModelStore();
            q5.gxszxtbevo savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.ppxfxbqfkf().iterator();
            while (it.hasNext()) {
                ntlheqmsrt ntlheqmsrtVarZoijcleaow = viewModelStore.zoijcleaow((String) it.next());
                if (ntlheqmsrtVarZoijcleaow != null) {
                    btonecajqb.iobyxmoadg(ntlheqmsrtVarZoijcleaow, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.ppxfxbqfkf().isEmpty()) {
                return;
            }
            savedStateRegistry.wkgbmnqykc(iobyxmoadg.class);
        }
    }

    public static final class zoijcleaow implements agtfadlqog {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ q5.gxszxtbevo f9421yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f9422zdlpuopuiu;

        zoijcleaow(gtknphoqwx gtknphoqwxVar, q5.gxszxtbevo gxszxtbevoVar) {
            this.f9422zdlpuopuiu = gtknphoqwxVar;
            this.f9421yggfygwlhe = gxszxtbevoVar;
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(vdvldrhtss source, gtknphoqwx.iobyxmoadg event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            if (event == gtknphoqwx.iobyxmoadg.ON_START) {
                this.f9422zdlpuopuiu.wkgbmnqykc(this);
                this.f9421yggfygwlhe.wkgbmnqykc(iobyxmoadg.class);
            }
        }
    }

    private btonecajqb() {
    }

    public static final void iobyxmoadg(ntlheqmsrt viewModel, q5.gxszxtbevo registry, gtknphoqwx lifecycle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModel, "viewModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(registry, "registry");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycle, "lifecycle");
        jpowsppfya jpowsppfyaVar = (jpowsppfya) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (jpowsppfyaVar == null || jpowsppfyaVar.dxjokdxxww()) {
            return;
        }
        jpowsppfyaVar.iobyxmoadg(registry, lifecycle);
        f9420iobyxmoadg.ppxfxbqfkf(registry, lifecycle);
    }

    private final void ppxfxbqfkf(q5.gxszxtbevo gxszxtbevoVar, gtknphoqwx gtknphoqwxVar) {
        gtknphoqwx.zoijcleaow zoijcleaowVarZoijcleaow = gtknphoqwxVar.zoijcleaow();
        if (zoijcleaowVarZoijcleaow == gtknphoqwx.zoijcleaow.INITIALIZED || zoijcleaowVarZoijcleaow.wkgbmnqykc(gtknphoqwx.zoijcleaow.STARTED)) {
            gxszxtbevoVar.wkgbmnqykc(iobyxmoadg.class);
        } else {
            gtknphoqwxVar.iobyxmoadg(new zoijcleaow(gtknphoqwxVar, gxszxtbevoVar));
        }
    }

    public static final jpowsppfya zoijcleaow(q5.gxszxtbevo registry, gtknphoqwx lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(registry, "registry");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycle, "lifecycle");
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str);
        jpowsppfya jpowsppfyaVar = new jpowsppfya(str, pkzmftpjix.f9541ppxfxbqfkf.iobyxmoadg(registry.iobyxmoadg(str), bundle));
        jpowsppfyaVar.iobyxmoadg(registry, lifecycle);
        f9420iobyxmoadg.ppxfxbqfkf(registry, lifecycle);
        return jpowsppfyaVar;
    }
}

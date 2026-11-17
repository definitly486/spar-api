package ao;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.ads.impl.domain.image.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void vipkmwdibw() {
        String bannerUrl = ((State) jlmebxxoox()).getBannerUrl();
        if (bannerUrl != null) {
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(bannerUrl));
            crxdokpmqz(eablkybsjg.iobyxmoadg.f14022iobyxmoadg);
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f14027iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f14022iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f14028iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.zoijcleaow.f14024iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f14029iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw();
        }
    }
}

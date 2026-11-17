package lm0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.impl.domain.image.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void vipkmwdibw() {
        String bannerUrl = ((State) jlmebxxoox()).getBannerUrl();
        if (bannerUrl != null) {
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(bannerUrl));
            crxdokpmqz(eablkybsjg.iobyxmoadg.f63603iobyxmoadg);
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f63608iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f63603iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f63609iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.zoijcleaow.f63605iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f63610iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw();
        }
    }
}

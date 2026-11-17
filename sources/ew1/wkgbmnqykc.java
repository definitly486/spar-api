package ew1;

import dw1.TokenInfoEntity;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fw1.iobyxmoadg f32288iobyxmoadg;

    public wkgbmnqykc(fw1.iobyxmoadg userLocalSource) {
        zdlpuopuiu.btonecajqb(userLocalSource, "userLocalSource");
        this.f32288iobyxmoadg = userLocalSource;
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        zdlpuopuiu.btonecajqb(chain, "chain");
        TokenInfoEntity tokenInfoEntityPmvmpeiblj = this.f32288iobyxmoadg.pmvmpeiblj();
        return tokenInfoEntityPmvmpeiblj == null ? chain.zoijcleaow(chain.dxjokdxxww()) : chain.zoijcleaow(ppxfxbqfkf.draadjrbmk(chain.dxjokdxxww(), tokenInfoEntityPmvmpeiblj.getToken()));
    }
}

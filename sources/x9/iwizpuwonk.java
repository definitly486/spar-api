package x9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class iwizpuwonk implements s9.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f121768iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fg.iobyxmoadg f121769ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final fg.iobyxmoadg f121770wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fg.iobyxmoadg f121771zoijcleaow;

    public iwizpuwonk(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.f121768iobyxmoadg = iobyxmoadgVar;
        this.f121771zoijcleaow = iobyxmoadgVar2;
        this.f121769ppxfxbqfkf = iobyxmoadgVar3;
        this.f121770wkgbmnqykc = iobyxmoadgVar4;
    }

    public static iwizpuwonk iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        return new iwizpuwonk(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4);
    }

    public static jyumaefscl ppxfxbqfkf(Executor executor, y9.wkgbmnqykc wkgbmnqykcVar, cqumvgiudr cqumvgiudrVar, z9.iobyxmoadg iobyxmoadgVar) {
        return new jyumaefscl(executor, wkgbmnqykcVar, cqumvgiudrVar, iobyxmoadgVar);
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public jyumaefscl get() {
        return ppxfxbqfkf((Executor) this.f121768iobyxmoadg.get(), (y9.wkgbmnqykc) this.f121771zoijcleaow.get(), (cqumvgiudr) this.f121769ppxfxbqfkf.get(), (z9.iobyxmoadg) this.f121770wkgbmnqykc.get());
    }
}

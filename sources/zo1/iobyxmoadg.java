package zo1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.onboarding.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f130642ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final C3341iobyxmoadg f130641wkgbmnqykc = new C3341iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f130640eablkybsjg = 8;

    /* JADX INFO: renamed from: zo1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C3341iobyxmoadg {
        public /* synthetic */ C3341iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3341iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f130642ppxfxbqfkf = dispatchersProvider;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ppxfxbqfkf.iobyxmoadg) {
            if (((State) jlmebxxoox()).getCurrentPage() == 3) {
                crxdokpmqz(wkgbmnqykc.zoijcleaow.f130646iobyxmoadg);
                return;
            } else {
                ulzqkzuiru(eablkybsjg.zoijcleaow.f130635iobyxmoadg);
                return;
            }
        }
        if (!(intent instanceof ppxfxbqfkf.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((State) jlmebxxoox()).getCurrentPage() == 0) {
            crxdokpmqz(wkgbmnqykc.iobyxmoadg.f130645iobyxmoadg);
        } else {
            ulzqkzuiru(eablkybsjg.iobyxmoadg.f130634iobyxmoadg);
        }
    }
}

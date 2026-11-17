package d32;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.onboarding.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f26917ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final C0490iobyxmoadg f26916wkgbmnqykc = new C0490iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f26915eablkybsjg = 8;

    /* JADX INFO: renamed from: d32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0490iobyxmoadg {
        public /* synthetic */ C0490iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0490iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f26917ppxfxbqfkf = dispatchersProvider;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ppxfxbqfkf.iobyxmoadg) {
            if (((State) jlmebxxoox()).getCurrentPage() == 3) {
                crxdokpmqz(wkgbmnqykc.zoijcleaow.f26921iobyxmoadg);
                return;
            } else {
                ulzqkzuiru(eablkybsjg.zoijcleaow.f26910iobyxmoadg);
                return;
            }
        }
        if (!(intent instanceof ppxfxbqfkf.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((State) jlmebxxoox()).getCurrentPage() == 0) {
            crxdokpmqz(wkgbmnqykc.iobyxmoadg.f26920iobyxmoadg);
        } else {
            ulzqkzuiru(eablkybsjg.iobyxmoadg.f26909iobyxmoadg);
        }
    }
}

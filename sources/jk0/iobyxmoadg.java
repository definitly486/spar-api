package jk0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.State;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C1110iobyxmoadg f51627ppxfxbqfkf = new C1110iobyxmoadg(null);

    /* JADX INFO: renamed from: jk0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1110iobyxmoadg {
        public /* synthetic */ C1110iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1110iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void ikoacuggdj() {
        ulzqkzuiru(new eablkybsjg.iobyxmoadg(((State) jlmebxxoox()).getProductSetCount() + 1));
    }

    private final void ribwqtqdhb() {
        Integer numValueOf = Integer.valueOf(((State) jlmebxxoox()).getProductSetCount() - 1);
        if (numValueOf.intValue() <= 1) {
            numValueOf = null;
        }
        ulzqkzuiru(new eablkybsjg.iobyxmoadg(numValueOf != null ? numValueOf.intValue() : 1));
    }

    private final void vipkmwdibw() {
        crxdokpmqz(new wkgbmnqykc.iobyxmoadg(((State) jlmebxxoox()).getProductSetCount()));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.iobyxmoadg.f51628iobyxmoadg)) {
            ribwqtqdhb();
        } else if (zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.C1111ppxfxbqfkf.f51629iobyxmoadg)) {
            ikoacuggdj();
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.zoijcleaow.f51630iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw();
        }
    }
}

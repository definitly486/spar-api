package v60;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final s60.iobyxmoadg f116193zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: v60.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2888iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2888iobyxmoadg f116194iobyxmoadg = new C2888iobyxmoadg();

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private static final String f116195zoijcleaow = null;

            private C2888iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2888iobyxmoadg);
            }

            public int hashCode() {
                return -512043931;
            }

            @Override // v60.zoijcleaow.iobyxmoadg
            public String iobyxmoadg() {
                return f116195zoijcleaow;
            }

            public String toString() {
                return "ForCart";
            }
        }

        /* JADX INFO: renamed from: v60.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C2889zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f116196iobyxmoadg;

            public C2889zoijcleaow(String orderId) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f116196iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2889zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116196iobyxmoadg, ((C2889zoijcleaow) obj).f116196iobyxmoadg);
            }

            public int hashCode() {
                return this.f116196iobyxmoadg.hashCode();
            }

            @Override // v60.zoijcleaow.iobyxmoadg
            public String iobyxmoadg() {
                return this.f116196iobyxmoadg;
            }

            public String toString() {
                return "ForEditOrder(orderId=" + this.f116196iobyxmoadg + ")";
            }
        }

        String iobyxmoadg();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(s60.iobyxmoadg remoteSource, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f116193zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f116193zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}

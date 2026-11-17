package k51;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h51.iobyxmoadg f53876zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: k51.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1155iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1155iobyxmoadg f53877iobyxmoadg = new C1155iobyxmoadg();

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private static final String f53878zoijcleaow = null;

            private C1155iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1155iobyxmoadg);
            }

            public int hashCode() {
                return 1682859144;
            }

            @Override // k51.zoijcleaow.iobyxmoadg
            public String iobyxmoadg() {
                return f53878zoijcleaow;
            }

            public String toString() {
                return "ForCart";
            }
        }

        /* JADX INFO: renamed from: k51.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C1156zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f53879iobyxmoadg;

            public C1156zoijcleaow(String orderId) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f53879iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f53879iobyxmoadg, ((C1156zoijcleaow) obj).f53879iobyxmoadg);
            }

            public int hashCode() {
                return this.f53879iobyxmoadg.hashCode();
            }

            @Override // k51.zoijcleaow.iobyxmoadg
            public String iobyxmoadg() {
                return this.f53879iobyxmoadg;
            }

            public String toString() {
                return "ForEditOrder(orderId=" + this.f53879iobyxmoadg + ")";
            }
        }

        String iobyxmoadg();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(h51.iobyxmoadg remoteSource, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f53876zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f53876zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}

package v20;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import w10.agtfadlqog;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f115850zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f115851iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f115851iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f115851iobyxmoadg == ((iobyxmoadg) obj).f115851iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f115851iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f115851iobyxmoadg;
        }

        public String toString() {
            return "Params(isOrders=" + this.f115851iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(agtfadlqog pushRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(pushRemoteSource, "pushRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f115850zoijcleaow = pushRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadgVar.iobyxmoadg() ? this.f115850zoijcleaow.zoijcleaow(gxszxtbevoVar) : this.f115850zoijcleaow.iobyxmoadg(gxszxtbevoVar);
    }
}

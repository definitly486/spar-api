package o01;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.zoijcleaow f71538zoijcleaow;

    /* JADX INFO: renamed from: o01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1546iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71539iobyxmoadg;

        public C1546iobyxmoadg(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f71539iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1546iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71539iobyxmoadg, ((C1546iobyxmoadg) obj).f71539iobyxmoadg);
        }

        public int hashCode() {
            return this.f71539iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71539iobyxmoadg;
        }

        public String toString() {
            return "Params(cardId=" + this.f71539iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k01.zoijcleaow cardRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cardRemoteSource, "cardRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71538zoijcleaow = cardRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1546iobyxmoadg c1546iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f71538zoijcleaow.zoijcleaow(c1546iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}

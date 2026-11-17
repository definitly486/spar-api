package e20;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.zoijcleaow f30229zoijcleaow;

    /* JADX INFO: renamed from: e20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0633iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30230iobyxmoadg;

        public C0633iobyxmoadg(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f30230iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0633iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30230iobyxmoadg, ((C0633iobyxmoadg) obj).f30230iobyxmoadg);
        }

        public int hashCode() {
            return this.f30230iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f30230iobyxmoadg;
        }

        public String toString() {
            return "Params(cardId=" + this.f30230iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(w10.zoijcleaow cardRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cardRemoteSource, "cardRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f30229zoijcleaow = cardRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0633iobyxmoadg c0633iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f30229zoijcleaow.zoijcleaow(c0633iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}

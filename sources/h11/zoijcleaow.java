package h11;

import k01.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f39084zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(draadjrbmk remoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39084zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f39084zoijcleaow.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f39085iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f39086zoijcleaow;

        public iobyxmoadg(boolean z13, String str) {
            this.f39085iobyxmoadg = z13;
            this.f39086zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f39085iobyxmoadg == iobyxmoadgVar.f39085iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f39086zoijcleaow, iobyxmoadgVar.f39086zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f39085iobyxmoadg) * 31;
            String str = this.f39086zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f39086zoijcleaow;
        }

        public String toString() {
            return "Params(withOnboarding=" + this.f39085iobyxmoadg + ", itemId=" + this.f39086zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f39085iobyxmoadg;
        }

        public /* synthetic */ iobyxmoadg(boolean z13, String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this(z13, (i13 & 2) != 0 ? null : str);
        }
    }
}

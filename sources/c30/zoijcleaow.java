package c30;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import w10.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f18653zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(draadjrbmk remoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18653zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f18653zoijcleaow.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f18654iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18655zoijcleaow;

        public iobyxmoadg(boolean z13, String str) {
            this.f18654iobyxmoadg = z13;
            this.f18655zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f18654iobyxmoadg == iobyxmoadgVar.f18654iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f18655zoijcleaow, iobyxmoadgVar.f18655zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f18654iobyxmoadg) * 31;
            String str = this.f18655zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f18655zoijcleaow;
        }

        public String toString() {
            return "Params(withOnboarding=" + this.f18654iobyxmoadg + ", itemId=" + this.f18655zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f18654iobyxmoadg;
        }

        public /* synthetic */ iobyxmoadg(boolean z13, String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this(z13, (i13 & 2) != 0 ? null : str);
        }
    }
}

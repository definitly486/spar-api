package t20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f109327zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f109328iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f109328iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f109328iobyxmoadg == ((iobyxmoadg) obj).f109328iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f109328iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f109328iobyxmoadg;
        }

        public String toString() {
            return "Params(isAgreementsApplied=" + this.f109328iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(v10.zoijcleaow sharedPreferencesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f109327zoijcleaow = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        this.f109327zoijcleaow.vipkmwdibw(iobyxmoadgVar.iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

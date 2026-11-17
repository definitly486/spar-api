package h20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f39144zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f39145iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f39145iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f39145iobyxmoadg == ((iobyxmoadg) obj).f39145iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f39145iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f39145iobyxmoadg;
        }

        public String toString() {
            return "Params(isGrid=" + this.f39145iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(v10.zoijcleaow preferencesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(preferencesRepository, "preferencesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39144zoijcleaow = preferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        this.f39144zoijcleaow.hkdspvbjdz(iobyxmoadgVar.iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

package r01;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f81372iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f81373iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f81373iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f81373iobyxmoadg == ((iobyxmoadg) obj).f81373iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f81373iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f81373iobyxmoadg;
        }

        public String toString() {
            return "Params(isGrid=" + this.f81373iobyxmoadg + ")";
        }
    }

    public gtknphoqwx(j01.zoijcleaow preferencesRepository) {
        zdlpuopuiu.btonecajqb(preferencesRepository, "preferencesRepository");
        this.f81372iobyxmoadg = preferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f81372iobyxmoadg.hkdspvbjdz(parameters.iobyxmoadg());
    }
}

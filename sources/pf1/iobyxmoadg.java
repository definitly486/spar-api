package pf1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import zr0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f76553iobyxmoadg;

    /* JADX INFO: renamed from: pf1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1693iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f76554iobyxmoadg;

        public C1693iobyxmoadg(boolean z13) {
            this.f76554iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1693iobyxmoadg) && this.f76554iobyxmoadg == ((C1693iobyxmoadg) obj).f76554iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f76554iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f76554iobyxmoadg;
        }

        public String toString() {
            return "Params(isAuthBrightnessEnabled=" + this.f76554iobyxmoadg + ")";
        }
    }

    public iobyxmoadg(j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f76553iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((C1693iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(C1693iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f76553iobyxmoadg.lqeggnwhkg(parameters.iobyxmoadg());
    }
}

package pi0;

import ft.zoijcleaow;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.zoijcleaow f76653iobyxmoadg;

    /* JADX INFO: renamed from: pi0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1697iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f76654iobyxmoadg;

        public C1697iobyxmoadg(boolean z13) {
            this.f76654iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1697iobyxmoadg) && this.f76654iobyxmoadg == ((C1697iobyxmoadg) obj).f76654iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f76654iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f76654iobyxmoadg;
        }

        public String toString() {
            return "Params(isAuthBrightnessEnabled=" + this.f76654iobyxmoadg + ")";
        }
    }

    public iobyxmoadg(v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f76653iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((C1697iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(C1697iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f76653iobyxmoadg.lqeggnwhkg(parameters.iobyxmoadg());
    }
}

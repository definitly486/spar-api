package uf1;

import gg.wwaezpbzkn;
import k01.gxszxtbevo;
import kotlin.jvm.internal.zdlpuopuiu;
import zr0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f113531iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j01.zoijcleaow f113532zoijcleaow;

    /* JADX INFO: renamed from: uf1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2813iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oz0.iobyxmoadg f113533iobyxmoadg;

        public C2813iobyxmoadg(oz0.iobyxmoadg darkModeState) {
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f113533iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2813iobyxmoadg) && this.f113533iobyxmoadg == ((C2813iobyxmoadg) obj).f113533iobyxmoadg;
        }

        public int hashCode() {
            return this.f113533iobyxmoadg.hashCode();
        }

        public final oz0.iobyxmoadg iobyxmoadg() {
            return this.f113533iobyxmoadg;
        }

        public String toString() {
            return "Params(darkModeState=" + this.f113533iobyxmoadg + ")";
        }
    }

    public iobyxmoadg(gxszxtbevo darkModeRepository, j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(darkModeRepository, "darkModeRepository");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f113531iobyxmoadg = darkModeRepository;
        this.f113532zoijcleaow = sharedPreferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((C2813iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(C2813iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f113532zoijcleaow.mbcevpiqjq(parameters.iobyxmoadg());
        this.f113531iobyxmoadg.iobyxmoadg(parameters.iobyxmoadg());
    }
}

package ui0;

import ft.zoijcleaow;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import w10.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f113619iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f113620zoijcleaow;

    /* JADX INFO: renamed from: ui0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2818iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x00.iobyxmoadg f113621iobyxmoadg;

        public C2818iobyxmoadg(x00.iobyxmoadg darkModeState) {
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f113621iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2818iobyxmoadg) && this.f113621iobyxmoadg == ((C2818iobyxmoadg) obj).f113621iobyxmoadg;
        }

        public int hashCode() {
            return this.f113621iobyxmoadg.hashCode();
        }

        public final x00.iobyxmoadg iobyxmoadg() {
            return this.f113621iobyxmoadg;
        }

        public String toString() {
            return "Params(darkModeState=" + this.f113621iobyxmoadg + ")";
        }
    }

    public iobyxmoadg(gxszxtbevo darkModeRepository, v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(darkModeRepository, "darkModeRepository");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f113619iobyxmoadg = darkModeRepository;
        this.f113620zoijcleaow = sharedPreferencesRepository;
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((C2818iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(C2818iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f113620zoijcleaow.ntlheqmsrt(parameters.iobyxmoadg());
        this.f113619iobyxmoadg.iobyxmoadg(parameters.iobyxmoadg());
    }
}

package y01;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import ru.myspar.proloyalty.components.geo.api.models.City;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.iobyxmoadg f123502iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final City f123503iobyxmoadg;

        public iobyxmoadg(City city) {
            this.f123503iobyxmoadg = city;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123503iobyxmoadg, ((iobyxmoadg) obj).f123503iobyxmoadg);
        }

        public int hashCode() {
            City city = this.f123503iobyxmoadg;
            if (city == null) {
                return 0;
            }
            return city.hashCode();
        }

        public final City iobyxmoadg() {
            return this.f123503iobyxmoadg;
        }

        public String toString() {
            return "Params(cityDetails=" + this.f123503iobyxmoadg + ")";
        }
    }

    public zoijcleaow(j01.iobyxmoadg sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f123502iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        wkgbmnqykc.f60450iobyxmoadg.zoijcleaow("MOB-7588", "SetChosenCityUseCase " + parameters, true);
        this.f123502iobyxmoadg.kegysxyocb(parameters.iobyxmoadg());
    }
}

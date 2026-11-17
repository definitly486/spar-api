package s20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import rs.wkgbmnqykc;
import ru.myspar.components.geo.api.models.City;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.iobyxmoadg f105211iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final City f105212iobyxmoadg;

        public iobyxmoadg(City city) {
            this.f105212iobyxmoadg = city;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105212iobyxmoadg, ((iobyxmoadg) obj).f105212iobyxmoadg);
        }

        public int hashCode() {
            City city = this.f105212iobyxmoadg;
            if (city == null) {
                return 0;
            }
            return city.hashCode();
        }

        public final City iobyxmoadg() {
            return this.f105212iobyxmoadg;
        }

        public String toString() {
            return "Params(cityDetails=" + this.f105212iobyxmoadg + ")";
        }
    }

    public zoijcleaow(v10.iobyxmoadg sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f105211iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("MOB-7588", "SetChosenCityUseCase " + parameters, true);
        this.f105211iobyxmoadg.ikoacuggdj(parameters.iobyxmoadg());
    }
}

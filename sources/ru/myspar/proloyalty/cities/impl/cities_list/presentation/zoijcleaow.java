package ru.myspar.proloyalty.cities.impl.cities_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.components.geo.api.models.City;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f93827iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 978555998;
        }

        public String toString() {
            return "OnClickShowDeliveryArea";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final City f93828iobyxmoadg;

        public ppxfxbqfkf(City city) {
            zdlpuopuiu.btonecajqb(city, "city");
            this.f93828iobyxmoadg = city;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f93828iobyxmoadg, ((ppxfxbqfkf) obj).f93828iobyxmoadg);
        }

        public int hashCode() {
            return this.f93828iobyxmoadg.hashCode();
        }

        public final City iobyxmoadg() {
            return this.f93828iobyxmoadg;
        }

        public String toString() {
            return "OnSelectCity(city=" + this.f93828iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cities.impl.cities_list.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2213zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f93829iobyxmoadg;

        public C2213zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f93829iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2213zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f93829iobyxmoadg, ((C2213zoijcleaow) obj).f93829iobyxmoadg);
        }

        public int hashCode() {
            return this.f93829iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f93829iobyxmoadg;
        }

        public String toString() {
            return "OnEditSearchValue(value=" + this.f93829iobyxmoadg + ")";
        }
    }
}

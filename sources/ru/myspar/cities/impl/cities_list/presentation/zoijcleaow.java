package ru.myspar.cities.impl.cities_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.geo.api.models.City;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f86093iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 969395937;
        }

        public String toString() {
            return "OnClickShowDeliveryArea";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final City f86094iobyxmoadg;

        public ppxfxbqfkf(City city) {
            zdlpuopuiu.btonecajqb(city, "city");
            this.f86094iobyxmoadg = city;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f86094iobyxmoadg, ((ppxfxbqfkf) obj).f86094iobyxmoadg);
        }

        public int hashCode() {
            return this.f86094iobyxmoadg.hashCode();
        }

        public final City iobyxmoadg() {
            return this.f86094iobyxmoadg;
        }

        public String toString() {
            return "OnSelectCity(city=" + this.f86094iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.cities.impl.cities_list.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1978zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f86095iobyxmoadg;

        public C1978zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f86095iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1978zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f86095iobyxmoadg, ((C1978zoijcleaow) obj).f86095iobyxmoadg);
        }

        public int hashCode() {
            return this.f86095iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f86095iobyxmoadg;
        }

        public String toString() {
            return "OnEditSearchValue(value=" + this.f86095iobyxmoadg + ")";
        }
    }
}

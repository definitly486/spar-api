package ru.myspar.support_service.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104476iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f104476iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104476iobyxmoadg, ((iobyxmoadg) obj).f104476iobyxmoadg);
        }

        public int hashCode() {
            return this.f104476iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104476iobyxmoadg;
        }

        public String toString() {
            return "Error(error=" + this.f104476iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f104477zoijcleaow = NavigationPayload.f87549istkbnxepw;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f104478iobyxmoadg;

        public zoijcleaow(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f104478iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104478iobyxmoadg, ((zoijcleaow) obj).f104478iobyxmoadg);
        }

        public int hashCode() {
            return this.f104478iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f104478iobyxmoadg;
        }

        public String toString() {
            return "OpenNavigationPayload(payload=" + this.f104478iobyxmoadg + ")";
        }
    }
}

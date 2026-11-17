package ru.myspar.proloyalty.support_service.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101818iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f101818iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101818iobyxmoadg, ((iobyxmoadg) obj).f101818iobyxmoadg);
        }

        public int hashCode() {
            return this.f101818iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101818iobyxmoadg;
        }

        public String toString() {
            return "Error(error=" + this.f101818iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f101819zoijcleaow = NavigationPayload.f95326zynmafqrjb;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NavigationPayload f101820iobyxmoadg;

        public zoijcleaow(NavigationPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f101820iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101820iobyxmoadg, ((zoijcleaow) obj).f101820iobyxmoadg);
        }

        public int hashCode() {
            return this.f101820iobyxmoadg.hashCode();
        }

        public final NavigationPayload iobyxmoadg() {
            return this.f101820iobyxmoadg;
        }

        public String toString() {
            return "OpenNavigationPayload(payload=" + this.f101820iobyxmoadg + ")";
        }
    }
}

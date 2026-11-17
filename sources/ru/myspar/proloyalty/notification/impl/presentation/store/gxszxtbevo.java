package ru.myspar.proloyalty.notification.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.Content f98517iobyxmoadg;

        public iobyxmoadg(State.Content content) {
            zdlpuopuiu.btonecajqb(content, "content");
            this.f98517iobyxmoadg = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98517iobyxmoadg, ((iobyxmoadg) obj).f98517iobyxmoadg);
        }

        public int hashCode() {
            return this.f98517iobyxmoadg.hashCode();
        }

        public final State.Content iobyxmoadg() {
            return this.f98517iobyxmoadg;
        }

        public String toString() {
            return "SetContent(content=" + this.f98517iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final b01.iobyxmoadg f98518iobyxmoadg;

        public zoijcleaow(b01.iobyxmoadg type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f98518iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f98518iobyxmoadg == ((zoijcleaow) obj).f98518iobyxmoadg;
        }

        public int hashCode() {
            return this.f98518iobyxmoadg.hashCode();
        }

        public final b01.iobyxmoadg iobyxmoadg() {
            return this.f98518iobyxmoadg;
        }

        public String toString() {
            return "StartLoadingNotifications(type=" + this.f98518iobyxmoadg + ")";
        }
    }
}

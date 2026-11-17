package ru.myspar.proloyalty.support_service.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f101821iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f101821iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f101821iobyxmoadg == ((iobyxmoadg) obj).f101821iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f101821iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f101821iobyxmoadg;
        }

        public String toString() {
            return "ChangeUnreadChatSupportMessages(count=" + this.f101821iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.Content f101822iobyxmoadg;

        public zoijcleaow(State.Content content) {
            zdlpuopuiu.btonecajqb(content, "content");
            this.f101822iobyxmoadg = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101822iobyxmoadg, ((zoijcleaow) obj).f101822iobyxmoadg);
        }

        public int hashCode() {
            return this.f101822iobyxmoadg.hashCode();
        }

        public final State.Content iobyxmoadg() {
            return this.f101822iobyxmoadg;
        }

        public String toString() {
            return "SetContent(content=" + this.f101822iobyxmoadg + ")";
        }
    }
}

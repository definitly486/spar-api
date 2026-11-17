package kc1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends tw0.iobyxmoadg {

    /* JADX INFO: renamed from: kc1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1170iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54455iobyxmoadg;

        public C1170iobyxmoadg(String eventId) {
            zdlpuopuiu.btonecajqb(eventId, "eventId");
            this.f54455iobyxmoadg = eventId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1170iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54455iobyxmoadg, ((C1170iobyxmoadg) obj).f54455iobyxmoadg);
        }

        public int hashCode() {
            return this.f54455iobyxmoadg.hashCode();
        }

        public String toString() {
            return "Event(eventId=" + this.f54455iobyxmoadg + ")";
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    public final Object btonecajqb(gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = lqeggnwhkg(new C1170iobyxmoadg(String.valueOf(System.currentTimeMillis())), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }
}

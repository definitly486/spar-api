package yk1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.qr.domain.model.QrModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends tw0.iobyxmoadg {

    /* JADX INFO: renamed from: yk1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3202iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final QrModel.Dynamic f125583iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final xk1.iobyxmoadg f125584zoijcleaow;

        public C3202iobyxmoadg(QrModel.Dynamic qrModel, xk1.iobyxmoadg status) {
            zdlpuopuiu.btonecajqb(qrModel, "qrModel");
            zdlpuopuiu.btonecajqb(status, "status");
            this.f125583iobyxmoadg = qrModel;
            this.f125584zoijcleaow = status;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3202iobyxmoadg)) {
                return false;
            }
            C3202iobyxmoadg c3202iobyxmoadg = (C3202iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f125583iobyxmoadg, c3202iobyxmoadg.f125583iobyxmoadg) && this.f125584zoijcleaow == c3202iobyxmoadg.f125584zoijcleaow;
        }

        public int hashCode() {
            return (this.f125583iobyxmoadg.hashCode() * 31) + this.f125584zoijcleaow.hashCode();
        }

        public final QrModel.Dynamic iobyxmoadg() {
            return this.f125583iobyxmoadg;
        }

        public String toString() {
            return "Event(qrModel=" + this.f125583iobyxmoadg + ", status=" + this.f125584zoijcleaow + ")";
        }

        public final xk1.iobyxmoadg zoijcleaow() {
            return this.f125584zoijcleaow;
        }
    }

    public iobyxmoadg() {
        super(0, 30, null, 5, null);
    }

    public final void btonecajqb(QrModel.Dynamic qrModel) {
        zdlpuopuiu.btonecajqb(qrModel, "qrModel");
        dxjokdxxww(new C3202iobyxmoadg(qrModel, xk1.iobyxmoadg.ACTIVATED));
    }

    public final void gtknphoqwx(QrModel.Dynamic qrModel) {
        zdlpuopuiu.btonecajqb(qrModel, "qrModel");
        dxjokdxxww(new C3202iobyxmoadg(qrModel, xk1.iobyxmoadg.ARCHIVED));
    }
}

package o80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.updateapplicationtwo.store.UpdateApplicationTwoDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UpdateApplicationTwoDialogArgs f72322iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(UpdateApplicationTwoDialogArgs args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f72322iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72322iobyxmoadg, ((iobyxmoadg) obj).f72322iobyxmoadg);
        }

        public int hashCode() {
            return this.f72322iobyxmoadg.hashCode();
        }

        public final UpdateApplicationTwoDialogArgs iobyxmoadg() {
            return this.f72322iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(args=" + this.f72322iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}

package nb2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jyumaefscl {

    public static final class iobyxmoadg extends jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f69579iobyxmoadg = new iobyxmoadg();
    }

    public static final class zoijcleaow extends jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final List f69580iobyxmoadg;

        public zoijcleaow(ArrayList values) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
            this.f69580iobyxmoadg = values;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69580iobyxmoadg, ((zoijcleaow) obj).f69580iobyxmoadg);
        }

        public final int hashCode() {
            return this.f69580iobyxmoadg.hashCode();
        }

        public final String toString() {
            return "Sent(values=" + this.f69580iobyxmoadg + ')';
        }
    }
}

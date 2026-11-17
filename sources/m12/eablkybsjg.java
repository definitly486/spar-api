package m12;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f64952iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1490074810;
        }

        public String toString() {
            return "DismissDialog";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f64953iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String url) {
            super(null);
            zdlpuopuiu.btonecajqb(url, "url");
            this.f64953iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f64953iobyxmoadg, ((ppxfxbqfkf) obj).f64953iobyxmoadg);
        }

        public int hashCode() {
            return this.f64953iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f64953iobyxmoadg;
        }

        public String toString() {
            return "OpenWebView(url=" + this.f64953iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final j12.iobyxmoadg f64954iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(j12.iobyxmoadg result) {
            super(null);
            zdlpuopuiu.btonecajqb(result, "result");
            this.f64954iobyxmoadg = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f64954iobyxmoadg, ((zoijcleaow) obj).f64954iobyxmoadg);
        }

        public int hashCode() {
            return this.f64954iobyxmoadg.hashCode();
        }

        public final j12.iobyxmoadg iobyxmoadg() {
            return this.f64954iobyxmoadg;
        }

        public String toString() {
            return "OpenSbpBankApp(result=" + this.f64954iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}

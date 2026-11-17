package x51;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import v51.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f121189iobyxmoadg;

    /* JADX INFO: renamed from: x51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3052iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f121190ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ppxfxbqfkf f121191zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3052iobyxmoadg(ppxfxbqfkf dialogHolder, List excludes) {
            super(dialogHolder, null);
            zdlpuopuiu.btonecajqb(dialogHolder, "dialogHolder");
            zdlpuopuiu.btonecajqb(excludes, "excludes");
            this.f121191zoijcleaow = dialogHolder;
            this.f121190ppxfxbqfkf = excludes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3052iobyxmoadg)) {
                return false;
            }
            C3052iobyxmoadg c3052iobyxmoadg = (C3052iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f121191zoijcleaow, c3052iobyxmoadg.f121191zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f121190ppxfxbqfkf, c3052iobyxmoadg.f121190ppxfxbqfkf);
        }

        public int hashCode() {
            return (this.f121191zoijcleaow.hashCode() * 31) + this.f121190ppxfxbqfkf.hashCode();
        }

        @Override // x51.iobyxmoadg
        public ppxfxbqfkf iobyxmoadg() {
            return this.f121191zoijcleaow;
        }

        public String toString() {
            return "Common(dialogHolder=" + this.f121191zoijcleaow + ", excludes=" + this.f121190ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f121190ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ppxfxbqfkf f121192zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ppxfxbqfkf dialogHolder) {
            super(dialogHolder, null);
            zdlpuopuiu.btonecajqb(dialogHolder, "dialogHolder");
            this.f121192zoijcleaow = dialogHolder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f121192zoijcleaow, ((zoijcleaow) obj).f121192zoijcleaow);
        }

        public int hashCode() {
            return this.f121192zoijcleaow.hashCode();
        }

        @Override // x51.iobyxmoadg
        public ppxfxbqfkf iobyxmoadg() {
            return this.f121192zoijcleaow;
        }

        public String toString() {
            return "Single(dialogHolder=" + this.f121192zoijcleaow + ")";
        }
    }

    public /* synthetic */ iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, gtknphoqwx gtknphoqwxVar) {
        this(ppxfxbqfkfVar);
    }

    public abstract ppxfxbqfkf iobyxmoadg();

    private iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f121189iobyxmoadg = ppxfxbqfkfVar;
    }
}

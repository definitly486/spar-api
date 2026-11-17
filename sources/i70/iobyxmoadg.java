package i70;

import g70.ppxfxbqfkf;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f42089iobyxmoadg;

    /* JADX INFO: renamed from: i70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0988iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f42090ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ppxfxbqfkf f42091zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0988iobyxmoadg(ppxfxbqfkf dialogHolder, List excludes) {
            super(dialogHolder, null);
            zdlpuopuiu.btonecajqb(dialogHolder, "dialogHolder");
            zdlpuopuiu.btonecajqb(excludes, "excludes");
            this.f42091zoijcleaow = dialogHolder;
            this.f42090ppxfxbqfkf = excludes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0988iobyxmoadg)) {
                return false;
            }
            C0988iobyxmoadg c0988iobyxmoadg = (C0988iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f42091zoijcleaow, c0988iobyxmoadg.f42091zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f42090ppxfxbqfkf, c0988iobyxmoadg.f42090ppxfxbqfkf);
        }

        public int hashCode() {
            return (this.f42091zoijcleaow.hashCode() * 31) + this.f42090ppxfxbqfkf.hashCode();
        }

        @Override // i70.iobyxmoadg
        public ppxfxbqfkf iobyxmoadg() {
            return this.f42091zoijcleaow;
        }

        public String toString() {
            return "Common(dialogHolder=" + this.f42091zoijcleaow + ", excludes=" + this.f42090ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f42090ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ppxfxbqfkf f42092zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ppxfxbqfkf dialogHolder) {
            super(dialogHolder, null);
            zdlpuopuiu.btonecajqb(dialogHolder, "dialogHolder");
            this.f42092zoijcleaow = dialogHolder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f42092zoijcleaow, ((zoijcleaow) obj).f42092zoijcleaow);
        }

        public int hashCode() {
            return this.f42092zoijcleaow.hashCode();
        }

        @Override // i70.iobyxmoadg
        public ppxfxbqfkf iobyxmoadg() {
            return this.f42092zoijcleaow;
        }

        public String toString() {
            return "Single(dialogHolder=" + this.f42092zoijcleaow + ")";
        }
    }

    public /* synthetic */ iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, gtknphoqwx gtknphoqwxVar) {
        this(ppxfxbqfkfVar);
    }

    public abstract ppxfxbqfkf iobyxmoadg();

    private iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f42089iobyxmoadg = ppxfxbqfkfVar;
    }
}

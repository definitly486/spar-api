package c90;

import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final b90.iobyxmoadg f19339zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f19340iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f19341zoijcleaow;

        public iobyxmoadg(boolean z13, boolean z14) {
            this.f19340iobyxmoadg = z13;
            this.f19341zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f19340iobyxmoadg == iobyxmoadgVar.f19340iobyxmoadg && this.f19341zoijcleaow == iobyxmoadgVar.f19341zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f19340iobyxmoadg) * 31) + Boolean.hashCode(this.f19341zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f19341zoijcleaow;
        }

        public String toString() {
            return "Params(isLoggedIn=" + this.f19340iobyxmoadg + ", digitalChecks=" + this.f19341zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f19340iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(b90.iobyxmoadg echecksLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(echecksLocalSource, "echecksLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f19339zoijcleaow = echecksLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimePpxfxbqfkf = this.f19339zoijcleaow.ppxfxbqfkf();
        if (localDateTimePpxfxbqfkf == null) {
            localDateTimePpxfxbqfkf = localDateTimeNow;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.zoijcleaow() && this.f19339zoijcleaow.wkgbmnqykc() <= 2 && localDateTimeNow.compareTo(localDateTimePpxfxbqfkf) >= 0 && !iobyxmoadgVar.iobyxmoadg());
    }
}

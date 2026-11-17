package y20;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o00.nufgyqmvbu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.iobyxmoadg f123640zoijcleaow;

    /* JADX INFO: renamed from: y20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3123iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f123641iobyxmoadg;

        public C3123iobyxmoadg(nufgyqmvbu type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f123641iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3123iobyxmoadg) && this.f123641iobyxmoadg == ((C3123iobyxmoadg) obj).f123641iobyxmoadg;
        }

        public int hashCode() {
            return this.f123641iobyxmoadg.hashCode();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return this.f123641iobyxmoadg;
        }

        public String toString() {
            return "Params(type=" + this.f123641iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(w10.iobyxmoadg buildConfigSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(buildConfigSource, "buildConfigSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f123640zoijcleaow = buildConfigSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C3123iobyxmoadg c3123iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f123640zoijcleaow.iobyxmoadg(c3123iobyxmoadg.iobyxmoadg());
    }
}

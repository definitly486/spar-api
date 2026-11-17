package d11;

import gz0.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.iobyxmoadg f26693zoijcleaow;

    /* JADX INFO: renamed from: d11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0479iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f26694iobyxmoadg;

        public C0479iobyxmoadg(nufgyqmvbu type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f26694iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0479iobyxmoadg) && this.f26694iobyxmoadg == ((C0479iobyxmoadg) obj).f26694iobyxmoadg;
        }

        public int hashCode() {
            return this.f26694iobyxmoadg.hashCode();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return this.f26694iobyxmoadg;
        }

        public String toString() {
            return "Params(type=" + this.f26694iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k01.iobyxmoadg buildConfigSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(buildConfigSource, "buildConfigSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f26693zoijcleaow = buildConfigSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0479iobyxmoadg c0479iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f26693zoijcleaow.iobyxmoadg(c0479iobyxmoadg.iobyxmoadg());
    }
}

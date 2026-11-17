package x01;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zy0.iobyxmoadg f120898zoijcleaow;

    /* JADX INFO: renamed from: x01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3046iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120899iobyxmoadg;

        public C3046iobyxmoadg(String uri) {
            zdlpuopuiu.btonecajqb(uri, "uri");
            this.f120899iobyxmoadg = uri;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3046iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120899iobyxmoadg, ((C3046iobyxmoadg) obj).f120899iobyxmoadg);
        }

        public int hashCode() {
            return this.f120899iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f120899iobyxmoadg;
        }

        public String toString() {
            return "Params(uri=" + this.f120899iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(zy0.iobyxmoadg fileUtil, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f120898zoijcleaow = fileUtil;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C3046iobyxmoadg c3046iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f120898zoijcleaow.wkgbmnqykc(c3046iobyxmoadg.iobyxmoadg());
    }
}

package eo1;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends zr0.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f31637zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f31638iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f31638iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f31638iobyxmoadg == ((iobyxmoadg) obj).f31638iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f31638iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f31638iobyxmoadg;
        }

        public String toString() {
            return "Params(id=" + this.f31638iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31637zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return this.f31637zoijcleaow.ppxfxbqfkf(parameters.iobyxmoadg());
    }
}

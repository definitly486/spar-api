package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74905zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74906iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f74907zoijcleaow;

        public iobyxmoadg(String id2, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
            this.f74906iobyxmoadg = id2;
            this.f74907zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74906iobyxmoadg, iobyxmoadgVar.f74906iobyxmoadg) && this.f74907zoijcleaow == iobyxmoadgVar.f74907zoijcleaow;
        }

        public int hashCode() {
            return (this.f74906iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f74907zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f74906iobyxmoadg;
        }

        public String toString() {
            return "Params(id=" + this.f74906iobyxmoadg + ", isActive=" + this.f74907zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f74907zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74905zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iw1.iobyxmoadg iobyxmoadgVar2 = this.f74905zoijcleaow;
        if (!iobyxmoadgVar2.rgvfuqvkyq()) {
            return new nw1.iobyxmoadg(null);
        }
        Object objMbcevpiqjq = iobyxmoadgVar2.mbcevpiqjq(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
        return objMbcevpiqjq == mg.zoijcleaow.gxszxtbevo() ? objMbcevpiqjq : (nw1.iobyxmoadg) objMbcevpiqjq;
    }
}

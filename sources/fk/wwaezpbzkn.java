package fk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn {

    public static final class iobyxmoadg implements iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ bk.zoijcleaow f34247iobyxmoadg;

        iobyxmoadg(bk.zoijcleaow zoijcleaowVar) {
            this.f34247iobyxmoadg = zoijcleaowVar;
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] eablkybsjg() {
            return new bk.zoijcleaow[]{this.f34247iobyxmoadg};
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public dk.gxszxtbevo iobyxmoadg() {
            throw new IllegalStateException("unsupported");
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }

        @Override // bk.agtfadlqog
        public void wkgbmnqykc(ek.gxszxtbevo encoder, Object obj) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // bk.iobyxmoadg
        public Object zoijcleaow(ek.eablkybsjg decoder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final dk.gxszxtbevo iobyxmoadg(String name, bk.zoijcleaow primitiveSerializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(primitiveSerializer, "primitiveSerializer");
        return new lmojexxdyd(name, new iobyxmoadg(primitiveSerializer));
    }
}

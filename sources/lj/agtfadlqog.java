package lj;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class agtfadlqog {

    public static final class iobyxmoadg implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f62635iobyxmoadg;

        public iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f62635iobyxmoadg = rgvfuqvkyqVar;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return wflxmlrfwp.iobyxmoadg(this.f62635iobyxmoadg);
        }
    }

    public static Iterator iobyxmoadg(tg.rgvfuqvkyq block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx();
        gtknphoqwxVar.gxszxtbevo(mg.zoijcleaow.iobyxmoadg(block, gtknphoqwxVar, gtknphoqwxVar));
        return gtknphoqwxVar;
    }

    public static btonecajqb zoijcleaow(tg.rgvfuqvkyq block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        return new iobyxmoadg(block);
    }
}

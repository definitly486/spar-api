package a11;

import k01.agtfadlqog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f273zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final b01.iobyxmoadg f274iobyxmoadg;

        public iobyxmoadg(b01.iobyxmoadg type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f274iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f274iobyxmoadg == ((iobyxmoadg) obj).f274iobyxmoadg;
        }

        public int hashCode() {
            return this.f274iobyxmoadg.hashCode();
        }

        public final b01.iobyxmoadg iobyxmoadg() {
            return this.f274iobyxmoadg;
        }

        public String toString() {
            return "Params(type=" + this.f274iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: a11.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public /* synthetic */ class C0006zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f275iobyxmoadg;

        static {
            int[] iArr = new int[b01.iobyxmoadg.values().length];
            try {
                iArr[b01.iobyxmoadg.ORDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b01.iobyxmoadg.PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f275iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(agtfadlqog pushRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(pushRemoteSource, "pushRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f273zoijcleaow = pushRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        int i13 = C0006zoijcleaow.f275iobyxmoadg[iobyxmoadgVar.iobyxmoadg().ordinal()];
        if (i13 == 1) {
            return this.f273zoijcleaow.zoijcleaow(gxszxtbevoVar);
        }
        if (i13 == 2) {
            return this.f273zoijcleaow.iobyxmoadg(gxszxtbevoVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}

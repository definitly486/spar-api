package v0;

import h.a;
import h.f;
import h.jztzpxfvev;
import h.oipsdeybqn;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public interface rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f115018iobyxmoadg = iobyxmoadg.f115019iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f115019iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public final rgvfuqvkyq iobyxmoadg(jztzpxfvev jztzpxfvevVar, float f13) {
            if (jztzpxfvevVar == null) {
                return zoijcleaow.f115020zoijcleaow;
            }
            if (jztzpxfvevVar instanceof f) {
                return zoijcleaow(wflxmlrfwp.ppxfxbqfkf(((f) jztzpxfvevVar).zoijcleaow(), f13));
            }
            if (jztzpxfvevVar instanceof a) {
                return new ppxfxbqfkf((a) jztzpxfvevVar, f13);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final rgvfuqvkyq zoijcleaow(long j13) {
            return j13 != 16 ? new wkgbmnqykc(j13, null) : zoijcleaow.f115020zoijcleaow;
        }
    }

    public static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f115020zoijcleaow = new zoijcleaow();

        private zoijcleaow() {
        }

        @Override // v0.rgvfuqvkyq
        public jztzpxfvev dxjokdxxww() {
            return null;
        }

        @Override // v0.rgvfuqvkyq
        public float iobyxmoadg() {
            return Float.NaN;
        }

        @Override // v0.rgvfuqvkyq
        public long zoijcleaow() {
            return oipsdeybqn.f38945zoijcleaow.lqeggnwhkg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar) {
        return ((ppxfxbqfkf) rgvfuqvkyqVar).iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static rgvfuqvkyq wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar) {
        return rgvfuqvkyqVar;
    }

    jztzpxfvev dxjokdxxww();

    default rgvfuqvkyq gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar) {
        return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, zoijcleaow.f115020zoijcleaow) ? this : (rgvfuqvkyq) iobyxmoadgVar.invoke();
    }

    float iobyxmoadg();

    default rgvfuqvkyq ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar) {
        boolean z13 = rgvfuqvkyqVar instanceof ppxfxbqfkf;
        if (z13 && (this instanceof ppxfxbqfkf)) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) rgvfuqvkyqVar;
            return new ppxfxbqfkf(ppxfxbqfkfVar.btonecajqb(), wflxmlrfwp.wkgbmnqykc(ppxfxbqfkfVar.iobyxmoadg(), new tg.iobyxmoadg() { // from class: v0.agtfadlqog
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return Float.valueOf(rgvfuqvkyq.lqeggnwhkg(this.f114926zdlpuopuiu));
                }
            }));
        }
        if (!z13 || (this instanceof ppxfxbqfkf)) {
            return (z13 || !(this instanceof ppxfxbqfkf)) ? rgvfuqvkyqVar.gxszxtbevo(new tg.iobyxmoadg() { // from class: v0.ojitshcjhn
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return rgvfuqvkyq.wkgbmnqykc(this.f115015zdlpuopuiu);
                }
            }) : this;
        }
        return rgvfuqvkyqVar;
    }

    long zoijcleaow();
}

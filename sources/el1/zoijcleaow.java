package el1;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dl1.iobyxmoadg f31425zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f31426iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final cl1.iobyxmoadg f31427zoijcleaow;

        public iobyxmoadg(boolean z13, cl1.iobyxmoadg feedback) {
            zdlpuopuiu.btonecajqb(feedback, "feedback");
            this.f31426iobyxmoadg = z13;
            this.f31427zoijcleaow = feedback;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f31426iobyxmoadg == iobyxmoadgVar.f31426iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f31427zoijcleaow, iobyxmoadgVar.f31427zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f31426iobyxmoadg) * 31) + this.f31427zoijcleaow.hashCode();
        }

        public final cl1.iobyxmoadg iobyxmoadg() {
            return this.f31427zoijcleaow;
        }

        public String toString() {
            return "Params(isLoggedIn=" + this.f31426iobyxmoadg + ", feedback=" + this.f31427zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f31426iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: el1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0671zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f31428jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f31430zdlpuopuiu;

        C0671zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31430zdlpuopuiu = obj;
            this.f31428jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(dl1.iobyxmoadg feedbackRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(feedbackRemoteSource, "feedbackRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31425zoijcleaow = feedbackRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C0671zoijcleaow c0671zoijcleaow;
        if (gxszxtbevoVar instanceof C0671zoijcleaow) {
            c0671zoijcleaow = (C0671zoijcleaow) gxszxtbevoVar;
            int i13 = c0671zoijcleaow.f31428jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0671zoijcleaow.f31428jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0671zoijcleaow = new C0671zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0671zoijcleaow = new C0671zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c0671zoijcleaow.f31430zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0671zoijcleaow.f31428jyumaefscl;
        if (i14 != 0) {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (iobyxmoadgVar.zoijcleaow()) {
            dl1.iobyxmoadg iobyxmoadgVar2 = this.f31425zoijcleaow;
            cl1.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c0671zoijcleaow.f31428jyumaefscl = 1;
            if (iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVarIobyxmoadg, c0671zoijcleaow) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        dl1.iobyxmoadg iobyxmoadgVar3 = this.f31425zoijcleaow;
        cl1.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        c0671zoijcleaow.f31428jyumaefscl = 2;
        if (iobyxmoadgVar3.zoijcleaow(iobyxmoadgVarIobyxmoadg2, c0671zoijcleaow) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

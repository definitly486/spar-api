package nz1;

import ft.ppxfxbqfkf;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final mz1.iobyxmoadg f71467zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f71468iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lz1.iobyxmoadg f71469zoijcleaow;

        public iobyxmoadg(boolean z13, lz1.iobyxmoadg feedback) {
            zdlpuopuiu.btonecajqb(feedback, "feedback");
            this.f71468iobyxmoadg = z13;
            this.f71469zoijcleaow = feedback;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f71468iobyxmoadg == iobyxmoadgVar.f71468iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f71469zoijcleaow, iobyxmoadgVar.f71469zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f71468iobyxmoadg) * 31) + this.f71469zoijcleaow.hashCode();
        }

        public final lz1.iobyxmoadg iobyxmoadg() {
            return this.f71469zoijcleaow;
        }

        public String toString() {
            return "Params(isLoggedIn=" + this.f71468iobyxmoadg + ", feedback=" + this.f71469zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f71468iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: nz1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1545zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f71470jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f71472zdlpuopuiu;

        C1545zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71472zdlpuopuiu = obj;
            this.f71470jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(mz1.iobyxmoadg feedbackRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(feedbackRemoteSource, "feedbackRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71467zoijcleaow = feedbackRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C1545zoijcleaow c1545zoijcleaow;
        if (gxszxtbevoVar instanceof C1545zoijcleaow) {
            c1545zoijcleaow = (C1545zoijcleaow) gxszxtbevoVar;
            int i13 = c1545zoijcleaow.f71470jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1545zoijcleaow.f71470jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1545zoijcleaow = new C1545zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1545zoijcleaow = new C1545zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c1545zoijcleaow.f71472zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1545zoijcleaow.f71470jyumaefscl;
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
            mz1.iobyxmoadg iobyxmoadgVar2 = this.f71467zoijcleaow;
            lz1.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c1545zoijcleaow.f71470jyumaefscl = 1;
            if (iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVarIobyxmoadg, c1545zoijcleaow) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        mz1.iobyxmoadg iobyxmoadgVar3 = this.f71467zoijcleaow;
        lz1.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        c1545zoijcleaow.f71470jyumaefscl = 2;
        if (iobyxmoadgVar3.zoijcleaow(iobyxmoadgVarIobyxmoadg2, c1545zoijcleaow) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

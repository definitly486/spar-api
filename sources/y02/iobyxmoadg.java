package y02;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends wx.iobyxmoadg {

    /* JADX INFO: renamed from: y02.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3119iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f123504iobyxmoadg;

        public C3119iobyxmoadg(String productArticle) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f123504iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3119iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123504iobyxmoadg, ((C3119iobyxmoadg) obj).f123504iobyxmoadg);
        }

        public int hashCode() {
            return this.f123504iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f123504iobyxmoadg;
        }

        public String toString() {
            return "Event(productArticle=" + this.f123504iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f123505iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f123507yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f123508zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f123507yggfygwlhe = obj;
            this.f123505iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gtknphoqwx(null, this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f123505iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f123505iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f123507yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f123505iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Object c3119iobyxmoadg = new C3119iobyxmoadg(str);
            zoijcleaowVar.f123508zdlpuopuiu = c3119iobyxmoadg;
            zoijcleaowVar.f123505iwizpuwonk = 1;
            if (dxjokdxxww(c3119iobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

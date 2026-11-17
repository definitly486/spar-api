package pm1;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends tw0.iobyxmoadg {

    /* JADX INFO: renamed from: pm1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1703iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f76995iobyxmoadg;

        public C1703iobyxmoadg(String productArticle) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f76995iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1703iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76995iobyxmoadg, ((C1703iobyxmoadg) obj).f76995iobyxmoadg);
        }

        public int hashCode() {
            return this.f76995iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f76995iobyxmoadg;
        }

        public String toString() {
            return "Event(productArticle=" + this.f76995iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f76996iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f76998yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f76999zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76998yggfygwlhe = obj;
            this.f76996iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.btonecajqb(null, this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object btonecajqb(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f76996iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f76996iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f76998yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f76996iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Object c1703iobyxmoadg = new C1703iobyxmoadg(str);
            zoijcleaowVar.f76999zdlpuopuiu = c1703iobyxmoadg;
            zoijcleaowVar.f76996iwizpuwonk = 1;
            if (lqeggnwhkg(c1703iobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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

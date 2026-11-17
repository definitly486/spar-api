package i01;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends tw0.iobyxmoadg {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f41620iobyxmoadg;

        public iobyxmoadg(List list) {
            this.f41620iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41620iobyxmoadg, ((iobyxmoadg) obj).f41620iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f41620iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f41620iobyxmoadg;
        }

        public String toString() {
            return "Event(selectedServices=" + this.f41620iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41621iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41623yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41624zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41623yggfygwlhe = obj;
            this.f41621iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.btonecajqb(null, this);
        }
    }

    public lqeggnwhkg() {
        super(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object gtknphoqwx(lqeggnwhkg lqeggnwhkgVar, List list, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = null;
        }
        return lqeggnwhkgVar.btonecajqb(list, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object btonecajqb(List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f41621iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f41621iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f41623yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f41621iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Object iobyxmoadgVar = new iobyxmoadg(list);
            zoijcleaowVar.f41624zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f41621iwizpuwonk = 1;
            if (lqeggnwhkg(iobyxmoadgVar, zoijcleaowVar) == objGxszxtbevo) {
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

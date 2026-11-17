package u10;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends wx.iobyxmoadg {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f112487iobyxmoadg;

        public iobyxmoadg(List list) {
            this.f112487iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112487iobyxmoadg, ((iobyxmoadg) obj).f112487iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f112487iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f112487iobyxmoadg;
        }

        public String toString() {
            return "Event(selectedServices=" + this.f112487iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112488iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112490yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112491zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112490yggfygwlhe = obj;
            this.f112488iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.gtknphoqwx(null, this);
        }
    }

    public lqeggnwhkg() {
        super(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object draadjrbmk(lqeggnwhkg lqeggnwhkgVar, List list, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = null;
        }
        return lqeggnwhkgVar.gtknphoqwx(list, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112488iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112488iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f112490yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112488iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Object iobyxmoadgVar = new iobyxmoadg(list);
            zoijcleaowVar.f112491zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f112488iwizpuwonk = 1;
            if (dxjokdxxww(iobyxmoadgVar, zoijcleaowVar) == objGxszxtbevo) {
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

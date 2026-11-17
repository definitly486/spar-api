package u10;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends wx.iobyxmoadg {

    /* JADX INFO: renamed from: u10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2774iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112481iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f112482zoijcleaow;

        public C2774iobyxmoadg(String str, List list) {
            this.f112481iobyxmoadg = str;
            this.f112482zoijcleaow = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2774iobyxmoadg)) {
                return false;
            }
            C2774iobyxmoadg c2774iobyxmoadg = (C2774iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f112481iobyxmoadg, c2774iobyxmoadg.f112481iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112482zoijcleaow, c2774iobyxmoadg.f112482zoijcleaow);
        }

        public int hashCode() {
            String str = this.f112481iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.f112482zoijcleaow;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final List iobyxmoadg() {
            return this.f112482zoijcleaow;
        }

        public String toString() {
            return "Event(selectionId=" + this.f112481iobyxmoadg + ", filters=" + this.f112482zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f112481iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112483iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112485yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112486zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112485yggfygwlhe = obj;
            this.f112483iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gtknphoqwx(null, null, this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object draadjrbmk(iobyxmoadg iobyxmoadgVar, String str, List list, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            list = null;
        }
        return iobyxmoadgVar.gtknphoqwx(str, list, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(String str, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112483iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112483iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f112485yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112483iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Object c2774iobyxmoadg = new C2774iobyxmoadg(str, list);
            zoijcleaowVar.f112486zdlpuopuiu = c2774iobyxmoadg;
            zoijcleaowVar.f112483iwizpuwonk = 1;
            if (dxjokdxxww(c2774iobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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

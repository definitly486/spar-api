package i01;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends tw0.iobyxmoadg {

    /* JADX INFO: renamed from: i01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0973iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f41614iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f41615zoijcleaow;

        public C0973iobyxmoadg(String str, List list) {
            this.f41614iobyxmoadg = str;
            this.f41615zoijcleaow = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0973iobyxmoadg)) {
                return false;
            }
            C0973iobyxmoadg c0973iobyxmoadg = (C0973iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f41614iobyxmoadg, c0973iobyxmoadg.f41614iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41615zoijcleaow, c0973iobyxmoadg.f41615zoijcleaow);
        }

        public int hashCode() {
            String str = this.f41614iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.f41615zoijcleaow;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final List iobyxmoadg() {
            return this.f41615zoijcleaow;
        }

        public String toString() {
            return "Event(selectionId=" + this.f41614iobyxmoadg + ", filters=" + this.f41615zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f41614iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41616iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41618yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41619zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41618yggfygwlhe = obj;
            this.f41616iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.btonecajqb(null, null, this);
        }
    }

    public iobyxmoadg() {
        super(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object gtknphoqwx(iobyxmoadg iobyxmoadgVar, String str, List list, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            list = null;
        }
        return iobyxmoadgVar.btonecajqb(str, list, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object btonecajqb(String str, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f41616iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f41616iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f41618yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f41616iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Object c0973iobyxmoadg = new C0973iobyxmoadg(str, list);
            zoijcleaowVar.f41619zdlpuopuiu = c0973iobyxmoadg;
            zoijcleaowVar.f41616iwizpuwonk = 1;
            if (lqeggnwhkg(c0973iobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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

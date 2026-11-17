package zg0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yg0.iobyxmoadg f129976zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129977iobyxmoadg;

        public iobyxmoadg(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f129977iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129977iobyxmoadg, ((iobyxmoadg) obj).f129977iobyxmoadg);
        }

        public int hashCode() {
            return this.f129977iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f129977iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f129977iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: zg0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C3311zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f129978iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f129980yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129981zdlpuopuiu;

        C3311zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129980yggfygwlhe = obj;
            this.f129978iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(yg0.iobyxmoadg mySparSectionsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparSectionsRepository, "mySparSectionsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f129976zoijcleaow = mySparSectionsRepository;
    }

    private final List wkgbmnqykc(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String strPpxfxbqfkf = ((xg0.wkgbmnqykc) obj).ppxfxbqfkf();
            if (strPpxfxbqfkf != null && strPpxfxbqfkf.length() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C3311zoijcleaow c3311zoijcleaow;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C3311zoijcleaow) {
            c3311zoijcleaow = (C3311zoijcleaow) gxszxtbevoVar;
            int i13 = c3311zoijcleaow.f129978iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3311zoijcleaow.f129978iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c3311zoijcleaow = new C3311zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c3311zoijcleaow = new C3311zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c3311zoijcleaow.f129980yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3311zoijcleaow.f129978iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            yg0.iobyxmoadg iobyxmoadgVar2 = this.f129976zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c3311zoijcleaow.f129981zdlpuopuiu = this;
            c3311zoijcleaow.f129978iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(strIobyxmoadg, c3311zoijcleaow);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) c3311zoijcleaow.f129981zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return zoijcleaowVar.wkgbmnqykc((List) objZoijcleaow);
    }
}

package az0;

import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f14797iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f14798zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f14799jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f14800yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14801zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(vdvldrhtss vdvldrhtssVar, zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14800yggfygwlhe = vdvldrhtssVar;
            this.f14799jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f14800yggfygwlhe, this.f14799jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14801zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                String str = (String) this.f14800yggfygwlhe.lqeggnwhkg();
                ProductMessageType productMessageType = (ProductMessageType) this.f14800yggfygwlhe.nufgyqmvbu();
                zoijcleaow zoijcleaowVar = this.f14799jyumaefscl;
                this.f14799jyumaefscl.nufgyqmvbu(new az0.iobyxmoadg(str, productMessageType, zoijcleaowVar.lqeggnwhkg(zoijcleaowVar.gtknphoqwx(), (ProductMessageType) this.f14800yggfygwlhe.nufgyqmvbu())));
                zoijcleaow zoijcleaowVar2 = this.f14799jyumaefscl;
                int durationInSeconds = ((ProductMessageType) this.f14800yggfygwlhe.nufgyqmvbu()).getDurationInSeconds();
                this.f14801zdlpuopuiu = 1;
                if (zoijcleaowVar2.wflxmlrfwp(durationInSeconds, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f14802iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14804yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14805zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14804yggfygwlhe = obj;
            this.f14802iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.wflxmlrfwp(0, this);
        }
    }

    /* JADX INFO: renamed from: az0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0245zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Collection f14806cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f14808jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14809yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14810zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0245zoijcleaow(Collection collection, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14806cqumvgiudr = collection;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C0245zoijcleaow(this.f14806cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zoijcleaow zoijcleaowVar;
            Iterator it;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14808jyumaefscl;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                LocalDateTime localDateTimeGtknphoqwx = zoijcleaow.this.gtknphoqwx();
                Collection<vdvldrhtss> collection = this.f14806cqumvgiudr;
                zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
                ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(collection, 10));
                for (vdvldrhtss vdvldrhtssVar : collection) {
                    String str = (String) vdvldrhtssVar.iobyxmoadg();
                    ProductMessageType productMessageType = (ProductMessageType) vdvldrhtssVar.wkgbmnqykc();
                    arrayList.add(new az0.iobyxmoadg(str, productMessageType, zoijcleaowVar2.lqeggnwhkg(localDateTimeGtknphoqwx, productMessageType)));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(((az0.iobyxmoadg) obj2).zoijcleaow().getDurationInSeconds());
                    Object arrayList2 = linkedHashMap.get(numWkgbmnqykc);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(numWkgbmnqykc, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                zoijcleaow.this.btonecajqb(arrayList);
                zoijcleaowVar = zoijcleaow.this;
                it = linkedHashMap.entrySet().iterator();
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f14809yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) this.f14810zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            while (it.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) it.next()).getKey()).intValue();
                this.f14810zdlpuopuiu = zoijcleaowVar;
                this.f14809yggfygwlhe = it;
                this.f14808jyumaefscl = 1;
                if (zoijcleaowVar.wflxmlrfwp(iIntValue, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C0245zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zoijcleaow(cllcsxoeiz interactorScope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(interactorScope, "interactorScope");
        this.f14797iobyxmoadg = interactorScope;
        this.f14798zoijcleaow = kegysxyocb.iobyxmoadg(new LinkedHashSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void btonecajqb(List list) {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f14798zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, ikoacuggdj.draadjrbmk((Set) value, list)));
    }

    private final boolean draadjrbmk(long j13) {
        return j13 <= ojitshcjhn(gtknphoqwx());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDateTime gtknphoqwx() {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(localDateTimeNow, "now(...)");
        return localDateTimeNow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long lqeggnwhkg(LocalDateTime localDateTime, ProductMessageType productMessageType) {
        LocalDateTime localDateTimePlusSeconds = localDateTime.plusSeconds(productMessageType.getDurationInSeconds());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(localDateTimePlusSeconds, "plusSeconds(...)");
        return ojitshcjhn(localDateTimePlusSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nufgyqmvbu(az0.iobyxmoadg iobyxmoadgVar) {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f14798zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, ikoacuggdj.wflxmlrfwp((Set) value, iobyxmoadgVar)));
    }

    private final long ojitshcjhn(LocalDateTime localDateTime) {
        return localDateTime.toEpochSecond(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wflxmlrfwp(int i13, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar;
        Object value;
        ArrayList arrayList;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i14 = ppxfxbqfkfVar.f14802iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f14802iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f14804yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = ppxfxbqfkfVar.f14802iwizpuwonk;
        if (i15 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
            long jKcexrzcfyt = nj.ppxfxbqfkf.kcexrzcfyt(i13, nj.wkgbmnqykc.SECONDS);
            ppxfxbqfkfVar.f14805zdlpuopuiu = this;
            ppxfxbqfkfVar.f14802iwizpuwonk = 1;
            if (crxdokpmqz.ppxfxbqfkf(jKcexrzcfyt, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f14805zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        zynmafqrjb zynmafqrjbVar = zoijcleaowVar.f14798zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
            arrayList = new ArrayList();
            for (Object obj2 : (Set) value) {
                if (!zoijcleaowVar.draadjrbmk(((az0.iobyxmoadg) obj2).iobyxmoadg())) {
                    arrayList.add(obj2);
                }
            }
        } while (!zynmafqrjbVar.compareAndSet(value, jyumaefscl.r(arrayList)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final wypolnanlu agtfadlqog() {
        return this.f14798zoijcleaow;
    }

    public final void dxjokdxxww(Collection args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        gtknphoqwx.wkgbmnqykc(this.f14797iobyxmoadg, null, null, new C0245zoijcleaow(args, null), 3, null);
    }

    public final void gxszxtbevo(vdvldrhtss args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        gtknphoqwx.wkgbmnqykc(this.f14797iobyxmoadg, null, null, new iobyxmoadg(args, this, null), 3, null);
    }
}

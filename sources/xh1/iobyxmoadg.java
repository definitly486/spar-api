package xh1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kr0.wkgbmnqykc;
import lg.gxszxtbevo;
import oh1.ppxfxbqfkf;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f122408iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bz0.zoijcleaow f122409ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f122410wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final az0.zoijcleaow f122411zoijcleaow;

    /* JADX INFO: renamed from: xh1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3083iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ez0.iobyxmoadg f122412jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122414zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3083iobyxmoadg(ez0.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f122412jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C3083iobyxmoadg(this.f122412jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f122414zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                Map mapIwizpuwonk = tzroggbefp.iwizpuwonk((Map) iobyxmoadg.this.f122410wkgbmnqykc.getValue());
                mapIwizpuwonk.put(this.f122412jyumaefscl.gxszxtbevo(), this.f122412jyumaefscl);
                iobyxmoadg.this.nufgyqmvbu("map[newChangeData.id] =  = " + this.f122412jyumaefscl);
                iobyxmoadg.this.nufgyqmvbu("emit = " + mapIwizpuwonk);
                zynmafqrjb zynmafqrjbVar = iobyxmoadg.this.f122410wkgbmnqykc;
                this.f122414zdlpuopuiu = 1;
                if (zynmafqrjbVar.emit(mapIwizpuwonk, this) == objGxszxtbevo) {
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
            return ((C3083iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f122416jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f122417yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122418zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f122418zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return iobyxmoadg.this.btonecajqb((Map) this.f122417yggfygwlhe, (Set) this.f122416jyumaefscl);
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, Set set, gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f122417yggfygwlhe = map;
            zoijcleaowVar.f122416jyumaefscl = set;
            return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = dsvhmnatus.iobyxmoadg(dispatchersProvider.zoijcleaow());
        this.f122408iobyxmoadg = cllcsxoeizVarIobyxmoadg;
        az0.zoijcleaow zoijcleaowVar = new az0.zoijcleaow(cllcsxoeizVarIobyxmoadg);
        this.f122411zoijcleaow = zoijcleaowVar;
        this.f122409ppxfxbqfkf = new bz0.zoijcleaow(zoijcleaowVar);
        this.f122410wkgbmnqykc = kegysxyocb.iobyxmoadg(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List btonecajqb(Map map, Collection collection) {
        nufgyqmvbu("mergeChangeSetWithMessages");
        nufgyqmvbu("changeSet = " + map);
        Collection<ez0.iobyxmoadg> collectionValues = map.values();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(collectionValues, 10));
        for (ez0.iobyxmoadg iobyxmoadgVar : collectionValues) {
            arrayList.add(iobyxmoadgVar.dxjokdxxww(false, gtknphoqwx(collection, iobyxmoadgVar.gxszxtbevo())));
        }
        nufgyqmvbu("productDataState = " + arrayList);
        return arrayList;
    }

    private final void dxjokdxxww(ez0.iobyxmoadg iobyxmoadgVar) {
        gtknphoqwx.wkgbmnqykc(this.f122408iobyxmoadg, null, null, new C3083iobyxmoadg(iobyxmoadgVar, null), 3, null);
    }

    private static final ProductMessageType gtknphoqwx(Collection collection, String str) {
        Object next;
        Iterator it = collection.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((az0.iobyxmoadg) next).ppxfxbqfkf()));
        az0.iobyxmoadg iobyxmoadgVar = (az0.iobyxmoadg) next;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.zoijcleaow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nufgyqmvbu(String str) {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f60450iobyxmoadg, "ProductsFromBannerInteractor", str, false, 4, null);
    }

    @Override // oh1.ppxfxbqfkf
    public lqeggnwhkg iobyxmoadg() {
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.wflxmlrfwp(this.f122410wkgbmnqykc, this.f122411zoijcleaow.agtfadlqog(), new zoijcleaow(null)));
    }

    @Override // oh1.ppxfxbqfkf
    public Object ppxfxbqfkf(ChangeProductParams changeProductParams, gxszxtbevo gxszxtbevoVar) {
        ez0.iobyxmoadg iobyxmoadgVarLqeggnwhkg = this.f122409ppxfxbqfkf.lqeggnwhkg(changeProductParams, (ez0.iobyxmoadg) ((Map) this.f122410wkgbmnqykc.getValue()).get(changeProductParams.getProductId()), null, changeProductParams.getMeasureTypeModel().getCurrentMeasure().getMinAvailable());
        if (iobyxmoadgVarLqeggnwhkg == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        dxjokdxxww(iobyxmoadgVarLqeggnwhkg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // oh1.ppxfxbqfkf
    public void wkgbmnqykc(String productId, double d13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
        ez0.iobyxmoadg iobyxmoadgVar = (ez0.iobyxmoadg) ((Map) this.f122410wkgbmnqykc.getValue()).get(productId);
        if (iobyxmoadgVar == null) {
            return;
        }
        dxjokdxxww(ez0.iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar, null, null, d13, null, null, null, 59, null));
    }

    @Override // oh1.ppxfxbqfkf
    public void zoijcleaow(List changeSet) {
        Object value;
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeSet, "changeSet");
        zynmafqrjb zynmafqrjbVar = this.f122410wkgbmnqykc;
        do {
            value = zynmafqrjbVar.getValue();
            linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(changeSet, 10)), 16));
            for (Object obj : changeSet) {
                linkedHashMap.put(((ez0.iobyxmoadg) obj).gxszxtbevo(), obj);
            }
        } while (!zynmafqrjbVar.compareAndSet(value, linkedHashMap));
    }
}

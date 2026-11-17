package hk0;

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
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import rs.wkgbmnqykc;
import ru.myspar.core.domain.handler.ProductMessageType;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import yj0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f40580iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final j00.ppxfxbqfkf f40581ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f40582wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final i00.zoijcleaow f40583zoijcleaow;

    /* JADX INFO: renamed from: hk0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0938iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ m00.iobyxmoadg f40584jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f40586zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0938iobyxmoadg(m00.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f40584jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C0938iobyxmoadg(this.f40584jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f40586zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                Map mapIwizpuwonk = tzroggbefp.iwizpuwonk((Map) iobyxmoadg.this.f40582wkgbmnqykc.getValue());
                mapIwizpuwonk.put(this.f40584jyumaefscl.gxszxtbevo(), this.f40584jyumaefscl);
                iobyxmoadg.this.nufgyqmvbu("map[newChangeData.id] =  = " + this.f40584jyumaefscl);
                iobyxmoadg.this.nufgyqmvbu("emit = " + mapIwizpuwonk);
                zynmafqrjb zynmafqrjbVar = iobyxmoadg.this.f40582wkgbmnqykc;
                this.f40586zdlpuopuiu = 1;
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
            return ((C0938iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f40588jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f40589yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f40590zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f40590zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return iobyxmoadg.this.btonecajqb((Map) this.f40589yggfygwlhe, (Set) this.f40588jyumaefscl);
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, Set set, gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f40589yggfygwlhe = map;
            zoijcleaowVar.f40588jyumaefscl = set;
            return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = dsvhmnatus.iobyxmoadg(dispatchersProvider.zoijcleaow());
        this.f40580iobyxmoadg = cllcsxoeizVarIobyxmoadg;
        i00.zoijcleaow zoijcleaowVar = new i00.zoijcleaow(cllcsxoeizVarIobyxmoadg);
        this.f40583zoijcleaow = zoijcleaowVar;
        this.f40581ppxfxbqfkf = new j00.ppxfxbqfkf(zoijcleaowVar);
        this.f40582wkgbmnqykc = kegysxyocb.iobyxmoadg(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List btonecajqb(Map map, Collection collection) {
        nufgyqmvbu("mergeChangeSetWithMessages");
        nufgyqmvbu("changeSet = " + map);
        Collection<m00.iobyxmoadg> collectionValues = map.values();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(collectionValues, 10));
        for (m00.iobyxmoadg iobyxmoadgVar : collectionValues) {
            arrayList.add(iobyxmoadgVar.dxjokdxxww(false, gtknphoqwx(collection, iobyxmoadgVar.gxszxtbevo())));
        }
        nufgyqmvbu("productDataState = " + arrayList);
        return arrayList;
    }

    private final void dxjokdxxww(m00.iobyxmoadg iobyxmoadgVar) {
        gtknphoqwx.wkgbmnqykc(this.f40580iobyxmoadg, null, null, new C0938iobyxmoadg(iobyxmoadgVar, null), 3, null);
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
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((i00.iobyxmoadg) next).ppxfxbqfkf()));
        i00.iobyxmoadg iobyxmoadgVar = (i00.iobyxmoadg) next;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.zoijcleaow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nufgyqmvbu(String str) {
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "ProductsFromBannerInteractor", str, false, 4, null);
    }

    @Override // yj0.ppxfxbqfkf
    public lqeggnwhkg iobyxmoadg() {
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.wflxmlrfwp(this.f40582wkgbmnqykc, this.f40583zoijcleaow.agtfadlqog(), new zoijcleaow(null)));
    }

    @Override // yj0.ppxfxbqfkf
    public Object ppxfxbqfkf(ChangeProductParams changeProductParams, gxszxtbevo gxszxtbevoVar) {
        m00.iobyxmoadg iobyxmoadgVarLqeggnwhkg = this.f40581ppxfxbqfkf.lqeggnwhkg(changeProductParams, (m00.iobyxmoadg) ((Map) this.f40582wkgbmnqykc.getValue()).get(changeProductParams.getProductId()), null, changeProductParams.getMeasureTypeModel().getCurrentMeasure().getMinAvailable());
        if (iobyxmoadgVarLqeggnwhkg == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        dxjokdxxww(iobyxmoadgVarLqeggnwhkg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // yj0.ppxfxbqfkf
    public void wkgbmnqykc(String productId, double d13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
        m00.iobyxmoadg iobyxmoadgVar = (m00.iobyxmoadg) ((Map) this.f40582wkgbmnqykc.getValue()).get(productId);
        if (iobyxmoadgVar == null) {
            return;
        }
        dxjokdxxww(m00.iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar, null, null, d13, null, null, null, 59, null));
    }

    @Override // yj0.ppxfxbqfkf
    public void zoijcleaow(List changeSet) {
        Object value;
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeSet, "changeSet");
        zynmafqrjb zynmafqrjbVar = this.f40582wkgbmnqykc;
        do {
            value = zynmafqrjbVar.getValue();
            linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(changeSet, 10)), 16));
            for (Object obj : changeSet) {
                linkedHashMap.put(((m00.iobyxmoadg) obj).gxszxtbevo(), obj);
            }
        } while (!zynmafqrjbVar.compareAndSet(value, linkedHashMap));
    }
}

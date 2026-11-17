package qw;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.components.promo_collection.api.models.PromoCollectionItem;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zynmafqrjb f80936iobyxmoadg = kegysxyocb.iobyxmoadg(new HashMap());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f80937zoijcleaow = kegysxyocb.iobyxmoadg(new HashMap());

    public static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f80938iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f80939jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f80940yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f80941zdlpuopuiu;

        /* JADX INFO: renamed from: qw.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1799iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f80942yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f80943zdlpuopuiu;

            /* JADX INFO: renamed from: qw.ppxfxbqfkf$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1800iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f80945yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f80946zdlpuopuiu;

                public C1800iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f80946zdlpuopuiu = obj;
                    this.f80945yggfygwlhe |= Integer.MIN_VALUE;
                    return C1799iobyxmoadg.this.emit(null, this);
                }
            }

            public C1799iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, String str) {
                this.f80942yggfygwlhe = str;
                this.f80943zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C1800iobyxmoadg c1800iobyxmoadg;
                if (gxszxtbevoVar instanceof C1800iobyxmoadg) {
                    c1800iobyxmoadg = (C1800iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1800iobyxmoadg.f80945yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1800iobyxmoadg.f80945yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1800iobyxmoadg = new C1800iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1800iobyxmoadg = new C1800iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1800iobyxmoadg.f80946zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1800iobyxmoadg.f80945yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f80943zdlpuopuiu;
                    pw.iobyxmoadg iobyxmoadgVar = (pw.iobyxmoadg) ((Map) obj).get(this.f80942yggfygwlhe);
                    List listWkgbmnqykc = iobyxmoadgVar != null ? iobyxmoadgVar.wkgbmnqykc() : null;
                    if (listWkgbmnqykc == null) {
                        listWkgbmnqykc = jyumaefscl.wflxmlrfwp();
                    }
                    c1800iobyxmoadg.f80945yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listWkgbmnqykc, c1800iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, gxszxtbevo gxszxtbevoVar, String str) {
            super(2, gxszxtbevoVar);
            this.f80939jyumaefscl = lqeggnwhkgVar;
            this.f80938iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f80939jyumaefscl, gxszxtbevoVar, this.f80938iwizpuwonk);
            iobyxmoadgVar.f80940yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f80941zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f80940yggfygwlhe;
                lqeggnwhkg lqeggnwhkgVar = this.f80939jyumaefscl;
                C1799iobyxmoadg c1799iobyxmoadg = new C1799iobyxmoadg(nufgyqmvbuVar, this.f80938iwizpuwonk);
                this.f80941zdlpuopuiu = 1;
                if (lqeggnwhkgVar.collect(c1799iobyxmoadg, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set lqeggnwhkg(String str, String str2, Set subscribers) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str2, "<unused var>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribers, "subscribers");
        return ikoacuggdj.gtknphoqwx(subscribers, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set nufgyqmvbu(rgvfuqvkyq rgvfuqvkyqVar, Object obj, Object obj2) {
        return (Set) rgvfuqvkyqVar.invoke(obj, obj2);
    }

    private final void wkgbmnqykc(String str, String str2) {
        Object value;
        Set setWkgbmnqykc;
        Map mapIwizpuwonk;
        zynmafqrjb zynmafqrjbVar = this.f80937zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
            Map map = (Map) value;
            Set set = (Set) map.get(str);
            if (set == null || (setWkgbmnqykc = ikoacuggdj.wflxmlrfwp(set, str2)) == null) {
                setWkgbmnqykc = ikoacuggdj.wkgbmnqykc(str2);
            }
            mapIwizpuwonk = tzroggbefp.iwizpuwonk(map);
            mapIwizpuwonk.put(str, setWkgbmnqykc);
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
    }

    public final lqeggnwhkg btonecajqb(String promoCollectionId, String screenTag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        wkgbmnqykc(promoCollectionId, screenTag);
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.wwaezpbzkn(new iobyxmoadg(this.f80936iobyxmoadg, null, promoCollectionId)));
    }

    public final PromoCollectionInfo dxjokdxxww(String promoCollectionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        pw.iobyxmoadg iobyxmoadgVar = (pw.iobyxmoadg) ((Map) this.f80936iobyxmoadg.getValue()).get(promoCollectionId);
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ppxfxbqfkf();
        }
        return null;
    }

    public final void eablkybsjg(String promoCollectionId, String promoProductId) {
        Object value;
        Map mapIwizpuwonk;
        PromoCollectionItem promoCollectionItemPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoProductId, "promoProductId");
        zynmafqrjb zynmafqrjbVar = this.f80936iobyxmoadg;
        do {
            value = zynmafqrjbVar.getValue();
            mapIwizpuwonk = (Map) value;
            pw.iobyxmoadg iobyxmoadgVar = (pw.iobyxmoadg) mapIwizpuwonk.get(promoCollectionId);
            if (iobyxmoadgVar != null) {
                List listWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
                ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
                Iterator it = listWkgbmnqykc.iterator();
                while (true) {
                    Object obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    PromoCollectionItem promoCollectionItem = (PromoCollectionItem) it.next();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCollectionItem.getId(), promoProductId)) {
                        for (Object obj2 : promoCollectionItem.getStatusList()) {
                            if (((PromoCollectionItem.Status) obj2) instanceof PromoCollectionItem.Status.Opened) {
                                obj = obj2;
                                break;
                            }
                        }
                        PromoCollectionItem.Status status = (PromoCollectionItem.Status) obj;
                        if (status != null && (promoCollectionItemPpxfxbqfkf = PromoCollectionItem.ppxfxbqfkf(promoCollectionItem, null, null, status, null, 11, null)) != null) {
                            promoCollectionItem = promoCollectionItemPpxfxbqfkf;
                        }
                    }
                    arrayList.add(promoCollectionItem);
                }
                pw.iobyxmoadg iobyxmoadgVarZoijcleaow = pw.iobyxmoadg.zoijcleaow(iobyxmoadgVar, null, arrayList, 1, null);
                mapIwizpuwonk = tzroggbefp.iwizpuwonk(mapIwizpuwonk);
                mapIwizpuwonk.replace(promoCollectionId, iobyxmoadgVarZoijcleaow);
            }
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
    }

    public final void gtknphoqwx(String promoCollectionId, List items) {
        Object value;
        Map mapIwizpuwonk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        zynmafqrjb zynmafqrjbVar = this.f80936iobyxmoadg;
        do {
            value = zynmafqrjbVar.getValue();
            mapIwizpuwonk = (Map) value;
            pw.iobyxmoadg iobyxmoadgVar = (pw.iobyxmoadg) mapIwizpuwonk.get(promoCollectionId);
            pw.iobyxmoadg iobyxmoadgVarZoijcleaow = iobyxmoadgVar != null ? pw.iobyxmoadg.zoijcleaow(iobyxmoadgVar, null, items, 1, null) : null;
            if (iobyxmoadgVarZoijcleaow != null) {
                mapIwizpuwonk = tzroggbefp.iwizpuwonk(mapIwizpuwonk);
                mapIwizpuwonk.replace(promoCollectionId, iobyxmoadgVarZoijcleaow);
            }
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
    }

    public final void gxszxtbevo(final String screenTag) {
        Object value;
        Map mapIwizpuwonk;
        Object value2;
        Map map;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        zynmafqrjb zynmafqrjbVar = this.f80937zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
            mapIwizpuwonk = tzroggbefp.iwizpuwonk((Map) value);
            final rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq() { // from class: qw.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.lqeggnwhkg(screenTag, (String) obj, (Set) obj2);
                }
            };
            mapIwizpuwonk.replaceAll(new BiFunction() { // from class: qw.zoijcleaow
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return ppxfxbqfkf.nufgyqmvbu(rgvfuqvkyqVar, obj, obj2);
                }
            });
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
        zynmafqrjb zynmafqrjbVar2 = this.f80936iobyxmoadg;
        do {
            value2 = zynmafqrjbVar2.getValue();
            map = (Map) value2;
            Map map2 = (Map) this.f80937zoijcleaow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                if (!((Set) entry.getValue()).isEmpty()) {
                    key = null;
                }
                String str = (String) key;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (!arrayList.contains((String) entry2.getKey())) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                map = linkedHashMap;
            }
        } while (!zynmafqrjbVar2.compareAndSet(value2, map));
    }

    public final void ppxfxbqfkf(PromoCollectionInfo info, List items) {
        Object value;
        Map mapIwizpuwonk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        zynmafqrjb zynmafqrjbVar = this.f80936iobyxmoadg;
        do {
            value = zynmafqrjbVar.getValue();
            mapIwizpuwonk = tzroggbefp.iwizpuwonk((Map) value);
            mapIwizpuwonk.put(info.getCollectionId(), new pw.iobyxmoadg(info, items));
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
    }
}

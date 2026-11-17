package l00;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cllcsxoeiz;
import pj.pkzmftpjix;
import sj.kegysxyocb;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow extends l00.iobyxmoadg {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final iobyxmoadg f61309rgvfuqvkyq = new iobyxmoadg(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final w10.nufgyqmvbu f61310agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final zynmafqrjb f61311ojitshcjhn;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final e10.eablkybsjg iobyxmoadg(e10.eablkybsjg product) {
            e10.eablkybsjg eablkybsjgVarZoijcleaow;
            zdlpuopuiu.btonecajqb(product, "product");
            e10.eablkybsjg eablkybsjgVar = !product.yggfygwlhe() ? product : null;
            return (eablkybsjgVar == null || (eablkybsjgVarZoijcleaow = e10.eablkybsjg.zoijcleaow(eablkybsjgVar, null, null, false, null, 0.0d, null, 0, null, null, 0, null, null, null, 0.0d, false, null, null, null, 0.0d, false, null, 1835007, null)) == null) ? product : eablkybsjgVarZoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f61312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f61313zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f61314yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f61315zdlpuopuiu;

            /* JADX INFO: renamed from: l00.zoijcleaow$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1236iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f61317yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f61318zdlpuopuiu;

                public C1236iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f61318zdlpuopuiu = obj;
                    this.f61317yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f61315zdlpuopuiu = nufgyqmvbuVar;
                this.f61314yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1236iobyxmoadg c1236iobyxmoadg;
                if (gxszxtbevoVar instanceof C1236iobyxmoadg) {
                    c1236iobyxmoadg = (C1236iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1236iobyxmoadg.f61317yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1236iobyxmoadg.f61317yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1236iobyxmoadg = new C1236iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1236iobyxmoadg = new C1236iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1236iobyxmoadg.f61318zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1236iobyxmoadg.f61317yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f61315zdlpuopuiu;
                    List listYlkuphrtab = this.f61314yggfygwlhe.ylkuphrtab((List) obj);
                    c1236iobyxmoadg.f61317yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listYlkuphrtab, c1236iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f61313zdlpuopuiu = lqeggnwhkgVar;
            this.f61312yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f61313zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f61312yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f61319jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61320yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61321zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61321zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) ((Map) this.f61320yggfygwlhe).get((String) this.f61319jyumaefscl);
            return list == null ? jyumaefscl.wflxmlrfwp() : list;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, String str, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f61320yggfygwlhe = map;
            wkgbmnqykcVar.f61319jyumaefscl = str;
            return wkgbmnqykcVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: l00.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1237zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f61322jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61324zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1237zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61322jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C1237zoijcleaow(this.f61322jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zynmafqrjb zynmafqrjbVarPkzmftpjix;
            String str;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61324zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!zdlpuopuiu.eablkybsjg((String) zoijcleaow.this.pkzmftpjix().getValue(), this.f61322jyumaefscl)) {
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    this.f61324zdlpuopuiu = 1;
                    if (zoijcleaowVar.jyumaefscl(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zynmafqrjbVarPkzmftpjix = zoijcleaow.this.pkzmftpjix();
                    str = this.f61322jyumaefscl;
                    this.f61324zdlpuopuiu = 2;
                    if (zynmafqrjbVarPkzmftpjix.emit(str, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else if (i13 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zynmafqrjbVarPkzmftpjix = zoijcleaow.this.pkzmftpjix();
                str = this.f61322jyumaefscl;
                this.f61324zdlpuopuiu = 2;
                if (zynmafqrjbVarPkzmftpjix.emit(str, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1237zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(w10.nufgyqmvbu orderLocalSource, lqeggnwhkg changeProductAnalyticHelper, pkzmftpjix dispatcher) {
        super(changeProductAnalyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(changeProductAnalyticHelper, "changeProductAnalyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f61310agtfadlqog = orderLocalSource;
        this.f61311ojitshcjhn = kegysxyocb.iobyxmoadg("");
    }

    @Override // l00.iobyxmoadg
    protected sj.lqeggnwhkg cqumvgiudr() {
        return sj.dxjokdxxww.vdvldrhtss(new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(this.f61310agtfadlqog.zoijcleaow(), this.f61311ojitshcjhn, new wkgbmnqykc(null)), this));
    }

    protected final zynmafqrjb pkzmftpjix() {
        return this.f61311ojitshcjhn;
    }

    public final void wwaezpbzkn(String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        pj.gtknphoqwx.wkgbmnqykc(iwizpuwonk(), null, null, new C1237zoijcleaow(orderId, null), 3, null);
    }

    protected final List ylkuphrtab(List products) {
        zdlpuopuiu.btonecajqb(products, "products");
        ArrayList arrayList = new ArrayList();
        Iterator it = products.iterator();
        while (it.hasNext()) {
            u00.iobyxmoadg iobyxmoadgVar = (u00.iobyxmoadg) it.next();
            if (iobyxmoadgVar.wkgbmnqykc() <= 0.0d) {
                iobyxmoadgVar = null;
            }
            if (iobyxmoadgVar != null) {
                arrayList.add(iobyxmoadgVar);
            }
        }
        return arrayList;
    }
}

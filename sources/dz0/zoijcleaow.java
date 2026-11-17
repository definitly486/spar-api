package dz0;

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

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow extends dz0.iobyxmoadg {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final iobyxmoadg f30062rgvfuqvkyq = new iobyxmoadg(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final k01.nufgyqmvbu f30063agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final zynmafqrjb f30064ojitshcjhn;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final uz0.eablkybsjg iobyxmoadg(uz0.eablkybsjg product) {
            uz0.eablkybsjg eablkybsjgVarZoijcleaow;
            zdlpuopuiu.btonecajqb(product, "product");
            uz0.eablkybsjg eablkybsjgVar = !product.yggfygwlhe() ? product : null;
            return (eablkybsjgVar == null || (eablkybsjgVarZoijcleaow = uz0.eablkybsjg.zoijcleaow(eablkybsjgVar, null, null, false, null, 0.0d, null, 0, null, null, 0, null, null, null, 0.0d, false, null, null, null, 0.0d, false, null, 1835007, null)) == null) ? product : eablkybsjgVarZoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f30065yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f30066zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f30067yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f30068zdlpuopuiu;

            /* JADX INFO: renamed from: dz0.zoijcleaow$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0622iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f30070yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f30071zdlpuopuiu;

                public C0622iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f30071zdlpuopuiu = obj;
                    this.f30070yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f30068zdlpuopuiu = nufgyqmvbuVar;
                this.f30067yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0622iobyxmoadg c0622iobyxmoadg;
                if (gxszxtbevoVar instanceof C0622iobyxmoadg) {
                    c0622iobyxmoadg = (C0622iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0622iobyxmoadg.f30070yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0622iobyxmoadg.f30070yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0622iobyxmoadg = new C0622iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0622iobyxmoadg = new C0622iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0622iobyxmoadg.f30071zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0622iobyxmoadg.f30070yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f30068zdlpuopuiu;
                    List listYlkuphrtab = this.f30067yggfygwlhe.ylkuphrtab((List) obj);
                    c0622iobyxmoadg.f30070yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listYlkuphrtab, c0622iobyxmoadg) == objGxszxtbevo) {
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
            this.f30066zdlpuopuiu = lqeggnwhkgVar;
            this.f30065yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f30066zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f30065yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f30072jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f30073yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30074zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f30074zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) ((Map) this.f30073yggfygwlhe).get((String) this.f30072jyumaefscl);
            return list == null ? jyumaefscl.wflxmlrfwp() : list;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, String str, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f30073yggfygwlhe = map;
            wkgbmnqykcVar.f30072jyumaefscl = str;
            return wkgbmnqykcVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: dz0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0623zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f30075jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30077zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0623zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30075jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C0623zoijcleaow(this.f30075jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zynmafqrjb zynmafqrjbVarPkzmftpjix;
            String str;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30077zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!zdlpuopuiu.eablkybsjg((String) zoijcleaow.this.pkzmftpjix().getValue(), this.f30075jyumaefscl)) {
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    this.f30077zdlpuopuiu = 1;
                    if (zoijcleaowVar.jyumaefscl(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zynmafqrjbVarPkzmftpjix = zoijcleaow.this.pkzmftpjix();
                    str = this.f30075jyumaefscl;
                    this.f30077zdlpuopuiu = 2;
                    if (zynmafqrjbVarPkzmftpjix.emit(str, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else if (i13 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zynmafqrjbVarPkzmftpjix = zoijcleaow.this.pkzmftpjix();
                str = this.f30075jyumaefscl;
                this.f30077zdlpuopuiu = 2;
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
            return ((C0623zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(k01.nufgyqmvbu orderLocalSource, lqeggnwhkg changeProductAnalyticHelper, pkzmftpjix dispatcher) {
        super(changeProductAnalyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(changeProductAnalyticHelper, "changeProductAnalyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f30063agtfadlqog = orderLocalSource;
        this.f30064ojitshcjhn = kegysxyocb.iobyxmoadg("");
    }

    @Override // dz0.iobyxmoadg
    protected sj.lqeggnwhkg cqumvgiudr() {
        return sj.dxjokdxxww.vdvldrhtss(new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(this.f30063agtfadlqog.zoijcleaow(), this.f30064ojitshcjhn, new wkgbmnqykc(null)), this));
    }

    protected final zynmafqrjb pkzmftpjix() {
        return this.f30064ojitshcjhn;
    }

    public final void wwaezpbzkn(String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        pj.gtknphoqwx.wkgbmnqykc(iwizpuwonk(), null, null, new C0623zoijcleaow(orderId, null), 3, null);
    }

    protected final List ylkuphrtab(List products) {
        zdlpuopuiu.btonecajqb(products, "products");
        ArrayList arrayList = new ArrayList();
        Iterator it = products.iterator();
        while (it.hasNext()) {
            lz0.iobyxmoadg iobyxmoadgVar = (lz0.iobyxmoadg) it.next();
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

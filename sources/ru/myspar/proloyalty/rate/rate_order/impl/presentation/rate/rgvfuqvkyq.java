package ru.myspar.proloyalty.rate.rate_order.impl.presentation.rate;

import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq extends sw0.eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final i01.ppxfxbqfkf f100152agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zl1.ppxfxbqfkf f100153btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final zl1.zoijcleaow f100154draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final q41.iobyxmoadg f100155dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final zl1.iobyxmoadg f100156gtknphoqwx;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f100157jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final List f100158kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final c11.ppxfxbqfkf f100159lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final c11.wkgbmnqykc f100160nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final RateOrderPayload f100161ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f100162oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final ul1.iobyxmoadg f100163rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private sz0.ppxfxbqfkf f100164vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final bz0.gxszxtbevo f100165wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f100166yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f100167zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f100151iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f100150cqumvgiudr = 8;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f100168jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f100170zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f100170zdlpuopuiu = obj;
            this.f100168jyumaefscl |= Integer.MIN_VALUE;
            Object objSopmlzcsov = rgvfuqvkyq.this.sopmlzcsov(this);
            return objSopmlzcsov == mg.zoijcleaow.gxszxtbevo() ? objSopmlzcsov : kcexrzcfyt.iobyxmoadg(objSopmlzcsov);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100172zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return rgvfuqvkyq.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objSopmlzcsov;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100172zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rgvfuqvkyq.this.czzsidtyhn();
                rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.this;
                this.f100172zdlpuopuiu = 1;
                objSopmlzcsov = rgvfuqvkyqVar.sopmlzcsov(this);
                if (objSopmlzcsov == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                objSopmlzcsov = ((kcexrzcfyt) obj).rgvfuqvkyq();
            }
            rgvfuqvkyq rgvfuqvkyqVar2 = rgvfuqvkyq.this;
            if (kcexrzcfyt.agtfadlqog(objSopmlzcsov)) {
                rgvfuqvkyqVar2.crxdokpmqz((sz0.ppxfxbqfkf) objSopmlzcsov);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objSopmlzcsov);
            if (thDxjokdxxww != null) {
                rgvfuqvkyqVar2.zdlpuopuiu(thDxjokdxxww);
            }
            rgvfuqvkyq.this.jlmebxxoox();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100174zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return rgvfuqvkyq.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objBtonecajqb;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100174zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rgvfuqvkyq.this.czzsidtyhn();
                bz0.gxszxtbevo gxszxtbevoVar = rgvfuqvkyq.this.f100165wflxmlrfwp;
                String orderId = rgvfuqvkyq.this.f100161ojitshcjhn.getOrderId();
                int i14 = rgvfuqvkyq.this.f100162oxmwwwfdhm;
                rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.this;
                String strNtlheqmsrt = rgvfuqvkyqVar.ntlheqmsrt(((xl1.zoijcleaow) rgvfuqvkyqVar.ojitshcjhn().getValue()).ppxfxbqfkf());
                this.f100174zdlpuopuiu = 1;
                objBtonecajqb = gxszxtbevoVar.btonecajqb(orderId, i14, strNtlheqmsrt, this);
                if (objBtonecajqb == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                objBtonecajqb = ((kcexrzcfyt) obj).rgvfuqvkyq();
            }
            rgvfuqvkyq rgvfuqvkyqVar2 = rgvfuqvkyq.this;
            if (kcexrzcfyt.agtfadlqog(objBtonecajqb)) {
                rgvfuqvkyqVar2.vipkmwdibw();
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objBtonecajqb);
            if (thDxjokdxxww != null) {
                rgvfuqvkyqVar2.zdlpuopuiu(thDxjokdxxww);
            }
            rgvfuqvkyq.this.jlmebxxoox();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f100176iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f100177jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f100178yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f100179zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return rgvfuqvkyq.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            rgvfuqvkyq rgvfuqvkyqVar;
            Object obj2;
            rgvfuqvkyq rgvfuqvkyqVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100176iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rgvfuqvkyqVar2 = (rgvfuqvkyq) this.f100177jyumaefscl;
                        rgvfuqvkyqVar = (rgvfuqvkyq) this.f100178yggfygwlhe;
                        obj2 = this.f100179zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    rgvfuqvkyqVar.vipkmwdibw();
                    rgvfuqvkyqVar = rgvfuqvkyqVar2;
                    objWkgbmnqykc = obj2;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        rgvfuqvkyqVar.zdlpuopuiu(thDxjokdxxww);
                    }
                    rgvfuqvkyq.this.jlmebxxoox();
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                rgvfuqvkyq.this.czzsidtyhn();
                rgvfuqvkyq rgvfuqvkyqVar3 = rgvfuqvkyq.this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                bz0.gxszxtbevo gxszxtbevoVar = rgvfuqvkyqVar3.f100165wflxmlrfwp;
                String orderId = rgvfuqvkyqVar3.f100161ojitshcjhn.getOrderId();
                String strNtlheqmsrt = rgvfuqvkyqVar3.ntlheqmsrt(((xl1.zoijcleaow) rgvfuqvkyqVar3.ojitshcjhn().getValue()).ppxfxbqfkf());
                this.f100176iwizpuwonk = 1;
                if (gxszxtbevoVar.dxjokdxxww(orderId, strNtlheqmsrt, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            rgvfuqvkyqVar = rgvfuqvkyq.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                i01.ppxfxbqfkf ppxfxbqfkfVar = rgvfuqvkyqVar.f100152agtfadlqog;
                this.f100179zdlpuopuiu = objWkgbmnqykc;
                this.f100178yggfygwlhe = rgvfuqvkyqVar;
                this.f100177jyumaefscl = rgvfuqvkyqVar;
                this.f100176iwizpuwonk = 2;
                if (ppxfxbqfkfVar.btonecajqb(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                rgvfuqvkyqVar2 = rgvfuqvkyqVar;
                rgvfuqvkyqVar.vipkmwdibw();
                rgvfuqvkyqVar = rgvfuqvkyqVar2;
                objWkgbmnqykc = obj2;
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                rgvfuqvkyqVar.zdlpuopuiu(thDxjokdxxww);
            }
            rgvfuqvkyq.this.jlmebxxoox();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f100180jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f100182zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f100182zdlpuopuiu = obj;
            this.f100180jyumaefscl |= Integer.MIN_VALUE;
            Object objUlzqkzuiru = rgvfuqvkyq.this.ulzqkzuiru(this);
            return objUlzqkzuiru == mg.zoijcleaow.gxszxtbevo() ? objUlzqkzuiru : kcexrzcfyt.iobyxmoadg(objUlzqkzuiru);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100183iobyxmoadg;

        static {
            int[] iArr = new int[RateOrderPayload.ppxfxbqfkf.values().length];
            try {
                iArr[RateOrderPayload.ppxfxbqfkf.ACTUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RateOrderPayload.ppxfxbqfkf.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100183iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(c11.ppxfxbqfkf getFeedbackVariantsUseCase, c11.wkgbmnqykc getOrderReferencesUseCase, q41.iobyxmoadg resourcesManager, zl1.ppxfxbqfkf rateOrderItemListMapper, zl1.iobyxmoadg negativeItemsMapper, zl1.zoijcleaow positiveItemsMapper, bz0.gxszxtbevo rateOrderInteractor, i01.ppxfxbqfkf changeNotificationObserver, RateOrderPayload payload, ul1.iobyxmoadg rateOrderFeatureApi) {
        super(new xl1.zoijcleaow(null, false, false, 7, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFeedbackVariantsUseCase, "getFeedbackVariantsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderReferencesUseCase, "getOrderReferencesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderItemListMapper, "rateOrderItemListMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(negativeItemsMapper, "negativeItemsMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(positiveItemsMapper, "positiveItemsMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderInteractor, "rateOrderInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeNotificationObserver, "changeNotificationObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderFeatureApi, "rateOrderFeatureApi");
        this.f100159lqeggnwhkg = getFeedbackVariantsUseCase;
        this.f100160nufgyqmvbu = getOrderReferencesUseCase;
        this.f100155dxjokdxxww = resourcesManager;
        this.f100153btonecajqb = rateOrderItemListMapper;
        this.f100156gtknphoqwx = negativeItemsMapper;
        this.f100154draadjrbmk = positiveItemsMapper;
        this.f100165wflxmlrfwp = rateOrderInteractor;
        this.f100152agtfadlqog = changeNotificationObserver;
        this.f100161ojitshcjhn = payload;
        this.f100163rgvfuqvkyq = rateOrderFeatureApi;
        this.f100158kcexrzcfyt = new ArrayList();
        this.f100167zdlpuopuiu = new ArrayList();
        this.f100166yggfygwlhe = new ArrayList();
        this.f100157jyumaefscl = new ArrayList();
        ribwqtqdhb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void crxdokpmqz(sz0.ppxfxbqfkf ppxfxbqfkfVar) {
        Object value;
        Object value2;
        this.f100164vdvldrhtss = ppxfxbqfkfVar;
        int i13 = zoijcleaow.f100183iobyxmoadg[this.f100161ojitshcjhn.getRateType().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f100157jyumaefscl.addAll(this.f100153btonecajqb.invoke(ppxfxbqfkfVar));
            zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value2 = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value2, xl1.zoijcleaow.zoijcleaow((xl1.zoijcleaow) value2, this.f100157jyumaefscl, true, false, 4, null)));
            return;
        }
        this.f100158kcexrzcfyt.add(new am1.eablkybsjg(this.f100155dxjokdxxww.getString(vl1.ppxfxbqfkf.proloyalty_rate_order_title), 0, "", false));
        this.f100167zdlpuopuiu.addAll(this.f100154draadjrbmk.iobyxmoadg(ppxfxbqfkfVar, this.f100162oxmwwwfdhm));
        this.f100166yggfygwlhe.addAll(this.f100156gtknphoqwx.iobyxmoadg(ppxfxbqfkfVar, this.f100162oxmwwwfdhm));
        zynmafqrjb zynmafqrjbVarOjitshcjhn2 = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn2.getValue();
        } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, xl1.zoijcleaow.zoijcleaow((xl1.zoijcleaow) value, this.f100158kcexrzcfyt, false, false, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, xl1.zoijcleaow.zoijcleaow((xl1.zoijcleaow) value, null, false, true, 3, null)));
    }

    private final void ikoacuggdj(String str) {
        Object objPrevious;
        List listPpxfxbqfkf = ((xl1.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf();
        ListIterator listIterator = listPpxfxbqfkf.listIterator(listPpxfxbqfkf.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(((am1.ppxfxbqfkf) objPrevious) instanceof am1.zoijcleaow));
        am1.ppxfxbqfkf ppxfxbqfkfVar = (am1.ppxfxbqfkf) objPrevious;
        int iNuxfzjnpeb = jyumaefscl.nuxfzjnpeb(((xl1.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf(), ppxfxbqfkfVar);
        if (iNuxfzjnpeb == -1) {
            return;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type ru.myspar.proloyalty.rate.rate_order.impl.presentation.models.CommentItemUiModel");
        am1.zoijcleaow zoijcleaowVar = new am1.zoijcleaow(((am1.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg(), str);
        if (this.f100161ojitshcjhn.getRateType() != RateOrderPayload.ppxfxbqfkf.ACTUAL) {
            this.f100157jyumaefscl.set(iNuxfzjnpeb, zoijcleaowVar);
        } else if (this.f100162oxmwwwfdhm <= 3) {
            this.f100166yggfygwlhe.set(iNuxfzjnpeb, zoijcleaowVar);
        } else {
            this.f100167zdlpuopuiu.set(iNuxfzjnpeb, zoijcleaowVar);
        }
    }

    private final void jhduphickx() {
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jlmebxxoox() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, xl1.zoijcleaow.zoijcleaow((xl1.zoijcleaow) value, null, false, false, 3, null)));
    }

    private final void jztzpxfvev() {
        int i13 = zoijcleaow.f100183iobyxmoadg[this.f100161ojitshcjhn.getRateType().ordinal()];
        if (i13 == 1) {
            rlfsiqarku();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mbcevpiqjq();
        }
    }

    private final auzgnhcxok mbcevpiqjq() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    private final void metgxyhuhe(vdvldrhtss vdvldrhtssVar) {
        ArrayList arrayList = new ArrayList();
        for (am1.ppxfxbqfkf ppxfxbqfkfVar : ((xl1.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf()) {
            if ((ppxfxbqfkfVar instanceof am1.gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.getItemId(), vdvldrhtssVar.lqeggnwhkg())) {
                am1.gxszxtbevo gxszxtbevoVar = (am1.gxszxtbevo) ppxfxbqfkfVar;
                arrayList.add(new am1.gxszxtbevo(gxszxtbevoVar.iobyxmoadg(), ((Boolean) vdvldrhtssVar.nufgyqmvbu()).booleanValue(), gxszxtbevoVar.wkgbmnqykc()));
            } else {
                arrayList.add(ppxfxbqfkfVar);
            }
        }
        if (this.f100161ojitshcjhn.getRateType() != RateOrderPayload.ppxfxbqfkf.ACTUAL) {
            this.f100157jyumaefscl.clear();
            this.f100157jyumaefscl.addAll(arrayList);
        } else if (this.f100162oxmwwwfdhm <= 3) {
            this.f100166yggfygwlhe.clear();
            this.f100166yggfygwlhe.addAll(arrayList);
        } else {
            this.f100167zdlpuopuiu.clear();
            this.f100167zdlpuopuiu.addAll(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String ntlheqmsrt(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            am1.ppxfxbqfkf ppxfxbqfkfVar = (am1.ppxfxbqfkf) it.next();
            if (ppxfxbqfkfVar instanceof am1.gxszxtbevo) {
                am1.gxszxtbevo gxszxtbevoVar = (am1.gxszxtbevo) ppxfxbqfkfVar;
                if (gxszxtbevoVar.eablkybsjg()) {
                    arrayList.add(gxszxtbevoVar.wkgbmnqykc());
                }
            }
            if (ppxfxbqfkfVar instanceof am1.zoijcleaow) {
                am1.zoijcleaow zoijcleaowVar = (am1.zoijcleaow) ppxfxbqfkfVar;
                if (zoijcleaowVar.wkgbmnqykc().length() > 0) {
                    arrayList.add(zoijcleaowVar.wkgbmnqykc());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return jyumaefscl.iwxlajgraz(arrayList, "\n", null, null, 0, null, null, 62, null);
    }

    private final auzgnhcxok ribwqtqdhb() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gxszxtbevo(null), 3, null);
    }

    private final auzgnhcxok rlfsiqarku() {
        return pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sopmlzcsov(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f100168jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f100168jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f100170zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f100168jyumaefscl;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                if (this.f100161ojitshcjhn.getDeliveryType() != null) {
                    eablkybsjgVar.f100168jyumaefscl = 2;
                    Object objUlzqkzuiru = ulzqkzuiru(eablkybsjgVar);
                    return objUlzqkzuiru == objGxszxtbevo ? objGxszxtbevo : objUlzqkzuiru;
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                c11.wkgbmnqykc wkgbmnqykcVar = this.f100160nufgyqmvbu;
                c11.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = new c11.wkgbmnqykc.iobyxmoadg(this.f100161ojitshcjhn.getOrderId());
                eablkybsjgVar.f100168jyumaefscl = 1;
                objZoijcleaow = wkgbmnqykcVar.zoijcleaow(iobyxmoadgVar2, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    return ((kcexrzcfyt) objZoijcleaow).rgvfuqvkyq();
                }
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return kcexrzcfyt.wkgbmnqykc((sz0.ppxfxbqfkf) objZoijcleaow);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ulzqkzuiru(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        sz0.ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f100180jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f100180jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f100182zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f100180jyumaefscl;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                int i15 = zoijcleaow.f100183iobyxmoadg[this.f100161ojitshcjhn.getRateType().ordinal()];
                if (i15 == 1) {
                    c11.ppxfxbqfkf ppxfxbqfkfVar2 = this.f100159lqeggnwhkg;
                    c11.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new c11.ppxfxbqfkf.iobyxmoadg(jyumaefscl.rgvfuqvkyq(new c01.iobyxmoadg(c01.iobyxmoadg.EnumC0336iobyxmoadg.POSITIVE, this.f100161ojitshcjhn.getDeliveryType()), new c01.iobyxmoadg(c01.iobyxmoadg.EnumC0336iobyxmoadg.NEGATIVE, this.f100161ojitshcjhn.getDeliveryType())));
                    wkgbmnqykcVar.f100180jyumaefscl = 1;
                    objZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar2, wkgbmnqykcVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ppxfxbqfkfVar = (sz0.ppxfxbqfkf) objZoijcleaow;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c11.ppxfxbqfkf ppxfxbqfkfVar3 = this.f100159lqeggnwhkg;
                    c11.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = new c11.ppxfxbqfkf.iobyxmoadg(jyumaefscl.eablkybsjg(new c01.iobyxmoadg(c01.iobyxmoadg.EnumC0336iobyxmoadg.CANCEL, this.f100161ojitshcjhn.getDeliveryType())));
                    wkgbmnqykcVar.f100180jyumaefscl = 2;
                    objZoijcleaow = ppxfxbqfkfVar3.zoijcleaow(iobyxmoadgVar3, wkgbmnqykcVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ppxfxbqfkfVar = (sz0.ppxfxbqfkf) objZoijcleaow;
                }
            } else if (i14 == 1) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                ppxfxbqfkfVar = (sz0.ppxfxbqfkf) objZoijcleaow;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                ppxfxbqfkfVar = (sz0.ppxfxbqfkf) objZoijcleaow;
            }
            return kcexrzcfyt.wkgbmnqykc(ppxfxbqfkfVar);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vipkmwdibw() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().btonecajqb(this.f100163rgvfuqvkyq.iobyxmoadg(this.f100161ojitshcjhn));
    }

    private final void xrmfcynszj(int i13) {
        Object objPrevious;
        Object value;
        Object value2;
        this.f100162oxmwwwfdhm = i13;
        List listPpxfxbqfkf = ((xl1.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf();
        ListIterator listIterator = listPpxfxbqfkf.listIterator(listPpxfxbqfkf.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(((am1.ppxfxbqfkf) objPrevious) instanceof am1.eablkybsjg));
        am1.ppxfxbqfkf ppxfxbqfkfVar = (am1.ppxfxbqfkf) objPrevious;
        int iNuxfzjnpeb = jyumaefscl.nuxfzjnpeb(((xl1.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf(), ppxfxbqfkfVar);
        if (i13 <= 3) {
            if (iNuxfzjnpeb != -1 && ppxfxbqfkfVar != null) {
                this.f100166yggfygwlhe.set(iNuxfzjnpeb, am1.eablkybsjg.wkgbmnqykc((am1.eablkybsjg) ppxfxbqfkfVar, null, i13, null, false, 13, null));
            }
            zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value2 = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value2, xl1.zoijcleaow.zoijcleaow((xl1.zoijcleaow) value2, this.f100166yggfygwlhe, i13 > 0, false, 4, null)));
            return;
        }
        if (iNuxfzjnpeb != -1 && ppxfxbqfkfVar != null) {
            this.f100167zdlpuopuiu.set(iNuxfzjnpeb, am1.eablkybsjg.wkgbmnqykc((am1.eablkybsjg) ppxfxbqfkfVar, null, i13, null, false, 13, null));
        }
        zynmafqrjb zynmafqrjbVarOjitshcjhn2 = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn2.getValue();
        } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, xl1.zoijcleaow.zoijcleaow((xl1.zoijcleaow) value, this.f100167zdlpuopuiu, true, false, 4, null)));
    }

    public final void okpsazkaxt(xl1.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof xl1.iobyxmoadg.C3092iobyxmoadg) {
            jhduphickx();
            return;
        }
        if (event instanceof xl1.iobyxmoadg.ppxfxbqfkf) {
            jztzpxfvev();
            return;
        }
        if (event instanceof xl1.iobyxmoadg.wkgbmnqykc) {
            xrmfcynszj(((xl1.iobyxmoadg.wkgbmnqykc) event).iobyxmoadg());
        } else if (event instanceof xl1.iobyxmoadg.zoijcleaow) {
            ikoacuggdj(((xl1.iobyxmoadg.zoijcleaow) event).iobyxmoadg());
        } else {
            if (!(event instanceof xl1.iobyxmoadg.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe(((xl1.iobyxmoadg.eablkybsjg) event).iobyxmoadg());
        }
    }
}

package ru.myspar.rate.rate_order.impl.presentation.rate;

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
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq extends vx.eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final u10.ppxfxbqfkf f102864agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final i02.ppxfxbqfkf f102865btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final i02.zoijcleaow f102866draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final d60.iobyxmoadg f102867dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final i02.iobyxmoadg f102868gtknphoqwx;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f102869jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final List f102870kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final x20.ppxfxbqfkf f102871lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final x20.wkgbmnqykc f102872nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final RateOrderPayload f102873ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f102874oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final d02.iobyxmoadg f102875rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private c10.wkgbmnqykc f102876vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final j00.lqeggnwhkg f102877wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f102878yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f102879zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f102863iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f102862cqumvgiudr = 8;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f102880jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f102882zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f102882zdlpuopuiu = obj;
            this.f102880jyumaefscl |= Integer.MIN_VALUE;
            Object objSopmlzcsov = rgvfuqvkyq.this.sopmlzcsov(this);
            return objSopmlzcsov == mg.zoijcleaow.gxszxtbevo() ? objSopmlzcsov : kcexrzcfyt.iobyxmoadg(objSopmlzcsov);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f102884zdlpuopuiu;

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
            int i13 = this.f102884zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rgvfuqvkyq.this.czzsidtyhn();
                rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.this;
                this.f102884zdlpuopuiu = 1;
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
                rgvfuqvkyqVar2.crxdokpmqz((c10.wkgbmnqykc) objSopmlzcsov);
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
        int f102886zdlpuopuiu;

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
            int i13 = this.f102886zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rgvfuqvkyq.this.czzsidtyhn();
                j00.lqeggnwhkg lqeggnwhkgVar = rgvfuqvkyq.this.f102877wflxmlrfwp;
                String orderId = rgvfuqvkyq.this.f102873ojitshcjhn.getOrderId();
                int i14 = rgvfuqvkyq.this.f102874oxmwwwfdhm;
                rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.this;
                String strNtlheqmsrt = rgvfuqvkyqVar.ntlheqmsrt(((g02.zoijcleaow) rgvfuqvkyqVar.ojitshcjhn().getValue()).ppxfxbqfkf());
                this.f102886zdlpuopuiu = 1;
                objBtonecajqb = lqeggnwhkgVar.btonecajqb(orderId, i14, strNtlheqmsrt, this);
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
        int f102888iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f102889jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f102890yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f102891zdlpuopuiu;

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
            int i13 = this.f102888iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rgvfuqvkyqVar2 = (rgvfuqvkyq) this.f102889jyumaefscl;
                        rgvfuqvkyqVar = (rgvfuqvkyq) this.f102890yggfygwlhe;
                        obj2 = this.f102891zdlpuopuiu;
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
                j00.lqeggnwhkg lqeggnwhkgVar = rgvfuqvkyqVar3.f102877wflxmlrfwp;
                String orderId = rgvfuqvkyqVar3.f102873ojitshcjhn.getOrderId();
                String strNtlheqmsrt = rgvfuqvkyqVar3.ntlheqmsrt(((g02.zoijcleaow) rgvfuqvkyqVar3.ojitshcjhn().getValue()).ppxfxbqfkf());
                this.f102888iwizpuwonk = 1;
                if (lqeggnwhkgVar.dxjokdxxww(orderId, strNtlheqmsrt, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            rgvfuqvkyqVar = rgvfuqvkyq.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                u10.ppxfxbqfkf ppxfxbqfkfVar = rgvfuqvkyqVar.f102864agtfadlqog;
                this.f102891zdlpuopuiu = objWkgbmnqykc;
                this.f102890yggfygwlhe = rgvfuqvkyqVar;
                this.f102889jyumaefscl = rgvfuqvkyqVar;
                this.f102888iwizpuwonk = 2;
                if (ppxfxbqfkfVar.gtknphoqwx(this) == objGxszxtbevo) {
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
        int f102892jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f102894zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f102894zdlpuopuiu = obj;
            this.f102892jyumaefscl |= Integer.MIN_VALUE;
            Object objUlzqkzuiru = rgvfuqvkyq.this.ulzqkzuiru(this);
            return objUlzqkzuiru == mg.zoijcleaow.gxszxtbevo() ? objUlzqkzuiru : kcexrzcfyt.iobyxmoadg(objUlzqkzuiru);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f102895iobyxmoadg;

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
            f102895iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(x20.ppxfxbqfkf getFeedbackVariantsUseCase, x20.wkgbmnqykc getOrderReferencesUseCase, d60.iobyxmoadg resourcesManager, i02.ppxfxbqfkf rateOrderItemListMapper, i02.iobyxmoadg negativeItemsMapper, i02.zoijcleaow positiveItemsMapper, j00.lqeggnwhkg rateOrderInteractor, u10.ppxfxbqfkf changeNotificationObserver, RateOrderPayload payload, d02.iobyxmoadg rateOrderFeatureApi) {
        super(new g02.zoijcleaow(null, false, false, 7, null));
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
        this.f102871lqeggnwhkg = getFeedbackVariantsUseCase;
        this.f102872nufgyqmvbu = getOrderReferencesUseCase;
        this.f102867dxjokdxxww = resourcesManager;
        this.f102865btonecajqb = rateOrderItemListMapper;
        this.f102868gtknphoqwx = negativeItemsMapper;
        this.f102866draadjrbmk = positiveItemsMapper;
        this.f102877wflxmlrfwp = rateOrderInteractor;
        this.f102864agtfadlqog = changeNotificationObserver;
        this.f102873ojitshcjhn = payload;
        this.f102875rgvfuqvkyq = rateOrderFeatureApi;
        this.f102870kcexrzcfyt = new ArrayList();
        this.f102879zdlpuopuiu = new ArrayList();
        this.f102878yggfygwlhe = new ArrayList();
        this.f102869jyumaefscl = new ArrayList();
        ribwqtqdhb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void crxdokpmqz(c10.wkgbmnqykc wkgbmnqykcVar) {
        Object value;
        Object value2;
        this.f102876vdvldrhtss = wkgbmnqykcVar;
        int i13 = zoijcleaow.f102895iobyxmoadg[this.f102873ojitshcjhn.getRateType().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f102869jyumaefscl.addAll(this.f102865btonecajqb.invoke(wkgbmnqykcVar));
            zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value2 = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value2, g02.zoijcleaow.zoijcleaow((g02.zoijcleaow) value2, this.f102869jyumaefscl, true, false, 4, null)));
            return;
        }
        this.f102870kcexrzcfyt.add(new j02.eablkybsjg(this.f102867dxjokdxxww.getString(e02.ppxfxbqfkf.rate_order_title), 0, "", false));
        this.f102879zdlpuopuiu.addAll(this.f102866draadjrbmk.iobyxmoadg(wkgbmnqykcVar, this.f102874oxmwwwfdhm));
        this.f102878yggfygwlhe.addAll(this.f102868gtknphoqwx.iobyxmoadg(wkgbmnqykcVar, this.f102874oxmwwwfdhm));
        zynmafqrjb zynmafqrjbVarOjitshcjhn2 = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn2.getValue();
        } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, g02.zoijcleaow.zoijcleaow((g02.zoijcleaow) value, this.f102870kcexrzcfyt, false, false, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, g02.zoijcleaow.zoijcleaow((g02.zoijcleaow) value, null, false, true, 3, null)));
    }

    private final void ikoacuggdj(String str) {
        Object objPrevious;
        List listPpxfxbqfkf = ((g02.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf();
        ListIterator listIterator = listPpxfxbqfkf.listIterator(listPpxfxbqfkf.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(((j02.ppxfxbqfkf) objPrevious) instanceof j02.zoijcleaow));
        j02.ppxfxbqfkf ppxfxbqfkfVar = (j02.ppxfxbqfkf) objPrevious;
        int iNuxfzjnpeb = jyumaefscl.nuxfzjnpeb(((g02.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf(), ppxfxbqfkfVar);
        if (iNuxfzjnpeb == -1) {
            return;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type ru.myspar.rate.rate_order.impl.presentation.models.CommentItemUiModel");
        j02.zoijcleaow zoijcleaowVar = new j02.zoijcleaow(((j02.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg(), str);
        if (this.f102873ojitshcjhn.getRateType() != RateOrderPayload.ppxfxbqfkf.ACTUAL) {
            this.f102869jyumaefscl.set(iNuxfzjnpeb, zoijcleaowVar);
        } else if (this.f102874oxmwwwfdhm <= 3) {
            this.f102878yggfygwlhe.set(iNuxfzjnpeb, zoijcleaowVar);
        } else {
            this.f102879zdlpuopuiu.set(iNuxfzjnpeb, zoijcleaowVar);
        }
    }

    private final void jhduphickx() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jlmebxxoox() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, g02.zoijcleaow.zoijcleaow((g02.zoijcleaow) value, null, false, false, 3, null)));
    }

    private final void jztzpxfvev() {
        int i13 = zoijcleaow.f102895iobyxmoadg[this.f102873ojitshcjhn.getRateType().ordinal()];
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
        for (j02.ppxfxbqfkf ppxfxbqfkfVar : ((g02.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf()) {
            if ((ppxfxbqfkfVar instanceof j02.gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.getItemId(), vdvldrhtssVar.lqeggnwhkg())) {
                j02.gxszxtbevo gxszxtbevoVar = (j02.gxszxtbevo) ppxfxbqfkfVar;
                arrayList.add(new j02.gxszxtbevo(gxszxtbevoVar.iobyxmoadg(), ((Boolean) vdvldrhtssVar.nufgyqmvbu()).booleanValue(), gxszxtbevoVar.wkgbmnqykc()));
            } else {
                arrayList.add(ppxfxbqfkfVar);
            }
        }
        if (this.f102873ojitshcjhn.getRateType() != RateOrderPayload.ppxfxbqfkf.ACTUAL) {
            this.f102869jyumaefscl.clear();
            this.f102869jyumaefscl.addAll(arrayList);
        } else if (this.f102874oxmwwwfdhm <= 3) {
            this.f102878yggfygwlhe.clear();
            this.f102878yggfygwlhe.addAll(arrayList);
        } else {
            this.f102879zdlpuopuiu.clear();
            this.f102879zdlpuopuiu.addAll(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String ntlheqmsrt(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j02.ppxfxbqfkf ppxfxbqfkfVar = (j02.ppxfxbqfkf) it.next();
            if (ppxfxbqfkfVar instanceof j02.gxszxtbevo) {
                j02.gxszxtbevo gxszxtbevoVar = (j02.gxszxtbevo) ppxfxbqfkfVar;
                if (gxszxtbevoVar.eablkybsjg()) {
                    arrayList.add(gxszxtbevoVar.wkgbmnqykc());
                }
            }
            if (ppxfxbqfkfVar instanceof j02.zoijcleaow) {
                j02.zoijcleaow zoijcleaowVar = (j02.zoijcleaow) ppxfxbqfkfVar;
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
            int i13 = eablkybsjgVar.f102880jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f102880jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f102882zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f102880jyumaefscl;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                if (this.f102873ojitshcjhn.getDeliveryType() != null) {
                    eablkybsjgVar.f102880jyumaefscl = 2;
                    Object objUlzqkzuiru = ulzqkzuiru(eablkybsjgVar);
                    return objUlzqkzuiru == objGxszxtbevo ? objGxszxtbevo : objUlzqkzuiru;
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                x20.wkgbmnqykc wkgbmnqykcVar = this.f102872nufgyqmvbu;
                x20.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = new x20.wkgbmnqykc.iobyxmoadg(this.f102873ojitshcjhn.getOrderId());
                eablkybsjgVar.f102880jyumaefscl = 1;
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
            return kcexrzcfyt.wkgbmnqykc((c10.wkgbmnqykc) objZoijcleaow);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ulzqkzuiru(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        c10.wkgbmnqykc wkgbmnqykcVar2;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f102892jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f102892jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f102894zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f102892jyumaefscl;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                int i15 = zoijcleaow.f102895iobyxmoadg[this.f102873ojitshcjhn.getRateType().ordinal()];
                if (i15 == 1) {
                    x20.ppxfxbqfkf ppxfxbqfkfVar = this.f102871lqeggnwhkg;
                    x20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new x20.ppxfxbqfkf.iobyxmoadg(jyumaefscl.rgvfuqvkyq(new m10.iobyxmoadg(m10.iobyxmoadg.EnumC1353iobyxmoadg.POSITIVE, this.f102873ojitshcjhn.getDeliveryType()), new m10.iobyxmoadg(m10.iobyxmoadg.EnumC1353iobyxmoadg.NEGATIVE, this.f102873ojitshcjhn.getDeliveryType())));
                    wkgbmnqykcVar.f102892jyumaefscl = 1;
                    objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar2, wkgbmnqykcVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    wkgbmnqykcVar2 = (c10.wkgbmnqykc) objZoijcleaow;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x20.ppxfxbqfkf ppxfxbqfkfVar2 = this.f102871lqeggnwhkg;
                    x20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = new x20.ppxfxbqfkf.iobyxmoadg(jyumaefscl.eablkybsjg(new m10.iobyxmoadg(m10.iobyxmoadg.EnumC1353iobyxmoadg.CANCEL, this.f102873ojitshcjhn.getDeliveryType())));
                    wkgbmnqykcVar.f102892jyumaefscl = 2;
                    objZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar3, wkgbmnqykcVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    wkgbmnqykcVar2 = (c10.wkgbmnqykc) objZoijcleaow;
                }
            } else if (i14 == 1) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                wkgbmnqykcVar2 = (c10.wkgbmnqykc) objZoijcleaow;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                wkgbmnqykcVar2 = (c10.wkgbmnqykc) objZoijcleaow;
            }
            return kcexrzcfyt.wkgbmnqykc(wkgbmnqykcVar2);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vipkmwdibw() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().btonecajqb(this.f102875rgvfuqvkyq.zoijcleaow(this.f102873ojitshcjhn));
    }

    private final void xrmfcynszj(int i13) {
        Object objPrevious;
        Object value;
        Object value2;
        this.f102874oxmwwwfdhm = i13;
        List listPpxfxbqfkf = ((g02.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf();
        ListIterator listIterator = listPpxfxbqfkf.listIterator(listPpxfxbqfkf.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(((j02.ppxfxbqfkf) objPrevious) instanceof j02.eablkybsjg));
        j02.ppxfxbqfkf ppxfxbqfkfVar = (j02.ppxfxbqfkf) objPrevious;
        int iNuxfzjnpeb = jyumaefscl.nuxfzjnpeb(((g02.zoijcleaow) ojitshcjhn().getValue()).ppxfxbqfkf(), ppxfxbqfkfVar);
        if (i13 <= 3) {
            if (iNuxfzjnpeb != -1 && ppxfxbqfkfVar != null) {
                this.f102878yggfygwlhe.set(iNuxfzjnpeb, j02.eablkybsjg.wkgbmnqykc((j02.eablkybsjg) ppxfxbqfkfVar, null, i13, null, false, 13, null));
            }
            zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value2 = zynmafqrjbVarOjitshcjhn.getValue();
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value2, g02.zoijcleaow.zoijcleaow((g02.zoijcleaow) value2, this.f102878yggfygwlhe, i13 > 0, false, 4, null)));
            return;
        }
        if (iNuxfzjnpeb != -1 && ppxfxbqfkfVar != null) {
            this.f102879zdlpuopuiu.set(iNuxfzjnpeb, j02.eablkybsjg.wkgbmnqykc((j02.eablkybsjg) ppxfxbqfkfVar, null, i13, null, false, 13, null));
        }
        zynmafqrjb zynmafqrjbVarOjitshcjhn2 = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn2.getValue();
        } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, g02.zoijcleaow.zoijcleaow((g02.zoijcleaow) value, this.f102879zdlpuopuiu, true, false, 4, null)));
    }

    public final void okpsazkaxt(g02.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof g02.iobyxmoadg.C0807iobyxmoadg) {
            jhduphickx();
            return;
        }
        if (event instanceof g02.iobyxmoadg.ppxfxbqfkf) {
            jztzpxfvev();
            return;
        }
        if (event instanceof g02.iobyxmoadg.wkgbmnqykc) {
            xrmfcynszj(((g02.iobyxmoadg.wkgbmnqykc) event).iobyxmoadg());
        } else if (event instanceof g02.iobyxmoadg.zoijcleaow) {
            ikoacuggdj(((g02.iobyxmoadg.zoijcleaow) event).iobyxmoadg());
        } else {
            if (!(event instanceof g02.iobyxmoadg.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe(((g02.iobyxmoadg.eablkybsjg) event).iobyxmoadg());
        }
    }
}

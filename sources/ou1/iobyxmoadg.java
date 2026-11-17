package ou1;

import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import j0.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import modern.payments.ecomAndroid.data.common.MockConstants;
import ow1.esjtqupxsv;
import ow1.gtknphoqwx;
import ow1.ylkuphrtab;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pt0.btonecajqb;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.proloyalty.core.models.promocode.Promocode;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailAgreement;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailCustomizableParameter;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailCustomizableParametersBlock;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailInfo;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailPriceInfo;
import ru.myspar.proloyalty.subscription.impl.detail.domain.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f74757eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final esjtqupxsv f74758gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ylkuphrtab f74759lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f74760nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fu1.zoijcleaow f74761ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final fu1.iobyxmoadg f74762wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f74763iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f74765yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74766zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74765yggfygwlhe = obj;
            this.f74763iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.igdgnonuha(this);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ boolean f74767cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f74768iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f74769jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f74770yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74771zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(boolean z13, iobyxmoadg iobyxmoadgVar, String str, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f74770yggfygwlhe = z13;
            this.f74769jyumaefscl = iobyxmoadgVar;
            this.f74768iwizpuwonk = str;
            this.f74767cqumvgiudr = z14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f74770yggfygwlhe, this.f74769jyumaefscl, this.f74768iwizpuwonk, this.f74767cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0089  */
        /* JADX WARN: Code duplicated, block: B:34:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f74771zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SubscriptionDetailInfo) obj);
                    iobyxmoadgVar = this.f74769jyumaefscl;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.ulzqkzuiru(new ou1.gxszxtbevo.wkgbmnqykc((SubscriptionDetailInfo) objWkgbmnqykc));
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.zeieaojujs();
                        iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
                    }
                    this.f74769jyumaefscl.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                if (this.f74770yggfygwlhe) {
                    this.f74771zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(500L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                this.f74769jyumaefscl.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(true));
                iobyxmoadg iobyxmoadgVar2 = this.f74769jyumaefscl;
                fu1.iobyxmoadg.C0781iobyxmoadg c0781iobyxmoadgWeqkydbzbr = iobyxmoadgVar2.weqkydbzbr(iobyxmoadg.iyctptxqzt(iobyxmoadgVar2), this.f74768iwizpuwonk, this.f74767cqumvgiudr);
                if (c0781iobyxmoadgWeqkydbzbr == null) {
                    this.f74769jyumaefscl.zeieaojujs();
                    this.f74769jyumaefscl.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                iobyxmoadg iobyxmoadgVar3 = this.f74769jyumaefscl;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                fu1.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3.f74762wkgbmnqykc;
                this.f74771zdlpuopuiu = 2;
                obj = iobyxmoadgVar5.zoijcleaow(c0781iobyxmoadgWeqkydbzbr, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SubscriptionDetailInfo) obj);
                iobyxmoadgVar = this.f74769jyumaefscl;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    iobyxmoadgVar.ulzqkzuiru(new ou1.gxszxtbevo.wkgbmnqykc((SubscriptionDetailInfo) objWkgbmnqykc));
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    iobyxmoadgVar.zeieaojujs();
                    iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
                }
                this.f74769jyumaefscl.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(false));
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ou1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1626iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f74772jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74774zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1626iobyxmoadg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f74772jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1626iobyxmoadg(this.f74772jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            String strIobyxmoadg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f74774zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ou1.gxszxtbevo.iobyxmoadg(this.f74772jyumaefscl));
                    iobyxmoadg.this.ulzqkzuiru(new ou1.gxszxtbevo.zoijcleaow(true));
                    gtknphoqwx.iobyxmoadg iobyxmoadgVar = new gtknphoqwx.iobyxmoadg(iobyxmoadg.iyctptxqzt(iobyxmoadg.this).getSubscriptionId(), this.f74772jyumaefscl);
                    iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    gtknphoqwx gtknphoqwxVar = iobyxmoadgVar2.f74757eablkybsjg;
                    this.f74774zdlpuopuiu = 1;
                    obj = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((nw1.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            boolean z13 = this.f74772jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc) && (strIobyxmoadg = ((nw1.iobyxmoadg) objWkgbmnqykc).iobyxmoadg()) != null) {
                if (mj.kcexrzcfyt.zfvoamnweg(strIobyxmoadg)) {
                    strIobyxmoadg = null;
                }
                if (strIobyxmoadg != null) {
                    iobyxmoadgVar5.grlcpdaxtj(false);
                    iobyxmoadgVar5.crxdokpmqz(new ou1.eablkybsjg.gxszxtbevo(strIobyxmoadg));
                }
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ulzqkzuiru(new ou1.gxszxtbevo.iobyxmoadg(!z13));
                iobyxmoadgVar5.fiwbwshyhd(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ou1.gxszxtbevo.zoijcleaow(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1626iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f74776yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74777zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v8 */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ?? r13;
            int i13;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f74776yggfygwlhe;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                auzgnhcxok auzgnhcxokVar = iobyxmoadg.this.f74760nufgyqmvbu;
                if (auzgnhcxokVar != null) {
                    cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
                }
                ?? r14 = iobyxmoadg.iyctptxqzt(iobyxmoadg.this).getDetailInfo() == null ? 1 : 0;
                if (r14 == 0) {
                    iobyxmoadg.this.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(true));
                }
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String subscriptionId = iobyxmoadg.iyctptxqzt(iobyxmoadgVar).getSubscriptionId();
                this.f74777zdlpuopuiu = r14;
                this.f74776yggfygwlhe = 1;
                if (iobyxmoadgVar.auzgnhcxok(subscriptionId, r14, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                r13 = r14;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f74777zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            if (r13 == 0) {
                r13 = i13;
                iobyxmoadg.this.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(false));
            }
            r13 = i13;
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f74778jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ou1.wkgbmnqykc f74779yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74780zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ou1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f74779yggfygwlhe = wkgbmnqykcVar;
            this.f74778jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f74779yggfygwlhe, this.f74778jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f74780zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ou1.wkgbmnqykc wkgbmnqykcVar = this.f74779yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ou1.wkgbmnqykc.iobyxmoadg.f74797iobyxmoadg)) {
                    this.f74778jyumaefscl.crxdokpmqz(ou1.eablkybsjg.iobyxmoadg.f74742iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ou1.wkgbmnqykc.zoijcleaow.f74803iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f74778jyumaefscl;
                    this.f74780zdlpuopuiu = 1;
                    if (iobyxmoadgVar.igdgnonuha(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.C1627wkgbmnqykc) {
                    this.f74778jyumaefscl.lxfrhoxuzk(((ou1.wkgbmnqykc.C1627wkgbmnqykc) this.f74779yggfygwlhe).iobyxmoadg(), ((ou1.wkgbmnqykc.C1627wkgbmnqykc) this.f74779yggfygwlhe).zoijcleaow());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ou1.wkgbmnqykc.btonecajqb.f74791iobyxmoadg)) {
                    this.f74778jyumaefscl.fyldjkxazc();
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.gtknphoqwx) {
                    this.f74778jyumaefscl.ipoelvxyzq(((ou1.wkgbmnqykc.gtknphoqwx) this.f74779yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.gxszxtbevo) {
                    this.f74778jyumaefscl.ipoelvxyzq(dxjokdxxww.ppxfxbqfkf());
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.lqeggnwhkg) {
                    this.f74778jyumaefscl.grlcpdaxtj(false);
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.draadjrbmk) {
                    this.f74778jyumaefscl.grlcpdaxtj(true);
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.ppxfxbqfkf) {
                    this.f74778jyumaefscl.lrnfpwlwnk(((ou1.wkgbmnqykc.ppxfxbqfkf) this.f74779yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof ou1.wkgbmnqykc.dxjokdxxww) {
                    iobyxmoadg iobyxmoadgVar2 = this.f74778jyumaefscl;
                    iobyxmoadgVar2.hszhottldk(iobyxmoadg.iyctptxqzt(iobyxmoadgVar2), ((ou1.wkgbmnqykc.dxjokdxxww) this.f74779yggfygwlhe).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ou1.wkgbmnqykc.nufgyqmvbu.f74799iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar3 = this.f74778jyumaefscl;
                    iobyxmoadgVar3.skhdrjzrfn(iobyxmoadg.iyctptxqzt(iobyxmoadgVar3));
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ou1.wkgbmnqykc.eablkybsjg.f74794iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f74778jyumaefscl.wizcaqwiak();
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f74781cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f74783jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f74784yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74785zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74783jyumaefscl = obj;
            this.f74781cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.auzgnhcxok(null, false, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f74787zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f74787zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f74787zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(ou1.eablkybsjg.iobyxmoadg.f74742iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(fu1.zoijcleaow getDetailInfoUseCase, fu1.iobyxmoadg changeParametersUseCase, gtknphoqwx editUserSettingsSubscriptionUseCase, esjtqupxsv isAuthUseCase, ylkuphrtab subscribeUserIsAuthUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDetailInfoUseCase, "getDetailInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeParametersUseCase, "changeParametersUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editUserSettingsSubscriptionUseCase, "editUserSettingsSubscriptionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserIsAuthUseCase, "subscribeUserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f74761ppxfxbqfkf = getDetailInfoUseCase;
        this.f74762wkgbmnqykc = changeParametersUseCase;
        this.f74757eablkybsjg = editUserSettingsSubscriptionUseCase;
        this.f74758gxszxtbevo = isAuthUseCase;
        this.f74759lqeggnwhkg = subscribeUserIsAuthUseCase;
    }

    private final void ageimvtcrz(boolean z13, String str, boolean z14) {
        auzgnhcxok auzgnhcxokVar = this.f74760nufgyqmvbu;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f74760nufgyqmvbu = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(z14, this, str, z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object auzgnhcxok(String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f74781cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f74781cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f74783jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f74781cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            fu1.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new fu1.zoijcleaow.iobyxmoadg(str);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                fu1.zoijcleaow zoijcleaowVar = this.f74761ppxfxbqfkf;
                wkgbmnqykcVar.f74785zdlpuopuiu = this;
                wkgbmnqykcVar.f74784yggfygwlhe = z13;
                wkgbmnqykcVar.f74781cqumvgiudr = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = wkgbmnqykcVar.f74784yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f74785zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SubscriptionDetailInfo) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new ou1.gxszxtbevo.wkgbmnqykc((SubscriptionDetailInfo) objWkgbmnqykc));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
            if (z13) {
                iobyxmoadgVar.nuxfzjnpeb();
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    private final void dvvnrvtcbc(String str, SubscriptionDetailInfo subscriptionDetailInfo) {
        String value;
        Promocode promoCode = subscriptionDetailInfo.getPromoCode();
        if (promoCode != null) {
            value = promoCode.getValue();
            if (mj.kcexrzcfyt.zfvoamnweg(value) || !promoCode.getStatus()) {
                value = null;
            }
        } else {
            value = null;
        }
        PaymentType.Subscription subscription = new PaymentType.Subscription(str, value);
        List payments = subscriptionDetailInfo.getPayments();
        SubscriptionDetailPriceInfo priceInfo = subscriptionDetailInfo.getPriceInfo();
        crxdokpmqz(new ou1.eablkybsjg.wkgbmnqykc(new PaymentMethodsArgs(subscription, priceInfo != null ? Double.valueOf(priceInfo.getSum()) : null, payments, false, null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(Throwable th2) {
        crxdokpmqz(new ou1.eablkybsjg.C1624eablkybsjg(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc() {
        SubscriptionDetailAgreement agreement;
        String documentUrl;
        SubscriptionDetailInfo detailInfo = ((State) jlmebxxoox()).getDetailInfo();
        if (detailInfo == null || (agreement = detailInfo.getAgreement()) == null || (documentUrl = agreement.getDocumentUrl()) == null) {
            return;
        }
        crxdokpmqz(new ou1.eablkybsjg.ppxfxbqfkf(documentUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void grlcpdaxtj(boolean z13) {
        ulzqkzuiru(new ou1.gxszxtbevo.C1625gxszxtbevo(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hszhottldk(State state, tzroggbefp tzroggbefpVar) {
        if (tzroggbefpVar.draadjrbmk().length() == 0) {
            wizcaqwiak();
            return;
        }
        PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
        btonecajqb stateFromServer = (!mj.kcexrzcfyt.zfvoamnweg(tzroggbefpVar.draadjrbmk()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromServer(), tzroggbefpVar.draadjrbmk())) ? promoCodeEditorState.getStateFromServer() : btonecajqb.NOT_ENTERED;
        ulzqkzuiru(new ou1.gxszxtbevo.lqeggnwhkg(tzroggbefpVar, stateFromServer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object igdgnonuha(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f74763iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f74763iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f74765yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f74763iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            esjtqupxsv esjtqupxsvVar = this.f74758gxszxtbevo;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) esjtqupxsvVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(ou1.eablkybsjg.zoijcleaow.f74745iobyxmoadg);
                return wwaezpbzknVar;
            }
            auzgnhcxok auzgnhcxokVar = this.f74760nufgyqmvbu;
            if (auzgnhcxokVar != null) {
                cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
            }
            ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(true));
            fu1.iobyxmoadg.C0781iobyxmoadg c0781iobyxmoadgWeqkydbzbr = weqkydbzbr((State) jlmebxxoox(), uawqvzlxes(), false);
            if (c0781iobyxmoadgWeqkydbzbr == null) {
                zeieaojujs();
                ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(false));
                return wwaezpbzknVar;
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                fu1.iobyxmoadg iobyxmoadgVar3 = this.f74762wkgbmnqykc;
                eablkybsjgVar.f74766zdlpuopuiu = this;
                eablkybsjgVar.f74763iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(c0781iobyxmoadgWeqkydbzbr, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f74766zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SubscriptionDetailInfo) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            SubscriptionDetailInfo subscriptionDetailInfo = (SubscriptionDetailInfo) objWkgbmnqykc;
            iobyxmoadgVar.ulzqkzuiru(new ou1.gxszxtbevo.wkgbmnqykc(subscriptionDetailInfo));
            if (subscriptionDetailInfo.getAutoRenewal() == null) {
                iobyxmoadgVar.dvvnrvtcbc(subscriptionDetailInfo.getId(), subscriptionDetailInfo);
            }
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zeieaojujs();
            iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ou1.gxszxtbevo.eablkybsjg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq(String str) {
        ulzqkzuiru(new ou1.gxszxtbevo.nufgyqmvbu(str));
    }

    private final Map iwxlajgraz(List list, Map map, boolean z13) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscriptionDetailCustomizableParameter subscriptionDetailCustomizableParameter = (SubscriptionDetailCustomizableParameter) it.next();
            String id2 = subscriptionDetailCustomizableParameter.getId();
            SubscriptionDetailCustomizableParameter.Value valuePpxfxbqfkf = subscriptionDetailCustomizableParameter.ppxfxbqfkf();
            String value = valuePpxfxbqfkf != null ? valuePpxfxbqfkf.getValue() : null;
            if (value == null) {
                value = "";
            }
            linkedHashMap.put(id2, value);
            String str = (String) map.get(id2);
            if (str != null) {
                value = str;
            }
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(id2, value);
            linkedHashMap2.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return (z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(linkedHashMap, linkedHashMap2)) ? hg.tzroggbefp.dxjokdxxww() : linkedHashMap2;
    }

    public static final /* synthetic */ State iyctptxqzt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1626iobyxmoadg(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(String str, String str2) {
        ulzqkzuiru(new ou1.gxszxtbevo.ppxfxbqfkf(str, str2));
        ageimvtcrz(true, uawqvzlxes(), true);
    }

    private final void mhtqkkgtqm() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb((sj.lqeggnwhkg) this.f74759lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new lqeggnwhkg(null)), sopmlzcsov());
    }

    private final void nuxfzjnpeb() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn(State state) {
        if (!((Boolean) this.f74758gxszxtbevo.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            crxdokpmqz(ou1.eablkybsjg.zoijcleaow.f74745iobyxmoadg);
            return;
        }
        PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromInput().draadjrbmk(), promoCodeEditorState.getPromoCodeFromServer())) {
            return;
        }
        ageimvtcrz(false, state.getPromoCodeEditorState().getPromoCodeFromInput().draadjrbmk(), false);
    }

    private final String uawqvzlxes() {
        Promocode promoCode;
        String value;
        SubscriptionDetailInfo detailInfo = ((State) jlmebxxoox()).getDetailInfo();
        if (detailInfo == null || (promoCode = detailInfo.getPromoCode()) == null || (value = promoCode.getValue()) == null) {
            return null;
        }
        return dxjokdxxww.wkgbmnqykc(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fu1.iobyxmoadg.C0781iobyxmoadg weqkydbzbr(State state, String str, boolean z13) {
        SubscriptionDetailInfo detailInfo = state.getDetailInfo();
        if (detailInfo == null) {
            return null;
        }
        SubscriptionDetailCustomizableParametersBlock customizableParameters = detailInfo.getCustomizableParameters();
        List items = customizableParameters != null ? customizableParameters.getItems() : null;
        if (items == null) {
            items = jyumaefscl.wflxmlrfwp();
        }
        Map mapIwxlajgraz = iwxlajgraz(items, state.getChangedParamsBuffer(), z13);
        if (mapIwxlajgraz.isEmpty()) {
            return null;
        }
        return new fu1.iobyxmoadg.C0781iobyxmoadg(mapIwxlajgraz, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak() {
        tzroggbefp tzroggbefpVar = new tzroggbefp((String) null, 0L, (l) null, 7, (kotlin.jvm.internal.gtknphoqwx) null);
        ulzqkzuiru(new ou1.gxszxtbevo.lqeggnwhkg(tzroggbefpVar, btonecajqb.NOT_ENTERED));
        ageimvtcrz(false, tzroggbefpVar.draadjrbmk(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zeieaojujs() {
        ulzqkzuiru(ou1.gxszxtbevo.dxjokdxxww.f74746iobyxmoadg);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ou1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ou1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ou1.ppxfxbqfkf.iobyxmoadg.f74790iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        mhtqkkgtqm();
    }
}

package v82;

import c20.dxjokdxxww;
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
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.core.models.promocode.Promocode;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentType;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailAgreement;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailCustomizableParameter;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailCustomizableParametersBlock;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailInfo;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailPriceInfo;
import ru.myspar.subscription.impl.detail.domain.State;
import tg.rgvfuqvkyq;
import vu.btonecajqb;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final m82.iobyxmoadg f116356eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c20.eablkybsjg f116357gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dxjokdxxww f116358lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f116359nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final m82.ppxfxbqfkf f116360ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m82.zoijcleaow f116361wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f116362iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f116364yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116365zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116364yggfygwlhe = obj;
            this.f116362iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.igdgnonuha(this);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ boolean f116366cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f116367iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f116368jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f116369yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116370zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(boolean z13, iobyxmoadg iobyxmoadgVar, String str, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116369yggfygwlhe = z13;
            this.f116368jyumaefscl = iobyxmoadgVar;
            this.f116367iwizpuwonk = str;
            this.f116366cqumvgiudr = z14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f116369yggfygwlhe, this.f116368jyumaefscl, this.f116367iwizpuwonk, this.f116366cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0089  */
        /* JADX WARN: Code duplicated, block: B:34:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116370zdlpuopuiu;
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
                    iobyxmoadgVar = this.f116368jyumaefscl;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.ulzqkzuiru(new v82.gxszxtbevo.wkgbmnqykc((SubscriptionDetailInfo) objWkgbmnqykc));
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.zeieaojujs();
                        iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
                    }
                    this.f116368jyumaefscl.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                if (this.f116369yggfygwlhe) {
                    this.f116370zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(500L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                this.f116368jyumaefscl.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(true));
                iobyxmoadg iobyxmoadgVar2 = this.f116368jyumaefscl;
                m82.zoijcleaow.iobyxmoadg iobyxmoadgVarWeqkydbzbr = iobyxmoadgVar2.weqkydbzbr(iobyxmoadg.iyctptxqzt(iobyxmoadgVar2), this.f116367iwizpuwonk, this.f116366cqumvgiudr);
                if (iobyxmoadgVarWeqkydbzbr == null) {
                    this.f116368jyumaefscl.zeieaojujs();
                    this.f116368jyumaefscl.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                iobyxmoadg iobyxmoadgVar3 = this.f116368jyumaefscl;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                m82.zoijcleaow zoijcleaowVar = iobyxmoadgVar3.f116361wkgbmnqykc;
                this.f116370zdlpuopuiu = 2;
                obj = zoijcleaowVar.zoijcleaow(iobyxmoadgVarWeqkydbzbr, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SubscriptionDetailInfo) obj);
                iobyxmoadgVar = this.f116368jyumaefscl;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    iobyxmoadgVar.ulzqkzuiru(new v82.gxszxtbevo.wkgbmnqykc((SubscriptionDetailInfo) objWkgbmnqykc));
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    iobyxmoadgVar.zeieaojujs();
                    iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
                }
                this.f116368jyumaefscl.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(false));
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: v82.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2898iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f116371jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116373zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2898iobyxmoadg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116371jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2898iobyxmoadg(this.f116371jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116373zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new v82.gxszxtbevo.iobyxmoadg(this.f116371jyumaefscl));
                    iobyxmoadg.this.ulzqkzuiru(new v82.gxszxtbevo.zoijcleaow(true));
                    m82.iobyxmoadg.C1373iobyxmoadg c1373iobyxmoadg = new m82.iobyxmoadg.C1373iobyxmoadg(iobyxmoadg.iyctptxqzt(iobyxmoadg.this).getSubscriptionId(), this.f116371jyumaefscl);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    m82.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f116356eablkybsjg;
                    this.f116373zdlpuopuiu = 1;
                    if (iobyxmoadgVar3.zoijcleaow(c1373iobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            boolean z13 = this.f116371jyumaefscl;
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ulzqkzuiru(new v82.gxszxtbevo.iobyxmoadg(!z13));
                iobyxmoadgVar5.fiwbwshyhd(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new v82.gxszxtbevo.zoijcleaow(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2898iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f116375yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116376zdlpuopuiu;

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
            int i14 = this.f116375yggfygwlhe;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                auzgnhcxok auzgnhcxokVar = iobyxmoadg.this.f116359nufgyqmvbu;
                if (auzgnhcxokVar != null) {
                    ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
                }
                ?? r14 = iobyxmoadg.iyctptxqzt(iobyxmoadg.this).getDetailInfo() == null ? 1 : 0;
                if (r14 == 0) {
                    iobyxmoadg.this.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(true));
                }
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String subscriptionId = iobyxmoadg.iyctptxqzt(iobyxmoadgVar).getSubscriptionId();
                this.f116376zdlpuopuiu = r14;
                this.f116375yggfygwlhe = 1;
                if (iobyxmoadgVar.auzgnhcxok(subscriptionId, r14, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                r13 = r14;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f116376zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            if (r13 == 0) {
                r13 = i13;
                iobyxmoadg.this.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(false));
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
        final /* synthetic */ iobyxmoadg f116377jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ v82.wkgbmnqykc f116378yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116379zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(v82.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116378yggfygwlhe = wkgbmnqykcVar;
            this.f116377jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f116378yggfygwlhe, this.f116377jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116379zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                v82.wkgbmnqykc wkgbmnqykcVar = this.f116378yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v82.wkgbmnqykc.iobyxmoadg.f116396iobyxmoadg)) {
                    this.f116377jyumaefscl.crxdokpmqz(v82.eablkybsjg.iobyxmoadg.f116341iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v82.wkgbmnqykc.zoijcleaow.f116402iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f116377jyumaefscl;
                    this.f116379zdlpuopuiu = 1;
                    if (iobyxmoadgVar.igdgnonuha(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.C2899wkgbmnqykc) {
                    this.f116377jyumaefscl.lxfrhoxuzk(((v82.wkgbmnqykc.C2899wkgbmnqykc) this.f116378yggfygwlhe).iobyxmoadg(), ((v82.wkgbmnqykc.C2899wkgbmnqykc) this.f116378yggfygwlhe).zoijcleaow());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v82.wkgbmnqykc.btonecajqb.f116390iobyxmoadg)) {
                    this.f116377jyumaefscl.fyldjkxazc();
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.gtknphoqwx) {
                    this.f116377jyumaefscl.ipoelvxyzq(((v82.wkgbmnqykc.gtknphoqwx) this.f116378yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.gxszxtbevo) {
                    this.f116377jyumaefscl.ipoelvxyzq(k30.draadjrbmk.ppxfxbqfkf());
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.lqeggnwhkg) {
                    this.f116377jyumaefscl.grlcpdaxtj(false);
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.draadjrbmk) {
                    this.f116377jyumaefscl.grlcpdaxtj(true);
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.ppxfxbqfkf) {
                    this.f116377jyumaefscl.lrnfpwlwnk(((v82.wkgbmnqykc.ppxfxbqfkf) this.f116378yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof v82.wkgbmnqykc.dxjokdxxww) {
                    iobyxmoadg iobyxmoadgVar2 = this.f116377jyumaefscl;
                    iobyxmoadgVar2.hszhottldk(iobyxmoadg.iyctptxqzt(iobyxmoadgVar2), ((v82.wkgbmnqykc.dxjokdxxww) this.f116378yggfygwlhe).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v82.wkgbmnqykc.nufgyqmvbu.f116398iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar3 = this.f116377jyumaefscl;
                    iobyxmoadgVar3.skhdrjzrfn(iobyxmoadg.iyctptxqzt(iobyxmoadgVar3));
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, v82.wkgbmnqykc.eablkybsjg.f116393iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f116377jyumaefscl.wizcaqwiak();
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
        int f116380cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f116382jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f116383yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116384zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116382jyumaefscl = obj;
            this.f116380cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.auzgnhcxok(null, false, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116386zdlpuopuiu;

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
            int i13 = this.f116386zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f116386zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(v82.eablkybsjg.iobyxmoadg.f116341iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(m82.ppxfxbqfkf getDetailInfoUseCase, m82.zoijcleaow changeParametersUseCase, m82.iobyxmoadg changeAutoRenewalUseCase, c20.eablkybsjg isLoggedInUseCase, dxjokdxxww subscribeToLoggedInUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDetailInfoUseCase, "getDetailInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeParametersUseCase, "changeParametersUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAutoRenewalUseCase, "changeAutoRenewalUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f116360ppxfxbqfkf = getDetailInfoUseCase;
        this.f116361wkgbmnqykc = changeParametersUseCase;
        this.f116356eablkybsjg = changeAutoRenewalUseCase;
        this.f116357gxszxtbevo = isLoggedInUseCase;
        this.f116358lqeggnwhkg = subscribeToLoggedInUseCase;
    }

    private final void ageimvtcrz(boolean z13, String str, boolean z14) {
        auzgnhcxok auzgnhcxokVar = this.f116359nufgyqmvbu;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f116359nufgyqmvbu = gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(z14, this, str, z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object auzgnhcxok(String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f116380cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f116380cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f116382jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f116380cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            m82.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new m82.ppxfxbqfkf.iobyxmoadg(str);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                m82.ppxfxbqfkf ppxfxbqfkfVar = this.f116360ppxfxbqfkf;
                wkgbmnqykcVar.f116384zdlpuopuiu = this;
                wkgbmnqykcVar.f116383yggfygwlhe = z13;
                wkgbmnqykcVar.f116380cqumvgiudr = 1;
                objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar2, wkgbmnqykcVar);
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
            z13 = wkgbmnqykcVar.f116383yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f116384zdlpuopuiu;
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
            iobyxmoadgVar.ulzqkzuiru(new v82.gxszxtbevo.wkgbmnqykc((SubscriptionDetailInfo) objWkgbmnqykc));
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
        crxdokpmqz(new v82.eablkybsjg.wkgbmnqykc(new PaymentMethodsArgs(subscription, priceInfo != null ? Double.valueOf(priceInfo.getSum()) : null, payments, false, null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(Throwable th2) {
        crxdokpmqz(new v82.eablkybsjg.C2896eablkybsjg(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc() {
        SubscriptionDetailAgreement agreement;
        String documentUrl;
        SubscriptionDetailInfo detailInfo = ((State) jlmebxxoox()).getDetailInfo();
        if (detailInfo == null || (agreement = detailInfo.getAgreement()) == null || (documentUrl = agreement.getDocumentUrl()) == null) {
            return;
        }
        crxdokpmqz(new v82.eablkybsjg.ppxfxbqfkf(documentUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void grlcpdaxtj(boolean z13) {
        ulzqkzuiru(new v82.gxszxtbevo.C2897gxszxtbevo(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hszhottldk(State state, tzroggbefp tzroggbefpVar) {
        if (tzroggbefpVar.draadjrbmk().length() == 0) {
            wizcaqwiak();
            return;
        }
        PromoCodeEditorState promoCodeEditorState = state.getPromoCodeEditorState();
        btonecajqb stateFromServer = (!mj.kcexrzcfyt.zfvoamnweg(tzroggbefpVar.draadjrbmk()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(promoCodeEditorState.getPromoCodeFromServer(), tzroggbefpVar.draadjrbmk())) ? promoCodeEditorState.getStateFromServer() : btonecajqb.NOT_ENTERED;
        ulzqkzuiru(new v82.gxszxtbevo.lqeggnwhkg(tzroggbefpVar, stateFromServer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object igdgnonuha(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f116362iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f116362iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f116364yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f116362iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            c20.eablkybsjg eablkybsjgVar2 = this.f116357gxszxtbevo;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) eablkybsjgVar2.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(v82.eablkybsjg.zoijcleaow.f116344iobyxmoadg);
                return wwaezpbzknVar;
            }
            auzgnhcxok auzgnhcxokVar = this.f116359nufgyqmvbu;
            if (auzgnhcxokVar != null) {
                ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
            }
            ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(true));
            m82.zoijcleaow.iobyxmoadg iobyxmoadgVarWeqkydbzbr = weqkydbzbr((State) jlmebxxoox(), uawqvzlxes(), false);
            if (iobyxmoadgVarWeqkydbzbr == null) {
                zeieaojujs();
                ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(false));
                return wwaezpbzknVar;
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                m82.zoijcleaow zoijcleaowVar = this.f116361wkgbmnqykc;
                eablkybsjgVar.f116365zdlpuopuiu = this;
                eablkybsjgVar.f116362iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVarWeqkydbzbr, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f116365zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SubscriptionDetailInfo) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            SubscriptionDetailInfo subscriptionDetailInfo = (SubscriptionDetailInfo) objWkgbmnqykc;
            iobyxmoadgVar.ulzqkzuiru(new v82.gxszxtbevo.wkgbmnqykc(subscriptionDetailInfo));
            if (subscriptionDetailInfo.getAutoRenewal() == null) {
                iobyxmoadgVar.dvvnrvtcbc(subscriptionDetailInfo.getId(), subscriptionDetailInfo);
            }
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zeieaojujs();
            iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new v82.gxszxtbevo.eablkybsjg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq(String str) {
        ulzqkzuiru(new v82.gxszxtbevo.nufgyqmvbu(str));
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
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2898iobyxmoadg(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(String str, String str2) {
        ulzqkzuiru(new v82.gxszxtbevo.ppxfxbqfkf(str, str2));
        ageimvtcrz(true, uawqvzlxes(), true);
    }

    private final void mhtqkkgtqm() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f116358lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new lqeggnwhkg(null)), sopmlzcsov());
    }

    private final void nuxfzjnpeb() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn(State state) {
        if (!((Boolean) this.f116357gxszxtbevo.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            crxdokpmqz(v82.eablkybsjg.zoijcleaow.f116344iobyxmoadg);
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
        return k30.draadjrbmk.wkgbmnqykc(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m82.zoijcleaow.iobyxmoadg weqkydbzbr(State state, String str, boolean z13) {
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
        return new m82.zoijcleaow.iobyxmoadg(mapIwxlajgraz, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak() {
        tzroggbefp tzroggbefpVar = new tzroggbefp((String) null, 0L, (l) null, 7, (kotlin.jvm.internal.gtknphoqwx) null);
        ulzqkzuiru(new v82.gxszxtbevo.lqeggnwhkg(tzroggbefpVar, btonecajqb.NOT_ENTERED));
        ageimvtcrz(false, tzroggbefpVar.draadjrbmk(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zeieaojujs() {
        ulzqkzuiru(v82.gxszxtbevo.dxjokdxxww.f116345iobyxmoadg);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(v82.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(v82.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, v82.ppxfxbqfkf.iobyxmoadg.f116389iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        mhtqkkgtqm();
    }
}

package nc1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.components.loyalty_program.api.models.LoyaltyCategory;
import ru.myspar.proloyalty.loyalty_program.impl.domain.categories_detail.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private auzgnhcxok f69670eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ku0.iobyxmoadg f69671ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final kc1.iobyxmoadg f69672wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f69673jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69675zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69673jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f69673jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69675zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                List categories = iobyxmoadg.rlfsiqarku(iobyxmoadg.this).getCategories();
                String str = this.f69673jyumaefscl;
                Iterator it = categories.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((LoyaltyCategory) next).getId(), str));
                LoyaltyCategory loyaltyCategory = (LoyaltyCategory) next;
                if (loyaltyCategory != null) {
                    iobyxmoadg.this.crxdokpmqz(new nc1.eablkybsjg.ppxfxbqfkf(loyaltyCategory));
                }
                this.f69675zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(500L, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: nc1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1498iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ List f69676cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f69678jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f69679yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f69680zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1498iobyxmoadg(List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69676cqumvgiudr = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1498iobyxmoadg(this.f69676cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0079  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            iobyxmoadg iobyxmoadgVar;
            iobyxmoadg iobyxmoadgVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69678jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (iobyxmoadg) this.f69679yggfygwlhe;
                        obj2 = this.f69680zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadgVar = iobyxmoadgVar2;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
                        iobyxmoadgVar.crxdokpmqz(new nc1.eablkybsjg.zoijcleaow(thDxjokdxxww));
                    }
                    iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                List list = this.f69676cqumvgiudr;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                ku0.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3.f69671ppxfxbqfkf;
                this.f69678jyumaefscl = 1;
                if (iobyxmoadgVar5.ppxfxbqfkf(list, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            iobyxmoadgVar = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(obj2)) {
                iobyxmoadgVar.ulzqkzuiru(gxszxtbevo.eablkybsjg.f69665iobyxmoadg);
                kc1.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar.f69672wkgbmnqykc;
                this.f69680zdlpuopuiu = obj2;
                this.f69679yggfygwlhe = iobyxmoadgVar;
                this.f69678jyumaefscl = 2;
                if (iobyxmoadgVar7.btonecajqb(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
                iobyxmoadgVar.crxdokpmqz(new nc1.eablkybsjg.zoijcleaow(thDxjokdxxww));
            }
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1498iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f69681jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nc1.wkgbmnqykc f69682yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69683zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(nc1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69682yggfygwlhe = wkgbmnqykcVar;
            this.f69681jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f69682yggfygwlhe, this.f69681jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f69683zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            nc1.wkgbmnqykc wkgbmnqykcVar = this.f69682yggfygwlhe;
            if (wkgbmnqykcVar instanceof nc1.wkgbmnqykc.iobyxmoadg) {
                this.f69681jyumaefscl.czzsidtyhn(((nc1.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg());
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, nc1.wkgbmnqykc.zoijcleaow.f69695iobyxmoadg)) {
                this.f69681jyumaefscl.uwvvkdfqfp();
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, nc1.wkgbmnqykc.C1499wkgbmnqykc.f69694iobyxmoadg)) {
                this.f69681jyumaefscl.crxdokpmqz(new nc1.eablkybsjg.iobyxmoadg(iobyxmoadg.rlfsiqarku(this.f69681jyumaefscl).getIsUserConfirmCategories()));
            } else {
                if (!(wkgbmnqykcVar instanceof nc1.wkgbmnqykc.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f69681jyumaefscl.zfvoamnweg(((nc1.wkgbmnqykc.ppxfxbqfkf) this.f69682yggfygwlhe).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69685zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69685zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    ku0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f69671ppxfxbqfkf;
                    this.f69685zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((lu0.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new gxszxtbevo.iobyxmoadg((lu0.iobyxmoadg) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.crxdokpmqz(new nc1.eablkybsjg.zoijcleaow(thDxjokdxxww));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f69686jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nc1.ppxfxbqfkf f69687yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69688zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(nc1.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69687yggfygwlhe = ppxfxbqfkfVar;
            this.f69686jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f69687yggfygwlhe, this.f69686jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f69688zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69687yggfygwlhe, nc1.ppxfxbqfkf.iobyxmoadg.f69691iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f69686jyumaefscl.sflfametgt();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, ku0.iobyxmoadg loyaltyProgramComponentApi, kc1.iobyxmoadg loyaltyCategoriesSelectedObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loyaltyProgramComponentApi, "loyaltyProgramComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loyaltyCategoriesSelectedObserver, "loyaltyCategoriesSelectedObserver");
        this.f69671ppxfxbqfkf = loyaltyProgramComponentApi;
        this.f69672wkgbmnqykc = loyaltyCategoriesSelectedObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(String str) {
        if (((State) jlmebxxoox()).getIsSelectedAvailable()) {
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(str));
        }
    }

    public static final /* synthetic */ State rlfsiqarku(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok sflfametgt() {
        return gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp() {
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
        List selectedCategoriesIds = ((State) jlmebxxoox()).getSelectedCategoriesIds();
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1498iobyxmoadg(selectedCategoriesIds, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(String str) {
        auzgnhcxok auzgnhcxokVar = this.f69670eablkybsjg;
        if (auzgnhcxokVar == null || !auzgnhcxokVar.isActive()) {
            this.f69670eablkybsjg = gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(str, null), 3, null);
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(nc1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(nc1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }
}

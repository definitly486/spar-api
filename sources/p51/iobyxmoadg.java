package p51;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.models.cart.CommentReferences;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;
import ru.myspar.proloyalty.delivery.api.model.DeliveryOptionsScreenMode;
import ru.myspar.proloyalty.delivery.impl.options.domain.store.State;
import tg.rgvfuqvkyq;
import w01.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final q01.zoijcleaow f75646eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final q01.ppxfxbqfkf f75647gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final q01.iobyxmoadg f75648lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a11.iobyxmoadg f75649ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f75650wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75651iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75653yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75654zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75653yggfygwlhe = obj;
            this.f75651iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.bfopjjpdmp(null, null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75655iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75657yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75658zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75657yggfygwlhe = obj;
            this.f75655iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.opjhrmiecq(null, this);
        }
    }

    /* JADX INFO: renamed from: p51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1668iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f75659jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ p51.ppxfxbqfkf f75660yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75661zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1668iobyxmoadg(p51.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75660yggfygwlhe = ppxfxbqfkfVar;
            this.f75659jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1668iobyxmoadg(this.f75660yggfygwlhe, this.f75659jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75661zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75660yggfygwlhe, p51.ppxfxbqfkf.iobyxmoadg.f75676iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f75659jyumaefscl;
                this.f75661zdlpuopuiu = 1;
                if (iobyxmoadgVar.sflfametgt(this) == objGxszxtbevo) {
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
            return ((C1668iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75662iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75664yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75665zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75664yggfygwlhe = obj;
            this.f75662iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.sflfametgt(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f75666cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75668jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f75669yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75670zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75668jyumaefscl = obj;
            this.f75666cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zfvoamnweg(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f75671jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ p51.wkgbmnqykc f75672yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75673zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(p51.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75672yggfygwlhe = wkgbmnqykcVar;
            this.f75671jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f75672yggfygwlhe, this.f75671jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75673zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                p51.wkgbmnqykc wkgbmnqykcVar = this.f75672yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, p51.wkgbmnqykc.zoijcleaow.f75684iobyxmoadg)) {
                    this.f75671jyumaefscl.crxdokpmqz(p51.eablkybsjg.iobyxmoadg.f75640iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof p51.wkgbmnqykc.C1669wkgbmnqykc) {
                    iobyxmoadg iobyxmoadgVar = this.f75671jyumaefscl;
                    this.f75673zdlpuopuiu = 1;
                    if (iobyxmoadgVar.zfvoamnweg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof p51.wkgbmnqykc.ppxfxbqfkf) {
                    this.f75671jyumaefscl.ulzqkzuiru(new p51.gxszxtbevo.zoijcleaow(this.f75671jyumaefscl.uwvvkdfqfp(((p51.wkgbmnqykc.ppxfxbqfkf) this.f75672yggfygwlhe).ppxfxbqfkf(), ((p51.wkgbmnqykc.ppxfxbqfkf) this.f75672yggfygwlhe).iobyxmoadg(), ((p51.wkgbmnqykc.ppxfxbqfkf) this.f75672yggfygwlhe).zoijcleaow())));
                } else {
                    if (!(wkgbmnqykcVar instanceof p51.wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f75671jyumaefscl.ulzqkzuiru(new p51.gxszxtbevo.zoijcleaow(this.f75671jyumaefscl.rlfsiqarku(((p51.wkgbmnqykc.iobyxmoadg) this.f75672yggfygwlhe).zoijcleaow(), ((p51.wkgbmnqykc.iobyxmoadg) this.f75672yggfygwlhe).iobyxmoadg())));
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, a11.iobyxmoadg getNotificationsEnabledUseCase, dxjokdxxww editOrderCommentUseCase, q01.zoijcleaow loadAllCommentsUseCase, q01.ppxfxbqfkf loadEditOrderCommentsUseCase, q01.iobyxmoadg changeCartCommentsUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getNotificationsEnabledUseCase, "getNotificationsEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editOrderCommentUseCase, "editOrderCommentUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadAllCommentsUseCase, "loadAllCommentsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadEditOrderCommentsUseCase, "loadEditOrderCommentsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartCommentsUseCase, "changeCartCommentsUseCase");
        this.f75649ppxfxbqfkf = getNotificationsEnabledUseCase;
        this.f75650wkgbmnqykc = editOrderCommentUseCase;
        this.f75646eablkybsjg = loadAllCommentsUseCase;
        this.f75647gxszxtbevo = loadEditOrderCommentsUseCase;
        this.f75648lqeggnwhkg = changeCartCommentsUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object bfopjjpdmp(String str, List list, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f75651iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f75651iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f75653yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f75651iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            dxjokdxxww.iobyxmoadg iobyxmoadgVar2 = new dxjokdxxww.iobyxmoadg(str, list);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                dxjokdxxww dxjokdxxwwVar = this.f75650wkgbmnqykc;
                eablkybsjgVar.f75654zdlpuopuiu = this;
                eablkybsjgVar.f75651iwizpuwonk = 1;
                if (dxjokdxxwwVar.zoijcleaow(iobyxmoadgVar2, eablkybsjgVar) == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f75654zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new p51.gxszxtbevo.iobyxmoadg(false, false, 2, null));
            iobyxmoadgVar.crxdokpmqz(p51.eablkybsjg.iobyxmoadg.f75640iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.oipsdeybqn(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final List czzsidtyhn(List list, String str) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Reference) next).getCode(), str));
        Reference reference = (Reference) next;
        if (reference == null) {
            return list;
        }
        if (reference.wflxmlrfwp() && reference.getChecked()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Reference referencePpxfxbqfkf = (Reference) it2.next();
            if (referencePpxfxbqfkf.wflxmlrfwp()) {
                if (reference.wflxmlrfwp()) {
                    referencePpxfxbqfkf = Reference.ppxfxbqfkf(referencePpxfxbqfkf, null, null, null, null, kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(referencePpxfxbqfkf.getCode(), str), null, null, 111, null);
                }
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(referencePpxfxbqfkf.getCode(), str)) {
                referencePpxfxbqfkf = Reference.ppxfxbqfkf(referencePpxfxbqfkf, null, null, null, null, !referencePpxfxbqfkf.getChecked(), null, null, 111, null);
            }
            arrayList.add(referencePpxfxbqfkf);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object opjhrmiecq(List list, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f75655iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f75655iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f75657yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f75655iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            q01.iobyxmoadg.C1728iobyxmoadg c1728iobyxmoadg = new q01.iobyxmoadg.C1728iobyxmoadg(list);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                q01.iobyxmoadg iobyxmoadgVar3 = this.f75648lqeggnwhkg;
                gxszxtbevoVar2.f75658zdlpuopuiu = this;
                gxszxtbevoVar2.f75655iwizpuwonk = 1;
                if (iobyxmoadgVar3.zoijcleaow(c1728iobyxmoadg, gxszxtbevoVar2) == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f75658zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new p51.gxszxtbevo.iobyxmoadg(false, false, 2, null));
            iobyxmoadgVar.crxdokpmqz(p51.eablkybsjg.iobyxmoadg.f75640iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.oipsdeybqn(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List rlfsiqarku(String str, String str2) {
        List<CommentReferences> commentsGroupList = ((State) jlmebxxoox()).getCommentsGroupList();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(commentsGroupList, 10));
        for (CommentReferences commentReferencesPpxfxbqfkf : commentsGroupList) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(commentReferencesPpxfxbqfkf.getCode(), str)) {
                commentReferencesPpxfxbqfkf = CommentReferences.ppxfxbqfkf(commentReferencesPpxfxbqfkf, null, null, czzsidtyhn(commentReferencesPpxfxbqfkf.getItems(), str2), 3, null);
            }
            arrayList.add(commentReferencesPpxfxbqfkf);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [lg.gxszxtbevo, p51.iobyxmoadg$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [p51.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v6, types: [q01.ppxfxbqfkf, zr0.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r6v16, types: [q01.zoijcleaow, zr0.ppxfxbqfkf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object sflfametgt(lg.gxszxtbevo gxszxtbevoVar) {
        ?? ppxfxbqfkfVar;
        Object objWkgbmnqykc;
        ?? r13;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        List list;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar2.f75662iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar2.f75662iwizpuwonk = i13 - Integer.MIN_VALUE;
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f75664yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f75662iwizpuwonk;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                ulzqkzuiru(new p51.gxszxtbevo.iobyxmoadg(true, true));
                DeliveryOptionsScreenMode screenMode = ((State) jlmebxxoox()).getScreenMode();
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    if (screenMode instanceof DeliveryOptionsScreenMode.ORDER) {
                        ?? r14 = this.f75647gxszxtbevo;
                        q01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar4 = new q01.ppxfxbqfkf.iobyxmoadg(((DeliveryOptionsScreenMode.ORDER) screenMode).getOrderId());
                        ppxfxbqfkfVar.f75665zdlpuopuiu = this;
                        ppxfxbqfkfVar.f75662iwizpuwonk = 1;
                        objZoijcleaow = r14.zoijcleaow(iobyxmoadgVar4, ppxfxbqfkfVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar2 = this;
                        list = (List) objZoijcleaow;
                        ppxfxbqfkfVar = iobyxmoadgVar2;
                    } else {
                        if (!(screenMode instanceof DeliveryOptionsScreenMode.BASKET)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ?? r15 = this.f75646eablkybsjg;
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        ppxfxbqfkfVar.f75665zdlpuopuiu = this;
                        ppxfxbqfkfVar.f75662iwizpuwonk = 2;
                        objZoijcleaow = r15.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar = this;
                        list = (List) objZoijcleaow;
                        ppxfxbqfkfVar = iobyxmoadgVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ppxfxbqfkfVar = this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    r13 = ppxfxbqfkfVar;
                }
            } else if (i14 == 1) {
                iobyxmoadg iobyxmoadgVar6 = (iobyxmoadg) ppxfxbqfkfVar.f75665zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar2 = iobyxmoadgVar6;
                list = (List) objZoijcleaow;
                ppxfxbqfkfVar = iobyxmoadgVar2;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadg iobyxmoadgVar7 = (iobyxmoadg) ppxfxbqfkfVar.f75665zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar = iobyxmoadgVar7;
                list = (List) objZoijcleaow;
                ppxfxbqfkfVar = iobyxmoadgVar;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(list);
            r13 = ppxfxbqfkfVar;
        } catch (Throwable th3) {
            th = th3;
        }
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            r13.ulzqkzuiru(new p51.gxszxtbevo.zoijcleaow((List) objWkgbmnqykc));
            r13.ulzqkzuiru(new p51.gxszxtbevo.iobyxmoadg(false, false));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            r13.oipsdeybqn(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List uwvvkdfqfp(String str, String str2, String str3) {
        List<CommentReferences> commentsGroupList = ((State) jlmebxxoox()).getCommentsGroupList();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(commentsGroupList, 10));
        for (CommentReferences commentReferencesPpxfxbqfkf : commentsGroupList) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(commentReferencesPpxfxbqfkf.getCode(), str)) {
                List<Reference> items = commentReferencesPpxfxbqfkf.getItems();
                ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
                for (Reference reference : items) {
                    Reference reference2 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(reference.getCode(), str2) ? reference : null;
                    if (reference2 != null) {
                        Reference referencePpxfxbqfkf = Reference.ppxfxbqfkf(reference2, null, null, null, null, str3.length() > 0, str3, null, 79, null);
                        if (referencePpxfxbqfkf != null) {
                            reference = referencePpxfxbqfkf;
                        }
                    }
                    arrayList2.add(reference);
                }
                commentReferencesPpxfxbqfkf = CommentReferences.ppxfxbqfkf(commentReferencesPpxfxbqfkf, null, null, arrayList2, 3, null);
            }
            arrayList.add(commentReferencesPpxfxbqfkf);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zfvoamnweg(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        State state;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        boolean z13;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f75666cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f75666cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f75668jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f75666cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            state = (State) jlmebxxoox();
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                a11.iobyxmoadg iobyxmoadgVar3 = this.f75649ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                wkgbmnqykcVar.f75670zdlpuopuiu = this;
                wkgbmnqykcVar.f75669yggfygwlhe = state;
                wkgbmnqykcVar.f75666cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, wkgbmnqykcVar);
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
                if (i14 == 2) {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            state = (State) wkgbmnqykcVar.f75669yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f75670zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.oipsdeybqn(thDxjokdxxww);
            objWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        }
        boolean zBooleanValue = ((Boolean) objWkgbmnqykc).booleanValue();
        List commentsGroupList = state.getCommentsGroupList();
        if (commentsGroupList != null && commentsGroupList.isEmpty()) {
            z13 = false;
            break;
        }
        Iterator it = commentsGroupList.iterator();
        loop2: while (true) {
            if (!it.hasNext()) {
                z13 = false;
                break;
            }
            CommentReferences commentReferences = (CommentReferences) it.next();
            List items = commentReferences.getItems();
            if (!commentReferences.nufgyqmvbu()) {
                items = null;
            }
            if (items != null && !items.isEmpty()) {
                Iterator it2 = items.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Reference) it2.next()).getCode(), "coord_in_app")) {
                        z13 = true;
                        break loop2;
                    }
                }
            }
        }
        if (!zBooleanValue && z13) {
            iobyxmoadgVar.crxdokpmqz(p51.eablkybsjg.ppxfxbqfkf.f75641iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        iobyxmoadgVar.ulzqkzuiru(new p51.gxszxtbevo.iobyxmoadg(true, false, 2, null));
        List<CommentReferences> commentsGroupList2 = state.getCommentsGroupList();
        ArrayList arrayList = new ArrayList();
        for (CommentReferences commentReferences2 : commentsGroupList2) {
            List items2 = commentReferences2.getItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items2) {
                if (((Reference) obj).getChecked()) {
                    arrayList2.add(obj);
                }
            }
            CommentReferences commentReferencesPpxfxbqfkf = CommentReferences.ppxfxbqfkf(commentReferences2, null, null, arrayList2, 3, null);
            if (commentReferencesPpxfxbqfkf.getItems().isEmpty()) {
                commentReferencesPpxfxbqfkf = null;
            }
            if (commentReferencesPpxfxbqfkf != null) {
                arrayList.add(commentReferencesPpxfxbqfkf);
            }
        }
        DeliveryOptionsScreenMode screenMode = state.getScreenMode();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(screenMode, DeliveryOptionsScreenMode.BASKET.f95402zdlpuopuiu)) {
            wkgbmnqykcVar.f75670zdlpuopuiu = null;
            wkgbmnqykcVar.f75669yggfygwlhe = null;
            wkgbmnqykcVar.f75666cqumvgiudr = 2;
            if (iobyxmoadgVar.opjhrmiecq(arrayList, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(screenMode instanceof DeliveryOptionsScreenMode.ORDER)) {
            throw new NoWhenBranchMatchedException();
        }
        String orderId = ((DeliveryOptionsScreenMode.ORDER) screenMode).getOrderId();
        wkgbmnqykcVar.f75670zdlpuopuiu = null;
        wkgbmnqykcVar.f75669yggfygwlhe = null;
        wkgbmnqykcVar.f75666cqumvgiudr = 3;
        if (iobyxmoadgVar.bfopjjpdmp(orderId, arrayList, wkgbmnqykcVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void oipsdeybqn(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new p51.gxszxtbevo.iobyxmoadg(false, false, 2, null));
        crxdokpmqz(new p51.eablkybsjg.zoijcleaow(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(p51.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(p51.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1668iobyxmoadg(action, this, null), 3, null);
    }
}

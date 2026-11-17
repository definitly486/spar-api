package ru.myspar.support_service.impl.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.support_service.impl.domain.model.SupportAction;
import ru.myspar.support_service.impl.domain.model.SupportInfo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final i92.iobyxmoadg f104469ppxfxbqfkf;

    /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2525iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104471zdlpuopuiu;

        C2525iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2525iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104471zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    i92.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f104469ppxfxbqfkf;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f104471zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SupportInfo) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new eablkybsjg.iobyxmoadg(new State.Content.Success((SupportInfo) objWkgbmnqykc)));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                if (iobyxmoadg.ikoacuggdj(iobyxmoadgVar5).getContent() == null || (iobyxmoadg.ikoacuggdj(iobyxmoadgVar5).getContent() instanceof State.Content.Error)) {
                    iobyxmoadgVar5.ulzqkzuiru(new eablkybsjg.iobyxmoadg(new State.Content.Error(false)));
                }
                iobyxmoadgVar5.crxdokpmqz(new wkgbmnqykc.iobyxmoadg(thDxjokdxxww));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2525iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(i92.iobyxmoadg getSupportServiceInfoUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSupportServiceInfoUseCase, "getSupportServiceInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f104469ppxfxbqfkf = getSupportServiceInfoUseCase;
    }

    public static final /* synthetic */ State ikoacuggdj(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final auzgnhcxok jztzpxfvev() {
        return gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2525iobyxmoadg(null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        SupportInfo info;
        List actions;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        Object obj = null;
        if (!(intent instanceof ppxfxbqfkf.zoijcleaow)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.C2526ppxfxbqfkf.f104473iobyxmoadg)) {
                crxdokpmqz(new wkgbmnqykc.zoijcleaow(new NavigationPayload(f40.zoijcleaow.CALL, null, null, null, false, null, null, false, 254, null)));
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.iobyxmoadg.f104472iobyxmoadg)) {
                jztzpxfvev();
                return;
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.wkgbmnqykc.f104474iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            State.Content content = ((State) jlmebxxoox()).getContent();
            State.Content.Error error = content instanceof State.Content.Error ? (State.Content.Error) content : null;
            if (error == null || error.getIsLoading()) {
                return;
            }
            ulzqkzuiru(new eablkybsjg.iobyxmoadg(new State.Content.Error(true)));
            jztzpxfvev();
            return;
        }
        State.Content content2 = ((State) jlmebxxoox()).getContent();
        State.Content.Success success = content2 instanceof State.Content.Success ? (State.Content.Success) content2 : null;
        if (success == null || (info = success.getInfo()) == null || (actions = info.getActions()) == null) {
            return;
        }
        for (Object obj2 : actions) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((SupportAction) obj2).getName(), ((ppxfxbqfkf.zoijcleaow) intent).iobyxmoadg())) {
                obj = obj2;
                break;
            }
        }
        SupportAction supportAction = (SupportAction) obj;
        if (supportAction != null) {
            crxdokpmqz(new wkgbmnqykc.zoijcleaow(supportAction.getPayload()));
        }
    }
}

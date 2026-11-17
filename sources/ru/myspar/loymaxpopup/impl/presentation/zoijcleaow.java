package ru.myspar.loymaxpopup.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hf0.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.loymaxpopup.impl.domain.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f90149btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f90150gtknphoqwx;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f90151iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f90153yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f90154zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f90153yggfygwlhe = obj;
            this.f90151iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f90149btonecajqb = new draadjrbmk() { // from class: kf0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.loymaxpopup.impl.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f90150gtknphoqwx = new draadjrbmk() { // from class: kf0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.loymaxpopup.impl.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.loymaxpopup.impl.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hf0.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f90144iobyxmoadg)) {
            return hf0.wkgbmnqykc.iobyxmoadg.f40139iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kf0.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        String title = state.getTitle();
        String str = title == null ? "" : title;
        String subtitle = state.getSubtitle();
        String str2 = subtitle == null ? "" : subtitle;
        String imageUrl = state.getImageUrl();
        String str3 = imageUrl == null ? "" : imageUrl;
        String text = state.getText();
        String str4 = text == null ? "" : text;
        String buttonText = state.getButtonText();
        if (buttonText == null) {
            buttonText = "";
        }
        return new kf0.lqeggnwhkg(str, str2, str3, str4, buttonText);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f90149btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f90150gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(hf0.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f90151iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f90151iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f90153yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f90151iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(eablkybsjgVar instanceof hf0.eablkybsjg.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            hf0.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = (hf0.eablkybsjg.iobyxmoadg) eablkybsjgVar;
            Object iobyxmoadgVar3 = new wkgbmnqykc.iobyxmoadg(iobyxmoadgVar2.zoijcleaow(), iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), iobyxmoadgVar2.iobyxmoadg());
            iobyxmoadgVar.f90154zdlpuopuiu = iobyxmoadgVar3;
            iobyxmoadgVar.f90151iwizpuwonk = 1;
            if (cllcsxoeiz(iobyxmoadgVar3, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

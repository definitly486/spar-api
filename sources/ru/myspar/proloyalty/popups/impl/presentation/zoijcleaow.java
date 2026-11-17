package ru.myspar.proloyalty.popups.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mh1.nufgyqmvbu;
import nh1.lqeggnwhkg;
import ru.myspar.proloyalty.popups.impl.domain.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f99278btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f99279gtknphoqwx;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f99280iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f99282yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f99283zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f99282yggfygwlhe = obj;
            this.f99280iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f99278btonecajqb = new draadjrbmk() { // from class: nh1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.popups.impl.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f99279gtknphoqwx = new draadjrbmk() { // from class: nh1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.popups.impl.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.popups.impl.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mh1.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f99273iobyxmoadg)) {
            return mh1.wkgbmnqykc.iobyxmoadg.f67204iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg sopmlzcsov(State state) {
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
        return new lqeggnwhkg(str, str2, str3, str4, buttonText);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99278btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99279gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(mh1.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f99280iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f99280iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f99282yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f99280iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(eablkybsjgVar instanceof mh1.eablkybsjg.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            mh1.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = (mh1.eablkybsjg.iobyxmoadg) eablkybsjgVar;
            Object iobyxmoadgVar3 = new wkgbmnqykc.iobyxmoadg(iobyxmoadgVar2.zoijcleaow(), iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), iobyxmoadgVar2.iobyxmoadg());
            iobyxmoadgVar.f99283zdlpuopuiu = iobyxmoadgVar3;
            iobyxmoadgVar.f99280iwizpuwonk = 1;
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

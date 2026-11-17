package ru.myspar.proloyalty.auth.impl.presentation.authorization;

import androidx.lifecycle.pkzmftpjix;
import en0.eablkybsjg;
import en0.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mn0.nufgyqmvbu;
import ru.myspar.proloyalty.auth.api.model.AuthBySmsArgs;
import ru.myspar.proloyalty.auth.impl.domain.authorization.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final C2154iobyxmoadg f92550draadjrbmk = new C2154iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f92551btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f92552gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.authorization.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2154iobyxmoadg {
        public /* synthetic */ C2154iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2154iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f92551btonecajqb = new draadjrbmk() { // from class: mn0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.auth.impl.presentation.authorization.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f92552gtknphoqwx = new draadjrbmk() { // from class: mn0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.auth.impl.presentation.authorization.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.auth.impl.presentation.authorization.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final en0.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f92553iobyxmoadg)) {
            return en0.wkgbmnqykc.iobyxmoadg.f31620iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            return en0.wkgbmnqykc.zoijcleaow.f31622iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2155ppxfxbqfkf) {
            return new en0.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2155ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getPhoneNumber(), state.getPhoneNumber().draadjrbmk().length() == 11, state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92551btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92552gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.auth.impl.presentation.authbysms.zoijcleaow.zoijcleaow(new AuthBySmsArgs(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf())));
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f31602iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

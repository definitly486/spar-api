package nj0;

import android.net.Uri;
import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.Partner;
import ru.myspar.partners.impl.screen.domain.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f70197btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final tg.draadjrbmk f70198draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f70199gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(mj0.gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f70197btonecajqb = resourcesManager;
        this.f70199gtknphoqwx = new tg.draadjrbmk() { // from class: nj0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.crxdokpmqz(this.f70193zdlpuopuiu, (State) obj);
            }
        };
        this.f70198draadjrbmk = new tg.draadjrbmk() { // from class: nj0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt(this.f70201zdlpuopuiu, (lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu crxdokpmqz(ppxfxbqfkf ppxfxbqfkfVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        List partners = state.getPartners();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(partners, 10));
        Iterator it = partners.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkfVar.sopmlzcsov((Partner) it.next()));
        }
        return new nufgyqmvbu(arrayList);
    }

    private final Partner jlmebxxoox(pj0.iobyxmoadg iobyxmoadgVar) {
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        String string = iobyxmoadgVar.iobyxmoadg().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return new Partner(strZoijcleaow, string, iobyxmoadgVar.ppxfxbqfkf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mj0.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar, lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.iobyxmoadg.f70194iobyxmoadg)) {
            return mj0.wkgbmnqykc.iobyxmoadg.f67337iobyxmoadg;
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.zoijcleaow) {
            return new mj0.wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.jlmebxxoox(((lqeggnwhkg.zoijcleaow) lqeggnwhkgVar).iobyxmoadg()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final pj0.iobyxmoadg sopmlzcsov(Partner partner) {
        String str = this.f70197btonecajqb.iobyxmoadg(pm.wkgbmnqykc.partners_names)[Integer.parseInt(partner.getName())];
        Uri uri = Uri.parse(partner.getImageUrl());
        zdlpuopuiu.dxjokdxxww(uri, "parse(...)");
        return new pj0.iobyxmoadg(str, uri, partner.getUrl());
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f70199gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f70198draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(mj0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof mj0.eablkybsjg.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((mj0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, mj0.eablkybsjg.iobyxmoadg.f67329iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

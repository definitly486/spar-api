package og1;

import android.net.Uri;
import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.Partner;
import ru.myspar.proloyalty.partners.impl.screen.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f72838btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final tg.draadjrbmk f72839draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f72840gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ng1.gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f72838btonecajqb = resourcesManager;
        this.f72840gtknphoqwx = new tg.draadjrbmk() { // from class: og1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.crxdokpmqz(this.f72834zdlpuopuiu, (State) obj);
            }
        };
        this.f72839draadjrbmk = new tg.draadjrbmk() { // from class: og1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt(this.f72842zdlpuopuiu, (lqeggnwhkg) obj);
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

    private final Partner jlmebxxoox(qg1.iobyxmoadg iobyxmoadgVar) {
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        String string = iobyxmoadgVar.iobyxmoadg().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return new Partner(strZoijcleaow, string, iobyxmoadgVar.ppxfxbqfkf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ng1.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar, lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.iobyxmoadg.f72835iobyxmoadg)) {
            return ng1.wkgbmnqykc.iobyxmoadg.f70058iobyxmoadg;
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.zoijcleaow) {
            return new ng1.wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.jlmebxxoox(((lqeggnwhkg.zoijcleaow) lqeggnwhkgVar).iobyxmoadg()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final qg1.iobyxmoadg sopmlzcsov(Partner partner) {
        String str = this.f72838btonecajqb.iobyxmoadg(vk0.ppxfxbqfkf.partners_names)[Integer.parseInt(partner.getName())];
        Uri uri = Uri.parse(partner.getImageUrl());
        zdlpuopuiu.dxjokdxxww(uri, "parse(...)");
        return new qg1.iobyxmoadg(str, uri, partner.getUrl());
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f72840gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f72839draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ng1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ng1.eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((ng1.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, ng1.eablkybsjg.iobyxmoadg.f70050iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

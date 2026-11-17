package h20;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {
    static /* synthetic */ void jpowsppfya(eablkybsjg eablkybsjgVar, List list, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onChangeProductParams");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        eablkybsjgVar.dxjokdxxww(list, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static wwaezpbzkn wypolnanlu(eablkybsjg eablkybsjgVar, List list) {
        jpowsppfya(eablkybsjgVar, list, false, 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    boolean btonecajqb();

    default void dxjokdxxww(List params, boolean z13) {
        zdlpuopuiu.btonecajqb(params, "params");
        List listLqeggnwhkg = lqeggnwhkg(params);
        boolean zLereixgezr = lereixgezr(params);
        List list = btonecajqb() ? listLqeggnwhkg : params;
        if (!((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            zoijcleaow();
            return;
        }
        if (listLqeggnwhkg.isEmpty()) {
            gtknphoqwx(params);
            return;
        }
        if (z13) {
            nufgyqmvbu(list);
            return;
        }
        if (zLereixgezr) {
            y00.iobyxmoadg iobyxmoadgVarOjitshcjhn = ojitshcjhn();
            if ((iobyxmoadgVarOjitshcjhn != null ? iobyxmoadgVarOjitshcjhn.ppxfxbqfkf() : null) != DeliveryCode.PICKUP) {
                yggfygwlhe(list, null);
                return;
            }
        }
        ppxfxbqfkf(null);
        nufgyqmvbu(list);
    }

    c20.eablkybsjg eablkybsjg();

    void gtknphoqwx(List list);

    void gxszxtbevo();

    boolean lereixgezr(List list);

    List lqeggnwhkg(List list);

    void nufgyqmvbu(List list);

    y00.iobyxmoadg ojitshcjhn();

    void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar);

    default void stevsuqkhv(final List params) {
        zdlpuopuiu.btonecajqb(params, "params");
        ppxfxbqfkf(new tg.iobyxmoadg() { // from class: h20.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return eablkybsjg.wypolnanlu(this.f39219zdlpuopuiu, params);
            }
        });
        gxszxtbevo();
    }

    void yggfygwlhe(List list, String str);

    void zoijcleaow();
}

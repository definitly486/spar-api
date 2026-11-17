package v22;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k30.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mk.rgvfuqvkyq;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;
import ru.myspar.scango.impl.screens.cart.domain.State;
import s12.wkgbmnqykc;
import s40.btonecajqb;
import u22.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d60.iobyxmoadg f115856iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f115857zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final C2874iobyxmoadg f115854ppxfxbqfkf = new C2874iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f115855wkgbmnqykc = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final x30.iobyxmoadg f115853eablkybsjg = x30.iobyxmoadg.AMOUNT;

    /* JADX INFO: renamed from: v22.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2874iobyxmoadg {
        public /* synthetic */ C2874iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2874iobyxmoadg() {
        }
    }

    public iobyxmoadg(d60.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        this.f115856iobyxmoadg = resourcesManager;
        this.f115857zoijcleaow = measureTypeUtils;
    }

    private final String eablkybsjg(double d13) {
        return this.f115856iobyxmoadg.getString(wkgbmnqykc.approximate_price_format, n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(d13)));
    }

    private final Object gxszxtbevo(List list) {
        if (list.size() >= 2) {
            return list.get(1);
        }
        throw new NoSuchElementException("List size < 2.");
    }

    private final ScanGoProductUiModel lqeggnwhkg(ScanGoProductModel scanGoProductModel) {
        return new ScanGoProductUiModel(scanGoProductModel.getId(), scanGoProductModel.getArticle(), scanGoProductModel.getName(), scanGoProductModel.getPictureUrl(), wkgbmnqykc(scanGoProductModel.getQuantity(), scanGoProductModel.getMeasure()), scanGoProductModel.getQuantity(), eablkybsjg(scanGoProductModel.getPrice()), eablkybsjg(scanGoProductModel.getPrice() * scanGoProductModel.getQuantity()), scanGoProductModel.getMeasure(), scanGoProductModel.getMarkCodes());
    }

    private final List nufgyqmvbu(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg((ScanGoProductModel) it.next()));
        }
        return rgvfuqvkyq.yggfygwlhe(arrayList);
    }

    private final zoijcleaow ppxfxbqfkf() {
        String string = this.f115856iobyxmoadg.getString(wkgbmnqykc.scan_and_go_tutorial_product_name);
        int i13 = btonecajqb.scan_and_go_pack;
        x30.iobyxmoadg iobyxmoadgVar = f115853eablkybsjg;
        String strWkgbmnqykc = wkgbmnqykc(1.0d, iobyxmoadgVar);
        n30.iobyxmoadg iobyxmoadgVar2 = n30.iobyxmoadg.f68492iobyxmoadg;
        Double dValueOf = Double.valueOf(1.5d);
        return new zoijcleaow(0, null, string, i13, strWkgbmnqykc, 1.0d, iobyxmoadgVar2.lqeggnwhkg(dValueOf), iobyxmoadgVar2.lqeggnwhkg(dValueOf), iobyxmoadgVar, 3, null);
    }

    private final String wkgbmnqykc(double d13, x30.iobyxmoadg iobyxmoadgVar) {
        return this.f115856iobyxmoadg.getString(wkgbmnqykc.products_item_amount, iobyxmoadgVar == x30.iobyxmoadg.AMOUNT ? n30.iobyxmoadg.f68492iobyxmoadg.wflxmlrfwp(Double.valueOf(d13)) : n30.iobyxmoadg.f68492iobyxmoadg.draadjrbmk(d13), nufgyqmvbu.vdvldrhtss(this.f115857zoijcleaow, iobyxmoadgVar, false, 2, null));
    }

    public final State iobyxmoadg(String startText, o22.iobyxmoadg option) {
        zdlpuopuiu.btonecajqb(startText, "startText");
        zdlpuopuiu.btonecajqb(option, "option");
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(1.5d)), new char[]{','}, false, 0, 6, null);
        return new State(false, (String) jyumaefscl.opjhrmiecq(listMhtqkkgtqm), (String) gxszxtbevo(listMhtqkkgtqm), true, jyumaefscl.eablkybsjg(ppxfxbqfkf()), State.iobyxmoadg.FILL, true, false, 0L, startText, null, option, 1409, null);
    }

    public final State zoijcleaow(ScanGoCartModel model, String startText) {
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(startText, "startText");
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(model.getTotalCost())), new char[]{','}, false, 0, 6, null);
        boolean zIsEmpty = model.getProducts().isEmpty();
        return new State(false, (String) jyumaefscl.opjhrmiecq(listMhtqkkgtqm), (String) gxszxtbevo(listMhtqkkgtqm), true ^ zIsEmpty, nufgyqmvbu(model.getProducts()), zIsEmpty ? State.iobyxmoadg.EMPTY : State.iobyxmoadg.FILL, false, false, 0L, startText, null, null, 3457, null);
    }
}

package ro1;

import b31.btonecajqb;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mk.rgvfuqvkyq;
import on1.wkgbmnqykc;
import q11.nufgyqmvbu;
import qo1.zoijcleaow;
import ru.myspar.proloyalty.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;
import ru.myspar.proloyalty.scango.impl.screens.cart.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q41.iobyxmoadg f83217iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f83218zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final C1867iobyxmoadg f83215ppxfxbqfkf = new C1867iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f83216wkgbmnqykc = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final c21.iobyxmoadg f83214eablkybsjg = c21.iobyxmoadg.AMOUNT;

    /* JADX INFO: renamed from: ro1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1867iobyxmoadg {
        public /* synthetic */ C1867iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1867iobyxmoadg() {
        }
    }

    public iobyxmoadg(q41.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        this.f83217iobyxmoadg = resourcesManager;
        this.f83218zoijcleaow = measureTypeUtils;
    }

    private final String eablkybsjg(double d13) {
        return this.f83217iobyxmoadg.getString(wkgbmnqykc.proloyalty_approximate_price_format, t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(d13)));
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
        String string = this.f83217iobyxmoadg.getString(wkgbmnqykc.proloyalty_scan_and_go_tutorial_product_name);
        int i13 = btonecajqb.scan_and_go_pack;
        c21.iobyxmoadg iobyxmoadgVar = f83214eablkybsjg;
        String strWkgbmnqykc = wkgbmnqykc(1.0d, iobyxmoadgVar);
        t11.iobyxmoadg iobyxmoadgVar2 = t11.iobyxmoadg.f109303iobyxmoadg;
        Double dValueOf = Double.valueOf(1.5d);
        return new zoijcleaow(0, null, string, i13, strWkgbmnqykc, 1.0d, iobyxmoadgVar2.lqeggnwhkg(dValueOf), iobyxmoadgVar2.lqeggnwhkg(dValueOf), iobyxmoadgVar, 3, null);
    }

    private final String wkgbmnqykc(double d13, c21.iobyxmoadg iobyxmoadgVar) {
        return this.f83217iobyxmoadg.getString(wkgbmnqykc.proloyalty_products_item_amount, iobyxmoadgVar == c21.iobyxmoadg.AMOUNT ? t11.iobyxmoadg.f109303iobyxmoadg.wflxmlrfwp(Double.valueOf(d13)) : t11.iobyxmoadg.f109303iobyxmoadg.draadjrbmk(d13), nufgyqmvbu.vdvldrhtss(this.f83218zoijcleaow, iobyxmoadgVar, false, 2, null));
    }

    public final State iobyxmoadg(String startText, ko1.iobyxmoadg option) {
        zdlpuopuiu.btonecajqb(startText, "startText");
        zdlpuopuiu.btonecajqb(option, "option");
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(1.5d)), new char[]{','}, false, 0, 6, null);
        return new State(false, (String) jyumaefscl.opjhrmiecq(listMhtqkkgtqm), (String) gxszxtbevo(listMhtqkkgtqm), true, jyumaefscl.eablkybsjg(ppxfxbqfkf()), State.iobyxmoadg.FILL, true, false, 0L, startText, null, option, 1409, null);
    }

    public final State zoijcleaow(ScanGoCartModel model, String startText) {
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(startText, "startText");
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(model.getTotalCost())), new char[]{','}, false, 0, 6, null);
        boolean zIsEmpty = model.getProducts().isEmpty();
        return new State(false, (String) jyumaefscl.opjhrmiecq(listMhtqkkgtqm), (String) gxszxtbevo(listMhtqkkgtqm), true ^ zIsEmpty, nufgyqmvbu(model.getProducts()), zIsEmpty ? State.iobyxmoadg.EMPTY : State.iobyxmoadg.FILL, false, false, 0L, startText, null, null, 3457, null);
    }
}

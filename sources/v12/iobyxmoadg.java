package v12;

import fy.ScanGoCartReferencesEntity;
import fy.ScanGoProductEntity;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.draadjrbmk;
import ru.myspar.core.domain.models.reference.Reference;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartReferences;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final fy.ppxfxbqfkf iobyxmoadg(ScanGoCartModel scanGoCartModel) {
        ScanGoCartReferencesEntity scanGoCartReferencesEntityZoijcleaow;
        zdlpuopuiu.btonecajqb(scanGoCartModel, "<this>");
        String string = scanGoCartModel.getSessionExpiresAt().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        long secondsToComplete = scanGoCartModel.getSecondsToComplete();
        String shopId = scanGoCartModel.getShopId();
        double totalCost = scanGoCartModel.getTotalCost();
        int numberOfProducts = scanGoCartModel.getNumberOfProducts();
        List products = scanGoCartModel.getProducts();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
        Iterator it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((ScanGoProductModel) it.next()));
        }
        ScanGoCartReferences cartReferences = scanGoCartModel.getCartReferences();
        return new fy.ppxfxbqfkf(0, string, secondsToComplete, shopId, totalCost, numberOfProducts, arrayList, scanGoCartModel.getIsWalletPayNeedVerify(), (cartReferences == null || (scanGoCartReferencesEntityZoijcleaow = zoijcleaow(cartReferences)) == null) ? null : scanGoCartReferencesEntityZoijcleaow.getPayment(), 1, null);
    }

    public static final ScanGoProductEntity ppxfxbqfkf(ScanGoProductModel scanGoProductModel) {
        zdlpuopuiu.btonecajqb(scanGoProductModel, "<this>");
        int id2 = scanGoProductModel.getId();
        String article = scanGoProductModel.getArticle();
        String strName = scanGoProductModel.getMeasure().name();
        String name = scanGoProductModel.getName();
        String pictureUrl = scanGoProductModel.getPictureUrl();
        double price = scanGoProductModel.getPrice();
        double quantity = scanGoProductModel.getQuantity();
        List markCodes = scanGoProductModel.getMarkCodes();
        if (markCodes.isEmpty()) {
            markCodes = null;
        }
        return new ScanGoProductEntity(id2, article, strName, name, pictureUrl, price, quantity, markCodes);
    }

    public static final ScanGoCartReferencesEntity zoijcleaow(ScanGoCartReferences scanGoCartReferences) {
        zdlpuopuiu.btonecajqb(scanGoCartReferences, "<this>");
        List payment = scanGoCartReferences.getPayment();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(payment, 10));
        Iterator it = payment.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.wkgbmnqykc((Reference) it.next()));
        }
        return new ScanGoCartReferencesEntity(arrayList);
    }
}

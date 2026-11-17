package v12;

import fy.ScanGoProductEntity;
import hg.jyumaefscl;
import iy.ReferenceEntity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.draadjrbmk;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartReferences;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    public static final ScanGoCartModel iobyxmoadg(fy.ppxfxbqfkf ppxfxbqfkfVar) {
        List listWflxmlrfwp;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        LocalDateTime localDateTime = LocalDateTime.parse(ppxfxbqfkfVar.gxszxtbevo());
        zdlpuopuiu.dxjokdxxww(localDateTime, "parse(...)");
        long jEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
        String strLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg();
        List listWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((ScanGoProductEntity) it.next()));
        }
        double dNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu();
        int iZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        Boolean boolDxjokdxxww = ppxfxbqfkfVar.dxjokdxxww();
        List listPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        if (listPpxfxbqfkf != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
            Iterator it2 = listPpxfxbqfkf.iterator();
            while (it2.hasNext()) {
                listWflxmlrfwp.add(draadjrbmk.zoijcleaow((ReferenceEntity) it2.next()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new ScanGoCartModel(localDateTime, jEablkybsjg, strLqeggnwhkg, arrayList, dNufgyqmvbu, iZoijcleaow, null, boolDxjokdxxww, new ScanGoCartReferences(listWflxmlrfwp), 64, null);
    }

    public static final ScanGoProductModel zoijcleaow(ScanGoProductEntity scanGoProductEntity) {
        zdlpuopuiu.btonecajqb(scanGoProductEntity, "<this>");
        String article = scanGoProductEntity.getArticle();
        int id2 = scanGoProductEntity.getId();
        x30.iobyxmoadg iobyxmoadgVarValueOf = x30.iobyxmoadg.valueOf(scanGoProductEntity.getMeasure());
        String name = scanGoProductEntity.getName();
        String pictureUrl = scanGoProductEntity.getPictureUrl();
        double price = scanGoProductEntity.getPrice();
        double quantity = scanGoProductEntity.getQuantity();
        List markCodes = scanGoProductEntity.getMarkCodes();
        if (markCodes == null) {
            markCodes = jyumaefscl.wflxmlrfwp();
        }
        return new ScanGoProductModel(article, id2, iobyxmoadgVarValueOf, name, pictureUrl, price, quantity, markCodes);
    }
}

package as;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import mb0.ppxfxbqfkf;
import pm.dxjokdxxww;
import ru.myspar.core.domain.models.product.Product;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f14411zdlpuopuiu;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f14411zdlpuopuiu = resourcesManager;
    }

    private final ppxfxbqfkf eablkybsjg(Product product) {
        Double energy = product.getEnergy();
        if (energy == null) {
            return null;
        }
        return new ppxfxbqfkf(this.f14411zdlpuopuiu.getString(dxjokdxxww.energy), this.f14411zdlpuopuiu.getString(dxjokdxxww.nutrients_in_kilocalories_format, n30.iobyxmoadg.f68492iobyxmoadg.eablkybsjg(Double.valueOf(energy.doubleValue()))));
    }

    private final ppxfxbqfkf gtknphoqwx(Map.Entry entry) {
        return new ppxfxbqfkf((String) entry.getKey(), (String) entry.getValue());
    }

    private final ppxfxbqfkf gxszxtbevo(Product product) {
        Double fats = product.getFats();
        if (fats == null) {
            return null;
        }
        return new ppxfxbqfkf(this.f14411zdlpuopuiu.getString(dxjokdxxww.fats), this.f14411zdlpuopuiu.getString(dxjokdxxww.nutrients_per_grams_format, n30.iobyxmoadg.f68492iobyxmoadg.eablkybsjg(Double.valueOf(fats.doubleValue()))));
    }

    private final void iobyxmoadg(List list, Object obj) {
        if (obj != null) {
            list.add(obj);
        }
    }

    private final ppxfxbqfkf lqeggnwhkg(Product product) {
        Double protein = product.getProtein();
        if (protein == null) {
            return null;
        }
        return new ppxfxbqfkf(this.f14411zdlpuopuiu.getString(dxjokdxxww.proteins), this.f14411zdlpuopuiu.getString(dxjokdxxww.nutrients_per_grams_format, n30.iobyxmoadg.f68492iobyxmoadg.eablkybsjg(Double.valueOf(protein.doubleValue()))));
    }

    private final ppxfxbqfkf ppxfxbqfkf(Product product) {
        String chemical = product.getChemical();
        if (chemical == null || chemical.length() <= 0) {
            return null;
        }
        return new ppxfxbqfkf(this.f14411zdlpuopuiu.getString(dxjokdxxww.chemical), chemical);
    }

    private final ppxfxbqfkf zoijcleaow(Product product) {
        Double carbs = product.getCarbs();
        if (carbs == null) {
            return null;
        }
        return new ppxfxbqfkf(this.f14411zdlpuopuiu.getString(dxjokdxxww.carbs), this.f14411zdlpuopuiu.getString(dxjokdxxww.nutrients_per_grams_format, n30.iobyxmoadg.f68492iobyxmoadg.eablkybsjg(Double.valueOf(carbs.doubleValue()))));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public List invoke(Product model) {
        zdlpuopuiu.btonecajqb(model, "model");
        ArrayList arrayList = new ArrayList();
        iobyxmoadg(arrayList, eablkybsjg(model));
        iobyxmoadg(arrayList, lqeggnwhkg(model));
        iobyxmoadg(arrayList, gxszxtbevo(model));
        iobyxmoadg(arrayList, zoijcleaow(model));
        Map params = model.getParams();
        ArrayList arrayList2 = new ArrayList(params.size());
        Iterator it = params.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(gtknphoqwx((Map.Entry) it.next()));
        }
        arrayList.addAll(arrayList2);
        iobyxmoadg(arrayList, ppxfxbqfkf(model));
        return arrayList;
    }
}

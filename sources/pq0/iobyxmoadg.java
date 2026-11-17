package pq0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import l91.ppxfxbqfkf;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductDeclarations;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f77142zdlpuopuiu;

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f77142zdlpuopuiu = resourcesManager;
    }

    private final ppxfxbqfkf btonecajqb(Product product) {
        Double protein = product.getProtein();
        if (protein == null) {
            return null;
        }
        return new ppxfxbqfkf.zoijcleaow(this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_proteins), this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_nutrients_per_grams_format, t11.iobyxmoadg.f109303iobyxmoadg.eablkybsjg(Double.valueOf(protein.doubleValue()))));
    }

    private final ppxfxbqfkf eablkybsjg(Product product) {
        ProductDeclarations declarations = product.getDeclarations();
        if (declarations != null) {
            return new ppxfxbqfkf.iobyxmoadg(this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_declaration_of_conformity_title), declarations.getValue(), !declarations.getItems().isEmpty());
        }
        return null;
    }

    private final ppxfxbqfkf gxszxtbevo(Product product) {
        Double energy = product.getEnergy();
        if (energy == null) {
            return null;
        }
        return new ppxfxbqfkf.zoijcleaow(this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_energy), this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_nutrients_in_kilocalories_format, t11.iobyxmoadg.f109303iobyxmoadg.eablkybsjg(Double.valueOf(energy.doubleValue()))));
    }

    private final void iobyxmoadg(List list, Object obj) {
        if (obj != null) {
            list.add(obj);
        }
    }

    private final ppxfxbqfkf lqeggnwhkg(Product product) {
        Double fats = product.getFats();
        if (fats == null) {
            return null;
        }
        return new ppxfxbqfkf.zoijcleaow(this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_fats), this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_nutrients_per_grams_format, t11.iobyxmoadg.f109303iobyxmoadg.eablkybsjg(Double.valueOf(fats.doubleValue()))));
    }

    private final ppxfxbqfkf ppxfxbqfkf(Product product) {
        String chemical = product.getChemical();
        if (chemical == null || chemical.length() <= 0) {
            return null;
        }
        return new ppxfxbqfkf.zoijcleaow(this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_chemical), chemical);
    }

    private final ppxfxbqfkf wflxmlrfwp(Map.Entry entry) {
        return new ppxfxbqfkf.zoijcleaow((String) entry.getKey(), (String) entry.getValue());
    }

    private final ppxfxbqfkf zoijcleaow(Product product) {
        Double carbs = product.getCarbs();
        if (carbs == null) {
            return null;
        }
        return new ppxfxbqfkf.zoijcleaow(this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_carbs), this.f77142zdlpuopuiu.getString(lqeggnwhkg.proloyalty_nutrients_per_grams_format, t11.iobyxmoadg.f109303iobyxmoadg.eablkybsjg(Double.valueOf(carbs.doubleValue()))));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public List invoke(Product model) {
        zdlpuopuiu.btonecajqb(model, "model");
        ArrayList arrayList = new ArrayList();
        Map params = model.getParams();
        ArrayList arrayList2 = new ArrayList(params.size());
        Iterator it = params.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(wflxmlrfwp((Map.Entry) it.next()));
        }
        arrayList.addAll(arrayList2);
        iobyxmoadg(arrayList, gxszxtbevo(model));
        iobyxmoadg(arrayList, btonecajqb(model));
        iobyxmoadg(arrayList, lqeggnwhkg(model));
        iobyxmoadg(arrayList, zoijcleaow(model));
        iobyxmoadg(arrayList, ppxfxbqfkf(model));
        iobyxmoadg(arrayList, eablkybsjg(model));
        return arrayList;
    }
}

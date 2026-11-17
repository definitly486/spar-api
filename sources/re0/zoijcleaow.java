package re0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.loyalty_program.impl.presentation.categories_detail.CategoriesDetailFragment;
import ru.myspar.loyalty_program.impl.presentation.categories_detail.CategoriesDetailResultHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements pe0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CategoriesDetailResultHelper f82550iobyxmoadg;

    public zoijcleaow(CategoriesDetailResultHelper categoriesDetailResultHelper) {
        zdlpuopuiu.btonecajqb(categoriesDetailResultHelper, "categoriesDetailResultHelper");
        this.f82550iobyxmoadg = categoriesDetailResultHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment eablkybsjg(jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return CategoriesDetailFragment.INSTANCE.iobyxmoadg();
    }

    @Override // pe0.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg() {
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "categories_detail_fragment", false, new m9.ppxfxbqfkf() { // from class: re0.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.eablkybsjg((jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // pe0.iobyxmoadg
    public String ppxfxbqfkf() {
        return this.f82550iobyxmoadg.zoijcleaow();
    }

    @Override // pe0.iobyxmoadg
    public boolean zoijcleaow(Object result) {
        zdlpuopuiu.btonecajqb(result, "result");
        return this.f82550iobyxmoadg.ppxfxbqfkf(result);
    }
}

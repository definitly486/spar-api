package mc1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.CategoriesDetailFragment;
import ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.CategoriesDetailResultHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements kc1.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CategoriesDetailResultHelper f66799iobyxmoadg;

    public zoijcleaow(CategoriesDetailResultHelper categoriesDetailResultHelper) {
        zdlpuopuiu.btonecajqb(categoriesDetailResultHelper, "categoriesDetailResultHelper");
        this.f66799iobyxmoadg = categoriesDetailResultHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment eablkybsjg(jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return CategoriesDetailFragment.INSTANCE.iobyxmoadg();
    }

    @Override // kc1.zoijcleaow
    public m9.wkgbmnqykc iobyxmoadg() {
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "categories_detail_fragment", false, new m9.ppxfxbqfkf() { // from class: mc1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.eablkybsjg((jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // kc1.zoijcleaow
    public String ppxfxbqfkf() {
        return this.f66799iobyxmoadg.zoijcleaow();
    }

    @Override // kc1.zoijcleaow
    public boolean zoijcleaow(Object result) {
        zdlpuopuiu.btonecajqb(result, "result");
        return this.f66799iobyxmoadg.ppxfxbqfkf(result);
    }
}

package aw0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.special_products.api.models.Action;
import xv0.SpecialProductsDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final uv0.iobyxmoadg iobyxmoadg(SpecialProductsDto specialProductsDto, List mappedProducts) {
        zdlpuopuiu.btonecajqb(specialProductsDto, "<this>");
        zdlpuopuiu.btonecajqb(mappedProducts, "mappedProducts");
        String title = specialProductsDto.getTitle();
        if (title == null) {
            title = "";
        }
        String reference = specialProductsDto.getReference();
        Action.Companion companion = Action.INSTANCE;
        String action = specialProductsDto.getAction();
        return new uv0.iobyxmoadg(title, mappedProducts, reference, companion.iobyxmoadg(action != null ? action : ""));
    }
}

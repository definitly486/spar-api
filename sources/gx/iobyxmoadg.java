package gx;

import dx.SpecialProductsDto;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.special_products.api.models.Action;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final ax.iobyxmoadg iobyxmoadg(SpecialProductsDto specialProductsDto, List mappedProducts) {
        zdlpuopuiu.btonecajqb(specialProductsDto, "<this>");
        zdlpuopuiu.btonecajqb(mappedProducts, "mappedProducts");
        String title = specialProductsDto.getTitle();
        if (title == null) {
            title = "";
        }
        String reference = specialProductsDto.getReference();
        Action.Companion companion = Action.INSTANCE;
        String action = specialProductsDto.getAction();
        return new ax.iobyxmoadg(title, mappedProducts, reference, companion.iobyxmoadg(action != null ? action : ""));
    }
}

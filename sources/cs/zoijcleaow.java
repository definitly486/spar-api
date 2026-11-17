package cs;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import ru.myspar.catalog.impl.subcatalog.domain.store.State;
import ru.myspar.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f25643iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        String name;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            return state.zoijcleaow((OrderServiceErrorHandlerImpl.ORDER_LOCKED & 1) != 0 ? state.args : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 2) != 0 ? state.items : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 4) != 0 ? state.title : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 8) != 0 ? state.titleImage : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 16) != 0 ? state.isLoading : zoijcleaowVar.iobyxmoadg(), (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 32) != 0 ? state.isInitialLoading : zoijcleaowVar.iobyxmoadg() && state.getIsInitialLoading(), (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 64) != 0 ? state.colorsModel : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.banners : null);
        }
        if (!(msg instanceof gxszxtbevo.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
        List childCatalogSections = iobyxmoadgVar.zoijcleaow().getChildCatalogSections();
        CatalogSection rootCatalogSection = iobyxmoadgVar.zoijcleaow().getRootCatalogSection();
        if (rootCatalogSection == null || (name = rootCatalogSection.getName()) == null) {
            name = "";
        }
        String str = name;
        CatalogSection rootCatalogSection2 = iobyxmoadgVar.zoijcleaow().getRootCatalogSection();
        String titleImage = rootCatalogSection2 != null ? rootCatalogSection2.getTitleImage() : null;
        CatalogSection rootCatalogSection3 = iobyxmoadgVar.zoijcleaow().getRootCatalogSection();
        return state.zoijcleaow((OrderServiceErrorHandlerImpl.ORDER_LOCKED & 1) != 0 ? state.args : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 2) != 0 ? state.items : childCatalogSections, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 4) != 0 ? state.title : str, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 8) != 0 ? state.titleImage : titleImage, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 16) != 0 ? state.isLoading : false, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 32) != 0 ? state.isInitialLoading : false, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & 64) != 0 ? state.colorsModel : rootCatalogSection3 != null ? rootCatalogSection3.getColorsModel() : null, (OrderServiceErrorHandlerImpl.ORDER_LOCKED & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.banners : iobyxmoadgVar.iobyxmoadg());
    }
}

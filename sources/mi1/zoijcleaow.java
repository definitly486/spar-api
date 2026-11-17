package mi1;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import b31.eablkybsjg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.ppxfxbqfkf;
import m9.wkgbmnqykc;
import ow0.dxjokdxxww;
import ow0.nufgyqmvbu;
import ru.myspar.proloyalty.promo_collection.api.models.PromoCollectionPayload;
import ru.myspar.proloyalty.promo_collection.impl.presentation.PromoCollectionFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements li1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f67246iobyxmoadg = new iobyxmoadg(null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(PromoCollectionPayload promoCollectionPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PromoCollectionFragment.INSTANCE.iobyxmoadg(promoCollectionPayload);
    }

    @Override // li1.iobyxmoadg
    public xr0.iobyxmoadg iobyxmoadg(Context context, String productName, String productDescription, String productImageUrl) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(productDescription, "productDescription");
        zdlpuopuiu.btonecajqb(productImageUrl, "productImageUrl");
        return new nufgyqmvbu.iobyxmoadg(context, Boolean.TRUE, null, 4, null).ojitshcjhn(productName).nufgyqmvbu(productDescription).gxszxtbevo(new dxjokdxxww(227, 218, ImageView.ScaleType.CENTER_CROP, Float.valueOf(context.getResources().getDimension(eablkybsjg.content_margin_12)))).eablkybsjg(productImageUrl).vdvldrhtss().zoijcleaow();
    }

    @Override // li1.iobyxmoadg
    public wkgbmnqykc zoijcleaow(final PromoCollectionPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, "PROMO_COLLECTION_SCREEN_KEY", false, new ppxfxbqfkf() { // from class: mi1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.wkgbmnqykc(payload, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}

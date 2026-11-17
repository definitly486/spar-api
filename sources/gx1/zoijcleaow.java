package gx1;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.ppxfxbqfkf;
import m9.wkgbmnqykc;
import ru.myspar.promo_collection.api.models.PromoCollectionPayload;
import ru.myspar.promo_collection.impl.presentation.PromoCollectionFragment;
import rx.dxjokdxxww;
import rx.nufgyqmvbu;
import s40.draadjrbmk;
import s40.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements fx1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f38654iobyxmoadg = new iobyxmoadg(null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment eablkybsjg(PromoCollectionPayload promoCollectionPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PromoCollectionFragment.INSTANCE.iobyxmoadg(promoCollectionPayload);
    }

    @Override // fx1.iobyxmoadg
    public dt.iobyxmoadg iobyxmoadg(Context context, String productName, String productDescription, String productImageUrl) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(productDescription, "productDescription");
        zdlpuopuiu.btonecajqb(productImageUrl, "productImageUrl");
        return new nufgyqmvbu.iobyxmoadg(context, Boolean.TRUE, null, 4, null).ojitshcjhn(productName).nufgyqmvbu(productDescription).gxszxtbevo(new dxjokdxxww(227, 218, ImageView.ScaleType.CENTER_CROP, Float.valueOf(context.getResources().getDimension(eablkybsjg.content_margin_12)))).eablkybsjg(productImageUrl).vdvldrhtss().zoijcleaow();
    }

    @Override // fx1.iobyxmoadg
    public wkgbmnqykc ppxfxbqfkf(final PromoCollectionPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, "PROMO_COLLECTION_SCREEN_KEY", false, new ppxfxbqfkf() { // from class: gx1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.eablkybsjg(payload, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // fx1.iobyxmoadg
    public dt.iobyxmoadg zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new nufgyqmvbu.iobyxmoadg(context, Boolean.TRUE, null, 4, null).agtfadlqog(draadjrbmk.something_went_wrong).lqeggnwhkg(draadjrbmk.unlock_promo_product_error_message).iobyxmoadg(new rx.iobyxmoadg(rx.zoijcleaow.PRIMARY, Integer.valueOf(pm.dxjokdxxww.f76951ok), null, null, 12, null)).zoijcleaow();
    }
}

package ra1;

import b31.wkgbmnqykc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.ppxfxbqfkf;
import pa1.gxszxtbevo;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.domain.feature.promocatalog.store.State;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f82413zdlpuopuiu;

    /* JADX INFO: renamed from: ra1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1842iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f82414iobyxmoadg;

        static {
            int[] iArr = new int[Promotion.zoijcleaow.values().length];
            try {
                iArr[Promotion.zoijcleaow.CARD_OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Promotion.zoijcleaow.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82414iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f82413zdlpuopuiu = resourcesManager;
    }

    private final boolean agtfadlqog(Promotion.zoijcleaow zoijcleaowVar) {
        int i13 = C1842iobyxmoadg.f82414iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String btonecajqb() {
        return this.f82413zdlpuopuiu.getString(wkgbmnqykc.spar_color_surface_button_disable);
    }

    private final boolean eablkybsjg(boolean z13, Promotion promotion, Promotion.PromotionItem promotionItem) {
        boolean zZoijcleaow = zoijcleaow(z13, promotion, promotionItem);
        int i13 = C1842iobyxmoadg.f82414iobyxmoadg[promotion.getType().ordinal()];
        if (i13 == 1) {
            return zZoijcleaow && !promotionItem.getIsOpen();
        }
        if (i13 == 2) {
            return zZoijcleaow;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String gxszxtbevo(Promotion promotion, Promotion.PromotionItem promotionItem) {
        int i13 = C1842iobyxmoadg.f82414iobyxmoadg[promotion.getType().ordinal()];
        if (i13 == 1) {
            return promotion.getButtonText();
        }
        if (i13 == 2) {
            return lqeggnwhkg(promotionItem);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final sa1.iobyxmoadg iobyxmoadg(boolean z13, Promotion.PromotionItem promotionItem, Promotion promotion) {
        String string = promotionItem.getOldPrice() == 0.0d ? "" : this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_old_price_format, t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(promotionItem.getOldPrice())));
        String id2 = promotionItem.getId();
        String name = promotionItem.getName();
        Price priceWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f60512iobyxmoadg, promotionItem.getPrice(), 0, false, 6, null);
        boolean zAgtfadlqog = agtfadlqog(promotion.getType());
        String unit = promotionItem.getUnit();
        String strPpxfxbqfkf = ppxfxbqfkf(promotion, promotionItem);
        String strGxszxtbevo = gxszxtbevo(promotion, promotionItem);
        boolean zEablkybsjg = eablkybsjg(z13, promotion, promotionItem);
        String image = promotionItem.getImage();
        return new sa1.iobyxmoadg(id2, name, string, priceWkgbmnqykc, zAgtfadlqog, image == null ? "" : image, false, promotionItem.getNeeds(), strPpxfxbqfkf, strGxszxtbevo, zEablkybsjg, unit, promotionItem.getQrCode(), promotionItem.getDescription(), promotionItem.getRewardText(), promotionItem.getIsOpen());
    }

    private final String lqeggnwhkg(Promotion.PromotionItem promotionItem) {
        return this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_promo_action_reward_label, Integer.valueOf(promotionItem.getNeeds()), wflxmlrfwp(promotionItem.getNeeds()));
    }

    private final gxszxtbevo ojitshcjhn(State state) {
        boolean z13 = state.getIsLoggedIn() && state.getPromoModel().getBalance() != null;
        List items = state.getPromoModel().getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg(z13, (Promotion.PromotionItem) it.next(), state.getPromoModel()));
        }
        List listP = jyumaefscl.p(arrayList);
        Iterator it2 = listP.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            }
            if (((sa1.iobyxmoadg) it2.next()).kcexrzcfyt() == 0) {
                break;
            }
            i13++;
        }
        if (i13 != -1) {
            sa1.iobyxmoadg iobyxmoadgVar = (sa1.iobyxmoadg) listP.get(i13);
            listP.set(i13, iobyxmoadgVar.iobyxmoadg((65471 & 1) != 0 ? iobyxmoadgVar.f105941zdlpuopuiu : null, (65471 & 2) != 0 ? iobyxmoadgVar.f105939yggfygwlhe : null, (65471 & 4) != 0 ? iobyxmoadgVar.f105933jyumaefscl : null, (65471 & 8) != 0 ? iobyxmoadgVar.f105932iwizpuwonk : null, (65471 & 16) != 0 ? iobyxmoadgVar.f105928cqumvgiudr : false, (65471 & 32) != 0 ? iobyxmoadgVar.f105929esjtqupxsv : null, (65471 & 64) != 0 ? iobyxmoadgVar.f105934lereixgezr : true, (65471 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f105936pmvmpeiblj : 0, (65471 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f105942zynmafqrjb : null, (65471 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f105931istkbnxepw : null, (65471 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f105927cdpycssgdh : false, (65471 & 2048) != 0 ? iobyxmoadgVar.f105938yadqdtsiqt : null, (65471 & 4096) != 0 ? iobyxmoadgVar.f105930iozdgvuglv : null, (65471 & 8192) != 0 ? iobyxmoadgVar.f105935lmojexxdyd : null, (65471 & 16384) != 0 ? iobyxmoadgVar.f105937wwaezpbzkn : null, (65471 & 32768) != 0 ? iobyxmoadgVar.f105940ylkuphrtab : false));
        }
        Integer balance = state.getPromoModel().getBalance();
        int iIntValue = balance != null ? balance.intValue() : 0;
        String string = this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_title_promotion_catalog, Integer.valueOf(iIntValue), this.f82413zdlpuopuiu.lqeggnwhkg(vk0.gxszxtbevo.plural_stickers, iIntValue));
        String productsText = state.getPromoModel().getProductsText();
        String promoStickers = state.getPromoModel().getPromoStickers();
        Integer balance2 = state.getPromoModel().getBalance();
        String strWflxmlrfwp = wflxmlrfwp(balance2 != null ? balance2.intValue() : 0);
        Promotion.zoijcleaow type = state.getPromoModel().getType();
        Integer balance3 = state.getPromoModel().getBalance();
        return new gxszxtbevo(productsText, iIntValue, strWflxmlrfwp, (balance3 != null ? balance3.intValue() : 0) >= 0, promoStickers, type, listP, state.getIsLoading(), string);
    }

    private final String ppxfxbqfkf(Promotion promotion, Promotion.PromotionItem promotionItem) {
        Integer balance = promotion.getBalance();
        if ((balance != null ? balance.intValue() : 0) >= promotionItem.getNeeds() && !promotionItem.getIsOpen()) {
            return promotion.getColor();
        }
        String colorNotActive = promotion.getColorNotActive();
        return colorNotActive.length() == 0 ? btonecajqb() : colorNotActive;
    }

    private final String wflxmlrfwp(int i13) {
        if (10 <= i13 && i13 < 20) {
            return this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_zero);
        }
        int i14 = i13 % 10;
        if (i14 == 1) {
            return this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_one);
        }
        if (i14 == 2 || i14 == 3 || i14 == 4) {
            return this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_some);
        }
        return (5 > i14 || i14 >= 10) ? this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_zero) : this.f82413zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_zero);
    }

    private final boolean zoijcleaow(boolean z13, Promotion promotion, Promotion.PromotionItem promotionItem) {
        if (!z13) {
            return false;
        }
        if (promotionItem.getNeeds() == 0) {
            return true;
        }
        Integer balance = promotion.getBalance();
        if (balance != null && balance.intValue() == 0) {
            return false;
        }
        Integer balance2 = promotion.getBalance();
        return (balance2 != null ? balance2.intValue() : 0) >= promotionItem.getNeeds();
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return ojitshcjhn(state);
    }
}

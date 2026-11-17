package va1;

import b31.wkgbmnqykc;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.domain.feature.promotion.store.State;
import tg.draadjrbmk;
import vk0.gxszxtbevo;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final DateTimeFormatter f116433yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f116434zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final C2902iobyxmoadg f116432jyumaefscl = new C2902iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f116431iwizpuwonk = 8;

    /* JADX INFO: renamed from: va1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2902iobyxmoadg {
        public /* synthetic */ C2902iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2902iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f116435iobyxmoadg;

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
            f116435iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f116434zdlpuopuiu = resourcesManager;
        this.f116433yggfygwlhe = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    }

    private final String btonecajqb(int i13) {
        return this.f116434zdlpuopuiu.lqeggnwhkg(gxszxtbevo.plural_stickers, i13);
    }

    private final wa1.ppxfxbqfkf cqumvgiudr(Promotion.SponsorItem sponsorItem) {
        return new wa1.ppxfxbqfkf(sponsorItem.getCode(), sponsorItem.getCode(), sponsorItem.getName(), sponsorItem.getPic());
    }

    private final String eablkybsjg(Promotion promotion, Promotion.PromotionItem promotionItem) {
        int i13 = zoijcleaow.f116435iobyxmoadg[promotion.getType().ordinal()];
        if (i13 == 1) {
            return promotion.getButtonText();
        }
        if (i13 == 2) {
            return gxszxtbevo(promotionItem);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean gtknphoqwx(Promotion.zoijcleaow zoijcleaowVar, String str) {
        int i13 = zoijcleaow.f116435iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    private final String gxszxtbevo(Promotion.PromotionItem promotionItem) {
        return this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_promo_action_reward_label, Integer.valueOf(promotionItem.getNeeds()), kcexrzcfyt(promotionItem.getNeeds()));
    }

    private final boolean iobyxmoadg(boolean z13, Promotion promotion, Promotion.PromotionItem promotionItem) {
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

    private final wa1.iobyxmoadg iwizpuwonk(Promotion.PromotionItem promotionItem, boolean z13, Promotion promotion) {
        return new wa1.iobyxmoadg(promotionItem.getId(), promotionItem.getImage(), promotionItem.getName(), promotionItem.getOldPrice() == 0.0d ? "" : this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_old_price_format, t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(promotionItem.getOldPrice()))), promotionItem.getOldPrice(), promotionItem.getPrice(), ks0.ppxfxbqfkf.wkgbmnqykc(ks0.ppxfxbqfkf.f60512iobyxmoadg, promotionItem.getPrice(), 0, false, 6, null), promotionItem.getUnit(), promotionItem.getNeeds(), kcexrzcfyt(promotionItem.getNeeds()), promotion.getColor(), promotionItem.getQrCode(), promotionItem.getDescription(), promotionItem.getRewardText(), promotionItem.getIsOpen(), zdlpuopuiu(promotion.getType()), zoijcleaow(promotion, promotionItem), eablkybsjg(promotion, promotionItem), ppxfxbqfkf(z13, promotion, promotionItem), gtknphoqwx(promotion.getType(), promotionItem.getRewardText()));
    }

    private final int jyumaefscl(Promotion.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaow.f116435iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return lqeggnwhkg.proloyalty_title_collection;
        }
        if (i13 == 2) {
            return lqeggnwhkg.proloyalty_title_promos;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String kcexrzcfyt(int i13) {
        if (10 <= i13 && i13 < 20) {
            return this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_zero);
        }
        int i14 = i13 % 10;
        if (i14 == 1) {
            return this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_one);
        }
        if (i14 == 2 || i14 == 3 || i14 == 4) {
            return this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_some);
        }
        return (5 > i14 || i14 >= 10) ? this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_zero) : this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_stickers_zero);
    }

    private final String lqeggnwhkg() {
        return this.f116434zdlpuopuiu.getString(wkgbmnqykc.spar_color_surface_button_disable);
    }

    private final boolean ojitshcjhn(Promotion.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaow.f116435iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ta1.gxszxtbevo oxmwwwfdhm(Promotion promotion, boolean z13, String str, boolean z14) {
        LocalDateTime start = promotion.getExpirationDate().getStart();
        String str2 = start != null ? start.format(this.f116433yggfygwlhe) : null;
        String string = this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_format_year, str2 == null ? "" : str2);
        LocalDateTime end = promotion.getExpirationDate().getEnd();
        String str3 = end != null ? end.format(this.f116433yggfygwlhe) : null;
        String string2 = this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_format_year, str3 != null ? str3 : "");
        boolean z15 = false;
        boolean z16 = (z13 && promotion.getBalance() == null) ? false : true;
        List items = promotion.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(iwizpuwonk((Promotion.PromotionItem) it.next(), z16, promotion));
        }
        Iterator it2 = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            }
            if (zdlpuopuiu.eablkybsjg(((wa1.iobyxmoadg) it2.next()).eablkybsjg(), str)) {
                break;
            }
            i13++;
        }
        Integer numValueOf = i13 != -1 ? Integer.valueOf(((1073741823 / arrayList.size()) + i13) - 2) : null;
        boolean z17 = ojitshcjhn(promotion.getType()) && (promotion.getColor().length() > 0 || promotion.getColorNotActive().length() > 0);
        Promotion.zoijcleaow type = promotion.getType();
        Integer balance = promotion.getBalance();
        Integer balance2 = promotion.getBalance();
        String strWflxmlrfwp = wflxmlrfwp(balance2 != null ? balance2.intValue() : 0);
        String promoName = promotion.getPromoName();
        String shortDescription = promotion.getShortDescription();
        wa1.zoijcleaow zoijcleaowVar = new wa1.zoijcleaow((promotion.getBalance() == null && z13) ? false : true, this.f116434zdlpuopuiu.getString(jyumaefscl(promotion.getType())), promotion.getProductsText(), yggfygwlhe(promotion.getType()), arrayList, numValueOf);
        boolean z18 = promotion.getFullDescription().length() > 0;
        String fullDescription = promotion.getFullDescription();
        boolean z19 = promotion.getCommonRulesDescription().length() > 0;
        String commonRulesDescription = promotion.getCommonRulesDescription();
        String promoSticker = promotion.getPromoSticker();
        String imagePromo = promotion.getImagePromo();
        String color = promotion.getColor();
        String colorNotActive = promotion.getColorNotActive();
        Promotion.PromotionItem promotionItem = (Promotion.PromotionItem) jyumaefscl.weqkydbzbr(promotion.getItems());
        String qrCode = promotionItem != null ? promotionItem.getQrCode() : null;
        boolean zIobyxmoadg = ru.myspar.proloyalty.core.domain.models.promo.iobyxmoadg.iobyxmoadg(promotion);
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            z15 = true;
        }
        boolean showSponsors = promotion.getShowSponsors();
        List sponsors = promotion.getSponsors();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(sponsors, 10));
        Iterator it3 = sponsors.iterator();
        while (it3.hasNext()) {
            arrayList2.add(cqumvgiudr((Promotion.SponsorItem) it3.next()));
        }
        return new ta1.gxszxtbevo(z13, z17, z16, balance, null, strWflxmlrfwp, type, promoName, string, string2, shortDescription, zoijcleaowVar, z18, fullDescription, z19, commonRulesDescription, promoSticker, imagePromo, color, colorNotActive, null, qrCode, zIobyxmoadg, z15, showSponsors, arrayList2, null, z14, 68157456, null);
    }

    private final boolean ppxfxbqfkf(boolean z13, Promotion promotion, Promotion.PromotionItem promotionItem) {
        boolean zIobyxmoadg = iobyxmoadg(z13, promotion, promotionItem);
        int i13 = zoijcleaow.f116435iobyxmoadg[promotion.getType().ordinal()];
        if (i13 == 1) {
            return zIobyxmoadg && !promotionItem.getIsOpen();
        }
        if (i13 == 2) {
            return zIobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String wflxmlrfwp(int i13) {
        return this.f116434zdlpuopuiu.getString(lqeggnwhkg.proloyalty_format_stickers_balance, Integer.valueOf(i13), btonecajqb(i13));
    }

    private final boolean yggfygwlhe(Promotion.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaow.f116435iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean zdlpuopuiu(Promotion.zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaow.f116435iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String zoijcleaow(Promotion promotion, Promotion.PromotionItem promotionItem) {
        Integer balance = promotion.getBalance();
        if ((balance != null ? balance.intValue() : 0) >= promotionItem.getNeeds() && !promotionItem.getIsOpen()) {
            return promotion.getColor();
        }
        String colorNotActive = promotion.getColorNotActive();
        return colorNotActive.length() == 0 ? lqeggnwhkg() : colorNotActive;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public ta1.gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return oxmwwwfdhm(state.getPromotion(), state.getIsLoggedIn(), state.getSelectedItemId(), state.getIsLoading());
    }
}

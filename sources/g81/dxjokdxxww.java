package g81;

import h81.yggfygwlhe;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.evropolis.impl.gift.domain.mvi.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o91.zoijcleaow f36649iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final q41.iobyxmoadg f36650ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n91.iobyxmoadg f36651zoijcleaow;

    public dxjokdxxww(o91.zoijcleaow productUiModelMapper, n91.iobyxmoadg colorsUiModelMapper, q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f36649iobyxmoadg = productUiModelMapper;
        this.f36651zoijcleaow = colorsUiModelMapper;
        this.f36650ppxfxbqfkf = resourcesManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eablkybsjg(dxjokdxxww dxjokdxxwwVar, int i13, Object[] objArr) {
        return dxjokdxxwwVar.f36650ppxfxbqfkf.eablkybsjg(i13, objArr);
    }

    private final List wkgbmnqykc(EvropolisGift evropolisGift, EvropolisGift.Tab.zoijcleaow zoijcleaowVar, DeliveryCode deliveryCode, ColorsUiModel colorsUiModel, boolean z13) {
        EvropolisGift.TextWithTab textWithTab;
        Object next;
        EvropolisGift.TextWithTab textWithTab2;
        Object next2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new yggfygwlhe.dxjokdxxww(evropolisGift.getTitle(), null, 2, null));
        Product product = evropolisGift.getProduct();
        if (product != null) {
            arrayList.add(new yggfygwlhe.wkgbmnqykc(this.f36649iobyxmoadg.ppxfxbqfkf(product, null, deliveryCode, false, false, false, (64 & 64) != 0 ? null : null, new rgvfuqvkyq() { // from class: g81.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return dxjokdxxww.eablkybsjg(this.f36655zdlpuopuiu, ((Integer) obj).intValue(), (Object[]) obj2);
                }
            }), z13, !z13, null, 8, null));
        }
        EvropolisGift.Bonus bonus = evropolisGift.getBonus();
        if (bonus != null) {
            arrayList.add(new yggfygwlhe.iobyxmoadg(bonus.getImage(), bonus.getTitle(), null, 4, null));
        }
        List<EvropolisGift.Tab> tabs = evropolisGift.getTabs();
        if (tabs != null) {
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(tabs, 10));
            for (EvropolisGift.Tab tab : tabs) {
                arrayList2.add(new yggfygwlhe.lqeggnwhkg.iobyxmoadg(tab.getType().name(), tab.getTitle()));
            }
            arrayList.add(new yggfygwlhe.lqeggnwhkg(arrayList2, colorsUiModel, null, 4, null));
        }
        boolean z14 = zoijcleaowVar != null;
        List instructions = evropolisGift.getInstructions();
        if (instructions != null) {
            if (z14) {
                Iterator it = instructions.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((EvropolisGift.TextWithTab) next2).getTab() != zoijcleaowVar);
                textWithTab2 = (EvropolisGift.TextWithTab) next2;
            } else {
                textWithTab2 = (EvropolisGift.TextWithTab) jyumaefscl.weqkydbzbr(instructions);
            }
            if (textWithTab2 != null) {
                arrayList.add(new yggfygwlhe.ppxfxbqfkf(textWithTab2.getText(), null, 2, null));
            }
        }
        EvropolisGift.TextWithTab coupon = evropolisGift.getCoupon();
        if (coupon != null && (!z14 || coupon.getTab() == zoijcleaowVar)) {
            arrayList.add(new yggfygwlhe.zoijcleaow(coupon.getText(), colorsUiModel, null, 4, null));
        }
        EvropolisGift.TextWithTab qr2 = evropolisGift.getQr();
        if (qr2 != null && (!z14 || qr2.getTab() == zoijcleaowVar)) {
            arrayList.add(new yggfygwlhe.gxszxtbevo(qr2.getText(), null, 2, null));
        }
        List terms = evropolisGift.getTerms();
        if (terms != null) {
            if (z14) {
                Iterator it2 = terms.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((EvropolisGift.TextWithTab) next).getTab() != zoijcleaowVar);
                textWithTab = (EvropolisGift.TextWithTab) next;
            } else {
                textWithTab = (EvropolisGift.TextWithTab) jyumaefscl.weqkydbzbr(terms);
            }
            if (textWithTab != null) {
                arrayList.add(new yggfygwlhe.nufgyqmvbu(textWithTab.getText(), null, 2, null));
            }
        }
        EvropolisGift.Puzzle puzzle = evropolisGift.getPuzzle();
        if (puzzle != null) {
            arrayList.add(new yggfygwlhe.eablkybsjg(puzzle.getImage(), puzzle.getTitle(), null, 4, null));
        }
        return arrayList;
    }

    private final String zoijcleaow(List list, EvropolisGift.Button.zoijcleaow zoijcleaowVar, EvropolisGift.Tab.zoijcleaow zoijcleaowVar2) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EvropolisGift.Button button = (EvropolisGift.Button) next;
            if (button.getType() == zoijcleaowVar && (zoijcleaowVar2 == null || button.getTab() == null || button.getTab() == zoijcleaowVar2)) {
                break;
            }
        }
        EvropolisGift.Button button2 = (EvropolisGift.Button) next;
        if (button2 != null) {
            return button2.getText();
        }
        return null;
    }

    public final btonecajqb ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        EvropolisGift gift = state.getGift();
        EvropolisGift.Tab.zoijcleaow selectedTab = state.getSelectedTab();
        DeliveryCode deliveryCode = state.getDeliveryCode();
        ColorsUiModel colorsUiModelIobyxmoadg = this.f36651zoijcleaow.iobyxmoadg(gift.getColorModel());
        List listWkgbmnqykc = wkgbmnqykc(gift, selectedTab, deliveryCode, colorsUiModelIobyxmoadg, state.getIsLoading());
        List buttons = gift.getButtons();
        String strZoijcleaow = buttons != null ? zoijcleaow(buttons, EvropolisGift.Button.zoijcleaow.PRIMARY, selectedTab) : null;
        List buttons2 = gift.getButtons();
        return new btonecajqb(state.getIsLoading(), listWkgbmnqykc, strZoijcleaow, buttons2 != null ? zoijcleaow(buttons2, EvropolisGift.Button.zoijcleaow.SECONDARY, selectedTab) : null, colorsUiModelIobyxmoadg);
    }
}

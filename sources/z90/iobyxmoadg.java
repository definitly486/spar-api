package z90;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ly.gxszxtbevo;
import nz.ppxfxbqfkf;
import ru.myspar.core.data.response.evropolis.EvropolisGiftDto;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.evropolis.api.model.EvropolisGift;
import tz.ProductDto;
import tz.ProductsReferencesDto;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C3288iobyxmoadg f129342zoijcleaow = new C3288iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f129343iobyxmoadg;

    /* JADX INFO: renamed from: z90.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3288iobyxmoadg {
        public /* synthetic */ C3288iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3288iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f129344iobyxmoadg;

        static {
            int[] iArr = new int[EvropolisGiftDto.TabDto.ppxfxbqfkf.values().length];
            try {
                iArr[EvropolisGiftDto.TabDto.ppxfxbqfkf.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EvropolisGiftDto.TabDto.ppxfxbqfkf.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f129344iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(gxszxtbevo productResponseMapper) {
        zdlpuopuiu.btonecajqb(productResponseMapper, "productResponseMapper");
        this.f129343iobyxmoadg = productResponseMapper;
    }

    private final List dxjokdxxww(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EvropolisGiftDto.ButtonWrapperDto buttonWrapperDto = (EvropolisGiftDto.ButtonWrapperDto) it.next();
            EvropolisGift.Button.zoijcleaow zoijcleaowVar = zdlpuopuiu.eablkybsjg(buttonWrapperDto.getButton().getType(), "secondary") ? EvropolisGift.Button.zoijcleaow.SECONDARY : EvropolisGift.Button.zoijcleaow.PRIMARY;
            EvropolisGiftDto.TabDto.ppxfxbqfkf tab = buttonWrapperDto.getTab();
            arrayList.add(new EvropolisGift.Button(tab != null ? eablkybsjg(tab) : null, zoijcleaowVar, buttonWrapperDto.getButton().getText(), f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(buttonWrapperDto.getButton().getNavLink()), buttonWrapperDto.getButton().getReference()));
        }
        return arrayList;
    }

    private final EvropolisGift.Tab.zoijcleaow eablkybsjg(EvropolisGiftDto.TabDto.ppxfxbqfkf ppxfxbqfkfVar) {
        int i13 = zoijcleaow.f129344iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == 1) {
            return EvropolisGift.Tab.zoijcleaow.OFFLINE;
        }
        if (i13 == 2) {
            return EvropolisGift.Tab.zoijcleaow.ONLINE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EvropolisGift.TextWithTab gxszxtbevo(EvropolisGiftDto.CodeWrapperDto codeWrapperDto) {
        EvropolisGiftDto.TabDto.ppxfxbqfkf tab = codeWrapperDto.getTab();
        return new EvropolisGift.TextWithTab(tab != null ? eablkybsjg(tab) : null, codeWrapperDto.getCode());
    }

    private final List iobyxmoadg(List list) {
        EvropolisGift.Tab.zoijcleaow zoijcleaowVarEablkybsjg;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            EvropolisGift.Tab tab = null;
            if (!it.hasNext()) {
                break;
            }
            EvropolisGiftDto.TabDto tabDto = (EvropolisGiftDto.TabDto) it.next();
            EvropolisGiftDto.TabDto.ppxfxbqfkf type = tabDto.getType();
            if (type != null && (zoijcleaowVarEablkybsjg = eablkybsjg(type)) != null) {
                tab = new EvropolisGift.Tab(zoijcleaowVarEablkybsjg, tabDto.getTitle());
            }
            if (tab != null) {
                arrayList.add(tab);
            }
        }
        if (arrayList.size() >= 2) {
            return arrayList;
        }
        return null;
    }

    private final EvropolisGift.TextWithTab lqeggnwhkg(EvropolisGiftDto.TextWrapperDto textWrapperDto) {
        EvropolisGiftDto.TabDto.ppxfxbqfkf tab = textWrapperDto.getTab();
        return new EvropolisGift.TextWithTab(tab != null ? eablkybsjg(tab) : null, textWrapperDto.getText());
    }

    private final EvropolisGift.Bonus ppxfxbqfkf(EvropolisGiftDto.BonusDto bonusDto) {
        return new EvropolisGift.Bonus(bonusDto.getTitle(), bonusDto.getImage());
    }

    private final EvropolisGift.Puzzle wkgbmnqykc(EvropolisGiftDto.PuzzleDto puzzleDto) {
        return new EvropolisGift.Puzzle(puzzleDto.getTitle(), puzzleDto.getImage());
    }

    private final Product zoijcleaow(EvropolisGiftDto.ProductsDto productsDto, ProductsReferencesDto productsReferencesDto, ppxfxbqfkf ppxfxbqfkfVar) {
        ProductDto productDto;
        List<ProductDto> items = productsDto.getItems();
        if (items == null || (productDto = (ProductDto) jyumaefscl.weqkydbzbr(items)) == null) {
            return null;
        }
        return this.f129343iobyxmoadg.ppxfxbqfkf(productDto, productsReferencesDto, ppxfxbqfkfVar);
    }

    public final EvropolisGift nufgyqmvbu(EvropolisGiftDto dto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        zdlpuopuiu.btonecajqb(dto, "dto");
        String id2 = dto.getId();
        String title = dto.getTitle();
        List tabs = dto.getTabs();
        List listIobyxmoadg = tabs != null ? iobyxmoadg(tabs) : null;
        EvropolisGiftDto.BonusDto bonus = dto.getBonus();
        EvropolisGift.Bonus bonusPpxfxbqfkf = bonus != null ? ppxfxbqfkf(bonus) : null;
        EvropolisGiftDto.ProductsDto products = dto.getProducts();
        Product productZoijcleaow = products != null ? zoijcleaow(products, dto.getRefs(), dto.getColorThemeType()) : null;
        List instructions = dto.getInstructions();
        if (instructions != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(instructions, 10));
            Iterator it = instructions.iterator();
            while (it.hasNext()) {
                arrayList.add(lqeggnwhkg((EvropolisGiftDto.TextWrapperDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        EvropolisGiftDto.CodeWrapperDto qr2 = dto.getQr();
        EvropolisGift.TextWithTab textWithTabGxszxtbevo = qr2 != null ? gxszxtbevo(qr2) : null;
        EvropolisGiftDto.CodeWrapperDto coupon = dto.getCoupon();
        EvropolisGift.TextWithTab textWithTabGxszxtbevo2 = coupon != null ? gxszxtbevo(coupon) : null;
        List terms = dto.getTerms();
        if (terms != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(terms, 10));
            Iterator it2 = terms.iterator();
            while (it2.hasNext()) {
                arrayList3.add(lqeggnwhkg((EvropolisGiftDto.TextWrapperDto) it2.next()));
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        EvropolisGiftDto.PuzzleDto puzzle = dto.getPuzzle();
        EvropolisGift.Puzzle puzzleWkgbmnqykc = puzzle != null ? wkgbmnqykc(puzzle) : null;
        List buttons = dto.getButtons();
        return new EvropolisGift(id2, title, productZoijcleaow, bonusPpxfxbqfkf, listIobyxmoadg, arrayList, textWithTabGxszxtbevo, textWithTabGxszxtbevo2, arrayList2, puzzleWkgbmnqykc, buttons != null ? dxjokdxxww(buttons) : null, oy.zoijcleaow.zoijcleaow(dto.getColorThemeType(), dto.getRefs().getColors()));
    }
}

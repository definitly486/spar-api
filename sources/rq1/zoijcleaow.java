package rq1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionItem;
import sq1.dxjokdxxww;
import tg.vdvldrhtss;
import vq1.jpowsppfya;
import vq1.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements vdvldrhtss {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f83674iobyxmoadg;

        static {
            int[] iArr = new int[dxjokdxxww.PromoCollectionDto.eablkybsjg.values().length];
            try {
                iArr[dxjokdxxww.PromoCollectionDto.eablkybsjg.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dxjokdxxww.PromoCollectionDto.eablkybsjg.READY_TO_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dxjokdxxww.PromoCollectionDto.eablkybsjg.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f83674iobyxmoadg = iArr;
        }
    }

    private final PromoCollectionItem iobyxmoadg(dxjokdxxww.PromoCollectionDto.PromoCollectionDataDto promoCollectionDataDto, dxjokdxxww.PromoCollectionDto.PromoCollectionItemDto promoCollectionItemDto, dxjokdxxww.PromoCollectionDto.eablkybsjg eablkybsjgVar) {
        PromoCollectionItem.Status status;
        String name = promoCollectionItemDto.getName();
        if (name == null) {
            name = "";
        }
        String imageUrl = promoCollectionItemDto.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        String buttonTextForOpened = promoCollectionDataDto.getButtonTextForOpened();
        if (buttonTextForOpened == null) {
            buttonTextForOpened = "";
        }
        PromoCollectionItem.Status.Opened opened = new PromoCollectionItem.Status.Opened(name, imageUrl, buttonTextForOpened);
        String nameWhileBlocked = promoCollectionDataDto.getNameWhileBlocked();
        if (nameWhileBlocked == null) {
            nameWhileBlocked = "";
        }
        String imageWhileBlocked = promoCollectionDataDto.getImageWhileBlocked();
        if (imageWhileBlocked == null) {
            imageWhileBlocked = "";
        }
        String buttonTextForBlocked = promoCollectionDataDto.getButtonTextForBlocked();
        if (buttonTextForBlocked == null) {
            buttonTextForBlocked = "";
        }
        String textAboveButton = promoCollectionItemDto.getTextAboveButton();
        if (textAboveButton == null) {
            textAboveButton = "";
        }
        PromoCollectionItem.Status.Blocked blocked = new PromoCollectionItem.Status.Blocked(nameWhileBlocked, imageWhileBlocked, buttonTextForBlocked, textAboveButton);
        String nameWhileBlocked2 = promoCollectionDataDto.getNameWhileBlocked();
        if (nameWhileBlocked2 == null) {
            nameWhileBlocked2 = "";
        }
        String imageWhileBlocked2 = promoCollectionDataDto.getImageWhileBlocked();
        if (imageWhileBlocked2 == null) {
            imageWhileBlocked2 = "";
        }
        String buttonTextForReadyToOpen = promoCollectionDataDto.getButtonTextForReadyToOpen();
        if (buttonTextForReadyToOpen == null) {
            buttonTextForReadyToOpen = "";
        }
        String textAboveButton2 = promoCollectionItemDto.getTextAboveButton();
        if (textAboveButton2 == null) {
            textAboveButton2 = "";
        }
        PromoCollectionItem.Status.ReadyToOpen readyToOpen = new PromoCollectionItem.Status.ReadyToOpen(nameWhileBlocked2, imageWhileBlocked2, buttonTextForReadyToOpen, textAboveButton2);
        int i13 = iobyxmoadg.f83674iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            status = opened;
        } else if (i13 == 2) {
            status = readyToOpen;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            status = blocked;
        }
        String id2 = promoCollectionItemDto.getId();
        if (id2 == null) {
            id2 = "";
        }
        String description = promoCollectionItemDto.getDescription();
        return new PromoCollectionItem(id2, description != null ? description : "", status, jyumaefscl.rgvfuqvkyq(blocked, readyToOpen, opened));
    }

    @Override // tg.vdvldrhtss
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return zoijcleaow((String) obj, ((Number) obj2).intValue(), (dxjokdxxww.PromoCollectionDto.PromoCollectionDataDto) obj3);
    }

    public pkzmftpjix zoijcleaow(String landingPageId, int i13, dxjokdxxww.PromoCollectionDto.PromoCollectionDataDto dataDto) {
        Object next;
        zdlpuopuiu.btonecajqb(landingPageId, "landingPageId");
        zdlpuopuiu.btonecajqb(dataDto, "dataDto");
        List<dxjokdxxww.PromoCollectionDto.PromoCollectionItemDto> items = dataDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (dxjokdxxww.PromoCollectionDto.PromoCollectionItemDto promoCollectionItemDto : items) {
            Iterator<E> it = dxjokdxxww.PromoCollectionDto.eablkybsjg.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((dxjokdxxww.PromoCollectionDto.eablkybsjg) next).lqeggnwhkg(), promoCollectionItemDto.getStatus()));
            dxjokdxxww.PromoCollectionDto.eablkybsjg eablkybsjgVar = (dxjokdxxww.PromoCollectionDto.eablkybsjg) next;
            if (eablkybsjgVar == null) {
                eablkybsjgVar = dxjokdxxww.PromoCollectionDto.eablkybsjg.BLOCKED;
            }
            arrayList.add(iobyxmoadg(dataDto, promoCollectionItemDto, eablkybsjgVar));
        }
        String str = i13 + landingPageId;
        String name = dataDto.getName();
        String str2 = name == null ? "" : name;
        String balance = dataDto.getBalance();
        String str3 = balance == null ? "" : balance;
        String promoStickerImageUrl = dataDto.getPromoStickerImageUrl();
        String str4 = promoStickerImageUrl == null ? "" : promoStickerImageUrl;
        String textForCollection = dataDto.getTextForCollection();
        return new pkzmftpjix(i13, jpowsppfya.PROMO_COLLECTION, new PromoCollectionInfo(str, str2, str3, str4, textForCollection == null ? "" : textForCollection), arrayList);
    }
}

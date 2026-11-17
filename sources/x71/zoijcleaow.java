package x71;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import rq1.wkgbmnqykc;
import sq1.dxjokdxxww;
import w71.EvropolisRedeemDto;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f121424iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final d81.iobyxmoadg f121425zoijcleaow;

    public zoijcleaow(wkgbmnqykc specialBannerResponseMapper, d81.iobyxmoadg evropolisGiftResponseMapper) {
        zdlpuopuiu.btonecajqb(specialBannerResponseMapper, "specialBannerResponseMapper");
        zdlpuopuiu.btonecajqb(evropolisGiftResponseMapper, "evropolisGiftResponseMapper");
        this.f121424iobyxmoadg = specialBannerResponseMapper;
        this.f121425zoijcleaow = evropolisGiftResponseMapper;
    }

    public final y71.iobyxmoadg iobyxmoadg(EvropolisRedeemDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        String stickersBlockSubtitle = dto.getStickersBlockSubtitle();
        List stickers = dto.getStickers();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(stickers, 10));
        Iterator it = stickers.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f121424iobyxmoadg.wkgbmnqykc((dxjokdxxww.EvropolisStickersDto.EvropolisStickerDtoData) it.next()));
        }
        return new y71.iobyxmoadg(stickersBlockSubtitle, arrayList, this.f121424iobyxmoadg.gxszxtbevo(dto.getGifts()), this.f121425zoijcleaow.nufgyqmvbu(dto.getGift()));
    }
}

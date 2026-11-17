package t90;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import s90.EvropolisRedeemDto;
import y42.wkgbmnqykc;
import z42.dxjokdxxww;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f110116iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final z90.iobyxmoadg f110117zoijcleaow;

    public zoijcleaow(wkgbmnqykc specialBannerResponseMapper, z90.iobyxmoadg evropolisGiftResponseMapper) {
        zdlpuopuiu.btonecajqb(specialBannerResponseMapper, "specialBannerResponseMapper");
        zdlpuopuiu.btonecajqb(evropolisGiftResponseMapper, "evropolisGiftResponseMapper");
        this.f110116iobyxmoadg = specialBannerResponseMapper;
        this.f110117zoijcleaow = evropolisGiftResponseMapper;
    }

    public final u90.iobyxmoadg iobyxmoadg(EvropolisRedeemDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        String stickersBlockSubtitle = dto.getStickersBlockSubtitle();
        List stickers = dto.getStickers();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(stickers, 10));
        Iterator it = stickers.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f110116iobyxmoadg.wkgbmnqykc((dxjokdxxww.EvropolisStickersDto.EvropolisStickerDtoData) it.next()));
        }
        return new u90.iobyxmoadg(stickersBlockSubtitle, arrayList, this.f110116iobyxmoadg.gxszxtbevo(dto.getGifts()), this.f110117zoijcleaow.nufgyqmvbu(dto.getGift()));
    }
}

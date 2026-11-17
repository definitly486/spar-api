package rg0;

import hg.jyumaefscl;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import sg0.AppUpdateDataDto;
import sg0.BannerDto;
import sg0.BannerGroupDto;
import sg0.BannersDto;
import sg0.PopupBannersDto;
import sg0.PopupsDto;
import sg0.SubtitleDto;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p00.iobyxmoadg.InterfaceC1646iobyxmoadg f82602iobyxmoadg;

    public iobyxmoadg(p00.iobyxmoadg.InterfaceC1646iobyxmoadg semiVersionBuilder) {
        zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        this.f82602iobyxmoadg = semiVersionBuilder;
    }

    private final xg0.iobyxmoadg agtfadlqog(BannerGroupDto bannerGroupDto) {
        return new xg0.iobyxmoadg(bannerGroupDto.getCode(), bannerGroupDto.getName(), eablkybsjg(bannerGroupDto.getBanners(), bannerGroupDto.getCode()));
    }

    private final List btonecajqb(PopupsDto popupsDto) {
        List<BannerDto> popupBanners;
        PopupBannersDto popups = popupsDto.getPopups();
        ArrayList arrayList = null;
        if (popups != null && (popupBanners = popups.getPopupBanners()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BannerDto bannerDto : popupBanners) {
                pf0.zoijcleaow.iobyxmoadg iobyxmoadgVar = pf0.zoijcleaow.f76550yggfygwlhe;
                String type = bannerDto.getType();
                if (type == null) {
                    type = "";
                }
                pf0.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(type);
                pf0.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVarIobyxmoadg != null ? new pf0.iobyxmoadg(draadjrbmk(bannerDto, "popup"), zoijcleaowVarIobyxmoadg) : null;
                if (iobyxmoadgVar2 != null) {
                    arrayList2.add(iobyxmoadgVar2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
    }

    private final q00.zoijcleaow draadjrbmk(BannerDto bannerDto, String str) {
        String id2 = bannerDto.getId();
        String str2 = id2 == null ? "" : id2;
        Integer sort = bannerDto.getSort();
        int iIntValue = sort != null ? sort.intValue() : 0;
        String image = bannerDto.getImage();
        String str3 = image == null ? "" : image;
        q00.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = iobyxmoadg(bannerDto, str);
        String firstColor = bannerDto.getFirstColor();
        String secondColor = bannerDto.getSecondColor();
        String title = bannerDto.getTitle();
        String buttonText = bannerDto.getButtonText();
        String video = bannerDto.getVideo();
        List subtitles = bannerDto.getSubtitles();
        if (subtitles == null) {
            subtitles = jyumaefscl.wflxmlrfwp();
        }
        List listLqeggnwhkg = lqeggnwhkg(subtitles);
        Integer delay = bannerDto.getDelay();
        String text = bannerDto.getText();
        String promocode = bannerDto.getPromocode();
        Boolean hidePromocode = bannerDto.getHidePromocode();
        boolean zBooleanValue = hidePromocode != null ? hidePromocode.booleanValue() : true;
        f40.zoijcleaow zoijcleaowVarIobyxmoadg = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(bannerDto.getNavigationLink());
        String reference = bannerDto.getReference();
        String type = bannerDto.getType();
        String str4 = type == null ? "" : type;
        Boolean isAdult = bannerDto.getIsAdult();
        boolean zBooleanValue2 = isAdult != null ? isAdult.booleanValue() : false;
        q00.iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(bannerDto);
        String adv = bannerDto.getAdv();
        return new q00.zoijcleaow(str2, iIntValue, str3, str, ppxfxbqfkfVarIobyxmoadg, firstColor, secondColor, title, buttonText, video, listLqeggnwhkg, delay, text, promocode, zBooleanValue, zoijcleaowVarIobyxmoadg, reference, str4, iobyxmoadgVarDxjokdxxww, zBooleanValue2, adv != null ? adv : "", bannerDto.getOnboardingId());
    }

    private final q00.iobyxmoadg dxjokdxxww(BannerDto bannerDto) {
        Object next;
        List appUpdateData = bannerDto.getAppUpdateData();
        if (appUpdateData == null) {
            appUpdateData = jyumaefscl.wflxmlrfwp();
        }
        Iterator it = zoijcleaow(appUpdateData).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((q00.iobyxmoadg) next).iobyxmoadg() == i10.wkgbmnqykc.iobyxmoadg()) {
                return (q00.iobyxmoadg) next;
            }
        }
        next = null;
        return (q00.iobyxmoadg) next;
    }

    private final List eablkybsjg(List list, String str) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk((BannerDto) it.next(), str));
        }
        return arrayList;
    }

    private final q00.iobyxmoadg gtknphoqwx(AppUpdateDataDto appUpdateDataDto) {
        p00.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        i10.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = i10.ppxfxbqfkf.f41699zdlpuopuiu.iobyxmoadg(nufgyqmvbu(appUpdateDataDto));
        String version = appUpdateDataDto.getVersion();
        if (version == null || (iobyxmoadgVarIobyxmoadg = this.f82602iobyxmoadg.iobyxmoadg(version).build()) == null) {
            iobyxmoadgVarIobyxmoadg = p00.iobyxmoadg.f75338iobyxmoadg.iobyxmoadg();
        }
        String storeLink = appUpdateDataDto.getStoreLink();
        if (storeLink == null) {
            storeLink = "";
        }
        return new q00.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, iobyxmoadgVarIobyxmoadg, storeLink);
    }

    private final q00.ppxfxbqfkf iobyxmoadg(BannerDto bannerDto, String str) {
        if (zdlpuopuiu.eablkybsjg(str, "partners")) {
            return q00.ppxfxbqfkf.PARTNERS;
        }
        if (zdlpuopuiu.eablkybsjg(bannerDto.getType(), "app_update")) {
            return q00.ppxfxbqfkf.APP_UPDATE;
        }
        String video = bannerDto.getVideo();
        if (video != null && video.length() != 0) {
            return q00.ppxfxbqfkf.VIDEO;
        }
        String navigationLink = bannerDto.getNavigationLink();
        return (navigationLink == null || navigationLink.length() <= 0) ? q00.ppxfxbqfkf.SIMPLE : q00.ppxfxbqfkf.NAV_LINK;
    }

    private final List lqeggnwhkg(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wflxmlrfwp((SubtitleDto) it.next()));
        }
        return arrayList;
    }

    private final String nufgyqmvbu(AppUpdateDataDto appUpdateDataDto) {
        String platform = appUpdateDataDto.getPlatform();
        if (zdlpuopuiu.eablkybsjg(platform, ConstantDeviceInfo.APP_PLATFORM)) {
            return "google";
        }
        return zdlpuopuiu.eablkybsjg(platform, "huawei") ? "huawei" : "";
    }

    private final xg0.zoijcleaow ojitshcjhn(BannersDto bannersDto) {
        List listPpxfxbqfkf = ppxfxbqfkf(bannersDto.getBannerGroups());
        if (listPpxfxbqfkf == null) {
            listPpxfxbqfkf = jyumaefscl.wflxmlrfwp();
        }
        return new xg0.zoijcleaow(listPpxfxbqfkf);
    }

    private final List ppxfxbqfkf(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(agtfadlqog((BannerGroupDto) it.next()));
        }
        return arrayList;
    }

    private final q00.wkgbmnqykc wflxmlrfwp(SubtitleDto subtitleDto) {
        return new q00.wkgbmnqykc(subtitleDto.getTitle(), subtitleDto.getValue());
    }

    private final List zoijcleaow(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gtknphoqwx((AppUpdateDataDto) it.next()));
        }
        return arrayList;
    }

    public final List gxszxtbevo(PopupsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return btonecajqb(dto);
    }

    public final xg0.zoijcleaow wkgbmnqykc(BannersDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return ojitshcjhn(dto);
    }
}

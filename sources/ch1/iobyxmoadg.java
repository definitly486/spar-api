package ch1;

import fh1.AppUpdateDataDto;
import fh1.BannerDto;
import fh1.BannerGroupDto;
import fh1.BannersDto;
import fh1.PopupBannersDto;
import fh1.PopupsDto;
import fh1.SubtitleDto;
import hg.jyumaefscl;
import hh1.eablkybsjg;
import hh1.gxszxtbevo;
import hh1.lqeggnwhkg;
import hh1.nufgyqmvbu;
import hh1.ppxfxbqfkf;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import yz0.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hz0.iobyxmoadg.InterfaceC0966iobyxmoadg f19863iobyxmoadg;

    public iobyxmoadg(hz0.iobyxmoadg.InterfaceC0966iobyxmoadg semiVersionBuilder) {
        zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        this.f19863iobyxmoadg = semiVersionBuilder;
    }

    private final nufgyqmvbu agtfadlqog(BannersDto bannersDto) {
        List listPpxfxbqfkf = ppxfxbqfkf(bannersDto.getBannerGroups());
        if (listPpxfxbqfkf == null) {
            listPpxfxbqfkf = jyumaefscl.wflxmlrfwp();
        }
        return new nufgyqmvbu(listPpxfxbqfkf);
    }

    private final hh1.iobyxmoadg btonecajqb(BannerDto bannerDto, String str) {
        String id2 = bannerDto.getId();
        String str2 = id2 == null ? "" : id2;
        Integer sort = bannerDto.getSort();
        int iIntValue = sort != null ? sort.intValue() : 0;
        String image = bannerDto.getImage();
        String str3 = image == null ? "" : image;
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = iobyxmoadg(bannerDto, str);
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
        ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(bannerDto.getNavigationLink());
        String reference = bannerDto.getReference();
        String type = bannerDto.getType();
        String str4 = type == null ? "" : type;
        Boolean isAdult = bannerDto.getIsAdult();
        boolean zBooleanValue2 = isAdult != null ? isAdult.booleanValue() : false;
        hh1.zoijcleaow zoijcleaowVarDxjokdxxww = dxjokdxxww(bannerDto);
        String adv = bannerDto.getAdv();
        return new hh1.iobyxmoadg(str2, iIntValue, str3, str, lqeggnwhkgVarIobyxmoadg, firstColor, secondColor, title, buttonText, video, listLqeggnwhkg, delay, text, promocode, zBooleanValue, ojitshcjhnVarIobyxmoadg, reference, str4, zoijcleaowVarDxjokdxxww, null, zBooleanValue2, adv != null ? adv : "", bannerDto.getOnboardingId(), 524288, null);
    }

    private final ppxfxbqfkf draadjrbmk(BannerGroupDto bannerGroupDto) {
        return new ppxfxbqfkf(bannerGroupDto.getCode(), bannerGroupDto.getName(), eablkybsjg(bannerGroupDto.getBanners(), bannerGroupDto.getCode()));
    }

    private final hh1.zoijcleaow dxjokdxxww(BannerDto bannerDto) {
        Object next;
        List appUpdateData = bannerDto.getAppUpdateData();
        if (appUpdateData == null) {
            appUpdateData = jyumaefscl.wflxmlrfwp();
        }
        Iterator it = zoijcleaow(appUpdateData).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((hh1.zoijcleaow) next).iobyxmoadg() == wkgbmnqykc.iobyxmoadg()) {
                return (hh1.zoijcleaow) next;
            }
        }
        next = null;
        return (hh1.zoijcleaow) next;
    }

    private final List eablkybsjg(List list, String str) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(btonecajqb((BannerDto) it.next(), str));
        }
        return arrayList;
    }

    private final hh1.zoijcleaow gtknphoqwx(AppUpdateDataDto appUpdateDataDto) {
        hz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        yz0.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = yz0.ppxfxbqfkf.f126884zdlpuopuiu.iobyxmoadg(nufgyqmvbu(appUpdateDataDto));
        String version = appUpdateDataDto.getVersion();
        if (version == null || (iobyxmoadgVarIobyxmoadg = this.f19863iobyxmoadg.iobyxmoadg(version).build()) == null) {
            iobyxmoadgVarIobyxmoadg = hz0.iobyxmoadg.f41447iobyxmoadg.iobyxmoadg();
        }
        String storeLink = appUpdateDataDto.getStoreLink();
        if (storeLink == null) {
            storeLink = "";
        }
        return new hh1.zoijcleaow(ppxfxbqfkfVarIobyxmoadg, iobyxmoadgVarIobyxmoadg, storeLink);
    }

    private final lqeggnwhkg iobyxmoadg(BannerDto bannerDto, String str) {
        if (zdlpuopuiu.eablkybsjg(str, "partners")) {
            return lqeggnwhkg.PARTNERS;
        }
        if (zdlpuopuiu.eablkybsjg(bannerDto.getType(), "app_update")) {
            return lqeggnwhkg.APP_UPDATE;
        }
        String video = bannerDto.getVideo();
        if (video != null && video.length() != 0) {
            return lqeggnwhkg.VIDEO;
        }
        String navigationLink = bannerDto.getNavigationLink();
        return (navigationLink == null || navigationLink.length() <= 0) ? lqeggnwhkg.SIMPLE : lqeggnwhkg.NAV_LINK;
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

    private final List ojitshcjhn(PopupsDto popupsDto) {
        List<BannerDto> popupBanners;
        PopupBannersDto popups = popupsDto.getPopups();
        ArrayList arrayList = null;
        if (popups != null && (popupBanners = popups.getPopupBanners()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BannerDto bannerDto : popupBanners) {
                eablkybsjg.iobyxmoadg iobyxmoadgVar = eablkybsjg.f40364yggfygwlhe;
                String type = bannerDto.getType();
                if (type == null) {
                    type = "";
                }
                eablkybsjg eablkybsjgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(type);
                hh1.wkgbmnqykc wkgbmnqykcVar = eablkybsjgVarIobyxmoadg != null ? new hh1.wkgbmnqykc(btonecajqb(bannerDto, "popup"), eablkybsjgVarIobyxmoadg) : null;
                if (wkgbmnqykcVar != null) {
                    arrayList2.add(wkgbmnqykcVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
    }

    private final List ppxfxbqfkf(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk((BannerGroupDto) it.next()));
        }
        return arrayList;
    }

    private final gxszxtbevo wflxmlrfwp(SubtitleDto subtitleDto) {
        return new gxszxtbevo(subtitleDto.getTitle(), subtitleDto.getValue());
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
        return ojitshcjhn(dto);
    }

    public final nufgyqmvbu wkgbmnqykc(BannersDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return agtfadlqog(dto);
    }
}
